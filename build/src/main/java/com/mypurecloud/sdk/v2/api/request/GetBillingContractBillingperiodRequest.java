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

import com.mypurecloud.sdk.v2.model.BillingContract;
import com.mypurecloud.sdk.v2.model.BillingContractListing;
import com.mypurecloud.sdk.v2.model.BillingContractPeriodDetail;
import com.mypurecloud.sdk.v2.model.BillingInvoiceItemListing;
import com.mypurecloud.sdk.v2.model.BillingInvoiceListing;
import com.mypurecloud.sdk.v2.model.BillingUsageReport;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.TrusteeBillingOverview;
import com.mypurecloud.sdk.v2.model.UrlResponse;

public class GetBillingContractBillingperiodRequest {

	private String contractId;
	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public GetBillingContractBillingperiodRequest withContractId(String contractId) {
	    this.setContractId(contractId);
	    return this;
	} 

	private String billingPeriodId;
	public String getBillingPeriodId() {
		return this.billingPeriodId;
	}

	public void setBillingPeriodId(String billingPeriodId) {
		this.billingPeriodId = billingPeriodId;
	}

	public GetBillingContractBillingperiodRequest withBillingPeriodId(String billingPeriodId) {
	    this.setBillingPeriodId(billingPeriodId);
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

    public GetBillingContractBillingperiodRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'contractId' is set
        if (this.contractId == null) {
            throw new IllegalStateException("Missing the required parameter 'contractId' when building request for GetBillingContractBillingperiodRequest.");
        }
        
        // verify the required parameter 'billingPeriodId' is set
        if (this.billingPeriodId == null) {
            throw new IllegalStateException("Missing the required parameter 'billingPeriodId' when building request for GetBillingContractBillingperiodRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/billing/contracts/{contractId}/billingperiods/{billingPeriodId}")
                .withPathParameter("contractId", contractId)
        
                .withPathParameter("billingPeriodId", billingPeriodId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String contractId, String billingPeriodId) {
	    return new Builder()
	            .withRequiredParams(contractId, billingPeriodId);
	}


	public static class Builder {
		private final GetBillingContractBillingperiodRequest request;

		private Builder() {
			request = new GetBillingContractBillingperiodRequest();
		}


		public Builder withContractId(String contractId) {
			request.setContractId(contractId);
			return this;
		}

		public Builder withBillingPeriodId(String billingPeriodId) {
			request.setBillingPeriodId(billingPeriodId);
			return this;
		}



		public Builder withRequiredParams(String contractId, String billingPeriodId) {
			request.setContractId(contractId);
			request.setBillingPeriodId(billingPeriodId);

			return this;
		}


		public GetBillingContractBillingperiodRequest build() {
            
            // verify the required parameter 'contractId' is set
            if (request.contractId == null) {
                throw new IllegalStateException("Missing the required parameter 'contractId' when building request for GetBillingContractBillingperiodRequest.");
            }
            
            // verify the required parameter 'billingPeriodId' is set
            if (request.billingPeriodId == null) {
                throw new IllegalStateException("Missing the required parameter 'billingPeriodId' when building request for GetBillingContractBillingperiodRequest.");
            }
            
			return request;
		}
	}
}
