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

import com.mypurecloud.sdk.v2.model.BulkAddSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkRemoveSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkSourceIntentsResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntent;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentRequest;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentPatch;
import com.mypurecloud.sdk.v2.model.CustomerIntentResponse;
import com.mypurecloud.sdk.v2.model.CustomerSourceIntentListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntentsCategory;
import com.mypurecloud.sdk.v2.model.IntentsCategoryListing;
import com.mypurecloud.sdk.v2.model.IntentsCategoryPatch;

public class GetIntentsCustomerintentSourceintentsRequest {

	private String customerIntentId;
	public String getCustomerIntentId() {
		return this.customerIntentId;
	}

	public void setCustomerIntentId(String customerIntentId) {
		this.customerIntentId = customerIntentId;
	}

	public GetIntentsCustomerintentSourceintentsRequest withCustomerIntentId(String customerIntentId) {
	    this.setCustomerIntentId(customerIntentId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetIntentsCustomerintentSourceintentsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetIntentsCustomerintentSourceintentsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private String queryValue;
	public String getQueryValue() {
		return this.queryValue;
	}

	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
	}

	public GetIntentsCustomerintentSourceintentsRequest withQueryValue(String queryValue) {
	    this.setQueryValue(queryValue);
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

    public GetIntentsCustomerintentSourceintentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'customerIntentId' is set
        if (this.customerIntentId == null) {
            throw new IllegalStateException("Missing the required parameter 'customerIntentId' when building request for GetIntentsCustomerintentSourceintentsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/intents/customerintents/{customerIntentId}/sourceintents")
                .withPathParameter("customerIntentId", customerIntentId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("queryValue", "", queryValue)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String customerIntentId) {
	    return new Builder()
	            .withRequiredParams(customerIntentId);
	}


	public static class Builder {
		private final GetIntentsCustomerintentSourceintentsRequest request;

		private Builder() {
			request = new GetIntentsCustomerintentSourceintentsRequest();
		}


		public Builder withCustomerIntentId(String customerIntentId) {
			request.setCustomerIntentId(customerIntentId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withQueryValue(String queryValue) {
			request.setQueryValue(queryValue);
			return this;
		}



		public Builder withRequiredParams(String customerIntentId) {
			request.setCustomerIntentId(customerIntentId);

			return this;
		}


		public GetIntentsCustomerintentSourceintentsRequest build() {
            
            // verify the required parameter 'customerIntentId' is set
            if (request.customerIntentId == null) {
                throw new IllegalStateException("Missing the required parameter 'customerIntentId' when building request for GetIntentsCustomerintentSourceintentsRequest.");
            }
            
			return request;
		}
	}
}
