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
import com.mypurecloud.sdk.v2.model.OAuthAuthorization;
import com.mypurecloud.sdk.v2.model.OAuthAuthorizationListing;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;
import com.mypurecloud.sdk.v2.model.OAuthScope;
import com.mypurecloud.sdk.v2.model.OAuthScopeListing;
import com.mypurecloud.sdk.v2.model.ApiUsageQuery;
import com.mypurecloud.sdk.v2.model.OAuthClientRequest;

public class PutOauthClientRequest {
    
	private String clientId;
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public PutOauthClientRequest withClientId(String clientId) {
	    this.setClientId(clientId);
	    return this;
	} 
	
	private OAuthClientRequest body;
	public OAuthClientRequest getBody() {
		return this.body;
	}

	public void setBody(OAuthClientRequest body) {
		this.body = body;
	}

	public PutOauthClientRequest withBody(OAuthClientRequest body) {
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

    public PutOauthClientRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OAuthClientRequest> withHttpInfo() {
        
        // verify the required parameter 'clientId' is set
        if (this.clientId == null) {
            throw new IllegalStateException("Missing the required parameter 'clientId' when building request for PutOauthClientRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOauthClientRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/oauth/clients/{clientId}")
                .withPathParameter("clientId", clientId)
        
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

	
	public static Builder builder(String clientId, OAuthClientRequest body) {
	    return new Builder()
	            .withRequiredParams(clientId, body);
	}
	

	public static class Builder {
		private final PutOauthClientRequest request;

		private Builder() {
			request = new PutOauthClientRequest();
		}

		
		public Builder withClientId(String clientId) {
			request.setClientId(clientId);
			return this;
		}
		
		public Builder withBody(OAuthClientRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String clientId, OAuthClientRequest body) {
			request.setClientId(clientId);
						request.setBody(body);
			
			return this;
		}
		

		public PutOauthClientRequest build() {
            
            // verify the required parameter 'clientId' is set
            if (request.clientId == null) {
                throw new IllegalStateException("Missing the required parameter 'clientId' when building request for PutOauthClientRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOauthClientRequest.");
            }
            
			return request;
		}
	}
}
