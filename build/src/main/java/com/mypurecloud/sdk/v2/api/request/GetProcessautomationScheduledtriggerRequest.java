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

import com.mypurecloud.sdk.v2.model.CreateScheduledTriggerRequest;
import com.mypurecloud.sdk.v2.model.CreateTriggerRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScheduledTrigger;
import com.mypurecloud.sdk.v2.model.ScheduledTriggerEntityListing;
import com.mypurecloud.sdk.v2.model.TestModeEventResults;
import com.mypurecloud.sdk.v2.model.TestModeResults;
import com.mypurecloud.sdk.v2.model.TopicCursorEntityListing;
import com.mypurecloud.sdk.v2.model.Trigger;
import com.mypurecloud.sdk.v2.model.TriggerEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateScheduledTriggerRequest;
import com.mypurecloud.sdk.v2.model.UpdateTriggerRequest;

public class GetProcessautomationScheduledtriggerRequest {

	private String scheduledTriggerId;
	public String getScheduledTriggerId() {
		return this.scheduledTriggerId;
	}

	public void setScheduledTriggerId(String scheduledTriggerId) {
		this.scheduledTriggerId = scheduledTriggerId;
	}

	public GetProcessautomationScheduledtriggerRequest withScheduledTriggerId(String scheduledTriggerId) {
	    this.setScheduledTriggerId(scheduledTriggerId);
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

    public GetProcessautomationScheduledtriggerRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scheduledTriggerId' is set
        if (this.scheduledTriggerId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduledTriggerId' when building request for GetProcessautomationScheduledtriggerRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/processautomation/scheduledtriggers/{scheduledTriggerId}")
                .withPathParameter("scheduledTriggerId", scheduledTriggerId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String scheduledTriggerId) {
	    return new Builder()
	            .withRequiredParams(scheduledTriggerId);
	}


	public static class Builder {
		private final GetProcessautomationScheduledtriggerRequest request;

		private Builder() {
			request = new GetProcessautomationScheduledtriggerRequest();
		}


		public Builder withScheduledTriggerId(String scheduledTriggerId) {
			request.setScheduledTriggerId(scheduledTriggerId);
			return this;
		}



		public Builder withRequiredParams(String scheduledTriggerId) {
			request.setScheduledTriggerId(scheduledTriggerId);

			return this;
		}


		public GetProcessautomationScheduledtriggerRequest build() {
            
            // verify the required parameter 'scheduledTriggerId' is set
            if (request.scheduledTriggerId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduledTriggerId' when building request for GetProcessautomationScheduledtriggerRequest.");
            }
            
			return request;
		}
	}
}
