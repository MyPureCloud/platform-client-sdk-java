package com.mypurecloud.sdk.v2.connector.ning;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import org.asynchttpclient.*;
import org.asynchttpclient.uri.Uri;

import java.util.Map;
import java.util.concurrent.Future;

public class AsyncHttpClientConnector implements ApiClientConnector {
    private final AsyncHttpClient client;

    public AsyncHttpClientConnector(AsyncHttpClient client) {
        this.client = client;
    }

    @Override
    public ApiClientConnectorResponse invoke(ApiClientConnectorRequest request) throws Exception {
        return null;
    }

    @Override
    public Future<ApiClientConnectorResponse> invokeAsync(ApiClientConnectorRequest request, AsyncApiCallback<ApiClientConnectorResponse> callback) {

        try {
            RequestBuilder builder = new RequestBuilder()
                    .setUri(Uri.create(request.getUrl()))
                    .setMethod(request.getMethod());

            for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
                builder = builder.addHeader(header.getKey(), header.getValue());
            }

            if (request.hasBody()) {
                builder = builder.setBody(request.readBody());
            }

            return client.executeRequest(builder, new AsyncCompletionHandler<ApiClientConnectorResponse>() {
                @Override
                public ApiClientConnectorResponse onCompleted(Response response) throws Exception {
                    return new AsyncHttpResponse(response);
                }
            });
        }
        catch (Throwable exception) {
            callback.onFailed(exception);
            return Futures.immediateFailedFuture(exception);
        }
    }

    @Override
    public void close() throws Exception {

    }
}
