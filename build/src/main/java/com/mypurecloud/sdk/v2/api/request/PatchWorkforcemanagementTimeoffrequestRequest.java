package com.mypurecloud.sdk.v2.api.request;

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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.TimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.TimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;

public class PatchWorkforcemanagementTimeoffrequestRequest {
	private String timeOffRequestId;
	public String getTimeOffRequestId() {
		return this.timeOffRequestId;
	}

	public void setTimeOffRequestId(String timeOffRequestId) {
		this.timeOffRequestId = timeOffRequestId;
	}

	public PatchWorkforcemanagementTimeoffrequestRequest withTimeOffRequestId(String timeOffRequestId) {
	    this.setTimeOffRequestId(timeOffRequestId);
	    return this;
	}

	private TimeOffRequestPatch body;
	public TimeOffRequestPatch getBody() {
		return this.body;
	}

	public void setBody(TimeOffRequestPatch body) {
		this.body = body;
	}

	public PatchWorkforcemanagementTimeoffrequestRequest withBody(TimeOffRequestPatch body) {
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

    public PatchWorkforcemanagementTimeoffrequestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<TimeOffRequestPatch> withHttpInfo() {
        
        // verify the required parameter 'timeOffRequestId' is set
        if (this.timeOffRequestId == null) {
            throw new IllegalStateException("Missing the required parameter 'timeOffRequestId' when building request for PatchWorkforcemanagementTimeoffrequestRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/workforcemanagement/timeoffrequests/{timeOffRequestId}")
                .withPathParameter("timeOffRequestId", timeOffRequestId)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String timeOffRequestId) {
	    return new Builder()
	            .withRequiredParams(timeOffRequestId);
	}

	public static class Builder {
		private final PatchWorkforcemanagementTimeoffrequestRequest request;

		private Builder() {
			request = new PatchWorkforcemanagementTimeoffrequestRequest();
		}

		public Builder withTimeOffRequestId(String timeOffRequestId) {
			request.setTimeOffRequestId(timeOffRequestId);
			return this;
		}
		public Builder withBody(TimeOffRequestPatch body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String timeOffRequestId) {
			request.setTimeOffRequestId(timeOffRequestId);
			return this;
		}


		public PatchWorkforcemanagementTimeoffrequestRequest build() {
            
            // verify the required parameter 'timeOffRequestId' is set
            if (request.timeOffRequestId == null) {
                throw new IllegalStateException("Missing the required parameter 'timeOffRequestId' when building request for PatchWorkforcemanagementTimeoffrequestRequest.");
            }
            
			return request;
		}
	}
}
