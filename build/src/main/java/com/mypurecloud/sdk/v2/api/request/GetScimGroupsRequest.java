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

public class GetScimGroupsRequest {
    
	private Integer startIndex;
	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public GetScimGroupsRequest withStartIndex(Integer startIndex) {
	    this.setStartIndex(startIndex);
	    return this;
	} 
	
	private Integer count;
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public GetScimGroupsRequest withCount(Integer count) {
	    this.setCount(count);
	    return this;
	} 
	
	private List<String> attributes;
	public List<String> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public GetScimGroupsRequest withAttributes(List<String> attributes) {
	    this.setAttributes(attributes);
	    return this;
	} 

	public enum attributesValues { 
		ID("id"), 
		DISPLAYNAME("displayName"), 
		MEMBERS("members"), 
		EXTERNALID("externalId"), 
		META("meta"), 
		META_VERSION("meta.version"), 
		META_LASTMODIFIED("meta.lastModified"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_ID("urn:ietf:params:scim:schemas:core:2.0:Group:id"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META("urn:ietf:params:scim:schemas:core:2.0:Group:meta"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META_VERSION("urn:ietf:params:scim:schemas:core:2.0:Group:meta.version"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META_LASTMODIFIED("urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_DISPLAYNAME("urn:ietf:params:scim:schemas:core:2.0:Group:displayName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_MEMBERS("urn:ietf:params:scim:schemas:core:2.0:Group:members"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_EXTERNALID("urn:ietf:params:scim:schemas:core:2.0:Group:externalId");

		private String value;

		attributesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static attributesValues fromString(String key) {
			if (key == null) return null;

			for (attributesValues value : attributesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return attributesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> excludedAttributes;
	public List<String> getExcludedAttributes() {
		return this.excludedAttributes;
	}

	public void setExcludedAttributes(List<String> excludedAttributes) {
		this.excludedAttributes = excludedAttributes;
	}

	public GetScimGroupsRequest withExcludedAttributes(List<String> excludedAttributes) {
	    this.setExcludedAttributes(excludedAttributes);
	    return this;
	} 

	public enum excludedAttributesValues { 
		ID("id"), 
		DISPLAYNAME("displayName"), 
		MEMBERS("members"), 
		EXTERNALID("externalId"), 
		META("meta"), 
		META_VERSION("meta.version"), 
		META_LASTMODIFIED("meta.lastModified"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_ID("urn:ietf:params:scim:schemas:core:2.0:Group:id"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META("urn:ietf:params:scim:schemas:core:2.0:Group:meta"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META_VERSION("urn:ietf:params:scim:schemas:core:2.0:Group:meta.version"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_META_LASTMODIFIED("urn:ietf:params:scim:schemas:core:2.0:Group:meta.lastModified"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_DISPLAYNAME("urn:ietf:params:scim:schemas:core:2.0:Group:displayName"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_MEMBERS("urn:ietf:params:scim:schemas:core:2.0:Group:members"), 
		URN_IETF_PARAMS_SCIM_SCHEMAS_CORE_2_0_GROUP_EXTERNALID("urn:ietf:params:scim:schemas:core:2.0:Group:externalId");

		private String value;

		excludedAttributesValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static excludedAttributesValues fromString(String key) {
			if (key == null) return null;

			for (excludedAttributesValues value : excludedAttributesValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return excludedAttributesValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String filter;
	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public GetScimGroupsRequest withFilter(String filter) {
	    this.setFilter(filter);
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

    public GetScimGroupsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/scim/groups")
                .withQueryParameters("startIndex", "", startIndex)
        
                .withQueryParameters("count", "", count)
        
                .withQueryParameters("attributes", "multi", attributes)
        
                .withQueryParameters("excludedAttributes", "multi", excludedAttributes)
        
                .withQueryParameters("filter", "", filter)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/scim+json", "application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetScimGroupsRequest request;

		private Builder() {
			request = new GetScimGroupsRequest();
		}

		
		public Builder withStartIndex(Integer startIndex) {
			request.setStartIndex(startIndex);
			return this;
		}
		
		public Builder withCount(Integer count) {
			request.setCount(count);
			return this;
		}
		
		public Builder withAttributes(List<String> attributes) {
			request.setAttributes(attributes);
			return this;
		}

		public Builder withAttributesEnumValues(List<attributesValues> attributes) {
		    List<String> stringList = new ArrayList<>();
	      for (attributesValues e : attributes) {
	        stringList.add(e.toString());
	      }
	      request.setAttributes(stringList);
		    return this;
		}
		
		public Builder withExcludedAttributes(List<String> excludedAttributes) {
			request.setExcludedAttributes(excludedAttributes);
			return this;
		}

		public Builder withExcludedAttributesEnumValues(List<excludedAttributesValues> excludedAttributes) {
		    List<String> stringList = new ArrayList<>();
	      for (excludedAttributesValues e : excludedAttributes) {
	        stringList.add(e.toString());
	      }
	      request.setExcludedAttributes(stringList);
		    return this;
		}
		
		public Builder withFilter(String filter) {
			request.setFilter(filter);
			return this;
		}
		

		

		public GetScimGroupsRequest build() {
            
			return request;
		}
	}
}
