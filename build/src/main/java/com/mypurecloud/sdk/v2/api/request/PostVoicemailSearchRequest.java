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

public class PostVoicemailSearchRequest {
    
	private VoicemailSearchRequest body;
	public VoicemailSearchRequest getBody() {
		return this.body;
	}

	public void setBody(VoicemailSearchRequest body) {
		this.body = body;
	}

	public PostVoicemailSearchRequest withBody(VoicemailSearchRequest body) {
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

    public PostVoicemailSearchRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<VoicemailSearchRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostVoicemailSearchRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/voicemail/search")
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

	
	public static Builder builder(VoicemailSearchRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}
	

	public static class Builder {
		private final PostVoicemailSearchRequest request;

		private Builder() {
			request = new PostVoicemailSearchRequest();
		}

		
		public Builder withBody(VoicemailSearchRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(VoicemailSearchRequest body) {
			request.setBody(body);
			
			return this;
		}
		

		public PostVoicemailSearchRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostVoicemailSearchRequest.");
            }
            
			return request;
		}
	}
}
