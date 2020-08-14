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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.PresenceExpand;

public class GetUserPresenceRequest {
    
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetUserPresenceRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private String sourceId;
	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public GetUserPresenceRequest withSourceId(String sourceId) {
	    this.setSourceId(sourceId);
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

    public GetUserPresenceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetUserPresenceRequest.");
        }
        
        // verify the required parameter 'sourceId' is set
        if (this.sourceId == null) {
            throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for GetUserPresenceRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/users/{userId}/presences/{sourceId}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("sourceId", sourceId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String userId, String sourceId) {
	    return new Builder()
	            .withRequiredParams(userId, sourceId);
	}
	

	public static class Builder {
		private final GetUserPresenceRequest request;

		private Builder() {
			request = new GetUserPresenceRequest();
		}

		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withSourceId(String sourceId) {
			request.setSourceId(sourceId);
			return this;
		}
		

		
		public Builder withRequiredParams(String userId, String sourceId) {
			request.setUserId(userId);
						request.setSourceId(sourceId);
			
			return this;
		}
		

		public GetUserPresenceRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetUserPresenceRequest.");
            }
            
            // verify the required parameter 'sourceId' is set
            if (request.sourceId == null) {
                throw new IllegalStateException("Missing the required parameter 'sourceId' when building request for GetUserPresenceRequest.");
            }
            
			return request;
		}
	}
}
