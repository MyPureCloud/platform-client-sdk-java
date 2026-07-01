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
import com.mypurecloud.sdk.v2.model.ScreenMonitorSettings;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringDetails;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSession;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSessionEntityListing;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringUserDetailsEntityListing;
import com.mypurecloud.sdk.v2.model.StartScreenMonitorResponseBody;

public class DeleteUserScreenmonitorsSessionRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public DeleteUserScreenmonitorsSessionRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String screenMonitoringId;
	public String getScreenMonitoringId() {
		return this.screenMonitoringId;
	}

	public void setScreenMonitoringId(String screenMonitoringId) {
		this.screenMonitoringId = screenMonitoringId;
	}

	public DeleteUserScreenmonitorsSessionRequest withScreenMonitoringId(String screenMonitoringId) {
	    this.setScreenMonitoringId(screenMonitoringId);
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

    public DeleteUserScreenmonitorsSessionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteUserScreenmonitorsSessionRequest.");
        }
        
        // verify the required parameter 'screenMonitoringId' is set
        if (this.screenMonitoringId == null) {
            throw new IllegalStateException("Missing the required parameter 'screenMonitoringId' when building request for DeleteUserScreenmonitorsSessionRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/users/{userId}/screenmonitors/sessions/{screenMonitoringId}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("screenMonitoringId", screenMonitoringId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String userId, String screenMonitoringId) {
	    return new Builder()
	            .withRequiredParams(userId, screenMonitoringId);
	}


	public static class Builder {
		private final DeleteUserScreenmonitorsSessionRequest request;

		private Builder() {
			request = new DeleteUserScreenmonitorsSessionRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withScreenMonitoringId(String screenMonitoringId) {
			request.setScreenMonitoringId(screenMonitoringId);
			return this;
		}



		public Builder withRequiredParams(String userId, String screenMonitoringId) {
			request.setUserId(userId);
			request.setScreenMonitoringId(screenMonitoringId);

			return this;
		}


		public DeleteUserScreenmonitorsSessionRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteUserScreenmonitorsSessionRequest.");
            }
            
            // verify the required parameter 'screenMonitoringId' is set
            if (request.screenMonitoringId == null) {
                throw new IllegalStateException("Missing the required parameter 'screenMonitoringId' when building request for DeleteUserScreenmonitorsSessionRequest.");
            }
            
			return request;
		}
	}
}
