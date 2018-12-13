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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;

public class GetResponsemanagementResponsesRequest {
    
	private String libraryId;
	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public GetResponsemanagementResponsesRequest withLibraryId(String libraryId) {
	    this.setLibraryId(libraryId);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetResponsemanagementResponsesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetResponsemanagementResponsesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetResponsemanagementResponsesRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		SUBSTITUTIONSSCHEMA("substitutionsSchema");

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

    public GetResponsemanagementResponsesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'libraryId' is set
        if (this.libraryId == null) {
            throw new IllegalStateException("Missing the required parameter 'libraryId' when building request for GetResponsemanagementResponsesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/responsemanagement/responses")
                .withQueryParameters("libraryId", "", libraryId)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("expand", "", expand)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String libraryId) {
	    return new Builder()
	            .withRequiredParams(libraryId);
	}
	

	public static class Builder {
		private final GetResponsemanagementResponsesRequest request;

		private Builder() {
			request = new GetResponsemanagementResponsesRequest();
		}

		
		public Builder withLibraryId(String libraryId) {
			request.setLibraryId(libraryId);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpand(expandValues expand) {
		    request.setExpand(expand.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String libraryId) {
			request.setLibraryId(libraryId);
			
			return this;
		}
		

		public GetResponsemanagementResponsesRequest build() {
            
            // verify the required parameter 'libraryId' is set
            if (request.libraryId == null) {
                throw new IllegalStateException("Missing the required parameter 'libraryId' when building request for GetResponsemanagementResponsesRequest.");
            }
            
			return request;
		}
	}
}
