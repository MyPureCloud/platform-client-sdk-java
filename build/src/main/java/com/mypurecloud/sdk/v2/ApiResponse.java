package com.mypurecloud.sdk.v2;

import java.util.Map;

public interface ApiResponse<T> extends AutoCloseable {
    Exception getException();
    int getStatusCode();
    String getStatusReasonPhrase();
    boolean hasRawBody();
    String getRawBody();
    T getBody();
    Map<String, String> getHeaders();
    String getHeader(String key);
    String getCorrelationId();
}
