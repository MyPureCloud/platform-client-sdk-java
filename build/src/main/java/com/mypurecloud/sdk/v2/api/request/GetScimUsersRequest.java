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

import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class GetScimUsersRequest {
    
	private String filter;
	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public GetScimUsersRequest withFilter(String filter) {
	    this.setFilter(filter);
	    return this;
	} 
	
	private Integer startIndex;
	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public GetScimUsersRequest withStartIndex(Integer startIndex) {
	    this.setStartIndex(startIndex);
	    return this;
	} 
	
	private Integer count;
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public GetScimUsersRequest withCount(Integer count) {
	    this.setCount(count);
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

    public GetScimUsersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'filter' is set
        if (this.filter == null) {
            throw new IllegalStateException("Missing the required parameter 'filter' when building request for GetScimUsersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/users")
                .withQueryParameters("startIndex", "", startIndex)
        
                .withQueryParameters("count", "", count)
        
                .withQueryParameters("filter", "", filter)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json", "application/scim+json")
                .withAccepts("application/json", "application/scim+json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String filter) {
	    return new Builder()
	            .withRequiredParams(filter);
	}
	

	public static class Builder {
		private final GetScimUsersRequest request;

		private Builder() {
			request = new GetScimUsersRequest();
		}

		
		public Builder withFilter(String filter) {
			request.setFilter(filter);
			return this;
		}
		
		public Builder withStartIndex(Integer startIndex) {
			request.setStartIndex(startIndex);
			return this;
		}
		
		public Builder withCount(Integer count) {
			request.setCount(count);
			return this;
		}
		

		
		public Builder withRequiredParams(String filter) {
			request.setFilter(filter);
			
			return this;
		}
		

		public GetScimUsersRequest build() {
            
            // verify the required parameter 'filter' is set
            if (request.filter == null) {
                throw new IllegalStateException("Missing the required parameter 'filter' when building request for GetScimUsersRequest.");
            }
            
			return request;
		}
	}
}
