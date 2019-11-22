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

public class PatchLocationRequest {
    
	private String locationId;
	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public PatchLocationRequest withLocationId(String locationId) {
	    this.setLocationId(locationId);
	    return this;
	} 
	
	private LocationUpdateDefinition body;
	public LocationUpdateDefinition getBody() {
		return this.body;
	}

	public void setBody(LocationUpdateDefinition body) {
		this.body = body;
	}

	public PatchLocationRequest withBody(LocationUpdateDefinition body) {
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

    public PatchLocationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LocationUpdateDefinition> withHttpInfo() {
        
        // verify the required parameter 'locationId' is set
        if (this.locationId == null) {
            throw new IllegalStateException("Missing the required parameter 'locationId' when building request for PatchLocationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchLocationRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/locations/{locationId}")
                .withPathParameter("locationId", locationId)
        
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

	
	public static Builder builder(String locationId, LocationUpdateDefinition body) {
	    return new Builder()
	            .withRequiredParams(locationId, body);
	}
	

	public static class Builder {
		private final PatchLocationRequest request;

		private Builder() {
			request = new PatchLocationRequest();
		}

		
		public Builder withLocationId(String locationId) {
			request.setLocationId(locationId);
			return this;
		}
		
		public Builder withBody(LocationUpdateDefinition body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String locationId, LocationUpdateDefinition body) {
			request.setLocationId(locationId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchLocationRequest build() {
            
            // verify the required parameter 'locationId' is set
            if (request.locationId == null) {
                throw new IllegalStateException("Missing the required parameter 'locationId' when building request for PatchLocationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchLocationRequest.");
            }
            
			return request;
		}
	}
}
