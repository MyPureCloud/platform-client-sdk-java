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

import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import com.mypurecloud.sdk.v2.model.AiScoringSettings;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQueryMe;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationCreateBody;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponse;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponseEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationResponse;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;

public class PatchQualityFormsSurveyRequest {

	private String formId;
	public String getFormId() {
		return this.formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public PatchQualityFormsSurveyRequest withFormId(String formId) {
	    this.setFormId(formId);
	    return this;
	} 

	private SurveyForm body;
	public SurveyForm getBody() {
		return this.body;
	}

	public void setBody(SurveyForm body) {
		this.body = body;
	}

	public PatchQualityFormsSurveyRequest withBody(SurveyForm body) {
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

    public PatchQualityFormsSurveyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<SurveyForm> withHttpInfo() {
        
        // verify the required parameter 'formId' is set
        if (this.formId == null) {
            throw new IllegalStateException("Missing the required parameter 'formId' when building request for PatchQualityFormsSurveyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchQualityFormsSurveyRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/quality/forms/surveys/{formId}")
                .withPathParameter("formId", formId)
        
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


	public static Builder builder(String formId, SurveyForm body) {
	    return new Builder()
	            .withRequiredParams(formId, body);
	}


	public static class Builder {
		private final PatchQualityFormsSurveyRequest request;

		private Builder() {
			request = new PatchQualityFormsSurveyRequest();
		}


		public Builder withFormId(String formId) {
			request.setFormId(formId);
			return this;
		}

		public Builder withBody(SurveyForm body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String formId, SurveyForm body) {
			request.setFormId(formId);
			request.setBody(body);

			return this;
		}


		public PatchQualityFormsSurveyRequest build() {
            
            // verify the required parameter 'formId' is set
            if (request.formId == null) {
                throw new IllegalStateException("Missing the required parameter 'formId' when building request for PatchQualityFormsSurveyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchQualityFormsSurveyRequest.");
            }
            
			return request;
		}
	}
}
