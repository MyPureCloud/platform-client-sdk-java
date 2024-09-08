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

import com.mypurecloud.sdk.v2.model.Copilot;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class GetAssistantCopilotRequest {

	private String assistantId;
	public String getAssistantId() {
		return this.assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public GetAssistantCopilotRequest withAssistantId(String assistantId) {
	    this.setAssistantId(assistantId);
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

    public GetAssistantCopilotRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'assistantId' is set
        if (this.assistantId == null) {
            throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for GetAssistantCopilotRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/assistants/{assistantId}/copilot")
                .withPathParameter("assistantId", assistantId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String assistantId) {
	    return new Builder()
	            .withRequiredParams(assistantId);
	}


	public static class Builder {
		private final GetAssistantCopilotRequest request;

		private Builder() {
			request = new GetAssistantCopilotRequest();
		}


		public Builder withAssistantId(String assistantId) {
			request.setAssistantId(assistantId);
			return this;
		}



		public Builder withRequiredParams(String assistantId) {
			request.setAssistantId(assistantId);

			return this;
		}


		public GetAssistantCopilotRequest build() {
            
            // verify the required parameter 'assistantId' is set
            if (request.assistantId == null) {
                throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for GetAssistantCopilotRequest.");
            }
            
			return request;
		}
	}
}
