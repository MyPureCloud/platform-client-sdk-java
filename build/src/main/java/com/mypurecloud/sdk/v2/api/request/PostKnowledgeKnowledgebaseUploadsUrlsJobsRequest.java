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

import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FunctionUploadRequest;
import com.mypurecloud.sdk.v2.model.FunctionUploadResponse;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.LearningCoverArtUploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest {

	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 

	private CreateUploadSourceUrlJobRequest body;
	public CreateUploadSourceUrlJobRequest getBody() {
		return this.body;
	}

	public void setBody(CreateUploadSourceUrlJobRequest body) {
		this.body = body;
	}

	public PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest withBody(CreateUploadSourceUrlJobRequest body) {
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

    public PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CreateUploadSourceUrlJobRequest> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/uploads/urls/jobs")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
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


	public static Builder builder(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, body);
	}


	public static class Builder {
		private final PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest request;

		private Builder() {
			request = new PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest();
		}


		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}

		public Builder withBody(CreateUploadSourceUrlJobRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String knowledgeBaseId, CreateUploadSourceUrlJobRequest body) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			request.setBody(body);

			return this;
		}


		public PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostKnowledgeKnowledgebaseUploadsUrlsJobsRequest.");
            }
            
			return request;
		}
	}
}
