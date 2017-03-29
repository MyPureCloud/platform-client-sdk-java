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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.OrganizationFeatures;
import com.mypurecloud.sdk.v2.model.FeatureState;

public class PatchOrganizationsFeatureRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String featureName;
	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public PatchOrganizationsFeatureRequest withFeatureName(String featureName) {
	    this.setFeatureName(featureName);
	    return this;
	}

	private FeatureState enabled;
	public FeatureState getEnabled() {
		return this.enabled;
	}

	public void setEnabled(FeatureState enabled) {
		this.enabled = enabled;
	}

	public PatchOrganizationsFeatureRequest withEnabled(FeatureState enabled) {
	    this.setEnabled(enabled);
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

    public PatchOrganizationsFeatureRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<FeatureState> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'featureName' is set
        if (this.featureName == null) {
            throw new ApiException(400, "Missing the required parameter 'featureName' when building request for PatchOrganizationsFeatureRequest.");
        }
        
        // verify the required parameter 'enabled' is set
        if (this.enabled == null) {
            throw new ApiException(400, "Missing the required parameter 'enabled' when building request for PatchOrganizationsFeatureRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/organizations/features/{featureName}")
                .withPathParameter("featureName", featureName)
        
                .withBody(enabled)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String featureName, FeatureState enabled) {
	    return new Builder()
	            .withRequiredParams(featureName, enabled);
	}

	public static class Builder {
		private final PatchOrganizationsFeatureRequest request;

		private Builder() {
			request = new PatchOrganizationsFeatureRequest();
		}

		public Builder withFeatureName(String featureName) {
			request.setFeatureName(featureName);
			return this;
		}
		public Builder withEnabled(FeatureState enabled) {
			request.setEnabled(enabled);
			return this;
		}

		public Builder withRequiredParams(String featureName, FeatureState enabled) {
			request.setFeatureName(featureName);
			request.setEnabled(enabled);
			return this;
		}


		public PatchOrganizationsFeatureRequest build() {
			return request;
		}
	}
}
