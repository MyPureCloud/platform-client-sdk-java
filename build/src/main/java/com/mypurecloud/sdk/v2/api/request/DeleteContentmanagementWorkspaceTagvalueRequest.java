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

import com.mypurecloud.sdk.v2.model.CommandStatus;
import com.mypurecloud.sdk.v2.model.CommandStatusEntityListing;
import com.mypurecloud.sdk.v2.model.CreateShareRequest;
import com.mypurecloud.sdk.v2.model.CreateShareResponse;
import com.mypurecloud.sdk.v2.model.Document;
import com.mypurecloud.sdk.v2.model.DocumentEntityListing;
import com.mypurecloud.sdk.v2.model.DocumentUpdate;
import com.mypurecloud.sdk.v2.model.DocumentUpload;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.QueryRequest;
import com.mypurecloud.sdk.v2.model.QueryResults;
import com.mypurecloud.sdk.v2.model.ReplaceRequest;
import com.mypurecloud.sdk.v2.model.ReplaceResponse;
import com.mypurecloud.sdk.v2.model.SecurityProfile;
import com.mypurecloud.sdk.v2.model.SecurityProfileEntityListing;
import com.mypurecloud.sdk.v2.model.Share;
import com.mypurecloud.sdk.v2.model.ShareEntityListing;
import com.mypurecloud.sdk.v2.model.SharedResponse;
import com.mypurecloud.sdk.v2.model.TagQueryRequest;
import com.mypurecloud.sdk.v2.model.TagValue;
import com.mypurecloud.sdk.v2.model.TagValueEntityListing;
import com.mypurecloud.sdk.v2.model.Usage;
import com.mypurecloud.sdk.v2.model.Workspace;
import com.mypurecloud.sdk.v2.model.WorkspaceCreate;
import com.mypurecloud.sdk.v2.model.WorkspaceEntityListing;
import com.mypurecloud.sdk.v2.model.WorkspaceMember;
import com.mypurecloud.sdk.v2.model.WorkspaceMemberEntityListing;

public class DeleteContentmanagementWorkspaceTagvalueRequest {

	private String workspaceId;
	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public DeleteContentmanagementWorkspaceTagvalueRequest withWorkspaceId(String workspaceId) {
	    this.setWorkspaceId(workspaceId);
	    return this;
	} 

	private String tagId;
	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public DeleteContentmanagementWorkspaceTagvalueRequest withTagId(String tagId) {
	    this.setTagId(tagId);
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

    public DeleteContentmanagementWorkspaceTagvalueRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'workspaceId' is set
        if (this.workspaceId == null) {
            throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceTagvalueRequest.");
        }
        
        // verify the required parameter 'tagId' is set
        if (this.tagId == null) {
            throw new IllegalStateException("Missing the required parameter 'tagId' when building request for DeleteContentmanagementWorkspaceTagvalueRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/contentmanagement/workspaces/{workspaceId}/tagvalues/{tagId}")
                .withPathParameter("workspaceId", workspaceId)
        
                .withPathParameter("tagId", tagId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String workspaceId, String tagId) {
	    return new Builder()
	            .withRequiredParams(workspaceId, tagId);
	}


	public static class Builder {
		private final DeleteContentmanagementWorkspaceTagvalueRequest request;

		private Builder() {
			request = new DeleteContentmanagementWorkspaceTagvalueRequest();
		}


		public Builder withWorkspaceId(String workspaceId) {
			request.setWorkspaceId(workspaceId);
			return this;
		}

		public Builder withTagId(String tagId) {
			request.setTagId(tagId);
			return this;
		}



		public Builder withRequiredParams(String workspaceId, String tagId) {
			request.setWorkspaceId(workspaceId);
			request.setTagId(tagId);

			return this;
		}


		public DeleteContentmanagementWorkspaceTagvalueRequest build() {
            
            // verify the required parameter 'workspaceId' is set
            if (request.workspaceId == null) {
                throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceTagvalueRequest.");
            }
            
            // verify the required parameter 'tagId' is set
            if (request.tagId == null) {
                throw new IllegalStateException("Missing the required parameter 'tagId' when building request for DeleteContentmanagementWorkspaceTagvalueRequest.");
            }
            
			return request;
		}
	}
}
