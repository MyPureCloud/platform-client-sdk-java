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

public class PatchLearningAssignmentRequest {
    
	private String assignmentId;
	public String getAssignmentId() {
		return this.assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public PatchLearningAssignmentRequest withAssignmentId(String assignmentId) {
	    this.setAssignmentId(assignmentId);
	    return this;
	} 
	
	private LearningAssignmentUpdate body;
	public LearningAssignmentUpdate getBody() {
		return this.body;
	}

	public void setBody(LearningAssignmentUpdate body) {
		this.body = body;
	}

	public PatchLearningAssignmentRequest withBody(LearningAssignmentUpdate body) {
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

    public PatchLearningAssignmentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LearningAssignmentUpdate> withHttpInfo() {
        
        // verify the required parameter 'assignmentId' is set
        if (this.assignmentId == null) {
            throw new IllegalStateException("Missing the required parameter 'assignmentId' when building request for PatchLearningAssignmentRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/learning/assignments/{assignmentId}")
                .withPathParameter("assignmentId", assignmentId)
        
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

	
	public static Builder builder(String assignmentId) {
	    return new Builder()
	            .withRequiredParams(assignmentId);
	}
	

	public static class Builder {
		private final PatchLearningAssignmentRequest request;

		private Builder() {
			request = new PatchLearningAssignmentRequest();
		}

		
		public Builder withAssignmentId(String assignmentId) {
			request.setAssignmentId(assignmentId);
			return this;
		}
		
		public Builder withBody(LearningAssignmentUpdate body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String assignmentId) {
			request.setAssignmentId(assignmentId);
			
			return this;
		}
		

		public PatchLearningAssignmentRequest build() {
            
            // verify the required parameter 'assignmentId' is set
            if (request.assignmentId == null) {
                throw new IllegalStateException("Missing the required parameter 'assignmentId' when building request for PatchLearningAssignmentRequest.");
            }
            
			return request;
		}
	}
}
