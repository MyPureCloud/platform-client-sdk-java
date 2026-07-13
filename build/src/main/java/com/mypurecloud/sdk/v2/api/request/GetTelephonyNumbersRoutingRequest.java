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

public class GetTelephonyNumbersRoutingRequest {

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetTelephonyNumbersRoutingRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetTelephonyNumbersRoutingRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetTelephonyNumbersRoutingRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String numberId;
	public String getNumberId() {
		return this.numberId;
	}

	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}

	public GetTelephonyNumbersRoutingRequest withNumberId(String numberId) {
	    this.setNumberId(numberId);
	    return this;
	} 

	private String activeRoutingOrganizationId;
	public String getActiveRoutingOrganizationId() {
		return this.activeRoutingOrganizationId;
	}

	public void setActiveRoutingOrganizationId(String activeRoutingOrganizationId) {
		this.activeRoutingOrganizationId = activeRoutingOrganizationId;
	}

	public GetTelephonyNumbersRoutingRequest withActiveRoutingOrganizationId(String activeRoutingOrganizationId) {
	    this.setActiveRoutingOrganizationId(activeRoutingOrganizationId);
	    return this;
	} 

	private String ownerOrganizationId;
	public String getOwnerOrganizationId() {
		return this.ownerOrganizationId;
	}

	public void setOwnerOrganizationId(String ownerOrganizationId) {
		this.ownerOrganizationId = ownerOrganizationId;
	}

	public GetTelephonyNumbersRoutingRequest withOwnerOrganizationId(String ownerOrganizationId) {
	    this.setOwnerOrganizationId(ownerOrganizationId);
	    return this;
	} 

	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetTelephonyNumbersRoutingRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		NORMAL("Normal"),
		REDIRECTED("Redirected"),
		PENDING("Pending");

		private String value;

		statusValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static statusValues fromString(String key) {
			if (key == null) return null;

			for (statusValues value : statusValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return statusValues.values()[0];
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

    public GetTelephonyNumbersRoutingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/numbers/routing")

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("numberId", "", numberId)
        

                .withQueryParameters("activeRoutingOrganizationId", "", activeRoutingOrganizationId)
        

                .withQueryParameters("ownerOrganizationId", "", ownerOrganizationId)
        

                .withQueryParameters("status", "", status)
        
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
		private final GetTelephonyNumbersRoutingRequest request;

		private Builder() {
			request = new GetTelephonyNumbersRoutingRequest();
		}


		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withNumberId(String numberId) {
			request.setNumberId(numberId);
			return this;
		}

		public Builder withActiveRoutingOrganizationId(String activeRoutingOrganizationId) {
			request.setActiveRoutingOrganizationId(activeRoutingOrganizationId);
			return this;
		}

		public Builder withOwnerOrganizationId(String ownerOrganizationId) {
			request.setOwnerOrganizationId(ownerOrganizationId);
			return this;
		}

		public Builder withStatus(String status) {
			request.setStatus(status);
			return this;
		}



		
		public Builder withStatus(statusValues status) {
		    request.setStatus(status.toString());

		    return this;
		}




		public GetTelephonyNumbersRoutingRequest build() {
            
			return request;
		}
	}
}
