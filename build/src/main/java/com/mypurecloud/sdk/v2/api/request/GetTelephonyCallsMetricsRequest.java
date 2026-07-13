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

public class GetTelephonyCallsMetricsRequest {

	private String metricType;
	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

	public GetTelephonyCallsMetricsRequest withMetricType(String metricType) {
	    this.setMetricType(metricType);
	    return this;
	} 

	public enum metricTypeValues { 
		CLOUD("cloud"),
		PREMISES("premises");

		private String value;

		metricTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static metricTypeValues fromString(String key) {
			if (key == null) return null;

			for (metricTypeValues value : metricTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return metricTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

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

    public GetTelephonyCallsMetricsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/calls/metrics")

                .withQueryParameters("metricType", "", metricType)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}



	public static class Builder {
		private final GetTelephonyCallsMetricsRequest request;

		private Builder() {
			request = new GetTelephonyCallsMetricsRequest();
		}


		public Builder withMetricType(String metricType) {
			request.setMetricType(metricType);
			return this;
		}



		
		public Builder withMetricType(metricTypeValues metricType) {
		    request.setMetricType(metricType.toString());

		    return this;
		}




		public GetTelephonyCallsMetricsRequest build() {
            
			return request;
		}
	}
}
