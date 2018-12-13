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
import com.mypurecloud.sdk.v2.model.AvailableTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopicEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelEntityListing;
import com.mypurecloud.sdk.v2.model.ChannelTopic;
import com.mypurecloud.sdk.v2.model.Channel;

public class DeleteNotificationsChannelSubscriptionsRequest {
    
	private String channelId;
	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public DeleteNotificationsChannelSubscriptionsRequest withChannelId(String channelId) {
	    this.setChannelId(channelId);
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

    public DeleteNotificationsChannelSubscriptionsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'channelId' is set
        if (this.channelId == null) {
            throw new IllegalStateException("Missing the required parameter 'channelId' when building request for DeleteNotificationsChannelSubscriptionsRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/notifications/channels/{channelId}/subscriptions")
                .withPathParameter("channelId", channelId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String channelId) {
	    return new Builder()
	            .withRequiredParams(channelId);
	}
	

	public static class Builder {
		private final DeleteNotificationsChannelSubscriptionsRequest request;

		private Builder() {
			request = new DeleteNotificationsChannelSubscriptionsRequest();
		}

		
		public Builder withChannelId(String channelId) {
			request.setChannelId(channelId);
			return this;
		}
		

		
		public Builder withRequiredParams(String channelId) {
			request.setChannelId(channelId);
			
			return this;
		}
		

		public DeleteNotificationsChannelSubscriptionsRequest build() {
            
            // verify the required parameter 'channelId' is set
            if (request.channelId == null) {
                throw new IllegalStateException("Missing the required parameter 'channelId' when building request for DeleteNotificationsChannelSubscriptionsRequest.");
            }
            
			return request;
		}
	}
}
