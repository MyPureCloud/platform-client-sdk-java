package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;

public class PostMessagingIntegrationsLineRequest {
    
	private LineIntegrationRequest body;
	public LineIntegrationRequest getBody() {
		return this.body;
	}

	public void setBody(LineIntegrationRequest body) {
		this.body = body;
	}

	public PostMessagingIntegrationsLineRequest withBody(LineIntegrationRequest body) {
	    this.setBody(body);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public PostMessagingIntegrationsLineRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LineIntegrationRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostMessagingIntegrationsLineRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/messaging/integrations/line")
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(LineIntegrationRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostMessagingIntegrationsLineRequest request;

		private Builder() {
			request = new PostMessagingIntegrationsLineRequest();
		}

		
		public Builder withBody(LineIntegrationRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(LineIntegrationRequest body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostMessagingIntegrationsLineRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostMessagingIntegrationsLineRequest.");
            }
            
			return request;
		}
	}
}
