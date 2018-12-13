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

public class GetBillingReportsBillableusageRequest {
    
	private Date startDate;
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public GetBillingReportsBillableusageRequest withStartDate(Date startDate) {
	    this.setStartDate(startDate);
	    return this;
	} 
	
	private Date endDate;
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public GetBillingReportsBillableusageRequest withEndDate(Date endDate) {
	    this.setEndDate(endDate);
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

    public GetBillingReportsBillableusageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'startDate' is set
        if (this.startDate == null) {
            throw new IllegalStateException("Missing the required parameter 'startDate' when building request for GetBillingReportsBillableusageRequest.");
        }
        
        // verify the required parameter 'endDate' is set
        if (this.endDate == null) {
            throw new IllegalStateException("Missing the required parameter 'endDate' when building request for GetBillingReportsBillableusageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/billing/reports/billableusage")
                .withQueryParameters("startDate", "", startDate)
        
                .withQueryParameters("endDate", "", endDate)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(Date startDate, Date endDate) {
	    return new Builder()
	            .withRequiredParams(startDate, endDate);
	}
	

	public static class Builder {
		private final GetBillingReportsBillableusageRequest request;

		private Builder() {
			request = new GetBillingReportsBillableusageRequest();
		}

		
		public Builder withStartDate(Date startDate) {
			request.setStartDate(startDate);
			return this;
		}
		
		public Builder withEndDate(Date endDate) {
			request.setEndDate(endDate);
			return this;
		}
		

		
		public Builder withRequiredParams(Date startDate, Date endDate) {
			request.setStartDate(startDate);
						request.setEndDate(endDate);
			
			return this;
		}
		

		public GetBillingReportsBillableusageRequest build() {
            
            // verify the required parameter 'startDate' is set
            if (request.startDate == null) {
                throw new IllegalStateException("Missing the required parameter 'startDate' when building request for GetBillingReportsBillableusageRequest.");
            }
            
            // verify the required parameter 'endDate' is set
            if (request.endDate == null) {
                throw new IllegalStateException("Missing the required parameter 'endDate' when building request for GetBillingReportsBillableusageRequest.");
            }
            
			return request;
		}
	}
}
