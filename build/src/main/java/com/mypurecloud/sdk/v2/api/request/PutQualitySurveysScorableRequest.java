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

public class PutQualitySurveysScorableRequest {
    
	private ScorableSurvey body;
	public ScorableSurvey getBody() {
		return this.body;
	}

	public void setBody(ScorableSurvey body) {
		this.body = body;
	}

	public PutQualitySurveysScorableRequest withBody(ScorableSurvey body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String customerSurveyUrl;
	public String getCustomerSurveyUrl() {
		return this.customerSurveyUrl;
	}

	public void setCustomerSurveyUrl(String customerSurveyUrl) {
		this.customerSurveyUrl = customerSurveyUrl;
	}

	public PutQualitySurveysScorableRequest withCustomerSurveyUrl(String customerSurveyUrl) {
	    this.setCustomerSurveyUrl(customerSurveyUrl);
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

    public PutQualitySurveysScorableRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScorableSurvey> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualitySurveysScorableRequest.");
        }
        
        // verify the required parameter 'customerSurveyUrl' is set
        if (this.customerSurveyUrl == null) {
            throw new IllegalStateException("Missing the required parameter 'customerSurveyUrl' when building request for PutQualitySurveysScorableRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/quality/surveys/scorable")
                .withQueryParameters("customerSurveyUrl", "", customerSurveyUrl)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(ScorableSurvey body, String customerSurveyUrl) {
	    return new Builder()
	            .withRequiredParams(body, customerSurveyUrl);
	}
	

	public static class Builder {
		private final PutQualitySurveysScorableRequest request;

		private Builder() {
			request = new PutQualitySurveysScorableRequest();
		}

		
		public Builder withBody(ScorableSurvey body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withCustomerSurveyUrl(String customerSurveyUrl) {
			request.setCustomerSurveyUrl(customerSurveyUrl);
			return this;
		}
		

		
		public Builder withRequiredParams(ScorableSurvey body, String customerSurveyUrl) {
			request.setBody(body);
						request.setCustomerSurveyUrl(customerSurveyUrl);
			
			return this;
		}
		

		public PutQualitySurveysScorableRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualitySurveysScorableRequest.");
            }
            
            // verify the required parameter 'customerSurveyUrl' is set
            if (request.customerSurveyUrl == null) {
                throw new IllegalStateException("Missing the required parameter 'customerSurveyUrl' when building request for PutQualitySurveysScorableRequest.");
            }
            
			return request;
		}
	}
}
