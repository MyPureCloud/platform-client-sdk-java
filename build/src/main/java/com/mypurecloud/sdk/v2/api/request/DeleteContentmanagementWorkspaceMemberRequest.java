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
import com.mypurecloud.sdk.v2.model.Document;
import com.mypurecloud.sdk.v2.model.DocumentAuditEntityListing;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.DocumentEntityListing;
import com.mypurecloud.sdk.v2.model.QueryResults;
import com.mypurecloud.sdk.v2.model.SecurityProfile;
import com.mypurecloud.sdk.v2.model.SecurityProfileEntityListing;
import com.mypurecloud.sdk.v2.model.Share;
import com.mypurecloud.sdk.v2.model.SharedResponse;
import com.mypurecloud.sdk.v2.model.ShareEntityListing;
import com.mypurecloud.sdk.v2.model.CommandStatusEntityListing;
import com.mypurecloud.sdk.v2.model.CommandStatus;
import com.mypurecloud.sdk.v2.model.Usage;
import com.mypurecloud.sdk.v2.model.Workspace;
import com.mypurecloud.sdk.v2.model.WorkspaceMember;
import com.mypurecloud.sdk.v2.model.WorkspaceMemberEntityListing;
import com.mypurecloud.sdk.v2.model.TagValue;
import com.mypurecloud.sdk.v2.model.TagValueEntityListing;
import com.mypurecloud.sdk.v2.model.WorkspaceEntityListing;
import com.mypurecloud.sdk.v2.model.ContentQueryRequest;
import com.mypurecloud.sdk.v2.model.DocumentUpdate;
import com.mypurecloud.sdk.v2.model.ReplaceRequest;
import com.mypurecloud.sdk.v2.model.ReplaceResponse;
import com.mypurecloud.sdk.v2.model.DocumentUpload;
import com.mypurecloud.sdk.v2.model.QueryRequest;
import com.mypurecloud.sdk.v2.model.CreateShareResponse;
import com.mypurecloud.sdk.v2.model.CreateShareRequest;
import com.mypurecloud.sdk.v2.model.TagQueryRequest;
import com.mypurecloud.sdk.v2.model.WorkspaceCreate;

public class DeleteContentmanagementWorkspaceMemberRequest {
    
	private String workspaceId;
	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public DeleteContentmanagementWorkspaceMemberRequest withWorkspaceId(String workspaceId) {
	    this.setWorkspaceId(workspaceId);
	    return this;
	} 
	
	private String memberId;
	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public DeleteContentmanagementWorkspaceMemberRequest withMemberId(String memberId) {
	    this.setMemberId(memberId);
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

    public DeleteContentmanagementWorkspaceMemberRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'workspaceId' is set
        if (this.workspaceId == null) {
            throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceMemberRequest.");
        }
        
        // verify the required parameter 'memberId' is set
        if (this.memberId == null) {
            throw new IllegalStateException("Missing the required parameter 'memberId' when building request for DeleteContentmanagementWorkspaceMemberRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/contentmanagement/workspaces/{workspaceId}/members/{memberId}")
                .withPathParameter("workspaceId", workspaceId)
        
                .withPathParameter("memberId", memberId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String workspaceId, String memberId) {
	    return new Builder()
	            .withRequiredParams(workspaceId, memberId);
	}
	

	public static class Builder {
		private final DeleteContentmanagementWorkspaceMemberRequest request;

		private Builder() {
			request = new DeleteContentmanagementWorkspaceMemberRequest();
		}

		
		public Builder withWorkspaceId(String workspaceId) {
			request.setWorkspaceId(workspaceId);
			return this;
		}
		
		public Builder withMemberId(String memberId) {
			request.setMemberId(memberId);
			return this;
		}
		

		
		public Builder withRequiredParams(String workspaceId, String memberId) {
			request.setWorkspaceId(workspaceId);
						request.setMemberId(memberId);
			
			return this;
		}
		

		public DeleteContentmanagementWorkspaceMemberRequest build() {
            
            // verify the required parameter 'workspaceId' is set
            if (request.workspaceId == null) {
                throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceMemberRequest.");
            }
            
            // verify the required parameter 'memberId' is set
            if (request.memberId == null) {
                throw new IllegalStateException("Missing the required parameter 'memberId' when building request for DeleteContentmanagementWorkspaceMemberRequest.");
            }
            
			return request;
		}
	}
}
