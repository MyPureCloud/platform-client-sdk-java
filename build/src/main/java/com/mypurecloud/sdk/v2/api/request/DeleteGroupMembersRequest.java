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

public class DeleteGroupMembersRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public DeleteGroupMembersRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private String ids;
	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public DeleteGroupMembersRequest withIds(String ids) {
	    this.setIds(ids);
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

    public DeleteGroupMembersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for DeleteGroupMembersRequest.");
        }
        
        // verify the required parameter 'ids' is set
        if (this.ids == null) {
            throw new IllegalStateException("Missing the required parameter 'ids' when building request for DeleteGroupMembersRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/groups/{groupId}/members")
                .withPathParameter("groupId", groupId)
        
                .withQueryParameters("ids", "", ids)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String groupId, String ids) {
	    return new Builder()
	            .withRequiredParams(groupId, ids);
	}
	

	public static class Builder {
		private final DeleteGroupMembersRequest request;

		private Builder() {
			request = new DeleteGroupMembersRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withIds(String ids) {
			request.setIds(ids);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId, String ids) {
			request.setGroupId(groupId);
						request.setIds(ids);
			
			return this;
		}
		

		public DeleteGroupMembersRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for DeleteGroupMembersRequest.");
            }
            
            // verify the required parameter 'ids' is set
            if (request.ids == null) {
                throw new IllegalStateException("Missing the required parameter 'ids' when building request for DeleteGroupMembersRequest.");
            }
            
			return request;
		}
	}
}
