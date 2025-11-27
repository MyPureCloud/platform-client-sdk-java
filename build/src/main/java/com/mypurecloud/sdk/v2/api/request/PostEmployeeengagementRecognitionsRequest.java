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

public class PostEmployeeengagementRecognitionsRequest {

	private CreateRecognition body;
	public CreateRecognition getBody() {
		return this.body;
	}

	public void setBody(CreateRecognition body) {
		this.body = body;
	}

	public PostEmployeeengagementRecognitionsRequest withBody(CreateRecognition body) {
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

    public PostEmployeeengagementRecognitionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CreateRecognition> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostEmployeeengagementRecognitionsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/employeeengagement/recognitions")
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


	public static Builder builder(CreateRecognition body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PostEmployeeengagementRecognitionsRequest request;

		private Builder() {
			request = new PostEmployeeengagementRecognitionsRequest();
		}


		public Builder withBody(CreateRecognition body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(CreateRecognition body) {
			request.setBody(body);

			return this;
		}


		public PostEmployeeengagementRecognitionsRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostEmployeeengagementRecognitionsRequest.");
            }
            
			return request;
		}
	}
}
