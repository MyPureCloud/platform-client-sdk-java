package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;

public class GetArchitectDependencytrackingConsumedresourcesRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetArchitectDependencytrackingConsumedresourcesRequest withId(String id) {
	    this.setId(id);
	    return this;
	}

	private String version;
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public GetArchitectDependencytrackingConsumedresourcesRequest withVersion(String version) {
	    this.setVersion(version);
	    return this;
	}

	private String objectType;
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public GetArchitectDependencytrackingConsumedresourcesRequest withObjectType(String objectType) {
	    this.setObjectType(objectType);
	    return this;
	}

	private List<String> resourceType;
	public List<String> getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(List<String> resourceType) {
		this.resourceType = resourceType;
	}

	public GetArchitectDependencytrackingConsumedresourcesRequest withResourceType(List<String> resourceType) {
	    this.setResourceType(resourceType);
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

    public GetArchitectDependencytrackingConsumedresourcesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'id' is set
        if (this.id == null) {
            throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingConsumedresourcesRequest.");
        }
        
        // verify the required parameter 'version' is set
        if (this.version == null) {
            throw new IllegalStateException("Missing the required parameter 'version' when building request for GetArchitectDependencytrackingConsumedresourcesRequest.");
        }
        
        // verify the required parameter 'objectType' is set
        if (this.objectType == null) {
            throw new IllegalStateException("Missing the required parameter 'objectType' when building request for GetArchitectDependencytrackingConsumedresourcesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/architect/dependencytracking/consumedresources")
                .withQueryParameters("id", "", id)
        
                .withQueryParameters("version", "", version)
        
                .withQueryParameters("objectType", "", objectType)
        
                .withQueryParameters("resourceType", "multi", resourceType)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String id, String version, String objectType) {
	    return new Builder()
	            .withRequiredParams(id, version, objectType);
	}

	public static class Builder {
		private final GetArchitectDependencytrackingConsumedresourcesRequest request;

		private Builder() {
			request = new GetArchitectDependencytrackingConsumedresourcesRequest();
		}

		public Builder withId(String id) {
			request.setId(id);
			return this;
		}
		public Builder withVersion(String version) {
			request.setVersion(version);
			return this;
		}
		public Builder withObjectType(String objectType) {
			request.setObjectType(objectType);
			return this;
		}
		public Builder withResourceType(List<String> resourceType) {
			request.setResourceType(resourceType);
			return this;
		}

		public Builder withRequiredParams(String id, String version, String objectType) {
			request.setId(id);
			request.setVersion(version);
			request.setObjectType(objectType);
			return this;
		}


		public GetArchitectDependencytrackingConsumedresourcesRequest build() {
			return request;
		}
	}
}
