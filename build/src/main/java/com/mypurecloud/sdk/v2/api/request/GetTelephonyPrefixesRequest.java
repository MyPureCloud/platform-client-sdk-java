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
import com.mypurecloud.sdk.v2.model.BulkPrefixesRequest;
import com.mypurecloud.sdk.v2.model.BulkPrefixesResponse;
import com.mypurecloud.sdk.v2.model.CallSimulationResult;
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
import com.mypurecloud.sdk.v2.model.PrefixListing;
import com.mypurecloud.sdk.v2.model.RegionResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SelfAgentGreeting;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.TelephonySettings;

public class GetTelephonyPrefixesRequest {

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetTelephonyPrefixesRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		ALLOW("Allow"),
		BLOCK("Block");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

	}

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetTelephonyPrefixesRequest withBefore(String before) {
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

	public GetTelephonyPrefixesRequest withAfter(String after) {
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

	public GetTelephonyPrefixesRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String prefix;
	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public GetTelephonyPrefixesRequest withPrefix(String prefix) {
	    this.setPrefix(prefix);
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

    public GetTelephonyPrefixesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'type' is set
        if (this.type == null) {
            throw new IllegalStateException("Missing the required parameter 'type' when building request for GetTelephonyPrefixesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/prefixes")

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("prefix", "", prefix)
        

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


	public static Builder builder(String type) {
	    return new Builder()
	            .withRequiredParams(type);
	}


	public static class Builder {
		private final GetTelephonyPrefixesRequest request;

		private Builder() {
			request = new GetTelephonyPrefixesRequest();
		}


		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		
		public Builder withType(typeValues type) {
		    request.setType(type.toString());

		    return this;
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

		public Builder withPrefix(String prefix) {
			request.setPrefix(prefix);
			return this;
		}



		public Builder withRequiredParams(String type) {
			request.setType(type);

			return this;
		}


		public GetTelephonyPrefixesRequest build() {
            
            // verify the required parameter 'type' is set
            if (request.type == null) {
                throw new IllegalStateException("Missing the required parameter 'type' when building request for GetTelephonyPrefixesRequest.");
            }
            
			return request;
		}
	}
}
