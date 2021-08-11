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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;

public class GetQualityFormsSurveysBulkContextsRequest {
    
	private List<String> contextId;
	public List<String> getContextId() {
		return this.contextId;
	}

	public void setContextId(List<String> contextId) {
		this.contextId = contextId;
	}

	public GetQualityFormsSurveysBulkContextsRequest withContextId(List<String> contextId) {
	    this.setContextId(contextId);
	    return this;
	} 
	
	private Boolean published;
	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public GetQualityFormsSurveysBulkContextsRequest withPublished(Boolean published) {
	    this.setPublished(published);
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

    public GetQualityFormsSurveysBulkContextsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'contextId' is set
        if (this.contextId == null) {
            throw new IllegalStateException("Missing the required parameter 'contextId' when building request for GetQualityFormsSurveysBulkContextsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/forms/surveys/bulk/contexts")
                .withQueryParameters("contextId", "multi", contextId)
        
                .withQueryParameters("published", "", published)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(List<String> contextId) {
	    return new Builder()
	            .withRequiredParams(contextId);
	}
	

	public static class Builder {
		private final GetQualityFormsSurveysBulkContextsRequest request;

		private Builder() {
			request = new GetQualityFormsSurveysBulkContextsRequest();
		}

		
		public Builder withContextId(List<String> contextId) {
			request.setContextId(contextId);
			return this;
		}
		
		public Builder withPublished(Boolean published) {
			request.setPublished(published);
			return this;
		}
		

		
		public Builder withRequiredParams(List<String> contextId) {
			request.setContextId(contextId);
			
			return this;
		}
		

		public GetQualityFormsSurveysBulkContextsRequest build() {
            
            // verify the required parameter 'contextId' is set
            if (request.contextId == null) {
                throw new IllegalStateException("Missing the required parameter 'contextId' when building request for GetQualityFormsSurveysBulkContextsRequest.");
            }
            
			return request;
		}
	}
}
