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
import com.mypurecloud.sdk.v2.model.BuAsyncScheduleResponse;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ModelingStatusResponse;
import com.mypurecloud.sdk.v2.model.AgentManagementUnitReference;
import com.mypurecloud.sdk.v2.model.BusinessUnit;
import com.mypurecloud.sdk.v2.model.BusinessUnitActivityCode;
import com.mypurecloud.sdk.v2.model.BusinessUnitActivityCodeListing;
import com.mypurecloud.sdk.v2.model.WfmIntradayPlanningGroupListing;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.PlanningGroup;
import com.mypurecloud.sdk.v2.model.PlanningGroupList;
import com.mypurecloud.sdk.v2.model.BuScheduleRun;
import com.mypurecloud.sdk.v2.model.BuRescheduleResult;
import com.mypurecloud.sdk.v2.model.BuScheduleRunListing;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplateList;
import com.mypurecloud.sdk.v2.model.BuScheduleMetadata;
import com.mypurecloud.sdk.v2.model.ScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.BuHeadcountForecastResponse;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryResponse;
import com.mypurecloud.sdk.v2.model.BuScheduleListing;
import com.mypurecloud.sdk.v2.model.BuShortTermForecast;
import com.mypurecloud.sdk.v2.model.BuForecastResultResponse;
import com.mypurecloud.sdk.v2.model.BuForecastGenerationResult;
import com.mypurecloud.sdk.v2.model.LongTermForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupsResponse;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastListing;
import com.mypurecloud.sdk.v2.model.BusinessUnitListing;
import com.mypurecloud.sdk.v2.model.CalendarUrlResponse;
import com.mypurecloud.sdk.v2.model.HistoricalImportDeleteJobResponse;
import com.mypurecloud.sdk.v2.model.HistoricalImportStatusListing;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherenceListing;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.TimeOffLimit;
import com.mypurecloud.sdk.v2.model.TimeOffLimitListing;
import com.mypurecloud.sdk.v2.model.TimeOffPlan;
import com.mypurecloud.sdk.v2.model.TimeOffPlanListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.QueryTimeOffLimitValuesResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.WeekShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.WaitlistPositionListing;
import com.mypurecloud.sdk.v2.model.UpdateBusinessUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdatePlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.PatchBuScheduleRunRequest;
import com.mypurecloud.sdk.v2.model.UpdateServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.UpdateManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffLimitRequest;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.PatchShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.UpdateWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.AgentTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForUsers;
import com.mypurecloud.sdk.v2.model.BuCurrentAgentScheduleSearchResponse;
import com.mypurecloud.sdk.v2.model.BuGetCurrentAgentScheduleRequest;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.BuAsyncAgentSchedulesSearchResponse;
import com.mypurecloud.sdk.v2.model.BuSearchAgentSchedulesRequest;
import com.mypurecloud.sdk.v2.model.IntradayPlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.AsyncIntradayResponse;
import com.mypurecloud.sdk.v2.model.CreatePlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.BuAsyncAgentSchedulesQueryResponse;
import com.mypurecloud.sdk.v2.model.BuQueryAgentSchedulesRequest;
import com.mypurecloud.sdk.v2.model.BuCopyScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuAsyncScheduleRunResponse;
import com.mypurecloud.sdk.v2.model.BuRescheduleRequest;
import com.mypurecloud.sdk.v2.model.BuCreateBlankScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuGenerateScheduleRequest;
import com.mypurecloud.sdk.v2.model.AsyncForecastOperationResult;
import com.mypurecloud.sdk.v2.model.CopyBuForecastRequest;
import com.mypurecloud.sdk.v2.model.GenerateBuForecastRequest;
import com.mypurecloud.sdk.v2.model.CreateBusinessUnitRequest;
import com.mypurecloud.sdk.v2.model.ValidationServiceRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitResponse;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateTimeOffLimitRequest;
import com.mypurecloud.sdk.v2.model.QueryTimeOffLimitValuesRequest;
import com.mypurecloud.sdk.v2.model.CreateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.CreateAdminTimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestQueryBody;
import com.mypurecloud.sdk.v2.model.TimeOffRequestListing;
import com.mypurecloud.sdk.v2.model.QueryWaitlistPositionsRequest;
import com.mypurecloud.sdk.v2.model.MatchShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.MatchShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.AddShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesResponse;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateShiftTradeStateResponse;
import com.mypurecloud.sdk.v2.model.BulkShiftTradeStateUpdateRequest;
import com.mypurecloud.sdk.v2.model.CopyWorkPlan;
import com.mypurecloud.sdk.v2.model.ValidateWorkPlanResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanValidationRequest;
import com.mypurecloud.sdk.v2.model.CopyWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.AddWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.CreateWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateManagementUnitApiRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsResponse;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.AvailableTimeOffResponse;
import com.mypurecloud.sdk.v2.model.AvailableTimeOffRequest;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;
import com.mypurecloud.sdk.v2.model.SetTimeOffLimitValuesRequest;

public class GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest {
    
	private String businessUnitId;
	public String getBusinessUnitId() {
		return this.businessUnitId;
	}

	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
	}

	public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest withBusinessUnitId(String businessUnitId) {
	    this.setBusinessUnitId(businessUnitId);
	    return this;
	} 
	
	private LocalDate weekDateId;
	public LocalDate getWeekDateId() {
		return this.weekDateId;
	}

	public void setWeekDateId(LocalDate weekDateId) {
		this.weekDateId = weekDateId;
	}

	public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest withWeekDateId(LocalDate weekDateId) {
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

	public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest withForecastId(String forecastId) {
	    this.setForecastId(forecastId);
	    return this;
	} 
	
	private Boolean forceDownloadService;
	public Boolean getForceDownloadService() {
		return this.forceDownloadService;
	}

	public void setForceDownloadService(Boolean forceDownloadService) {
		this.forceDownloadService = forceDownloadService;
	}

	public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest withForceDownloadService(Boolean forceDownloadService) {
	    this.setForceDownloadService(forceDownloadService);
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

    public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'businessUnitId' is set
        if (this.businessUnitId == null) {
            throw new IllegalStateException("Missing the required parameter 'businessUnitId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
        }
        
        // verify the required parameter 'weekDateId' is set
        if (this.weekDateId == null) {
            throw new IllegalStateException("Missing the required parameter 'weekDateId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
        }
        
        // verify the required parameter 'forecastId' is set
        if (this.forecastId == null) {
            throw new IllegalStateException("Missing the required parameter 'forecastId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekDateId}/shorttermforecasts/{forecastId}/longtermforecastdata")
                .withPathParameter("businessUnitId", businessUnitId)
        
                .withPathParameter("weekDateId", weekDateId)
        
                .withPathParameter("forecastId", forecastId)
        
                .withQueryParameters("forceDownloadService", "", forceDownloadService)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String businessUnitId, LocalDate weekDateId, String forecastId) {
	    return new Builder()
	            .withRequiredParams(businessUnitId, weekDateId, forecastId);
	}
	

	public static class Builder {
		private final GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest request;

		private Builder() {
			request = new GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest();
		}

		
		public Builder withBusinessUnitId(String businessUnitId) {
			request.setBusinessUnitId(businessUnitId);
			return this;
		}
		
		public Builder withWeekDateId(LocalDate weekDateId) {
			request.setWeekDateId(weekDateId);
			return this;
		}
		
		public Builder withForecastId(String forecastId) {
			request.setForecastId(forecastId);
			return this;
		}
		
		public Builder withForceDownloadService(Boolean forceDownloadService) {
			request.setForceDownloadService(forceDownloadService);
			return this;
		}
		

		
		public Builder withRequiredParams(String businessUnitId, LocalDate weekDateId, String forecastId) {
			request.setBusinessUnitId(businessUnitId);
						request.setWeekDateId(weekDateId);
						request.setForecastId(forecastId);
			
			return this;
		}
		

		public GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest build() {
            
            // verify the required parameter 'businessUnitId' is set
            if (request.businessUnitId == null) {
                throw new IllegalStateException("Missing the required parameter 'businessUnitId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
            }
            
            // verify the required parameter 'weekDateId' is set
            if (request.weekDateId == null) {
                throw new IllegalStateException("Missing the required parameter 'weekDateId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
            }
            
            // verify the required parameter 'forecastId' is set
            if (request.forecastId == null) {
                throw new IllegalStateException("Missing the required parameter 'forecastId' when building request for GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.");
            }
            
			return request;
		}
	}
}
