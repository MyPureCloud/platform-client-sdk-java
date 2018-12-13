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
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableTranslations;

public class DeleteLanguageRequest {
    
	private String languageId;
	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public DeleteLanguageRequest withLanguageId(String languageId) {
	    this.setLanguageId(languageId);
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

    public DeleteLanguageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'languageId' is set
        if (this.languageId == null) {
            throw new IllegalStateException("Missing the required parameter 'languageId' when building request for DeleteLanguageRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/languages/{languageId}")
                .withPathParameter("languageId", languageId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String languageId) {
	    return new Builder()
	            .withRequiredParams(languageId);
	}
	

	public static class Builder {
		private final DeleteLanguageRequest request;

		private Builder() {
			request = new DeleteLanguageRequest();
		}

		
		public Builder withLanguageId(String languageId) {
			request.setLanguageId(languageId);
			return this;
		}
		

		
		public Builder withRequiredParams(String languageId) {
			request.setLanguageId(languageId);
			
			return this;
		}
		

		public DeleteLanguageRequest build() {
            
            // verify the required parameter 'languageId' is set
            if (request.languageId == null) {
                throw new IllegalStateException("Missing the required parameter 'languageId' when building request for DeleteLanguageRequest.");
            }
            
			return request;
		}
	}
}
