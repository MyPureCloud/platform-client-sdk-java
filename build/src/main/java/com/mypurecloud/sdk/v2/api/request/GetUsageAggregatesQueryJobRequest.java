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

import com.mypurecloud.sdk.v2.model.ApiUsageClientQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageOrganizationQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.ApiUsageSimpleSearch;
import com.mypurecloud.sdk.v2.model.ClientPublicApiUsageQueryRequest;
import com.mypurecloud.sdk.v2.model.ClientPublicApiUsageResultsResponse;
import com.mypurecloud.sdk.v2.model.ClientUsageQueryResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationPublicApiUsageQueryRequest;
import com.mypurecloud.sdk.v2.model.OrganizationPublicApiUsageResultsResponse;
import com.mypurecloud.sdk.v2.model.OrganizationUsageQueryResponse;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;

public class GetUsageAggregatesQueryJobRequest {

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public GetUsageAggregatesQueryJobRequest withJobId(String jobId) {
	    this.setJobId(jobId);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetUsageAggregatesQueryJobRequest withPageSize(Integer pageSize) {
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

	public GetUsageAggregatesQueryJobRequest withAfter(String after) {
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

    public GetUsageAggregatesQueryJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetUsageAggregatesQueryJobRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/usage/aggregates/query/jobs/{jobId}")
                .withPathParameter("jobId", jobId)
        

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


	public static Builder builder(String jobId) {
	    return new Builder()
	            .withRequiredParams(jobId);
	}


	public static class Builder {
		private final GetUsageAggregatesQueryJobRequest request;

		private Builder() {
			request = new GetUsageAggregatesQueryJobRequest();
		}


		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}



		public Builder withRequiredParams(String jobId) {
			request.setJobId(jobId);

			return this;
		}


		public GetUsageAggregatesQueryJobRequest build() {
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetUsageAggregatesQueryJobRequest.");
            }
            
			return request;
		}
	}
}
