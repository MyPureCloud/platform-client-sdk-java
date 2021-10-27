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
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;

public class PutVoicemailUserpolicyRequest {
    
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PutVoicemailUserpolicyRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private VoicemailUserPolicy body;
	public VoicemailUserPolicy getBody() {
		return this.body;
	}

	public void setBody(VoicemailUserPolicy body) {
		this.body = body;
	}

	public PutVoicemailUserpolicyRequest withBody(VoicemailUserPolicy body) {
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

    public PutVoicemailUserpolicyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<VoicemailUserPolicy> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutVoicemailUserpolicyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutVoicemailUserpolicyRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/voicemail/userpolicies/{userId}")
                .withPathParameter("userId", userId)
        
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

	
	public static Builder builder(String userId, VoicemailUserPolicy body) {
	    return new Builder()
	            .withRequiredParams(userId, body);
	}
	

	public static class Builder {
		private final PutVoicemailUserpolicyRequest request;

		private Builder() {
			request = new PutVoicemailUserpolicyRequest();
		}

		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withBody(VoicemailUserPolicy body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String userId, VoicemailUserPolicy body) {
			request.setUserId(userId);
						request.setBody(body);
			
			return this;
		}
		

		public PutVoicemailUserpolicyRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutVoicemailUserpolicyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutVoicemailUserpolicyRequest.");
            }
            
			return request;
		}
	}
}
