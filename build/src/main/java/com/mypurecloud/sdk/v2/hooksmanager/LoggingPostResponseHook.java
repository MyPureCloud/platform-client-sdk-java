package com.mypurecloud.sdk.v2.hooksmanager;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.ApiException;

public class LoggingPostResponseHook<T> implements PostResponseHook<T> {
    @Override
    public <T> ApiResponse<T> execute(ApiResponse<T> response) throws ApiException {
        System.out.println("Post-response hook - Status: " + response.getStatusCode());
        System.out.println("Post-response hook - CorrelationId: " + response.getCorrelationId());
        return response;
    }
}