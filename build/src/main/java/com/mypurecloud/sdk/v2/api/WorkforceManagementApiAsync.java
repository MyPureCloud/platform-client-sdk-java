package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

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


import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanrotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdhocmodelingjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAgentManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAgentsMeManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementCalendarDataIcsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataDeletejobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAgentShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitShifttradesMatchedRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitShifttradesUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitTimeoffplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplanrotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplanrotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementNotificationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementSchedulingjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWeekShifttradeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanrotationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceHistoricalRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentschedulesMineRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitIntradayRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementHistoricaldataDeletejobRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementHistoricaldataValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitAgentschedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitMoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanrotationCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanrotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementNotificationsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeofflimitsAvailableQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWorkforcemanagementManagementunitTimeofflimitValuesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WorkforceManagementApiAsync {
  private final ApiClient pcapiClient;

  public WorkforceManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitAsync(DeleteWorkforcemanagementBusinessunitRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deletes an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitActivitycodeAsync(DeleteWorkforcemanagementBusinessunitActivitycodeRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitActivitycodeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deletes the planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitPlanninggroupAsync(DeleteWorkforcemanagementBusinessunitPlanninggroupRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes the planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitPlanninggroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Cancel a scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitSchedulingRunAsync(DeleteWorkforcemanagementBusinessunitSchedulingRunRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Cancel a scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitSchedulingRunAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitServicegoaltemplateAsync(DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitServicegoaltemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncScheduleResponse> deleteWorkforcemanagementBusinessunitWeekScheduleAsync(DeleteWorkforcemanagementBusinessunitWeekScheduleRequest request, final AsyncApiCallback<BuAsyncScheduleResponse> callback) {
    try {
      final SettableFuture<BuAsyncScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncScheduleResponse>> deleteWorkforcemanagementBusinessunitWeekScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementBusinessunitWeekShorttermforecastAsync(DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementBusinessunitWeekShorttermforecastAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Disable generated calendar link for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementCalendarUrlIcsAsync(DeleteWorkforcemanagementCalendarUrlIcsRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Disable generated calendar link for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementCalendarUrlIcsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitAsync(DeleteWorkforcemanagementManagementunitRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deletes a time off limit object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitTimeofflimitAsync(DeleteWorkforcemanagementManagementunitTimeofflimitRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes a time off limit object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitTimeofflimitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deletes a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitTimeoffplanAsync(DeleteWorkforcemanagementManagementunitTimeoffplanRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deletes a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitTimeoffplanAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitWorkplanAsync(DeleteWorkforcemanagementManagementunitWorkplanRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitWorkplanAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitWorkplanrotationAsync(DeleteWorkforcemanagementManagementunitWorkplanrotationRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitWorkplanrotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceAsync(GetWorkforcemanagementAdherenceRequest request, final AsyncApiCallback<List<UserScheduleAdherence>> callback) {
    try {
      final SettableFuture<List<UserScheduleAdherence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UserScheduleAdherence>>> getWorkforcemanagementAdherenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<UserScheduleAdherence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get status of the modeling job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ModelingStatusResponse> getWorkforcemanagementAdhocmodelingjobAsync(GetWorkforcemanagementAdhocmodelingjobRequest request, final AsyncApiCallback<ModelingStatusResponse> callback) {
    try {
      final SettableFuture<ModelingStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ModelingStatusResponse>() {}, new AsyncApiCallback<ApiResponse<ModelingStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ModelingStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of the modeling job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ModelingStatusResponse>> getWorkforcemanagementAdhocmodelingjobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ModelingStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ModelingStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ModelingStatusResponse>() {}, new AsyncApiCallback<ApiResponse<ModelingStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ModelingStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ModelingStatusResponse> response = (ApiResponse<ModelingStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ModelingStatusResponse> response = (ApiResponse<ModelingStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the management unit to which the agent belongs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgentManagementUnitReference> getWorkforcemanagementAgentManagementunitAsync(GetWorkforcemanagementAgentManagementunitRequest request, final AsyncApiCallback<AgentManagementUnitReference> callback) {
    try {
      final SettableFuture<AgentManagementUnitReference> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgentManagementUnitReference>() {}, new AsyncApiCallback<ApiResponse<AgentManagementUnitReference>>() {
        @Override
        public void onCompleted(ApiResponse<AgentManagementUnitReference> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the management unit to which the agent belongs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgentManagementUnitReference>> getWorkforcemanagementAgentManagementunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgentManagementUnitReference>> callback) {
    try {
      final SettableFuture<ApiResponse<AgentManagementUnitReference>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgentManagementUnitReference>() {}, new AsyncApiCallback<ApiResponse<AgentManagementUnitReference>>() {
        @Override
        public void onCompleted(ApiResponse<AgentManagementUnitReference> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgentManagementUnitReference> getWorkforcemanagementAgentsMeManagementunitAsync(GetWorkforcemanagementAgentsMeManagementunitRequest request, final AsyncApiCallback<AgentManagementUnitReference> callback) {
    try {
      final SettableFuture<AgentManagementUnitReference> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgentManagementUnitReference>() {}, new AsyncApiCallback<ApiResponse<AgentManagementUnitReference>>() {
        @Override
        public void onCompleted(ApiResponse<AgentManagementUnitReference> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgentManagementUnitReference>> getWorkforcemanagementAgentsMeManagementunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgentManagementUnitReference>> callback) {
    try {
      final SettableFuture<ApiResponse<AgentManagementUnitReference>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgentManagementUnitReference>() {}, new AsyncApiCallback<ApiResponse<AgentManagementUnitReference>>() {
        @Override
        public void onCompleted(ApiResponse<AgentManagementUnitReference> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnit> getWorkforcemanagementBusinessunitAsync(GetWorkforcemanagementBusinessunitRequest request, final AsyncApiCallback<BusinessUnit> callback) {
    try {
      final SettableFuture<BusinessUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnit>> getWorkforcemanagementBusinessunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitActivityCode> getWorkforcemanagementBusinessunitActivitycodeAsync(GetWorkforcemanagementBusinessunitActivitycodeRequest request, final AsyncApiCallback<BusinessUnitActivityCode> callback) {
    try {
      final SettableFuture<BusinessUnitActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitActivityCode>> getWorkforcemanagementBusinessunitActivitycodeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitActivityCodeListing> getWorkforcemanagementBusinessunitActivitycodesAsync(GetWorkforcemanagementBusinessunitActivitycodesRequest request, final AsyncApiCallback<BusinessUnitActivityCodeListing> callback) {
    try {
      final SettableFuture<BusinessUnitActivityCodeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCodeListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCodeListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCodeListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitActivityCodeListing>> getWorkforcemanagementBusinessunitActivitycodesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessUnitActivityCodeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitActivityCodeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitActivityCodeListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCodeListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCodeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCodeListing> response = (ApiResponse<BusinessUnitActivityCodeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCodeListing> response = (ApiResponse<BusinessUnitActivityCodeListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get intraday planning groups for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmIntradayPlanningGroupListing> getWorkforcemanagementBusinessunitIntradayPlanninggroupsAsync(GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest request, final AsyncApiCallback<WfmIntradayPlanningGroupListing> callback) {
    try {
      final SettableFuture<WfmIntradayPlanningGroupListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmIntradayPlanningGroupListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayPlanningGroupListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayPlanningGroupListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get intraday planning groups for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmIntradayPlanningGroupListing>> getWorkforcemanagementBusinessunitIntradayPlanninggroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmIntradayPlanningGroupListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmIntradayPlanningGroupListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmIntradayPlanningGroupListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayPlanningGroupListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayPlanningGroupListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayPlanningGroupListing> response = (ApiResponse<WfmIntradayPlanningGroupListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayPlanningGroupListing> response = (ApiResponse<WfmIntradayPlanningGroupListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get all authorized management units in the business unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitListing> getWorkforcemanagementBusinessunitManagementunitsAsync(GetWorkforcemanagementBusinessunitManagementunitsRequest request, final AsyncApiCallback<ManagementUnitListing> callback) {
    try {
      final SettableFuture<ManagementUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all authorized management units in the business unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitListing>> getWorkforcemanagementBusinessunitManagementunitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PlanningGroup> getWorkforcemanagementBusinessunitPlanninggroupAsync(GetWorkforcemanagementBusinessunitPlanninggroupRequest request, final AsyncApiCallback<PlanningGroup> callback) {
    try {
      final SettableFuture<PlanningGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PlanningGroup>> getWorkforcemanagementBusinessunitPlanninggroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PlanningGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<PlanningGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets list of planning groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PlanningGroupList> getWorkforcemanagementBusinessunitPlanninggroupsAsync(GetWorkforcemanagementBusinessunitPlanninggroupsRequest request, final AsyncApiCallback<PlanningGroupList> callback) {
    try {
      final SettableFuture<PlanningGroupList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PlanningGroupList>() {}, new AsyncApiCallback<ApiResponse<PlanningGroupList>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroupList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets list of planning groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PlanningGroupList>> getWorkforcemanagementBusinessunitPlanninggroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PlanningGroupList>> callback) {
    try {
      final SettableFuture<ApiResponse<PlanningGroupList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PlanningGroupList>() {}, new AsyncApiCallback<ApiResponse<PlanningGroupList>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroupList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroupList> response = (ApiResponse<PlanningGroupList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroupList> response = (ApiResponse<PlanningGroupList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuScheduleRun> getWorkforcemanagementBusinessunitSchedulingRunAsync(GetWorkforcemanagementBusinessunitSchedulingRunRequest request, final AsyncApiCallback<BuScheduleRun> callback) {
    try {
      final SettableFuture<BuScheduleRun> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuScheduleRun>() {}, new AsyncApiCallback<ApiResponse<BuScheduleRun>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleRun> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuScheduleRun>> getWorkforcemanagementBusinessunitSchedulingRunAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuScheduleRun>> callback) {
    try {
      final SettableFuture<ApiResponse<BuScheduleRun>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuScheduleRun>() {}, new AsyncApiCallback<ApiResponse<BuScheduleRun>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleRun> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleRun> response = (ApiResponse<BuScheduleRun>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleRun> response = (ApiResponse<BuScheduleRun>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the result of a rescheduling operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuRescheduleResult> getWorkforcemanagementBusinessunitSchedulingRunResultAsync(GetWorkforcemanagementBusinessunitSchedulingRunResultRequest request, final AsyncApiCallback<BuRescheduleResult> callback) {
    try {
      final SettableFuture<BuRescheduleResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuRescheduleResult>() {}, new AsyncApiCallback<ApiResponse<BuRescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<BuRescheduleResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the result of a rescheduling operation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuRescheduleResult>> getWorkforcemanagementBusinessunitSchedulingRunResultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuRescheduleResult>> callback) {
    try {
      final SettableFuture<ApiResponse<BuRescheduleResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuRescheduleResult>() {}, new AsyncApiCallback<ApiResponse<BuRescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<BuRescheduleResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuRescheduleResult> response = (ApiResponse<BuRescheduleResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuRescheduleResult> response = (ApiResponse<BuRescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the list of scheduling runs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuScheduleRunListing> getWorkforcemanagementBusinessunitSchedulingRunsAsync(GetWorkforcemanagementBusinessunitSchedulingRunsRequest request, final AsyncApiCallback<BuScheduleRunListing> callback) {
    try {
      final SettableFuture<BuScheduleRunListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuScheduleRunListing>() {}, new AsyncApiCallback<ApiResponse<BuScheduleRunListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleRunListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of scheduling runs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuScheduleRunListing>> getWorkforcemanagementBusinessunitSchedulingRunsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuScheduleRunListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BuScheduleRunListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuScheduleRunListing>() {}, new AsyncApiCallback<ApiResponse<BuScheduleRunListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleRunListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleRunListing> response = (ApiResponse<BuScheduleRunListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleRunListing> response = (ApiResponse<BuScheduleRunListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalTemplate> getWorkforcemanagementBusinessunitServicegoaltemplateAsync(GetWorkforcemanagementBusinessunitServicegoaltemplateRequest request, final AsyncApiCallback<ServiceGoalTemplate> callback) {
    try {
      final SettableFuture<ServiceGoalTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalTemplate>> getWorkforcemanagementBusinessunitServicegoaltemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServiceGoalTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets list of service goal templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalTemplateList> getWorkforcemanagementBusinessunitServicegoaltemplatesAsync(GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest request, final AsyncApiCallback<ServiceGoalTemplateList> callback) {
    try {
      final SettableFuture<ServiceGoalTemplateList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalTemplateList>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplateList>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplateList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets list of service goal templates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalTemplateList>> getWorkforcemanagementBusinessunitServicegoaltemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServiceGoalTemplateList>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalTemplateList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalTemplateList>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplateList>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplateList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplateList> response = (ApiResponse<ServiceGoalTemplateList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplateList> response = (ApiResponse<ServiceGoalTemplateList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuScheduleMetadata> getWorkforcemanagementBusinessunitWeekScheduleAsync(GetWorkforcemanagementBusinessunitWeekScheduleRequest request, final AsyncApiCallback<BuScheduleMetadata> callback) {
    try {
      final SettableFuture<BuScheduleMetadata> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuScheduleMetadata>() {}, new AsyncApiCallback<ApiResponse<BuScheduleMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleMetadata> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuScheduleMetadata>> getWorkforcemanagementBusinessunitWeekScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuScheduleMetadata>> callback) {
    try {
      final SettableFuture<ApiResponse<BuScheduleMetadata>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuScheduleMetadata>() {}, new AsyncApiCallback<ApiResponse<BuScheduleMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleMetadata> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the generation results for a generated schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScheduleGenerationResult> getWorkforcemanagementBusinessunitWeekScheduleGenerationresultsAsync(GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest request, final AsyncApiCallback<ScheduleGenerationResult> callback) {
    try {
      final SettableFuture<ScheduleGenerationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScheduleGenerationResult>() {}, new AsyncApiCallback<ApiResponse<ScheduleGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGenerationResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the generation results for a generated schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScheduleGenerationResult>> getWorkforcemanagementBusinessunitWeekScheduleGenerationresultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScheduleGenerationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<ScheduleGenerationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScheduleGenerationResult>() {}, new AsyncApiCallback<ApiResponse<ScheduleGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<ScheduleGenerationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGenerationResult> response = (ApiResponse<ScheduleGenerationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScheduleGenerationResult> response = (ApiResponse<ScheduleGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuHeadcountForecastResponse> getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastAsync(GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest request, final AsyncApiCallback<BuHeadcountForecastResponse> callback) {
    try {
      final SettableFuture<BuHeadcountForecastResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuHeadcountForecastResponse>() {}, new AsyncApiCallback<ApiResponse<BuHeadcountForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuHeadcountForecastResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuHeadcountForecastResponse>> getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuHeadcountForecastResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuHeadcountForecastResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuHeadcountForecastResponse>() {}, new AsyncApiCallback<ApiResponse<BuHeadcountForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuHeadcountForecastResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuHeadcountForecastResponse> response = (ApiResponse<BuHeadcountForecastResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuHeadcountForecastResponse> response = (ApiResponse<BuHeadcountForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAgentScheduleHistoryResponse> getWorkforcemanagementBusinessunitWeekScheduleHistoryAgentAsync(GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest request, final AsyncApiCallback<BuAgentScheduleHistoryResponse> callback) {
    try {
      final SettableFuture<BuAgentScheduleHistoryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAgentScheduleHistoryResponse>() {}, new AsyncApiCallback<ApiResponse<BuAgentScheduleHistoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAgentScheduleHistoryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAgentScheduleHistoryResponse>> getWorkforcemanagementBusinessunitWeekScheduleHistoryAgentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuAgentScheduleHistoryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAgentScheduleHistoryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAgentScheduleHistoryResponse>() {}, new AsyncApiCallback<ApiResponse<BuAgentScheduleHistoryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAgentScheduleHistoryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAgentScheduleHistoryResponse> response = (ApiResponse<BuAgentScheduleHistoryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAgentScheduleHistoryResponse> response = (ApiResponse<BuAgentScheduleHistoryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuScheduleListing> getWorkforcemanagementBusinessunitWeekSchedulesAsync(GetWorkforcemanagementBusinessunitWeekSchedulesRequest request, final AsyncApiCallback<BuScheduleListing> callback) {
    try {
      final SettableFuture<BuScheduleListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuScheduleListing>() {}, new AsyncApiCallback<ApiResponse<BuScheduleListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuScheduleListing>> getWorkforcemanagementBusinessunitWeekSchedulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuScheduleListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BuScheduleListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuScheduleListing>() {}, new AsyncApiCallback<ApiResponse<BuScheduleListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleListing> response = (ApiResponse<BuScheduleListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleListing> response = (ApiResponse<BuScheduleListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuShortTermForecast> getWorkforcemanagementBusinessunitWeekShorttermforecastAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest request, final AsyncApiCallback<BuShortTermForecast> callback) {
    try {
      final SettableFuture<BuShortTermForecast> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuShortTermForecast>() {}, new AsyncApiCallback<ApiResponse<BuShortTermForecast>>() {
        @Override
        public void onCompleted(ApiResponse<BuShortTermForecast> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuShortTermForecast>> getWorkforcemanagementBusinessunitWeekShorttermforecastAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuShortTermForecast>> callback) {
    try {
      final SettableFuture<ApiResponse<BuShortTermForecast>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuShortTermForecast>() {}, new AsyncApiCallback<ApiResponse<BuShortTermForecast>>() {
        @Override
        public void onCompleted(ApiResponse<BuShortTermForecast> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuShortTermForecast> response = (ApiResponse<BuShortTermForecast>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuShortTermForecast> response = (ApiResponse<BuShortTermForecast>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastDataAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest request, final AsyncApiCallback<BuForecastResultResponse> callback) {
    try {
      final SettableFuture<BuForecastResultResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<BuForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuForecastResultResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuForecastResultResponse>> getWorkforcemanagementBusinessunitWeekShorttermforecastDataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuForecastResultResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuForecastResultResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<BuForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuForecastResultResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuForecastResultResponse> response = (ApiResponse<BuForecastResultResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuForecastResultResponse> response = (ApiResponse<BuForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets the forecast generation results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuForecastGenerationResult> getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest request, final AsyncApiCallback<BuForecastGenerationResult> callback) {
    try {
      final SettableFuture<BuForecastGenerationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuForecastGenerationResult>() {}, new AsyncApiCallback<ApiResponse<BuForecastGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<BuForecastGenerationResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets the forecast generation results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuForecastGenerationResult>> getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuForecastGenerationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<BuForecastGenerationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuForecastGenerationResult>() {}, new AsyncApiCallback<ApiResponse<BuForecastGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<BuForecastGenerationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuForecastGenerationResult> response = (ApiResponse<BuForecastGenerationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuForecastGenerationResult> response = (ApiResponse<BuForecastGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LongTermForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest request, final AsyncApiCallback<LongTermForecastResultResponse> callback) {
    try {
      final SettableFuture<LongTermForecastResultResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LongTermForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<LongTermForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LongTermForecastResultResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LongTermForecastResultResponse>> getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LongTermForecastResultResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LongTermForecastResultResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LongTermForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<LongTermForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LongTermForecastResultResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LongTermForecastResultResponse> response = (ApiResponse<LongTermForecastResultResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LongTermForecastResultResponse> response = (ApiResponse<LongTermForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets the forecast planning group snapshot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ForecastPlanningGroupsResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest request, final AsyncApiCallback<ForecastPlanningGroupsResponse> callback) {
    try {
      final SettableFuture<ForecastPlanningGroupsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ForecastPlanningGroupsResponse>() {}, new AsyncApiCallback<ApiResponse<ForecastPlanningGroupsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ForecastPlanningGroupsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets the forecast planning group snapshot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ForecastPlanningGroupsResponse>> getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ForecastPlanningGroupsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ForecastPlanningGroupsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ForecastPlanningGroupsResponse>() {}, new AsyncApiCallback<ApiResponse<ForecastPlanningGroupsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ForecastPlanningGroupsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ForecastPlanningGroupsResponse> response = (ApiResponse<ForecastPlanningGroupsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ForecastPlanningGroupsResponse> response = (ApiResponse<ForecastPlanningGroupsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuShortTermForecastListing> getWorkforcemanagementBusinessunitWeekShorttermforecastsAsync(GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest request, final AsyncApiCallback<BuShortTermForecastListing> callback) {
    try {
      final SettableFuture<BuShortTermForecastListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuShortTermForecastListing>() {}, new AsyncApiCallback<ApiResponse<BuShortTermForecastListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuShortTermForecastListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuShortTermForecastListing>> getWorkforcemanagementBusinessunitWeekShorttermforecastsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BuShortTermForecastListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BuShortTermForecastListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuShortTermForecastListing>() {}, new AsyncApiCallback<ApiResponse<BuShortTermForecastListing>>() {
        @Override
        public void onCompleted(ApiResponse<BuShortTermForecastListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuShortTermForecastListing> response = (ApiResponse<BuShortTermForecastListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuShortTermForecastListing> response = (ApiResponse<BuShortTermForecastListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get business units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitListing> getWorkforcemanagementBusinessunitsAsync(GetWorkforcemanagementBusinessunitsRequest request, final AsyncApiCallback<BusinessUnitListing> callback) {
    try {
      final SettableFuture<BusinessUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get business units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitListing>> getWorkforcemanagementBusinessunitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get business units across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitListing> getWorkforcemanagementBusinessunitsDivisionviewsAsync(GetWorkforcemanagementBusinessunitsDivisionviewsRequest request, final AsyncApiCallback<BusinessUnitListing> callback) {
    try {
      final SettableFuture<BusinessUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get business units across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitListing>> getWorkforcemanagementBusinessunitsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitListing>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> getWorkforcemanagementCalendarDataIcsAsync(GetWorkforcemanagementCalendarDataIcsRequest request, final AsyncApiCallback<String> callback) {
    try {
      final SettableFuture<String> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> getWorkforcemanagementCalendarDataIcsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      final SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get existing calendar link for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CalendarUrlResponse> getWorkforcemanagementCalendarUrlIcsAsync(GetWorkforcemanagementCalendarUrlIcsRequest request, final AsyncApiCallback<CalendarUrlResponse> callback) {
    try {
      final SettableFuture<CalendarUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CalendarUrlResponse>() {}, new AsyncApiCallback<ApiResponse<CalendarUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CalendarUrlResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get existing calendar link for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CalendarUrlResponse>> getWorkforcemanagementCalendarUrlIcsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CalendarUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CalendarUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CalendarUrlResponse>() {}, new AsyncApiCallback<ApiResponse<CalendarUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CalendarUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoricalImportDeleteJobResponse> getWorkforcemanagementHistoricaldataDeletejobAsync(GetWorkforcemanagementHistoricaldataDeletejobRequest request, final AsyncApiCallback<HistoricalImportDeleteJobResponse> callback) {
    try {
      final SettableFuture<HistoricalImportDeleteJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteJobResponse>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportDeleteJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoricalImportDeleteJobResponse>> getWorkforcemanagementHistoricaldataDeletejobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoricalImportDeleteJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoricalImportDeleteJobResponse>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportDeleteJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoricalImportStatusListing> getWorkforcemanagementHistoricaldataImportstatusAsync(GetWorkforcemanagementHistoricaldataImportstatusRequest request, final AsyncApiCallback<HistoricalImportStatusListing> callback) {
    try {
      final SettableFuture<HistoricalImportStatusListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoricalImportStatusListing>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportStatusListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoricalImportStatusListing>> getWorkforcemanagementHistoricaldataImportstatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoricalImportStatusListing>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoricalImportStatusListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoricalImportStatusListing>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportStatusListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportStatusListing> response = (ApiResponse<HistoricalImportStatusListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportStatusListing> response = (ApiResponse<HistoricalImportStatusListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnit> getWorkforcemanagementManagementunitAsync(GetWorkforcemanagementManagementunitRequest request, final AsyncApiCallback<ManagementUnit> callback) {
    try {
      final SettableFuture<ManagementUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnit>> getWorkforcemanagementManagementunitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesAsync(GetWorkforcemanagementManagementunitActivitycodesRequest request, final AsyncApiCallback<ActivityCodeContainer> callback) {
    try {
      final SettableFuture<ActivityCodeContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActivityCodeContainer>> getWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActivityCodeContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCodeContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleAdherenceListing> getWorkforcemanagementManagementunitAdherenceAsync(GetWorkforcemanagementManagementunitAdherenceRequest request, final AsyncApiCallback<UserScheduleAdherenceListing> callback) {
    try {
      final SettableFuture<UserScheduleAdherenceListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleAdherenceListing>() {}, new AsyncApiCallback<ApiResponse<UserScheduleAdherenceListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleAdherenceListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleAdherenceListing>> getWorkforcemanagementManagementunitAdherenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserScheduleAdherenceListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UserScheduleAdherenceListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleAdherenceListing>() {}, new AsyncApiCallback<ApiResponse<UserScheduleAdherenceListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleAdherenceListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleAdherenceListing> response = (ApiResponse<UserScheduleAdherenceListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleAdherenceListing> response = (ApiResponse<UserScheduleAdherenceListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get data for agent in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmAgent> getWorkforcemanagementManagementunitAgentAsync(GetWorkforcemanagementManagementunitAgentRequest request, final AsyncApiCallback<WfmAgent> callback) {
    try {
      final SettableFuture<WfmAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmAgent>() {}, new AsyncApiCallback<ApiResponse<WfmAgent>>() {
        @Override
        public void onCompleted(ApiResponse<WfmAgent> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmAgent>> getWorkforcemanagementManagementunitAgentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmAgent>() {}, new AsyncApiCallback<ApiResponse<WfmAgent>>() {
        @Override
        public void onCompleted(ApiResponse<WfmAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmAgent> response = (ApiResponse<WfmAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmAgent> response = (ApiResponse<WfmAgent>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets all the shift trades for a given agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShiftTradeListResponse> getWorkforcemanagementManagementunitAgentShifttradesAsync(GetWorkforcemanagementManagementunitAgentShifttradesRequest request, final AsyncApiCallback<ShiftTradeListResponse> callback) {
    try {
      final SettableFuture<ShiftTradeListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the shift trades for a given agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShiftTradeListResponse>> getWorkforcemanagementManagementunitAgentShifttradesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ShiftTradeListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShiftTradeListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShiftTradeMatchesSummaryResponse> getWorkforcemanagementManagementunitShifttradesMatchedAsync(GetWorkforcemanagementManagementunitShifttradesMatchedRequest request, final AsyncApiCallback<ShiftTradeMatchesSummaryResponse> callback) {
    try {
      final SettableFuture<ShiftTradeMatchesSummaryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShiftTradeMatchesSummaryResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeMatchesSummaryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeMatchesSummaryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShiftTradeMatchesSummaryResponse>> getWorkforcemanagementManagementunitShifttradesMatchedAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ShiftTradeMatchesSummaryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShiftTradeMatchesSummaryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShiftTradeMatchesSummaryResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeMatchesSummaryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeMatchesSummaryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeMatchesSummaryResponse> response = (ApiResponse<ShiftTradeMatchesSummaryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeMatchesSummaryResponse> response = (ApiResponse<ShiftTradeMatchesSummaryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmUserEntityListing> getWorkforcemanagementManagementunitShifttradesUsersAsync(GetWorkforcemanagementManagementunitShifttradesUsersRequest request, final AsyncApiCallback<WfmUserEntityListing> callback) {
    try {
      final SettableFuture<WfmUserEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmUserEntityListing>> getWorkforcemanagementManagementunitShifttradesUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmUserEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmUserEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffLimit> getWorkforcemanagementManagementunitTimeofflimitAsync(GetWorkforcemanagementManagementunitTimeofflimitRequest request, final AsyncApiCallback<TimeOffLimit> callback) {
    try {
      final SettableFuture<TimeOffLimit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffLimit>> getWorkforcemanagementManagementunitTimeofflimitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffLimit>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffLimit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffLimitListing> getWorkforcemanagementManagementunitTimeofflimitsAsync(GetWorkforcemanagementManagementunitTimeofflimitsRequest request, final AsyncApiCallback<TimeOffLimitListing> callback) {
    try {
      final SettableFuture<TimeOffLimitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffLimitListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimitListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffLimitListing>> getWorkforcemanagementManagementunitTimeofflimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffLimitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffLimitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffLimitListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimitListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimitListing> response = (ApiResponse<TimeOffLimitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimitListing> response = (ApiResponse<TimeOffLimitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffPlan> getWorkforcemanagementManagementunitTimeoffplanAsync(GetWorkforcemanagementManagementunitTimeoffplanRequest request, final AsyncApiCallback<TimeOffPlan> callback) {
    try {
      final SettableFuture<TimeOffPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffPlan>> getWorkforcemanagementManagementunitTimeoffplanAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets a list of time off plans
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffPlanListing> getWorkforcemanagementManagementunitTimeoffplansAsync(GetWorkforcemanagementManagementunitTimeoffplansRequest request, final AsyncApiCallback<TimeOffPlanListing> callback) {
    try {
      final SettableFuture<TimeOffPlanListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffPlanListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlanListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlanListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of time off plans
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffPlanListing>> getWorkforcemanagementManagementunitTimeoffplansAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffPlanListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffPlanListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffPlanListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlanListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlanListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlanListing> response = (ApiResponse<TimeOffPlanListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlanListing> response = (ApiResponse<TimeOffPlanListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request, final AsyncApiCallback<TimeOffRequestResponse> callback) {
    try {
      final SettableFuture<TimeOffRequestResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestResponse>> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequestResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueryTimeOffLimitValuesResponse> getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest request, final AsyncApiCallback<QueryTimeOffLimitValuesResponse> callback) {
    try {
      final SettableFuture<QueryTimeOffLimitValuesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueryTimeOffLimitValuesResponse>() {}, new AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueryTimeOffLimitValuesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueryTimeOffLimitValuesResponse>> getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QueryTimeOffLimitValuesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueryTimeOffLimitValuesResponse>() {}, new AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueryTimeOffLimitValuesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of time off requests for a given user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request, final AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      final SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get users in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersAsync(GetWorkforcemanagementManagementunitUsersRequest request, final AsyncApiCallback<WfmUserEntityListing> callback) {
    try {
      final SettableFuture<WfmUserEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get users in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmUserEntityListing>> getWorkforcemanagementManagementunitUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmUserEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmUserEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WeekScheduleResponse> getWorkforcemanagementManagementunitWeekScheduleAsync(GetWorkforcemanagementManagementunitWeekScheduleRequest request, final AsyncApiCallback<WeekScheduleResponse> callback) {
    try {
      final SettableFuture<WeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WeekScheduleResponse>> getWorkforcemanagementManagementunitWeekScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleResponse> response = (ApiResponse<WeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleResponse> response = (ApiResponse<WeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WeekScheduleListResponse> getWorkforcemanagementManagementunitWeekSchedulesAsync(GetWorkforcemanagementManagementunitWeekSchedulesRequest request, final AsyncApiCallback<WeekScheduleListResponse> callback) {
    try {
      final SettableFuture<WeekScheduleListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WeekScheduleListResponse>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WeekScheduleListResponse>> getWorkforcemanagementManagementunitWeekSchedulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WeekScheduleListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WeekScheduleListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WeekScheduleListResponse>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleListResponse> response = (ApiResponse<WeekScheduleListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleListResponse> response = (ApiResponse<WeekScheduleListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets all the shift trades for a given week
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WeekShiftTradeListResponse> getWorkforcemanagementManagementunitWeekShifttradesAsync(GetWorkforcemanagementManagementunitWeekShifttradesRequest request, final AsyncApiCallback<WeekShiftTradeListResponse> callback) {
    try {
      final SettableFuture<WeekShiftTradeListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WeekShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<WeekShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekShiftTradeListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the shift trades for a given week
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WeekShiftTradeListResponse>> getWorkforcemanagementManagementunitWeekShifttradesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WeekShiftTradeListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WeekShiftTradeListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WeekShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<WeekShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WeekShiftTradeListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekShiftTradeListResponse> response = (ApiResponse<WeekShiftTradeListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekShiftTradeListResponse> response = (ApiResponse<WeekShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlan> getWorkforcemanagementManagementunitWorkplanAsync(GetWorkforcemanagementManagementunitWorkplanRequest request, final AsyncApiCallback<WorkPlan> callback) {
    try {
      final SettableFuture<WorkPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlan>> getWorkforcemanagementManagementunitWorkplanAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanRotationResponse> getWorkforcemanagementManagementunitWorkplanrotationAsync(GetWorkforcemanagementManagementunitWorkplanrotationRequest request, final AsyncApiCallback<WorkPlanRotationResponse> callback) {
    try {
      final SettableFuture<WorkPlanRotationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanRotationResponse>> getWorkforcemanagementManagementunitWorkplanrotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanRotationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get work plan rotations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanRotationListResponse> getWorkforcemanagementManagementunitWorkplanrotationsAsync(GetWorkforcemanagementManagementunitWorkplanrotationsRequest request, final AsyncApiCallback<WorkPlanRotationListResponse> callback) {
    try {
      final SettableFuture<WorkPlanRotationListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanRotationListResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get work plan rotations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanRotationListResponse>> getWorkforcemanagementManagementunitWorkplanrotationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkPlanRotationListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanRotationListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanRotationListResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationListResponse> response = (ApiResponse<WorkPlanRotationListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationListResponse> response = (ApiResponse<WorkPlanRotationListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanListResponse> getWorkforcemanagementManagementunitWorkplansAsync(GetWorkforcemanagementManagementunitWorkplansRequest request, final AsyncApiCallback<WorkPlanListResponse> callback) {
    try {
      final SettableFuture<WorkPlanListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanListResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanListResponse>> getWorkforcemanagementManagementunitWorkplansAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkPlanListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanListResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanListResponse> response = (ApiResponse<WorkPlanListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanListResponse> response = (ApiResponse<WorkPlanListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitListing> getWorkforcemanagementManagementunitsAsync(GetWorkforcemanagementManagementunitsRequest request, final AsyncApiCallback<ManagementUnitListing> callback) {
    try {
      final SettableFuture<ManagementUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitListing>> getWorkforcemanagementManagementunitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get management units across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitListing> getWorkforcemanagementManagementunitsDivisionviewsAsync(GetWorkforcemanagementManagementunitsDivisionviewsRequest request, final AsyncApiCallback<ManagementUnitListing> callback) {
    try {
      final SettableFuture<ManagementUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get management units across divisions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitListing>> getWorkforcemanagementManagementunitsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of notifications for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NotificationsResponse> getWorkforcemanagementNotificationsAsync(GetWorkforcemanagementNotificationsRequest request, final AsyncApiCallback<NotificationsResponse> callback) {
    try {
      final SettableFuture<NotificationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NotificationsResponse>() {}, new AsyncApiCallback<ApiResponse<NotificationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NotificationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of notifications for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NotificationsResponse>> getWorkforcemanagementNotificationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NotificationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<NotificationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NotificationsResponse>() {}, new AsyncApiCallback<ApiResponse<NotificationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NotificationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NotificationsResponse> response = (ApiResponse<NotificationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NotificationsResponse> response = (ApiResponse<NotificationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get status of the scheduling job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchedulingStatusResponse> getWorkforcemanagementSchedulingjobAsync(GetWorkforcemanagementSchedulingjobRequest request, final AsyncApiCallback<SchedulingStatusResponse> callback) {
    try {
      final SettableFuture<SchedulingStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchedulingStatusResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of the scheduling job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchedulingStatusResponse>> getWorkforcemanagementSchedulingjobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchedulingStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SchedulingStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchedulingStatusResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingStatusResponse> response = (ApiResponse<SchedulingStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingStatusResponse> response = (ApiResponse<SchedulingStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets all of my shift trades
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShiftTradeListResponse> getWorkforcemanagementShifttradesAsync(GetWorkforcemanagementShifttradesRequest request, final AsyncApiCallback<ShiftTradeListResponse> callback) {
    try {
      final SettableFuture<ShiftTradeListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeListResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all of my shift trades
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShiftTradeListResponse>> getWorkforcemanagementShifttradesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ShiftTradeListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShiftTradeListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShiftTradeListResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestResponse> getWorkforcemanagementTimeoffrequestAsync(GetWorkforcemanagementTimeoffrequestRequest request, final AsyncApiCallback<TimeOffRequestResponse> callback) {
    try {
      final SettableFuture<TimeOffRequestResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestResponse>> getWorkforcemanagementTimeoffrequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequestResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WaitlistPositionListing> getWorkforcemanagementTimeoffrequestWaitlistpositionsAsync(GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest request, final AsyncApiCallback<WaitlistPositionListing> callback) {
    try {
      final SettableFuture<WaitlistPositionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WaitlistPositionListing>() {}, new AsyncApiCallback<ApiResponse<WaitlistPositionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WaitlistPositionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WaitlistPositionListing>> getWorkforcemanagementTimeoffrequestWaitlistpositionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WaitlistPositionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WaitlistPositionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WaitlistPositionListing>() {}, new AsyncApiCallback<ApiResponse<WaitlistPositionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WaitlistPositionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of time off requests for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsAsync(GetWorkforcemanagementTimeoffrequestsRequest request, final AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      final SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementTimeoffrequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update business unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnit> patchWorkforcemanagementBusinessunitAsync(PatchWorkforcemanagementBusinessunitRequest request, final AsyncApiCallback<BusinessUnit> callback) {
    try {
      final SettableFuture<BusinessUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update business unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnit>> patchWorkforcemanagementBusinessunitAsync(ApiRequest<UpdateBusinessUnitRequest> request, final AsyncApiCallback<ApiResponse<BusinessUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitActivityCode> patchWorkforcemanagementBusinessunitActivitycodeAsync(PatchWorkforcemanagementBusinessunitActivitycodeRequest request, final AsyncApiCallback<BusinessUnitActivityCode> callback) {
    try {
      final SettableFuture<BusinessUnitActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitActivityCode>> patchWorkforcemanagementBusinessunitActivitycodeAsync(ApiRequest<UpdateActivityCodeRequest> request, final AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates the planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PlanningGroup> patchWorkforcemanagementBusinessunitPlanninggroupAsync(PatchWorkforcemanagementBusinessunitPlanninggroupRequest request, final AsyncApiCallback<PlanningGroup> callback) {
    try {
      final SettableFuture<PlanningGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates the planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PlanningGroup>> patchWorkforcemanagementBusinessunitPlanninggroupAsync(ApiRequest<UpdatePlanningGroupRequest> request, final AsyncApiCallback<ApiResponse<PlanningGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<PlanningGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Mark a schedule run as applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchWorkforcemanagementBusinessunitSchedulingRunAsync(PatchWorkforcemanagementBusinessunitSchedulingRunRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Mark a schedule run as applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchWorkforcemanagementBusinessunitSchedulingRunAsync(ApiRequest<PatchBuScheduleRunRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalTemplate> patchWorkforcemanagementBusinessunitServicegoaltemplateAsync(PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest request, final AsyncApiCallback<ServiceGoalTemplate> callback) {
    try {
      final SettableFuture<ServiceGoalTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalTemplate>> patchWorkforcemanagementBusinessunitServicegoaltemplateAsync(ApiRequest<UpdateServiceGoalTemplate> request, final AsyncApiCallback<ApiResponse<ServiceGoalTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnit> patchWorkforcemanagementManagementunitAsync(PatchWorkforcemanagementManagementunitRequest request, final AsyncApiCallback<ManagementUnit> callback) {
    try {
      final SettableFuture<ManagementUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnit>> patchWorkforcemanagementManagementunitAsync(ApiRequest<UpdateManagementUnitRequest> request, final AsyncApiCallback<ApiResponse<ManagementUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffLimit> patchWorkforcemanagementManagementunitTimeofflimitAsync(PatchWorkforcemanagementManagementunitTimeofflimitRequest request, final AsyncApiCallback<TimeOffLimit> callback) {
    try {
      final SettableFuture<TimeOffLimit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffLimit>> patchWorkforcemanagementManagementunitTimeofflimitAsync(ApiRequest<UpdateTimeOffLimitRequest> request, final AsyncApiCallback<ApiResponse<TimeOffLimit>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffLimit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffPlan> patchWorkforcemanagementManagementunitTimeoffplanAsync(PatchWorkforcemanagementManagementunitTimeoffplanRequest request, final AsyncApiCallback<TimeOffPlan> callback) {
    try {
      final SettableFuture<TimeOffPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffPlan>> patchWorkforcemanagementManagementunitTimeoffplanAsync(ApiRequest<UpdateTimeOffPlanRequest> request, final AsyncApiCallback<ApiResponse<TimeOffPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequestAsync(PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest request, final AsyncApiCallback<TimeOffRequestResponse> callback) {
    try {
      final SettableFuture<TimeOffRequestResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestResponse>> patchWorkforcemanagementManagementunitUserTimeoffrequestAsync(ApiRequest<AdminTimeOffRequestPatch> request, final AsyncApiCallback<ApiResponse<TimeOffRequestResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShiftTradeResponse> patchWorkforcemanagementManagementunitWeekShifttradeAsync(PatchWorkforcemanagementManagementunitWeekShifttradeRequest request, final AsyncApiCallback<ShiftTradeResponse> callback) {
    try {
      final SettableFuture<ShiftTradeResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShiftTradeResponse>> patchWorkforcemanagementManagementunitWeekShifttradeAsync(ApiRequest<PatchShiftTradeRequest> request, final AsyncApiCallback<ApiResponse<ShiftTradeResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShiftTradeResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlan> patchWorkforcemanagementManagementunitWorkplanAsync(PatchWorkforcemanagementManagementunitWorkplanRequest request, final AsyncApiCallback<WorkPlan> callback) {
    try {
      final SettableFuture<WorkPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlan>> patchWorkforcemanagementManagementunitWorkplanAsync(ApiRequest<WorkPlan> request, final AsyncApiCallback<ApiResponse<WorkPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanRotationResponse> patchWorkforcemanagementManagementunitWorkplanrotationAsync(PatchWorkforcemanagementManagementunitWorkplanrotationRequest request, final AsyncApiCallback<WorkPlanRotationResponse> callback) {
    try {
      final SettableFuture<WorkPlanRotationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanRotationResponse>> patchWorkforcemanagementManagementunitWorkplanrotationAsync(ApiRequest<UpdateWorkPlanRotationRequest> request, final AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanRotationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestResponse> patchWorkforcemanagementTimeoffrequestAsync(PatchWorkforcemanagementTimeoffrequestRequest request, final AsyncApiCallback<TimeOffRequestResponse> callback) {
    try {
      final SettableFuture<TimeOffRequestResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestResponse>> patchWorkforcemanagementTimeoffrequestAsync(ApiRequest<AgentTimeOffRequestPatch> request, final AsyncApiCallback<ApiResponse<TimeOffRequestResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Request a historical adherence report for users across management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmHistoricalAdherenceResponse> postWorkforcemanagementAdherenceHistoricalAsync(PostWorkforcemanagementAdherenceHistoricalRequest request, final AsyncApiCallback<WfmHistoricalAdherenceResponse> callback) {
    try {
      final SettableFuture<WfmHistoricalAdherenceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Request a historical adherence report for users across management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmHistoricalAdherenceResponse>> postWorkforcemanagementAdherenceHistoricalAsync(ApiRequest<WfmHistoricalAdherenceQueryForUsers> request, final AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmHistoricalAdherenceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get published schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuCurrentAgentScheduleSearchResponse> postWorkforcemanagementAgentschedulesMineAsync(PostWorkforcemanagementAgentschedulesMineRequest request, final AsyncApiCallback<BuCurrentAgentScheduleSearchResponse> callback) {
    try {
      final SettableFuture<BuCurrentAgentScheduleSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuCurrentAgentScheduleSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuCurrentAgentScheduleSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuCurrentAgentScheduleSearchResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuCurrentAgentScheduleSearchResponse>> postWorkforcemanagementAgentschedulesMineAsync(ApiRequest<BuGetCurrentAgentScheduleRequest> request, final AsyncApiCallback<ApiResponse<BuCurrentAgentScheduleSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuCurrentAgentScheduleSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuCurrentAgentScheduleSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuCurrentAgentScheduleSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuCurrentAgentScheduleSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuCurrentAgentScheduleSearchResponse> response = (ApiResponse<BuCurrentAgentScheduleSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuCurrentAgentScheduleSearchResponse> response = (ApiResponse<BuCurrentAgentScheduleSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnitActivityCode> postWorkforcemanagementBusinessunitActivitycodesAsync(PostWorkforcemanagementBusinessunitActivitycodesRequest request, final AsyncApiCallback<BusinessUnitActivityCode> callback) {
    try {
      final SettableFuture<BusinessUnitActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnitActivityCode>> postWorkforcemanagementBusinessunitActivitycodesAsync(ApiRequest<CreateActivityCodeRequest> request, final AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnitActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnitActivityCode>() {}, new AsyncApiCallback<ApiResponse<BusinessUnitActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnitActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Search published schedules
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementBusinessunitAgentschedulesSearchAsync(PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest request, final AsyncApiCallback<BuAsyncAgentSchedulesSearchResponse> callback) {
    try {
      final SettableFuture<BuAsyncAgentSchedulesSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesSearchResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search published schedules
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> postWorkforcemanagementBusinessunitAgentschedulesSearchAsync(ApiRequest<BuSearchAgentSchedulesRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncIntradayResponse> postWorkforcemanagementBusinessunitIntradayAsync(PostWorkforcemanagementBusinessunitIntradayRequest request, final AsyncApiCallback<AsyncIntradayResponse> callback) {
    try {
      final SettableFuture<AsyncIntradayResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncIntradayResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncIntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncIntradayResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncIntradayResponse>> postWorkforcemanagementBusinessunitIntradayAsync(ApiRequest<IntradayPlanningGroupRequest> request, final AsyncApiCallback<ApiResponse<AsyncIntradayResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncIntradayResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncIntradayResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncIntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncIntradayResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncIntradayResponse> response = (ApiResponse<AsyncIntradayResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncIntradayResponse> response = (ApiResponse<AsyncIntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Adds a new planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PlanningGroup> postWorkforcemanagementBusinessunitPlanninggroupsAsync(PostWorkforcemanagementBusinessunitPlanninggroupsRequest request, final AsyncApiCallback<PlanningGroup> callback) {
    try {
      final SettableFuture<PlanningGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Adds a new planning group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PlanningGroup>> postWorkforcemanagementBusinessunitPlanninggroupsAsync(ApiRequest<CreatePlanningGroupRequest> request, final AsyncApiCallback<ApiResponse<PlanningGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<PlanningGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PlanningGroup>() {}, new AsyncApiCallback<ApiResponse<PlanningGroup>>() {
        @Override
        public void onCompleted(ApiResponse<PlanningGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Adds a new service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalTemplate> postWorkforcemanagementBusinessunitServicegoaltemplatesAsync(PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest request, final AsyncApiCallback<ServiceGoalTemplate> callback) {
    try {
      final SettableFuture<ServiceGoalTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Adds a new service goal template
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalTemplate>> postWorkforcemanagementBusinessunitServicegoaltemplatesAsync(ApiRequest<CreateServiceGoalTemplate> request, final AsyncApiCallback<ApiResponse<ServiceGoalTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalTemplate>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncAgentSchedulesQueryResponse> postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryAsync(PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest request, final AsyncApiCallback<BuAsyncAgentSchedulesQueryResponse> callback) {
    try {
      final SettableFuture<BuAsyncAgentSchedulesQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesQueryResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncAgentSchedulesQueryResponse>> postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryAsync(ApiRequest<BuQueryAgentSchedulesRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncAgentSchedulesQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncAgentSchedulesQueryResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesQueryResponse> response = (ApiResponse<BuAsyncAgentSchedulesQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesQueryResponse> response = (ApiResponse<BuAsyncAgentSchedulesQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Copy a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncScheduleResponse> postWorkforcemanagementBusinessunitWeekScheduleCopyAsync(PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest request, final AsyncApiCallback<BuAsyncScheduleResponse> callback) {
    try {
      final SettableFuture<BuAsyncScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Copy a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncScheduleResponse>> postWorkforcemanagementBusinessunitWeekScheduleCopyAsync(ApiRequest<BuCopyScheduleRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Start a rescheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekScheduleRescheduleAsync(PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest request, final AsyncApiCallback<BuAsyncScheduleRunResponse> callback) {
    try {
      final SettableFuture<BuAsyncScheduleRunResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncScheduleRunResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleRunResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start a rescheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncScheduleRunResponse>> postWorkforcemanagementBusinessunitWeekScheduleRescheduleAsync(ApiRequest<BuRescheduleRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncScheduleRunResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncScheduleRunResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleRunResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a blank schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuScheduleMetadata> postWorkforcemanagementBusinessunitWeekSchedulesAsync(PostWorkforcemanagementBusinessunitWeekSchedulesRequest request, final AsyncApiCallback<BuScheduleMetadata> callback) {
    try {
      final SettableFuture<BuScheduleMetadata> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuScheduleMetadata>() {}, new AsyncApiCallback<ApiResponse<BuScheduleMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleMetadata> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a blank schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuScheduleMetadata>> postWorkforcemanagementBusinessunitWeekSchedulesAsync(ApiRequest<BuCreateBlankScheduleRequest> request, final AsyncApiCallback<ApiResponse<BuScheduleMetadata>> callback) {
    try {
      final SettableFuture<ApiResponse<BuScheduleMetadata>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuScheduleMetadata>() {}, new AsyncApiCallback<ApiResponse<BuScheduleMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<BuScheduleMetadata> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Generate a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekSchedulesGenerateAsync(PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest request, final AsyncApiCallback<BuAsyncScheduleRunResponse> callback) {
    try {
      final SettableFuture<BuAsyncScheduleRunResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncScheduleRunResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleRunResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Generate a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncScheduleRunResponse>> postWorkforcemanagementBusinessunitWeekSchedulesGenerateAsync(ApiRequest<BuGenerateScheduleRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncScheduleRunResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncScheduleRunResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncScheduleRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncScheduleRunResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Copy a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastCopyAsync(PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest request, final AsyncApiCallback<AsyncForecastOperationResult> callback) {
    try {
      final SettableFuture<AsyncForecastOperationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncForecastOperationResult>() {}, new AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncForecastOperationResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Copy a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncForecastOperationResult>> postWorkforcemanagementBusinessunitWeekShorttermforecastCopyAsync(ApiRequest<CopyBuForecastRequest> request, final AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncForecastOperationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncForecastOperationResult>() {}, new AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncForecastOperationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Generate a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateAsync(PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest request, final AsyncApiCallback<AsyncForecastOperationResult> callback) {
    try {
      final SettableFuture<AsyncForecastOperationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncForecastOperationResult>() {}, new AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncForecastOperationResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Generate a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncForecastOperationResult>> postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateAsync(ApiRequest<GenerateBuForecastRequest> request, final AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncForecastOperationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncForecastOperationResult>() {}, new AsyncApiCallback<ApiResponse<AsyncForecastOperationResult>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncForecastOperationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BusinessUnit> postWorkforcemanagementBusinessunitsAsync(PostWorkforcemanagementBusinessunitsRequest request, final AsyncApiCallback<BusinessUnit> callback) {
    try {
      final SettableFuture<BusinessUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BusinessUnit>> postWorkforcemanagementBusinessunitsAsync(ApiRequest<CreateBusinessUnitRequest> request, final AsyncApiCallback<ApiResponse<BusinessUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessUnit>() {}, new AsyncApiCallback<ApiResponse<BusinessUnit>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CalendarUrlResponse> postWorkforcemanagementCalendarUrlIcsAsync(PostWorkforcemanagementCalendarUrlIcsRequest request, final AsyncApiCallback<CalendarUrlResponse> callback) {
    try {
      final SettableFuture<CalendarUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CalendarUrlResponse>() {}, new AsyncApiCallback<ApiResponse<CalendarUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CalendarUrlResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CalendarUrlResponse>> postWorkforcemanagementCalendarUrlIcsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CalendarUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CalendarUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CalendarUrlResponse>() {}, new AsyncApiCallback<ApiResponse<CalendarUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CalendarUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HistoricalImportDeleteJobResponse> postWorkforcemanagementHistoricaldataDeletejobAsync(PostWorkforcemanagementHistoricaldataDeletejobRequest request, final AsyncApiCallback<HistoricalImportDeleteJobResponse> callback) {
    try {
      final SettableFuture<HistoricalImportDeleteJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteJobResponse>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportDeleteJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HistoricalImportDeleteJobResponse>> postWorkforcemanagementHistoricaldataDeletejobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<HistoricalImportDeleteJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HistoricalImportDeleteJobResponse>() {}, new AsyncApiCallback<ApiResponse<HistoricalImportDeleteJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<HistoricalImportDeleteJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Trigger validation process for historical import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postWorkforcemanagementHistoricaldataValidateAsync(PostWorkforcemanagementHistoricaldataValidateRequest request, final AsyncApiCallback<Void> callback) {
    try {
      final SettableFuture<Void> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postWorkforcemanagementHistoricaldataValidateAsync(ApiRequest<ValidationServiceRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      final SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, null, new AsyncApiCallback<ApiResponse<Void>>() {
        @Override
        public void onCompleted(ApiResponse<Void> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementManagementunitAgentschedulesSearchAsync(PostWorkforcemanagementManagementunitAgentschedulesSearchRequest request, final AsyncApiCallback<BuAsyncAgentSchedulesSearchResponse> callback) {
    try {
      final SettableFuture<BuAsyncAgentSchedulesSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesSearchResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> postWorkforcemanagementManagementunitAgentschedulesSearchAsync(ApiRequest<BuSearchAgentSchedulesRequest> request, final AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BuAsyncAgentSchedulesSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<BuAsyncAgentSchedulesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BuAsyncAgentSchedulesSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequeryAsync(PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest request, final AsyncApiCallback<WfmHistoricalAdherenceResponse> callback) {
    try {
      final SettableFuture<WfmHistoricalAdherenceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmHistoricalAdherenceResponse>> postWorkforcemanagementManagementunitHistoricaladherencequeryAsync(ApiRequest<WfmHistoricalAdherenceQuery> request, final AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmHistoricalAdherenceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MoveManagementUnitResponse> postWorkforcemanagementManagementunitMoveAsync(PostWorkforcemanagementManagementunitMoveRequest request, final AsyncApiCallback<MoveManagementUnitResponse> callback) {
    try {
      final SettableFuture<MoveManagementUnitResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MoveManagementUnitResponse>() {}, new AsyncApiCallback<ApiResponse<MoveManagementUnitResponse>>() {
        @Override
        public void onCompleted(ApiResponse<MoveManagementUnitResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MoveManagementUnitResponse>> postWorkforcemanagementManagementunitMoveAsync(ApiRequest<MoveManagementUnitRequest> request, final AsyncApiCallback<ApiResponse<MoveManagementUnitResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<MoveManagementUnitResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MoveManagementUnitResponse>() {}, new AsyncApiCallback<ApiResponse<MoveManagementUnitResponse>>() {
        @Override
        public void onCompleted(ApiResponse<MoveManagementUnitResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MoveManagementUnitResponse> response = (ApiResponse<MoveManagementUnitResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MoveManagementUnitResponse> response = (ApiResponse<MoveManagementUnitResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchAsync(PostWorkforcemanagementManagementunitSchedulesSearchRequest request, final AsyncApiCallback<UserScheduleContainer> callback) {
    try {
      final SettableFuture<UserScheduleContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementManagementunitSchedulesSearchAsync(ApiRequest<UserListScheduleRequestBody> request, final AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<UserScheduleContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffLimit> postWorkforcemanagementManagementunitTimeofflimitsAsync(PostWorkforcemanagementManagementunitTimeofflimitsRequest request, final AsyncApiCallback<TimeOffLimit> callback) {
    try {
      final SettableFuture<TimeOffLimit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffLimit>> postWorkforcemanagementManagementunitTimeofflimitsAsync(ApiRequest<CreateTimeOffLimitRequest> request, final AsyncApiCallback<ApiResponse<TimeOffLimit>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffLimit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueryTimeOffLimitValuesResponse> postWorkforcemanagementManagementunitTimeofflimitsValuesQueryAsync(PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest request, final AsyncApiCallback<QueryTimeOffLimitValuesResponse> callback) {
    try {
      final SettableFuture<QueryTimeOffLimitValuesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueryTimeOffLimitValuesResponse>() {}, new AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueryTimeOffLimitValuesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueryTimeOffLimitValuesResponse>> postWorkforcemanagementManagementunitTimeofflimitsValuesQueryAsync(ApiRequest<QueryTimeOffLimitValuesRequest> request, final AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QueryTimeOffLimitValuesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueryTimeOffLimitValuesResponse>() {}, new AsyncApiCallback<ApiResponse<QueryTimeOffLimitValuesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueryTimeOffLimitValuesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Creates a new time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffPlan> postWorkforcemanagementManagementunitTimeoffplansAsync(PostWorkforcemanagementManagementunitTimeoffplansRequest request, final AsyncApiCallback<TimeOffPlan> callback) {
    try {
      final SettableFuture<TimeOffPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates a new time off plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffPlan>> postWorkforcemanagementManagementunitTimeoffplansAsync(ApiRequest<CreateTimeOffPlanRequest> request, final AsyncApiCallback<ApiResponse<TimeOffPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffPlan>() {}, new AsyncApiCallback<ApiResponse<TimeOffPlan>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> postWorkforcemanagementManagementunitTimeoffrequestsAsync(PostWorkforcemanagementManagementunitTimeoffrequestsRequest request, final AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      final SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new time off request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> postWorkforcemanagementManagementunitTimeoffrequestsAsync(ApiRequest<CreateAdminTimeOffRequest> request, final AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestListing> postWorkforcemanagementManagementunitTimeoffrequestsQueryAsync(PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest request, final AsyncApiCallback<TimeOffRequestListing> callback) {
    try {
      final SettableFuture<TimeOffRequestListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestListing>> postWorkforcemanagementManagementunitTimeoffrequestsQueryAsync(ApiRequest<TimeOffRequestQueryBody> request, final AsyncApiCallback<ApiResponse<TimeOffRequestListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestListing>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestListing> response = (ApiResponse<TimeOffRequestListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestListing> response = (ApiResponse<TimeOffRequestListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WaitlistPositionListing> postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryAsync(PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest request, final AsyncApiCallback<WaitlistPositionListing> callback) {
    try {
      final SettableFuture<WaitlistPositionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WaitlistPositionListing>() {}, new AsyncApiCallback<ApiResponse<WaitlistPositionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WaitlistPositionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WaitlistPositionListing>> postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryAsync(ApiRequest<QueryWaitlistPositionsRequest> request, final AsyncApiCallback<ApiResponse<WaitlistPositionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WaitlistPositionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WaitlistPositionListing>() {}, new AsyncApiCallback<ApiResponse<WaitlistPositionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WaitlistPositionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MatchShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradeMatchAsync(PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest request, final AsyncApiCallback<MatchShiftTradeResponse> callback) {
    try {
      final SettableFuture<MatchShiftTradeResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MatchShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<MatchShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<MatchShiftTradeResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MatchShiftTradeResponse>> postWorkforcemanagementManagementunitWeekShifttradeMatchAsync(ApiRequest<MatchShiftTradeRequest> request, final AsyncApiCallback<ApiResponse<MatchShiftTradeResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<MatchShiftTradeResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MatchShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<MatchShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<MatchShiftTradeResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MatchShiftTradeResponse> response = (ApiResponse<MatchShiftTradeResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MatchShiftTradeResponse> response = (ApiResponse<MatchShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Adds a shift trade
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradesAsync(PostWorkforcemanagementManagementunitWeekShifttradesRequest request, final AsyncApiCallback<ShiftTradeResponse> callback) {
    try {
      final SettableFuture<ShiftTradeResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Adds a shift trade
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShiftTradeResponse>> postWorkforcemanagementManagementunitWeekShifttradesAsync(ApiRequest<AddShiftTradeRequest> request, final AsyncApiCallback<ApiResponse<ShiftTradeResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShiftTradeResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShiftTradeResponse>() {}, new AsyncApiCallback<ApiResponse<ShiftTradeResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShiftTradeResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SearchShiftTradesResponse> postWorkforcemanagementManagementunitWeekShifttradesSearchAsync(PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest request, final AsyncApiCallback<SearchShiftTradesResponse> callback) {
    try {
      final SettableFuture<SearchShiftTradesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SearchShiftTradesResponse>() {}, new AsyncApiCallback<ApiResponse<SearchShiftTradesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SearchShiftTradesResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SearchShiftTradesResponse>> postWorkforcemanagementManagementunitWeekShifttradesSearchAsync(ApiRequest<SearchShiftTradesRequest> request, final AsyncApiCallback<ApiResponse<SearchShiftTradesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SearchShiftTradesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SearchShiftTradesResponse>() {}, new AsyncApiCallback<ApiResponse<SearchShiftTradesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SearchShiftTradesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SearchShiftTradesResponse> response = (ApiResponse<SearchShiftTradesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SearchShiftTradesResponse> response = (ApiResponse<SearchShiftTradesResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkUpdateShiftTradeStateResponse> postWorkforcemanagementManagementunitWeekShifttradesStateBulkAsync(PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest request, final AsyncApiCallback<BulkUpdateShiftTradeStateResponse> callback) {
    try {
      final SettableFuture<BulkUpdateShiftTradeStateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkUpdateShiftTradeStateResponse>() {}, new AsyncApiCallback<ApiResponse<BulkUpdateShiftTradeStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkUpdateShiftTradeStateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkUpdateShiftTradeStateResponse>> postWorkforcemanagementManagementunitWeekShifttradesStateBulkAsync(ApiRequest<BulkShiftTradeStateUpdateRequest> request, final AsyncApiCallback<ApiResponse<BulkUpdateShiftTradeStateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkUpdateShiftTradeStateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkUpdateShiftTradeStateResponse>() {}, new AsyncApiCallback<ApiResponse<BulkUpdateShiftTradeStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkUpdateShiftTradeStateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkUpdateShiftTradeStateResponse> response = (ApiResponse<BulkUpdateShiftTradeStateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkUpdateShiftTradeStateResponse> response = (ApiResponse<BulkUpdateShiftTradeStateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a copy of work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlan> postWorkforcemanagementManagementunitWorkplanCopyAsync(PostWorkforcemanagementManagementunitWorkplanCopyRequest request, final AsyncApiCallback<WorkPlan> callback) {
    try {
      final SettableFuture<WorkPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a copy of work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlan>> postWorkforcemanagementManagementunitWorkplanCopyAsync(ApiRequest<CopyWorkPlan> request, final AsyncApiCallback<ApiResponse<WorkPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Validate Work Plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ValidateWorkPlanResponse> postWorkforcemanagementManagementunitWorkplanValidateAsync(PostWorkforcemanagementManagementunitWorkplanValidateRequest request, final AsyncApiCallback<ValidateWorkPlanResponse> callback) {
    try {
      final SettableFuture<ValidateWorkPlanResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ValidateWorkPlanResponse>() {}, new AsyncApiCallback<ApiResponse<ValidateWorkPlanResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ValidateWorkPlanResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Validate Work Plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ValidateWorkPlanResponse>> postWorkforcemanagementManagementunitWorkplanValidateAsync(ApiRequest<WorkPlanValidationRequest> request, final AsyncApiCallback<ApiResponse<ValidateWorkPlanResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ValidateWorkPlanResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ValidateWorkPlanResponse>() {}, new AsyncApiCallback<ApiResponse<ValidateWorkPlanResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ValidateWorkPlanResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ValidateWorkPlanResponse> response = (ApiResponse<ValidateWorkPlanResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ValidateWorkPlanResponse> response = (ApiResponse<ValidateWorkPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a copy of work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotationCopyAsync(PostWorkforcemanagementManagementunitWorkplanrotationCopyRequest request, final AsyncApiCallback<WorkPlanRotationResponse> callback) {
    try {
      final SettableFuture<WorkPlanRotationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a copy of work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanRotationResponse>> postWorkforcemanagementManagementunitWorkplanrotationCopyAsync(ApiRequest<CopyWorkPlanRotationRequest> request, final AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanRotationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotationsAsync(PostWorkforcemanagementManagementunitWorkplanrotationsRequest request, final AsyncApiCallback<WorkPlanRotationResponse> callback) {
    try {
      final SettableFuture<WorkPlanRotationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new work plan rotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlanRotationResponse>> postWorkforcemanagementManagementunitWorkplanrotationsAsync(ApiRequest<AddWorkPlanRotationRequest> request, final AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlanRotationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlanRotationResponse>() {}, new AsyncApiCallback<ApiResponse<WorkPlanRotationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlanRotationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkPlan> postWorkforcemanagementManagementunitWorkplansAsync(PostWorkforcemanagementManagementunitWorkplansRequest request, final AsyncApiCallback<WorkPlan> callback) {
    try {
      final SettableFuture<WorkPlan> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new work plan
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkPlan>> postWorkforcemanagementManagementunitWorkplansAsync(ApiRequest<CreateWorkPlan> request, final AsyncApiCallback<ApiResponse<WorkPlan>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkPlan>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkPlan>() {}, new AsyncApiCallback<ApiResponse<WorkPlan>>() {
        @Override
        public void onCompleted(ApiResponse<WorkPlan> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnit> postWorkforcemanagementManagementunitsAsync(PostWorkforcemanagementManagementunitsRequest request, final AsyncApiCallback<ManagementUnit> callback) {
    try {
      final SettableFuture<ManagementUnit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnit>> postWorkforcemanagementManagementunitsAsync(ApiRequest<CreateManagementUnitApiRequest> request, final AsyncApiCallback<ApiResponse<ManagementUnit>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnit>() {}, new AsyncApiCallback<ApiResponse<ManagementUnit>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Mark a list of notifications as read or unread
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UpdateNotificationsResponse> postWorkforcemanagementNotificationsUpdateAsync(PostWorkforcemanagementNotificationsUpdateRequest request, final AsyncApiCallback<UpdateNotificationsResponse> callback) {
    try {
      final SettableFuture<UpdateNotificationsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UpdateNotificationsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdateNotificationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdateNotificationsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Mark a list of notifications as read or unread
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UpdateNotificationsResponse>> postWorkforcemanagementNotificationsUpdateAsync(ApiRequest<UpdateNotificationsRequest> request, final AsyncApiCallback<ApiResponse<UpdateNotificationsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UpdateNotificationsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UpdateNotificationsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdateNotificationsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdateNotificationsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdateNotificationsResponse> response = (ApiResponse<UpdateNotificationsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdateNotificationsResponse> response = (ApiResponse<UpdateNotificationsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get published schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleContainer> postWorkforcemanagementSchedulesAsync(PostWorkforcemanagementSchedulesRequest request, final AsyncApiCallback<UserScheduleContainer> callback) {
    try {
      final SettableFuture<UserScheduleContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementSchedulesAsync(ApiRequest<CurrentUserScheduleRequestBody> request, final AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<UserScheduleContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Queries available time off for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AvailableTimeOffResponse> postWorkforcemanagementTimeofflimitsAvailableQueryAsync(PostWorkforcemanagementTimeofflimitsAvailableQueryRequest request, final AsyncApiCallback<AvailableTimeOffResponse> callback) {
    try {
      final SettableFuture<AvailableTimeOffResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AvailableTimeOffResponse>() {}, new AsyncApiCallback<ApiResponse<AvailableTimeOffResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AvailableTimeOffResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Queries available time off for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AvailableTimeOffResponse>> postWorkforcemanagementTimeofflimitsAvailableQueryAsync(ApiRequest<AvailableTimeOffRequest> request, final AsyncApiCallback<ApiResponse<AvailableTimeOffResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AvailableTimeOffResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AvailableTimeOffResponse>() {}, new AsyncApiCallback<ApiResponse<AvailableTimeOffResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AvailableTimeOffResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AvailableTimeOffResponse> response = (ApiResponse<AvailableTimeOffResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AvailableTimeOffResponse> response = (ApiResponse<AvailableTimeOffResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestResponse> postWorkforcemanagementTimeoffrequestsAsync(PostWorkforcemanagementTimeoffrequestsRequest request, final AsyncApiCallback<TimeOffRequestResponse> callback) {
    try {
      final SettableFuture<TimeOffRequestResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a time off request for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestResponse>> postWorkforcemanagementTimeoffrequestsAsync(ApiRequest<CreateAgentTimeOffRequest> request, final AsyncApiCallback<ApiResponse<TimeOffRequestResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestResponse>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffLimit> putWorkforcemanagementManagementunitTimeofflimitValuesAsync(PutWorkforcemanagementManagementunitTimeofflimitValuesRequest request, final AsyncApiCallback<TimeOffLimit> callback) {
    try {
      final SettableFuture<TimeOffLimit> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffLimit>> putWorkforcemanagementManagementunitTimeofflimitValuesAsync(ApiRequest<SetTimeOffLimitValuesRequest> request, final AsyncApiCallback<ApiResponse<TimeOffLimit>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffLimit>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffLimit>() {}, new AsyncApiCallback<ApiResponse<TimeOffLimit>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffLimit> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  

  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
