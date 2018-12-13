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
import com.mypurecloud.sdk.v2.model.GeolocationSettings;
import com.mypurecloud.sdk.v2.model.Geolocation;

public class PatchGeolocationsSettingsRequest {
    
	private GeolocationSettings body;
	public GeolocationSettings getBody() {
		return this.body;
	}

	public void setBody(GeolocationSettings body) {
		this.body = body;
	}

	public PatchGeolocationsSettingsRequest withBody(GeolocationSettings body) {
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

    public PatchGeolocationsSettingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<GeolocationSettings> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchGeolocationsSettingsRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/geolocations/settings")
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

	
	public static Builder builder(GeolocationSettings body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PatchGeolocationsSettingsRequest request;

		private Builder() {
			request = new PatchGeolocationsSettingsRequest();
		}

		
		public Builder withBody(GeolocationSettings body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(GeolocationSettings body) {
			request.setBody(body);
			
			return this;
		}
		

		public PatchGeolocationsSettingsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchGeolocationsSettingsRequest.");
            }
            
			return request;
		}
	}
}
