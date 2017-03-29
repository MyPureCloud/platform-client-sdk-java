package com.mypurecloud.sdk.v2.connector.ning;

import com.google.common.base.Charsets;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class AsyncHttpResponse implements ApiClientConnectorResponse {
    private final Response response;

    public AsyncHttpResponse(Response response) {
        this.response = response;
    }

    @Override
    public int getStatusCode() {
        return response.getStatusCode();
    }

    @Override
    public String getStatusReasonPhrase() {
        return response.getStatusText();
    }

    @Override
    public Map<String, String> getHeaders() {
        HttpHeaders headers = response.getHeaders();
        Map<String, String> map = new HashMap<>();
        for (String name : headers.names()) {
            map.put(name, headers.get(name));
        }
        return map;
    }

    @Override
    public boolean hasBody() {
        return response.hasResponseBody();
    }

    @Override
    public String readBody() throws IOException {
        return new String(response.getResponseBodyAsBytes(), Charsets.UTF_8);
    }

    @Override
    public InputStream getBody() throws IOException {
        return response.getResponseBodyAsStream();
    }

    @Override
    public void close() throws Exception { }
}
