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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.PresenceExpand;

public class GetPresencedefinitionRequest {
    
	private String presenceId;
	public String getPresenceId() {
		return this.presenceId;
	}

	public void setPresenceId(String presenceId) {
		this.presenceId = presenceId;
	}

	public GetPresencedefinitionRequest withPresenceId(String presenceId) {
	    this.setPresenceId(presenceId);
	    return this;
	} 
	
	private String localeCode;
	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public GetPresencedefinitionRequest withLocaleCode(String localeCode) {
	    this.setLocaleCode(localeCode);
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

    public GetPresencedefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'presenceId' is set
        if (this.presenceId == null) {
            throw new IllegalStateException("Missing the required parameter 'presenceId' when building request for GetPresencedefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/presencedefinitions/{presenceId}")
                .withPathParameter("presenceId", presenceId)
        
                .withQueryParameters("localeCode", "", localeCode)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String presenceId) {
	    return new Builder()
	            .withRequiredParams(presenceId);
	}
	

	public static class Builder {
		private final GetPresencedefinitionRequest request;

		private Builder() {
			request = new GetPresencedefinitionRequest();
		}

		
		public Builder withPresenceId(String presenceId) {
			request.setPresenceId(presenceId);
			return this;
		}
		
		public Builder withLocaleCode(String localeCode) {
			request.setLocaleCode(localeCode);
			return this;
		}
		

		
		public Builder withRequiredParams(String presenceId) {
			request.setPresenceId(presenceId);
			
			return this;
		}
		

		public GetPresencedefinitionRequest build() {
            
            // verify the required parameter 'presenceId' is set
            if (request.presenceId == null) {
                throw new IllegalStateException("Missing the required parameter 'presenceId' when building request for GetPresencedefinitionRequest.");
            }
            
			return request;
		}
	}
}
