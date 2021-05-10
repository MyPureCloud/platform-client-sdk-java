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

public class PatchCoachingAppointmentStatusRequest {
    
	private String appointmentId;
	public String getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public PatchCoachingAppointmentStatusRequest withAppointmentId(String appointmentId) {
	    this.setAppointmentId(appointmentId);
	    return this;
	} 
	
	private CoachingAppointmentStatusRequest body;
	public CoachingAppointmentStatusRequest getBody() {
		return this.body;
	}

	public void setBody(CoachingAppointmentStatusRequest body) {
		this.body = body;
	}

	public PatchCoachingAppointmentStatusRequest withBody(CoachingAppointmentStatusRequest body) {
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

    public PatchCoachingAppointmentStatusRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CoachingAppointmentStatusRequest> withHttpInfo() {
        
        // verify the required parameter 'appointmentId' is set
        if (this.appointmentId == null) {
            throw new IllegalStateException("Missing the required parameter 'appointmentId' when building request for PatchCoachingAppointmentStatusRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCoachingAppointmentStatusRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/coaching/appointments/{appointmentId}/status")
                .withPathParameter("appointmentId", appointmentId)
        
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

	
	public static Builder builder(String appointmentId, CoachingAppointmentStatusRequest body) {
	    return new Builder()
	            .withRequiredParams(appointmentId, body);
	}
	

	public static class Builder {
		private final PatchCoachingAppointmentStatusRequest request;

		private Builder() {
			request = new PatchCoachingAppointmentStatusRequest();
		}

		
		public Builder withAppointmentId(String appointmentId) {
			request.setAppointmentId(appointmentId);
			return this;
		}
		
		public Builder withBody(CoachingAppointmentStatusRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String appointmentId, CoachingAppointmentStatusRequest body) {
			request.setAppointmentId(appointmentId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchCoachingAppointmentStatusRequest build() {
            
            // verify the required parameter 'appointmentId' is set
            if (request.appointmentId == null) {
                throw new IllegalStateException("Missing the required parameter 'appointmentId' when building request for PatchCoachingAppointmentStatusRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCoachingAppointmentStatusRequest.");
            }
            
			return request;
		}
	}
}
