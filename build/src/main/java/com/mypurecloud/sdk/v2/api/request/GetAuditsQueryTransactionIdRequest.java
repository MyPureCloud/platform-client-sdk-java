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

import com.mypurecloud.sdk.v2.model.AuditQueryExecutionLargeResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditQueryServiceMapping;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditRealtimeRelatedRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeRelatedResultsResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class GetAuditsQueryTransactionIdRequest {

	private String transactionId;
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public GetAuditsQueryTransactionIdRequest withTransactionId(String transactionId) {
	    this.setTransactionId(transactionId);
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

    public GetAuditsQueryTransactionIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'transactionId' is set
        if (this.transactionId == null) {
            throw new IllegalStateException("Missing the required parameter 'transactionId' when building request for GetAuditsQueryTransactionIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/audits/query/{transactionId}")
                .withPathParameter("transactionId", transactionId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String transactionId) {
	    return new Builder()
	            .withRequiredParams(transactionId);
	}


	public static class Builder {
		private final GetAuditsQueryTransactionIdRequest request;

		private Builder() {
			request = new GetAuditsQueryTransactionIdRequest();
		}


		public Builder withTransactionId(String transactionId) {
			request.setTransactionId(transactionId);
			return this;
		}



		public Builder withRequiredParams(String transactionId) {
			request.setTransactionId(transactionId);

			return this;
		}


		public GetAuditsQueryTransactionIdRequest build() {
            
            // verify the required parameter 'transactionId' is set
            if (request.transactionId == null) {
                throw new IllegalStateException("Missing the required parameter 'transactionId' when building request for GetAuditsQueryTransactionIdRequest.");
            }
            
			return request;
		}
	}
}
