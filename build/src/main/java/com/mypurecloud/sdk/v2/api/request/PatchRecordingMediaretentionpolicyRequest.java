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

import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.RecordingEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.RecordingEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.RecordingRetentionCursorEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.RecordingUploadReport;
import com.mypurecloud.sdk.v2.model.RecordingUploadReportRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingActiveSessions;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;

public class PatchRecordingMediaretentionpolicyRequest {

	private String policyId;
	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public PatchRecordingMediaretentionpolicyRequest withPolicyId(String policyId) {
	    this.setPolicyId(policyId);
	    return this;
	} 

	private PolicyUpdate body;
	public PolicyUpdate getBody() {
		return this.body;
	}

	public void setBody(PolicyUpdate body) {
		this.body = body;
	}

	public PatchRecordingMediaretentionpolicyRequest withBody(PolicyUpdate body) {
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

    public PatchRecordingMediaretentionpolicyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PolicyUpdate> withHttpInfo() {
        
        // verify the required parameter 'policyId' is set
        if (this.policyId == null) {
            throw new IllegalStateException("Missing the required parameter 'policyId' when building request for PatchRecordingMediaretentionpolicyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchRecordingMediaretentionpolicyRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/recording/mediaretentionpolicies/{policyId}")
                .withPathParameter("policyId", policyId)
        
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


	public static Builder builder(String policyId, PolicyUpdate body) {
	    return new Builder()
	            .withRequiredParams(policyId, body);
	}


	public static class Builder {
		private final PatchRecordingMediaretentionpolicyRequest request;

		private Builder() {
			request = new PatchRecordingMediaretentionpolicyRequest();
		}


		public Builder withPolicyId(String policyId) {
			request.setPolicyId(policyId);
			return this;
		}

		public Builder withBody(PolicyUpdate body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String policyId, PolicyUpdate body) {
			request.setPolicyId(policyId);
			request.setBody(body);

			return this;
		}


		public PatchRecordingMediaretentionpolicyRequest build() {
            
            // verify the required parameter 'policyId' is set
            if (request.policyId == null) {
                throw new IllegalStateException("Missing the required parameter 'policyId' when building request for PatchRecordingMediaretentionpolicyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchRecordingMediaretentionpolicyRequest.");
            }
            
			return request;
		}
	}
}
