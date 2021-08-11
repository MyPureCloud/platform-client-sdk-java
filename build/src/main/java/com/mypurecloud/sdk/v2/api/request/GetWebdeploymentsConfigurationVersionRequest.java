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

public class GetWebdeploymentsConfigurationVersionRequest {
    
	private String configurationId;
	public String getConfigurationId() {
		return this.configurationId;
	}

	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	public GetWebdeploymentsConfigurationVersionRequest withConfigurationId(String configurationId) {
	    this.setConfigurationId(configurationId);
	    return this;
	} 
	
	private String versionId;
	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public GetWebdeploymentsConfigurationVersionRequest withVersionId(String versionId) {
	    this.setVersionId(versionId);
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

    public GetWebdeploymentsConfigurationVersionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'configurationId' is set
        if (this.configurationId == null) {
            throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for GetWebdeploymentsConfigurationVersionRequest.");
        }
        
        // verify the required parameter 'versionId' is set
        if (this.versionId == null) {
            throw new IllegalStateException("Missing the required parameter 'versionId' when building request for GetWebdeploymentsConfigurationVersionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/webdeployments/configurations/{configurationId}/versions/{versionId}")
                .withPathParameter("configurationId", configurationId)
        
                .withPathParameter("versionId", versionId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String configurationId, String versionId) {
	    return new Builder()
	            .withRequiredParams(configurationId, versionId);
	}
	

	public static class Builder {
		private final GetWebdeploymentsConfigurationVersionRequest request;

		private Builder() {
			request = new GetWebdeploymentsConfigurationVersionRequest();
		}

		
		public Builder withConfigurationId(String configurationId) {
			request.setConfigurationId(configurationId);
			return this;
		}
		
		public Builder withVersionId(String versionId) {
			request.setVersionId(versionId);
			return this;
		}
		

		
		public Builder withRequiredParams(String configurationId, String versionId) {
			request.setConfigurationId(configurationId);
						request.setVersionId(versionId);
			
			return this;
		}
		

		public GetWebdeploymentsConfigurationVersionRequest build() {
            
            // verify the required parameter 'configurationId' is set
            if (request.configurationId == null) {
                throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for GetWebdeploymentsConfigurationVersionRequest.");
            }
            
            // verify the required parameter 'versionId' is set
            if (request.versionId == null) {
                throw new IllegalStateException("Missing the required parameter 'versionId' when building request for GetWebdeploymentsConfigurationVersionRequest.");
            }
            
			return request;
		}
	}
}
