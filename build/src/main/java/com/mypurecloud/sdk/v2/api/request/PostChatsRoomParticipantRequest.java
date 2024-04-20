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

public class PostChatsRoomParticipantRequest {

	private String roomJid;
	public String getRoomJid() {
		return this.roomJid;
	}

	public void setRoomJid(String roomJid) {
		this.roomJid = roomJid;
	}

	public PostChatsRoomParticipantRequest withRoomJid(String roomJid) {
	    this.setRoomJid(roomJid);
	    return this;
	} 

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PostChatsRoomParticipantRequest withUserId(String userId) {
	    this.setUserId(userId);
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

    public PostChatsRoomParticipantRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'roomJid' is set
        if (this.roomJid == null) {
            throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for PostChatsRoomParticipantRequest.");
        }
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PostChatsRoomParticipantRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/chats/rooms/{roomJid}/participants/{userId}")
                .withPathParameter("roomJid", roomJid)
        
                .withPathParameter("userId", userId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String roomJid, String userId) {
	    return new Builder()
	            .withRequiredParams(roomJid, userId);
	}


	public static class Builder {
		private final PostChatsRoomParticipantRequest request;

		private Builder() {
			request = new PostChatsRoomParticipantRequest();
		}


		public Builder withRoomJid(String roomJid) {
			request.setRoomJid(roomJid);
			return this;
		}

		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}



		public Builder withRequiredParams(String roomJid, String userId) {
			request.setRoomJid(roomJid);
			request.setUserId(userId);

			return this;
		}


		public PostChatsRoomParticipantRequest build() {
            
            // verify the required parameter 'roomJid' is set
            if (request.roomJid == null) {
                throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for PostChatsRoomParticipantRequest.");
            }
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PostChatsRoomParticipantRequest.");
            }
            
			return request;
		}
	}
}
