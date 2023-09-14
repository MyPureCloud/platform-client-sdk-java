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

import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.AssignedLearningModuleDomainEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentReschedule;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryResponse;

public class PostLearningModuleJobsRequest {

	private String moduleId;
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public PostLearningModuleJobsRequest withModuleId(String moduleId) {
	    this.setModuleId(moduleId);
	    return this;
	} 

	private LearningModuleJobRequest body;
	public LearningModuleJobRequest getBody() {
		return this.body;
	}

	public void setBody(LearningModuleJobRequest body) {
		this.body = body;
	}

	public PostLearningModuleJobsRequest withBody(LearningModuleJobRequest body) {
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

    public PostLearningModuleJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LearningModuleJobRequest> withHttpInfo() {
        
        // verify the required parameter 'moduleId' is set
        if (this.moduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'moduleId' when building request for PostLearningModuleJobsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLearningModuleJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/learning/modules/{moduleId}/jobs")
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


	public static Builder builder(String moduleId, LearningModuleJobRequest body) {
	    return new Builder()
	            .withRequiredParams(moduleId, body);
	}


	public static class Builder {
		private final PostLearningModuleJobsRequest request;

		private Builder() {
			request = new PostLearningModuleJobsRequest();
		}


		public Builder withModuleId(String moduleId) {
			request.setModuleId(moduleId);
			return this;
		}

		public Builder withBody(LearningModuleJobRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String moduleId, LearningModuleJobRequest body) {
			request.setModuleId(moduleId);
			request.setBody(body);

			return this;
		}


		public PostLearningModuleJobsRequest build() {
            
            // verify the required parameter 'moduleId' is set
            if (request.moduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'moduleId' when building request for PostLearningModuleJobsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostLearningModuleJobsRequest.");
            }
            
			return request;
		}
	}
}
