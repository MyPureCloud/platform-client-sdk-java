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
import com.mypurecloud.sdk.v2.model.JourneyViewJob;
import com.mypurecloud.sdk.v2.model.JourneyViewJobListing;
import com.mypurecloud.sdk.v2.model.JourneyViewListing;
import com.mypurecloud.sdk.v2.model.JourneyViewResult;
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

public class GetJourneyViewsRequest {

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetJourneyViewsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetJourneyViewsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 

	private String nameOrCreatedBy;
	public String getNameOrCreatedBy() {
		return this.nameOrCreatedBy;
	}

	public void setNameOrCreatedBy(String nameOrCreatedBy) {
		this.nameOrCreatedBy = nameOrCreatedBy;
	}

	public GetJourneyViewsRequest withNameOrCreatedBy(String nameOrCreatedBy) {
	    this.setNameOrCreatedBy(nameOrCreatedBy);
	    return this;
	} 

	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetJourneyViewsRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		CHARTS("charts");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String id;
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GetJourneyViewsRequest withId(String id) {
	    this.setId(id);
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

    public GetJourneyViewsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/views")

                .withQueryParameters("pageNumber", "", pageNumber)
        

                .withQueryParameters("pageSize", "", pageSize)
        

                .withQueryParameters("nameOrCreatedBy", "", nameOrCreatedBy)
        

                .withQueryParameters("expand", "", expand)
        

                .withQueryParameters("id", "", id)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}



	public static class Builder {
		private final GetJourneyViewsRequest request;

		private Builder() {
			request = new GetJourneyViewsRequest();
		}


		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}

		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}

		public Builder withNameOrCreatedBy(String nameOrCreatedBy) {
			request.setNameOrCreatedBy(nameOrCreatedBy);
			return this;
		}

		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}



		
		public Builder withExpand(expandValues expand) {
		    request.setExpand(expand.toString());

		    return this;
		}

		public Builder withId(String id) {
			request.setId(id);
			return this;
		}




		public GetJourneyViewsRequest build() {
            
			return request;
		}
	}
}
