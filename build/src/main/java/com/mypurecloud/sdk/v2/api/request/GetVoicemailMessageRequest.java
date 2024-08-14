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

import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;

public class GetVoicemailMessageRequest {

	private String messageId;
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public GetVoicemailMessageRequest withMessageId(String messageId) {
	    this.setMessageId(messageId);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetVoicemailMessageRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		CALLERUSER_ROUTINGSTATUS("callerUser.routingStatus"),
		CALLERUSER_PRIMARYPRESENCE("callerUser.primaryPresence"),
		CALLERUSER_CONVERSATIONSUMMARY("callerUser.conversationSummary"),
		CALLERUSER_OUTOFOFFICE("callerUser.outOfOffice"),
		CALLERUSER_GEOLOCATION("callerUser.geolocation"),
		CONVERSATIONS("conversations"),
		TRANSCRIPTION("transcription");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetVoicemailMessageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'messageId' is set
        if (this.messageId == null) {
            throw new IllegalStateException("Missing the required parameter 'messageId' when building request for GetVoicemailMessageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/voicemail/messages/{messageId}")
                .withPathParameter("messageId", messageId)
        

                .withQueryParameters("expand", "multi", expand)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String messageId) {
	    return new Builder()
	            .withRequiredParams(messageId);
	}


	public static class Builder {
		private final GetVoicemailMessageRequest request;

		private Builder() {
			request = new GetVoicemailMessageRequest();
		}


		public Builder withMessageId(String messageId) {
			request.setMessageId(messageId);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}



		public Builder withRequiredParams(String messageId) {
			request.setMessageId(messageId);

			return this;
		}


		public GetVoicemailMessageRequest build() {
            
            // verify the required parameter 'messageId' is set
            if (request.messageId == null) {
                throw new IllegalStateException("Missing the required parameter 'messageId' when building request for GetVoicemailMessageRequest.");
            }
            
			return request;
		}
	}
}
