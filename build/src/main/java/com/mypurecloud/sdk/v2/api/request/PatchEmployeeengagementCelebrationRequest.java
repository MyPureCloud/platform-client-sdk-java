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

public class PatchEmployeeengagementCelebrationRequest {

	private String celebrationId;
	public String getCelebrationId() {
		return this.celebrationId;
	}

	public void setCelebrationId(String celebrationId) {
		this.celebrationId = celebrationId;
	}

	public PatchEmployeeengagementCelebrationRequest withCelebrationId(String celebrationId) {
	    this.setCelebrationId(celebrationId);
	    return this;
	} 

	private CelebrationStateParam body;
	public CelebrationStateParam getBody() {
		return this.body;
	}

	public void setBody(CelebrationStateParam body) {
		this.body = body;
	}

	public PatchEmployeeengagementCelebrationRequest withBody(CelebrationStateParam body) {
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

    public PatchEmployeeengagementCelebrationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CelebrationStateParam> withHttpInfo() {
        
        // verify the required parameter 'celebrationId' is set
        if (this.celebrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'celebrationId' when building request for PatchEmployeeengagementCelebrationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchEmployeeengagementCelebrationRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/employeeengagement/celebrations/{celebrationId}")
                .withPathParameter("celebrationId", celebrationId)
        
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


	public static Builder builder(String celebrationId, CelebrationStateParam body) {
	    return new Builder()
	            .withRequiredParams(celebrationId, body);
	}


	public static class Builder {
		private final PatchEmployeeengagementCelebrationRequest request;

		private Builder() {
			request = new PatchEmployeeengagementCelebrationRequest();
		}


		public Builder withCelebrationId(String celebrationId) {
			request.setCelebrationId(celebrationId);
			return this;
		}

		public Builder withBody(CelebrationStateParam body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String celebrationId, CelebrationStateParam body) {
			request.setCelebrationId(celebrationId);
			request.setBody(body);

			return this;
		}


		public PatchEmployeeengagementCelebrationRequest build() {
            
            // verify the required parameter 'celebrationId' is set
            if (request.celebrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'celebrationId' when building request for PatchEmployeeengagementCelebrationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchEmployeeengagementCelebrationRequest.");
            }
            
			return request;
		}
	}
}
