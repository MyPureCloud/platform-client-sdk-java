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

import com.mypurecloud.sdk.v2.model.CelebrationStateParam;
import com.mypurecloud.sdk.v2.model.CreateRecognition;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetCelebrationListing;
import com.mypurecloud.sdk.v2.model.Recognition;
import com.mypurecloud.sdk.v2.model.RecognitionBase;

public class GetEmployeeengagementRecognitionRequest {

	private String recognitionId;
	public String getRecognitionId() {
		return this.recognitionId;
	}

	public void setRecognitionId(String recognitionId) {
		this.recognitionId = recognitionId;
	}

	public GetEmployeeengagementRecognitionRequest withRecognitionId(String recognitionId) {
	    this.setRecognitionId(recognitionId);
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

    public GetEmployeeengagementRecognitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'recognitionId' is set
        if (this.recognitionId == null) {
            throw new IllegalStateException("Missing the required parameter 'recognitionId' when building request for GetEmployeeengagementRecognitionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/employeeengagement/recognitions/{recognitionId}")
                .withPathParameter("recognitionId", recognitionId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String recognitionId) {
	    return new Builder()
	            .withRequiredParams(recognitionId);
	}


	public static class Builder {
		private final GetEmployeeengagementRecognitionRequest request;

		private Builder() {
			request = new GetEmployeeengagementRecognitionRequest();
		}


		public Builder withRecognitionId(String recognitionId) {
			request.setRecognitionId(recognitionId);
			return this;
		}



		public Builder withRequiredParams(String recognitionId) {
			request.setRecognitionId(recognitionId);

			return this;
		}


		public GetEmployeeengagementRecognitionRequest build() {
            
            // verify the required parameter 'recognitionId' is set
            if (request.recognitionId == null) {
                throw new IllegalStateException("Missing the required parameter 'recognitionId' when building request for GetEmployeeengagementRecognitionRequest.");
            }
            
			return request;
		}
	}
}
