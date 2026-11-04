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
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2User;

public class PatchScimGroupRequest {

	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PatchScimGroupRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 

	private ScimV2PatchRequest body;
	public ScimV2PatchRequest getBody() {
		return this.body;
	}

	public void setBody(ScimV2PatchRequest body) {
		this.body = body;
	}

	public PatchScimGroupRequest withBody(ScimV2PatchRequest body) {
	    this.setBody(body);
	    return this;
	} 

	private String ifMatch;
	public String getIfMatch() {
		return this.ifMatch;
	}

	public void setIfMatch(String ifMatch) {
		this.ifMatch = ifMatch;
	}

	public PatchScimGroupRequest withIfMatch(String ifMatch) {
	    this.setIfMatch(ifMatch);
	    return this;
	} 

	private List<String> attributes;
	public List<String> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<String> attributes) {
		this.attributes = attributes;
	}

	public PatchScimGroupRequest withAttributes(List<String> attributes) {
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

	public PatchScimGroupRequest withExcludedAttributes(List<String> excludedAttributes) {
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

    public PatchScimGroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScimV2PatchRequest> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchScimGroupRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchScimGroupRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/scim/groups/{groupId}")
                .withPathParameter("groupId", groupId)
        

                .withQueryParameters("attributes", "csv", attributes)
        

                .withQueryParameters("excludedAttributes", "csv", excludedAttributes)
        
                .withHeaderParameter("If-Match", ifMatch)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/scim+json", "application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String groupId, ScimV2PatchRequest body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}


	public static class Builder {
		private final PatchScimGroupRequest request;

		private Builder() {
			request = new PatchScimGroupRequest();
		}


		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}

		public Builder withBody(ScimV2PatchRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withIfMatch(String ifMatch) {
			request.setIfMatch(ifMatch);
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



		public Builder withRequiredParams(String groupId, ScimV2PatchRequest body) {
			request.setGroupId(groupId);
			request.setBody(body);

			return this;
		}


		public PatchScimGroupRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchScimGroupRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchScimGroupRequest.");
            }
            
			return request;
		}
	}
}
