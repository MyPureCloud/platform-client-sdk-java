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

import com.mypurecloud.sdk.v2.model.AgentGreeting;
import com.mypurecloud.sdk.v2.model.Callheader;
import com.mypurecloud.sdk.v2.model.Callmessage;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MediaRegions;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SelfAgentGreeting;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;

public class PutTelephonyAgentGreetingsRequest {

	private String agentId;
	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public PutTelephonyAgentGreetingsRequest withAgentId(String agentId) {
	    this.setAgentId(agentId);
	    return this;
	} 

	private AgentGreeting body;
	public AgentGreeting getBody() {
		return this.body;
	}

	public void setBody(AgentGreeting body) {
		this.body = body;
	}

	public PutTelephonyAgentGreetingsRequest withBody(AgentGreeting body) {
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

    public PutTelephonyAgentGreetingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AgentGreeting> withHttpInfo() {
        
        // verify the required parameter 'agentId' is set
        if (this.agentId == null) {
            throw new IllegalStateException("Missing the required parameter 'agentId' when building request for PutTelephonyAgentGreetingsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutTelephonyAgentGreetingsRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/telephony/agents/{agentId}/greetings")
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


	public static Builder builder(String agentId, AgentGreeting body) {
	    return new Builder()
	            .withRequiredParams(agentId, body);
	}


	public static class Builder {
		private final PutTelephonyAgentGreetingsRequest request;

		private Builder() {
			request = new PutTelephonyAgentGreetingsRequest();
		}


		public Builder withAgentId(String agentId) {
			request.setAgentId(agentId);
			return this;
		}

		public Builder withBody(AgentGreeting body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String agentId, AgentGreeting body) {
			request.setAgentId(agentId);
			request.setBody(body);

			return this;
		}


		public PutTelephonyAgentGreetingsRequest build() {
            
            // verify the required parameter 'agentId' is set
            if (request.agentId == null) {
                throw new IllegalStateException("Missing the required parameter 'agentId' when building request for PutTelephonyAgentGreetingsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutTelephonyAgentGreetingsRequest.");
            }
            
			return request;
		}
	}
}
