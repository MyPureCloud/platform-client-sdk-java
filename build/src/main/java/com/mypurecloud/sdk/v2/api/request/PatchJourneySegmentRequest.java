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
import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;

public class PatchJourneySegmentRequest {
    
	private String segmentId;
	public String getSegmentId() {
		return this.segmentId;
	}

	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public PatchJourneySegmentRequest withSegmentId(String segmentId) {
	    this.setSegmentId(segmentId);
	    return this;
	} 
	
	private PatchSegment body;
	public PatchSegment getBody() {
		return this.body;
	}

	public void setBody(PatchSegment body) {
		this.body = body;
	}

	public PatchJourneySegmentRequest withBody(PatchSegment body) {
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

    public PatchJourneySegmentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PatchSegment> withHttpInfo() {
        
        // verify the required parameter 'segmentId' is set
        if (this.segmentId == null) {
            throw new IllegalStateException("Missing the required parameter 'segmentId' when building request for PatchJourneySegmentRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/journey/segments/{segmentId}")
                .withPathParameter("segmentId", segmentId)
        
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

	
	public static Builder builder(String segmentId) {
	    return new Builder()
	            .withRequiredParams(segmentId);
	}
	

	public static class Builder {
		private final PatchJourneySegmentRequest request;

		private Builder() {
			request = new PatchJourneySegmentRequest();
		}

		
		public Builder withSegmentId(String segmentId) {
			request.setSegmentId(segmentId);
			return this;
		}
		
		public Builder withBody(PatchSegment body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String segmentId) {
			request.setSegmentId(segmentId);
			
			return this;
		}
		

		public PatchJourneySegmentRequest build() {
            
            // verify the required parameter 'segmentId' is set
            if (request.segmentId == null) {
                throw new IllegalStateException("Missing the required parameter 'segmentId' when building request for PatchJourneySegmentRequest.");
            }
            
			return request;
		}
	}
}
