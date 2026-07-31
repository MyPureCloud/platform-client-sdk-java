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

public class PostAgenticVirtualagentVersionJobsRequest {

	private String virtualAgentId;
	public String getVirtualAgentId() {
		return this.virtualAgentId;
	}

	public void setVirtualAgentId(String virtualAgentId) {
		this.virtualAgentId = virtualAgentId;
	}

	public PostAgenticVirtualagentVersionJobsRequest withVirtualAgentId(String virtualAgentId) {
	    this.setVirtualAgentId(virtualAgentId);
	    return this;
	} 

	private String versionId;
	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public PostAgenticVirtualagentVersionJobsRequest withVersionId(String versionId) {
	    this.setVersionId(versionId);
	    return this;
	} 

	private AgenticVirtualAgentVersionPublishJobRequest body;
	public AgenticVirtualAgentVersionPublishJobRequest getBody() {
		return this.body;
	}

	public void setBody(AgenticVirtualAgentVersionPublishJobRequest body) {
		this.body = body;
	}

	public PostAgenticVirtualagentVersionJobsRequest withBody(AgenticVirtualAgentVersionPublishJobRequest body) {
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

    public PostAgenticVirtualagentVersionJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AgenticVirtualAgentVersionPublishJobRequest> withHttpInfo() {
        
        // verify the required parameter 'virtualAgentId' is set
        if (this.virtualAgentId == null) {
            throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for PostAgenticVirtualagentVersionJobsRequest.");
        }
        
        // verify the required parameter 'versionId' is set
        if (this.versionId == null) {
            throw new IllegalStateException("Missing the required parameter 'versionId' when building request for PostAgenticVirtualagentVersionJobsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAgenticVirtualagentVersionJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/agentic/virtualagents/{virtualAgentId}/versions/{versionId}/jobs")
                .withPathParameter("virtualAgentId", virtualAgentId)
        
                .withPathParameter("versionId", versionId)
        
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


	public static Builder builder(String virtualAgentId, String versionId, AgenticVirtualAgentVersionPublishJobRequest body) {
	    return new Builder()
	            .withRequiredParams(virtualAgentId, versionId, body);
	}


	public static class Builder {
		private final PostAgenticVirtualagentVersionJobsRequest request;

		private Builder() {
			request = new PostAgenticVirtualagentVersionJobsRequest();
		}


		public Builder withVirtualAgentId(String virtualAgentId) {
			request.setVirtualAgentId(virtualAgentId);
			return this;
		}

		public Builder withVersionId(String versionId) {
			request.setVersionId(versionId);
			return this;
		}

		public Builder withBody(AgenticVirtualAgentVersionPublishJobRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String virtualAgentId, String versionId, AgenticVirtualAgentVersionPublishJobRequest body) {
			request.setVirtualAgentId(virtualAgentId);
			request.setVersionId(versionId);
			request.setBody(body);

			return this;
		}


		public PostAgenticVirtualagentVersionJobsRequest build() {
            
            // verify the required parameter 'virtualAgentId' is set
            if (request.virtualAgentId == null) {
                throw new IllegalStateException("Missing the required parameter 'virtualAgentId' when building request for PostAgenticVirtualagentVersionJobsRequest.");
            }
            
            // verify the required parameter 'versionId' is set
            if (request.versionId == null) {
                throw new IllegalStateException("Missing the required parameter 'versionId' when building request for PostAgenticVirtualagentVersionJobsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAgenticVirtualagentVersionJobsRequest.");
            }
            
			return request;
		}
	}
}
