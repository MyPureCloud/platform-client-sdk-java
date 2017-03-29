package com.mypurecloud.sdk.v2.connector;

import com.mypurecloud.sdk.v2.connector.apache.ApacheHttpClientConnectorProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ApiClientConnectorLoader {
    private ApiClientConnectorLoader() { }

    public static ApiClientConnector load(ApiClientConnectorProperties properties) {
        ApiClientConnector connector = loadFromProperties(properties);
        if (connector != null) {
            return connector;
        }

        connector = loadFromServiceLoader(properties);
        if (connector != null) {
            return connector;
        }

        return new ApacheHttpClientConnectorProvider().create(properties);
    }

    private static ApiClientConnector loadFromProperties(ApiClientConnectorProperties properties) {
        Object connectorProviderProperty = properties.getProperty(ApiClientConnectorProperty.CONNECTOR_PROVIDER, Object.class, null);
        if (connectorProviderProperty == null) {
            return null;
        }
        if (connectorProviderProperty instanceof ApiClientConnector) {
            return (ApiClientConnector)connectorProviderProperty;
        }
        if (connectorProviderProperty instanceof ApiClientConnectorProvider) {
            ApiClientConnectorProvider provider = (ApiClientConnectorProvider)connectorProviderProperty;
            return provider.create(properties);
        }
        if (connectorProviderProperty instanceof String) {
            String connectorProviderClassName = (String)connectorProviderProperty;
            try {
                connectorProviderProperty = Class.forName(connectorProviderClassName);
            }
            catch (ClassNotFoundException exception) {
                throw new RuntimeException("Unable to load ApiClientConnectorProvider from class name \"" + connectorProviderClassName + "\".", exception);
            }
        }
        if (connectorProviderProperty instanceof Class) {
            Class<?> connectorProviderClass = (Class<?>)connectorProviderProperty;
            if (ApiClientConnectorProvider.class.isAssignableFrom(connectorProviderClass)) {
                try {
                    ApiClientConnectorProvider provider = (ApiClientConnectorProvider) connectorProviderClass.newInstance();
                    return provider.create(properties);
                }
                catch (IllegalAccessException | InstantiationException exception) {
                    throw new RuntimeException("Unable to load connector from class.", exception);
                }
            }
            else {
                throw new RuntimeException("Unable to load ApiClientConnectorProvider from class \"" + connectorProviderClass.getName() + "\", it does not implement the required interface.");
            }
        }
        return null;
    }

    private static ApiClientConnector loadFromServiceLoader(ApiClientConnectorProperties properties) {
        ServiceLoader<ApiClientConnectorProvider> loader = ServiceLoader.load(ApiClientConnectorProvider.class);
        Iterator<ApiClientConnectorProvider> iterator = loader.iterator();
        if (iterator.hasNext()) {
            ApiClientConnectorProvider provider = iterator.next();
            return provider.create(properties);
        }
        return null;
    }
}
