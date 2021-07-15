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

public class PutScimGroupRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PutScimGroupRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private ScimV2Group body;
	public ScimV2Group getBody() {
		return this.body;
	}

	public void setBody(ScimV2Group body) {
		this.body = body;
	}

	public PutScimGroupRequest withBody(ScimV2Group body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String ifMatch;
	public String getIfMatch() {
		return this.ifMatch;
	}

	public void setIfMatch(String ifMatch) {
		this.ifMatch = ifMatch;
	}

	public PutScimGroupRequest withIfMatch(String ifMatch) {
	    this.setIfMatch(ifMatch);
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

    public PutScimGroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScimV2Group> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PutScimGroupRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutScimGroupRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/scim/groups/{groupId}")
                .withPathParameter("groupId", groupId)
        
                .withHeaderParameter("If-Match", ifMatch)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/scim+json", "application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String groupId, ScimV2Group body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}
	

	public static class Builder {
		private final PutScimGroupRequest request;

		private Builder() {
			request = new PutScimGroupRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withBody(ScimV2Group body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withIfMatch(String ifMatch) {
			request.setIfMatch(ifMatch);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId, ScimV2Group body) {
			request.setGroupId(groupId);
						request.setBody(body);
			
			return this;
		}
		

		public PutScimGroupRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PutScimGroupRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutScimGroupRequest.");
            }
            
			return request;
		}
	}
}
