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

public class GetArchitectDependencytrackingObjectRequest {
	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetArchitectDependencytrackingObjectRequest withId(String id) {
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

	public GetArchitectDependencytrackingObjectRequest withVersion(String version) {
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

	public GetArchitectDependencytrackingObjectRequest withObjectType(String objectType) {
	    this.setObjectType(objectType);
	    return this;
	}

	private Boolean consumedResources;
	public Boolean getConsumedResources() {
		return this.consumedResources;
	}

	public void setConsumedResources(Boolean consumedResources) {
		this.consumedResources = consumedResources;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumedResources(Boolean consumedResources) {
	    this.setConsumedResources(consumedResources);
	    return this;
	}

	private Boolean consumingResources;
	public Boolean getConsumingResources() {
		return this.consumingResources;
	}

	public void setConsumingResources(Boolean consumingResources) {
		this.consumingResources = consumingResources;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumingResources(Boolean consumingResources) {
	    this.setConsumingResources(consumingResources);
	    return this;
	}

	private List<String> consumedResourceType;
	public List<String> getConsumedResourceType() {
		return this.consumedResourceType;
	}

	public void setConsumedResourceType(List<String> consumedResourceType) {
		this.consumedResourceType = consumedResourceType;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumedResourceType(List<String> consumedResourceType) {
	    this.setConsumedResourceType(consumedResourceType);
	    return this;
	}

	private List<String> consumingResourceType;
	public List<String> getConsumingResourceType() {
		return this.consumingResourceType;
	}

	public void setConsumingResourceType(List<String> consumingResourceType) {
		this.consumingResourceType = consumingResourceType;
	}

	public GetArchitectDependencytrackingObjectRequest withConsumingResourceType(List<String> consumingResourceType) {
	    this.setConsumingResourceType(consumingResourceType);
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

    public GetArchitectDependencytrackingObjectRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'id' is set
        if (this.id == null) {
            throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingObjectRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/architect/dependencytracking/object")
                .withQueryParameters("id", "", id)
        
                .withQueryParameters("version", "", version)
        
                .withQueryParameters("objectType", "", objectType)
        
                .withQueryParameters("consumedResources", "", consumedResources)
        
                .withQueryParameters("consumingResources", "", consumingResources)
        
                .withQueryParameters("consumedResourceType", "multi", consumedResourceType)
        
                .withQueryParameters("consumingResourceType", "multi", consumingResourceType)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String id) {
	    return new Builder()
	            .withRequiredParams(id);
	}

	public static class Builder {
		private final GetArchitectDependencytrackingObjectRequest request;

		private Builder() {
			request = new GetArchitectDependencytrackingObjectRequest();
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
		public Builder withConsumedResources(Boolean consumedResources) {
			request.setConsumedResources(consumedResources);
			return this;
		}
		public Builder withConsumingResources(Boolean consumingResources) {
			request.setConsumingResources(consumingResources);
			return this;
		}
		public Builder withConsumedResourceType(List<String> consumedResourceType) {
			request.setConsumedResourceType(consumedResourceType);
			return this;
		}
		public Builder withConsumingResourceType(List<String> consumingResourceType) {
			request.setConsumingResourceType(consumingResourceType);
			return this;
		}

		public Builder withRequiredParams(String id) {
			request.setId(id);
			return this;
		}


		public GetArchitectDependencytrackingObjectRequest build() {
            
            // verify the required parameter 'id' is set
            if (request.id == null) {
                throw new IllegalStateException("Missing the required parameter 'id' when building request for GetArchitectDependencytrackingObjectRequest.");
            }
            
			return request;
		}
	}
}
