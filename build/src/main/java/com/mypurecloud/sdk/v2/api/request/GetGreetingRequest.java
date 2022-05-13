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

import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingListing;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;

public class GetGreetingRequest {

	private String greetingId;
	public String getGreetingId() {
		return this.greetingId;
	}

	public void setGreetingId(String greetingId) {
		this.greetingId = greetingId;
	}

	public GetGreetingRequest withGreetingId(String greetingId) {
	    this.setGreetingId(greetingId);
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

    public GetGreetingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'greetingId' is set
        if (this.greetingId == null) {
            throw new IllegalStateException("Missing the required parameter 'greetingId' when building request for GetGreetingRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/greetings/{greetingId}")
                .withPathParameter("greetingId", greetingId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String greetingId) {
	    return new Builder()
	            .withRequiredParams(greetingId);
	}


	public static class Builder {
		private final GetGreetingRequest request;

		private Builder() {
			request = new GetGreetingRequest();
		}


		public Builder withGreetingId(String greetingId) {
			request.setGreetingId(greetingId);
			return this;
		}



		public Builder withRequiredParams(String greetingId) {
			request.setGreetingId(greetingId);

			return this;
		}


		public GetGreetingRequest build() {
            
            // verify the required parameter 'greetingId' is set
            if (request.greetingId == null) {
                throw new IllegalStateException("Missing the required parameter 'greetingId' when building request for GetGreetingRequest.");
            }
            
			return request;
		}
	}
}
