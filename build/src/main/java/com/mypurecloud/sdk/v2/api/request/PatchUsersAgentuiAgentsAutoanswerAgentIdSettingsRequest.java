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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;

public class PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest {

	private String agentId;
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest withAgentId(String agentId) {
	    this.setAgentId(agentId);
	    return this;
	} 

	private AutoAnswerSettings body;
	public AutoAnswerSettings getBody() {
		return this.body;
	}

	public void setBody(AutoAnswerSettings body) {
		this.body = body;
	}

	public PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest withBody(AutoAnswerSettings body) {
	    this.setBody(body);
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

    public PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AutoAnswerSettings> withHttpInfo() {
        
        // verify the required parameter 'agentId' is set
        if (this.agentId == null) {
            throw new IllegalStateException("Missing the required parameter 'agentId' when building request for PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/users/agentui/agents/autoanswer/{agentId}/settings")
                .withPathParameter("agentId", agentId)
        
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String agentId, AutoAnswerSettings body) {
	    return new Builder()
	            .withRequiredParams(agentId, body);
	}


	public static class Builder {
		private final PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request;

		private Builder() {
			request = new PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest();
		}


		public Builder withAgentId(String agentId) {
			request.setAgentId(agentId);
			return this;
		}

		public Builder withBody(AutoAnswerSettings body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String agentId, AutoAnswerSettings body) {
			request.setAgentId(agentId);
			request.setBody(body);

			return this;
		}


		public PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest build() {
            
            // verify the required parameter 'agentId' is set
            if (request.agentId == null) {
                throw new IllegalStateException("Missing the required parameter 'agentId' when building request for PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest.");
            }
            
			return request;
		}
	}
}
