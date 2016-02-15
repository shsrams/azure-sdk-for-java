/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ApplicationGateway;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplicationGatewaysOperations.
 */
public interface ApplicationGatewaysOperations {
    /**
     * The interface defining all the services for ApplicationGatewaysOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApplicationGatewaysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Body ApplicationGateway parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/applicationGateways")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}/start")
        Call<ResponseBody> start(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}/stop")
        Call<ResponseBody> stop(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ApplicationGateway> get(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<ApplicationGateway> serviceCallback);

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ApplicationGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ApplicationGateway> createOrUpdate(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters, final ServiceCallback<ApplicationGateway> serviceCallback);

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ApplicationGateway>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final String resourceGroupName, final ListOperationCallback<ApplicationGateway> serviceCallback);

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ApplicationGateway>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ListOperationCallback<ApplicationGateway> serviceCallback);

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> startAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback);

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> stop(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> stopAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback);

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ApplicationGateway>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<ApplicationGateway> serviceCallback);

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ApplicationGateway>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(final String nextPageLink, final ListOperationCallback<ApplicationGateway> serviceCallback);

}
