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
import com.mypurecloud.sdk.v2.model.ModelingStatusResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.SchedulingRunResponse;
import com.mypurecloud.sdk.v2.model.RescheduleResult;
import com.mypurecloud.sdk.v2.model.SchedulingRunListResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroup;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupList;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettings;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.ForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdateSchedulingRunRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UpdateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.AsyncWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.AgentTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForUsers;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateServiceGoalGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateAdminTimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestEntityList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestLookupList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestQueryBody;
import com.mypurecloud.sdk.v2.model.CopyWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.RescheduleRequest;
import com.mypurecloud.sdk.v2.model.ImportWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.UserSchedulesPartialUploadRequest;
import com.mypurecloud.sdk.v2.model.PartialUploadResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.CopyShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.ImportShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.RouteGroupList;
import com.mypurecloud.sdk.v2.model.CopyWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateManagementUnitApiRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsResponse;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;

public class PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest {
    
	private String managementUnitId;
	public String getManagementUnitId() {
		return this.managementUnitId;
	}

	public void setManagementUnitId(String managementUnitId) {
		this.managementUnitId = managementUnitId;
	}

	public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withManagementUnitId(String managementUnitId) {
	    this.setManagementUnitId(managementUnitId);
	    return this;
	} 
	
	private String weekDateId;
	public String getWeekDateId() {
		return this.weekDateId;
	}

	public void setWeekDateId(String weekDateId) {
		this.weekDateId = weekDateId;
	}

	public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withWeekDateId(String weekDateId) {
	    this.setWeekDateId(weekDateId);
	    return this;
	} 
	
	private String forecastId;
	public String getForecastId() {
		return this.forecastId;
	}

	public void setForecastId(String forecastId) {
		this.forecastId = forecastId;
	}

	public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withForecastId(String forecastId) {
	    this.setForecastId(forecastId);
	    return this;
	} 
	
	private CopyShortTermForecastRequest body;
	public CopyShortTermForecastRequest getBody() {
		return this.body;
	}

	public void setBody(CopyShortTermForecastRequest body) {
		this.body = body;
	}

	public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withBody(CopyShortTermForecastRequest body) {
	    this.setBody(body);
	    return this;
	} 
	
	private Boolean forceAsync;
	public Boolean getForceAsync() {
		return this.forceAsync;
	}

	public void setForceAsync(Boolean forceAsync) {
		this.forceAsync = forceAsync;
	}

	public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withForceAsync(Boolean forceAsync) {
	    this.setForceAsync(forceAsync);
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

    public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CopyShortTermForecastRequest> withHttpInfo() {
        
        // verify the required parameter 'managementUnitId' is set
        if (this.managementUnitId == null) {
            throw new IllegalStateException("Missing the required parameter 'managementUnitId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
        }
        
        // verify the required parameter 'weekDateId' is set
        if (this.weekDateId == null) {
            throw new IllegalStateException("Missing the required parameter 'weekDateId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
        }
        
        // verify the required parameter 'forecastId' is set
        if (this.forecastId == null) {
            throw new IllegalStateException("Missing the required parameter 'forecastId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/workforcemanagement/managementunits/{managementUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/copy")
                .withPathParameter("managementUnitId", managementUnitId)
        
                .withPathParameter("weekDateId", weekDateId)
        
                .withPathParameter("forecastId", forecastId)
        
                .withQueryParameters("forceAsync", "", forceAsync)
        
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

	
	public static Builder builder(String managementUnitId, String weekDateId, String forecastId, CopyShortTermForecastRequest body) {
	    return new Builder()
	            .withRequiredParams(managementUnitId, weekDateId, forecastId, body);
	}
	

	public static class Builder {
		private final PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest request;

		private Builder() {
			request = new PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest();
		}

		
		public Builder withManagementUnitId(String managementUnitId) {
			request.setManagementUnitId(managementUnitId);
			return this;
		}
		
		public Builder withWeekDateId(String weekDateId) {
			request.setWeekDateId(weekDateId);
			return this;
		}
		
		public Builder withForecastId(String forecastId) {
			request.setForecastId(forecastId);
			return this;
		}
		
		public Builder withBody(CopyShortTermForecastRequest body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withForceAsync(Boolean forceAsync) {
			request.setForceAsync(forceAsync);
			return this;
		}
		

		
		public Builder withRequiredParams(String managementUnitId, String weekDateId, String forecastId, CopyShortTermForecastRequest body) {
			request.setManagementUnitId(managementUnitId);
						request.setWeekDateId(weekDateId);
						request.setForecastId(forecastId);
						request.setBody(body);
			
			return this;
		}
		

		public PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest build() {
            
            // verify the required parameter 'managementUnitId' is set
            if (request.managementUnitId == null) {
                throw new IllegalStateException("Missing the required parameter 'managementUnitId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
            }
            
            // verify the required parameter 'weekDateId' is set
            if (request.weekDateId == null) {
                throw new IllegalStateException("Missing the required parameter 'weekDateId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
            }
            
            // verify the required parameter 'forecastId' is set
            if (request.forecastId == null) {
                throw new IllegalStateException("Missing the required parameter 'forecastId' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.");
            }
            
			return request;
		}
	}
}
