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
import com.mypurecloud.sdk.v2.model.DeploymentIdentityResolutionConfig;
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

public class DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest {

	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
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

    public DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest.");
        }
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/webdeployments/deployments/{deploymentId}/cobrowse/{sessionId}")
                .withPathParameter("deploymentId", deploymentId)
        
                .withPathParameter("sessionId", sessionId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String deploymentId, String sessionId) {
	    return new Builder()
	            .withRequiredParams(deploymentId, sessionId);
	}


	public static class Builder {
		private final DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest request;

		private Builder() {
			request = new DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest();
		}


		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}

		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}



		public Builder withRequiredParams(String deploymentId, String sessionId) {
			request.setDeploymentId(deploymentId);
			request.setSessionId(sessionId);

			return this;
		}


		public DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest.");
            }
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for DeleteWebdeploymentsDeploymentCobrowseSessionIdRequest.");
            }
            
			return request;
		}
	}
}
