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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;

public class PostAuthorizationDivisionObjectRequest {
    
	private String divisionId;
	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public PostAuthorizationDivisionObjectRequest withDivisionId(String divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 
	
	private String objectType;
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public PostAuthorizationDivisionObjectRequest withObjectType(String objectType) {
	    this.setObjectType(objectType);
	    return this;
	} 

	public enum objectTypeValues { 
		QUEUE("QUEUE"), 
		CAMPAIGN("CAMPAIGN"), 
		CONTACTLIST("CONTACTLIST"), 
		DNCLIST("DNCLIST"), 
		EMAILCAMPAIGN("EMAILCAMPAIGN"), 
		MESSAGINGCAMPAIGN("MESSAGINGCAMPAIGN"), 
		MANAGEMENTUNIT("MANAGEMENTUNIT"), 
		BUSINESSUNIT("BUSINESSUNIT"), 
		FLOW("FLOW"), 
		FLOWMILESTONE("FLOWMILESTONE"), 
		FLOWOUTCOME("FLOWOUTCOME"), 
		USER("USER"), 
		CALLROUTE("CALLROUTE"), 
		EMERGENCYGROUPS("EMERGENCYGROUPS"), 
		ROUTINGSCHEDULES("ROUTINGSCHEDULES"), 
		ROUTINGSCHEDULEGROUPS("ROUTINGSCHEDULEGROUPS"), 
		DATATABLES("DATATABLES"), 
		TEAM("TEAM"), 
		WORKBIN("WORKBIN"), 
		WORKTYPE("WORKTYPE");

		private String value;

		objectTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static objectTypeValues fromString(String key) {
			if (key == null) return null;

			for (objectTypeValues value : objectTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return objectTypeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private List<String> body;
	public List<String> getBody() {
		return this.body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public PostAuthorizationDivisionObjectRequest withBody(List<String> body) {
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

    public PostAuthorizationDivisionObjectRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<String>> withHttpInfo() {
        
        // verify the required parameter 'divisionId' is set
        if (this.divisionId == null) {
            throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostAuthorizationDivisionObjectRequest.");
        }
        
        // verify the required parameter 'objectType' is set
        if (this.objectType == null) {
            throw new IllegalStateException("Missing the required parameter 'objectType' when building request for PostAuthorizationDivisionObjectRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationDivisionObjectRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/authorization/divisions/{divisionId}/objects/{objectType}")
                .withPathParameter("divisionId", divisionId)
        
                .withPathParameter("objectType", objectType)
        
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

	
	public static Builder builder(String divisionId, String objectType, List<String> body) {
	    return new Builder()
	            .withRequiredParams(divisionId, objectType, body);
	}
	

	public static class Builder {
		private final PostAuthorizationDivisionObjectRequest request;

		private Builder() {
			request = new PostAuthorizationDivisionObjectRequest();
		}

		
		public Builder withDivisionId(String divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}
		
		public Builder withObjectType(String objectType) {
			request.setObjectType(objectType);
			return this;
		}

		public Builder withObjectType(objectTypeValues objectType) {
		    request.setObjectType(objectType.toString());
		    return this;
		}
		
		public Builder withBody(List<String> body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String divisionId, String objectType, List<String> body) {
			request.setDivisionId(divisionId);
						request.setObjectType(objectType);
						request.setBody(body);
			
			return this;
		}
		

		public PostAuthorizationDivisionObjectRequest build() {
            
            // verify the required parameter 'divisionId' is set
            if (request.divisionId == null) {
                throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostAuthorizationDivisionObjectRequest.");
            }
            
            // verify the required parameter 'objectType' is set
            if (request.objectType == null) {
                throw new IllegalStateException("Missing the required parameter 'objectType' when building request for PostAuthorizationDivisionObjectRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAuthorizationDivisionObjectRequest.");
            }
            
			return request;
		}
	}
}
