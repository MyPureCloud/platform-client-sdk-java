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

public class PutWebdeploymentsDeploymentIdentityresolutionRequest {

	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public PutWebdeploymentsDeploymentIdentityresolutionRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 

	private DeploymentIdentityResolutionConfig body;
	public DeploymentIdentityResolutionConfig getBody() {
		return this.body;
	}

	public void setBody(DeploymentIdentityResolutionConfig body) {
		this.body = body;
	}

	public PutWebdeploymentsDeploymentIdentityresolutionRequest withBody(DeploymentIdentityResolutionConfig body) {
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

    public PutWebdeploymentsDeploymentIdentityresolutionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DeploymentIdentityResolutionConfig> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebdeploymentsDeploymentIdentityresolutionRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWebdeploymentsDeploymentIdentityresolutionRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/webdeployments/deployments/{deploymentId}/identityresolution")
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


	public static Builder builder(String deploymentId, DeploymentIdentityResolutionConfig body) {
	    return new Builder()
	            .withRequiredParams(deploymentId, body);
	}


	public static class Builder {
		private final PutWebdeploymentsDeploymentIdentityresolutionRequest request;

		private Builder() {
			request = new PutWebdeploymentsDeploymentIdentityresolutionRequest();
		}


		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}

		public Builder withBody(DeploymentIdentityResolutionConfig body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String deploymentId, DeploymentIdentityResolutionConfig body) {
			request.setDeploymentId(deploymentId);
			request.setBody(body);

			return this;
		}


		public PutWebdeploymentsDeploymentIdentityresolutionRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebdeploymentsDeploymentIdentityresolutionRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWebdeploymentsDeploymentIdentityresolutionRequest.");
            }
            
			return request;
		}
	}
}
