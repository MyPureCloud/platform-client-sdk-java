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

public class PostScriptExportRequest {
    
	private String scriptId;
	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public PostScriptExportRequest withScriptId(String scriptId) {
	    this.setScriptId(scriptId);
	    return this;
	} 
	
	private ExportScriptRequest body;
	public ExportScriptRequest getBody() {
		return this.body;
	}

	public void setBody(ExportScriptRequest body) {
		this.body = body;
	}

	public PostScriptExportRequest withBody(ExportScriptRequest body) {
	    this.setBody(body);
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

    public PostScriptExportRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ExportScriptRequest> withHttpInfo() {
        
        // verify the required parameter 'scriptId' is set
        if (this.scriptId == null) {
            throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for PostScriptExportRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/scripts/{scriptId}/export")
                .withPathParameter("scriptId", scriptId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String scriptId) {
	    return new Builder()
	            .withRequiredParams(scriptId);
	}
	

	public static class Builder {
		private final PostScriptExportRequest request;

		private Builder() {
			request = new PostScriptExportRequest();
		}

		
		public Builder withScriptId(String scriptId) {
			request.setScriptId(scriptId);
			return this;
		}
		
		public Builder withBody(ExportScriptRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String scriptId) {
			request.setScriptId(scriptId);
			
			return this;
		}
		

		public PostScriptExportRequest build() {
            
            // verify the required parameter 'scriptId' is set
            if (request.scriptId == null) {
                throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for PostScriptExportRequest.");
            }
            
			return request;
		}
	}
}
