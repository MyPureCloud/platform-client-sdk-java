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

import com.mypurecloud.sdk.v2.model.AgentGreeting;
import com.mypurecloud.sdk.v2.model.Callheader;
import com.mypurecloud.sdk.v2.model.Callmessage;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MediaRegions;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SelfAgentGreeting;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;

public class GetTelephonySipmessagesConversationHeadersRequest {

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetTelephonySipmessagesConversationHeadersRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 

	private List<String> keys;
	public List<String> getKeys() {
		return this.keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	public GetTelephonySipmessagesConversationHeadersRequest withKeys(List<String> keys) {
	    this.setKeys(keys);
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

    public GetTelephonySipmessagesConversationHeadersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetTelephonySipmessagesConversationHeadersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/sipmessages/conversations/{conversationId}/headers")
                .withPathParameter("conversationId", conversationId)
        

                .withQueryParameters("keys", "multi", keys)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String conversationId) {
	    return new Builder()
	            .withRequiredParams(conversationId);
	}


	public static class Builder {
		private final GetTelephonySipmessagesConversationHeadersRequest request;

		private Builder() {
			request = new GetTelephonySipmessagesConversationHeadersRequest();
		}


		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}

		public Builder withKeys(List<String> keys) {
			request.setKeys(keys);
			return this;
		}



		public Builder withRequiredParams(String conversationId) {
			request.setConversationId(conversationId);

			return this;
		}


		public GetTelephonySipmessagesConversationHeadersRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetTelephonySipmessagesConversationHeadersRequest.");
            }
            
			return request;
		}
	}
}
