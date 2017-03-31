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

public class PutOrphanrecordingRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String orphanId;
	public String getOrphanId() {
		return this.orphanId;
	}

	public void setOrphanId(String orphanId) {
		this.orphanId = orphanId;
	}

	public PutOrphanrecordingRequest withOrphanId(String orphanId) {
	    this.setOrphanId(orphanId);
	    return this;
	}

	private OrphanUpdateRequest body;
	public OrphanUpdateRequest getBody() {
		return this.body;
	}

	public void setBody(OrphanUpdateRequest body) {
		this.body = body;
	}

	public PutOrphanrecordingRequest withBody(OrphanUpdateRequest body) {
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

    public PutOrphanrecordingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<OrphanUpdateRequest> withHttpInfo() {
        
        // verify the required parameter 'orphanId' is set
        if (this.orphanId == null) {
            throw new IllegalStateException("Missing the required parameter 'orphanId' when building request for PutOrphanrecordingRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/orphanrecordings/{orphanId}")
                .withPathParameter("orphanId", orphanId)
        
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

	public static Builder builder(String orphanId) {
	    return new Builder()
	            .withRequiredParams(orphanId);
	}

	public static class Builder {
		private final PutOrphanrecordingRequest request;

		private Builder() {
			request = new PutOrphanrecordingRequest();
		}

		public Builder withOrphanId(String orphanId) {
			request.setOrphanId(orphanId);
			return this;
		}
		public Builder withBody(OrphanUpdateRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String orphanId) {
			request.setOrphanId(orphanId);
			return this;
		}


		public PutOrphanrecordingRequest build() {
			return request;
		}
	}
}
