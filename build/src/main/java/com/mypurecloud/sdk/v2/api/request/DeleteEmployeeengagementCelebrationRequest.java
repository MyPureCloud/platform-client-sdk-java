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
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetCelebrationListing;
import com.mypurecloud.sdk.v2.model.Recognition;
import com.mypurecloud.sdk.v2.model.RecognitionBase;
import com.mypurecloud.sdk.v2.model.Recognitions;

public class DeleteEmployeeengagementCelebrationRequest {

	private String celebrationId;
	public String getCelebrationId() {
		return this.celebrationId;
	}

	public void setCelebrationId(String celebrationId) {
		this.celebrationId = celebrationId;
	}

	public DeleteEmployeeengagementCelebrationRequest withCelebrationId(String celebrationId) {
	    this.setCelebrationId(celebrationId);
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

    public DeleteEmployeeengagementCelebrationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'celebrationId' is set
        if (this.celebrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'celebrationId' when building request for DeleteEmployeeengagementCelebrationRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/employeeengagement/celebrations/{celebrationId}")
                .withPathParameter("celebrationId", celebrationId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String celebrationId) {
	    return new Builder()
	            .withRequiredParams(celebrationId);
	}


	public static class Builder {
		private final DeleteEmployeeengagementCelebrationRequest request;

		private Builder() {
			request = new DeleteEmployeeengagementCelebrationRequest();
		}


		public Builder withCelebrationId(String celebrationId) {
			request.setCelebrationId(celebrationId);
			return this;
		}



		public Builder withRequiredParams(String celebrationId) {
			request.setCelebrationId(celebrationId);

			return this;
		}


		public DeleteEmployeeengagementCelebrationRequest build() {
            
            // verify the required parameter 'celebrationId' is set
            if (request.celebrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'celebrationId' when building request for DeleteEmployeeengagementCelebrationRequest.");
            }
            
			return request;
		}
	}
}
