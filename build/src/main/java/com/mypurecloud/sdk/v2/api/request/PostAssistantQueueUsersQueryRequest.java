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

import com.mypurecloud.sdk.v2.model.Assistant;
import com.mypurecloud.sdk.v2.model.AssistantListing;
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.AssistantQueueListing;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkAddRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryRequest;
import com.mypurecloud.sdk.v2.model.AssistantQueueUsersQueryResponse;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;

public class PostAssistantQueueUsersQueryRequest {

	private String assistantId;
	public String getAssistantId() {
		return this.assistantId;
	}

	public void setAssistantId(String assistantId) {
		this.assistantId = assistantId;
	}

	public PostAssistantQueueUsersQueryRequest withAssistantId(String assistantId) {
	    this.setAssistantId(assistantId);
	    return this;
	} 

	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public PostAssistantQueueUsersQueryRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 

	private AssistantQueueUsersQueryRequest body;
	public AssistantQueueUsersQueryRequest getBody() {
		return this.body;
	}

	public void setBody(AssistantQueueUsersQueryRequest body) {
		this.body = body;
	}

	public PostAssistantQueueUsersQueryRequest withBody(AssistantQueueUsersQueryRequest body) {
	    this.setBody(body);
	    return this;
	} 

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public PostAssistantQueueUsersQueryRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ASSISTANT("assistant"),
		COPILOT("copilot");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public PostAssistantQueueUsersQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AssistantQueueUsersQueryRequest> withHttpInfo() {
        
        // verify the required parameter 'assistantId' is set
        if (this.assistantId == null) {
            throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PostAssistantQueueUsersQueryRequest.");
        }
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new IllegalStateException("Missing the required parameter 'queueId' when building request for PostAssistantQueueUsersQueryRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAssistantQueueUsersQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/assistants/{assistantId}/queues/{queueId}/users/query")
                .withPathParameter("assistantId", assistantId)
        
                .withPathParameter("queueId", queueId)
        

                .withQueryParameters("expand", "multi", expand)
        
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


	public static Builder builder(String assistantId, String queueId, AssistantQueueUsersQueryRequest body) {
	    return new Builder()
	            .withRequiredParams(assistantId, queueId, body);
	}


	public static class Builder {
		private final PostAssistantQueueUsersQueryRequest request;

		private Builder() {
			request = new PostAssistantQueueUsersQueryRequest();
		}


		public Builder withAssistantId(String assistantId) {
			request.setAssistantId(assistantId);
			return this;
		}

		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}

		public Builder withBody(AssistantQueueUsersQueryRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}



		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}



		public Builder withRequiredParams(String assistantId, String queueId, AssistantQueueUsersQueryRequest body) {
			request.setAssistantId(assistantId);
			request.setQueueId(queueId);
			request.setBody(body);

			return this;
		}


		public PostAssistantQueueUsersQueryRequest build() {
            
            // verify the required parameter 'assistantId' is set
            if (request.assistantId == null) {
                throw new IllegalStateException("Missing the required parameter 'assistantId' when building request for PostAssistantQueueUsersQueryRequest.");
            }
            
            // verify the required parameter 'queueId' is set
            if (request.queueId == null) {
                throw new IllegalStateException("Missing the required parameter 'queueId' when building request for PostAssistantQueueUsersQueryRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAssistantQueueUsersQueryRequest.");
            }
            
			return request;
		}
	}
}
