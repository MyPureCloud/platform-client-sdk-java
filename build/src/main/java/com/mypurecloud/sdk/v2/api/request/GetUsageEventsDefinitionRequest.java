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
import com.mypurecloud.sdk.v2.model.EventDefinition;
import com.mypurecloud.sdk.v2.model.EventDefinitionListing;

public class GetUsageEventsDefinitionRequest {

	private String eventDefinitionId;
	public String getEventDefinitionId() {
		return this.eventDefinitionId;
	}

	public void setEventDefinitionId(String eventDefinitionId) {
		this.eventDefinitionId = eventDefinitionId;
	}

	public GetUsageEventsDefinitionRequest withEventDefinitionId(String eventDefinitionId) {
	    this.setEventDefinitionId(eventDefinitionId);
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

    public GetUsageEventsDefinitionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'eventDefinitionId' is set
        if (this.eventDefinitionId == null) {
            throw new IllegalStateException("Missing the required parameter 'eventDefinitionId' when building request for GetUsageEventsDefinitionRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/usage/events/definitions/{eventDefinitionId}")
                .withPathParameter("eventDefinitionId", eventDefinitionId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String eventDefinitionId) {
	    return new Builder()
	            .withRequiredParams(eventDefinitionId);
	}


	public static class Builder {
		private final GetUsageEventsDefinitionRequest request;

		private Builder() {
			request = new GetUsageEventsDefinitionRequest();
		}


		public Builder withEventDefinitionId(String eventDefinitionId) {
			request.setEventDefinitionId(eventDefinitionId);
			return this;
		}



		public Builder withRequiredParams(String eventDefinitionId) {
			request.setEventDefinitionId(eventDefinitionId);

			return this;
		}


		public GetUsageEventsDefinitionRequest build() {
            
            // verify the required parameter 'eventDefinitionId' is set
            if (request.eventDefinitionId == null) {
                throw new IllegalStateException("Missing the required parameter 'eventDefinitionId' when building request for GetUsageEventsDefinitionRequest.");
            }
            
			return request;
		}
	}
}
