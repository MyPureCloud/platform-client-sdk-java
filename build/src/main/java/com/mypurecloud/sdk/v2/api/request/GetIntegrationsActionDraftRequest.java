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
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;

public class GetIntegrationsActionDraftRequest {
    
	private String actionId;
	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public GetIntegrationsActionDraftRequest withActionId(String actionId) {
	    this.setActionId(actionId);
	    return this;
	}

	
	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetIntegrationsActionDraftRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	}

	
	private Boolean includeConfig;
	public Boolean getIncludeConfig() {
		return this.includeConfig;
	}

	public void setIncludeConfig(Boolean includeConfig) {
		this.includeConfig = includeConfig;
	}

	public GetIntegrationsActionDraftRequest withIncludeConfig(Boolean includeConfig) {
	    this.setIncludeConfig(includeConfig);
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

    public GetIntegrationsActionDraftRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'actionId' is set
        if (this.actionId == null) {
            throw new IllegalStateException("Missing the required parameter 'actionId' when building request for GetIntegrationsActionDraftRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/actions/{actionId}/draft")
                .withPathParameter("actionId", actionId)
        
                .withQueryParameters("expand", "", expand)
        
                .withQueryParameters("includeConfig", "", includeConfig)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String actionId) {
	    return new Builder()
	            .withRequiredParams(actionId);
	}
	

	public static class Builder {
		private final GetIntegrationsActionDraftRequest request;

		private Builder() {
			request = new GetIntegrationsActionDraftRequest();
		}

		
		public Builder withActionId(String actionId) {
			request.setActionId(actionId);
			return this;
		}
		
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}
		
		public Builder withIncludeConfig(Boolean includeConfig) {
			request.setIncludeConfig(includeConfig);
			return this;
		}
		

		
		public Builder withRequiredParams(String actionId) {
			request.setActionId(actionId);
			
			return this;
		}
		


		public GetIntegrationsActionDraftRequest build() {
            
            // verify the required parameter 'actionId' is set
            if (request.actionId == null) {
                throw new IllegalStateException("Missing the required parameter 'actionId' when building request for GetIntegrationsActionDraftRequest.");
            }
            
			return request;
		}
	}
}
