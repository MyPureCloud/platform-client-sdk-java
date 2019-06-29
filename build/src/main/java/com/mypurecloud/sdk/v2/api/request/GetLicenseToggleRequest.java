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
import com.mypurecloud.sdk.v2.model.LicenseDefinition;
import com.mypurecloud.sdk.v2.model.LicenseOrgToggle;
import com.mypurecloud.sdk.v2.model.LicenseUser;
import com.mypurecloud.sdk.v2.model.UserLicensesEntityListing;
import com.mypurecloud.sdk.v2.model.LicenseBatchAssignmentRequest;
import com.mypurecloud.sdk.v2.model.LicenseUpdateStatus;

public class GetLicenseToggleRequest {
    
	private String featureName;
	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public GetLicenseToggleRequest withFeatureName(String featureName) {
	    this.setFeatureName(featureName);
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

    public GetLicenseToggleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'featureName' is set
        if (this.featureName == null) {
            throw new IllegalStateException("Missing the required parameter 'featureName' when building request for GetLicenseToggleRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/license/toggles/{featureName}")
                .withPathParameter("featureName", featureName)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String featureName) {
	    return new Builder()
	            .withRequiredParams(featureName);
	}
	

	public static class Builder {
		private final GetLicenseToggleRequest request;

		private Builder() {
			request = new GetLicenseToggleRequest();
		}

		
		public Builder withFeatureName(String featureName) {
			request.setFeatureName(featureName);
			return this;
		}
		

		
		public Builder withRequiredParams(String featureName) {
			request.setFeatureName(featureName);
			
			return this;
		}
		

		public GetLicenseToggleRequest build() {
            
            // verify the required parameter 'featureName' is set
            if (request.featureName == null) {
                throw new IllegalStateException("Missing the required parameter 'featureName' when building request for GetLicenseToggleRequest.");
            }
            
			return request;
		}
	}
}
