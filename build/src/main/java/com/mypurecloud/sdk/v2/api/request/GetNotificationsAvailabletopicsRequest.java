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

public class GetNotificationsAvailabletopicsRequest {
    
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetNotificationsAvailabletopicsRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		DESCRIPTION("description"), 
		ENFORCED("enforced"), 
		SCHEMA("schema"), 
		VISIBILITY("visibility"), 
		TRANSPORTS("transports"), 
		PUBLICAPITEMPLATEURIPATHS("publicApiTemplateUriPaths"), 
		REQUIRESPERMISSIONS("requiresPermissions"), 
		PERMISSIONDETAILS("permissionDetails"), 
		TOPICPARAMETERS("topicParameters");

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
	
	private Boolean includePreview;
	public Boolean getIncludePreview() {
		return this.includePreview;
	}

	public void setIncludePreview(Boolean includePreview) {
		this.includePreview = includePreview;
	}

	public GetNotificationsAvailabletopicsRequest withIncludePreview(Boolean includePreview) {
	    this.setIncludePreview(includePreview);
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

    public GetNotificationsAvailabletopicsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/notifications/availabletopics")
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("includePreview", "", includePreview)
        
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
		private final GetNotificationsAvailabletopicsRequest request;

		private Builder() {
			request = new GetNotificationsAvailabletopicsRequest();
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
		
		public Builder withIncludePreview(Boolean includePreview) {
			request.setIncludePreview(includePreview);
			return this;
		}
		

		

		public GetNotificationsAvailabletopicsRequest build() {
            
			return request;
		}
	}
}
