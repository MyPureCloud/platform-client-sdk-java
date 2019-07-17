package com.mypurecloud.sdk.v2;

import java.util.Collections;
import java.util.Map;


public class ApiException extends Exception implements ApiResponse<Object> {
    private final int statusCode;
    private final Map<String, String> headers;
    private final String body;

    public ApiException(int statusCode, String message, Map<String, String> headers, String body) {
        super(message);
        this.statusCode = statusCode;
        this.headers = Collections.unmodifiableMap(headers);
        this.body = body;
    }

    public ApiException(Throwable cause) {
        super(cause);
        this.statusCode = -1;
        this.headers = Collections.emptyMap();
        this.body = null;
    }

    @Override
    public Exception getException() {
        return this;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getStatusReasonPhrase() {
        return getMessage();
    }

    @Override
    public boolean hasRawBody() {
        return (body != null && !body.isEmpty());
    }

    @Override
    public String getRawBody() {
        return body;
    }

    @Override
    public Object getBody() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public String getHeader(String key) {
        return headers.get(key);
    }

    @Override
    public String getCorrelationId() {
        return getHeader("ININ-Correlation-Id");
    }

    @Override
    public void close() throws Exception { }
}
