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

public class PutGreetingsDefaultsRequest {

	private DefaultGreetingList body;
	public DefaultGreetingList getBody() {
		return this.body;
	}

	public void setBody(DefaultGreetingList body) {
		this.body = body;
	}

	public PutGreetingsDefaultsRequest withBody(DefaultGreetingList body) {
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

    public PutGreetingsDefaultsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DefaultGreetingList> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutGreetingsDefaultsRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/greetings/defaults")
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


	public static Builder builder(DefaultGreetingList body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PutGreetingsDefaultsRequest request;

		private Builder() {
			request = new PutGreetingsDefaultsRequest();
		}


		public Builder withBody(DefaultGreetingList body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(DefaultGreetingList body) {
			request.setBody(body);

			return this;
		}


		public PutGreetingsDefaultsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutGreetingsDefaultsRequest.");
            }
            
			return request;
		}
	}
}
