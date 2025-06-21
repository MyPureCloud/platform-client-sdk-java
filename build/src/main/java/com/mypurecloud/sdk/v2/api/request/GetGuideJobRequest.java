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

import com.mypurecloud.sdk.v2.model.CreateGuide;
import com.mypurecloud.sdk.v2.model.CreateGuideVersion;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GenerateGuideContentRequest;
import com.mypurecloud.sdk.v2.model.Guide;
import com.mypurecloud.sdk.v2.model.GuideContentGenerationJob;
import com.mypurecloud.sdk.v2.model.GuideEntityListing;
import com.mypurecloud.sdk.v2.model.GuideJob;
import com.mypurecloud.sdk.v2.model.GuideVersion;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJob;
import com.mypurecloud.sdk.v2.model.GuideVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateGuideVersion;

public class GetGuideJobRequest {

	private String guideId;
	public String getGuideId() {
		return this.guideId;
	}

	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}

	public GetGuideJobRequest withGuideId(String guideId) {
	    this.setGuideId(guideId);
	    return this;
	} 

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public GetGuideJobRequest withJobId(String jobId) {
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

    public GetGuideJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'guideId' is set
        if (this.guideId == null) {
            throw new IllegalStateException("Missing the required parameter 'guideId' when building request for GetGuideJobRequest.");
        }
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetGuideJobRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/guides/{guideId}/jobs/{jobId}")
                .withPathParameter("guideId", guideId)
        
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


	public static Builder builder(String guideId, String jobId) {
	    return new Builder()
	            .withRequiredParams(guideId, jobId);
	}


	public static class Builder {
		private final GetGuideJobRequest request;

		private Builder() {
			request = new GetGuideJobRequest();
		}


		public Builder withGuideId(String guideId) {
			request.setGuideId(guideId);
			return this;
		}

		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}



		public Builder withRequiredParams(String guideId, String jobId) {
			request.setGuideId(guideId);
			request.setJobId(jobId);

			return this;
		}


		public GetGuideJobRequest build() {
            
            // verify the required parameter 'guideId' is set
            if (request.guideId == null) {
                throw new IllegalStateException("Missing the required parameter 'guideId' when building request for GetGuideJobRequest.");
            }
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetGuideJobRequest.");
            }
            
			return request;
		}
	}
}
