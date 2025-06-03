package com.mypurecloud.sdk.v2.hooksmanager;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.ApiException;

public interface PreRequestHook {
    ApiClientConnectorRequest execute(ApiClientConnectorRequest request) throws ApiException;
}