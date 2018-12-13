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

public class GetNotificationsChannelsRequest {
    
	private String includechannels;
	public String getIncludechannels() {
		return this.includechannels;
	}

	public void setIncludechannels(String includechannels) {
		this.includechannels = includechannels;
	}

	public GetNotificationsChannelsRequest withIncludechannels(String includechannels) {
	    this.setIncludechannels(includechannels);
	    return this;
	} 

	public enum includechannelsValues { 
		TOKEN("token"), 
		OAUTHCLIENT("oauthclient");

		private String value;

		includechannelsValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static includechannelsValues fromString(String key) {
			if (key == null) return null;

			for (includechannelsValues value : includechannelsValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return includechannelsValues.values()[0];
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

    public GetNotificationsChannelsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/notifications/channels")
                .withQueryParameters("includechannels", "", includechannels)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetNotificationsChannelsRequest request;

		private Builder() {
			request = new GetNotificationsChannelsRequest();
		}

		
		public Builder withIncludechannels(String includechannels) {
			request.setIncludechannels(includechannels);
			return this;
		}

		public Builder withIncludechannels(includechannelsValues includechannels) {
		    request.setIncludechannels(includechannels.toString());
		    return this;
		}
		

		

		public GetNotificationsChannelsRequest build() {
            
			return request;
		}
	}
}
