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
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;

public class GetLearningModulesCoverartCoverArtIdRequest {

	private String coverArtId;
	public String getCoverArtId() {
		return this.coverArtId;
	}

	public void setCoverArtId(String coverArtId) {
		this.coverArtId = coverArtId;
	}

	public GetLearningModulesCoverartCoverArtIdRequest withCoverArtId(String coverArtId) {
	    this.setCoverArtId(coverArtId);
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

    public GetLearningModulesCoverartCoverArtIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'coverArtId' is set
        if (this.coverArtId == null) {
            throw new IllegalStateException("Missing the required parameter 'coverArtId' when building request for GetLearningModulesCoverartCoverArtIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/learning/modules/coverart/{coverArtId}")
                .withPathParameter("coverArtId", coverArtId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String coverArtId) {
	    return new Builder()
	            .withRequiredParams(coverArtId);
	}


	public static class Builder {
		private final GetLearningModulesCoverartCoverArtIdRequest request;

		private Builder() {
			request = new GetLearningModulesCoverartCoverArtIdRequest();
		}


		public Builder withCoverArtId(String coverArtId) {
			request.setCoverArtId(coverArtId);
			return this;
		}



		public Builder withRequiredParams(String coverArtId) {
			request.setCoverArtId(coverArtId);

			return this;
		}


		public GetLearningModulesCoverartCoverArtIdRequest build() {
            
            // verify the required parameter 'coverArtId' is set
            if (request.coverArtId == null) {
                throw new IllegalStateException("Missing the required parameter 'coverArtId' when building request for GetLearningModulesCoverartCoverArtIdRequest.");
            }
            
			return request;
		}
	}
}
