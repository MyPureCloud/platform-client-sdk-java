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

public class GetOauthScopeRequest {
    
	private String scopeId;
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public GetOauthScopeRequest withScopeId(String scopeId) {
	    this.setScopeId(scopeId);
	    return this;
	} 
	
	private String acceptLanguage;
	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public GetOauthScopeRequest withAcceptLanguage(String acceptLanguage) {
	    this.setAcceptLanguage(acceptLanguage);
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

    public GetOauthScopeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scopeId' is set
        if (this.scopeId == null) {
            throw new IllegalStateException("Missing the required parameter 'scopeId' when building request for GetOauthScopeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/oauth/scopes/{scopeId}")
                .withPathParameter("scopeId", scopeId)
        
                .withHeaderParameter("Accept-Language", acceptLanguage)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String scopeId) {
	    return new Builder()
	            .withRequiredParams(scopeId);
	}
	

	public static class Builder {
		private final GetOauthScopeRequest request;

		private Builder() {
			request = new GetOauthScopeRequest();
		}

		
		public Builder withScopeId(String scopeId) {
			request.setScopeId(scopeId);
			return this;
		}
		
		public Builder withAcceptLanguage(String acceptLanguage) {
			request.setAcceptLanguage(acceptLanguage);
			return this;
		}
		

		
		public Builder withRequiredParams(String scopeId) {
			request.setScopeId(scopeId);
			
			return this;
		}
		

		public GetOauthScopeRequest build() {
            
            // verify the required parameter 'scopeId' is set
            if (request.scopeId == null) {
                throw new IllegalStateException("Missing the required parameter 'scopeId' when building request for GetOauthScopeRequest.");
            }
            
			return request;
		}
	}
}
