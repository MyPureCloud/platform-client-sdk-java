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

public class PatchJourneyActionmapRequest {
    
	private String actionMapId;
	public String getActionMapId() {
		return this.actionMapId;
	}

	public void setActionMapId(String actionMapId) {
		this.actionMapId = actionMapId;
	}

	public PatchJourneyActionmapRequest withActionMapId(String actionMapId) {
	    this.setActionMapId(actionMapId);
	    return this;
	} 
	
	private PatchActionMap body;
	public PatchActionMap getBody() {
		return this.body;
	}

	public void setBody(PatchActionMap body) {
		this.body = body;
	}

	public PatchJourneyActionmapRequest withBody(PatchActionMap body) {
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

    public PatchJourneyActionmapRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PatchActionMap> withHttpInfo() {
        
        // verify the required parameter 'actionMapId' is set
        if (this.actionMapId == null) {
            throw new IllegalStateException("Missing the required parameter 'actionMapId' when building request for PatchJourneyActionmapRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/journey/actionmaps/{actionMapId}")
                .withPathParameter("actionMapId", actionMapId)
        
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

	
	public static Builder builder(String actionMapId) {
	    return new Builder()
	            .withRequiredParams(actionMapId);
	}
	

	public static class Builder {
		private final PatchJourneyActionmapRequest request;

		private Builder() {
			request = new PatchJourneyActionmapRequest();
		}

		
		public Builder withActionMapId(String actionMapId) {
			request.setActionMapId(actionMapId);
			return this;
		}
		
		public Builder withBody(PatchActionMap body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String actionMapId) {
			request.setActionMapId(actionMapId);
			
			return this;
		}
		

		public PatchJourneyActionmapRequest build() {
            
            // verify the required parameter 'actionMapId' is set
            if (request.actionMapId == null) {
                throw new IllegalStateException("Missing the required parameter 'actionMapId' when building request for PatchJourneyActionmapRequest.");
            }
            
			return request;
		}
	}
}
