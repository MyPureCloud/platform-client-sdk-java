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

public class GetOauthClientUsageQueryResultRequest {
    
	private String executionId;
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public GetOauthClientUsageQueryResultRequest withExecutionId(String executionId) {
	    this.setExecutionId(executionId);
	    return this;
	} 
	
	private String clientId;
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public GetOauthClientUsageQueryResultRequest withClientId(String clientId) {
	    this.setClientId(clientId);
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

    public GetOauthClientUsageQueryResultRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'executionId' is set
        if (this.executionId == null) {
            throw new IllegalStateException("Missing the required parameter 'executionId' when building request for GetOauthClientUsageQueryResultRequest.");
        }
        
        // verify the required parameter 'clientId' is set
        if (this.clientId == null) {
            throw new IllegalStateException("Missing the required parameter 'clientId' when building request for GetOauthClientUsageQueryResultRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}")
                .withPathParameter("executionId", executionId)
        
                .withPathParameter("clientId", clientId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String executionId, String clientId) {
	    return new Builder()
	            .withRequiredParams(executionId, clientId);
	}
	

	public static class Builder {
		private final GetOauthClientUsageQueryResultRequest request;

		private Builder() {
			request = new GetOauthClientUsageQueryResultRequest();
		}

		
		public Builder withExecutionId(String executionId) {
			request.setExecutionId(executionId);
			return this;
		}
		
		public Builder withClientId(String clientId) {
			request.setClientId(clientId);
			return this;
		}
		

		
		public Builder withRequiredParams(String executionId, String clientId) {
			request.setExecutionId(executionId);
						request.setClientId(clientId);
			
			return this;
		}
		

		public GetOauthClientUsageQueryResultRequest build() {
            
            // verify the required parameter 'executionId' is set
            if (request.executionId == null) {
                throw new IllegalStateException("Missing the required parameter 'executionId' when building request for GetOauthClientUsageQueryResultRequest.");
            }
            
            // verify the required parameter 'clientId' is set
            if (request.clientId == null) {
                throw new IllegalStateException("Missing the required parameter 'clientId' when building request for GetOauthClientUsageQueryResultRequest.");
            }
            
			return request;
		}
	}
}
