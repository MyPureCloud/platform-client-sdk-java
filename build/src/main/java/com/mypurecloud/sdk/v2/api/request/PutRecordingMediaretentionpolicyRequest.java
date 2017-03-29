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

public class PutRecordingMediaretentionpolicyRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String policyId;
	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public PutRecordingMediaretentionpolicyRequest withPolicyId(String policyId) {
	    this.setPolicyId(policyId);
	    return this;
	}

	private Policy body;
	public Policy getBody() {
		return this.body;
	}

	public void setBody(Policy body) {
		this.body = body;
	}

	public PutRecordingMediaretentionpolicyRequest withBody(Policy body) {
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

    public PutRecordingMediaretentionpolicyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Policy> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'policyId' is set
        if (this.policyId == null) {
            throw new ApiException(400, "Missing the required parameter 'policyId' when building request for PutRecordingMediaretentionpolicyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PutRecordingMediaretentionpolicyRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/recording/mediaretentionpolicies/{policyId}")
                .withPathParameter("policyId", policyId)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String policyId, Policy body) {
	    return new Builder()
	            .withRequiredParams(policyId, body);
	}

	public static class Builder {
		private final PutRecordingMediaretentionpolicyRequest request;

		private Builder() {
			request = new PutRecordingMediaretentionpolicyRequest();
		}

		public Builder withPolicyId(String policyId) {
			request.setPolicyId(policyId);
			return this;
		}
		public Builder withBody(Policy body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String policyId, Policy body) {
			request.setPolicyId(policyId);
			request.setBody(body);
			return this;
		}


		public PutRecordingMediaretentionpolicyRequest build() {
			return request;
		}
	}
}
