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

import com.mypurecloud.sdk.v2.model.TextBotFlowTurnRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TextBotFlowTurnResponse;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchRequest;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchResponse;
import com.mypurecloud.sdk.v2.model.PostTextResponse;
import com.mypurecloud.sdk.v2.model.PostTextRequest;

public class PostTextbotsBotflowsSessionTurnsRequest {
    
	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public PostTextbotsBotflowsSessionTurnsRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 
	
	private TextBotFlowTurnRequest turnRequest;
	public TextBotFlowTurnRequest getTurnRequest() {
		return this.turnRequest;
	}

	public void setTurnRequest(TextBotFlowTurnRequest turnRequest) {
		this.turnRequest = turnRequest;
	}

	public PostTextbotsBotflowsSessionTurnsRequest withTurnRequest(TextBotFlowTurnRequest turnRequest) {
	    this.setTurnRequest(turnRequest);
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

    public PostTextbotsBotflowsSessionTurnsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TextBotFlowTurnRequest> withHttpInfo() {
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for PostTextbotsBotflowsSessionTurnsRequest.");
        }
        
        // verify the required parameter 'turnRequest' is set
        if (this.turnRequest == null) {
            throw new IllegalStateException("Missing the required parameter 'turnRequest' when building request for PostTextbotsBotflowsSessionTurnsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/textbots/botflows/sessions/{sessionId}/turns")
                .withPathParameter("sessionId", sessionId)
        
                .withBody(turnRequest)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String sessionId, TextBotFlowTurnRequest turnRequest) {
	    return new Builder()
	            .withRequiredParams(sessionId, turnRequest);
	}
	

	public static class Builder {
		private final PostTextbotsBotflowsSessionTurnsRequest request;

		private Builder() {
			request = new PostTextbotsBotflowsSessionTurnsRequest();
		}

		
		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}
		
		public Builder withTurnRequest(TextBotFlowTurnRequest turnRequest) {
			request.setTurnRequest(turnRequest);
			return this;
		}
		

		
		public Builder withRequiredParams(String sessionId, TextBotFlowTurnRequest turnRequest) {
			request.setSessionId(sessionId);
						request.setTurnRequest(turnRequest);
			
			return this;
		}
		

		public PostTextbotsBotflowsSessionTurnsRequest build() {
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for PostTextbotsBotflowsSessionTurnsRequest.");
            }
            
            // verify the required parameter 'turnRequest' is set
            if (request.turnRequest == null) {
                throw new IllegalStateException("Missing the required parameter 'turnRequest' when building request for PostTextbotsBotflowsSessionTurnsRequest.");
            }
            
			return request;
		}
	}
}
