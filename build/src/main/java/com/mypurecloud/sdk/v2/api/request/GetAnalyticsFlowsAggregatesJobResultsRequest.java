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

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FlowActivityQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;

public class GetAnalyticsFlowsAggregatesJobResultsRequest {

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public GetAnalyticsFlowsAggregatesJobResultsRequest withJobId(String jobId) {
	    this.setJobId(jobId);
	    return this;
	} 

	private String cursor;
	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public GetAnalyticsFlowsAggregatesJobResultsRequest withCursor(String cursor) {
	    this.setCursor(cursor);
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

    public GetAnalyticsFlowsAggregatesJobResultsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetAnalyticsFlowsAggregatesJobResultsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/flows/aggregates/jobs/{jobId}/results")
                .withPathParameter("jobId", jobId)
        

                .withQueryParameters("cursor", "", cursor)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String jobId) {
	    return new Builder()
	            .withRequiredParams(jobId);
	}


	public static class Builder {
		private final GetAnalyticsFlowsAggregatesJobResultsRequest request;

		private Builder() {
			request = new GetAnalyticsFlowsAggregatesJobResultsRequest();
		}


		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}

		public Builder withCursor(String cursor) {
			request.setCursor(cursor);
			return this;
		}



		public Builder withRequiredParams(String jobId) {
			request.setJobId(jobId);

			return this;
		}


		public GetAnalyticsFlowsAggregatesJobResultsRequest build() {
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetAnalyticsFlowsAggregatesJobResultsRequest.");
            }
            
			return request;
		}
	}
}
