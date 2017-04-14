package com.mypurecloud.sdk.v2.connector.apache;

import com.google.common.util.concurrent.SettableFuture;
import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ApacheHttpClientConnector implements ApiClientConnector {
    private final CloseableHttpClient client;
    private final ExecutorService executorService;

    public ApacheHttpClientConnector(CloseableHttpClient client, ExecutorService executorService) {
        this.client = client;
        this.executorService = executorService;
    }

    @Override
    public ApiClientConnectorResponse invoke(ApiClientConnectorRequest request) throws IOException {
        // Build request object
        HttpUriRequest httpUriRequest;
        String method = request.getMethod();
        String url = request.getUrl();
        String body = request.readBody();

        if ("GET".equals(method)) {
            HttpGet req = new HttpGet(url);
            httpUriRequest = req;
        } else if ("HEAD".equals(method)) {
            HttpHead req = new HttpHead(url);
            httpUriRequest = req;
        } else if ("POST".equals(method)) {
            HttpPost req = new HttpPost(url);
            if (body != null) {
                req.setEntity(new StringEntity(body, "UTF-8"));
            }
            httpUriRequest = req;
        } else if ("PUT".equals(method)) {
            HttpPut req = new HttpPut(url);
            if (body != null) {
                req.setEntity(new StringEntity(body, "UTF-8"));
            }
            httpUriRequest = req;
        } else if ("DELETE".equals(method)) {
            HttpDelete req = new HttpDelete(url);
            httpUriRequest = req;
        } else if ("PATCH".equals(method)) {
            HttpPatch req = new HttpPatch(url);
            if (body != null) {
                req.setEntity(new StringEntity(body, "UTF-8"));
            }
            httpUriRequest = req;
        } else {
            throw new IllegalStateException("Unknown method type " + method);
        }

        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            httpUriRequest.setHeader(entry.getKey(), entry.getValue());
        }

        CloseableHttpResponse response = client.execute(httpUriRequest);

        return new ApacheHttpResponse(response);
    }

    @Override
    public Future<ApiClientConnectorResponse> invokeAsync(final ApiClientConnectorRequest request, final AsyncApiCallback<ApiClientConnectorResponse> callback) {
        final SettableFuture<ApiClientConnectorResponse> future = SettableFuture.create();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    ApiClientConnectorResponse response = invoke(request);
                    callback.onCompleted(response);
                    future.set(response);
                }
                catch (Throwable exception) {
                    callback.onFailed(exception);
                    future.setException(exception);
                }
            }
        };
        try {
            if (executorService != null) {
                executorService.submit(task);
            }
            else {
                task.run();
            }
        }
        catch (Throwable exception) {
            callback.onFailed(exception);
            future.setException(exception);
        }
        return future;
    }

    @Override
    public void close() throws IOException {
        client.close();
    }
}
