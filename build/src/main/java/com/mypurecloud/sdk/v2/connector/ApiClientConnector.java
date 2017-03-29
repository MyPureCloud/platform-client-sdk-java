package com.mypurecloud.sdk.v2.connector;

import com.mypurecloud.sdk.v2.AsyncApiCallback;

import java.util.concurrent.Future;

public interface ApiClientConnector extends AutoCloseable {
    ApiClientConnectorResponse invoke(ApiClientConnectorRequest request) throws Exception;
    Future<ApiClientConnectorResponse> invokeAsync(ApiClientConnectorRequest request, AsyncApiCallback<ApiClientConnectorResponse> callback);
}
