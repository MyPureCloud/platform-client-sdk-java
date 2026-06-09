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

import com.mypurecloud.sdk.v2.model.AgentGreeting;
import com.mypurecloud.sdk.v2.model.Callheader;
import com.mypurecloud.sdk.v2.model.Callmessage;
import com.mypurecloud.sdk.v2.model.CreateOrganizationLink;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.DisasterRecoveryAllRoutingRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MediaRegions;
import com.mypurecloud.sdk.v2.model.NumberRoutingListing;
import com.mypurecloud.sdk.v2.model.NumberRoutingRequest;
import com.mypurecloud.sdk.v2.model.NumberRoutingResetOrganizationRequest;
import com.mypurecloud.sdk.v2.model.OrganizationCallMetrics;
import com.mypurecloud.sdk.v2.model.OrganizationLink;
import com.mypurecloud.sdk.v2.model.OrganizationLinkApprovalRequest;
import com.mypurecloud.sdk.v2.model.OrganizationLinkResponse;
import com.mypurecloud.sdk.v2.model.RegionResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SelfAgentGreeting;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.TelephonySettings;

public class DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest {

	private String targetOrganizationId;
	public String getTargetOrganizationId() {
		return this.targetOrganizationId;
	}

	public void setTargetOrganizationId(String targetOrganizationId) {
		this.targetOrganizationId = targetOrganizationId;
	}

	public DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest withTargetOrganizationId(String targetOrganizationId) {
	    this.setTargetOrganizationId(targetOrganizationId);
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

    public DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'targetOrganizationId' is set
        if (this.targetOrganizationId == null) {
            throw new IllegalStateException("Missing the required parameter 'targetOrganizationId' when building request for DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/telephony/organization/link/{targetOrganizationId}")
                .withPathParameter("targetOrganizationId", targetOrganizationId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String targetOrganizationId) {
	    return new Builder()
	            .withRequiredParams(targetOrganizationId);
	}


	public static class Builder {
		private final DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest request;

		private Builder() {
			request = new DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest();
		}


		public Builder withTargetOrganizationId(String targetOrganizationId) {
			request.setTargetOrganizationId(targetOrganizationId);
			return this;
		}



		public Builder withRequiredParams(String targetOrganizationId) {
			request.setTargetOrganizationId(targetOrganizationId);

			return this;
		}


		public DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest build() {
            
            // verify the required parameter 'targetOrganizationId' is set
            if (request.targetOrganizationId == null) {
                throw new IllegalStateException("Missing the required parameter 'targetOrganizationId' when building request for DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest.");
            }
            
			return request;
		}
	}
}
