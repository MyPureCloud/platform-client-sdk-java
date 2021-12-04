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

public class PutConversationRecordingAnnotationRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PutConversationRecordingAnnotationRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String recordingId;
	public String getRecordingId() {
		return this.recordingId;
	}

	public void setRecordingId(String recordingId) {
		this.recordingId = recordingId;
	}

	public PutConversationRecordingAnnotationRequest withRecordingId(String recordingId) {
	    this.setRecordingId(recordingId);
	    return this;
	} 
	
	private String annotationId;
	public String getAnnotationId() {
		return this.annotationId;
	}

	public void setAnnotationId(String annotationId) {
		this.annotationId = annotationId;
	}

	public PutConversationRecordingAnnotationRequest withAnnotationId(String annotationId) {
	    this.setAnnotationId(annotationId);
	    return this;
	} 
	
	private Annotation body;
	public Annotation getBody() {
		return this.body;
	}

	public void setBody(Annotation body) {
		this.body = body;
	}

	public PutConversationRecordingAnnotationRequest withBody(Annotation body) {
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

    public PutConversationRecordingAnnotationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Annotation> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PutConversationRecordingAnnotationRequest.");
        }
        
        // verify the required parameter 'recordingId' is set
        if (this.recordingId == null) {
            throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for PutConversationRecordingAnnotationRequest.");
        }
        
        // verify the required parameter 'annotationId' is set
        if (this.annotationId == null) {
            throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for PutConversationRecordingAnnotationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutConversationRecordingAnnotationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("recordingId", recordingId)
        
                .withPathParameter("annotationId", annotationId)
        
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

	
	public static Builder builder(String conversationId, String recordingId, String annotationId, Annotation body) {
	    return new Builder()
	            .withRequiredParams(conversationId, recordingId, annotationId, body);
	}
	

	public static class Builder {
		private final PutConversationRecordingAnnotationRequest request;

		private Builder() {
			request = new PutConversationRecordingAnnotationRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withRecordingId(String recordingId) {
			request.setRecordingId(recordingId);
			return this;
		}
		
		public Builder withAnnotationId(String annotationId) {
			request.setAnnotationId(annotationId);
			return this;
		}
		
		public Builder withBody(Annotation body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String recordingId, String annotationId, Annotation body) {
			request.setConversationId(conversationId);
						request.setRecordingId(recordingId);
						request.setAnnotationId(annotationId);
						request.setBody(body);
			
			return this;
		}
		

		public PutConversationRecordingAnnotationRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PutConversationRecordingAnnotationRequest.");
            }
            
            // verify the required parameter 'recordingId' is set
            if (request.recordingId == null) {
                throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for PutConversationRecordingAnnotationRequest.");
            }
            
            // verify the required parameter 'annotationId' is set
            if (request.annotationId == null) {
                throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for PutConversationRecordingAnnotationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutConversationRecordingAnnotationRequest.");
            }
            
			return request;
		}
	}
}
