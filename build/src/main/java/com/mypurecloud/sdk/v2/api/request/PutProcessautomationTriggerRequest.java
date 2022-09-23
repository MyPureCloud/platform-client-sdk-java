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

public class PutProcessautomationTriggerRequest {

	private String triggerId;
	public String getTriggerId() {
		return this.triggerId;
	}

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}

	public PutProcessautomationTriggerRequest withTriggerId(String triggerId) {
	    this.setTriggerId(triggerId);
	    return this;
	} 

	private UpdateTriggerRequest body;
	public UpdateTriggerRequest getBody() {
		return this.body;
	}

	public void setBody(UpdateTriggerRequest body) {
		this.body = body;
	}

	public PutProcessautomationTriggerRequest withBody(UpdateTriggerRequest body) {
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

    public PutProcessautomationTriggerRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UpdateTriggerRequest> withHttpInfo() {
        
        // verify the required parameter 'triggerId' is set
        if (this.triggerId == null) {
            throw new IllegalStateException("Missing the required parameter 'triggerId' when building request for PutProcessautomationTriggerRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutProcessautomationTriggerRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/processautomation/triggers/{triggerId}")
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


	public static Builder builder(String triggerId, UpdateTriggerRequest body) {
	    return new Builder()
	            .withRequiredParams(triggerId, body);
	}


	public static class Builder {
		private final PutProcessautomationTriggerRequest request;

		private Builder() {
			request = new PutProcessautomationTriggerRequest();
		}


		public Builder withTriggerId(String triggerId) {
			request.setTriggerId(triggerId);
			return this;
		}

		public Builder withBody(UpdateTriggerRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String triggerId, UpdateTriggerRequest body) {
			request.setTriggerId(triggerId);
			request.setBody(body);

			return this;
		}


		public PutProcessautomationTriggerRequest build() {
            
            // verify the required parameter 'triggerId' is set
            if (request.triggerId == null) {
                throw new IllegalStateException("Missing the required parameter 'triggerId' when building request for PutProcessautomationTriggerRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutProcessautomationTriggerRequest.");
            }
            
			return request;
		}
	}
}
