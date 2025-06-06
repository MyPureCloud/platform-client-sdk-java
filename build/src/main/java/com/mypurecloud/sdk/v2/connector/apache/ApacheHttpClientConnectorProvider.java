package com.mypurecloud.sdk.v2.connector.apache;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mypurecloud.sdk.v2.DetailLevel;
import com.mypurecloud.sdk.v2.connector.ApiClientConnector;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProperties;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProperty;
import com.mypurecloud.sdk.v2.connector.ApiClientConnectorProvider;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.security.KeyStore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class ApacheHttpClientConnectorProvider implements ApiClientConnectorProvider {
    @Override
    public ApiClientConnector create(ApiClientConnectorProperties properties) {
        RequestConfig.Builder requestBuilder = RequestConfig.custom();

        Integer connectionTimeout = properties.getProperty(ApiClientConnectorProperty.CONNECTION_TIMEOUT, Integer.class, null);
        if (connectionTimeout != null && connectionTimeout > 0) {
            requestBuilder = requestBuilder.setConnectTimeout(connectionTimeout)
                    .setSocketTimeout(connectionTimeout)
                    .setConnectionRequestTimeout(connectionTimeout);
        }

        Proxy proxy = properties.getProperty(ApiClientConnectorProperty.PROXY, Proxy.class, null);
        ApacheHttpCredentialsProvider credentialsProvider = null;
        if (proxy != null) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetAddress = (InetSocketAddress)address;
                HttpHost proxyHost = new HttpHost(inetAddress.getAddress(), inetAddress.getPort());
                requestBuilder.setProxy(proxyHost);

                String user = properties.getProperty(ApiClientConnectorProperty.PROXY_USER, String.class, null);
                String pass = properties.getProperty(ApiClientConnectorProperty.PROXY_PASS, String.class, null);
                if (user != null && pass != null) {
                    credentialsProvider = new ApacheHttpCredentialsProvider(inetAddress.getHostName(), inetAddress.getPort(), user, pass);
                }
            }
        }

        DetailLevel detailLevel = properties.getProperty(ApiClientConnectorProperty.DETAIL_LEVEL, DetailLevel.class, DetailLevel.MINIMAL);
        SLF4JInterceptor defaultInterceptor = new SLF4JInterceptor(detailLevel);
        HttpRequestInterceptor requestInterceptor = properties.getProperty(ApiClientConnectorProperty.HTTP_REQUEST_INTERCEPTOR,
            HttpRequestInterceptor.class,
            defaultInterceptor);
        HttpResponseInterceptor responseInterceptor = properties.getProperty(ApiClientConnectorProperty.HTTP_RESPONSE_INTERCEPTOR,
            HttpResponseInterceptor.class,
            defaultInterceptor);

        HttpClientBuilder builder = HttpClients.custom()
                .setDefaultRequestConfig(requestBuilder.build())
                .addInterceptorFirst(requestInterceptor)
                .addInterceptorLast(responseInterceptor)
                .setDefaultRequestConfig(requestBuilder.build());


    
        SSLContext sslContext = createSSLContext(properties);
        if (sslContext != null) {
            builder.setSSLContext(sslContext);
        }


        if (credentialsProvider != null) {
            builder.setDefaultCredentialsProvider(credentialsProvider);
        }
        CloseableHttpClient client = builder.build();

        ExecutorService executorService = properties.getProperty(ApiClientConnectorProperty.ASYNC_EXECUTOR_SERVICE, ExecutorService.class, null);
        if (executorService == null) {
            executorService = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setNameFormat("purecloud-sdk-%d").build());
        }

        return new ApacheHttpClientConnector(client, executorService);
    }

    private static SSLContext createSSLContext(ApiClientConnectorProperties properties){
        
        String defaultTrustStore = "";
        String keyStorePath = properties.getProperty(ApiClientConnectorProperty.KEYSTORE_PATH, String.class, null);
        char[] keyStorePassword = properties.getProperty(ApiClientConnectorProperty.KEYSTORE_PASSWORD, String.class, defaultTrustStore).toCharArray();
        String trustStorePath = properties.getProperty(ApiClientConnectorProperty.TRUSTSTORE_PATH, String.class, null); 
        char[] trustStorePassword = properties.getProperty(ApiClientConnectorProperty.TRUSTSTORE_PASSWORD, String.class, defaultTrustStore).toCharArray();
        
        if (keyStorePath != null && trustStorePath != null){
    
            KeyManagerFactory kmf;
            try {
                kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
     
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            try (FileInputStream keyStoreFileInputStream = new FileInputStream(keyStorePath)) {
                keyStore.load(keyStoreFileInputStream, keyStorePassword);
                kmf.init(keyStore,keyStorePassword);
            }
    
            // Load truststore (contains CA chain to validate client certificates)
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore truststore = KeyStore.getInstance("JKS");
            try (FileInputStream trustStoreFileInputStream = new FileInputStream(trustStorePath)) {
                truststore.load(trustStoreFileInputStream, trustStorePassword);
                tmf.init(truststore);
            }
    
            // Create SSLContext
            SSLContext sslContext = SSLContext.getInstance("TLSv1.3");
            sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);


            return sslContext;
            } 
            catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
        return null;
    }
}
