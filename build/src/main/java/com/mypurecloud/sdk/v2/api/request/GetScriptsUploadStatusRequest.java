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

import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;
import com.mypurecloud.sdk.v2.model.ImportScriptStatusResponse;
import com.mypurecloud.sdk.v2.model.ExportScriptRequest;
import com.mypurecloud.sdk.v2.model.ExportScriptResponse;

public class GetScriptsUploadStatusRequest {
    
	private String uploadId;
	public String getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	public GetScriptsUploadStatusRequest withUploadId(String uploadId) {
	    this.setUploadId(uploadId);
	    return this;
	} 
	
	private Boolean longPoll;
	public Boolean getLongPoll() {
		return this.longPoll;
	}

	public void setLongPoll(Boolean longPoll) {
		this.longPoll = longPoll;
	}

	public GetScriptsUploadStatusRequest withLongPoll(Boolean longPoll) {
	    this.setLongPoll(longPoll);
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

    public GetScriptsUploadStatusRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'uploadId' is set
        if (this.uploadId == null) {
            throw new IllegalStateException("Missing the required parameter 'uploadId' when building request for GetScriptsUploadStatusRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/uploads/{uploadId}/status")
                .withPathParameter("uploadId", uploadId)
        
                .withQueryParameters("longPoll", "", longPoll)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String uploadId) {
	    return new Builder()
	            .withRequiredParams(uploadId);
	}
	

	public static class Builder {
		private final GetScriptsUploadStatusRequest request;

		private Builder() {
			request = new GetScriptsUploadStatusRequest();
		}

		
		public Builder withUploadId(String uploadId) {
			request.setUploadId(uploadId);
			return this;
		}
		
		public Builder withLongPoll(Boolean longPoll) {
			request.setLongPoll(longPoll);
			return this;
		}
		

		
		public Builder withRequiredParams(String uploadId) {
			request.setUploadId(uploadId);
			
			return this;
		}
		

		public GetScriptsUploadStatusRequest build() {
            
            // verify the required parameter 'uploadId' is set
            if (request.uploadId == null) {
                throw new IllegalStateException("Missing the required parameter 'uploadId' when building request for GetScriptsUploadStatusRequest.");
            }
            
			return request;
		}
	}
}
