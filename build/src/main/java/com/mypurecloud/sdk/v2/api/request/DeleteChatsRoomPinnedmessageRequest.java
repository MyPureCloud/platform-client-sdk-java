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
import com.mypurecloud.sdk.v2.model.ChatSendMessageResponse;
import com.mypurecloud.sdk.v2.model.ChatSettings;
import com.mypurecloud.sdk.v2.model.ChatUserSettings;
import com.mypurecloud.sdk.v2.model.CreateRoomRequest;
import com.mypurecloud.sdk.v2.model.CreateRoomResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PinnedMessageRequest;
import com.mypurecloud.sdk.v2.model.Room;
import com.mypurecloud.sdk.v2.model.RoomUpdateRequest;
import com.mypurecloud.sdk.v2.model.SendMessageBody;

public class DeleteChatsRoomPinnedmessageRequest {

	private String roomJid;
	public String getRoomJid() {
		return this.roomJid;
	}

	public void setRoomJid(String roomJid) {
		this.roomJid = roomJid;
	}

	public DeleteChatsRoomPinnedmessageRequest withRoomJid(String roomJid) {
	    this.setRoomJid(roomJid);
	    return this;
	} 

	private String pinnedMessageId;
	public String getPinnedMessageId() {
		return this.pinnedMessageId;
	}

	public void setPinnedMessageId(String pinnedMessageId) {
		this.pinnedMessageId = pinnedMessageId;
	}

	public DeleteChatsRoomPinnedmessageRequest withPinnedMessageId(String pinnedMessageId) {
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

    public DeleteChatsRoomPinnedmessageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'roomJid' is set
        if (this.roomJid == null) {
            throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for DeleteChatsRoomPinnedmessageRequest.");
        }
        
        // verify the required parameter 'pinnedMessageId' is set
        if (this.pinnedMessageId == null) {
            throw new IllegalStateException("Missing the required parameter 'pinnedMessageId' when building request for DeleteChatsRoomPinnedmessageRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/chats/rooms/{roomJid}/pinnedmessages/{pinnedMessageId}")
                .withPathParameter("roomJid", roomJid)
        
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


	public static Builder builder(String roomJid, String pinnedMessageId) {
	    return new Builder()
	            .withRequiredParams(roomJid, pinnedMessageId);
	}


	public static class Builder {
		private final DeleteChatsRoomPinnedmessageRequest request;

		private Builder() {
			request = new DeleteChatsRoomPinnedmessageRequest();
		}


		public Builder withRoomJid(String roomJid) {
			request.setRoomJid(roomJid);
			return this;
		}

		public Builder withPinnedMessageId(String pinnedMessageId) {
			request.setPinnedMessageId(pinnedMessageId);
			return this;
		}



		public Builder withRequiredParams(String roomJid, String pinnedMessageId) {
			request.setRoomJid(roomJid);
			request.setPinnedMessageId(pinnedMessageId);

			return this;
		}


		public DeleteChatsRoomPinnedmessageRequest build() {
            
            // verify the required parameter 'roomJid' is set
            if (request.roomJid == null) {
                throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for DeleteChatsRoomPinnedmessageRequest.");
            }
            
            // verify the required parameter 'pinnedMessageId' is set
            if (request.pinnedMessageId == null) {
                throw new IllegalStateException("Missing the required parameter 'pinnedMessageId' when building request for DeleteChatsRoomPinnedmessageRequest.");
            }
            
			return request;
		}
	}
}
