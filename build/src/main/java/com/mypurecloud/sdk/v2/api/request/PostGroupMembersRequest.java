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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Group;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.GroupProfile;
import com.mypurecloud.sdk.v2.model.GroupEntityListing;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupProfileEntityListing;
import com.mypurecloud.sdk.v2.model.GroupMembersUpdate;
import com.mypurecloud.sdk.v2.model.GroupCreate;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupUpdate;

public class PostGroupMembersRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PostGroupMembersRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private GroupMembersUpdate body;
	public GroupMembersUpdate getBody() {
		return this.body;
	}

	public void setBody(GroupMembersUpdate body) {
		this.body = body;
	}

	public PostGroupMembersRequest withBody(GroupMembersUpdate body) {
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

    public PostGroupMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<GroupMembersUpdate> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PostGroupMembersRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostGroupMembersRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/groups/{groupId}/members")
                .withPathParameter("groupId", groupId)
        
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

	
	public static Builder builder(String groupId, GroupMembersUpdate body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}
	

	public static class Builder {
		private final PostGroupMembersRequest request;

		private Builder() {
			request = new PostGroupMembersRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withBody(GroupMembersUpdate body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId, GroupMembersUpdate body) {
			request.setGroupId(groupId);
						request.setBody(body);
			
			return this;
		}
		

		public PostGroupMembersRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PostGroupMembersRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostGroupMembersRequest.");
            }
            
			return request;
		}
	}
}
