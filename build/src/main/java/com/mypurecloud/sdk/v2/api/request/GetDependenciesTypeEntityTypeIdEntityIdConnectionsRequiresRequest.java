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

public class GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest {

	private String entityType;
	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withEntityType(String entityType) {
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

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withEntityId(String entityId) {
	    this.setEntityId(entityId);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String beforeSourceType;
	public String getBeforeSourceType() {
		return this.beforeSourceType;
	}

	public void setBeforeSourceType(String beforeSourceType) {
		this.beforeSourceType = beforeSourceType;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withBeforeSourceType(String beforeSourceType) {
	    this.setBeforeSourceType(beforeSourceType);
	    return this;
	} 

	private String beforeSourceId;
	public String getBeforeSourceId() {
		return this.beforeSourceId;
	}

	public void setBeforeSourceId(String beforeSourceId) {
		this.beforeSourceId = beforeSourceId;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withBeforeSourceId(String beforeSourceId) {
	    this.setBeforeSourceId(beforeSourceId);
	    return this;
	} 

	private String afterSourceType;
	public String getAfterSourceType() {
		return this.afterSourceType;
	}

	public void setAfterSourceType(String afterSourceType) {
		this.afterSourceType = afterSourceType;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withAfterSourceType(String afterSourceType) {
	    this.setAfterSourceType(afterSourceType);
	    return this;
	} 

	private String afterSourceId;
	public String getAfterSourceId() {
		return this.afterSourceId;
	}

	public void setAfterSourceId(String afterSourceId) {
		this.afterSourceId = afterSourceId;
	}

	public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withAfterSourceId(String afterSourceId) {
	    this.setAfterSourceId(afterSourceId);
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

    public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'entityType' is set
        if (this.entityType == null) {
            throw new IllegalStateException("Missing the required parameter 'entityType' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest.");
        }
        
        // verify the required parameter 'entityId' is set
        if (this.entityId == null) {
            throw new IllegalStateException("Missing the required parameter 'entityId' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/dependencies/type/{entityType}/id/{entityId}/connections/requires")
                .withPathParameter("entityType", entityType)
        
                .withPathParameter("entityId", entityId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("beforeSourceType", "", beforeSourceType)
        

                .withQueryParameters("beforeSourceId", "", beforeSourceId)
        

                .withQueryParameters("afterSourceType", "", afterSourceType)
        

                .withQueryParameters("afterSourceId", "", afterSourceId)
        
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
		private final GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest request;

		private Builder() {
			request = new GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest();
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

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withBeforeSourceType(String beforeSourceType) {
			request.setBeforeSourceType(beforeSourceType);
			return this;
		}

		public Builder withBeforeSourceId(String beforeSourceId) {
			request.setBeforeSourceId(beforeSourceId);
			return this;
		}

		public Builder withAfterSourceType(String afterSourceType) {
			request.setAfterSourceType(afterSourceType);
			return this;
		}

		public Builder withAfterSourceId(String afterSourceId) {
			request.setAfterSourceId(afterSourceId);
			return this;
		}



		public Builder withRequiredParams(String entityType, String entityId) {
			request.setEntityType(entityType);
			request.setEntityId(entityId);

			return this;
		}


		public GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest build() {
            
            // verify the required parameter 'entityType' is set
            if (request.entityType == null) {
                throw new IllegalStateException("Missing the required parameter 'entityType' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest.");
            }
            
            // verify the required parameter 'entityId' is set
            if (request.entityId == null) {
                throw new IllegalStateException("Missing the required parameter 'entityId' when building request for GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest.");
            }
            
			return request;
		}
	}
}
