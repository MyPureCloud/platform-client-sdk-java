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

public class DeleteQualityCalibrationRequest {
    
	private String calibrationId;
	public String getCalibrationId() {
		return this.calibrationId;
	}

	public void setCalibrationId(String calibrationId) {
		this.calibrationId = calibrationId;
	}

	public DeleteQualityCalibrationRequest withCalibrationId(String calibrationId) {
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

	public DeleteQualityCalibrationRequest withCalibratorId(String calibratorId) {
	    this.setCalibratorId(calibratorId);
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

    public DeleteQualityCalibrationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'calibrationId' is set
        if (this.calibrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'calibrationId' when building request for DeleteQualityCalibrationRequest.");
        }
        
        // verify the required parameter 'calibratorId' is set
        if (this.calibratorId == null) {
            throw new IllegalStateException("Missing the required parameter 'calibratorId' when building request for DeleteQualityCalibrationRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/quality/calibrations/{calibrationId}")
                .withPathParameter("calibrationId", calibrationId)
        
                .withQueryParameters("calibratorId", "", calibratorId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String calibrationId, String calibratorId) {
	    return new Builder()
	            .withRequiredParams(calibrationId, calibratorId);
	}
	

	public static class Builder {
		private final DeleteQualityCalibrationRequest request;

		private Builder() {
			request = new DeleteQualityCalibrationRequest();
		}

		
		public Builder withCalibrationId(String calibrationId) {
			request.setCalibrationId(calibrationId);
			return this;
		}
		
		public Builder withCalibratorId(String calibratorId) {
			request.setCalibratorId(calibratorId);
			return this;
		}
		

		
		public Builder withRequiredParams(String calibrationId, String calibratorId) {
			request.setCalibrationId(calibrationId);
						request.setCalibratorId(calibratorId);
			
			return this;
		}
		

		public DeleteQualityCalibrationRequest build() {
            
            // verify the required parameter 'calibrationId' is set
            if (request.calibrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'calibrationId' when building request for DeleteQualityCalibrationRequest.");
            }
            
            // verify the required parameter 'calibratorId' is set
            if (request.calibratorId == null) {
                throw new IllegalStateException("Missing the required parameter 'calibratorId' when building request for DeleteQualityCalibrationRequest.");
            }
            
			return request;
		}
	}
}
