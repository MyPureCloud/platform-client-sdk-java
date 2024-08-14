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

import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.ActivityPlanJobListing;
import com.mypurecloud.sdk.v2.model.ActivityPlanJobResponse;
import com.mypurecloud.sdk.v2.model.ActivityPlanListing;
import com.mypurecloud.sdk.v2.model.ActivityPlanResponse;
import com.mypurecloud.sdk.v2.model.ActivityPlanRunJobResponse;
import com.mypurecloud.sdk.v2.model.AddAdherenceExplanationAdminRequest;
import com.mypurecloud.sdk.v2.model.AddAdherenceExplanationAgentRequest;
import com.mypurecloud.sdk.v2.model.AddShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.AddWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationAsyncResponse;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationJob;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationResponse;
import com.mypurecloud.sdk.v2.model.AdminAgentWorkPlanPreferenceResponse;
import com.mypurecloud.sdk.v2.model.AdminBulkUpdateAlternativeShiftTradeStateRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.AgentIntegrationsRequest;
import com.mypurecloud.sdk.v2.model.AgentIntegrationsResponse;
import com.mypurecloud.sdk.v2.model.AgentManagementUnitReference;
import com.mypurecloud.sdk.v2.model.AgentPossibleWorkShiftsRequest;
import com.mypurecloud.sdk.v2.model.AgentPossibleWorkShiftsResponse;
import com.mypurecloud.sdk.v2.model.AgentQueryAdherenceExplanationsRequest;
import com.mypurecloud.sdk.v2.model.AgentQueryAdherenceExplanationsResponse;
import com.mypurecloud.sdk.v2.model.AgentTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.AgentUpdateAlternativeShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.AgentWorkPlanBiddingPreferenceResponse;
import com.mypurecloud.sdk.v2.model.AgentWorkPlanBids;
import com.mypurecloud.sdk.v2.model.AgentWorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.AgentsBidAssignedWorkPlanOverrideRequest;
import com.mypurecloud.sdk.v2.model.AgentsIntegrationsListing;
import com.mypurecloud.sdk.v2.model.AlternativeShiftAsyncResponse;
import com.mypurecloud.sdk.v2.model.AlternativeShiftBuSettingsResponse;
import com.mypurecloud.sdk.v2.model.AlternativeShiftJobResponse;
import com.mypurecloud.sdk.v2.model.AlternativeShiftOffersRequest;
import com.mypurecloud.sdk.v2.model.AlternativeShiftSearchOffersRequest;
import com.mypurecloud.sdk.v2.model.AlternativeShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.AsyncForecastOperationResult;
import com.mypurecloud.sdk.v2.model.AsyncIntradayResponse;
import com.mypurecloud.sdk.v2.model.AvailableTimeOffRequest;
import com.mypurecloud.sdk.v2.model.AvailableTimeOffResponse;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleHistoryResponse;
import com.mypurecloud.sdk.v2.model.BuAlternativeShiftJobResponse;
import com.mypurecloud.sdk.v2.model.BuAsyncAgentSchedulesQueryResponse;
import com.mypurecloud.sdk.v2.model.BuAsyncAgentSchedulesSearchResponse;
import com.mypurecloud.sdk.v2.model.BuAsyncScheduleResponse;
import com.mypurecloud.sdk.v2.model.BuAsyncScheduleRunResponse;
import com.mypurecloud.sdk.v2.model.BuCopyScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuCreateBlankScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuCreateTimeOffLimitRequest;
import com.mypurecloud.sdk.v2.model.BuCreateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.BuCurrentAgentScheduleSearchResponse;
import com.mypurecloud.sdk.v2.model.BuForecastGenerationResult;
import com.mypurecloud.sdk.v2.model.BuForecastResultResponse;
import com.mypurecloud.sdk.v2.model.BuForecastStaffingRequirementsResultResponse;
import com.mypurecloud.sdk.v2.model.BuGenerateScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuGetCurrentAgentScheduleRequest;
import com.mypurecloud.sdk.v2.model.BuHeadcountForecastResponse;
import com.mypurecloud.sdk.v2.model.BuListAlternativeShiftTradesResponse;
import com.mypurecloud.sdk.v2.model.BuQueryAdherenceExplanationsRequest;
import com.mypurecloud.sdk.v2.model.BuQueryAdherenceExplanationsResponse;
import com.mypurecloud.sdk.v2.model.BuQueryAgentSchedulesRequest;
import com.mypurecloud.sdk.v2.model.BuRescheduleRequest;
import com.mypurecloud.sdk.v2.model.BuRescheduleResult;
import com.mypurecloud.sdk.v2.model.BuScheduleListing;
import com.mypurecloud.sdk.v2.model.BuScheduleMetadata;
import com.mypurecloud.sdk.v2.model.BuScheduleRun;
import com.mypurecloud.sdk.v2.model.BuScheduleRunListing;
import com.mypurecloud.sdk.v2.model.BuSearchAgentSchedulesRequest;
import com.mypurecloud.sdk.v2.model.BuSetTimeOffLimitValuesRequest;
import com.mypurecloud.sdk.v2.model.BuShortTermForecast;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastListing;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitListing;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitResponse;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitValuesResponse;
import com.mypurecloud.sdk.v2.model.BuTimeOffPlanListing;
import com.mypurecloud.sdk.v2.model.BuTimeOffPlanResponse;
import com.mypurecloud.sdk.v2.model.BuUpdateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.BulkShiftTradeStateUpdateRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateShiftTradeStateResponse;
import com.mypurecloud.sdk.v2.model.BusinessUnitActivityCode;
import com.mypurecloud.sdk.v2.model.BusinessUnitActivityCodeListing;
import com.mypurecloud.sdk.v2.model.BusinessUnitListing;
import com.mypurecloud.sdk.v2.model.BusinessUnitResponse;
import com.mypurecloud.sdk.v2.model.CalendarUrlResponse;
import com.mypurecloud.sdk.v2.model.CopyBuForecastRequest;
import com.mypurecloud.sdk.v2.model.CopyWorkPlan;
import com.mypurecloud.sdk.v2.model.CopyWorkPlanBid;
import com.mypurecloud.sdk.v2.model.CopyWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.CreateActivityPlanRequest;
import com.mypurecloud.sdk.v2.model.CreateAdminTimeOffRequest;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;
import com.mypurecloud.sdk.v2.model.CreateAlternativeShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.CreateBusinessUnitRequest;
import com.mypurecloud.sdk.v2.model.CreateManagementUnitApiRequest;
import com.mypurecloud.sdk.v2.model.CreatePlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.CreateStaffingGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateTimeOffLimitRequest;
import com.mypurecloud.sdk.v2.model.CreateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.CreateWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateWorkPlanBid;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CurrentUserTimeOffIntegrationStatusRequest;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateAvailableTimeOffRequest;
import com.mypurecloud.sdk.v2.model.EstimateAvailableTimeOffResponse;
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupsResponse;
import com.mypurecloud.sdk.v2.model.GenerateBuForecastRequest;
import com.mypurecloud.sdk.v2.model.HistoricalImportDeleteJobResponse;
import com.mypurecloud.sdk.v2.model.HistoricalImportStatusListing;
import com.mypurecloud.sdk.v2.model.HrisTimeOffTypesJobResponse;
import com.mypurecloud.sdk.v2.model.HrisTimeOffTypesResponse;
import com.mypurecloud.sdk.v2.model.ImportForecastResponse;
import com.mypurecloud.sdk.v2.model.ImportForecastUploadResponse;
import com.mypurecloud.sdk.v2.model.ImportScheduleUploadResponse;
import com.mypurecloud.sdk.v2.model.IntradayPlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.ListAlternativeShiftTradesResponse;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.LongTermForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.MatchShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.MatchShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.MoveAgentsRequest;
import com.mypurecloud.sdk.v2.model.MoveAgentsResponse;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitResponse;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.PatchBuScheduleRunRequest;
import com.mypurecloud.sdk.v2.model.PatchShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.PerformancePredictionRecalculationResponse;
import com.mypurecloud.sdk.v2.model.PerformancePredictionRecalculationUploadResponse;
import com.mypurecloud.sdk.v2.model.PerformancePredictionResponse;
import com.mypurecloud.sdk.v2.model.PlanningGroup;
import com.mypurecloud.sdk.v2.model.PlanningGroupList;
import com.mypurecloud.sdk.v2.model.ProcessScheduleUpdateUploadRequest;
import com.mypurecloud.sdk.v2.model.QueryAdherenceExplanationsResponse;
import com.mypurecloud.sdk.v2.model.QueryAgentsIntegrationsRequest;
import com.mypurecloud.sdk.v2.model.QueryTimeOffIntegrationStatusRequest;
import com.mypurecloud.sdk.v2.model.QueryTimeOffLimitValuesRequest;
import com.mypurecloud.sdk.v2.model.QueryTimeOffLimitValuesResponse;
import com.mypurecloud.sdk.v2.model.QueryUserStaffingGroupListRequest;
import com.mypurecloud.sdk.v2.model.QueryWaitlistPositionsRequest;
import com.mypurecloud.sdk.v2.model.ScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.ScheduleUploadProcessingResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.SearchAlternativeShiftTradesRequest;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesRequest;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplateList;
import com.mypurecloud.sdk.v2.model.SetTimeOffIntegrationStatusRequest;
import com.mypurecloud.sdk.v2.model.SetTimeOffLimitValuesRequest;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.StaffingGroupListing;
import com.mypurecloud.sdk.v2.model.StaffingGroupResponse;
import com.mypurecloud.sdk.v2.model.TimeOffBalanceJobResponse;
import com.mypurecloud.sdk.v2.model.TimeOffBalanceRequest;
import com.mypurecloud.sdk.v2.model.TimeOffBalancesResponse;
import com.mypurecloud.sdk.v2.model.TimeOffIntegrationStatusResponseListing;
import com.mypurecloud.sdk.v2.model.TimeOffLimit;
import com.mypurecloud.sdk.v2.model.TimeOffLimitListing;
import com.mypurecloud.sdk.v2.model.TimeOffPlan;
import com.mypurecloud.sdk.v2.model.TimeOffPlanListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestQueryBody;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdateActivityPlanRequest;
import com.mypurecloud.sdk.v2.model.UpdateAdherenceExplanationStatusRequest;
import com.mypurecloud.sdk.v2.model.UpdateAgentWorkPlanBiddingPreference;
import com.mypurecloud.sdk.v2.model.UpdateAlternativeShiftBuSettingsRequest;
import com.mypurecloud.sdk.v2.model.UpdateBusinessUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateMuAgentsRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsResponse;
import com.mypurecloud.sdk.v2.model.UpdatePlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.UpdateScheduleUploadResponse;
import com.mypurecloud.sdk.v2.model.UpdateServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.UpdateStaffingGroupRequest;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffLimitRequest;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffPlanRequest;
import com.mypurecloud.sdk.v2.model.UpdateWorkPlanBid;
import com.mypurecloud.sdk.v2.model.UpdateWorkPlanRotationRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequestBody;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherenceListing;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserStaffingGroupListing;
import com.mypurecloud.sdk.v2.model.UserTimeOffIntegrationStatusResponse;
import com.mypurecloud.sdk.v2.model.UserTimeOffIntegrationStatusResponseListing;
import com.mypurecloud.sdk.v2.model.ValidateWorkPlanResponse;
import com.mypurecloud.sdk.v2.model.ValidationServiceRequest;
import com.mypurecloud.sdk.v2.model.WaitlistPositionListing;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkQuery;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForTeams;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForUsers;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalShrinkageRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalShrinkageResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalShrinkageTeamsRequest;
import com.mypurecloud.sdk.v2.model.WfmIntegrationListing;
import com.mypurecloud.sdk.v2.model.WfmIntradayPlanningGroupListing;
import com.mypurecloud.sdk.v2.model.WfmProcessUploadRequest;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanBid;
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroupCreate;
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroupResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroupSummaryList;
import com.mypurecloud.sdk.v2.model.WorkPlanBidGroupUpdate;
import com.mypurecloud.sdk.v2.model.WorkPlanBidListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanBidRanks;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationResponse;
import com.mypurecloud.sdk.v2.model.WorkPlanValidationRequest;

public class GetWorkforcemanagementCalendarUrlIcsRequest {

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

    public GetWorkforcemanagementCalendarUrlIcsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/workforcemanagement/calendar/url/ics")
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
		private final GetWorkforcemanagementCalendarUrlIcsRequest request;

		private Builder() {
			request = new GetWorkforcemanagementCalendarUrlIcsRequest();
		}





		public GetWorkforcemanagementCalendarUrlIcsRequest build() {
            
			return request;
		}
	}
}
