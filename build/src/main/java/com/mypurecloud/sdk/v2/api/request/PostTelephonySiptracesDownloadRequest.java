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

import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;

public class PostTelephonySiptracesDownloadRequest {
    
	private SIPSearchPublicRequest sIPSearchPublicRequest;
	public SIPSearchPublicRequest getSIPSearchPublicRequest() {
		return this.sIPSearchPublicRequest;
	}

	public void setSIPSearchPublicRequest(SIPSearchPublicRequest sIPSearchPublicRequest) {
		this.sIPSearchPublicRequest = sIPSearchPublicRequest;
	}

	public PostTelephonySiptracesDownloadRequest withSIPSearchPublicRequest(SIPSearchPublicRequest sIPSearchPublicRequest) {
	    this.setSIPSearchPublicRequest(sIPSearchPublicRequest);
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

    public PostTelephonySiptracesDownloadRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<SIPSearchPublicRequest> withHttpInfo() {
        
        // verify the required parameter 'sIPSearchPublicRequest' is set
        if (this.sIPSearchPublicRequest == null) {
            throw new IllegalStateException("Missing the required parameter 'sIPSearchPublicRequest' when building request for PostTelephonySiptracesDownloadRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/telephony/siptraces/download")
                .withBody(sIPSearchPublicRequest)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(SIPSearchPublicRequest sIPSearchPublicRequest) {
	    return new Builder()
	            .withRequiredParams(sIPSearchPublicRequest);
	}
	

	public static class Builder {
		private final PostTelephonySiptracesDownloadRequest request;

		private Builder() {
			request = new PostTelephonySiptracesDownloadRequest();
		}

		
		public Builder withSIPSearchPublicRequest(SIPSearchPublicRequest sIPSearchPublicRequest) {
			request.setSIPSearchPublicRequest(sIPSearchPublicRequest);
			return this;
		}
		

		
		public Builder withRequiredParams(SIPSearchPublicRequest sIPSearchPublicRequest) {
			request.setSIPSearchPublicRequest(sIPSearchPublicRequest);
			
			return this;
		}
		

		public PostTelephonySiptracesDownloadRequest build() {
            
            // verify the required parameter 'sIPSearchPublicRequest' is set
            if (request.sIPSearchPublicRequest == null) {
                throw new IllegalStateException("Missing the required parameter 'sIPSearchPublicRequest' when building request for PostTelephonySiptracesDownloadRequest.");
            }
            
			return request;
		}
	}
}
