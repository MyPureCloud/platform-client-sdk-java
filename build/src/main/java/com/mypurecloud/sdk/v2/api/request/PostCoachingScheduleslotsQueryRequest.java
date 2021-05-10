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
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotation;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponseList;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentResponseList;
import com.mypurecloud.sdk.v2.model.CoachingNotification;
import com.mypurecloud.sdk.v2.model.CoachingNotificationList;
import com.mypurecloud.sdk.v2.model.UpdateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentStatusResponse;
import com.mypurecloud.sdk.v2.model.CoachingAnnotationCreateRequest;
import com.mypurecloud.sdk.v2.model.AddConversationResponse;
import com.mypurecloud.sdk.v2.model.AddConversationRequest;
import com.mypurecloud.sdk.v2.model.CreateCoachingAppointmentRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateRequest;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.CoachingSlotsRequest;
import com.mypurecloud.sdk.v2.model.CoachingSlotsResponse;

public class PostCoachingScheduleslotsQueryRequest {
    
	private CoachingSlotsRequest body;
	public CoachingSlotsRequest getBody() {
		return this.body;
	}

	public void setBody(CoachingSlotsRequest body) {
		this.body = body;
	}

	public PostCoachingScheduleslotsQueryRequest withBody(CoachingSlotsRequest body) {
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

    public PostCoachingScheduleslotsQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CoachingSlotsRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostCoachingScheduleslotsQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/coaching/scheduleslots/query")
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

	
	public static Builder builder(CoachingSlotsRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostCoachingScheduleslotsQueryRequest request;

		private Builder() {
			request = new PostCoachingScheduleslotsQueryRequest();
		}

		
		public Builder withBody(CoachingSlotsRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(CoachingSlotsRequest body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostCoachingScheduleslotsQueryRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostCoachingScheduleslotsQueryRequest.");
            }
            
			return request;
		}
	}
}
