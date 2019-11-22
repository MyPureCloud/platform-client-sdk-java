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
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.LocationEntityListing;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationUpdateDefinition;
import com.mypurecloud.sdk.v2.model.LocationCreateDefinition;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;

public class GetLocationSublocationsRequest {
    
	private String locationId;
	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public GetLocationSublocationsRequest withLocationId(String locationId) {
	    this.setLocationId(locationId);
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

    public GetLocationSublocationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'locationId' is set
        if (this.locationId == null) {
            throw new IllegalStateException("Missing the required parameter 'locationId' when building request for GetLocationSublocationsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/locations/{locationId}/sublocations")
                .withPathParameter("locationId", locationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String locationId) {
	    return new Builder()
	            .withRequiredParams(locationId);
	}
	

	public static class Builder {
		private final GetLocationSublocationsRequest request;

		private Builder() {
			request = new GetLocationSublocationsRequest();
		}

		
		public Builder withLocationId(String locationId) {
			request.setLocationId(locationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String locationId) {
			request.setLocationId(locationId);
			
			return this;
		}
		

		public GetLocationSublocationsRequest build() {
            
            // verify the required parameter 'locationId' is set
            if (request.locationId == null) {
                throw new IllegalStateException("Missing the required parameter 'locationId' when building request for GetLocationSublocationsRequest.");
            }
            
			return request;
		}
	}
}
