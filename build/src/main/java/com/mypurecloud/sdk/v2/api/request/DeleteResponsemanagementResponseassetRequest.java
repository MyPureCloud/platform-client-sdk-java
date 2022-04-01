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

public class DeleteResponsemanagementResponseassetRequest {
    
	private String responseAssetId;
	public String getResponseAssetId() {
		return this.responseAssetId;
	}

	public void setResponseAssetId(String responseAssetId) {
		this.responseAssetId = responseAssetId;
	}

	public DeleteResponsemanagementResponseassetRequest withResponseAssetId(String responseAssetId) {
	    this.setResponseAssetId(responseAssetId);
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

    public DeleteResponsemanagementResponseassetRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'responseAssetId' is set
        if (this.responseAssetId == null) {
            throw new IllegalStateException("Missing the required parameter 'responseAssetId' when building request for DeleteResponsemanagementResponseassetRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/responsemanagement/responseassets/{responseAssetId}")
                .withPathParameter("responseAssetId", responseAssetId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String responseAssetId) {
	    return new Builder()
	            .withRequiredParams(responseAssetId);
	}
	

	public static class Builder {
		private final DeleteResponsemanagementResponseassetRequest request;

		private Builder() {
			request = new DeleteResponsemanagementResponseassetRequest();
		}

		
		public Builder withResponseAssetId(String responseAssetId) {
			request.setResponseAssetId(responseAssetId);
			return this;
		}
		

		
		public Builder withRequiredParams(String responseAssetId) {
			request.setResponseAssetId(responseAssetId);
			
			return this;
		}
		

		public DeleteResponsemanagementResponseassetRequest build() {
            
            // verify the required parameter 'responseAssetId' is set
            if (request.responseAssetId == null) {
                throw new IllegalStateException("Missing the required parameter 'responseAssetId' when building request for DeleteResponsemanagementResponseassetRequest.");
            }
            
			return request;
		}
	}
}
