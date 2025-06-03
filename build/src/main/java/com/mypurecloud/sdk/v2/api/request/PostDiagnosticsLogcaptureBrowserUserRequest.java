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
import com.mypurecloud.sdk.v2.model.LogCaptureDownloadExecutionResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryRequest;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfiguration;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationListing;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationResponse;

public class PostDiagnosticsLogcaptureBrowserUserRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PostDiagnosticsLogcaptureBrowserUserRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private LogCaptureUserConfiguration body;
	public LogCaptureUserConfiguration getBody() {
		return this.body;
	}

	public void setBody(LogCaptureUserConfiguration body) {
		this.body = body;
	}

	public PostDiagnosticsLogcaptureBrowserUserRequest withBody(LogCaptureUserConfiguration body) {
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

    public PostDiagnosticsLogcaptureBrowserUserRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LogCaptureUserConfiguration> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PostDiagnosticsLogcaptureBrowserUserRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/diagnostics/logcapture/browser/users/{userId}")
                .withPathParameter("userId", userId)
        
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


	public static Builder builder(String userId) {
	    return new Builder()
	            .withRequiredParams(userId);
	}


	public static class Builder {
		private final PostDiagnosticsLogcaptureBrowserUserRequest request;

		private Builder() {
			request = new PostDiagnosticsLogcaptureBrowserUserRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withBody(LogCaptureUserConfiguration body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String userId) {
			request.setUserId(userId);

			return this;
		}


		public PostDiagnosticsLogcaptureBrowserUserRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PostDiagnosticsLogcaptureBrowserUserRequest.");
            }
            
			return request;
		}
	}
}
