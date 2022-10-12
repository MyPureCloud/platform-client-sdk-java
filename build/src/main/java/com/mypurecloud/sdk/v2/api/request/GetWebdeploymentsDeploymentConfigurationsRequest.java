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
import com.mypurecloud.sdk.v2.model.ExpandableWebDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentActiveConfigurationOnDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;

public class GetWebdeploymentsDeploymentConfigurationsRequest {

	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public GetWebdeploymentsDeploymentConfigurationsRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetWebdeploymentsDeploymentConfigurationsRequest withType(String type) {
	    this.setType(type);
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

    public GetWebdeploymentsDeploymentConfigurationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetWebdeploymentsDeploymentConfigurationsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/webdeployments/deployments/{deploymentId}/configurations")
                .withPathParameter("deploymentId", deploymentId)
        

                .withQueryParameters("type", "", type)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String deploymentId) {
	    return new Builder()
	            .withRequiredParams(deploymentId);
	}


	public static class Builder {
		private final GetWebdeploymentsDeploymentConfigurationsRequest request;

		private Builder() {
			request = new GetWebdeploymentsDeploymentConfigurationsRequest();
		}


		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}

		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		public Builder withRequiredParams(String deploymentId) {
			request.setDeploymentId(deploymentId);

			return this;
		}


		public GetWebdeploymentsDeploymentConfigurationsRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetWebdeploymentsDeploymentConfigurationsRequest.");
            }
            
			return request;
		}
	}
}
