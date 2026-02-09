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

import com.mypurecloud.sdk.v2.model.AssistantCopilotVariation;
import com.mypurecloud.sdk.v2.model.AssistantCopilotVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class PutAssistantVariationRequest {

	private String assistantId;
	public String getAssistantId() {
		return this.assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public PutAssistantVariationRequest withAssistantId(String assistantId) {
	    this.setAssistantId(assistantId);
	    return this;
	} 

	private String variationId;
	public String getVariationId() {
		return this.variationId;
	}

	public void setVariationId(String variationId) {
		this.variationId = variationId;
	}

	public PutAssistantVariationRequest withVariationId(String variationId) {
	    this.setVariationId(variationId);
	    return this;
	} 

	private AssistantCopilotVariation body;
	public AssistantCopilotVariation getBody() {
		return this.body;
	}

	public void setBody(AssistantCopilotVariation body) {
		this.body = body;
	}

	public PutAssistantVariationRequest withBody(AssistantCopilotVariation body) {
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

    public PutAssistantVariationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AssistantCopilotVariation> withHttpInfo() {
        
        // verify the required parameter 'assistantId' is set
        if (this.assistantId == null) {
            throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PutAssistantVariationRequest.");
        }
        
        // verify the required parameter 'variationId' is set
        if (this.variationId == null) {
            throw new IllegalStateException("Missing the required parameter 'variationId' when building request for PutAssistantVariationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAssistantVariationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/assistants/{assistantId}/variations/{variationId}")
                .withPathParameter("assistantId", assistantId)
        
                .withPathParameter("variationId", variationId)
        
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


	public static Builder builder(String assistantId, String variationId, AssistantCopilotVariation body) {
	    return new Builder()
	            .withRequiredParams(assistantId, variationId, body);
	}


	public static class Builder {
		private final PutAssistantVariationRequest request;

		private Builder() {
			request = new PutAssistantVariationRequest();
		}


		public Builder withAssistantId(String assistantId) {
			request.setAssistantId(assistantId);
			return this;
		}

		public Builder withVariationId(String variationId) {
			request.setVariationId(variationId);
			return this;
		}

		public Builder withBody(AssistantCopilotVariation body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String assistantId, String variationId, AssistantCopilotVariation body) {
			request.setAssistantId(assistantId);
			request.setVariationId(variationId);
			request.setBody(body);

			return this;
		}


		public PutAssistantVariationRequest build() {
            
            // verify the required parameter 'assistantId' is set
            if (request.assistantId == null) {
                throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PutAssistantVariationRequest.");
            }
            
            // verify the required parameter 'variationId' is set
            if (request.variationId == null) {
                throw new IllegalStateException("Missing the required parameter 'variationId' when building request for PutAssistantVariationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAssistantVariationRequest.");
            }
            
			return request;
		}
	}
}
