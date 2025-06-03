package com.mypurecloud.sdk.v2.hooksmanager;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.ApiException;

public class LoggingPreRequestHook implements PreRequestHook {
    @Override
    public ApiClientConnectorRequest execute(ApiClientConnectorRequest request) throws ApiException {
        System.out.println("Pre-request hook - Method: " + request.getMethod());
        System.out.println("Pre-request hook - URL: " + request.getUrl());
        return request;
    }
}