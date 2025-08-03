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
import com.mypurecloud.sdk.v2.model.UserChatSettingsPost;
import com.mypurecloud.sdk.v2.model.UserSettingsForChat;

public class DeleteChatsUserMessagesPinRequest {

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public DeleteChatsUserMessagesPinRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 

	private String pinnedMessageId;
	public String getPinnedMessageId() {
		return this.pinnedMessageId;
	}

	public void setPinnedMessageId(String pinnedMessageId) {
		this.pinnedMessageId = pinnedMessageId;
	}

	public DeleteChatsUserMessagesPinRequest withPinnedMessageId(String pinnedMessageId) {
	    this.setPinnedMessageId(pinnedMessageId);
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

    public DeleteChatsUserMessagesPinRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteChatsUserMessagesPinRequest.");
        }
        
        // verify the required parameter 'pinnedMessageId' is set
        if (this.pinnedMessageId == null) {
            throw new IllegalStateException("Missing the required parameter 'pinnedMessageId' when building request for DeleteChatsUserMessagesPinRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/chats/users/{userId}/messages/pins/{pinnedMessageId}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("pinnedMessageId", pinnedMessageId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String userId, String pinnedMessageId) {
	    return new Builder()
	            .withRequiredParams(userId, pinnedMessageId);
	}


	public static class Builder {
		private final DeleteChatsUserMessagesPinRequest request;

		private Builder() {
			request = new DeleteChatsUserMessagesPinRequest();
		}


		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}

		public Builder withPinnedMessageId(String pinnedMessageId) {
			request.setPinnedMessageId(pinnedMessageId);
			return this;
		}



		public Builder withRequiredParams(String userId, String pinnedMessageId) {
			request.setUserId(userId);
			request.setPinnedMessageId(pinnedMessageId);

			return this;
		}


		public DeleteChatsUserMessagesPinRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteChatsUserMessagesPinRequest.");
            }
            
            // verify the required parameter 'pinnedMessageId' is set
            if (request.pinnedMessageId == null) {
                throw new IllegalStateException("Missing the required parameter 'pinnedMessageId' when building request for DeleteChatsUserMessagesPinRequest.");
            }
            
			return request;
		}
	}
}
