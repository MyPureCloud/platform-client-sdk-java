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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequest;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequestEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfoEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.WebChatSettings;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationRequest;

public class PutWebchatDeploymentRequest {
    
	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public PutWebchatDeploymentRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 
	
	private WebChatDeployment body;
	public WebChatDeployment getBody() {
		return this.body;
	}

	public void setBody(WebChatDeployment body) {
		this.body = body;
	}

	public PutWebchatDeploymentRequest withBody(WebChatDeployment body) {
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

    public PutWebchatDeploymentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebChatDeployment> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebchatDeploymentRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWebchatDeploymentRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/webchat/deployments/{deploymentId}")
                .withPathParameter("deploymentId", deploymentId)
        
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

	
	public static Builder builder(String deploymentId, WebChatDeployment body) {
	    return new Builder()
	            .withRequiredParams(deploymentId, body);
	}
	

	public static class Builder {
		private final PutWebchatDeploymentRequest request;

		private Builder() {
			request = new PutWebchatDeploymentRequest();
		}

		
		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}
		
		public Builder withBody(WebChatDeployment body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String deploymentId, WebChatDeployment body) {
			request.setDeploymentId(deploymentId);
						request.setBody(body);
			
			return this;
		}
		

		public PutWebchatDeploymentRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebchatDeploymentRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWebchatDeploymentRequest.");
            }
            
			return request;
		}
	}
}
