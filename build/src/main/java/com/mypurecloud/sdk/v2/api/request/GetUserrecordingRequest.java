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
import com.mypurecloud.sdk.v2.model.UserRecording;
import com.mypurecloud.sdk.v2.model.DownloadResponse;
import com.mypurecloud.sdk.v2.model.UserRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.FaxSummary;

public class GetUserrecordingRequest {
    
	private String recordingId;
	public String getRecordingId() {
		return this.recordingId;
	}

	public void setRecordingId(String recordingId) {
		this.recordingId = recordingId;
	}

	public GetUserrecordingRequest withRecordingId(String recordingId) {
	    this.setRecordingId(recordingId);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetUserrecordingRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		CONVERSATION("conversation");

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

    public GetUserrecordingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'recordingId' is set
        if (this.recordingId == null) {
            throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for GetUserrecordingRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/userrecordings/{recordingId}")
                .withPathParameter("recordingId", recordingId)
        
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

	
	public static Builder builder(String recordingId) {
	    return new Builder()
	            .withRequiredParams(recordingId);
	}
	

	public static class Builder {
		private final GetUserrecordingRequest request;

		private Builder() {
			request = new GetUserrecordingRequest();
		}

		
		public Builder withRecordingId(String recordingId) {
			request.setRecordingId(recordingId);
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
		

		
		public Builder withRequiredParams(String recordingId) {
			request.setRecordingId(recordingId);
			
			return this;
		}
		

		public GetUserrecordingRequest build() {
            
            // verify the required parameter 'recordingId' is set
            if (request.recordingId == null) {
                throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for GetUserrecordingRequest.");
            }
            
			return request;
		}
	}
}
