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
import com.mypurecloud.sdk.v2.model.LearningAssignmentExternalUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentReschedule;
import com.mypurecloud.sdk.v2.model.LearningAssignmentStep;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleList;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewGetResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsJobRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsJobResponse;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryResponse;
import com.mypurecloud.sdk.v2.model.LearningScormResponse;
import com.mypurecloud.sdk.v2.model.LearningScormUploadRequest;
import com.mypurecloud.sdk.v2.model.LearningScormUploadResponse;

public class PatchLearningAssignmentStepRequest {

	private String assignmentId;
	public String getAssignmentId() {
		return this.assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public PatchLearningAssignmentStepRequest withAssignmentId(String assignmentId) {
	    this.setAssignmentId(assignmentId);
	    return this;
	} 

	private String stepId;
	public String getStepId() {
		return this.stepId;
	}

	public void setStepId(String stepId) {
		this.stepId = stepId;
	}

	public PatchLearningAssignmentStepRequest withStepId(String stepId) {
	    this.setStepId(stepId);
	    return this;
	} 

	private LearningAssignmentStep body;
	public LearningAssignmentStep getBody() {
		return this.body;
	}

	public void setBody(LearningAssignmentStep body) {
		this.body = body;
	}

	public PatchLearningAssignmentStepRequest withBody(LearningAssignmentStep body) {
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

    public PatchLearningAssignmentStepRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LearningAssignmentStep> withHttpInfo() {
        
        // verify the required parameter 'assignmentId' is set
        if (this.assignmentId == null) {
            throw new IllegalStateException("Missing the required parameter 'assignmentId' when building request for PatchLearningAssignmentStepRequest.");
        }
        
        // verify the required parameter 'stepId' is set
        if (this.stepId == null) {
            throw new IllegalStateException("Missing the required parameter 'stepId' when building request for PatchLearningAssignmentStepRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/learning/assignments/{assignmentId}/steps/{stepId}")
                .withPathParameter("assignmentId", assignmentId)
        
                .withPathParameter("stepId", stepId)
        
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


	public static Builder builder(String assignmentId, String stepId) {
	    return new Builder()
	            .withRequiredParams(assignmentId, stepId);
	}


	public static class Builder {
		private final PatchLearningAssignmentStepRequest request;

		private Builder() {
			request = new PatchLearningAssignmentStepRequest();
		}


		public Builder withAssignmentId(String assignmentId) {
			request.setAssignmentId(assignmentId);
			return this;
		}

		public Builder withStepId(String stepId) {
			request.setStepId(stepId);
			return this;
		}

		public Builder withBody(LearningAssignmentStep body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String assignmentId, String stepId) {
			request.setAssignmentId(assignmentId);
			request.setStepId(stepId);

			return this;
		}


		public PatchLearningAssignmentStepRequest build() {
            
            // verify the required parameter 'assignmentId' is set
            if (request.assignmentId == null) {
                throw new IllegalStateException("Missing the required parameter 'assignmentId' when building request for PatchLearningAssignmentStepRequest.");
            }
            
            // verify the required parameter 'stepId' is set
            if (request.stepId == null) {
                throw new IllegalStateException("Missing the required parameter 'stepId' when building request for PatchLearningAssignmentStepRequest.");
            }
            
			return request;
		}
	}
}
