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
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;

public class PatchMessagingSettingRequest {

	private String messageSettingId;
	public String getMessageSettingId() {
		return this.messageSettingId;
	}

	public void setMessageSettingId(String messageSettingId) {
		this.messageSettingId = messageSettingId;
	}

	public PatchMessagingSettingRequest withMessageSettingId(String messageSettingId) {
	    this.setMessageSettingId(messageSettingId);
	    return this;
	} 

	private MessagingSettingRequest body;
	public MessagingSettingRequest getBody() {
		return this.body;
	}

	public void setBody(MessagingSettingRequest body) {
		this.body = body;
	}

	public PatchMessagingSettingRequest withBody(MessagingSettingRequest body) {
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

    public PatchMessagingSettingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<MessagingSettingRequest> withHttpInfo() {
        
        // verify the required parameter 'messageSettingId' is set
        if (this.messageSettingId == null) {
            throw new IllegalStateException("Missing the required parameter 'messageSettingId' when building request for PatchMessagingSettingRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchMessagingSettingRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/messaging/settings/{messageSettingId}")
                .withPathParameter("messageSettingId", messageSettingId)
        
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


	public static Builder builder(String messageSettingId, MessagingSettingRequest body) {
	    return new Builder()
	            .withRequiredParams(messageSettingId, body);
	}


	public static class Builder {
		private final PatchMessagingSettingRequest request;

		private Builder() {
			request = new PatchMessagingSettingRequest();
		}


		public Builder withMessageSettingId(String messageSettingId) {
			request.setMessageSettingId(messageSettingId);
			return this;
		}

		public Builder withBody(MessagingSettingRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String messageSettingId, MessagingSettingRequest body) {
			request.setMessageSettingId(messageSettingId);
			request.setBody(body);

			return this;
		}


		public PatchMessagingSettingRequest build() {
            
            // verify the required parameter 'messageSettingId' is set
            if (request.messageSettingId == null) {
                throw new IllegalStateException("Missing the required parameter 'messageSettingId' when building request for PatchMessagingSettingRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchMessagingSettingRequest.");
            }
            
			return request;
		}
	}
}
