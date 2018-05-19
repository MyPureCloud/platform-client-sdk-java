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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;

public class PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest {
    
	private String muId;
	public String getMuId() {
		return this.muId;
	}

	public void setMuId(String muId) {
		this.muId = muId;
	}

	public PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest withMuId(String muId) {
	    this.setMuId(muId);
	    return this;
	} 
	
	private WfmHistoricalAdherenceQuery body;
	public WfmHistoricalAdherenceQuery getBody() {
		return this.body;
	}

	public void setBody(WfmHistoricalAdherenceQuery body) {
		this.body = body;
	}

	public PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest withBody(WfmHistoricalAdherenceQuery body) {
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

    public PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WfmHistoricalAdherenceQuery> withHttpInfo() {
        
        // verify the required parameter 'muId' is set
        if (this.muId == null) {
            throw new IllegalStateException("Missing the required parameter 'muId' when building request for PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/workforcemanagement/managementunits/{muId}/historicaladherencequery")
                .withPathParameter("muId", muId)
        
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

	
	public static Builder builder(String muId) {
	    return new Builder()
	            .withRequiredParams(muId);
	}
	

	public static class Builder {
		private final PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest request;

		private Builder() {
			request = new PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest();
		}

		
		public Builder withMuId(String muId) {
			request.setMuId(muId);
			return this;
		}
		
		public Builder withBody(WfmHistoricalAdherenceQuery body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String muId) {
			request.setMuId(muId);
			
			return this;
		}
		

		public PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest build() {
            
            // verify the required parameter 'muId' is set
            if (request.muId == null) {
                throw new IllegalStateException("Missing the required parameter 'muId' when building request for PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest.");
            }
            
			return request;
		}
	}
}
