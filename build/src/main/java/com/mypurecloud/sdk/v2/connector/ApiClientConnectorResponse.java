package com.mypurecloud.sdk.v2.connector;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface ApiClientConnectorResponse extends AutoCloseable {
    int getStatusCode();
    String getStatusReasonPhrase();
    Map<String, String> getHeaders();
    boolean hasBody();
    String readBody() throws IOException;
    InputStream getBody() throws IOException;
}
