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

import com.mypurecloud.sdk.v2.model.DevelopmentActivityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.DevelopmentActivity;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateResponse;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateParam;

public class GetUsersDevelopmentActivityRequest {
    
	private String activityId;
	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public GetUsersDevelopmentActivityRequest withActivityId(String activityId) {
	    this.setActivityId(activityId);
	    return this;
	} 
	
	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetUsersDevelopmentActivityRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		INFORMATIONAL("Informational"), 
		ASSESSEDCONTENT("AssessedContent"), 
		QUESTIONNAIRE("Questionnaire"), 
		COACHING("Coaching");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetUsersDevelopmentActivityRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'activityId' is set
        if (this.activityId == null) {
            throw new IllegalStateException("Missing the required parameter 'activityId' when building request for GetUsersDevelopmentActivityRequest.");
        }
        
        // verify the required parameter 'type' is set
        if (this.type == null) {
            throw new IllegalStateException("Missing the required parameter 'type' when building request for GetUsersDevelopmentActivityRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/development/activities/{activityId}")
                .withPathParameter("activityId", activityId)
        
                .withQueryParameters("type", "", type)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String activityId, String type) {
	    return new Builder()
	            .withRequiredParams(activityId, type);
	}
	

	public static class Builder {
		private final GetUsersDevelopmentActivityRequest request;

		private Builder() {
			request = new GetUsersDevelopmentActivityRequest();
		}

		
		public Builder withActivityId(String activityId) {
			request.setActivityId(activityId);
			return this;
		}
		
		public Builder withType(String type) {
			request.setType(type);
			return this;
		}

		public Builder withType(typeValues type) {
		    request.setType(type.toString());
		    return this;
		}
		

		
		public Builder withRequiredParams(String activityId, String type) {
			request.setActivityId(activityId);
						request.setType(type);
			
			return this;
		}
		

		public GetUsersDevelopmentActivityRequest build() {
            
            // verify the required parameter 'activityId' is set
            if (request.activityId == null) {
                throw new IllegalStateException("Missing the required parameter 'activityId' when building request for GetUsersDevelopmentActivityRequest.");
            }
            
            // verify the required parameter 'type' is set
            if (request.type == null) {
                throw new IllegalStateException("Missing the required parameter 'type' when building request for GetUsersDevelopmentActivityRequest.");
            }
            
			return request;
		}
	}
}
