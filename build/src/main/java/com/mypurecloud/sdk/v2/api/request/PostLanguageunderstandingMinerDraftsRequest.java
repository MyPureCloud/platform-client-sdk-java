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
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.Miner;
import com.mypurecloud.sdk.v2.model.Draft;
import com.mypurecloud.sdk.v2.model.DraftListing;
import com.mypurecloud.sdk.v2.model.MinerIntent;
import com.mypurecloud.sdk.v2.model.MinedIntentsListing;
import com.mypurecloud.sdk.v2.model.MinerListing;
import com.mypurecloud.sdk.v2.model.DraftRequest;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;
import com.mypurecloud.sdk.v2.model.MinerExecuteRequest;

public class PostLanguageunderstandingMinerDraftsRequest {
    
	private String minerId;
	public String getMinerId() {
		return this.minerId;
	}

	public void setMinerId(String minerId) {
		this.minerId = minerId;
	}

	public PostLanguageunderstandingMinerDraftsRequest withMinerId(String minerId) {
	    this.setMinerId(minerId);
	    return this;
	} 
	
	private Draft body;
	public Draft getBody() {
		return this.body;
	}

	public void setBody(Draft body) {
		this.body = body;
	}

	public PostLanguageunderstandingMinerDraftsRequest withBody(Draft body) {
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

    public PostLanguageunderstandingMinerDraftsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Draft> withHttpInfo() {
        
        // verify the required parameter 'minerId' is set
        if (this.minerId == null) {
            throw new IllegalStateException("Missing the required parameter 'minerId' when building request for PostLanguageunderstandingMinerDraftsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingMinerDraftsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/languageunderstanding/miners/{minerId}/drafts")
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

	
	public static Builder builder(String minerId, Draft body) {
	    return new Builder()
	            .withRequiredParams(minerId, body);
	}
	

	public static class Builder {
		private final PostLanguageunderstandingMinerDraftsRequest request;

		private Builder() {
			request = new PostLanguageunderstandingMinerDraftsRequest();
		}

		
		public Builder withMinerId(String minerId) {
			request.setMinerId(minerId);
			return this;
		}
		
		public Builder withBody(Draft body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String minerId, Draft body) {
			request.setMinerId(minerId);
						request.setBody(body);
			
			return this;
		}
		

		public PostLanguageunderstandingMinerDraftsRequest build() {
            
            // verify the required parameter 'minerId' is set
            if (request.minerId == null) {
                throw new IllegalStateException("Missing the required parameter 'minerId' when building request for PostLanguageunderstandingMinerDraftsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLanguageunderstandingMinerDraftsRequest.");
            }
            
			return request;
		}
	}
}
