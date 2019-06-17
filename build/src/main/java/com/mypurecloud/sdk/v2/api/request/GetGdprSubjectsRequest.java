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
import com.mypurecloud.sdk.v2.model.GDPRRequest;
import com.mypurecloud.sdk.v2.model.GDPRRequestEntityListing;
import com.mypurecloud.sdk.v2.model.GDPRSubjectEntityListing;

public class GetGdprSubjectsRequest {
    
	private String searchType;
	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public GetGdprSubjectsRequest withSearchType(String searchType) {
	    this.setSearchType(searchType);
	    return this;
	} 

	public enum searchTypeValues { 
		NAME("NAME"), 
		ADDRESS("ADDRESS"), 
		PHONE("PHONE"), 
		EMAIL("EMAIL"), 
		TWITTER("TWITTER");

		private String value;

		searchTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static searchTypeValues fromString(String key) {
			if (key == null) return null;

			for (searchTypeValues value : searchTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return searchTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String searchValue;
	public String getSearchValue() {
		return this.searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public GetGdprSubjectsRequest withSearchValue(String searchValue) {
	    this.setSearchValue(searchValue);
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

    public GetGdprSubjectsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'searchType' is set
        if (this.searchType == null) {
            throw new IllegalStateException("Missing the required parameter 'searchType' when building request for GetGdprSubjectsRequest.");
        }
        
        // verify the required parameter 'searchValue' is set
        if (this.searchValue == null) {
            throw new IllegalStateException("Missing the required parameter 'searchValue' when building request for GetGdprSubjectsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gdpr/subjects")
                .withQueryParameters("searchType", "", searchType)
        
                .withQueryParameters("searchValue", "", searchValue)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String searchType, String searchValue) {
	    return new Builder()
	            .withRequiredParams(searchType, searchValue);
	}
	

	public static class Builder {
		private final GetGdprSubjectsRequest request;

		private Builder() {
			request = new GetGdprSubjectsRequest();
		}

		
		public Builder withSearchType(String searchType) {
			request.setSearchType(searchType);
			return this;
		}

		public Builder withSearchType(searchTypeValues searchType) {
		    request.setSearchType(searchType.toString());
		    return this;
		}
		
		public Builder withSearchValue(String searchValue) {
			request.setSearchValue(searchValue);
			return this;
		}
		

		
		public Builder withRequiredParams(String searchType, String searchValue) {
			request.setSearchType(searchType);
						request.setSearchValue(searchValue);
			
			return this;
		}
		

		public GetGdprSubjectsRequest build() {
            
            // verify the required parameter 'searchType' is set
            if (request.searchType == null) {
                throw new IllegalStateException("Missing the required parameter 'searchType' when building request for GetGdprSubjectsRequest.");
            }
            
            // verify the required parameter 'searchValue' is set
            if (request.searchValue == null) {
                throw new IllegalStateException("Missing the required parameter 'searchValue' when building request for GetGdprSubjectsRequest.");
            }
            
			return request;
		}
	}
}
