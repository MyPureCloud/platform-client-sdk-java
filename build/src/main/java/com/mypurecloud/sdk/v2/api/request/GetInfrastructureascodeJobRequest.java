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

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;

public class GetInfrastructureascodeJobRequest {

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public GetInfrastructureascodeJobRequest withJobId(String jobId) {
	    this.setJobId(jobId);
	    return this;
	} 

	private Boolean details;
	public Boolean getDetails() {
		return this.details;
	}

	public void setDetails(Boolean details) {
		this.details = details;
	}

	public GetInfrastructureascodeJobRequest withDetails(Boolean details) {
	    this.setDetails(details);
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

    public GetInfrastructureascodeJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetInfrastructureascodeJobRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/infrastructureascode/jobs/{jobId}")
                .withPathParameter("jobId", jobId)
        

                .withQueryParameters("details", "", details)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String jobId) {
	    return new Builder()
	            .withRequiredParams(jobId);
	}


	public static class Builder {
		private final GetInfrastructureascodeJobRequest request;

		private Builder() {
			request = new GetInfrastructureascodeJobRequest();
		}


		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}

		public Builder withDetails(Boolean details) {
			request.setDetails(details);
			return this;
		}



		public Builder withRequiredParams(String jobId) {
			request.setJobId(jobId);

			return this;
		}


		public GetInfrastructureascodeJobRequest build() {
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for GetInfrastructureascodeJobRequest.");
            }
            
			return request;
		}
	}
}
