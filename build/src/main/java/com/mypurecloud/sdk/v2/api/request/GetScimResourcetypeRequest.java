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

import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class GetScimResourcetypeRequest {
    
	private String resourceType;
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public GetScimResourcetypeRequest withResourceType(String resourceType) {
	    this.setResourceType(resourceType);
	    return this;
	} 

	public enum resourceTypeValues { 
		USER("User"), 
		GROUP("Group"), 
		SERVICEPROVIDERCONFIG("ServiceProviderConfig"), 
		RESOURCETYPE("ResourceType"), 
		SCHEMA("Schema");

		private String value;

		resourceTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static resourceTypeValues fromString(String key) {
			if (key == null) return null;

			for (resourceTypeValues value : resourceTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return resourceTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetScimResourcetypeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'resourceType' is set
        if (this.resourceType == null) {
            throw new IllegalStateException("Missing the required parameter 'resourceType' when building request for GetScimResourcetypeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/resourcetypes/{resourceType}")
                .withPathParameter("resourceType", resourceType)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/scim+json", "application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String resourceType) {
	    return new Builder()
	            .withRequiredParams(resourceType);
	}
	

	public static class Builder {
		private final GetScimResourcetypeRequest request;

		private Builder() {
			request = new GetScimResourcetypeRequest();
		}

		
		public Builder withResourceType(String resourceType) {
			request.setResourceType(resourceType);
			return this;
		}

		public Builder withResourceType(resourceTypeValues resourceType) {
		    request.setResourceType(resourceType.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String resourceType) {
			request.setResourceType(resourceType);
			
			return this;
		}
		

		public GetScimResourcetypeRequest build() {
            
            // verify the required parameter 'resourceType' is set
            if (request.resourceType == null) {
                throw new IllegalStateException("Missing the required parameter 'resourceType' when building request for GetScimResourcetypeRequest.");
            }
            
			return request;
		}
	}
}
