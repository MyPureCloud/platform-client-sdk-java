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

public class GetQualityCalibrationRequest {
    
	private String calibrationId;
	public String getCalibrationId() {
		return this.calibrationId;
	}

	public void setCalibrationId(String calibrationId) {
		this.calibrationId = calibrationId;
	}

	public GetQualityCalibrationRequest withCalibrationId(String calibrationId) {
	    this.setCalibrationId(calibrationId);
	    return this;
	} 
	
	private String calibratorId;
	public String getCalibratorId() {
		return this.calibratorId;
	}

	public void setCalibratorId(String calibratorId) {
		this.calibratorId = calibratorId;
	}

	public GetQualityCalibrationRequest withCalibratorId(String calibratorId) {
	    this.setCalibratorId(calibratorId);
	    return this;
	} 
	
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetQualityCalibrationRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
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

    public GetQualityCalibrationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'calibrationId' is set
        if (this.calibrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'calibrationId' when building request for GetQualityCalibrationRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/calibrations/{calibrationId}")
                .withPathParameter("calibrationId", calibrationId)
        
                .withQueryParameters("calibratorId", "", calibratorId)
        
                .withQueryParameters("conversationId", "", conversationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String calibrationId) {
	    return new Builder()
	            .withRequiredParams(calibrationId);
	}
	

	public static class Builder {
		private final GetQualityCalibrationRequest request;

		private Builder() {
			request = new GetQualityCalibrationRequest();
		}

		
		public Builder withCalibrationId(String calibrationId) {
			request.setCalibrationId(calibrationId);
			return this;
		}
		
		public Builder withCalibratorId(String calibratorId) {
			request.setCalibratorId(calibratorId);
			return this;
		}
		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String calibrationId) {
			request.setCalibrationId(calibrationId);
			
			return this;
		}
		

		public GetQualityCalibrationRequest build() {
            
            // verify the required parameter 'calibrationId' is set
            if (request.calibrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'calibrationId' when building request for GetQualityCalibrationRequest.");
            }
            
			return request;
		}
	}
}
