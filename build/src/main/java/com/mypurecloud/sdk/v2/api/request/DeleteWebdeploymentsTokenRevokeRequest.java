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
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.SignedData;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentActiveConfigurationOnDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeploymentsAuthorizationResponse;
import com.mypurecloud.sdk.v2.model.WebDeploymentsOAuthExchangeRequest;
import com.mypurecloud.sdk.v2.model.WebDeploymentsRefreshJWTRequest;

public class DeleteWebdeploymentsTokenRevokeRequest {

	private String xJourneySessionId;
	public String getXJourneySessionId() {
		return this.xJourneySessionId;
	}

	public void setXJourneySessionId(String xJourneySessionId) {
		this.xJourneySessionId = xJourneySessionId;
	}

	public DeleteWebdeploymentsTokenRevokeRequest withXJourneySessionId(String xJourneySessionId) {
	    this.setXJourneySessionId(xJourneySessionId);
	    return this;
	} 

	private String xJourneySessionType;
	public String getXJourneySessionType() {
		return this.xJourneySessionType;
	}

	public void setXJourneySessionType(String xJourneySessionType) {
		this.xJourneySessionType = xJourneySessionType;
	}

	public DeleteWebdeploymentsTokenRevokeRequest withXJourneySessionType(String xJourneySessionType) {
	    this.setXJourneySessionType(xJourneySessionType);
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

    public DeleteWebdeploymentsTokenRevokeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/webdeployments/token/revoke")
                .withHeaderParameter("X-Journey-Session-Id", xJourneySessionId)
        
                .withHeaderParameter("X-Journey-Session-Type", xJourneySessionType)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}



	public static class Builder {
		private final DeleteWebdeploymentsTokenRevokeRequest request;

		private Builder() {
			request = new DeleteWebdeploymentsTokenRevokeRequest();
		}


		public Builder withXJourneySessionId(String xJourneySessionId) {
			request.setXJourneySessionId(xJourneySessionId);
			return this;
		}

		public Builder withXJourneySessionType(String xJourneySessionType) {
			request.setXJourneySessionType(xJourneySessionType);
			return this;
		}




		public DeleteWebdeploymentsTokenRevokeRequest build() {
            
			return request;
		}
	}
}
