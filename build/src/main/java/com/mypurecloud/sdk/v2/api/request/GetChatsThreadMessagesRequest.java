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

public class GetChatsThreadMessagesRequest {

	private String threadId;
	public String getThreadId() {
		return this.threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public GetChatsThreadMessagesRequest withThreadId(String threadId) {
	    this.setThreadId(threadId);
	    return this;
	} 

	private String limit;
	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public GetChatsThreadMessagesRequest withLimit(String limit) {
	    this.setLimit(limit);
	    return this;
	} 

	private String before;
	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GetChatsThreadMessagesRequest withBefore(String before) {
	    this.setBefore(before);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetChatsThreadMessagesRequest withAfter(String after) {
	    this.setAfter(after);
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

    public GetChatsThreadMessagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'threadId' is set
        if (this.threadId == null) {
            throw new IllegalStateException("Missing the required parameter 'threadId' when building request for GetChatsThreadMessagesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/chats/threads/{threadId}/messages")
                .withPathParameter("threadId", threadId)
        

                .withQueryParameters("limit", "", limit)
        

                .withQueryParameters("before", "", before)
        

                .withQueryParameters("after", "", after)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String threadId) {
	    return new Builder()
	            .withRequiredParams(threadId);
	}


	public static class Builder {
		private final GetChatsThreadMessagesRequest request;

		private Builder() {
			request = new GetChatsThreadMessagesRequest();
		}


		public Builder withThreadId(String threadId) {
			request.setThreadId(threadId);
			return this;
		}

		public Builder withLimit(String limit) {
			request.setLimit(limit);
			return this;
		}

		public Builder withBefore(String before) {
			request.setBefore(before);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}



		public Builder withRequiredParams(String threadId) {
			request.setThreadId(threadId);

			return this;
		}


		public GetChatsThreadMessagesRequest build() {
            
            // verify the required parameter 'threadId' is set
            if (request.threadId == null) {
                throw new IllegalStateException("Missing the required parameter 'threadId' when building request for GetChatsThreadMessagesRequest.");
            }
            
			return request;
		}
	}
}
