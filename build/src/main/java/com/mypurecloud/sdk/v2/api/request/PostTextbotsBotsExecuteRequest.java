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

public class PostTextbotsBotsExecuteRequest {
    
	private PostTextRequest postTextRequest;
	public PostTextRequest getPostTextRequest() {
		return this.postTextRequest;
	}

	public void setPostTextRequest(PostTextRequest postTextRequest) {
		this.postTextRequest = postTextRequest;
	}

	public PostTextbotsBotsExecuteRequest withPostTextRequest(PostTextRequest postTextRequest) {
	    this.setPostTextRequest(postTextRequest);
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

    public PostTextbotsBotsExecuteRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PostTextRequest> withHttpInfo() {
        
        // verify the required parameter 'postTextRequest' is set
        if (this.postTextRequest == null) {
            throw new IllegalStateException("Missing the required parameter 'postTextRequest' when building request for PostTextbotsBotsExecuteRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/textbots/bots/execute")
                .withBody(postTextRequest)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(PostTextRequest postTextRequest) {
	    return new Builder()
	            .withRequiredParams(postTextRequest);
	}
	

	public static class Builder {
		private final PostTextbotsBotsExecuteRequest request;

		private Builder() {
			request = new PostTextbotsBotsExecuteRequest();
		}

		
		public Builder withPostTextRequest(PostTextRequest postTextRequest) {
			request.setPostTextRequest(postTextRequest);
			return this;
		}
		

		
		public Builder withRequiredParams(PostTextRequest postTextRequest) {
			request.setPostTextRequest(postTextRequest);
			
			return this;
		}
		

		public PostTextbotsBotsExecuteRequest build() {
            
            // verify the required parameter 'postTextRequest' is set
            if (request.postTextRequest == null) {
                throw new IllegalStateException("Missing the required parameter 'postTextRequest' when building request for PostTextbotsBotsExecuteRequest.");
            }
            
			return request;
		}
	}
}
