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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;

public class GetAuthorizationDivisionRequest {
    
	private String divisionId;
	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public GetAuthorizationDivisionRequest withDivisionId(String divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 
	
	private Boolean objectCount;
	public Boolean getObjectCount() {
		return this.objectCount;
	}

	public void setObjectCount(Boolean objectCount) {
		this.objectCount = objectCount;
	}

	public GetAuthorizationDivisionRequest withObjectCount(Boolean objectCount) {
	    this.setObjectCount(objectCount);
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

    public GetAuthorizationDivisionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'divisionId' is set
        if (this.divisionId == null) {
            throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for GetAuthorizationDivisionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/authorization/divisions/{divisionId}")
                .withPathParameter("divisionId", divisionId)
        
                .withQueryParameters("objectCount", "", objectCount)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String divisionId) {
	    return new Builder()
	            .withRequiredParams(divisionId);
	}
	

	public static class Builder {
		private final GetAuthorizationDivisionRequest request;

		private Builder() {
			request = new GetAuthorizationDivisionRequest();
		}

		
		public Builder withDivisionId(String divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}
		
		public Builder withObjectCount(Boolean objectCount) {
			request.setObjectCount(objectCount);
			return this;
		}
		

		
		public Builder withRequiredParams(String divisionId) {
			request.setDivisionId(divisionId);
			
			return this;
		}
		

		public GetAuthorizationDivisionRequest build() {
            
            // verify the required parameter 'divisionId' is set
            if (request.divisionId == null) {
                throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for GetAuthorizationDivisionRequest.");
            }
            
			return request;
		}
	}
}
