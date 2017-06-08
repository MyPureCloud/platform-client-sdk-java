package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;

public class GetConversationRecordingsRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetConversationRecordingsRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	}

	
	private Integer maxWaitMs;
	public Integer getMaxWaitMs() {
		return this.maxWaitMs;
	}

	public void setMaxWaitMs(Integer maxWaitMs) {
		this.maxWaitMs = maxWaitMs;
	}

	public GetConversationRecordingsRequest withMaxWaitMs(Integer maxWaitMs) {
	    this.setMaxWaitMs(maxWaitMs);
	    return this;
	}

	
	private String formatId;
	public String getFormatId() {
		return this.formatId;
	}

	public void setFormatId(String formatId) {
		this.formatId = formatId;
	}

	public GetConversationRecordingsRequest withFormatId(String formatId) {
	    this.setFormatId(formatId);
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

    public GetConversationRecordingsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetConversationRecordingsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/conversations/{conversationId}/recordings")
                .withPathParameter("conversationId", conversationId)
        
                .withQueryParameters("maxWaitMs", "", maxWaitMs)
        
                .withQueryParameters("formatId", "", formatId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId) {
	    return new Builder()
	            .withRequiredParams(conversationId);
	}
	

	public static class Builder {
		private final GetConversationRecordingsRequest request;

		private Builder() {
			request = new GetConversationRecordingsRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withMaxWaitMs(Integer maxWaitMs) {
			request.setMaxWaitMs(maxWaitMs);
			return this;
		}
		
		public Builder withFormatId(String formatId) {
			request.setFormatId(formatId);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId) {
			request.setConversationId(conversationId);
			
			return this;
		}
		


		public GetConversationRecordingsRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetConversationRecordingsRequest.");
            }
            
			return request;
		}
	}
}
