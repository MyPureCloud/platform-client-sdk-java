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
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequest;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequestEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfoEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.WebChatSettings;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationRequest;

public class PatchWebchatGuestConversationMediarequestRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PatchWebchatGuestConversationMediarequestRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String mediaRequestId;
	public String getMediaRequestId() {
		return this.mediaRequestId;
	}

	public void setMediaRequestId(String mediaRequestId) {
		this.mediaRequestId = mediaRequestId;
	}

	public PatchWebchatGuestConversationMediarequestRequest withMediaRequestId(String mediaRequestId) {
	    this.setMediaRequestId(mediaRequestId);
	    return this;
	} 
	
	private WebChatGuestMediaRequest body;
	public WebChatGuestMediaRequest getBody() {
		return this.body;
	}

	public void setBody(WebChatGuestMediaRequest body) {
		this.body = body;
	}

	public PatchWebchatGuestConversationMediarequestRequest withBody(WebChatGuestMediaRequest body) {
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

    public PatchWebchatGuestConversationMediarequestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebChatGuestMediaRequest> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PatchWebchatGuestConversationMediarequestRequest.");
        }
        
        // verify the required parameter 'mediaRequestId' is set
        if (this.mediaRequestId == null) {
            throw new IllegalStateException("Missing the required parameter 'mediaRequestId' when building request for PatchWebchatGuestConversationMediarequestRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchWebchatGuestConversationMediarequestRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/webchat/guest/conversations/{conversationId}/mediarequests/{mediaRequestId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("mediaRequestId", mediaRequestId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("Guest Chat JWT")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String mediaRequestId, WebChatGuestMediaRequest body) {
	    return new Builder()
	            .withRequiredParams(conversationId, mediaRequestId, body);
	}
	

	public static class Builder {
		private final PatchWebchatGuestConversationMediarequestRequest request;

		private Builder() {
			request = new PatchWebchatGuestConversationMediarequestRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withMediaRequestId(String mediaRequestId) {
			request.setMediaRequestId(mediaRequestId);
			return this;
		}
		
		public Builder withBody(WebChatGuestMediaRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String mediaRequestId, WebChatGuestMediaRequest body) {
			request.setConversationId(conversationId);
						request.setMediaRequestId(mediaRequestId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchWebchatGuestConversationMediarequestRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PatchWebchatGuestConversationMediarequestRequest.");
            }
            
            // verify the required parameter 'mediaRequestId' is set
            if (request.mediaRequestId == null) {
                throw new IllegalStateException("Missing the required parameter 'mediaRequestId' when building request for PatchWebchatGuestConversationMediarequestRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchWebchatGuestConversationMediarequestRequest.");
            }
            
			return request;
		}
	}
}
