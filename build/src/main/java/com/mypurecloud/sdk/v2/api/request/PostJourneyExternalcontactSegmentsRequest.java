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
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentsUpdate;

public class PostJourneyExternalcontactSegmentsRequest {
    
	private String externalContactId;
	public String getExternalContactId() {
		return this.externalContactId;
	}

	public void setExternalContactId(String externalContactId) {
		this.externalContactId = externalContactId;
	}

	public PostJourneyExternalcontactSegmentsRequest withExternalContactId(String externalContactId) {
	    this.setExternalContactId(externalContactId);
	    return this;
	} 
	
	private List<SegmentAssignmentsUpdate> body;
	public List<SegmentAssignmentsUpdate> getBody() {
		return this.body;
	}

	public void setBody(List<SegmentAssignmentsUpdate> body) {
		this.body = body;
	}

	public PostJourneyExternalcontactSegmentsRequest withBody(List<SegmentAssignmentsUpdate> body) {
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

    public PostJourneyExternalcontactSegmentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<SegmentAssignmentsUpdate>> withHttpInfo() {
        
        // verify the required parameter 'externalContactId' is set
        if (this.externalContactId == null) {
            throw new IllegalStateException("Missing the required parameter 'externalContactId' when building request for PostJourneyExternalcontactSegmentsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/journey/externalcontacts/{externalContactId}/segments")
                .withPathParameter("externalContactId", externalContactId)
        
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

	
	public static Builder builder(String externalContactId) {
	    return new Builder()
	            .withRequiredParams(externalContactId);
	}
	

	public static class Builder {
		private final PostJourneyExternalcontactSegmentsRequest request;

		private Builder() {
			request = new PostJourneyExternalcontactSegmentsRequest();
		}

		
		public Builder withExternalContactId(String externalContactId) {
			request.setExternalContactId(externalContactId);
			return this;
		}
		
		public Builder withBody(List<SegmentAssignmentsUpdate> body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String externalContactId) {
			request.setExternalContactId(externalContactId);
			
			return this;
		}
		

		public PostJourneyExternalcontactSegmentsRequest build() {
            
            // verify the required parameter 'externalContactId' is set
            if (request.externalContactId == null) {
                throw new IllegalStateException("Missing the required parameter 'externalContactId' when building request for PostJourneyExternalcontactSegmentsRequest.");
            }
            
			return request;
		}
	}
}
