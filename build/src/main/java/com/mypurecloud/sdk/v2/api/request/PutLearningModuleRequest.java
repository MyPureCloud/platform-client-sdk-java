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

public class PutLearningModuleRequest {
    
	private String moduleId;
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public PutLearningModuleRequest withModuleId(String moduleId) {
	    this.setModuleId(moduleId);
	    return this;
	} 
	
	private LearningModuleRequest body;
	public LearningModuleRequest getBody() {
		return this.body;
	}

	public void setBody(LearningModuleRequest body) {
		this.body = body;
	}

	public PutLearningModuleRequest withBody(LearningModuleRequest body) {
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

    public PutLearningModuleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LearningModuleRequest> withHttpInfo() {
        
        // verify the required parameter 'moduleId' is set
        if (this.moduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'moduleId' when building request for PutLearningModuleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutLearningModuleRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/learning/modules/{moduleId}")
                .withPathParameter("moduleId", moduleId)
        
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

	
	public static Builder builder(String moduleId, LearningModuleRequest body) {
	    return new Builder()
	            .withRequiredParams(moduleId, body);
	}
	

	public static class Builder {
		private final PutLearningModuleRequest request;

		private Builder() {
			request = new PutLearningModuleRequest();
		}

		
		public Builder withModuleId(String moduleId) {
			request.setModuleId(moduleId);
			return this;
		}
		
		public Builder withBody(LearningModuleRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String moduleId, LearningModuleRequest body) {
			request.setModuleId(moduleId);
						request.setBody(body);
			
			return this;
		}
		

		public PutLearningModuleRequest build() {
            
            // verify the required parameter 'moduleId' is set
            if (request.moduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'moduleId' when building request for PutLearningModuleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutLearningModuleRequest.");
            }
            
			return request;
		}
	}
}
