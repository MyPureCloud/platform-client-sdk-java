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

import com.mypurecloud.sdk.v2.model.AgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentEntityListing;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.CreateAgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UpdateAgenticVirtualAgent;

public class DeleteAgenticVirtualagentJobsRequest {

	private String virtualAgentId;
	public String getVirtualAgentId() {
		return this.virtualAgentId;
	}

	public void setVirtualAgentId(String virtualAgentId) {
		this.virtualAgentId = virtualAgentId;
	}

	public DeleteAgenticVirtualagentJobsRequest withVirtualAgentId(String virtualAgentId) {
	    this.setVirtualAgentId(virtualAgentId);
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

    public DeleteAgenticVirtualagentJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'virtualAgentId' is set
        if (this.virtualAgentId == null) {
            throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for DeleteAgenticVirtualagentJobsRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/agentic/virtualagents/{virtualAgentId}/jobs")
                .withPathParameter("virtualAgentId", virtualAgentId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String virtualAgentId) {
	    return new Builder()
	            .withRequiredParams(virtualAgentId);
	}


	public static class Builder {
		private final DeleteAgenticVirtualagentJobsRequest request;

		private Builder() {
			request = new DeleteAgenticVirtualagentJobsRequest();
		}


		public Builder withVirtualAgentId(String virtualAgentId) {
			request.setVirtualAgentId(virtualAgentId);
			return this;
		}



		public Builder withRequiredParams(String virtualAgentId) {
			request.setVirtualAgentId(virtualAgentId);

			return this;
		}


		public DeleteAgenticVirtualagentJobsRequest build() {
            
            // verify the required parameter 'virtualAgentId' is set
            if (request.virtualAgentId == null) {
                throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for DeleteAgenticVirtualagentJobsRequest.");
            }
            
			return request;
		}
	}
}
