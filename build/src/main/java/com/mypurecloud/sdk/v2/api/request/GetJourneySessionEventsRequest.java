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

import com.mypurecloud.sdk.v2.model.ActionEventRequest;
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
import com.mypurecloud.sdk.v2.model.DataRange;
import com.mypurecloud.sdk.v2.model.DeploymentPing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.FlowPaths;
import com.mypurecloud.sdk.v2.model.FlowPathsQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyEventDefinition;
import com.mypurecloud.sdk.v2.model.JourneyEventDefinitionListing;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.JourneySegmentRequest;
import com.mypurecloud.sdk.v2.model.JourneyView;
import com.mypurecloud.sdk.v2.model.JourneyViewChart;
import com.mypurecloud.sdk.v2.model.JourneyViewChartResult;
import com.mypurecloud.sdk.v2.model.JourneyViewJob;
import com.mypurecloud.sdk.v2.model.JourneyViewJobListing;
import com.mypurecloud.sdk.v2.model.JourneyViewListing;
import com.mypurecloud.sdk.v2.model.JourneyViewResult;
import com.mypurecloud.sdk.v2.model.JourneyViewSchedule;
import com.mypurecloud.sdk.v2.model.JourneyViewScheduleListing;
import com.mypurecloud.sdk.v2.model.Label;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;
import com.mypurecloud.sdk.v2.model.WebEventRequest;
import com.mypurecloud.sdk.v2.model.WebEventResponse;

public class GetJourneySessionEventsRequest {

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetJourneySessionEventsRequest withSessionId(String sessionId) {
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

	public GetJourneySessionEventsRequest withPageSize(String pageSize) {
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

	public GetJourneySessionEventsRequest withAfter(String after) {
	    this.setAfter(after);
	    return this;
	} 

	private String eventType;
	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public GetJourneySessionEventsRequest withEventType(String eventType) {
	    this.setEventType(eventType);
	    return this;
	} 

	public enum eventTypeValues { 
		COM_GENESYS_JOURNEY_OUTCOMEACHIEVEDEVENT("com.genesys.journey.OutcomeAchievedEvent"),
		COM_GENESYS_JOURNEY_SEGMENTASSIGNMENTEVENT("com.genesys.journey.SegmentAssignmentEvent"),
		COM_GENESYS_JOURNEY_WEBACTIONEVENT("com.genesys.journey.WebActionEvent"),
		COM_GENESYS_JOURNEY_WEBEVENT("com.genesys.journey.WebEvent"),
		COM_GENESYS_JOURNEY_APPEVENT("com.genesys.journey.AppEvent");

		private String value;

		eventTypeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static eventTypeValues fromString(String key) {
			if (key == null) return null;

			for (eventTypeValues value : eventTypeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return eventTypeValues.values()[0];
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

    public GetJourneySessionEventsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'sessionId' is set
        if (this.sessionId == null) {
            throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionEventsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/sessions/{sessionId}/events")
                .withPathParameter("sessionId", sessionId)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("after", "", after)
        

                .withQueryParameters("eventType", "", eventType)
        
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
		private final GetJourneySessionEventsRequest request;

		private Builder() {
			request = new GetJourneySessionEventsRequest();
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

		public Builder withEventType(String eventType) {
			request.setEventType(eventType);
			return this;
		}



		
		public Builder withEventType(eventTypeValues eventType) {
		    request.setEventType(eventType.toString());

		    return this;
		}



		public Builder withRequiredParams(String sessionId) {
			request.setSessionId(sessionId);

			return this;
		}


		public GetJourneySessionEventsRequest build() {
            
            // verify the required parameter 'sessionId' is set
            if (request.sessionId == null) {
                throw new IllegalStateException("Missing the required parameter 'sessionId' when building request for GetJourneySessionEventsRequest.");
            }
            
			return request;
		}
	}
}
