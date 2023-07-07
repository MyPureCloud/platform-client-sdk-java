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
import com.mypurecloud.sdk.v2.model.ExportScriptRequest;
import com.mypurecloud.sdk.v2.model.ExportScriptResponse;
import com.mypurecloud.sdk.v2.model.ImportScriptStatusResponse;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.PublishScriptRequestData;
import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;

public class GetScriptPagesRequest {

	private String scriptId;
	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public GetScriptPagesRequest withScriptId(String scriptId) {
	    this.setScriptId(scriptId);
	    return this;
	} 

	private String scriptDataVersion;
	public String getScriptDataVersion() {
		return this.scriptDataVersion;
	}

	public void setScriptDataVersion(String scriptDataVersion) {
		this.scriptDataVersion = scriptDataVersion;
	}

	public GetScriptPagesRequest withScriptDataVersion(String scriptDataVersion) {
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

    public GetScriptPagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scriptId' is set
        if (this.scriptId == null) {
            throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptPagesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/{scriptId}/pages")
                .withPathParameter("scriptId", scriptId)
        

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


	public static Builder builder(String scriptId) {
	    return new Builder()
	            .withRequiredParams(scriptId);
	}


	public static class Builder {
		private final GetScriptPagesRequest request;

		private Builder() {
			request = new GetScriptPagesRequest();
		}


		public Builder withScriptId(String scriptId) {
			request.setScriptId(scriptId);
			return this;
		}

		public Builder withScriptDataVersion(String scriptDataVersion) {
			request.setScriptDataVersion(scriptDataVersion);
			return this;
		}



		public Builder withRequiredParams(String scriptId) {
			request.setScriptId(scriptId);

			return this;
		}


		public GetScriptPagesRequest build() {
            
            // verify the required parameter 'scriptId' is set
            if (request.scriptId == null) {
                throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptPagesRequest.");
            }
            
			return request;
		}
	}
}
