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
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.PublicIPAddress;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in PublicIPAddressesOperations.
 */
public interface PublicIPAddressesOperations {
    /**
     * The interface defining all the services for PublicIPAddressesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PublicIPAddressesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPAddresses/{publicIpAddressName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("publicIpAddressName") String publicIpAddressName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPAddresses/{publicIpAddressName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("publicIpAddressName") String publicIpAddressName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPAddresses/{publicIpAddressName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("publicIpAddressName") String publicIpAddressName, @Path("subscriptionId") String subscriptionId, @Body PublicIPAddress parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/publicIPAddresses")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/publicIPAddresses")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String publicIpAddressName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete publicIpAddress operation deletes the specified publicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String publicIpAddressName, final ServiceCallback<Void> serviceCallback);

    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PublicIPAddress object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PublicIPAddress> get(String resourceGroupName, String publicIpAddressName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get publicIpAddress operation retreives information about the specified pubicIpAddress.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the subnet.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String publicIpAddressName, String expand, final ServiceCallback<PublicIPAddress> serviceCallback);

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the PublicIPAddress object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PublicIPAddress> createOrUpdate(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put PublicIPAddress operation creates/updates a stable/dynamic PublicIP address.
     *
     * @param resourceGroupName The name of the resource group.
     * @param publicIpAddressName The name of the publicIpAddress.
     * @param parameters Parameters supplied to the create/update PublicIPAddress operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String publicIpAddressName, PublicIPAddress parameters, final ServiceCallback<PublicIPAddress> serviceCallback);

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<PublicIPAddress>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ListOperationCallback<PublicIPAddress> serviceCallback);

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<PublicIPAddress>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final String resourceGroupName, final ListOperationCallback<PublicIPAddress> serviceCallback);

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PublicIPAddress>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(final String nextPageLink, final ListOperationCallback<PublicIPAddress> serviceCallback);

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PublicIPAddress&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<PublicIPAddress>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List publicIpAddress opertion retrieves all the publicIpAddresses in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<PublicIPAddress> serviceCallback);

}
