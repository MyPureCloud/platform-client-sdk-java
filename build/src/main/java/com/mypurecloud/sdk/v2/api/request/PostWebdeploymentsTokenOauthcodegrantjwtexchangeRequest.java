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

import com.mypurecloud.sdk.v2.model.CobrowseWebMessagingSession;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExpandableWebDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.SignedData;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentActiveConfigurationOnDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeploymentsAuthorizationResponse;
import com.mypurecloud.sdk.v2.model.WebDeploymentsOAuthExchangeRequest;
import com.mypurecloud.sdk.v2.model.WebDeploymentsRefreshJWTRequest;

public class PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest {

	private WebDeploymentsOAuthExchangeRequest body;
	public WebDeploymentsOAuthExchangeRequest getBody() {
		return this.body;
	}

	public void setBody(WebDeploymentsOAuthExchangeRequest body) {
		this.body = body;
	}

	public PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest withBody(WebDeploymentsOAuthExchangeRequest body) {
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

    public PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebDeploymentsOAuthExchangeRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/webdeployments/token/oauthcodegrantjwtexchange")
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(WebDeploymentsOAuthExchangeRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest request;

		private Builder() {
			request = new PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest();
		}


		public Builder withBody(WebDeploymentsOAuthExchangeRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(WebDeploymentsOAuthExchangeRequest body) {
			request.setBody(body);

			return this;
		}


		public PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebdeploymentsTokenOauthcodegrantjwtexchangeRequest.");
            }
            
			return request;
		}
	}
}
