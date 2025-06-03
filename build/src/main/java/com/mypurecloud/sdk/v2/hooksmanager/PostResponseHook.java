package com.mypurecloud.sdk.v2.hooksmanager;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.ApiException;

public interface PostResponseHook<T> {
    <T> ApiResponse<T> execute(ApiResponse<T> response) throws ApiException;
}