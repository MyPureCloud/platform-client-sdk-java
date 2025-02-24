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

import com.mypurecloud.sdk.v2.model.CreateWebChatConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
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
import com.mypurecloud.sdk.v2.model.WebChatTyping;

public class PostWebchatDeploymentsRequest {

	private WebChatDeployment body;
	public WebChatDeployment getBody() {
		return this.body;
	}

	public void setBody(WebChatDeployment body) {
		this.body = body;
	}

	public PostWebchatDeploymentsRequest withBody(WebChatDeployment body) {
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

    public PostWebchatDeploymentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebChatDeployment> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebchatDeploymentsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/webchat/deployments")
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


	public static Builder builder(WebChatDeployment body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostWebchatDeploymentsRequest request;

		private Builder() {
			request = new PostWebchatDeploymentsRequest();
		}


		public Builder withBody(WebChatDeployment body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(WebChatDeployment body) {
			request.setBody(body);

			return this;
		}


		public PostWebchatDeploymentsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebchatDeploymentsRequest.");
            }
            
			return request;
		}
	}
}
