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

import com.mypurecloud.sdk.v2.model.DependencyCount;
import com.mypurecloud.sdk.v2.model.DependencyEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest {

	private String entityType;
	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest withEntityType(String entityType) {
	    this.setEntityType(entityType);
	    return this;
	} 

	public enum entityTypeValues { 
		INTEGRATION("Integration"),
		DATAACTION("DataAction"),
		CREDENTIAL("Credential");

		private String value;

		entityTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static entityTypeValues fromString(String key) {
			if (key == null) return null;

			for (entityTypeValues value : entityTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return entityTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

	}

	private String entityId;
	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest withEntityId(String entityId) {
	    this.setEntityId(entityId);
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

    public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'entityType' is set
        if (this.entityType == null) {
            throw new IllegalStateException("Missing the required parameter 'entityType' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest.");
        }
        
        // verify the required parameter 'entityId' is set
        if (this.entityId == null) {
            throw new IllegalStateException("Missing the required parameter 'entityId' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/dependencies/type/{entityType}/id/{entityId}/connections/requiredbycounts")
                .withPathParameter("entityType", entityType)
        
                .withPathParameter("entityId", entityId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String entityType, String entityId) {
	    return new Builder()
	            .withRequiredParams(entityType, entityId);
	}


	public static class Builder {
		private final GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest request;

		private Builder() {
			request = new GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest();
		}


		public Builder withEntityType(String entityType) {
			request.setEntityType(entityType);
			return this;
		}



		
		public Builder withEntityType(entityTypeValues entityType) {
		    request.setEntityType(entityType.toString());

		    return this;
		}

		public Builder withEntityId(String entityId) {
			request.setEntityId(entityId);
			return this;
		}



		public Builder withRequiredParams(String entityType, String entityId) {
			request.setEntityType(entityType);
			request.setEntityId(entityId);

			return this;
		}


		public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest build() {
            
            // verify the required parameter 'entityType' is set
            if (request.entityType == null) {
                throw new IllegalStateException("Missing the required parameter 'entityType' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest.");
            }
            
            // verify the required parameter 'entityId' is set
            if (request.entityId == null) {
                throw new IllegalStateException("Missing the required parameter 'entityId' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest.");
            }
            
			return request;
		}
	}
}
