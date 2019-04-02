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
import com.mypurecloud.sdk.v2.model.WidgetDeployment;
import com.mypurecloud.sdk.v2.model.WidgetDeploymentEntityListing;

public class PutWidgetsDeploymentRequest {
    
	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public PutWidgetsDeploymentRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 
	
	private WidgetDeployment body;
	public WidgetDeployment getBody() {
		return this.body;
	}

	public void setBody(WidgetDeployment body) {
		this.body = body;
	}

	public PutWidgetsDeploymentRequest withBody(WidgetDeployment body) {
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

    public PutWidgetsDeploymentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WidgetDeployment> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWidgetsDeploymentRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWidgetsDeploymentRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/widgets/deployments/{deploymentId}")
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

	
	public static Builder builder(String deploymentId, WidgetDeployment body) {
	    return new Builder()
	            .withRequiredParams(deploymentId, body);
	}
	

	public static class Builder {
		private final PutWidgetsDeploymentRequest request;

		private Builder() {
			request = new PutWidgetsDeploymentRequest();
		}

		
		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}
		
		public Builder withBody(WidgetDeployment body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String deploymentId, WidgetDeployment body) {
			request.setDeploymentId(deploymentId);
						request.setBody(body);
			
			return this;
		}
		

		public PutWidgetsDeploymentRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for PutWidgetsDeploymentRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutWidgetsDeploymentRequest.");
            }
            
			return request;
		}
	}
}
