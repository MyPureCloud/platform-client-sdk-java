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

import com.mypurecloud.sdk.v2.model.CreateTriggerRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TestModeEventResults;
import com.mypurecloud.sdk.v2.model.TestModeResults;
import com.mypurecloud.sdk.v2.model.TopicCursorEntityListing;
import com.mypurecloud.sdk.v2.model.Trigger;
import com.mypurecloud.sdk.v2.model.TriggerEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateTriggerRequest;

public class PostProcessautomationTriggerTestRequest {

	private String triggerId;
	public String getTriggerId() {
		return this.triggerId;
	}

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}

	public PostProcessautomationTriggerTestRequest withTriggerId(String triggerId) {
	    this.setTriggerId(triggerId);
	    return this;
	} 

	private String body;
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public PostProcessautomationTriggerTestRequest withBody(String body) {
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

    public PostProcessautomationTriggerTestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<String> withHttpInfo() {
        
        // verify the required parameter 'triggerId' is set
        if (this.triggerId == null) {
            throw new IllegalStateException("Missing the required parameter 'triggerId' when building request for PostProcessautomationTriggerTestRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/processautomation/triggers/{triggerId}/test")
                .withPathParameter("triggerId", triggerId)
        
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


	public static Builder builder(String triggerId) {
	    return new Builder()
	            .withRequiredParams(triggerId);
	}


	public static class Builder {
		private final PostProcessautomationTriggerTestRequest request;

		private Builder() {
			request = new PostProcessautomationTriggerTestRequest();
		}


		public Builder withTriggerId(String triggerId) {
			request.setTriggerId(triggerId);
			return this;
		}

		public Builder withBody(String body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String triggerId) {
			request.setTriggerId(triggerId);

			return this;
		}


		public PostProcessautomationTriggerTestRequest build() {
            
            // verify the required parameter 'triggerId' is set
            if (request.triggerId == null) {
                throw new IllegalStateException("Missing the required parameter 'triggerId' when building request for PostProcessautomationTriggerTestRequest.");
            }
            
			return request;
		}
	}
}
