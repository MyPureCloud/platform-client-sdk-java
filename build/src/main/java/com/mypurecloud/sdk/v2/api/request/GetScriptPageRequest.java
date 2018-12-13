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

public class GetScriptPageRequest {
    
	private String scriptId;
	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public GetScriptPageRequest withScriptId(String scriptId) {
	    this.setScriptId(scriptId);
	    return this;
	} 
	
	private String pageId;
	public String getPageId() {
		return this.pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public GetScriptPageRequest withPageId(String pageId) {
	    this.setPageId(pageId);
	    return this;
	} 
	
	private String scriptDataVersion;
	public String getScriptDataVersion() {
		return this.scriptDataVersion;
	}

	public void setScriptDataVersion(String scriptDataVersion) {
		this.scriptDataVersion = scriptDataVersion;
	}

	public GetScriptPageRequest withScriptDataVersion(String scriptDataVersion) {
	    this.setScriptDataVersion(scriptDataVersion);
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

    public GetScriptPageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scriptId' is set
        if (this.scriptId == null) {
            throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptPageRequest.");
        }
        
        // verify the required parameter 'pageId' is set
        if (this.pageId == null) {
            throw new IllegalStateException("Missing the required parameter 'pageId' when building request for GetScriptPageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/{scriptId}/pages/{pageId}")
                .withPathParameter("scriptId", scriptId)
        
                .withPathParameter("pageId", pageId)
        
                .withQueryParameters("scriptDataVersion", "", scriptDataVersion)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String scriptId, String pageId) {
	    return new Builder()
	            .withRequiredParams(scriptId, pageId);
	}
	

	public static class Builder {
		private final GetScriptPageRequest request;

		private Builder() {
			request = new GetScriptPageRequest();
		}

		
		public Builder withScriptId(String scriptId) {
			request.setScriptId(scriptId);
			return this;
		}
		
		public Builder withPageId(String pageId) {
			request.setPageId(pageId);
			return this;
		}
		
		public Builder withScriptDataVersion(String scriptDataVersion) {
			request.setScriptDataVersion(scriptDataVersion);
			return this;
		}
		

		
		public Builder withRequiredParams(String scriptId, String pageId) {
			request.setScriptId(scriptId);
						request.setPageId(pageId);
			
			return this;
		}
		

		public GetScriptPageRequest build() {
            
            // verify the required parameter 'scriptId' is set
            if (request.scriptId == null) {
                throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptPageRequest.");
            }
            
            // verify the required parameter 'pageId' is set
            if (request.pageId == null) {
                throw new IllegalStateException("Missing the required parameter 'pageId' when building request for GetScriptPageRequest.");
            }
            
			return request;
		}
	}
}
