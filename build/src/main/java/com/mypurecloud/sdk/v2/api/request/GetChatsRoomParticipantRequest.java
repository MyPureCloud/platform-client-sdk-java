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

public class GetChatsRoomParticipantRequest {

	private String roomJid;
	public String getRoomJid() {
		return this.roomJid;
	}

	public void setRoomJid(String roomJid) {
		this.roomJid = roomJid;
	}

	public GetChatsRoomParticipantRequest withRoomJid(String roomJid) {
	    this.setRoomJid(roomJid);
	    return this;
	} 

	private String participantJid;
	public String getParticipantJid() {
		return this.participantJid;
	}

	public void setParticipantJid(String participantJid) {
		this.participantJid = participantJid;
	}

	public GetChatsRoomParticipantRequest withParticipantJid(String participantJid) {
	    this.setParticipantJid(participantJid);
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

    public GetChatsRoomParticipantRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'roomJid' is set
        if (this.roomJid == null) {
            throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for GetChatsRoomParticipantRequest.");
        }
        
        // verify the required parameter 'participantJid' is set
        if (this.participantJid == null) {
            throw new IllegalStateException("Missing the required parameter 'participantJid' when building request for GetChatsRoomParticipantRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/chats/rooms/{roomJid}/participants/{participantJid}")
                .withPathParameter("roomJid", roomJid)
        
                .withPathParameter("participantJid", participantJid)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String roomJid, String participantJid) {
	    return new Builder()
	            .withRequiredParams(roomJid, participantJid);
	}


	public static class Builder {
		private final GetChatsRoomParticipantRequest request;

		private Builder() {
			request = new GetChatsRoomParticipantRequest();
		}


		public Builder withRoomJid(String roomJid) {
			request.setRoomJid(roomJid);
			return this;
		}

		public Builder withParticipantJid(String participantJid) {
			request.setParticipantJid(participantJid);
			return this;
		}



		public Builder withRequiredParams(String roomJid, String participantJid) {
			request.setRoomJid(roomJid);
			request.setParticipantJid(participantJid);

			return this;
		}


		public GetChatsRoomParticipantRequest build() {
            
            // verify the required parameter 'roomJid' is set
            if (request.roomJid == null) {
                throw new IllegalStateException("Missing the required parameter 'roomJid' when building request for GetChatsRoomParticipantRequest.");
            }
            
            // verify the required parameter 'participantJid' is set
            if (request.participantJid == null) {
                throw new IllegalStateException("Missing the required parameter 'participantJid' when building request for GetChatsRoomParticipantRequest.");
            }
            
			return request;
		}
	}
}
