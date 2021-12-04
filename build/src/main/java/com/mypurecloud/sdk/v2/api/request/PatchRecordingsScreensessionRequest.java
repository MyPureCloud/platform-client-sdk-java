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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;

public class PatchRecordingsScreensessionRequest {
    
	private String recordingSessionId;
	public String getRecordingSessionId() {
		return this.recordingSessionId;
	}

	public void setRecordingSessionId(String recordingSessionId) {
		this.recordingSessionId = recordingSessionId;
	}

	public PatchRecordingsScreensessionRequest withRecordingSessionId(String recordingSessionId) {
	    this.setRecordingSessionId(recordingSessionId);
	    return this;
	} 
	
	private ScreenRecordingSessionRequest body;
	public ScreenRecordingSessionRequest getBody() {
		return this.body;
	}

	public void setBody(ScreenRecordingSessionRequest body) {
		this.body = body;
	}

	public PatchRecordingsScreensessionRequest withBody(ScreenRecordingSessionRequest body) {
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

    public PatchRecordingsScreensessionRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScreenRecordingSessionRequest> withHttpInfo() {
        
        // verify the required parameter 'recordingSessionId' is set
        if (this.recordingSessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'recordingSessionId' when building request for PatchRecordingsScreensessionRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/recordings/screensessions/{recordingSessionId}")
                .withPathParameter("recordingSessionId", recordingSessionId)
        
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

	
	public static Builder builder(String recordingSessionId) {
	    return new Builder()
	            .withRequiredParams(recordingSessionId);
	}
	

	public static class Builder {
		private final PatchRecordingsScreensessionRequest request;

		private Builder() {
			request = new PatchRecordingsScreensessionRequest();
		}

		
		public Builder withRecordingSessionId(String recordingSessionId) {
			request.setRecordingSessionId(recordingSessionId);
			return this;
		}
		
		public Builder withBody(ScreenRecordingSessionRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String recordingSessionId) {
			request.setRecordingSessionId(recordingSessionId);
			
			return this;
		}
		

		public PatchRecordingsScreensessionRequest build() {
            
            // verify the required parameter 'recordingSessionId' is set
            if (request.recordingSessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'recordingSessionId' when building request for PatchRecordingsScreensessionRequest.");
            }
            
			return request;
		}
	}
}
