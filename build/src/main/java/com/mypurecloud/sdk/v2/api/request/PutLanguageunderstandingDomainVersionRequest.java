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

public class PutLanguageunderstandingDomainVersionRequest {
    
	private String domainId;
	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public PutLanguageunderstandingDomainVersionRequest withDomainId(String domainId) {
	    this.setDomainId(domainId);
	    return this;
	} 
	
	private String domainVersionId;
	public String getDomainVersionId() {
		return this.domainVersionId;
	}

	public void setDomainVersionId(String domainVersionId) {
		this.domainVersionId = domainVersionId;
	}

	public PutLanguageunderstandingDomainVersionRequest withDomainVersionId(String domainVersionId) {
	    this.setDomainVersionId(domainVersionId);
	    return this;
	} 
	
	private NluDomainVersion body;
	public NluDomainVersion getBody() {
		return this.body;
	}

	public void setBody(NluDomainVersion body) {
		this.body = body;
	}

	public PutLanguageunderstandingDomainVersionRequest withBody(NluDomainVersion body) {
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

    public PutLanguageunderstandingDomainVersionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<NluDomainVersion> withHttpInfo() {
        
        // verify the required parameter 'domainId' is set
        if (this.domainId == null) {
            throw new IllegalStateException("Missing the required parameter 'domainId' when building request for PutLanguageunderstandingDomainVersionRequest.");
        }
        
        // verify the required parameter 'domainVersionId' is set
        if (this.domainVersionId == null) {
            throw new IllegalStateException("Missing the required parameter 'domainVersionId' when building request for PutLanguageunderstandingDomainVersionRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutLanguageunderstandingDomainVersionRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}")
                .withPathParameter("domainId", domainId)
        
                .withPathParameter("domainVersionId", domainVersionId)
        
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

	
	public static Builder builder(String domainId, String domainVersionId, NluDomainVersion body) {
	    return new Builder()
	            .withRequiredParams(domainId, domainVersionId, body);
	}
	

	public static class Builder {
		private final PutLanguageunderstandingDomainVersionRequest request;

		private Builder() {
			request = new PutLanguageunderstandingDomainVersionRequest();
		}

		
		public Builder withDomainId(String domainId) {
			request.setDomainId(domainId);
			return this;
		}
		
		public Builder withDomainVersionId(String domainVersionId) {
			request.setDomainVersionId(domainVersionId);
			return this;
		}
		
		public Builder withBody(NluDomainVersion body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String domainId, String domainVersionId, NluDomainVersion body) {
			request.setDomainId(domainId);
						request.setDomainVersionId(domainVersionId);
						request.setBody(body);
			
			return this;
		}
		

		public PutLanguageunderstandingDomainVersionRequest build() {
            
            // verify the required parameter 'domainId' is set
            if (request.domainId == null) {
                throw new IllegalStateException("Missing the required parameter 'domainId' when building request for PutLanguageunderstandingDomainVersionRequest.");
            }
            
            // verify the required parameter 'domainVersionId' is set
            if (request.domainVersionId == null) {
                throw new IllegalStateException("Missing the required parameter 'domainVersionId' when building request for PutLanguageunderstandingDomainVersionRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutLanguageunderstandingDomainVersionRequest.");
            }
            
			return request;
		}
	}
}
