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
import com.mypurecloud.sdk.v2.model.AppFoundryListingCategory;
import com.mypurecloud.sdk.v2.model.PagedListingEntity;

public class GetAppfoundryPlatformNameCategoriesRequest {
    
	private String platformName;
	public String getPlatformName() {
		return this.platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public GetAppfoundryPlatformNameCategoriesRequest withPlatformName(String platformName) {
	    this.setPlatformName(platformName);
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

    public GetAppfoundryPlatformNameCategoriesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'platformName' is set
        if (this.platformName == null) {
            throw new IllegalStateException("Missing the required parameter 'platformName' when building request for GetAppfoundryPlatformNameCategoriesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/appfoundry/{platformName}/categories")
                .withPathParameter("platformName", platformName)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String platformName) {
	    return new Builder()
	            .withRequiredParams(platformName);
	}
	

	public static class Builder {
		private final GetAppfoundryPlatformNameCategoriesRequest request;

		private Builder() {
			request = new GetAppfoundryPlatformNameCategoriesRequest();
		}

		
		public Builder withPlatformName(String platformName) {
			request.setPlatformName(platformName);
			return this;
		}
		

		
		public Builder withRequiredParams(String platformName) {
			request.setPlatformName(platformName);
			
			return this;
		}
		

		public GetAppfoundryPlatformNameCategoriesRequest build() {
            
            // verify the required parameter 'platformName' is set
            if (request.platformName == null) {
                throw new IllegalStateException("Missing the required parameter 'platformName' when building request for GetAppfoundryPlatformNameCategoriesRequest.");
            }
            
			return request;
		}
	}
}
