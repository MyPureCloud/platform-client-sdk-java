package com.mypurecloud.sdk.v2.connector;

public interface ApiClientConnectorProvider {
    ApiClientConnector create(ApiClientConnectorProperties properties);
}
