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

public class GetJourneyDeploymentCustomerPingRequest {

	private String deploymentId;
	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public GetJourneyDeploymentCustomerPingRequest withDeploymentId(String deploymentId) {
	    this.setDeploymentId(deploymentId);
	    return this;
	} 

	private String customerCookieId;
	public String getCustomerCookieId() {
		return this.customerCookieId;
	}

	public void setCustomerCookieId(String customerCookieId) {
		this.customerCookieId = customerCookieId;
	}

	public GetJourneyDeploymentCustomerPingRequest withCustomerCookieId(String customerCookieId) {
	    this.setCustomerCookieId(customerCookieId);
	    return this;
	} 

	private String dl;
	public String getDl() {
		return this.dl;
	}

	public void setDl(String dl) {
		this.dl = dl;
	}

	public GetJourneyDeploymentCustomerPingRequest withDl(String dl) {
	    this.setDl(dl);
	    return this;
	} 

	private String dt;
	public String getDt() {
		return this.dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public GetJourneyDeploymentCustomerPingRequest withDt(String dt) {
	    this.setDt(dt);
	    return this;
	} 

	private String appNamespace;
	public String getAppNamespace() {
		return this.appNamespace;
	}

	public void setAppNamespace(String appNamespace) {
		this.appNamespace = appNamespace;
	}

	public GetJourneyDeploymentCustomerPingRequest withAppNamespace(String appNamespace) {
	    this.setAppNamespace(appNamespace);
	    return this;
	} 

	private String sessionId;
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public GetJourneyDeploymentCustomerPingRequest withSessionId(String sessionId) {
	    this.setSessionId(sessionId);
	    return this;
	} 

	private Long sinceLastBeaconMilliseconds;
	public Long getSinceLastBeaconMilliseconds() {
		return this.sinceLastBeaconMilliseconds;
	}

	public void setSinceLastBeaconMilliseconds(Long sinceLastBeaconMilliseconds) {
		this.sinceLastBeaconMilliseconds = sinceLastBeaconMilliseconds;
	}

	public GetJourneyDeploymentCustomerPingRequest withSinceLastBeaconMilliseconds(Long sinceLastBeaconMilliseconds) {
	    this.setSinceLastBeaconMilliseconds(sinceLastBeaconMilliseconds);
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

    public GetJourneyDeploymentCustomerPingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'deploymentId' is set
        if (this.deploymentId == null) {
            throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetJourneyDeploymentCustomerPingRequest.");
        }
        
        // verify the required parameter 'customerCookieId' is set
        if (this.customerCookieId == null) {
            throw new IllegalStateException("Missing the required parameter 'customerCookieId' when building request for GetJourneyDeploymentCustomerPingRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/journey/deployments/{deploymentId}/customers/{customerCookieId}/ping")
                .withPathParameter("deploymentId", deploymentId)
        
                .withPathParameter("customerCookieId", customerCookieId)
        

                .withQueryParameters("dl", "", dl)
        

                .withQueryParameters("dt", "", dt)
        

                .withQueryParameters("appNamespace", "", appNamespace)
        

                .withQueryParameters("sessionId", "", sessionId)
        

                .withQueryParameters("sinceLastBeaconMilliseconds", "", sinceLastBeaconMilliseconds)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames()
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String deploymentId, String customerCookieId) {
	    return new Builder()
	            .withRequiredParams(deploymentId, customerCookieId);
	}


	public static class Builder {
		private final GetJourneyDeploymentCustomerPingRequest request;

		private Builder() {
			request = new GetJourneyDeploymentCustomerPingRequest();
		}


		public Builder withDeploymentId(String deploymentId) {
			request.setDeploymentId(deploymentId);
			return this;
		}

		public Builder withCustomerCookieId(String customerCookieId) {
			request.setCustomerCookieId(customerCookieId);
			return this;
		}

		public Builder withDl(String dl) {
			request.setDl(dl);
			return this;
		}

		public Builder withDt(String dt) {
			request.setDt(dt);
			return this;
		}

		public Builder withAppNamespace(String appNamespace) {
			request.setAppNamespace(appNamespace);
			return this;
		}

		public Builder withSessionId(String sessionId) {
			request.setSessionId(sessionId);
			return this;
		}

		public Builder withSinceLastBeaconMilliseconds(Long sinceLastBeaconMilliseconds) {
			request.setSinceLastBeaconMilliseconds(sinceLastBeaconMilliseconds);
			return this;
		}



		public Builder withRequiredParams(String deploymentId, String customerCookieId) {
			request.setDeploymentId(deploymentId);
			request.setCustomerCookieId(customerCookieId);

			return this;
		}


		public GetJourneyDeploymentCustomerPingRequest build() {
            
            // verify the required parameter 'deploymentId' is set
            if (request.deploymentId == null) {
                throw new IllegalStateException("Missing the required parameter 'deploymentId' when building request for GetJourneyDeploymentCustomerPingRequest.");
            }
            
            // verify the required parameter 'customerCookieId' is set
            if (request.customerCookieId == null) {
                throw new IllegalStateException("Missing the required parameter 'customerCookieId' when building request for GetJourneyDeploymentCustomerPingRequest.");
            }
            
			return request;
		}
	}
}
