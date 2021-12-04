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

public class PutRecordingLocalkeysSettingRequest {
    
	private String settingsId;
	public String getSettingsId() {
		return this.settingsId;
	}

	public void setSettingsId(String settingsId) {
		this.settingsId = settingsId;
	}

	public PutRecordingLocalkeysSettingRequest withSettingsId(String settingsId) {
	    this.setSettingsId(settingsId);
	    return this;
	} 
	
	private LocalEncryptionConfiguration body;
	public LocalEncryptionConfiguration getBody() {
		return this.body;
	}

	public void setBody(LocalEncryptionConfiguration body) {
		this.body = body;
	}

	public PutRecordingLocalkeysSettingRequest withBody(LocalEncryptionConfiguration body) {
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

    public PutRecordingLocalkeysSettingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<LocalEncryptionConfiguration> withHttpInfo() {
        
        // verify the required parameter 'settingsId' is set
        if (this.settingsId == null) {
            throw new IllegalStateException("Missing the required parameter 'settingsId' when building request for PutRecordingLocalkeysSettingRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutRecordingLocalkeysSettingRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/recording/localkeys/settings/{settingsId}")
                .withPathParameter("settingsId", settingsId)
        
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

	
	public static Builder builder(String settingsId, LocalEncryptionConfiguration body) {
	    return new Builder()
	            .withRequiredParams(settingsId, body);
	}
	

	public static class Builder {
		private final PutRecordingLocalkeysSettingRequest request;

		private Builder() {
			request = new PutRecordingLocalkeysSettingRequest();
		}

		
		public Builder withSettingsId(String settingsId) {
			request.setSettingsId(settingsId);
			return this;
		}
		
		public Builder withBody(LocalEncryptionConfiguration body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String settingsId, LocalEncryptionConfiguration body) {
			request.setSettingsId(settingsId);
						request.setBody(body);
			
			return this;
		}
		

		public PutRecordingLocalkeysSettingRequest build() {
            
            // verify the required parameter 'settingsId' is set
            if (request.settingsId == null) {
                throw new IllegalStateException("Missing the required parameter 'settingsId' when building request for PutRecordingLocalkeysSettingRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutRecordingLocalkeysSettingRequest.");
            }
            
			return request;
		}
	}
}
