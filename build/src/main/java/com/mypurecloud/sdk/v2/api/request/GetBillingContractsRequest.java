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

public class GetBillingContractsRequest {

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetBillingContractsRequest withBefore(String before) {
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

	public GetBillingContractsRequest withAfter(String after) {
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

	public GetBillingContractsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private LocalDate dateStart;
	public LocalDate getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public GetBillingContractsRequest withDateStart(LocalDate dateStart) {
	    this.setDateStart(dateStart);
	    return this;
	} 

	private LocalDate dateEnd;
	public LocalDate getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	public GetBillingContractsRequest withDateEnd(LocalDate dateEnd) {
	    this.setDateEnd(dateEnd);
	    return this;
	} 

	private String status;
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GetBillingContractsRequest withStatus(String status) {
	    this.setStatus(status);
	    return this;
	} 

	public enum statusValues { 
		ACTIVE("Active"),
		INACTIVE("Inactive");

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

	private String externalNumber;
	public String getExternalNumber() {
		return this.externalNumber;
	}

	public void setExternalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
	}

	public GetBillingContractsRequest withExternalNumber(String externalNumber) {
	    this.setExternalNumber(externalNumber);
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

    public GetBillingContractsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/billing/contracts")

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("dateStart", "", dateStart)
        

                .withQueryParameters("dateEnd", "", dateEnd)
        

                .withQueryParameters("status", "", status)
        

                .withQueryParameters("externalNumber", "", externalNumber)
        
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
		private final GetBillingContractsRequest request;

		private Builder() {
			request = new GetBillingContractsRequest();
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

		public Builder withDateStart(LocalDate dateStart) {
			request.setDateStart(dateStart);
			return this;
		}

		public Builder withDateEnd(LocalDate dateEnd) {
			request.setDateEnd(dateEnd);
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

		public Builder withExternalNumber(String externalNumber) {
			request.setExternalNumber(externalNumber);
			return this;
		}




		public GetBillingContractsRequest build() {
            
			return request;
		}
	}
}
