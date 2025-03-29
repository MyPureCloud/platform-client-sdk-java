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

import com.mypurecloud.sdk.v2.model.AutoAnswerSettings;
import com.mypurecloud.sdk.v2.model.EmailSettings;
import com.mypurecloud.sdk.v2.model.EmailThreadingSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;

public class DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest {

	private String agentId;
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest withAgentId(String agentId) {
	    this.setAgentId(agentId);
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

    public DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'agentId' is set
        if (this.agentId == null) {
            throw new IllegalStateException("Missing the required parameter 'agentId' when building request for DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/users/agentui/agents/autoanswer/{agentId}/settings")
                .withPathParameter("agentId", agentId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String agentId) {
	    return new Builder()
	            .withRequiredParams(agentId);
	}


	public static class Builder {
		private final DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request;

		private Builder() {
			request = new DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest();
		}


		public Builder withAgentId(String agentId) {
			request.setAgentId(agentId);
			return this;
		}



		public Builder withRequiredParams(String agentId) {
			request.setAgentId(agentId);

			return this;
		}


		public DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest build() {
            
            // verify the required parameter 'agentId' is set
            if (request.agentId == null) {
                throw new IllegalStateException("Missing the required parameter 'agentId' when building request for DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
            }
            
			return request;
		}
	}
}
