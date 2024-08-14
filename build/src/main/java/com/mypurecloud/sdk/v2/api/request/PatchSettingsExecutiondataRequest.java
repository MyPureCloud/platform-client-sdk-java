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

import com.mypurecloud.sdk.v2.model.AutoAnswerSettings;
import com.mypurecloud.sdk.v2.model.EmailSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;

public class PatchSettingsExecutiondataRequest {

	private ExecutionDataSettingsRequest body;
	public ExecutionDataSettingsRequest getBody() {
		return this.body;
	}

	public void setBody(ExecutionDataSettingsRequest body) {
		this.body = body;
	}

	public PatchSettingsExecutiondataRequest withBody(ExecutionDataSettingsRequest body) {
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

    public PatchSettingsExecutiondataRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ExecutionDataSettingsRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchSettingsExecutiondataRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/settings/executiondata")
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


	public static Builder builder(ExecutionDataSettingsRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}


	public static class Builder {
		private final PatchSettingsExecutiondataRequest request;

		private Builder() {
			request = new PatchSettingsExecutiondataRequest();
		}


		public Builder withBody(ExecutionDataSettingsRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(ExecutionDataSettingsRequest body) {
			request.setBody(body);

			return this;
		}


		public PatchSettingsExecutiondataRequest build() {
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchSettingsExecutiondataRequest.");
            }
            
			return request;
		}
	}
}
