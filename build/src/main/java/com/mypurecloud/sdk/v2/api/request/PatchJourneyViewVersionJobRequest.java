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

public class PatchJourneyViewVersionJobRequest {

	private String viewId;
	public String getViewId() {
		return this.viewId;
	}

	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	public PatchJourneyViewVersionJobRequest withViewId(String viewId) {
	    this.setViewId(viewId);
	    return this;
	} 

	private String journeyVersionId;
	public String getJourneyVersionId() {
		return this.journeyVersionId;
	}

	public void setJourneyVersionId(String journeyVersionId) {
		this.journeyVersionId = journeyVersionId;
	}

	public PatchJourneyViewVersionJobRequest withJourneyVersionId(String journeyVersionId) {
	    this.setJourneyVersionId(journeyVersionId);
	    return this;
	} 

	private String jobId;
	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public PatchJourneyViewVersionJobRequest withJobId(String jobId) {
	    this.setJobId(jobId);
	    return this;
	} 

	private JourneyViewJob body;
	public JourneyViewJob getBody() {
		return this.body;
	}

	public void setBody(JourneyViewJob body) {
		this.body = body;
	}

	public PatchJourneyViewVersionJobRequest withBody(JourneyViewJob body) {
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

    public PatchJourneyViewVersionJobRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<JourneyViewJob> withHttpInfo() {
        
        // verify the required parameter 'viewId' is set
        if (this.viewId == null) {
            throw new IllegalStateException("Missing the required parameter 'viewId' when building request for PatchJourneyViewVersionJobRequest.");
        }
        
        // verify the required parameter 'journeyVersionId' is set
        if (this.journeyVersionId == null) {
            throw new IllegalStateException("Missing the required parameter 'journeyVersionId' when building request for PatchJourneyViewVersionJobRequest.");
        }
        
        // verify the required parameter 'jobId' is set
        if (this.jobId == null) {
            throw new IllegalStateException("Missing the required parameter 'jobId' when building request for PatchJourneyViewVersionJobRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchJourneyViewVersionJobRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/journey/views/{viewId}/versions/{journeyVersionId}/jobs/{jobId}")
                .withPathParameter("viewId", viewId)
        
                .withPathParameter("journeyVersionId", journeyVersionId)
        
                .withPathParameter("jobId", jobId)
        
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


	public static Builder builder(String viewId, String journeyVersionId, String jobId, JourneyViewJob body) {
	    return new Builder()
	            .withRequiredParams(viewId, journeyVersionId, jobId, body);
	}


	public static class Builder {
		private final PatchJourneyViewVersionJobRequest request;

		private Builder() {
			request = new PatchJourneyViewVersionJobRequest();
		}


		public Builder withViewId(String viewId) {
			request.setViewId(viewId);
			return this;
		}

		public Builder withJourneyVersionId(String journeyVersionId) {
			request.setJourneyVersionId(journeyVersionId);
			return this;
		}

		public Builder withJobId(String jobId) {
			request.setJobId(jobId);
			return this;
		}

		public Builder withBody(JourneyViewJob body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String viewId, String journeyVersionId, String jobId, JourneyViewJob body) {
			request.setViewId(viewId);
			request.setJourneyVersionId(journeyVersionId);
			request.setJobId(jobId);
			request.setBody(body);

			return this;
		}


		public PatchJourneyViewVersionJobRequest build() {
            
            // verify the required parameter 'viewId' is set
            if (request.viewId == null) {
                throw new IllegalStateException("Missing the required parameter 'viewId' when building request for PatchJourneyViewVersionJobRequest.");
            }
            
            // verify the required parameter 'journeyVersionId' is set
            if (request.journeyVersionId == null) {
                throw new IllegalStateException("Missing the required parameter 'journeyVersionId' when building request for PatchJourneyViewVersionJobRequest.");
            }
            
            // verify the required parameter 'jobId' is set
            if (request.jobId == null) {
                throw new IllegalStateException("Missing the required parameter 'jobId' when building request for PatchJourneyViewVersionJobRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchJourneyViewVersionJobRequest.");
            }
            
			return request;
		}
	}
}
