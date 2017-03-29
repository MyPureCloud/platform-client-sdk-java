package com.mypurecloud.sdk.v2;

import java.util.List;
import java.util.Map;

public interface ApiRequest<T> {
    String getPath();
    String getMethod();
    Map<String, String> getPathParams();
    List<Pair> getQueryParams();
    Map<String, Object> getFormParams();
    Map<String, String> getHeaderParams();
    Map<String, String> getCustomHeaders();
    String getContentType();
    String getAccepts();
    T getBody();
    String[] getAuthNames();
}