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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.Empty;

public class PostLanguageunderstandingMinerUploadsRequest {
    
	private String minerId;
	public String getMinerId() {
		return this.minerId;
	}

	public void setMinerId(String minerId) {
		this.minerId = minerId;
	}

	public PostLanguageunderstandingMinerUploadsRequest withMinerId(String minerId) {
	    this.setMinerId(minerId);
	    return this;
	} 
	
	private Empty body;
	public Empty getBody() {
		return this.body;
	}

	public void setBody(Empty body) {
		this.body = body;
	}

	public PostLanguageunderstandingMinerUploadsRequest withBody(Empty body) {
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

    public PostLanguageunderstandingMinerUploadsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Empty> withHttpInfo() {
        
        // verify the required parameter 'minerId' is set
        if (this.minerId == null) {
            throw new IllegalStateException("Missing the required parameter 'minerId' when building request for PostLanguageunderstandingMinerUploadsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingMinerUploadsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/languageunderstanding/miners/{minerId}/uploads")
                .withPathParameter("minerId", minerId)
        
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

	
	public static Builder builder(String minerId, Empty body) {
	    return new Builder()
	            .withRequiredParams(minerId, body);
	}
	

	public static class Builder {
		private final PostLanguageunderstandingMinerUploadsRequest request;

		private Builder() {
			request = new PostLanguageunderstandingMinerUploadsRequest();
		}

		
		public Builder withMinerId(String minerId) {
			request.setMinerId(minerId);
			return this;
		}
		
		public Builder withBody(Empty body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String minerId, Empty body) {
			request.setMinerId(minerId);
						request.setBody(body);
			
			return this;
		}
		

		public PostLanguageunderstandingMinerUploadsRequest build() {
            
            // verify the required parameter 'minerId' is set
            if (request.minerId == null) {
                throw new IllegalStateException("Missing the required parameter 'minerId' when building request for PostLanguageunderstandingMinerUploadsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingMinerUploadsRequest.");
            }
            
			return request;
		}
	}
}
