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
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentEntityListing;

public class PutWebdeploymentsDeploymentRequest {
    
	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public PutWebdeploymentsDeploymentRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 
	
	private WebDeployment deployment;
	public WebDeployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(WebDeployment deployment) {
		this.deployment = deployment;
	}

	public PutWebdeploymentsDeploymentRequest withDeployment(WebDeployment deployment) {
	    this.setDeployment(deployment);
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

    public PutWebdeploymentsDeploymentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebDeployment> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebdeploymentsDeploymentRequest.");
        }
        
        // verify the required parameter 'deployment' is set
        if (this.deployment == null) {
            throw new IllegalStateException("Missing the required parameter 'deployment' when building request for PutWebdeploymentsDeploymentRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/webdeployments/deployments/{deploymentId}")
                .withPathParameter("deploymentId", deploymentId)
        
                .withBody(deployment)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String deploymentId, WebDeployment deployment) {
	    return new Builder()
	            .withRequiredParams(deploymentId, deployment);
	}
	

	public static class Builder {
		private final PutWebdeploymentsDeploymentRequest request;

		private Builder() {
			request = new PutWebdeploymentsDeploymentRequest();
		}

		
		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}
		
		public Builder withDeployment(WebDeployment deployment) {
			request.setDeployment(deployment);
			return this;
		}
		

		
		public Builder withRequiredParams(String deploymentId, WebDeployment deployment) {
			request.setDeploymentId(deploymentId);
						request.setDeployment(deployment);
			
			return this;
		}
		

		public PutWebdeploymentsDeploymentRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWebdeploymentsDeploymentRequest.");
            }
            
            // verify the required parameter 'deployment' is set
            if (request.deployment == null) {
                throw new IllegalStateException("Missing the required parameter 'deployment' when building request for PutWebdeploymentsDeploymentRequest.");
            }
            
			return request;
		}
	}
}
