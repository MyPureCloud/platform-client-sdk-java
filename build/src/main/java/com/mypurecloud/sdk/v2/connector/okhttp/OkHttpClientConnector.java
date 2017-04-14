package com.mypurecloud.sdk.v2.connector.okhttp;

import com.google.common.util.concurrent.SettableFuture;
import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import com.squareup.okhttp.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;

public class OkHttpClientConnector implements ApiClientConnector {
    private final OkHttpClient client;

    public OkHttpClientConnector(OkHttpClient client) {
        this.client = client;
    }

    @Override
    public ApiClientConnectorResponse invoke(ApiClientConnectorRequest request) throws IOException {
        Call call = client.newCall(buildRequest(request));
        return new OkHttpResponse(call.execute());
    }

    @Override
    public Future<ApiClientConnectorResponse> invokeAsync(ApiClientConnectorRequest request, final AsyncApiCallback<ApiClientConnectorResponse> callback) {
        final SettableFuture<ApiClientConnectorResponse> future = SettableFuture.create();
        try {
            Call call = client.newCall(buildRequest(request));
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Request request, IOException e) {
                    callback.onFailed(e);
                    future.setException(e);
                }

                @Override
                public void onResponse(Response response) throws IOException {
                    OkHttpResponse okHttpResponse = new OkHttpResponse(response);
                    callback.onCompleted(okHttpResponse);
                    future.set(new OkHttpResponse(response));
                }
            });
        }
        catch (Throwable exception) {
            callback.onFailed(exception);
            future.setException(exception);
        }
        return future;
    }

    private Request buildRequest(ApiClientConnectorRequest request) throws IOException {
        Request.Builder builder = new Request.Builder()
                .url(request.getUrl());

        Map<String, String> headers = request.getHeaders();
        if (headers != null && !headers.isEmpty()) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                builder = builder.addHeader(header.getKey(), header.getValue());
            }
        }

        String method = request.getMethod();
        if ("GET".equals(method)) {
            builder = builder.get();
        }
        else if ("HEAD".equals(method)) {
            builder = builder.head();
        }
        else if ("POST".equals(method)) {
            builder = builder.post(createBody(request));
        }
        else if ("PUT".equals(method)) {
            builder = builder.put(createBody(request));
        }
        else if ("DELETE".equals(method)) {
            builder = builder.delete();
        }
        else if ("PATCH".equals(method)) {
            builder = builder.patch(createBody(request));
        }
        else {
            throw new IllegalStateException("Unknown method type " + method);
        }

        return builder.build();
    }

    private RequestBody createBody(ApiClientConnectorRequest request) throws IOException {
        String contentType = "application/json";
        Map<String, String> headers = request.getHeaders();
        if (headers != null && !headers.isEmpty()) {
            for (String name : headers.keySet()) {
                if (name.equalsIgnoreCase("content-type")) {
                    contentType = headers.get(name);
                    break;
                }
            }
        }
        if (request.hasBody()) {
            return RequestBody.create(MediaType.parse(contentType), request.readBody());
        }
        return RequestBody.create(null, new byte[0]);
    }

    @Override
    public void close() throws Exception { }
}
