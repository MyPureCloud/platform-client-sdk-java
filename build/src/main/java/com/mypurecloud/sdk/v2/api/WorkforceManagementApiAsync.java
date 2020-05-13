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
import com.mypurecloud.sdk.v2.model.BuScheduleListing;
import com.mypurecloud.sdk.v2.model.BuShortTermForecast;
import com.mypurecloud.sdk.v2.model.BuForecastResultResponse;
import com.mypurecloud.sdk.v2.model.BuForecastGenerationResult;
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupsResponse;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastListing;
import com.mypurecloud.sdk.v2.model.BusinessUnitListing;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherenceListing;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.SchedulingRunResponse;
import com.mypurecloud.sdk.v2.model.RescheduleResult;
import com.mypurecloud.sdk.v2.model.SchedulingRunListResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroup;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupList;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.WeekShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.ForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.UpdateBusinessUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdatePlanningGroupRequest;
import com.mypurecloud.sdk.v2.model.PatchBuScheduleRunRequest;
import com.mypurecloud.sdk.v2.model.UpdateServiceGoalTemplate;
import com.mypurecloud.sdk.v2.model.UpdateManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateSchedulingRunRequest;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UpdateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.AsyncWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.PatchShiftTradeRequest;
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
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitResponse;
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
import com.mypurecloud.sdk.v2.model.MatchShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.MatchShiftTradeResponse;
import com.mypurecloud.sdk.v2.model.AddShiftTradeRequest;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesResponse;
import com.mypurecloud.sdk.v2.model.SearchShiftTradesRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateShiftTradeStateResponse;
import com.mypurecloud.sdk.v2.model.BulkShiftTradeStateUpdateRequest;
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


import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdhocmodelingjobRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAgentShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitIntradayQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitServicegoalgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitShifttradesMatchedRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitShifttradesUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementNotificationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementSchedulingjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWeekShifttradeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitAgentschedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitIntradayRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitMoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitServicegoalgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekScheduleCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementNotificationsUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsRequest;

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
   * Deletes an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitActivitycodeAsync(DeleteWorkforcemanagementManagementunitActivitycodeRequest request, final AsyncApiCallback<Void> callback) {
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
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitActivitycodeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Cancel a schedule run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitSchedulingRunAsync(DeleteWorkforcemanagementManagementunitSchedulingRunRequest request, final AsyncApiCallback<Void> callback) {
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
   * Cancel a schedule run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitSchedulingRunAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitServicegoalgroupAsync(DeleteWorkforcemanagementManagementunitServicegoalgroupRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitServicegoalgroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
  public Future<Void> deleteWorkforcemanagementManagementunitWeekScheduleAsync(DeleteWorkforcemanagementManagementunitWeekScheduleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitWeekScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWorkforcemanagementManagementunitWeekShorttermforecastAsync(DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest request, final AsyncApiCallback<Void> callback) {
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
  public Future<ApiResponse<Void>> deleteWorkforcemanagementManagementunitWeekShorttermforecastAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
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
   * Use \&quot;recent\&quot; for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
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
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
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
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
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
   * Get management unit
   * 
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
   * 
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
   * Get an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCode> getWorkforcemanagementManagementunitActivitycodeAsync(GetWorkforcemanagementManagementunitActivitycodeRequest request, final AsyncApiCallback<ActivityCode> callback) {
    try {
      final SettableFuture<ActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
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
  public Future<ApiResponse<ActivityCode>> getWorkforcemanagementManagementunitActivitycodeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get intraday queues for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueuesAsync(GetWorkforcemanagementManagementunitIntradayQueuesRequest request, final AsyncApiCallback<WfmIntradayQueueListing> callback) {
    try {
      final SettableFuture<WfmIntradayQueueListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmIntradayQueueListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayQueueListing> response) {
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
   * Get intraday queues for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmIntradayQueueListing>> getWorkforcemanagementManagementunitIntradayQueuesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmIntradayQueueListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmIntradayQueueListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayQueueListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets the status for a specific scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchedulingRunResponse> getWorkforcemanagementManagementunitSchedulingRunAsync(GetWorkforcemanagementManagementunitSchedulingRunRequest request, final AsyncApiCallback<SchedulingRunResponse> callback) {
    try {
      final SettableFuture<SchedulingRunResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchedulingRunResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingRunResponse> response) {
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
   * Gets the status for a specific scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchedulingRunResponse>> getWorkforcemanagementManagementunitSchedulingRunAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchedulingRunResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SchedulingRunResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchedulingRunResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingRunResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingRunResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingRunResponse> response = (ApiResponse<SchedulingRunResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingRunResponse> response = (ApiResponse<SchedulingRunResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets the result of a specific scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RescheduleResult> getWorkforcemanagementManagementunitSchedulingRunResultAsync(GetWorkforcemanagementManagementunitSchedulingRunResultRequest request, final AsyncApiCallback<RescheduleResult> callback) {
    try {
      final SettableFuture<RescheduleResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RescheduleResult>() {}, new AsyncApiCallback<ApiResponse<RescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<RescheduleResult> response) {
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
   * Gets the result of a specific scheduling run
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RescheduleResult>> getWorkforcemanagementManagementunitSchedulingRunResultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RescheduleResult>> callback) {
    try {
      final SettableFuture<ApiResponse<RescheduleResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RescheduleResult>() {}, new AsyncApiCallback<ApiResponse<RescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<RescheduleResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status of all the ongoing schedule runs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchedulingRunListResponse> getWorkforcemanagementManagementunitSchedulingRunsAsync(GetWorkforcemanagementManagementunitSchedulingRunsRequest request, final AsyncApiCallback<SchedulingRunListResponse> callback) {
    try {
      final SettableFuture<SchedulingRunListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchedulingRunListResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingRunListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingRunListResponse> response) {
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
   * Get the status of all the ongoing schedule runs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchedulingRunListResponse>> getWorkforcemanagementManagementunitSchedulingRunsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchedulingRunListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SchedulingRunListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchedulingRunListResponse>() {}, new AsyncApiCallback<ApiResponse<SchedulingRunListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SchedulingRunListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingRunListResponse> response = (ApiResponse<SchedulingRunListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchedulingRunListResponse> response = (ApiResponse<SchedulingRunListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalGroup> getWorkforcemanagementManagementunitServicegoalgroupAsync(GetWorkforcemanagementManagementunitServicegoalgroupRequest request, final AsyncApiCallback<ServiceGoalGroup> callback) {
    try {
      final SettableFuture<ServiceGoalGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
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
   * Get a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalGroup>> getWorkforcemanagementManagementunitServicegoalgroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServiceGoalGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get service goal groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalGroupList> getWorkforcemanagementManagementunitServicegoalgroupsAsync(GetWorkforcemanagementManagementunitServicegoalgroupsRequest request, final AsyncApiCallback<ServiceGoalGroupList> callback) {
    try {
      final SettableFuture<ServiceGoalGroupList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalGroupList>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroupList>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroupList> response) {
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
   * Get service goal groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalGroupList>> getWorkforcemanagementManagementunitServicegoalgroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServiceGoalGroupList>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalGroupList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalGroupList>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroupList>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroupList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroupList> response = (ApiResponse<ServiceGoalGroupList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroupList> response = (ApiResponse<ServiceGoalGroupList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the settings for the requested management unit. Deprecated, use the GET management unit route instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitSettingsResponse> getWorkforcemanagementManagementunitSettingsAsync(GetWorkforcemanagementManagementunitSettingsRequest request, final AsyncApiCallback<ManagementUnitSettingsResponse> callback) {
    try {
      final SettableFuture<ManagementUnitSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitSettingsResponse> response) {
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
   * Get the settings for the requested management unit. Deprecated, use the GET management unit route instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitSettingsResponse>> getWorkforcemanagementManagementunitSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitSettingsResponse> response = (ApiResponse<ManagementUnitSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitSettingsResponse> response = (ApiResponse<ManagementUnitSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a week schedule
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
   * Get a week schedule
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
   * Get week schedule generation results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WeekScheduleGenerationResult> getWorkforcemanagementManagementunitWeekScheduleGenerationresultsAsync(GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest request, final AsyncApiCallback<WeekScheduleGenerationResult> callback) {
    try {
      final SettableFuture<WeekScheduleGenerationResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WeekScheduleGenerationResult>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleGenerationResult> response) {
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
   * Get week schedule generation results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WeekScheduleGenerationResult>> getWorkforcemanagementManagementunitWeekScheduleGenerationresultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WeekScheduleGenerationResult>> callback) {
    try {
      final SettableFuture<ApiResponse<WeekScheduleGenerationResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WeekScheduleGenerationResult>() {}, new AsyncApiCallback<ApiResponse<WeekScheduleGenerationResult>>() {
        @Override
        public void onCompleted(ApiResponse<WeekScheduleGenerationResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleGenerationResult> response = (ApiResponse<WeekScheduleGenerationResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WeekScheduleGenerationResult> response = (ApiResponse<WeekScheduleGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of schedules in a week in management unit
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
   * Get the list of schedules in a week in management unit
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
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ForecastResultResponse> getWorkforcemanagementManagementunitWeekShorttermforecastFinalAsync(GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest request, final AsyncApiCallback<ForecastResultResponse> callback) {
    try {
      final SettableFuture<ForecastResultResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<ForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ForecastResultResponse> response) {
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
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ForecastResultResponse>> getWorkforcemanagementManagementunitWeekShorttermforecastFinalAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ForecastResultResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ForecastResultResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ForecastResultResponse>() {}, new AsyncApiCallback<ApiResponse<ForecastResultResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ForecastResultResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ForecastResultResponse> response = (ApiResponse<ForecastResultResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ForecastResultResponse> response = (ApiResponse<ForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShortTermForecastListResponse> getWorkforcemanagementManagementunitWeekShorttermforecastsAsync(GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest request, final AsyncApiCallback<ShortTermForecastListResponse> callback) {
    try {
      final SettableFuture<ShortTermForecastListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShortTermForecastListResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastListResponse> response) {
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
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShortTermForecastListResponse>> getWorkforcemanagementManagementunitWeekShorttermforecastsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ShortTermForecastListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShortTermForecastListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShortTermForecastListResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastListResponse> response = (ApiResponse<ShortTermForecastListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastListResponse> response = (ApiResponse<ShortTermForecastListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get work plans
   * 
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
   * 
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
   * Update an activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCode> patchWorkforcemanagementManagementunitActivitycodeAsync(PatchWorkforcemanagementManagementunitActivitycodeRequest request, final AsyncApiCallback<ActivityCode> callback) {
    try {
      final SettableFuture<ActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
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
  public Future<ApiResponse<ActivityCode>> patchWorkforcemanagementManagementunitActivitycodeAsync(ApiRequest<UpdateActivityCodeRequest> request, final AsyncApiCallback<ApiResponse<ActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RescheduleResult> patchWorkforcemanagementManagementunitSchedulingRunAsync(PatchWorkforcemanagementManagementunitSchedulingRunRequest request, final AsyncApiCallback<RescheduleResult> callback) {
    try {
      final SettableFuture<RescheduleResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RescheduleResult>() {}, new AsyncApiCallback<ApiResponse<RescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<RescheduleResult> response) {
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
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RescheduleResult>> patchWorkforcemanagementManagementunitSchedulingRunAsync(ApiRequest<UpdateSchedulingRunRequest> request, final AsyncApiCallback<ApiResponse<RescheduleResult>> callback) {
    try {
      final SettableFuture<ApiResponse<RescheduleResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RescheduleResult>() {}, new AsyncApiCallback<ApiResponse<RescheduleResult>>() {
        @Override
        public void onCompleted(ApiResponse<RescheduleResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalGroup> patchWorkforcemanagementManagementunitServicegoalgroupAsync(PatchWorkforcemanagementManagementunitServicegoalgroupRequest request, final AsyncApiCallback<ServiceGoalGroup> callback) {
    try {
      final SettableFuture<ServiceGoalGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
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
   * Update a service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalGroup>> patchWorkforcemanagementManagementunitServicegoalgroupAsync(ApiRequest<ServiceGoalGroup> request, final AsyncApiCallback<ApiResponse<ServiceGoalGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the settings for the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitSettingsResponse> patchWorkforcemanagementManagementunitSettingsAsync(PatchWorkforcemanagementManagementunitSettingsRequest request, final AsyncApiCallback<ManagementUnitSettingsResponse> callback) {
    try {
      final SettableFuture<ManagementUnitSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitSettingsResponse> response) {
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
   * Update the settings for the requested management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitSettingsResponse>> patchWorkforcemanagementManagementunitSettingsAsync(ApiRequest<ManagementUnitSettingsRequest> request, final AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitSettingsResponse> response = (ApiResponse<ManagementUnitSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitSettingsResponse> response = (ApiResponse<ManagementUnitSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncWeekScheduleResponse> patchWorkforcemanagementManagementunitWeekScheduleAsync(PatchWorkforcemanagementManagementunitWeekScheduleRequest request, final AsyncApiCallback<AsyncWeekScheduleResponse> callback) {
    try {
      final SettableFuture<AsyncWeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
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
   * Update a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncWeekScheduleResponse>> patchWorkforcemanagementManagementunitWeekScheduleAsync(ApiRequest<UpdateWeekScheduleRequest> request, final AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncWeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCode> postWorkforcemanagementManagementunitActivitycodesAsync(PostWorkforcemanagementManagementunitActivitycodesRequest request, final AsyncApiCallback<ActivityCode> callback) {
    try {
      final SettableFuture<ActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
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
  public Future<ApiResponse<ActivityCode>> postWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<CreateActivityCodeRequest> request, final AsyncApiCallback<ApiResponse<ActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntradayResponse> postWorkforcemanagementManagementunitIntradayAsync(PostWorkforcemanagementManagementunitIntradayRequest request, final AsyncApiCallback<IntradayResponse> callback) {
    try {
      final SettableFuture<IntradayResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntradayResponse>() {}, new AsyncApiCallback<ApiResponse<IntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<IntradayResponse> response) {
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
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntradayResponse>> postWorkforcemanagementManagementunitIntradayAsync(ApiRequest<IntradayQueryDataCommand> request, final AsyncApiCallback<ApiResponse<IntradayResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<IntradayResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntradayResponse>() {}, new AsyncApiCallback<ApiResponse<IntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<IntradayResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServiceGoalGroup> postWorkforcemanagementManagementunitServicegoalgroupsAsync(PostWorkforcemanagementManagementunitServicegoalgroupsRequest request, final AsyncApiCallback<ServiceGoalGroup> callback) {
    try {
      final SettableFuture<ServiceGoalGroup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
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
   * Create a new service goal group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServiceGoalGroup>> postWorkforcemanagementManagementunitServicegoalgroupsAsync(ApiRequest<CreateServiceGoalGroupRequest> request, final AsyncApiCallback<ApiResponse<ServiceGoalGroup>> callback) {
    try {
      final SettableFuture<ApiResponse<ServiceGoalGroup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServiceGoalGroup>() {}, new AsyncApiCallback<ApiResponse<ServiceGoalGroup>>() {
        @Override
        public void onCompleted(ApiResponse<ServiceGoalGroup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets a list of time off requests from lookup ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestEntityList> postWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsAsync(PostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest request, final AsyncApiCallback<TimeOffRequestEntityList> callback) {
    try {
      final SettableFuture<TimeOffRequestEntityList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestEntityList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestEntityList> response) {
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
   * Gets a list of time off requests from lookup ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestEntityList>> postWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsAsync(ApiRequest<TimeOffRequestLookupList> request, final AsyncApiCallback<ApiResponse<TimeOffRequestEntityList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestEntityList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestEntityList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestEntityList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestEntityList> response = (ApiResponse<TimeOffRequestEntityList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestEntityList> response = (ApiResponse<TimeOffRequestEntityList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestLookupList> postWorkforcemanagementManagementunitTimeoffrequestsQueryAsync(PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest request, final AsyncApiCallback<TimeOffRequestLookupList> callback) {
    try {
      final SettableFuture<TimeOffRequestLookupList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestLookupList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestLookupList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestLookupList> response) {
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
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestLookupList>> postWorkforcemanagementManagementunitTimeoffrequestsQueryAsync(ApiRequest<TimeOffRequestQueryBody> request, final AsyncApiCallback<ApiResponse<TimeOffRequestLookupList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestLookupList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestLookupList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestLookupList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestLookupList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestLookupList> response = (ApiResponse<TimeOffRequestLookupList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestLookupList> response = (ApiResponse<TimeOffRequestLookupList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Copy a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleCopyAsync(PostWorkforcemanagementManagementunitWeekScheduleCopyRequest request, final AsyncApiCallback<AsyncWeekScheduleResponse> callback) {
    try {
      final SettableFuture<AsyncWeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
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
   * Copy a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncWeekScheduleResponse>> postWorkforcemanagementManagementunitWeekScheduleCopyAsync(ApiRequest<CopyWeekScheduleRequest> request, final AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncWeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleRescheduleAsync(PostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest request, final AsyncApiCallback<AsyncWeekScheduleResponse> callback) {
    try {
      final SettableFuture<AsyncWeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
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
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncWeekScheduleResponse>> postWorkforcemanagementManagementunitWeekScheduleRescheduleAsync(ApiRequest<RescheduleRequest> request, final AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncWeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedulesAsync(PostWorkforcemanagementManagementunitWeekSchedulesRequest request, final AsyncApiCallback<AsyncWeekScheduleResponse> callback) {
    try {
      final SettableFuture<AsyncWeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
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
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncWeekScheduleResponse>> postWorkforcemanagementManagementunitWeekSchedulesAsync(ApiRequest<ImportWeekScheduleRequest> request, final AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncWeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncWeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Generate a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GenerateWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedulesGenerateAsync(PostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest request, final AsyncApiCallback<GenerateWeekScheduleResponse> callback) {
    try {
      final SettableFuture<GenerateWeekScheduleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GenerateWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<GenerateWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GenerateWeekScheduleResponse> response) {
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
   * Generate a week schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GenerateWeekScheduleResponse>> postWorkforcemanagementManagementunitWeekSchedulesGenerateAsync(ApiRequest<GenerateWeekScheduleRequest> request, final AsyncApiCallback<ApiResponse<GenerateWeekScheduleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GenerateWeekScheduleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GenerateWeekScheduleResponse>() {}, new AsyncApiCallback<ApiResponse<GenerateWeekScheduleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GenerateWeekScheduleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GenerateWeekScheduleResponse> response = (ApiResponse<GenerateWeekScheduleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GenerateWeekScheduleResponse> response = (ApiResponse<GenerateWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PartialUploadResponse> postWorkforcemanagementManagementunitWeekSchedulesPartialuploadAsync(PostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest request, final AsyncApiCallback<PartialUploadResponse> callback) {
    try {
      final SettableFuture<PartialUploadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PartialUploadResponse>() {}, new AsyncApiCallback<ApiResponse<PartialUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PartialUploadResponse> response) {
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
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PartialUploadResponse>> postWorkforcemanagementManagementunitWeekSchedulesPartialuploadAsync(ApiRequest<UserSchedulesPartialUploadRequest> request, final AsyncApiCallback<ApiResponse<PartialUploadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<PartialUploadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PartialUploadResponse>() {}, new AsyncApiCallback<ApiResponse<PartialUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PartialUploadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Copy a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastCopyAsync(PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest request, final AsyncApiCallback<ShortTermForecastResponse> callback) {
    try {
      final SettableFuture<ShortTermForecastResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastResponse> response) {
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
  public Future<ApiResponse<ShortTermForecastResponse>> postWorkforcemanagementManagementunitWeekShorttermforecastCopyAsync(ApiRequest<CopyShortTermForecastRequest> request, final AsyncApiCallback<ApiResponse<ShortTermForecastResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShortTermForecastResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Import a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsAsync(PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest request, final AsyncApiCallback<ShortTermForecastResponse> callback) {
    try {
      final SettableFuture<ShortTermForecastResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastResponse> response) {
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
   * Import a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ShortTermForecastResponse>> postWorkforcemanagementManagementunitWeekShorttermforecastsAsync(ApiRequest<ImportShortTermForecastRequest> request, final AsyncApiCallback<ApiResponse<ShortTermForecastResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ShortTermForecastResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<ShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ShortTermForecastResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
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
  public Future<GenerateShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsGenerateAsync(PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest request, final AsyncApiCallback<GenerateShortTermForecastResponse> callback) {
    try {
      final SettableFuture<GenerateShortTermForecastResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GenerateShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<GenerateShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GenerateShortTermForecastResponse> response) {
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
  public Future<ApiResponse<GenerateShortTermForecastResponse>> postWorkforcemanagementManagementunitWeekShorttermforecastsGenerateAsync(ApiRequest<GenerateShortTermForecastRequest> request, final AsyncApiCallback<ApiResponse<GenerateShortTermForecastResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GenerateShortTermForecastResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GenerateShortTermForecastResponse>() {}, new AsyncApiCallback<ApiResponse<GenerateShortTermForecastResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GenerateShortTermForecastResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GenerateShortTermForecastResponse> response = (ApiResponse<GenerateShortTermForecastResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GenerateShortTermForecastResponse> response = (ApiResponse<GenerateShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Import a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PartialUploadResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadAsync(PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest request, final AsyncApiCallback<PartialUploadResponse> callback) {
    try {
      final SettableFuture<PartialUploadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PartialUploadResponse>() {}, new AsyncApiCallback<ApiResponse<PartialUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PartialUploadResponse> response) {
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
   * Import a short term forecast
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PartialUploadResponse>> postWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadAsync(ApiRequest<RouteGroupList> request, final AsyncApiCallback<ApiResponse<PartialUploadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<PartialUploadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PartialUploadResponse>() {}, new AsyncApiCallback<ApiResponse<PartialUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PartialUploadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
