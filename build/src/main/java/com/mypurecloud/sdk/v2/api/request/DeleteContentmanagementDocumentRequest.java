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

public class DeleteContentmanagementDocumentRequest {
    
	private String documentId;
	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public DeleteContentmanagementDocumentRequest withDocumentId(String documentId) {
	    this.setDocumentId(documentId);
	    return this;
	} 
	
	private Boolean override;
	public Boolean getOverride() {
		return this.override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
	}

	public DeleteContentmanagementDocumentRequest withOverride(Boolean override) {
	    this.setOverride(override);
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

    public DeleteContentmanagementDocumentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'documentId' is set
        if (this.documentId == null) {
            throw new IllegalStateException("Missing the required parameter 'documentId' when building request for DeleteContentmanagementDocumentRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/contentmanagement/documents/{documentId}")
                .withPathParameter("documentId", documentId)
        
                .withQueryParameters("override", "", override)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String documentId) {
	    return new Builder()
	            .withRequiredParams(documentId);
	}
	

	public static class Builder {
		private final DeleteContentmanagementDocumentRequest request;

		private Builder() {
			request = new DeleteContentmanagementDocumentRequest();
		}

		
		public Builder withDocumentId(String documentId) {
			request.setDocumentId(documentId);
			return this;
		}
		
		public Builder withOverride(Boolean override) {
			request.setOverride(override);
			return this;
		}
		

		
		public Builder withRequiredParams(String documentId) {
			request.setDocumentId(documentId);
			
			return this;
		}
		

		public DeleteContentmanagementDocumentRequest build() {
            
            // verify the required parameter 'documentId' is set
            if (request.documentId == null) {
                throw new IllegalStateException("Missing the required parameter 'documentId' when building request for DeleteContentmanagementDocumentRequest.");
            }
            
			return request;
		}
	}
}
