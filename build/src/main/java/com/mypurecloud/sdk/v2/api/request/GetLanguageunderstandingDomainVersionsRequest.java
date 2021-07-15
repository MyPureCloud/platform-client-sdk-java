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

public class GetLanguageunderstandingDomainVersionsRequest {
    
	private String domainId;
	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public GetLanguageunderstandingDomainVersionsRequest withDomainId(String domainId) {
	    this.setDomainId(domainId);
	    return this;
	} 
	
	private Boolean includeUtterances;
	public Boolean getIncludeUtterances() {
		return this.includeUtterances;
	}

	public void setIncludeUtterances(Boolean includeUtterances) {
		this.includeUtterances = includeUtterances;
	}

	public GetLanguageunderstandingDomainVersionsRequest withIncludeUtterances(Boolean includeUtterances) {
	    this.setIncludeUtterances(includeUtterances);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetLanguageunderstandingDomainVersionsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetLanguageunderstandingDomainVersionsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
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

    public GetLanguageunderstandingDomainVersionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'domainId' is set
        if (this.domainId == null) {
            throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainVersionsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/languageunderstanding/domains/{domainId}/versions")
                .withPathParameter("domainId", domainId)
        
                .withQueryParameters("includeUtterances", "", includeUtterances)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String domainId) {
	    return new Builder()
	            .withRequiredParams(domainId);
	}
	

	public static class Builder {
		private final GetLanguageunderstandingDomainVersionsRequest request;

		private Builder() {
			request = new GetLanguageunderstandingDomainVersionsRequest();
		}

		
		public Builder withDomainId(String domainId) {
			request.setDomainId(domainId);
			return this;
		}
		
		public Builder withIncludeUtterances(Boolean includeUtterances) {
			request.setIncludeUtterances(includeUtterances);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		

		
		public Builder withRequiredParams(String domainId) {
			request.setDomainId(domainId);
			
			return this;
		}
		

		public GetLanguageunderstandingDomainVersionsRequest build() {
            
            // verify the required parameter 'domainId' is set
            if (request.domainId == null) {
                throw new IllegalStateException("Missing the required parameter 'domainId' when building request for GetLanguageunderstandingDomainVersionsRequest.");
            }
            
			return request;
		}
	}
}
