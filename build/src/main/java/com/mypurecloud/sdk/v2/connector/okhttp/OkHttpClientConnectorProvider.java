package com.mypurecloud.sdk.v2.connector.okhttp;

import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProperties;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProperty;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProvider;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

import java.net.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class OkHttpClientConnectorProvider implements ApiClientConnectorProvider {
    @Override
    public ApiClientConnector create(ApiClientConnectorProperties properties) {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();

        Integer connectionTimeout = properties.getProperty(ApiClientConnectorProperty.CONNECTION_TIMEOUT, Integer.class, null);
        if (connectionTimeout != null && connectionTimeout > 0) {
            builder.connectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
            builder.readTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
            builder.writeTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
        }

        Proxy proxy =properties.getProperty(ApiClientConnectorProperty.PROXY, Proxy.class, null);
        if (proxy != null) {
            builder.proxy(proxy);
        }

        ExecutorService executorService = properties.getProperty(ApiClientConnectorProperty.ASYNC_EXECUTOR_SERVICE, ExecutorService.class, null);
        if (executorService != null) {
            builder.dispatcher(new Dispatcher(executorService));
        }

        return new OkHttpClientConnector(builder.build());
    }
}
