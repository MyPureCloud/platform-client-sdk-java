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

public class GetContentmanagementQueryRequest {

	private String queryPhrase;
	public String getQueryPhrase() {
		return this.queryPhrase;
	}

	public void setQueryPhrase(String queryPhrase) {
		this.queryPhrase = queryPhrase;
	}

	public GetContentmanagementQueryRequest withQueryPhrase(String queryPhrase) {
	    this.setQueryPhrase(queryPhrase);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetContentmanagementQueryRequest withPageSize(Integer pageSize) {
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

	public GetContentmanagementQueryRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetContentmanagementQueryRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetContentmanagementQueryRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetContentmanagementQueryRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ACL("acl"),
		WORKSPACE("workspace");

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

    public GetContentmanagementQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'queryPhrase' is set
        if (this.queryPhrase == null) {
            throw new IllegalStateException("Missing the required parameter 'queryPhrase' when building request for GetContentmanagementQueryRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/contentmanagement/query")

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("sortBy", "", sortBy)
        

                .withQueryParameters("sortOrder", "", sortOrder)
        

                .withQueryParameters("queryPhrase", "", queryPhrase)
        

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


	public static Builder builder(String queryPhrase) {
	    return new Builder()
	            .withRequiredParams(queryPhrase);
	}


	public static class Builder {
		private final GetContentmanagementQueryRequest request;

		private Builder() {
			request = new GetContentmanagementQueryRequest();
		}


		public Builder withQueryPhrase(String queryPhrase) {
			request.setQueryPhrase(queryPhrase);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}

		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
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



		public Builder withRequiredParams(String queryPhrase) {
			request.setQueryPhrase(queryPhrase);

			return this;
		}


		public GetContentmanagementQueryRequest build() {
            
            // verify the required parameter 'queryPhrase' is set
            if (request.queryPhrase == null) {
                throw new IllegalStateException("Missing the required parameter 'queryPhrase' when building request for GetContentmanagementQueryRequest.");
            }
            
			return request;
		}
	}
}
