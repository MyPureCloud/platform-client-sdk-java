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

import com.mypurecloud.sdk.v2.model.AgentChecklist;
import com.mypurecloud.sdk.v2.model.AgentChecklistListing;
import com.mypurecloud.sdk.v2.model.Assistant;
import com.mypurecloud.sdk.v2.model.AssistantListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AssistantQueueListing;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkAddRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryResponse;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class GetAssistantsAgentchecklistRequest {

	private String agentChecklistId;
	public String getAgentChecklistId() {
		return this.agentChecklistId;
	}

	public void setAgentChecklistId(String agentChecklistId) {
		this.agentChecklistId = agentChecklistId;
	}

	public GetAssistantsAgentchecklistRequest withAgentChecklistId(String agentChecklistId) {
	    this.setAgentChecklistId(agentChecklistId);
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

    public GetAssistantsAgentchecklistRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'agentChecklistId' is set
        if (this.agentChecklistId == null) {
            throw new IllegalStateException("Missing the required parameter 'agentChecklistId' when building request for GetAssistantsAgentchecklistRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/assistants/agentchecklists/{agentChecklistId}")
                .withPathParameter("agentChecklistId", agentChecklistId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String agentChecklistId) {
	    return new Builder()
	            .withRequiredParams(agentChecklistId);
	}


	public static class Builder {
		private final GetAssistantsAgentchecklistRequest request;

		private Builder() {
			request = new GetAssistantsAgentchecklistRequest();
		}


		public Builder withAgentChecklistId(String agentChecklistId) {
			request.setAgentChecklistId(agentChecklistId);
			return this;
		}



		public Builder withRequiredParams(String agentChecklistId) {
			request.setAgentChecklistId(agentChecklistId);

			return this;
		}


		public GetAssistantsAgentchecklistRequest build() {
            
            // verify the required parameter 'agentChecklistId' is set
            if (request.agentChecklistId == null) {
                throw new IllegalStateException("Missing the required parameter 'agentChecklistId' when building request for GetAssistantsAgentchecklistRequest.");
            }
            
			return request;
		}
	}
}
