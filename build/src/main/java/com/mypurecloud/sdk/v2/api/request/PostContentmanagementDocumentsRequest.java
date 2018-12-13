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

public class PostContentmanagementDocumentsRequest {
    
	private DocumentUpload body;
	public DocumentUpload getBody() {
		return this.body;
	}

	public void setBody(DocumentUpload body) {
		this.body = body;
	}

	public PostContentmanagementDocumentsRequest withBody(DocumentUpload body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String copySource;
	public String getCopySource() {
		return this.copySource;
	}

	public void setCopySource(String copySource) {
		this.copySource = copySource;
	}

	public PostContentmanagementDocumentsRequest withCopySource(String copySource) {
	    this.setCopySource(copySource);
	    return this;
	} 
	
	private String moveSource;
	public String getMoveSource() {
		return this.moveSource;
	}

	public void setMoveSource(String moveSource) {
		this.moveSource = moveSource;
	}

	public PostContentmanagementDocumentsRequest withMoveSource(String moveSource) {
	    this.setMoveSource(moveSource);
	    return this;
	} 
	
	private Boolean override;
	public Boolean getOverride() {
		return this.override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
	}

	public PostContentmanagementDocumentsRequest withOverride(Boolean override) {
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

    public PostContentmanagementDocumentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DocumentUpload> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostContentmanagementDocumentsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/contentmanagement/documents")
                .withQueryParameters("copySource", "", copySource)
        
                .withQueryParameters("moveSource", "", moveSource)
        
                .withQueryParameters("override", "", override)
        
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

	
	public static Builder builder(DocumentUpload body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostContentmanagementDocumentsRequest request;

		private Builder() {
			request = new PostContentmanagementDocumentsRequest();
		}

		
		public Builder withBody(DocumentUpload body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withCopySource(String copySource) {
			request.setCopySource(copySource);
			return this;
		}
		
		public Builder withMoveSource(String moveSource) {
			request.setMoveSource(moveSource);
			return this;
		}
		
		public Builder withOverride(Boolean override) {
			request.setOverride(override);
			return this;
		}
		

		
		public Builder withRequiredParams(DocumentUpload body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostContentmanagementDocumentsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostContentmanagementDocumentsRequest.");
            }
            
			return request;
		}
	}
}
