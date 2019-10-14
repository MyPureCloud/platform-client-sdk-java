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

public class GetTelephonySiptracesDownloadDownloadIdRequest {
    
	private String downloadId;
	public String getDownloadId() {
		return this.downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}

	public GetTelephonySiptracesDownloadDownloadIdRequest withDownloadId(String downloadId) {
	    this.setDownloadId(downloadId);
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

    public GetTelephonySiptracesDownloadDownloadIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'downloadId' is set
        if (this.downloadId == null) {
            throw new IllegalStateException("Missing the required parameter 'downloadId' when building request for GetTelephonySiptracesDownloadDownloadIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/siptraces/download/{downloadId}")
                .withPathParameter("downloadId", downloadId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String downloadId) {
	    return new Builder()
	            .withRequiredParams(downloadId);
	}
	

	public static class Builder {
		private final GetTelephonySiptracesDownloadDownloadIdRequest request;

		private Builder() {
			request = new GetTelephonySiptracesDownloadDownloadIdRequest();
		}

		
		public Builder withDownloadId(String downloadId) {
			request.setDownloadId(downloadId);
			return this;
		}
		

		
		public Builder withRequiredParams(String downloadId) {
			request.setDownloadId(downloadId);
			
			return this;
		}
		

		public GetTelephonySiptracesDownloadDownloadIdRequest build() {
            
            // verify the required parameter 'downloadId' is set
            if (request.downloadId == null) {
                throw new IllegalStateException("Missing the required parameter 'downloadId' when building request for GetTelephonySiptracesDownloadDownloadIdRequest.");
            }
            
			return request;
		}
	}
}
