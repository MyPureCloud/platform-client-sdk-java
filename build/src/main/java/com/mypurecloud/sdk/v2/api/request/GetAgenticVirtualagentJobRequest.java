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

public class GetAgenticVirtualagentJobRequest {

	private String virtualAgentId;
	public String getVirtualAgentId() {
		return this.virtualAgentId;
	}

	public void setVirtualAgentId(String virtualAgentId) {
		this.virtualAgentId = virtualAgentId;
	}

	public GetAgenticVirtualagentJobRequest withVirtualAgentId(String virtualAgentId) {
	    this.setVirtualAgentId(virtualAgentId);
	    return this;
	} 

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public GetAgenticVirtualagentJobRequest withJobId(String jobId) {
	    this.setJobId(jobId);
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

    public GetAgenticVirtualagentJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'virtualAgentId' is set
        if (this.virtualAgentId == null) {
            throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for GetAgenticVirtualagentJobRequest.");
        }
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetAgenticVirtualagentJobRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/agentic/virtualagents/{virtualAgentId}/jobs/{jobId}")
                .withPathParameter("virtualAgentId", virtualAgentId)
        
                .withPathParameter("jobId", jobId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String virtualAgentId, String jobId) {
	    return new Builder()
	            .withRequiredParams(virtualAgentId, jobId);
	}


	public static class Builder {
		private final GetAgenticVirtualagentJobRequest request;

		private Builder() {
			request = new GetAgenticVirtualagentJobRequest();
		}


		public Builder withVirtualAgentId(String virtualAgentId) {
			request.setVirtualAgentId(virtualAgentId);
			return this;
		}

		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}



		public Builder withRequiredParams(String virtualAgentId, String jobId) {
			request.setVirtualAgentId(virtualAgentId);
			request.setJobId(jobId);

			return this;
		}


		public GetAgenticVirtualagentJobRequest build() {
            
            // verify the required parameter 'virtualAgentId' is set
            if (request.virtualAgentId == null) {
                throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for GetAgenticVirtualagentJobRequest.");
            }
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetAgenticVirtualagentJobRequest.");
            }
            
			return request;
		}
	}
}
