package com.mypurecloud.sdk.v2.connector.okhttp;

import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class OkHttpResponse implements ApiClientConnectorResponse {
    private final Response response;
    private String responseBody;
    private boolean hasReadBody = false;

    public OkHttpResponse(Response response) {
        this.response = response;
    }

    @Override
    public int getStatusCode() {
        return response.code();
    }

    @Override
    public String getStatusReasonPhrase() {
        return response.message();
    }

    @Override
    public Map<String, String> getHeaders() {
        Map<String, String> map = new HashMap<>();
        Headers headers = response.headers();
        if (headers != null) {
            for (String name : headers.names()) {
                map.put(name, headers.get(name));
            }
        }
        return map;
    }

    @Override
    public boolean hasBody() {
        try {
            String bodyString = this.readBody();
            return (bodyString != null && !bodyString.isEmpty());
        }
        catch (IOException e) {
            return false;
        }
    }

    @Override
    public String readBody() throws IOException {
        if (hasReadBody)
            return responseBody;

        hasReadBody = true;
        ResponseBody body = response.body();
        responseBody = (body != null) ? body.string() : null;
        return responseBody;
    }

    @Override
    public InputStream getBody() throws IOException {
        ResponseBody body = response.body();
        return (body != null) ? body.byteStream() : null;
    }

    @Override
    public void close() throws Exception { }
}
