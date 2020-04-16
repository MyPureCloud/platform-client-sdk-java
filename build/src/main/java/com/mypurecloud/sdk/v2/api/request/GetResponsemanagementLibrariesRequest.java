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

public class GetResponsemanagementLibrariesRequest {
    
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetResponsemanagementLibrariesRequest withPageNumber(Integer pageNumber) {
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

	public GetResponsemanagementLibrariesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private String messagingTemplateFilter;
	public String getMessagingTemplateFilter() {
		return this.messagingTemplateFilter;
	}

	public void setMessagingTemplateFilter(String messagingTemplateFilter) {
		this.messagingTemplateFilter = messagingTemplateFilter;
	}

	public GetResponsemanagementLibrariesRequest withMessagingTemplateFilter(String messagingTemplateFilter) {
	    this.setMessagingTemplateFilter(messagingTemplateFilter);
	    return this;
	} 

	public enum messagingTemplateFilterValues { 
		WHATSAPP("whatsapp");

		private String value;

		messagingTemplateFilterValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static messagingTemplateFilterValues fromString(String key) {
			if (key == null) return null;

			for (messagingTemplateFilterValues value : messagingTemplateFilterValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return messagingTemplateFilterValues.values()[0];
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

    public GetResponsemanagementLibrariesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/responsemanagement/libraries")
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("messagingTemplateFilter", "", messagingTemplateFilter)
        
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
		private final GetResponsemanagementLibrariesRequest request;

		private Builder() {
			request = new GetResponsemanagementLibrariesRequest();
		}

		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withMessagingTemplateFilter(String messagingTemplateFilter) {
			request.setMessagingTemplateFilter(messagingTemplateFilter);
			return this;
		}

		public Builder withMessagingTemplateFilter(messagingTemplateFilterValues messagingTemplateFilter) {
		    request.setMessagingTemplateFilter(messagingTemplateFilter.toString());
		    return this;
		}
		

		

		public GetResponsemanagementLibrariesRequest build() {
            
			return request;
		}
	}
}
