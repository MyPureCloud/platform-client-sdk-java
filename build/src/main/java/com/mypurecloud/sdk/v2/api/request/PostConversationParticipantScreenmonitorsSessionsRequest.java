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
import com.mypurecloud.sdk.v2.model.ScreenMonitorSettings;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringDetails;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSession;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringSessionEntityListing;
import com.mypurecloud.sdk.v2.model.ScreenMonitoringUserDetailsEntityListing;
import com.mypurecloud.sdk.v2.model.StartScreenMonitorResponseBody;

public class PostConversationParticipantScreenmonitorsSessionsRequest {

	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PostConversationParticipantScreenmonitorsSessionsRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 

	private String participantId;
	public String getParticipantId() {
		return this.participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public PostConversationParticipantScreenmonitorsSessionsRequest withParticipantId(String participantId) {
	    this.setParticipantId(participantId);
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

    public PostConversationParticipantScreenmonitorsSessionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PostConversationParticipantScreenmonitorsSessionsRequest.");
        }
        
        // verify the required parameter 'participantId' is set
        if (this.participantId == null) {
            throw new IllegalStateException("Missing the required parameter 'participantId' when building request for PostConversationParticipantScreenmonitorsSessionsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/conversations/{conversationId}/participants/{participantId}/screenmonitors/sessions")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("participantId", participantId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String conversationId, String participantId) {
	    return new Builder()
	            .withRequiredParams(conversationId, participantId);
	}


	public static class Builder {
		private final PostConversationParticipantScreenmonitorsSessionsRequest request;

		private Builder() {
			request = new PostConversationParticipantScreenmonitorsSessionsRequest();
		}


		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}

		public Builder withParticipantId(String participantId) {
			request.setParticipantId(participantId);
			return this;
		}



		public Builder withRequiredParams(String conversationId, String participantId) {
			request.setConversationId(conversationId);
			request.setParticipantId(participantId);

			return this;
		}


		public PostConversationParticipantScreenmonitorsSessionsRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PostConversationParticipantScreenmonitorsSessionsRequest.");
            }
            
            // verify the required parameter 'participantId' is set
            if (request.participantId == null) {
                throw new IllegalStateException("Missing the required parameter 'participantId' when building request for PostConversationParticipantScreenmonitorsSessionsRequest.");
            }
            
			return request;
		}
	}
}
