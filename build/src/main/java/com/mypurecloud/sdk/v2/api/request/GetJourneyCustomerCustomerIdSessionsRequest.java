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

import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateRequest;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateResult;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;

public class GetJourneyCustomerCustomerIdSessionsRequest {

	private String customerIdType;
	public String getCustomerIdType() {
		return this.customerIdType;
	}

	public void setCustomerIdType(String customerIdType) {
		this.customerIdType = customerIdType;
	}

	public GetJourneyCustomerCustomerIdSessionsRequest withCustomerIdType(String customerIdType) {
	    this.setCustomerIdType(customerIdType);
	    return this;
	} 

	private String customerId;
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public GetJourneyCustomerCustomerIdSessionsRequest withCustomerId(String customerId) {
	    this.setCustomerId(customerId);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetJourneyCustomerCustomerIdSessionsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetJourneyCustomerCustomerIdSessionsRequest withAfter(String after) {
	    this.setAfter(after);
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

    public GetJourneyCustomerCustomerIdSessionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'customerIdType' is set
        if (this.customerIdType == null) {
            throw new IllegalStateException("Missing the required parameter 'customerIdType' when building request for GetJourneyCustomerCustomerIdSessionsRequest.");
        }
        
        // verify the required parameter 'customerId' is set
        if (this.customerId == null) {
            throw new IllegalStateException("Missing the required parameter 'customerId' when building request for GetJourneyCustomerCustomerIdSessionsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/customers/{customerIdType}/{customerId}/sessions")
                .withPathParameter("customerIdType", customerIdType)
        
                .withPathParameter("customerId", customerId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("after", "", after)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String customerIdType, String customerId) {
	    return new Builder()
	            .withRequiredParams(customerIdType, customerId);
	}


	public static class Builder {
		private final GetJourneyCustomerCustomerIdSessionsRequest request;

		private Builder() {
			request = new GetJourneyCustomerCustomerIdSessionsRequest();
		}


		public Builder withCustomerIdType(String customerIdType) {
			request.setCustomerIdType(customerIdType);
			return this;
		}

		public Builder withCustomerId(String customerId) {
			request.setCustomerId(customerId);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}



		public Builder withRequiredParams(String customerIdType, String customerId) {
			request.setCustomerIdType(customerIdType);
			request.setCustomerId(customerId);

			return this;
		}


		public GetJourneyCustomerCustomerIdSessionsRequest build() {
            
            // verify the required parameter 'customerIdType' is set
            if (request.customerIdType == null) {
                throw new IllegalStateException("Missing the required parameter 'customerIdType' when building request for GetJourneyCustomerCustomerIdSessionsRequest.");
            }
            
            // verify the required parameter 'customerId' is set
            if (request.customerId == null) {
                throw new IllegalStateException("Missing the required parameter 'customerId' when building request for GetJourneyCustomerCustomerIdSessionsRequest.");
            }
            
			return request;
		}
	}
}
