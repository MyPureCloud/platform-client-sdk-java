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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;

public class GetUsageSimplesearchExecutionIdResultsRequest {

	private String executionId;
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public GetUsageSimplesearchExecutionIdResultsRequest withExecutionId(String executionId) {
	    this.setExecutionId(executionId);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetUsageSimplesearchExecutionIdResultsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetUsageSimplesearchExecutionIdResultsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetUsageSimplesearchExecutionIdResultsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'executionId' is set
        if (this.executionId == null) {
            throw new IllegalStateException("Missing the required parameter 'executionId' when building request for GetUsageSimplesearchExecutionIdResultsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/usage/simplesearch/{executionId}/results")
                .withPathParameter("executionId", executionId)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("pageSize", "", pageSize)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String executionId) {
	    return new Builder()
	            .withRequiredParams(executionId);
	}


	public static class Builder {
		private final GetUsageSimplesearchExecutionIdResultsRequest request;

		private Builder() {
			request = new GetUsageSimplesearchExecutionIdResultsRequest();
		}


		public Builder withExecutionId(String executionId) {
			request.setExecutionId(executionId);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}



		public Builder withRequiredParams(String executionId) {
			request.setExecutionId(executionId);

			return this;
		}


		public GetUsageSimplesearchExecutionIdResultsRequest build() {
            
            // verify the required parameter 'executionId' is set
            if (request.executionId == null) {
                throw new IllegalStateException("Missing the required parameter 'executionId' when building request for GetUsageSimplesearchExecutionIdResultsRequest.");
            }
            
			return request;
		}
	}
}
