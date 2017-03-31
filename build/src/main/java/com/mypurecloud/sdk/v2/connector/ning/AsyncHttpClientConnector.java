package com.mypurecloud.sdk.v2.connector.ning;

import com.google.common.util.concurrent.Futures;
import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorRequest;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import org.asynchttpclient.*;
import org.asynchttpclient.uri.Uri;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncHttpClientConnector implements ApiClientConnector {
    private final AsyncHttpClient client;

    public AsyncHttpClientConnector(AsyncHttpClient client) {
        this.client = client;
    }

    @Override
    public ApiClientConnectorResponse invoke(ApiClientConnectorRequest request) throws IOException {
        try {
            Future<ApiClientConnectorResponse> future = invokeAsync(request, new AsyncApiCallback<ApiClientConnectorResponse>() {
                @Override
                public void onCompleted(ApiClientConnectorResponse response) { }

                @Override
                public void onFailed(Throwable exception) { }
            });
            return future.get();
        }
        catch (InterruptedException exception) {
            throw new InterruptedIOException(exception.getMessage());
        }
        catch (ExecutionException exception) {
            Throwable cause = exception.getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            throw new IOException(cause);
        }
    }

    @Override
    public Future<ApiClientConnectorResponse> invokeAsync(ApiClientConnectorRequest request, AsyncApiCallback<ApiClientConnectorResponse> callback) {
        try {
            String method = request.getMethod();

            RequestBuilder builder = new RequestBuilder()
                    .setUri(Uri.create(request.getUrl()))
                    .setMethod(method);

            switch (method) {
                case "GET":
                case "HEAD":
                case "DELETE":
                    break;
                case "POST":
                case "PUT":
                case "PATCH":
                    if (request.hasBody()) {
                        builder = builder.setBody(request.readBody());
                    }
                    break;
                default:
                    return Futures.immediateFailedFuture(new IllegalStateException("Unknown method type " + method));
            }

            for (Map.Entry<String, String> header : request.getHeaders().entrySet()) {
                builder = builder.addHeader(header.getKey(), header.getValue());
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
