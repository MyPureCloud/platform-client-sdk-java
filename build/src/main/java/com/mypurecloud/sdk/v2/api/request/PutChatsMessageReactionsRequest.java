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

import com.mypurecloud.sdk.v2.model.ChatMessageEntityListing;
import com.mypurecloud.sdk.v2.model.ChatMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatReactionUpdate;
import com.mypurecloud.sdk.v2.model.ChatSendMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatSettings;
import com.mypurecloud.sdk.v2.model.ChatUserSettings;
import com.mypurecloud.sdk.v2.model.CreateRoomRequest;
import com.mypurecloud.sdk.v2.model.CreateRoomResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OneOnOne;
import com.mypurecloud.sdk.v2.model.PinnedMessageRequest;
import com.mypurecloud.sdk.v2.model.Room;
import com.mypurecloud.sdk.v2.model.RoomParticipant;
import com.mypurecloud.sdk.v2.model.RoomParticipantsResponse;
import com.mypurecloud.sdk.v2.model.RoomUpdateRequest;
import com.mypurecloud.sdk.v2.model.SendMessageBody;
import com.mypurecloud.sdk.v2.model.UserSettingsForChat;

public class PutChatsMessageReactionsRequest {

	private String messageId;
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public PutChatsMessageReactionsRequest withMessageId(String messageId) {
	    this.setMessageId(messageId);
	    return this;
	} 

	private ChatReactionUpdate body;
	public ChatReactionUpdate getBody() {
		return this.body;
	}

	public void setBody(ChatReactionUpdate body) {
		this.body = body;
	}

	public PutChatsMessageReactionsRequest withBody(ChatReactionUpdate body) {
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

    public PutChatsMessageReactionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ChatReactionUpdate> withHttpInfo() {
        
        // verify the required parameter 'messageId' is set
        if (this.messageId == null) {
            throw new IllegalStateException("Missing the required parameter 'messageId' when building request for PutChatsMessageReactionsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutChatsMessageReactionsRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/chats/messages/{messageId}/reactions")
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


	public static Builder builder(String messageId, ChatReactionUpdate body) {
	    return new Builder()
	            .withRequiredParams(messageId, body);
	}


	public static class Builder {
		private final PutChatsMessageReactionsRequest request;

		private Builder() {
			request = new PutChatsMessageReactionsRequest();
		}


		public Builder withMessageId(String messageId) {
			request.setMessageId(messageId);
			return this;
		}

		public Builder withBody(ChatReactionUpdate body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String messageId, ChatReactionUpdate body) {
			request.setMessageId(messageId);
			request.setBody(body);

			return this;
		}


		public PutChatsMessageReactionsRequest build() {
            
            // verify the required parameter 'messageId' is set
            if (request.messageId == null) {
                throw new IllegalStateException("Missing the required parameter 'messageId' when building request for PutChatsMessageReactionsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutChatsMessageReactionsRequest.");
            }
            
			return request;
		}
	}
}
