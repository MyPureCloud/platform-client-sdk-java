package com.mypurecloud.sdk.v2.connector.apache;

import com.mypurecloud.sdk.v2.connector.ApiClientConnectorResponse;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ApacheHttpResponse implements ApiClientConnectorResponse {
    private static final Logger LOG = LoggerFactory.getLogger(ApacheHttpResponse.class);

    private final CloseableHttpResponse response;

    public ApacheHttpResponse(CloseableHttpResponse response) {
        this.response = response;
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            if (!entity.isRepeatable()) {
                try {
                    response.setEntity(new BufferedHttpEntity(entity));
                }
                catch (Exception exception) {
                    LOG.error("Failed to buffer HTTP entity.", exception);
                }
            }
        }
    }

    @Override
    public int getStatusCode() {
        return response.getStatusLine().getStatusCode();
    }

    @Override
    public String getStatusReasonPhrase() {
        return response.getStatusLine().getReasonPhrase();
    }

    @Override
    public boolean hasBody() {
        HttpEntity entity = response.getEntity();
        return (entity != null && entity.getContentLength() != 0L);
    }

    @Override
    public InputStream getBody() throws IOException {
        HttpEntity entity = response.getEntity();
        return (entity != null) ? entity.getContent() : null;
    }

    @Override
    public String readBody() throws IOException {
        HttpEntity entity = response.getEntity();
        return (entity != null) ? EntityUtils.toString(entity, StandardCharsets.UTF_8) : null;
    }

    @Override
    public Map<String, String> getHeaders() {
        Map<String, String> map = new HashMap<>();
        for (Header header : response.getAllHeaders()) {
            map.put(header.getName(), header.getValue());
        }
        return Collections.unmodifiableMap(map);
    }

    @Override
    public void close() throws Exception {
        response.close();
    }
}
