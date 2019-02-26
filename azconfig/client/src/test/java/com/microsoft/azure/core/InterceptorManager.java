// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.microsoft.azure.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.azure.azconfig.AzConfigTest;
import com.microsoft.azure.utils.SdkContext;
import com.microsoft.rest.v3.http.HttpClient;
import com.microsoft.rest.v3.http.HttpHeader;
import com.microsoft.rest.v3.http.HttpHeaders;
import com.microsoft.rest.v3.http.HttpPipelineCallContext;
import com.microsoft.rest.v3.http.HttpRequest;
import com.microsoft.rest.v3.http.HttpResponse;
import com.microsoft.rest.v3.http.NextPolicy;
import com.microsoft.rest.v3.http.policy.HttpPipelinePolicy;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;

public class InterceptorManager {

    private final static String RECORD_FOLDER = "session-records/";

    private Map<String, String> textReplacementRules = new HashMap<>();
    // Stores a map of all the HTTP properties in a session
    // A state machine ensuring a test is always reset before another one is setup

    protected RecordedData recordedData;

    private final String testName;

    private final AzConfigTest.TestMode testMode;

    private InterceptorManager(String testName, AzConfigTest.TestMode testMode) {
        this.testName = testName;
        this.testMode = testMode;
    }

    public void addTextReplacementRule(String regex, String replacement) {
        textReplacementRules.put(regex, replacement);
    }

    // factory method
    public static InterceptorManager create(String testName, AzConfigTest.TestMode testMode) {
        InterceptorManager interceptorManager = new InterceptorManager(testName, testMode);
        SdkContext.setResourceNamerFactory(new TestResourceNamerFactory(interceptorManager));
        SdkContext.setDelayProvider(new TestDelayProvider(interceptorManager.isRecordMode()));
//        SdkContext.setRxScheduler(Schedulers.trampoline());

        return interceptorManager;
    }

    public boolean isRecordMode() {
        return testMode == AzConfigTest.TestMode.RECORD;
    }

    public boolean isPlaybackMode() {
        return testMode == AzConfigTest.TestMode.PLAYBACK;
    }

    public RecordPolicy initRecordPolicy() {
        recordedData = new RecordedData();
        return new RecordPolicy();
    }

    public HttpClient initPlaybackClient() throws IOException {
        readDataFromFile();
        return new PlaybackClient();
    }

    public void finalizeInterceptor() throws IOException {
        switch (testMode) {
            case RECORD:
                writeDataToFile();
                break;
            case PLAYBACK:
                // Do nothing
                break;
            default:
                System.out.println("==> Unknown AZURE_TEST_MODE: " + testMode);
        };
    }

    public class RecordPolicy implements HttpPipelinePolicy {
        public Mono<HttpResponse> process(HttpPipelineCallContext context, NextPolicy next) {
            final NetworkCallRecord networkCallRecord = new NetworkCallRecord();

            networkCallRecord.Headers = new HashMap<>();

            if (context.httpRequest().headers().value("Content-Type") != null) {
                networkCallRecord.Headers.put("Content-Type", context.httpRequest().headers().value("Content-Type"));
            }
            if (context.httpRequest().headers().value("x-ms-version") != null) {
                networkCallRecord.Headers.put("x-ms-version", context.httpRequest().headers().value("x-ms-version"));
            }
            if (context.httpRequest().headers().value("User-Agent") != null) {
                networkCallRecord.Headers.put("User-Agent", context.httpRequest().headers().value("User-Agent"));
            }

            networkCallRecord.Method = context.httpRequest().httpMethod().toString();
            networkCallRecord.Uri = applyReplacementRule(context.httpRequest().url().toString().replaceAll("\\?$", ""));

            return next.process().flatMap(httpResponse -> {
                final HttpResponse bufferedResponse = httpResponse.buffer();

                return extractResponseData(bufferedResponse).map(responseData -> {
                    networkCallRecord.Response = responseData;
                    // remove pre-added header if this is a waiting or redirection
                    if (networkCallRecord.Response.get("Body").contains("<Status>InProgress</Status>")
                            || Integer.parseInt(networkCallRecord.Response.get("StatusCode")) == HttpResponseStatus.TEMPORARY_REDIRECT.code()) {
                        // Do nothing
                    } else {
                        synchronized (recordedData.getNetworkCallRecords()) {
                            recordedData.getNetworkCallRecords().add(networkCallRecord);
                        }
                    }

                    return bufferedResponse;
                });
            });
        }
    }

    final class PlaybackClient extends HttpClient {
        AtomicInteger count = new AtomicInteger(0);
        @Override
        public Mono<HttpResponse> send(final HttpRequest request) {
            return Mono.defer(() -> playbackHttpResponse(request));
        }

        private Mono<HttpResponse> playbackHttpResponse(final HttpRequest request) {
            String incomingUrl = applyReplacementRule(request.url().toString());
            String incomingMethod = request.httpMethod().toString();

            incomingUrl = removeHost(incomingUrl);
            NetworkCallRecord networkCallRecord = null;
            synchronized (recordedData) {
                for (Iterator<NetworkCallRecord> iterator = recordedData.getNetworkCallRecords().iterator(); iterator.hasNext(); ) {
                    NetworkCallRecord record = iterator.next();
                    if (record.Method.equalsIgnoreCase(incomingMethod) && removeHost(record.Uri).equalsIgnoreCase(incomingUrl)) {
                        networkCallRecord = record;
                        iterator.remove();
                        break;
                    }
                }
            }

            count.incrementAndGet();
            if (networkCallRecord == null) {
//                LoggerFactory.getLogger(request.callerMethod()).info("NOT FOUND - " + incomingMethod + " " + incomingUrl);
//                LoggerFactory.getLogger(request.callerMethod()).info("Records requested: " + count);
//                LoggerFactory.getLogger(request.callerMethod()).info("Remaining records " + recordedData.getNetworkCallRecords().size());

                Assert.fail("==> Unexpected request: " + incomingMethod + " " + incomingUrl);
            }

            int recordStatusCode = Integer.parseInt(networkCallRecord.Response.get("StatusCode"));
            HttpHeaders headers = new HttpHeaders();

            for (Map.Entry<String, String> pair : networkCallRecord.Response.entrySet()) {
                if (!pair.getKey().equals("StatusCode") && !pair.getKey().equals("Body") && !pair.getKey().equals("Content-Length")) {
                    String rawHeader = pair.getValue();
                    for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
                        if (rule.getValue() != null) {
                            rawHeader = rawHeader.replaceAll(rule.getKey(), rule.getValue());
                        }
                    }
                    headers.set(pair.getKey(), rawHeader);
                }
            }

            String rawBody = networkCallRecord.Response.get("Body");
            if (rawBody != null) {
                for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
                    if (rule.getValue() != null) {
                        rawBody = rawBody.replaceAll(rule.getKey(), rule.getValue());
                    }
                }

                try {
                    byte[] bytes = rawBody.getBytes("UTF-8");
                    headers.set("Content-Length", String.valueOf(bytes.length));
                } catch (IOException e) {
                    return Mono.error(e);
                }
            }

            HttpResponse response = new MockHttpResponse(recordStatusCode, headers, rawBody);
            return Mono.just(response);
        }
    }

    private Mono<Map<String, String>> extractResponseData(final HttpResponse response) {
        final Map<String, String> responseData = new HashMap<>();
        responseData.put("StatusCode", Integer.toString(response.statusCode()));

        boolean addedRetryAfter = false;
        for (HttpHeader header : response.headers()) {
            String headerValueToStore = header.value();

            if (header.name().equalsIgnoreCase("location") || header.name().equalsIgnoreCase("azure-asyncoperation")) {
                headerValueToStore = applyReplacementRule(headerValueToStore);
            }
            if (header.name().equalsIgnoreCase("retry-after")) {
                headerValueToStore = "0";
                addedRetryAfter = true;
            }
            responseData.put(header.name().toLowerCase(), headerValueToStore);
        }

        if (!addedRetryAfter) {
            responseData.put("retry-after", "0");
        }

        Mono<Map<String, String>> result;
        if (response.headerValue("content-encoding") == null) {
            result = response.bodyAsString().map(content -> {
                content = applyReplacementRule(content);
                responseData.put("Body", content);
                return responseData;
            });
        } else {
            result = response.bodyAsByteArray().map(bytes -> {
                try {
                    GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(bytes));
                    String content = IOUtils.toString(gis, StandardCharsets.UTF_8);
                    responseData.remove("content-encoding");
                    responseData.put("content-length", Integer.toString(content.length()));

                    content = applyReplacementRule(content);
                    responseData.put("body", content);
                    return responseData;
                } catch (IOException e) {
                    throw Exceptions.propagate(e);
                }
            });
        }

        return result;
    }

    private void readDataFromFile() throws IOException {
        File recordFile = getRecordFile(testName);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        recordedData = mapper.readValue(recordFile, RecordedData.class);
        System.out.println("Total records " + recordedData.getNetworkCallRecords().size());
    }

    private void writeDataToFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        File recordFile = getRecordFile(testName);
        recordFile.createNewFile();
        mapper.writeValue(recordFile, recordedData);
    }

    private File getRecordFile(String testName) {
        URL folderUrl = InterceptorManager.class.getClassLoader().getResource(".");
        File folderFile = new File(folderUrl.getPath() + RECORD_FOLDER);
        if (!folderFile.exists()) {
            folderFile.mkdir();
        }
        String filePath = folderFile.getPath() + "/" + testName + ".json";
        System.out.println("==> Playback file path: " + filePath);
        return new File(filePath);
    }

    private String applyReplacementRule(String text) {
        for (Map.Entry<String, String> rule : textReplacementRules.entrySet()) {
            if (rule.getValue() != null) {
                text = text.replaceAll(rule.getKey(), rule.getValue());
            }
        }
        return text;
    }

    private String removeHost(String url) {
        URI uri = URI.create(url);
        return String.format("%s?%s", uri.getPath(), uri.getQuery());
    }

    public void pushVariable(String variable) {
        if (isRecordMode()) {
            synchronized (recordedData.getVariables()) {
                recordedData.getVariables().add(variable);
            }
        }
    }

    public String popVariable() {
        synchronized (recordedData.getVariables()) {
            return recordedData.getVariables().remove();
        }
    }
}
