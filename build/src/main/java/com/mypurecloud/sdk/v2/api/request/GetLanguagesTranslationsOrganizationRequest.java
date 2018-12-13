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

public class GetLanguagesTranslationsOrganizationRequest {
    
	private String language;
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public GetLanguagesTranslationsOrganizationRequest withLanguage(String language) {
	    this.setLanguage(language);
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

    public GetLanguagesTranslationsOrganizationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'language' is set
        if (this.language == null) {
            throw new IllegalStateException("Missing the required parameter 'language' when building request for GetLanguagesTranslationsOrganizationRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languages/translations/organization")
                .withQueryParameters("language", "", language)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String language) {
	    return new Builder()
	            .withRequiredParams(language);
	}
	

	public static class Builder {
		private final GetLanguagesTranslationsOrganizationRequest request;

		private Builder() {
			request = new GetLanguagesTranslationsOrganizationRequest();
		}

		
		public Builder withLanguage(String language) {
			request.setLanguage(language);
			return this;
		}
		

		
		public Builder withRequiredParams(String language) {
			request.setLanguage(language);
			
			return this;
		}
		

		public GetLanguagesTranslationsOrganizationRequest build() {
            
            // verify the required parameter 'language' is set
            if (request.language == null) {
                throw new IllegalStateException("Missing the required parameter 'language' when building request for GetLanguagesTranslationsOrganizationRequest.");
            }
            
			return request;
		}
	}
}
