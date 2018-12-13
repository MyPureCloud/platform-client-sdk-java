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

public class PatchVoicemailMessageRequest {
    
	private String messageId;
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public PatchVoicemailMessageRequest withMessageId(String messageId) {
	    this.setMessageId(messageId);
	    return this;
	} 
	
	private VoicemailMessage body;
	public VoicemailMessage getBody() {
		return this.body;
	}

	public void setBody(VoicemailMessage body) {
		this.body = body;
	}

	public PatchVoicemailMessageRequest withBody(VoicemailMessage body) {
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

    public PatchVoicemailMessageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<VoicemailMessage> withHttpInfo() {
        
        // verify the required parameter 'messageId' is set
        if (this.messageId == null) {
            throw new IllegalStateException("Missing the required parameter 'messageId' when building request for PatchVoicemailMessageRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchVoicemailMessageRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/voicemail/messages/{messageId}")
                .withPathParameter("messageId", messageId)
        
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

	
	public static Builder builder(String messageId, VoicemailMessage body) {
	    return new Builder()
	            .withRequiredParams(messageId, body);
	}
	

	public static class Builder {
		private final PatchVoicemailMessageRequest request;

		private Builder() {
			request = new PatchVoicemailMessageRequest();
		}

		
		public Builder withMessageId(String messageId) {
			request.setMessageId(messageId);
			return this;
		}
		
		public Builder withBody(VoicemailMessage body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String messageId, VoicemailMessage body) {
			request.setMessageId(messageId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchVoicemailMessageRequest build() {
            
            // verify the required parameter 'messageId' is set
            if (request.messageId == null) {
                throw new IllegalStateException("Missing the required parameter 'messageId' when building request for PatchVoicemailMessageRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchVoicemailMessageRequest.");
            }
            
			return request;
		}
	}
}
