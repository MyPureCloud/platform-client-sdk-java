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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class GetScimV2GroupRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public GetScimV2GroupRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private String ifNoneMatch;
	public String getIfNoneMatch() {
		return this.ifNoneMatch;
	}

	public void setIfNoneMatch(String ifNoneMatch) {
		this.ifNoneMatch = ifNoneMatch;
	}

	public GetScimV2GroupRequest withIfNoneMatch(String ifNoneMatch) {
	    this.setIfNoneMatch(ifNoneMatch);
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

    public GetScimV2GroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for GetScimV2GroupRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/v2/groups/{groupId}")
                .withPathParameter("groupId", groupId)
        
                .withHeaderParameter("If-None-Match", ifNoneMatch)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json", "application/scim+json")
                .withAccepts("application/json", "application/scim+json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String groupId) {
	    return new Builder()
	            .withRequiredParams(groupId);
	}
	

	public static class Builder {
		private final GetScimV2GroupRequest request;

		private Builder() {
			request = new GetScimV2GroupRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withIfNoneMatch(String ifNoneMatch) {
			request.setIfNoneMatch(ifNoneMatch);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId) {
			request.setGroupId(groupId);
			
			return this;
		}
		

		public GetScimV2GroupRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for GetScimV2GroupRequest.");
            }
            
			return request;
		}
	}
}
