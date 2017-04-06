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

public class DeleteArchitectPromptRequest {
	private String promptId;
	public String getPromptId() {
		return this.promptId;
	}

	public void setPromptId(String promptId) {
		this.promptId = promptId;
	}

	public DeleteArchitectPromptRequest withPromptId(String promptId) {
	    this.setPromptId(promptId);
	    return this;
	}

	private Boolean allResources;
	public Boolean getAllResources() {
		return this.allResources;
	}

	public void setAllResources(Boolean allResources) {
		this.allResources = allResources;
	}

	public DeleteArchitectPromptRequest withAllResources(Boolean allResources) {
	    this.setAllResources(allResources);
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

    public DeleteArchitectPromptRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'promptId' is set
        if (this.promptId == null) {
            throw new IllegalStateException("Missing the required parameter 'promptId' when building request for DeleteArchitectPromptRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/architect/prompts/{promptId}")
                .withPathParameter("promptId", promptId)
        
                .withQueryParameters("allResources", "", allResources)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String promptId) {
	    return new Builder()
	            .withRequiredParams(promptId);
	}

	public static class Builder {
		private final DeleteArchitectPromptRequest request;

		private Builder() {
			request = new DeleteArchitectPromptRequest();
		}

		public Builder withPromptId(String promptId) {
			request.setPromptId(promptId);
			return this;
		}
		public Builder withAllResources(Boolean allResources) {
			request.setAllResources(allResources);
			return this;
		}

		public Builder withRequiredParams(String promptId) {
			request.setPromptId(promptId);
			return this;
		}


		public DeleteArchitectPromptRequest build() {
            
            // verify the required parameter 'promptId' is set
            if (request.promptId == null) {
                throw new IllegalStateException("Missing the required parameter 'promptId' when building request for DeleteArchitectPromptRequest.");
            }
            
			return request;
		}
	}
}
