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

public class PatchCoachingAppointmentAnnotationRequest {
    
	private String appointmentId;
	public String getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public PatchCoachingAppointmentAnnotationRequest withAppointmentId(String appointmentId) {
	    this.setAppointmentId(appointmentId);
	    return this;
	} 
	
	private String annotationId;
	public String getAnnotationId() {
		return this.annotationId;
	}

	public void setAnnotationId(String annotationId) {
		this.annotationId = annotationId;
	}

	public PatchCoachingAppointmentAnnotationRequest withAnnotationId(String annotationId) {
	    this.setAnnotationId(annotationId);
	    return this;
	} 
	
	private CoachingAnnotation body;
	public CoachingAnnotation getBody() {
		return this.body;
	}

	public void setBody(CoachingAnnotation body) {
		this.body = body;
	}

	public PatchCoachingAppointmentAnnotationRequest withBody(CoachingAnnotation body) {
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

    public PatchCoachingAppointmentAnnotationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CoachingAnnotation> withHttpInfo() {
        
        // verify the required parameter 'appointmentId' is set
        if (this.appointmentId == null) {
            throw new IllegalStateException("Missing the required parameter 'appointmentId' when building request for PatchCoachingAppointmentAnnotationRequest.");
        }
        
        // verify the required parameter 'annotationId' is set
        if (this.annotationId == null) {
            throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for PatchCoachingAppointmentAnnotationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCoachingAppointmentAnnotationRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/coaching/appointments/{appointmentId}/annotations/{annotationId}")
                .withPathParameter("appointmentId", appointmentId)
        
                .withPathParameter("annotationId", annotationId)
        
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

	
	public static Builder builder(String appointmentId, String annotationId, CoachingAnnotation body) {
	    return new Builder()
	            .withRequiredParams(appointmentId, annotationId, body);
	}
	

	public static class Builder {
		private final PatchCoachingAppointmentAnnotationRequest request;

		private Builder() {
			request = new PatchCoachingAppointmentAnnotationRequest();
		}

		
		public Builder withAppointmentId(String appointmentId) {
			request.setAppointmentId(appointmentId);
			return this;
		}
		
		public Builder withAnnotationId(String annotationId) {
			request.setAnnotationId(annotationId);
			return this;
		}
		
		public Builder withBody(CoachingAnnotation body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String appointmentId, String annotationId, CoachingAnnotation body) {
			request.setAppointmentId(appointmentId);
						request.setAnnotationId(annotationId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchCoachingAppointmentAnnotationRequest build() {
            
            // verify the required parameter 'appointmentId' is set
            if (request.appointmentId == null) {
                throw new IllegalStateException("Missing the required parameter 'appointmentId' when building request for PatchCoachingAppointmentAnnotationRequest.");
            }
            
            // verify the required parameter 'annotationId' is set
            if (request.annotationId == null) {
                throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for PatchCoachingAppointmentAnnotationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchCoachingAppointmentAnnotationRequest.");
            }
            
			return request;
		}
	}
}
