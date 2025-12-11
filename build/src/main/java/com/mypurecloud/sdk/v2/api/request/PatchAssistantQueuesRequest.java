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

import com.mypurecloud.sdk.v2.model.AgentChecklist;
import com.mypurecloud.sdk.v2.model.AgentChecklistListing;
import com.mypurecloud.sdk.v2.model.Assistant;
import com.mypurecloud.sdk.v2.model.AssistantListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AssistantQueueListing;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkAddRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryResponse;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class PatchAssistantQueuesRequest {

	private String assistantId;
	public String getAssistantId() {
		return this.assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public PatchAssistantQueuesRequest withAssistantId(String assistantId) {
	    this.setAssistantId(assistantId);
	    return this;
	} 

	private List<AssistantQueue> body;
	public List<AssistantQueue> getBody() {
		return this.body;
	}

	public void setBody(List<AssistantQueue> body) {
		this.body = body;
	}

	public PatchAssistantQueuesRequest withBody(List<AssistantQueue> body) {
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

    public PatchAssistantQueuesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<AssistantQueue>> withHttpInfo() {
        
        // verify the required parameter 'assistantId' is set
        if (this.assistantId == null) {
            throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PatchAssistantQueuesRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchAssistantQueuesRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/assistants/{assistantId}/queues")
                .withPathParameter("assistantId", assistantId)
        
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


	public static Builder builder(String assistantId, List<AssistantQueue> body) {
	    return new Builder()
	            .withRequiredParams(assistantId, body);
	}


	public static class Builder {
		private final PatchAssistantQueuesRequest request;

		private Builder() {
			request = new PatchAssistantQueuesRequest();
		}


		public Builder withAssistantId(String assistantId) {
			request.setAssistantId(assistantId);
			return this;
		}

		public Builder withBody(List<AssistantQueue> body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String assistantId, List<AssistantQueue> body) {
			request.setAssistantId(assistantId);
			request.setBody(body);

			return this;
		}


		public PatchAssistantQueuesRequest build() {
            
            // verify the required parameter 'assistantId' is set
            if (request.assistantId == null) {
                throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PatchAssistantQueuesRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchAssistantQueuesRequest.");
            }
            
			return request;
		}
	}
}
