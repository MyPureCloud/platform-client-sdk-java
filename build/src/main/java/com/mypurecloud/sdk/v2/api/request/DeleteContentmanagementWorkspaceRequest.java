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
import com.mypurecloud.sdk.v2.model.ContentQueryRequest;
import com.mypurecloud.sdk.v2.model.CreateShareRequest;
import com.mypurecloud.sdk.v2.model.CreateShareResponse;
import com.mypurecloud.sdk.v2.model.Document;
import com.mypurecloud.sdk.v2.model.DocumentAuditEntityListing;
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

public class DeleteContentmanagementWorkspaceRequest {

	private String workspaceId;
	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
	}

	public DeleteContentmanagementWorkspaceRequest withWorkspaceId(String workspaceId) {
	    this.setWorkspaceId(workspaceId);
	    return this;
	} 

	private String moveChildrenToWorkspaceId;
	public String getMoveChildrenToWorkspaceId() {
		return this.moveChildrenToWorkspaceId;
	}

	public void setMoveChildrenToWorkspaceId(String moveChildrenToWorkspaceId) {
		this.moveChildrenToWorkspaceId = moveChildrenToWorkspaceId;
	}

	public DeleteContentmanagementWorkspaceRequest withMoveChildrenToWorkspaceId(String moveChildrenToWorkspaceId) {
	    this.setMoveChildrenToWorkspaceId(moveChildrenToWorkspaceId);
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

    public DeleteContentmanagementWorkspaceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'workspaceId' is set
        if (this.workspaceId == null) {
            throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/contentmanagement/workspaces/{workspaceId}")
                .withPathParameter("workspaceId", workspaceId)
        

                .withQueryParameters("moveChildrenToWorkspaceId", "", moveChildrenToWorkspaceId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String workspaceId) {
	    return new Builder()
	            .withRequiredParams(workspaceId);
	}


	public static class Builder {
		private final DeleteContentmanagementWorkspaceRequest request;

		private Builder() {
			request = new DeleteContentmanagementWorkspaceRequest();
		}


		public Builder withWorkspaceId(String workspaceId) {
			request.setWorkspaceId(workspaceId);
			return this;
		}

		public Builder withMoveChildrenToWorkspaceId(String moveChildrenToWorkspaceId) {
			request.setMoveChildrenToWorkspaceId(moveChildrenToWorkspaceId);
			return this;
		}



		public Builder withRequiredParams(String workspaceId) {
			request.setWorkspaceId(workspaceId);

			return this;
		}


		public DeleteContentmanagementWorkspaceRequest build() {
            
            // verify the required parameter 'workspaceId' is set
            if (request.workspaceId == null) {
                throw new IllegalStateException("Missing the required parameter 'workspaceId' when building request for DeleteContentmanagementWorkspaceRequest.");
            }
            
			return request;
		}
	}
}
