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

public class GetScimSchemaRequest {
    
	private String schemaId;
	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public GetScimSchemaRequest withSchemaId(String schemaId) {
	    this.setSchemaId(schemaId);
	    return this;
	} 

	public enum schemaIdValues { 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_USER("urn:ietf:params:scim:schemas:core:2.0:User"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP("urn:ietf:params:scim:schemas:core:2.0:Group"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_SERVICEPROVIDERCONFIG("urn:ietf:params:scim:schemas:core:2.0:ServiceProviderConfig"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_RESOURCETYPE("urn:ietf:params:scim:schemas:core:2.0:ResourceType"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_SCHEMA("urn:ietf:params:scim:schemas:core:2.0:Schema"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_ENTERPRISE_2_0_USER("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_EXTENSION_GENESYS_PURECLOUD_2_0_USER("urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User");

		private String value;

		schemaIdValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static schemaIdValues fromString(String key) {
			if (key == null) return null;

			for (schemaIdValues value : schemaIdValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return schemaIdValues.values()[0];
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

    public GetScimSchemaRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'schemaId' is set
        if (this.schemaId == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for GetScimSchemaRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/schemas/{schemaId}")
                .withPathParameter("schemaId", schemaId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/scim+json", "application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String schemaId) {
	    return new Builder()
	            .withRequiredParams(schemaId);
	}
	

	public static class Builder {
		private final GetScimSchemaRequest request;

		private Builder() {
			request = new GetScimSchemaRequest();
		}

		
		public Builder withSchemaId(String schemaId) {
			request.setSchemaId(schemaId);
			return this;
		}

		public Builder withSchemaId(schemaIdValues schemaId) {
		    request.setSchemaId(schemaId.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String schemaId) {
			request.setSchemaId(schemaId);
			
			return this;
		}
		

		public GetScimSchemaRequest build() {
            
            // verify the required parameter 'schemaId' is set
            if (request.schemaId == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for GetScimSchemaRequest.");
            }
            
			return request;
		}
	}
}
