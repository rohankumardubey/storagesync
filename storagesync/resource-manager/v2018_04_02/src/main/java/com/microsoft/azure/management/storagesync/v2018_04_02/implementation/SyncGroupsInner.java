/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2018_04_02.implementation;

import com.microsoft.rest.ServiceResponse;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.storagesync.v2018_04_02.StorageSyncErrorException;
import com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroupsCreateHeaders;
import com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroupsDeleteHeaders;
import com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroupsGetHeaders;
import com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroupsListByStorageSyncServiceHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SyncGroups.
 */
public class SyncGroupsInner {
    /** The Retrofit service to perform REST calls. */
    private SyncGroupsService service;
    /** The service client containing this operation class. */
    private StorageSyncManagementClientImpl client;

    /**
     * Initializes an instance of SyncGroupsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SyncGroupsInner(Retrofit retrofit, StorageSyncManagementClientImpl client) {
        this.service = retrofit.create(SyncGroupsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SyncGroups to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SyncGroupsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroups listByStorageSyncService" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageSync/storageSyncServices/{storageSyncServiceName}/syncGroups")
        Observable<Response<ResponseBody>> listByStorageSyncService(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("storageSyncServiceName") String storageSyncServiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroups create" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageSync/storageSyncServices/{storageSyncServiceName}/syncGroups/{syncGroupName}")
        Observable<Response<ResponseBody>> create(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("storageSyncServiceName") String storageSyncServiceName, @Path("syncGroupName") String syncGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body SyncGroupInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroups get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageSync/storageSyncServices/{storageSyncServiceName}/syncGroups/{syncGroupName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("storageSyncServiceName") String storageSyncServiceName, @Path("syncGroupName") String syncGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storagesync.v2018_04_02.SyncGroups delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StorageSync/storageSyncServices/{storageSyncServiceName}/syncGroups/{syncGroupName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("storageSyncServiceName") String storageSyncServiceName, @Path("syncGroupName") String syncGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a SyncGroup List.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws StorageSyncErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SyncGroupInner&gt; object if successful.
     */
    public List<SyncGroupInner> listByStorageSyncService(String resourceGroupName, String storageSyncServiceName) {
        return listByStorageSyncServiceWithServiceResponseAsync(resourceGroupName, storageSyncServiceName).toBlocking().single().body();
    }

    /**
     * Get a SyncGroup List.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SyncGroupInner>> listByStorageSyncServiceAsync(String resourceGroupName, String storageSyncServiceName, final ServiceCallback<List<SyncGroupInner>> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(listByStorageSyncServiceWithServiceResponseAsync(resourceGroupName, storageSyncServiceName), serviceCallback);
    }

    /**
     * Get a SyncGroup List.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SyncGroupInner&gt; object
     */
    public Observable<List<SyncGroupInner>> listByStorageSyncServiceAsync(String resourceGroupName, String storageSyncServiceName) {
        return listByStorageSyncServiceWithServiceResponseAsync(resourceGroupName, storageSyncServiceName).map(new Func1<ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders>, List<SyncGroupInner>>() {
            @Override
            public List<SyncGroupInner> call(ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a SyncGroup List.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SyncGroupInner&gt; object
     */
    public Observable<ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders>> listByStorageSyncServiceWithServiceResponseAsync(String resourceGroupName, String storageSyncServiceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (storageSyncServiceName == null) {
            throw new IllegalArgumentException("Parameter storageSyncServiceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByStorageSyncService(this.client.subscriptionId(), resourceGroupName, storageSyncServiceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<PageImpl1<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders> result = listByStorageSyncServiceDelegate(response);
                        List<SyncGroupInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponseWithHeaders<List<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders> clientResponse = new ServiceResponseWithHeaders<>(items, result.headers(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<PageImpl1<SyncGroupInner>, SyncGroupsListByStorageSyncServiceHeaders> listByStorageSyncServiceDelegate(Response<ResponseBody> response) throws StorageSyncErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<SyncGroupInner>, StorageSyncErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<SyncGroupInner>>() { }.getType())
                .registerError(StorageSyncErrorException.class)
                .buildWithHeaders(response, SyncGroupsListByStorageSyncServiceHeaders.class);
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws StorageSyncErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SyncGroupInner object if successful.
     */
    public SyncGroupInner create(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        return createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).toBlocking().single().body();
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SyncGroupInner> createAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, final ServiceCallback<SyncGroupInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName), serviceCallback);
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<SyncGroupInner> createAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        return createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).map(new Func1<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>, SyncGroupInner>() {
            @Override
            public SyncGroupInner call(ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>> createWithServiceResponseAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (storageSyncServiceName == null) {
            throw new IllegalArgumentException("Parameter storageSyncServiceName is required and cannot be null.");
        }
        if (syncGroupName == null) {
            throw new IllegalArgumentException("Parameter syncGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String uniqueId = null;
        SyncGroupInner parameters = new SyncGroupInner();
        parameters.withUniqueId(null);
        return service.create(this.client.subscriptionId(), resourceGroupName, storageSyncServiceName, syncGroupName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param uniqueId Unique Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws StorageSyncErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SyncGroupInner object if successful.
     */
    public SyncGroupInner create(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String uniqueId) {
        return createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName, uniqueId).toBlocking().single().body();
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param uniqueId Unique Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SyncGroupInner> createAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String uniqueId, final ServiceCallback<SyncGroupInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName, uniqueId), serviceCallback);
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param uniqueId Unique Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<SyncGroupInner> createAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String uniqueId) {
        return createWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName, uniqueId).map(new Func1<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>, SyncGroupInner>() {
            @Override
            public SyncGroupInner call(ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param uniqueId Unique Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>> createWithServiceResponseAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, String uniqueId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (storageSyncServiceName == null) {
            throw new IllegalArgumentException("Parameter storageSyncServiceName is required and cannot be null.");
        }
        if (syncGroupName == null) {
            throw new IllegalArgumentException("Parameter syncGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        SyncGroupInner parameters = new SyncGroupInner();
        parameters.withUniqueId(uniqueId);
        return service.create(this.client.subscriptionId(), resourceGroupName, storageSyncServiceName, syncGroupName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsCreateHeaders> createDelegate(Response<ResponseBody> response) throws StorageSyncErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SyncGroupInner, StorageSyncErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SyncGroupInner>() { }.getType())
                .registerError(StorageSyncErrorException.class)
                .buildWithHeaders(response, SyncGroupsCreateHeaders.class);
    }

    /**
     * Get a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws StorageSyncErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SyncGroupInner object if successful.
     */
    public SyncGroupInner get(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        return getWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).toBlocking().single().body();
    }

    /**
     * Get a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SyncGroupInner> getAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, final ServiceCallback<SyncGroupInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName), serviceCallback);
    }

    /**
     * Get a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<SyncGroupInner> getAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        return getWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).map(new Func1<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders>, SyncGroupInner>() {
            @Override
            public SyncGroupInner call(ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SyncGroupInner object
     */
    public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders>> getWithServiceResponseAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (storageSyncServiceName == null) {
            throw new IllegalArgumentException("Parameter storageSyncServiceName is required and cannot be null.");
        }
        if (syncGroupName == null) {
            throw new IllegalArgumentException("Parameter syncGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, storageSyncServiceName, syncGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<SyncGroupInner, SyncGroupsGetHeaders> getDelegate(Response<ResponseBody> response) throws StorageSyncErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SyncGroupInner, StorageSyncErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SyncGroupInner>() { }.getType())
                .registerError(StorageSyncErrorException.class)
                .buildWithHeaders(response, SyncGroupsGetHeaders.class);
    }

    /**
     * Delete a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws StorageSyncErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        deleteWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).toBlocking().single().body();
    }

    /**
     * Delete a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(deleteWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName), serviceCallback);
    }

    /**
     * Delete a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        return deleteWithServiceResponseAsync(resourceGroupName, storageSyncServiceName, syncGroupName).map(new Func1<ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a given SyncGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders>> deleteWithServiceResponseAsync(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (storageSyncServiceName == null) {
            throw new IllegalArgumentException("Parameter storageSyncServiceName is required and cannot be null.");
        }
        if (syncGroupName == null) {
            throw new IllegalArgumentException("Parameter syncGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, storageSyncServiceName, syncGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<Void, SyncGroupsDeleteHeaders> deleteDelegate(Response<ResponseBody> response) throws StorageSyncErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, StorageSyncErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(StorageSyncErrorException.class)
                .buildWithHeaders(response, SyncGroupsDeleteHeaders.class);
    }

}
