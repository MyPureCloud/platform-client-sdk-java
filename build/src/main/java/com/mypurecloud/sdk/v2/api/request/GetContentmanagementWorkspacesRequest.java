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

public class GetContentmanagementWorkspacesRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetContentmanagementWorkspacesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetContentmanagementWorkspacesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private List<String> access;
	public List<String> getAccess() {
		return this.access;
	}

	public void setAccess(List<String> access) {
		this.access = access;
	}

	public GetContentmanagementWorkspacesRequest withAccess(List<String> access) {
	    this.setAccess(access);
	    return this;
	} 

	public enum accessValues { 
		CONTENT("content"), 
		ADMIN("admin"), 
		DOCUMENT_CREATE("document:create"), 
		DOCUMENT_VIEWCONTENT("document:viewContent"), 
		DOCUMENT_VIEWMETADATA("document:viewMetadata"), 
		DOCUMENT_DOWNLOAD("document:download"), 
		DOCUMENT_DELETE("document:delete"), 
		DOCUMENT_UPDATE("document:update"), 
		DOCUMENT_SHARE("document:share"), 
		DOCUMENT_SHAREVIEW("document:shareView"), 
		DOCUMENT_EMAIL("document:email"), 
		DOCUMENT_PRINT("document:print"), 
		DOCUMENT_AUDITVIEW("document:auditView"), 
		DOCUMENT_REPLACE("document:replace"), 
		DOCUMENT_TAG("document:tag"), 
		TAG_CREATE("tag:create"), 
		TAG_VIEW("tag:view"), 
		TAG_UPDATE("tag:update"), 
		TAG_APPLY("tag:apply"), 
		TAG_REMOVE("tag:remove"), 
		TAG_DELETE("tag:delete");

		private String value;

		accessValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static accessValues fromString(String key) {
			if (key == null) return null;

			for (accessValues value : accessValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return accessValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetContentmanagementWorkspacesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		SUMMARY("summary"), 
		ACL("acl");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetContentmanagementWorkspacesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/contentmanagement/workspaces")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("access", "multi", access)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetContentmanagementWorkspacesRequest request;

		private Builder() {
			request = new GetContentmanagementWorkspacesRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withAccess(List<String> access) {
			request.setAccess(access);
			return this;
		}

		public Builder withAccessEnumValues(List<accessValues> access) {
		    List<String> stringList = new ArrayList<>();
	      for (accessValues e : access) {
	        stringList.add(e.toString());
	      }
	      request.setAccess(stringList);
		    return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}
		

		

		public GetContentmanagementWorkspacesRequest build() {
            
			return request;
		}
	}
}
