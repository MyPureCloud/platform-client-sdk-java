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

import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class GetScimSchemasRequest {
    
	private String filter;
	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public GetScimSchemasRequest withFilter(String filter) {
	    this.setFilter(filter);
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

    public GetScimSchemasRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/schemas")
                .withQueryParameters("filter", "", filter)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/scim+json", "application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetScimSchemasRequest request;

		private Builder() {
			request = new GetScimSchemasRequest();
		}

		
		public Builder withFilter(String filter) {
			request.setFilter(filter);
			return this;
		}
		

		

		public GetScimSchemasRequest build() {
            
			return request;
		}
	}
}
