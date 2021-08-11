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
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;

public class PostLearningRulesQueryRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public PostLearningRulesQueryRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public PostLearningRulesQueryRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private LearningAssignmentUserQuery body;
	public LearningAssignmentUserQuery getBody() {
		return this.body;
	}

	public void setBody(LearningAssignmentUserQuery body) {
		this.body = body;
	}

	public PostLearningRulesQueryRequest withBody(LearningAssignmentUserQuery body) {
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

    public PostLearningRulesQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LearningAssignmentUserQuery> withHttpInfo() {
        
        // verify the required parameter 'pageSize' is set
        if (this.pageSize == null) {
            throw new IllegalStateException("Missing the required parameter 'pageSize' when building request for PostLearningRulesQueryRequest.");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (this.pageNumber == null) {
            throw new IllegalStateException("Missing the required parameter 'pageNumber' when building request for PostLearningRulesQueryRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLearningRulesQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/learning/rules/query")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
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

	
	public static Builder builder(Integer pageSize, Integer pageNumber, LearningAssignmentUserQuery body) {
	    return new Builder()
	            .withRequiredParams(pageSize, pageNumber, body);
	}
	

	public static class Builder {
		private final PostLearningRulesQueryRequest request;

		private Builder() {
			request = new PostLearningRulesQueryRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withBody(LearningAssignmentUserQuery body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(Integer pageSize, Integer pageNumber, LearningAssignmentUserQuery body) {
			request.setPageSize(pageSize);
						request.setPageNumber(pageNumber);
						request.setBody(body);
			
			return this;
		}
		

		public PostLearningRulesQueryRequest build() {
            
            // verify the required parameter 'pageSize' is set
            if (request.pageSize == null) {
                throw new IllegalStateException("Missing the required parameter 'pageSize' when building request for PostLearningRulesQueryRequest.");
            }
            
            // verify the required parameter 'pageNumber' is set
            if (request.pageNumber == null) {
                throw new IllegalStateException("Missing the required parameter 'pageNumber' when building request for PostLearningRulesQueryRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLearningRulesQueryRequest.");
            }
            
			return request;
		}
	}
}
