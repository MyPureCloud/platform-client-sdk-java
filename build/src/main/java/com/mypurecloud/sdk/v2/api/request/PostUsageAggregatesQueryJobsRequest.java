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

public class PostUsageAggregatesQueryJobsRequest {

	private OrganizationPublicApiUsageQueryRequest body;
	public OrganizationPublicApiUsageQueryRequest getBody() {
		return this.body;
	}

	public void setBody(OrganizationPublicApiUsageQueryRequest body) {
		this.body = body;
	}

	public PostUsageAggregatesQueryJobsRequest withBody(OrganizationPublicApiUsageQueryRequest body) {
	    this.setBody(body);
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

    public PostUsageAggregatesQueryJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OrganizationPublicApiUsageQueryRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostUsageAggregatesQueryJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/usage/aggregates/query/jobs")
                .withBody(body)

		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(OrganizationPublicApiUsageQueryRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostUsageAggregatesQueryJobsRequest request;

		private Builder() {
			request = new PostUsageAggregatesQueryJobsRequest();
		}


		public Builder withBody(OrganizationPublicApiUsageQueryRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(OrganizationPublicApiUsageQueryRequest body) {
			request.setBody(body);

			return this;
		}


		public PostUsageAggregatesQueryJobsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostUsageAggregatesQueryJobsRequest.");
            }
            
			return request;
		}
	}
}
