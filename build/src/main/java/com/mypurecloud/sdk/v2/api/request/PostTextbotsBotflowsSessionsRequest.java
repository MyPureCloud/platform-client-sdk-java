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

public class PostTextbotsBotflowsSessionsRequest {
    
	private TextBotFlowLaunchRequest launchRequest;
	public TextBotFlowLaunchRequest getLaunchRequest() {
		return this.launchRequest;
	}

	public void setLaunchRequest(TextBotFlowLaunchRequest launchRequest) {
		this.launchRequest = launchRequest;
	}

	public PostTextbotsBotflowsSessionsRequest withLaunchRequest(TextBotFlowLaunchRequest launchRequest) {
	    this.setLaunchRequest(launchRequest);
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

    public PostTextbotsBotflowsSessionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TextBotFlowLaunchRequest> withHttpInfo() {
        
        // verify the required parameter 'launchRequest' is set
        if (this.launchRequest == null) {
            throw new IllegalStateException("Missing the required parameter 'launchRequest' when building request for PostTextbotsBotflowsSessionsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/textbots/botflows/sessions")
                .withBody(launchRequest)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(TextBotFlowLaunchRequest launchRequest) {
	    return new Builder()
	            .withRequiredParams(launchRequest);
	}
	

	public static class Builder {
		private final PostTextbotsBotflowsSessionsRequest request;

		private Builder() {
			request = new PostTextbotsBotflowsSessionsRequest();
		}

		
		public Builder withLaunchRequest(TextBotFlowLaunchRequest launchRequest) {
			request.setLaunchRequest(launchRequest);
			return this;
		}
		

		
		public Builder withRequiredParams(TextBotFlowLaunchRequest launchRequest) {
			request.setLaunchRequest(launchRequest);
			
			return this;
		}
		

		public PostTextbotsBotflowsSessionsRequest build() {
            
            // verify the required parameter 'launchRequest' is set
            if (request.launchRequest == null) {
                throw new IllegalStateException("Missing the required parameter 'launchRequest' when building request for PostTextbotsBotflowsSessionsRequest.");
            }
            
			return request;
		}
	}
}
