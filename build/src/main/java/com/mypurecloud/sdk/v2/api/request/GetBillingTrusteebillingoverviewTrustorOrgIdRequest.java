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

import com.mypurecloud.sdk.v2.model.BillingUsageReport;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.TrusteeBillingOverview;

public class GetBillingTrusteebillingoverviewTrustorOrgIdRequest {
    
	private String trustorOrgId;
	public String getTrustorOrgId() {
		return this.trustorOrgId;
	}

	public void setTrustorOrgId(String trustorOrgId) {
		this.trustorOrgId = trustorOrgId;
	}

	public GetBillingTrusteebillingoverviewTrustorOrgIdRequest withTrustorOrgId(String trustorOrgId) {
	    this.setTrustorOrgId(trustorOrgId);
	    return this;
	} 
	
	private Integer billingPeriodIndex;
	public Integer getBillingPeriodIndex() {
		return this.billingPeriodIndex;
	}

	public void setBillingPeriodIndex(Integer billingPeriodIndex) {
		this.billingPeriodIndex = billingPeriodIndex;
	}

	public GetBillingTrusteebillingoverviewTrustorOrgIdRequest withBillingPeriodIndex(Integer billingPeriodIndex) {
	    this.setBillingPeriodIndex(billingPeriodIndex);
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

    public GetBillingTrusteebillingoverviewTrustorOrgIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'trustorOrgId' is set
        if (this.trustorOrgId == null) {
            throw new IllegalStateException("Missing the required parameter 'trustorOrgId' when building request for GetBillingTrusteebillingoverviewTrustorOrgIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/billing/trusteebillingoverview/{trustorOrgId}")
                .withPathParameter("trustorOrgId", trustorOrgId)
        
                .withQueryParameters("billingPeriodIndex", "", billingPeriodIndex)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String trustorOrgId) {
	    return new Builder()
	            .withRequiredParams(trustorOrgId);
	}
	

	public static class Builder {
		private final GetBillingTrusteebillingoverviewTrustorOrgIdRequest request;

		private Builder() {
			request = new GetBillingTrusteebillingoverviewTrustorOrgIdRequest();
		}

		
		public Builder withTrustorOrgId(String trustorOrgId) {
			request.setTrustorOrgId(trustorOrgId);
			return this;
		}
		
		public Builder withBillingPeriodIndex(Integer billingPeriodIndex) {
			request.setBillingPeriodIndex(billingPeriodIndex);
			return this;
		}
		

		
		public Builder withRequiredParams(String trustorOrgId) {
			request.setTrustorOrgId(trustorOrgId);
			
			return this;
		}
		

		public GetBillingTrusteebillingoverviewTrustorOrgIdRequest build() {
            
            // verify the required parameter 'trustorOrgId' is set
            if (request.trustorOrgId == null) {
                throw new IllegalStateException("Missing the required parameter 'trustorOrgId' when building request for GetBillingTrusteebillingoverviewTrustorOrgIdRequest.");
            }
            
			return request;
		}
	}
}
