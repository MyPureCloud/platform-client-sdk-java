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

import com.mypurecloud.sdk.v2.model.AuditQueryServiceMapping;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryRequest;
import com.mypurecloud.sdk.v2.model.AuditRealtimeQueryResultsResponse;

public class PostAuditsQueryRequest {
    
	private AuditQueryRequest body;
	public AuditQueryRequest getBody() {
		return this.body;
	}

	public void setBody(AuditQueryRequest body) {
		this.body = body;
	}

	public PostAuditsQueryRequest withBody(AuditQueryRequest body) {
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

    public PostAuditsQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AuditQueryRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuditsQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/audits/query")
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

	
	public static Builder builder(AuditQueryRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostAuditsQueryRequest request;

		private Builder() {
			request = new PostAuditsQueryRequest();
		}

		
		public Builder withBody(AuditQueryRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(AuditQueryRequest body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostAuditsQueryRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuditsQueryRequest.");
            }
            
			return request;
		}
	}
}
