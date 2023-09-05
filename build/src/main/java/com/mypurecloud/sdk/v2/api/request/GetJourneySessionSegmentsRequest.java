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

import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateRequest;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateResult;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.AppEventRequest;
import com.mypurecloud.sdk.v2.model.AppEventResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;

public class GetJourneySessionSegmentsRequest {

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetJourneySessionSegmentsRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 

	private String pageSize;
	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public GetJourneySessionSegmentsRequest withPageSize(String pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String after;
	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GetJourneySessionSegmentsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String segmentScope;
	public String getSegmentScope() {
		return this.segmentScope;
	}

	public void setSegmentScope(String segmentScope) {
		this.segmentScope = segmentScope;
	}

	public GetJourneySessionSegmentsRequest withSegmentScope(String segmentScope) {
	    this.setSegmentScope(segmentScope);
	    return this;
	} 

	public enum segmentScopeValues { 
		SESSION("Session"),
		CUSTOMER("Customer");

		private String value;

		segmentScopeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static segmentScopeValues fromString(String key) {
			if (key == null) return null;

			for (segmentScopeValues value : segmentScopeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return segmentScopeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String assignmentState;
	public String getAssignmentState() {
		return this.assignmentState;
	}

	public void setAssignmentState(String assignmentState) {
		this.assignmentState = assignmentState;
	}

	public GetJourneySessionSegmentsRequest withAssignmentState(String assignmentState) {
	    this.setAssignmentState(assignmentState);
	    return this;
	} 

	public enum assignmentStateValues { 
		ASSIGNED("Assigned"),
		UNASSIGNED("Unassigned");

		private String value;

		assignmentStateValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static assignmentStateValues fromString(String key) {
			if (key == null) return null;

			for (assignmentStateValues value : assignmentStateValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return assignmentStateValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
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

    public GetJourneySessionSegmentsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionSegmentsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/sessions/{sessionId}/segments")
                .withPathParameter("sessionId", sessionId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("segmentScope", "", segmentScope)
        

                .withQueryParameters("assignmentState", "", assignmentState)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String sessionId) {
	    return new Builder()
	            .withRequiredParams(sessionId);
	}


	public static class Builder {
		private final GetJourneySessionSegmentsRequest request;

		private Builder() {
			request = new GetJourneySessionSegmentsRequest();
		}


		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}

		public Builder withPageSize(String pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withAfter(String after) {
			request.setAfter(after);
			return this;
		}

		public Builder withSegmentScope(String segmentScope) {
			request.setSegmentScope(segmentScope);
			return this;
		}



		
		public Builder withSegmentScope(segmentScopeValues segmentScope) {
		    request.setSegmentScope(segmentScope.toString());

		    return this;
		}

		public Builder withAssignmentState(String assignmentState) {
			request.setAssignmentState(assignmentState);
			return this;
		}



		
		public Builder withAssignmentState(assignmentStateValues assignmentState) {
		    request.setAssignmentState(assignmentState.toString());

		    return this;
		}



		public Builder withRequiredParams(String sessionId) {
			request.setSessionId(sessionId);

			return this;
		}


		public GetJourneySessionSegmentsRequest build() {
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionSegmentsRequest.");
            }
            
			return request;
		}
	}
}
