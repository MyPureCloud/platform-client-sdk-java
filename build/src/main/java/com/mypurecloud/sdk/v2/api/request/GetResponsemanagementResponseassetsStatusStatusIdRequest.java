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
import com.mypurecloud.sdk.v2.model.ResponseAsset;
import com.mypurecloud.sdk.v2.model.ResponseAssetStatus;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetSearchResults;
import com.mypurecloud.sdk.v2.model.CreateResponseAssetResponse;
import com.mypurecloud.sdk.v2.model.CreateResponseAssetRequest;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;
import com.mypurecloud.sdk.v2.model.ResponseAssetRequest;

public class GetResponsemanagementResponseassetsStatusStatusIdRequest {
    
	private String statusId;
	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public GetResponsemanagementResponseassetsStatusStatusIdRequest withStatusId(String statusId) {
	    this.setStatusId(statusId);
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

    public GetResponsemanagementResponseassetsStatusStatusIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'statusId' is set
        if (this.statusId == null) {
            throw new IllegalStateException("Missing the required parameter 'statusId' when building request for GetResponsemanagementResponseassetsStatusStatusIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/responsemanagement/responseassets/status/{statusId}")
                .withPathParameter("statusId", statusId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String statusId) {
	    return new Builder()
	            .withRequiredParams(statusId);
	}
	

	public static class Builder {
		private final GetResponsemanagementResponseassetsStatusStatusIdRequest request;

		private Builder() {
			request = new GetResponsemanagementResponseassetsStatusStatusIdRequest();
		}

		
		public Builder withStatusId(String statusId) {
			request.setStatusId(statusId);
			return this;
		}
		

		
		public Builder withRequiredParams(String statusId) {
			request.setStatusId(statusId);
			
			return this;
		}
		

		public GetResponsemanagementResponseassetsStatusStatusIdRequest build() {
            
            // verify the required parameter 'statusId' is set
            if (request.statusId == null) {
                throw new IllegalStateException("Missing the required parameter 'statusId' when building request for GetResponsemanagementResponseassetsStatusStatusIdRequest.");
            }
            
			return request;
		}
	}
}
