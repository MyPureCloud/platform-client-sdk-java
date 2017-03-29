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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;

public class PutArchitectPromptResourceRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String promptId;
	public String getPromptId() {
		return this.promptId;
	}

	public void setPromptId(String promptId) {
		this.promptId = promptId;
	}

	public PutArchitectPromptResourceRequest withPromptId(String promptId) {
	    this.setPromptId(promptId);
	    return this;
	}

	private String languageCode;
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public PutArchitectPromptResourceRequest withLanguageCode(String languageCode) {
	    this.setLanguageCode(languageCode);
	    return this;
	}

	private PromptAsset body;
	public PromptAsset getBody() {
		return this.body;
	}

	public void setBody(PromptAsset body) {
		this.body = body;
	}

	public PutArchitectPromptResourceRequest withBody(PromptAsset body) {
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

    public PutArchitectPromptResourceRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PromptAsset> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'promptId' is set
        if (this.promptId == null) {
            throw new ApiException(400, "Missing the required parameter 'promptId' when building request for PutArchitectPromptResourceRequest.");
        }
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new ApiException(400, "Missing the required parameter 'languageCode' when building request for PutArchitectPromptResourceRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/architect/prompts/{promptId}/resources/{languageCode}")
                .withPathParameter("promptId", promptId)
        
                .withPathParameter("languageCode", languageCode)
        
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

	public static Builder builder(String promptId, String languageCode) {
	    return new Builder()
	            .withRequiredParams(promptId, languageCode);
	}

	public static class Builder {
		private final PutArchitectPromptResourceRequest request;

		private Builder() {
			request = new PutArchitectPromptResourceRequest();
		}

		public Builder withPromptId(String promptId) {
			request.setPromptId(promptId);
			return this;
		}
		public Builder withLanguageCode(String languageCode) {
			request.setLanguageCode(languageCode);
			return this;
		}
		public Builder withBody(PromptAsset body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String promptId, String languageCode) {
			request.setPromptId(promptId);
			request.setLanguageCode(languageCode);
			return this;
		}


		public PutArchitectPromptResourceRequest build() {
			return request;
		}
	}
}
