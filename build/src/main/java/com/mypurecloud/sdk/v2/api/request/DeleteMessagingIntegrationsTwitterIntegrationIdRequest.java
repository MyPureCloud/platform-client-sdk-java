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

public class DeleteMessagingIntegrationsTwitterIntegrationIdRequest {
    
	private String integrationId;
	public String getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public DeleteMessagingIntegrationsTwitterIntegrationIdRequest withIntegrationId(String integrationId) {
	    this.setIntegrationId(integrationId);
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

    public DeleteMessagingIntegrationsTwitterIntegrationIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'integrationId' is set
        if (this.integrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for DeleteMessagingIntegrationsTwitterIntegrationIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/messaging/integrations/twitter/{integrationId}")
                .withPathParameter("integrationId", integrationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String integrationId) {
	    return new Builder()
	            .withRequiredParams(integrationId);
	}
	

	public static class Builder {
		private final DeleteMessagingIntegrationsTwitterIntegrationIdRequest request;

		private Builder() {
			request = new DeleteMessagingIntegrationsTwitterIntegrationIdRequest();
		}

		
		public Builder withIntegrationId(String integrationId) {
			request.setIntegrationId(integrationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String integrationId) {
			request.setIntegrationId(integrationId);
			
			return this;
		}
		

		public DeleteMessagingIntegrationsTwitterIntegrationIdRequest build() {
            
            // verify the required parameter 'integrationId' is set
            if (request.integrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for DeleteMessagingIntegrationsTwitterIntegrationIdRequest.");
            }
            
			return request;
		}
	}
}
