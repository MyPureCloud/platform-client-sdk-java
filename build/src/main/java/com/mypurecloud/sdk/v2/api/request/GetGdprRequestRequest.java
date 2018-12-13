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

public class GetGdprRequestRequest {
    
	private String requestId;
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetGdprRequestRequest withRequestId(String requestId) {
	    this.setRequestId(requestId);
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

    public GetGdprRequestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'requestId' is set
        if (this.requestId == null) {
            throw new IllegalStateException("Missing the required parameter 'requestId' when building request for GetGdprRequestRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gdpr/requests/{requestId}")
                .withPathParameter("requestId", requestId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String requestId) {
	    return new Builder()
	            .withRequiredParams(requestId);
	}
	

	public static class Builder {
		private final GetGdprRequestRequest request;

		private Builder() {
			request = new GetGdprRequestRequest();
		}

		
		public Builder withRequestId(String requestId) {
			request.setRequestId(requestId);
			return this;
		}
		

		
		public Builder withRequiredParams(String requestId) {
			request.setRequestId(requestId);
			
			return this;
		}
		

		public GetGdprRequestRequest build() {
            
            // verify the required parameter 'requestId' is set
            if (request.requestId == null) {
                throw new IllegalStateException("Missing the required parameter 'requestId' when building request for GetGdprRequestRequest.");
            }
            
			return request;
		}
	}
}
