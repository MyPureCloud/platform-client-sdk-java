package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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


public class WorkforceManagementApi {
  private final ApiClient pcapiClient;

  public WorkforceManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunit(String businessUnitId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunit(createDeleteWorkforcemanagementBusinessunitRequest(businessUnitId));
  }

  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWithHttpInfo(String businessUnitId) throws IOException {
    return deleteWorkforcemanagementBusinessunit(createDeleteWorkforcemanagementBusinessunitRequest(businessUnitId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitRequest createDeleteWorkforcemanagementBusinessunitRequest(String businessUnitId) {
    return DeleteWorkforcemanagementBusinessunitRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .build();
  }

  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunit(DeleteWorkforcemanagementBusinessunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deletes an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitActivitycode(String businessUnitId, String activityCodeId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitActivitycode(createDeleteWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId));
  }

  /**
   * Deletes an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitActivitycodeWithHttpInfo(String businessUnitId, String activityCodeId) throws IOException {
    return deleteWorkforcemanagementBusinessunitActivitycode(createDeleteWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitActivitycodeRequest createDeleteWorkforcemanagementBusinessunitActivitycodeRequest(String businessUnitId, String activityCodeId) {
    return DeleteWorkforcemanagementBusinessunitActivitycodeRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withActivityCodeId(activityCodeId)
    
            .build();
  }

  /**
   * Deletes an activity code
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitActivitycode(DeleteWorkforcemanagementBusinessunitActivitycodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes an activity code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitActivitycode(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deletes the planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitPlanninggroup(String businessUnitId, String planningGroupId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitPlanninggroup(createDeleteWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId));
  }

  /**
   * Deletes the planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitPlanninggroupWithHttpInfo(String businessUnitId, String planningGroupId) throws IOException {
    return deleteWorkforcemanagementBusinessunitPlanninggroup(createDeleteWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitPlanninggroupRequest createDeleteWorkforcemanagementBusinessunitPlanninggroupRequest(String businessUnitId, String planningGroupId) {
    return DeleteWorkforcemanagementBusinessunitPlanninggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withPlanningGroupId(planningGroupId)
    
            .build();
  }

  /**
   * Deletes the planning group
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitPlanninggroup(DeleteWorkforcemanagementBusinessunitPlanninggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes the planning group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitPlanninggroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Cancel a scheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitSchedulingRun(String businessUnitId, String runId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitSchedulingRun(createDeleteWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId));
  }

  /**
   * Cancel a scheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitSchedulingRunWithHttpInfo(String businessUnitId, String runId) throws IOException {
    return deleteWorkforcemanagementBusinessunitSchedulingRun(createDeleteWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitSchedulingRunRequest createDeleteWorkforcemanagementBusinessunitSchedulingRunRequest(String businessUnitId, String runId) {
    return DeleteWorkforcemanagementBusinessunitSchedulingRunRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withRunId(runId)
    
            .build();
  }

  /**
   * Cancel a scheduling run
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitSchedulingRun(DeleteWorkforcemanagementBusinessunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Cancel a scheduling run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitSchedulingRun(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of the service goal template to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitServicegoaltemplate(String businessUnitId, String serviceGoalTemplateId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitServicegoaltemplate(createDeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId));
  }

  /**
   * Delete a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of the service goal template to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitServicegoaltemplateWithHttpInfo(String businessUnitId, String serviceGoalTemplateId) throws IOException {
    return deleteWorkforcemanagementBusinessunitServicegoaltemplate(createDeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest createDeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest(String businessUnitId, String serviceGoalTemplateId) {
    return DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withServiceGoalTemplateId(serviceGoalTemplateId)
    
            .build();
  }

  /**
   * Delete a service goal template
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitServicegoaltemplate(DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a service goal template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitServicegoaltemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse deleteWorkforcemanagementBusinessunitWeekSchedule(String businessUnitId, LocalDate weekId, String scheduleId) throws IOException, ApiException {
    return  deleteWorkforcemanagementBusinessunitWeekSchedule(createDeleteWorkforcemanagementBusinessunitWeekScheduleRequest(businessUnitId, weekId, scheduleId));
  }

  /**
   * Delete a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @return BuAsyncScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> deleteWorkforcemanagementBusinessunitWeekScheduleWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId) throws IOException {
    return deleteWorkforcemanagementBusinessunitWeekSchedule(createDeleteWorkforcemanagementBusinessunitWeekScheduleRequest(businessUnitId, weekId, scheduleId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitWeekScheduleRequest createDeleteWorkforcemanagementBusinessunitWeekScheduleRequest(String businessUnitId, LocalDate weekId, String scheduleId) {
    return DeleteWorkforcemanagementBusinessunitWeekScheduleRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Delete a schedule
   * 
   * @param request The request object
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse deleteWorkforcemanagementBusinessunitWeekSchedule(DeleteWorkforcemanagementBusinessunitWeekScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> deleteWorkforcemanagementBusinessunitWeekSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWeekShorttermforecast(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitWeekShorttermforecast(createDeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest(businessUnitId, weekDateId, forecastId));
  }

  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWeekShorttermforecastWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException {
    return deleteWorkforcemanagementBusinessunitWeekShorttermforecast(createDeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest(businessUnitId, weekDateId, forecastId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest createDeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest(String businessUnitId, LocalDate weekDateId, String forecastId) {
    return DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .build();
  }

  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWeekShorttermforecast(DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWeekShorttermforecast(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Disable generated calendar link for the current user
   * 
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementCalendarUrlIcs() throws IOException, ApiException {
     deleteWorkforcemanagementCalendarUrlIcs(createDeleteWorkforcemanagementCalendarUrlIcsRequest());
  }

  /**
   * Disable generated calendar link for the current user
   * 
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementCalendarUrlIcsWithHttpInfo() throws IOException {
    return deleteWorkforcemanagementCalendarUrlIcs(createDeleteWorkforcemanagementCalendarUrlIcsRequest().withHttpInfo());
  }

  private DeleteWorkforcemanagementCalendarUrlIcsRequest createDeleteWorkforcemanagementCalendarUrlIcsRequest() {
    return DeleteWorkforcemanagementCalendarUrlIcsRequest.builder()
            .build();
  }

  /**
   * Disable generated calendar link for the current user
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementCalendarUrlIcs(DeleteWorkforcemanagementCalendarUrlIcsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Disable generated calendar link for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementCalendarUrlIcs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunit(String managementUnitId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunit(createDeleteWorkforcemanagementManagementunitRequest(managementUnitId));
  }

  /**
   * Delete management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWithHttpInfo(String managementUnitId) throws IOException {
    return deleteWorkforcemanagementManagementunit(createDeleteWorkforcemanagementManagementunitRequest(managementUnitId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitRequest createDeleteWorkforcemanagementManagementunitRequest(String managementUnitId) {
    return DeleteWorkforcemanagementManagementunitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Delete management unit
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunit(DeleteWorkforcemanagementManagementunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deletes a time off limit object
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitTimeofflimit(String managementUnitId, String timeOffLimitId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitTimeofflimit(createDeleteWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId));
  }

  /**
   * Deletes a time off limit object
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitTimeofflimitWithHttpInfo(String managementUnitId, String timeOffLimitId) throws IOException {
    return deleteWorkforcemanagementManagementunitTimeofflimit(createDeleteWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitTimeofflimitRequest createDeleteWorkforcemanagementManagementunitTimeofflimitRequest(String managementUnitId, String timeOffLimitId) {
    return DeleteWorkforcemanagementManagementunitTimeofflimitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffLimitId(timeOffLimitId)
    
            .build();
  }

  /**
   * Deletes a time off limit object
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitTimeofflimit(DeleteWorkforcemanagementManagementunitTimeofflimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a time off limit object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitTimeofflimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deletes a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitTimeoffplan(String managementUnitId, String timeOffPlanId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitTimeoffplan(createDeleteWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId));
  }

  /**
   * Deletes a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitTimeoffplanWithHttpInfo(String managementUnitId, String timeOffPlanId) throws IOException {
    return deleteWorkforcemanagementManagementunitTimeoffplan(createDeleteWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitTimeoffplanRequest createDeleteWorkforcemanagementManagementunitTimeoffplanRequest(String managementUnitId, String timeOffPlanId) {
    return DeleteWorkforcemanagementManagementunitTimeoffplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffPlanId(timeOffPlanId)
    
            .build();
  }

  /**
   * Deletes a time off plan
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitTimeoffplan(DeleteWorkforcemanagementManagementunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a time off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitTimeoffplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWorkplan(String managementUnitId, String workPlanId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitWorkplan(createDeleteWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId));
  }

  /**
   * Delete a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWorkplanWithHttpInfo(String managementUnitId, String workPlanId) throws IOException {
    return deleteWorkforcemanagementManagementunitWorkplan(createDeleteWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitWorkplanRequest createDeleteWorkforcemanagementManagementunitWorkplanRequest(String managementUnitId, String workPlanId) {
    return DeleteWorkforcemanagementManagementunitWorkplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .build();
  }

  /**
   * Delete a work plan
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWorkplan(DeleteWorkforcemanagementManagementunitWorkplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a work plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWorkplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to be deleted (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWorkplanrotation(String managementUnitId, String workPlanRotationId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitWorkplanrotation(createDeleteWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId));
  }

  /**
   * Delete a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to be deleted (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWorkplanrotationWithHttpInfo(String managementUnitId, String workPlanRotationId) throws IOException {
    return deleteWorkforcemanagementManagementunitWorkplanrotation(createDeleteWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitWorkplanrotationRequest createDeleteWorkforcemanagementManagementunitWorkplanrotationRequest(String managementUnitId, String workPlanRotationId) {
    return DeleteWorkforcemanagementManagementunitWorkplanrotationRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanRotationId(workPlanRotationId)
    
            .build();
  }

  /**
   * Delete a work plan rotation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWorkplanrotation(DeleteWorkforcemanagementManagementunitWorkplanrotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a work plan rotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWorkplanrotation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param userId User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request (required)
   * @return List<UserScheduleAdherence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(List<String> userId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherence(createGetWorkforcemanagementAdherenceRequest(userId));
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param userId User Id(s) for which to fetch current schedule adherence information.  Min 1, Max of 100 userIds per request (required)
   * @return List<UserScheduleAdherence>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceWithHttpInfo(List<String> userId) throws IOException {
    return getWorkforcemanagementAdherence(createGetWorkforcemanagementAdherenceRequest(userId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceRequest createGetWorkforcemanagementAdherenceRequest(List<String> userId) {
    return GetWorkforcemanagementAdherenceRequest.builder()
            .withUserId(userId)
    
            .build();
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request The request object
   * @return List<UserScheduleAdherence>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<UserScheduleAdherence> getWorkforcemanagementAdherence(GetWorkforcemanagementAdherenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<UserScheduleAdherence>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<UserScheduleAdherence>> getWorkforcemanagementAdherence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<UserScheduleAdherence>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get status of the modeling job
   * 
   * @param jobId The id of the modeling job (required)
   * @return ModelingStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelingStatusResponse getWorkforcemanagementAdhocmodelingjob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAdhocmodelingjob(createGetWorkforcemanagementAdhocmodelingjobRequest(jobId));
  }

  /**
   * Get status of the modeling job
   * 
   * @param jobId The id of the modeling job (required)
   * @return ModelingStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelingStatusResponse> getWorkforcemanagementAdhocmodelingjobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAdhocmodelingjob(createGetWorkforcemanagementAdhocmodelingjobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAdhocmodelingjobRequest createGetWorkforcemanagementAdhocmodelingjobRequest(String jobId) {
    return GetWorkforcemanagementAdhocmodelingjobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get status of the modeling job
   * 
   * @param request The request object
   * @return ModelingStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ModelingStatusResponse getWorkforcemanagementAdhocmodelingjob(GetWorkforcemanagementAdhocmodelingjobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ModelingStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ModelingStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status of the modeling job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ModelingStatusResponse> getWorkforcemanagementAdhocmodelingjob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ModelingStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ModelingStatusResponse> response = (ApiResponse<ModelingStatusResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ModelingStatusResponse> response = (ApiResponse<ModelingStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the management unit to which the agent belongs
   * 
   * @param agentId The ID of the agent to look up (required)
   * @return AgentManagementUnitReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentManagementUnitReference getWorkforcemanagementAgentManagementunit(String agentId) throws IOException, ApiException {
    return  getWorkforcemanagementAgentManagementunit(createGetWorkforcemanagementAgentManagementunitRequest(agentId));
  }

  /**
   * Get the management unit to which the agent belongs
   * 
   * @param agentId The ID of the agent to look up (required)
   * @return AgentManagementUnitReference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentManagementUnitReference> getWorkforcemanagementAgentManagementunitWithHttpInfo(String agentId) throws IOException {
    return getWorkforcemanagementAgentManagementunit(createGetWorkforcemanagementAgentManagementunitRequest(agentId).withHttpInfo());
  }

  private GetWorkforcemanagementAgentManagementunitRequest createGetWorkforcemanagementAgentManagementunitRequest(String agentId) {
    return GetWorkforcemanagementAgentManagementunitRequest.builder()
            .withAgentId(agentId)
    
            .build();
  }

  /**
   * Get the management unit to which the agent belongs
   * 
   * @param request The request object
   * @return AgentManagementUnitReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentManagementUnitReference getWorkforcemanagementAgentManagementunit(GetWorkforcemanagementAgentManagementunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentManagementUnitReference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentManagementUnitReference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the management unit to which the agent belongs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentManagementUnitReference> getWorkforcemanagementAgentManagementunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentManagementUnitReference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @return AgentManagementUnitReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentManagementUnitReference getWorkforcemanagementAgentsMeManagementunit() throws IOException, ApiException {
    return  getWorkforcemanagementAgentsMeManagementunit(createGetWorkforcemanagementAgentsMeManagementunitRequest());
  }

  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @return AgentManagementUnitReference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentManagementUnitReference> getWorkforcemanagementAgentsMeManagementunitWithHttpInfo() throws IOException {
    return getWorkforcemanagementAgentsMeManagementunit(createGetWorkforcemanagementAgentsMeManagementunitRequest().withHttpInfo());
  }

  private GetWorkforcemanagementAgentsMeManagementunitRequest createGetWorkforcemanagementAgentsMeManagementunitRequest() {
    return GetWorkforcemanagementAgentsMeManagementunitRequest.builder()
            .build();
  }

  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @param request The request object
   * @return AgentManagementUnitReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentManagementUnitReference getWorkforcemanagementAgentsMeManagementunit(GetWorkforcemanagementAgentsMeManagementunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentManagementUnitReference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentManagementUnitReference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the management unit to which the currently logged in agent belongs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentManagementUnitReference> getWorkforcemanagementAgentsMeManagementunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentManagementUnitReference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AgentManagementUnitReference> response = (ApiResponse<AgentManagementUnitReference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit getWorkforcemanagementBusinessunit(String businessUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunit(createGetWorkforcemanagementBusinessunitRequest(businessUnitId, expand));
  }

  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return BusinessUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> getWorkforcemanagementBusinessunitWithHttpInfo(String businessUnitId, List<String> expand) throws IOException {
    return getWorkforcemanagementBusinessunit(createGetWorkforcemanagementBusinessunitRequest(businessUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitRequest createGetWorkforcemanagementBusinessunitRequest(String businessUnitId, List<String> expand) {
    return GetWorkforcemanagementBusinessunitRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request The request object
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit getWorkforcemanagementBusinessunit(GetWorkforcemanagementBusinessunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get business unit
   * Expanding \&quot;settings\&quot; will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> getWorkforcemanagementBusinessunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to fetch (required)
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode getWorkforcemanagementBusinessunitActivitycode(String businessUnitId, String activityCodeId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivitycode(createGetWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId));
  }

  /**
   * Get an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to fetch (required)
   * @return BusinessUnitActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> getWorkforcemanagementBusinessunitActivitycodeWithHttpInfo(String businessUnitId, String activityCodeId) throws IOException {
    return getWorkforcemanagementBusinessunitActivitycode(createGetWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivitycodeRequest createGetWorkforcemanagementBusinessunitActivitycodeRequest(String businessUnitId, String activityCodeId) {
    return GetWorkforcemanagementBusinessunitActivitycodeRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withActivityCodeId(activityCodeId)
    
            .build();
  }

  /**
   * Get an activity code
   * 
   * @param request The request object
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode getWorkforcemanagementBusinessunitActivitycode(GetWorkforcemanagementBusinessunitActivitycodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an activity code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> getWorkforcemanagementBusinessunitActivitycode(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @return BusinessUnitActivityCodeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCodeListing getWorkforcemanagementBusinessunitActivitycodes(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivitycodes(createGetWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId));
  }

  /**
   * Get activity codes
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @return BusinessUnitActivityCodeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCodeListing> getWorkforcemanagementBusinessunitActivitycodesWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitActivitycodes(createGetWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivitycodesRequest createGetWorkforcemanagementBusinessunitActivitycodesRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitActivitycodesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .build();
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return BusinessUnitActivityCodeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCodeListing getWorkforcemanagementBusinessunitActivitycodes(GetWorkforcemanagementBusinessunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitActivityCodeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCodeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCodeListing> getWorkforcemanagementBusinessunitActivitycodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitActivityCodeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCodeListing> response = (ApiResponse<BusinessUnitActivityCodeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCodeListing> response = (ApiResponse<BusinessUnitActivityCodeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get intraday planning groups for the given date
   * 
   * @param businessUnitId The business unit ID of the business unit (required)
   * @param date yyyy-MM-dd date string interpreted in the configured business unit time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return WfmIntradayPlanningGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayPlanningGroupListing getWorkforcemanagementBusinessunitIntradayPlanninggroups(String businessUnitId, LocalDate date) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitIntradayPlanninggroups(createGetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest(businessUnitId, date));
  }

  /**
   * Get intraday planning groups for the given date
   * 
   * @param businessUnitId The business unit ID of the business unit (required)
   * @param date yyyy-MM-dd date string interpreted in the configured business unit time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @return WfmIntradayPlanningGroupListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayPlanningGroupListing> getWorkforcemanagementBusinessunitIntradayPlanninggroupsWithHttpInfo(String businessUnitId, LocalDate date) throws IOException {
    return getWorkforcemanagementBusinessunitIntradayPlanninggroups(createGetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest(businessUnitId, date).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest createGetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest(String businessUnitId, LocalDate date) {
    return GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withDate(date)
    
            .build();
  }

  /**
   * Get intraday planning groups for the given date
   * 
   * @param request The request object
   * @return WfmIntradayPlanningGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayPlanningGroupListing getWorkforcemanagementBusinessunitIntradayPlanninggroups(GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmIntradayPlanningGroupListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmIntradayPlanningGroupListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday planning groups for the given date
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayPlanningGroupListing> getWorkforcemanagementBusinessunitIntradayPlanninggroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmIntradayPlanningGroupListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntradayPlanningGroupListing> response = (ApiResponse<WfmIntradayPlanningGroupListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntradayPlanningGroupListing> response = (ApiResponse<WfmIntradayPlanningGroupListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all authorized management units in the business unit
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementBusinessunitManagementunits(String businessUnitId, String feature, String divisionId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitManagementunits(createGetWorkforcemanagementBusinessunitManagementunitsRequest(businessUnitId, feature, divisionId));
  }

  /**
   * Get all authorized management units in the business unit
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return ManagementUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementBusinessunitManagementunitsWithHttpInfo(String businessUnitId, String feature, String divisionId) throws IOException {
    return getWorkforcemanagementBusinessunitManagementunits(createGetWorkforcemanagementBusinessunitManagementunitsRequest(businessUnitId, feature, divisionId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitManagementunitsRequest createGetWorkforcemanagementBusinessunitManagementunitsRequest(String businessUnitId, String feature, String divisionId) {
    return GetWorkforcemanagementBusinessunitManagementunitsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withFeature(feature)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get all authorized management units in the business unit
   * 
   * @param request The request object
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementBusinessunitManagementunits(GetWorkforcemanagementBusinessunitManagementunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all authorized management units in the business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementBusinessunitManagementunits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to fetch (required)
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup getWorkforcemanagementBusinessunitPlanninggroup(String businessUnitId, String planningGroupId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitPlanninggroup(createGetWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId));
  }

  /**
   * Get a planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to fetch (required)
   * @return PlanningGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> getWorkforcemanagementBusinessunitPlanninggroupWithHttpInfo(String businessUnitId, String planningGroupId) throws IOException {
    return getWorkforcemanagementBusinessunitPlanninggroup(createGetWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitPlanninggroupRequest createGetWorkforcemanagementBusinessunitPlanninggroupRequest(String businessUnitId, String planningGroupId) {
    return GetWorkforcemanagementBusinessunitPlanninggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withPlanningGroupId(planningGroupId)
    
            .build();
  }

  /**
   * Get a planning group
   * 
   * @param request The request object
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup getWorkforcemanagementBusinessunitPlanninggroup(GetWorkforcemanagementBusinessunitPlanninggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PlanningGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PlanningGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a planning group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> getWorkforcemanagementBusinessunitPlanninggroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PlanningGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets list of planning groups
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @return PlanningGroupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroupList getWorkforcemanagementBusinessunitPlanninggroups(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitPlanninggroups(createGetWorkforcemanagementBusinessunitPlanninggroupsRequest(businessUnitId));
  }

  /**
   * Gets list of planning groups
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @return PlanningGroupList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroupList> getWorkforcemanagementBusinessunitPlanninggroupsWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitPlanninggroups(createGetWorkforcemanagementBusinessunitPlanninggroupsRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitPlanninggroupsRequest createGetWorkforcemanagementBusinessunitPlanninggroupsRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitPlanninggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .build();
  }

  /**
   * Gets list of planning groups
   * 
   * @param request The request object
   * @return PlanningGroupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroupList getWorkforcemanagementBusinessunitPlanninggroups(GetWorkforcemanagementBusinessunitPlanninggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PlanningGroupList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PlanningGroupList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets list of planning groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroupList> getWorkforcemanagementBusinessunitPlanninggroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PlanningGroupList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroupList> response = (ApiResponse<PlanningGroupList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroupList> response = (ApiResponse<PlanningGroupList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a scheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @return BuScheduleRun
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleRun getWorkforcemanagementBusinessunitSchedulingRun(String businessUnitId, String runId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitSchedulingRun(createGetWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId));
  }

  /**
   * Get a scheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @return BuScheduleRun
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleRun> getWorkforcemanagementBusinessunitSchedulingRunWithHttpInfo(String businessUnitId, String runId) throws IOException {
    return getWorkforcemanagementBusinessunitSchedulingRun(createGetWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitSchedulingRunRequest createGetWorkforcemanagementBusinessunitSchedulingRunRequest(String businessUnitId, String runId) {
    return GetWorkforcemanagementBusinessunitSchedulingRunRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withRunId(runId)
    
            .build();
  }

  /**
   * Get a scheduling run
   * 
   * @param request The request object
   * @return BuScheduleRun
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleRun getWorkforcemanagementBusinessunitSchedulingRun(GetWorkforcemanagementBusinessunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuScheduleRun> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuScheduleRun>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a scheduling run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleRun> getWorkforcemanagementBusinessunitSchedulingRun(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuScheduleRun>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleRun> response = (ApiResponse<BuScheduleRun>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleRun> response = (ApiResponse<BuScheduleRun>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the result of a rescheduling operation
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @param managementUnitIds The IDs of the management units for which to fetch the reschedule results (required)
   * @param expand The fields to expand. Omitting will return an empty response (required)
   * @return BuRescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuRescheduleResult getWorkforcemanagementBusinessunitSchedulingRunResult(String businessUnitId, String runId, List<String> managementUnitIds, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitSchedulingRunResult(createGetWorkforcemanagementBusinessunitSchedulingRunResultRequest(businessUnitId, runId, managementUnitIds, expand));
  }

  /**
   * Get the result of a rescheduling operation
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @param managementUnitIds The IDs of the management units for which to fetch the reschedule results (required)
   * @param expand The fields to expand. Omitting will return an empty response (required)
   * @return BuRescheduleResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuRescheduleResult> getWorkforcemanagementBusinessunitSchedulingRunResultWithHttpInfo(String businessUnitId, String runId, List<String> managementUnitIds, List<String> expand) throws IOException {
    return getWorkforcemanagementBusinessunitSchedulingRunResult(createGetWorkforcemanagementBusinessunitSchedulingRunResultRequest(businessUnitId, runId, managementUnitIds, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitSchedulingRunResultRequest createGetWorkforcemanagementBusinessunitSchedulingRunResultRequest(String businessUnitId, String runId, List<String> managementUnitIds, List<String> expand) {
    return GetWorkforcemanagementBusinessunitSchedulingRunResultRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withRunId(runId)
    
            .withManagementUnitIds(managementUnitIds)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get the result of a rescheduling operation
   * 
   * @param request The request object
   * @return BuRescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuRescheduleResult getWorkforcemanagementBusinessunitSchedulingRunResult(GetWorkforcemanagementBusinessunitSchedulingRunResultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuRescheduleResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuRescheduleResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the result of a rescheduling operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuRescheduleResult> getWorkforcemanagementBusinessunitSchedulingRunResult(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuRescheduleResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuRescheduleResult> response = (ApiResponse<BuRescheduleResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuRescheduleResult> response = (ApiResponse<BuRescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of scheduling runs
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return BuScheduleRunListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleRunListing getWorkforcemanagementBusinessunitSchedulingRuns(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitSchedulingRuns(createGetWorkforcemanagementBusinessunitSchedulingRunsRequest(businessUnitId));
  }

  /**
   * Get the list of scheduling runs
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return BuScheduleRunListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleRunListing> getWorkforcemanagementBusinessunitSchedulingRunsWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitSchedulingRuns(createGetWorkforcemanagementBusinessunitSchedulingRunsRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitSchedulingRunsRequest createGetWorkforcemanagementBusinessunitSchedulingRunsRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitSchedulingRunsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .build();
  }

  /**
   * Get the list of scheduling runs
   * 
   * @param request The request object
   * @return BuScheduleRunListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleRunListing getWorkforcemanagementBusinessunitSchedulingRuns(GetWorkforcemanagementBusinessunitSchedulingRunsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuScheduleRunListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuScheduleRunListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of scheduling runs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleRunListing> getWorkforcemanagementBusinessunitSchedulingRuns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuScheduleRunListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleRunListing> response = (ApiResponse<BuScheduleRunListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleRunListing> response = (ApiResponse<BuScheduleRunListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of a service goal template to fetch (required)
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate getWorkforcemanagementBusinessunitServicegoaltemplate(String businessUnitId, String serviceGoalTemplateId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitServicegoaltemplate(createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId));
  }

  /**
   * Get a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of a service goal template to fetch (required)
   * @return ServiceGoalTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> getWorkforcemanagementBusinessunitServicegoaltemplateWithHttpInfo(String businessUnitId, String serviceGoalTemplateId) throws IOException {
    return getWorkforcemanagementBusinessunitServicegoaltemplate(createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitServicegoaltemplateRequest createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(String businessUnitId, String serviceGoalTemplateId) {
    return GetWorkforcemanagementBusinessunitServicegoaltemplateRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withServiceGoalTemplateId(serviceGoalTemplateId)
    
            .build();
  }

  /**
   * Get a service goal template
   * 
   * @param request The request object
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate getWorkforcemanagementBusinessunitServicegoaltemplate(GetWorkforcemanagementBusinessunitServicegoaltemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a service goal template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> getWorkforcemanagementBusinessunitServicegoaltemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets list of service goal templates
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @return ServiceGoalTemplateList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplateList getWorkforcemanagementBusinessunitServicegoaltemplates(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitServicegoaltemplates(createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId));
  }

  /**
   * Gets list of service goal templates
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @return ServiceGoalTemplateList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplateList> getWorkforcemanagementBusinessunitServicegoaltemplatesWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitServicegoaltemplates(createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .build();
  }

  /**
   * Gets list of service goal templates
   * 
   * @param request The request object
   * @return ServiceGoalTemplateList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplateList getWorkforcemanagementBusinessunitServicegoaltemplates(GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalTemplateList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalTemplateList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets list of service goal templates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplateList> getWorkforcemanagementBusinessunitServicegoaltemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalTemplateList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplateList> response = (ApiResponse<ServiceGoalTemplateList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplateList> response = (ApiResponse<ServiceGoalTemplateList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param expand expand (optional)
   * @return BuScheduleMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleMetadata getWorkforcemanagementBusinessunitWeekSchedule(String businessUnitId, LocalDate weekId, String scheduleId, String expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekSchedule(createGetWorkforcemanagementBusinessunitWeekScheduleRequest(businessUnitId, weekId, scheduleId, expand));
  }

  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param expand expand (optional)
   * @return BuScheduleMetadata
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleMetadata> getWorkforcemanagementBusinessunitWeekScheduleWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, String expand) throws IOException {
    return getWorkforcemanagementBusinessunitWeekSchedule(createGetWorkforcemanagementBusinessunitWeekScheduleRequest(businessUnitId, weekId, scheduleId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekScheduleRequest createGetWorkforcemanagementBusinessunitWeekScheduleRequest(String businessUnitId, LocalDate weekId, String scheduleId, String expand) {
    return GetWorkforcemanagementBusinessunitWeekScheduleRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param request The request object
   * @return BuScheduleMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleMetadata getWorkforcemanagementBusinessunitWeekSchedule(GetWorkforcemanagementBusinessunitWeekScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuScheduleMetadata> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuScheduleMetadata>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the metadata for the schedule, describing which management units and agents are in the scheduleSchedule data can then be loaded with the query route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleMetadata> getWorkforcemanagementBusinessunitWeekSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuScheduleMetadata>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the generation results for a generated schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @return ScheduleGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGenerationResult getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(String businessUnitId, LocalDate weekId, String scheduleId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(createGetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest(businessUnitId, weekId, scheduleId));
  }

  /**
   * Get the generation results for a generated schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @return ScheduleGenerationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGenerationResult> getWorkforcemanagementBusinessunitWeekScheduleGenerationresultsWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(createGetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest(businessUnitId, weekId, scheduleId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest createGetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest(String businessUnitId, LocalDate weekId, String scheduleId) {
    return GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Get the generation results for a generated schedule
   * 
   * @param request The request object
   * @return ScheduleGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleGenerationResult getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleGenerationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleGenerationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the generation results for a generated schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleGenerationResult> getWorkforcemanagementBusinessunitWeekScheduleGenerationresults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleGenerationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGenerationResult> response = (ApiResponse<ScheduleGenerationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleGenerationResult> response = (ApiResponse<ScheduleGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param forceDownload Whether to force the result to come via download url.  For testing purposes only (optional)
   * @return BuHeadcountForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuHeadcountForecastResponse getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(String businessUnitId, LocalDate weekId, String scheduleId, Boolean forceDownload) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(createGetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest(businessUnitId, weekId, scheduleId, forceDownload));
  }

  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param forceDownload Whether to force the result to come via download url.  For testing purposes only (optional)
   * @return BuHeadcountForecastResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuHeadcountForecastResponse> getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, Boolean forceDownload) throws IOException {
    return getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(createGetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest(businessUnitId, weekId, scheduleId, forceDownload).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest createGetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest(String businessUnitId, LocalDate weekId, String scheduleId, Boolean forceDownload) {
    return GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withForceDownload(forceDownload)
    
            .build();
  }

  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param request The request object
   * @return BuHeadcountForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuHeadcountForecastResponse getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuHeadcountForecastResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuHeadcountForecastResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the headcount forecast by planning group for the schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuHeadcountForecastResponse> getWorkforcemanagementBusinessunitWeekScheduleHeadcountforecast(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuHeadcountForecastResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuHeadcountForecastResponse> response = (ApiResponse<BuHeadcountForecastResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuHeadcountForecastResponse> response = (ApiResponse<BuHeadcountForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param agentId THe ID of the agent (required)
   * @return BuAgentScheduleHistoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAgentScheduleHistoryResponse getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(String businessUnitId, LocalDate weekId, String scheduleId, String agentId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(createGetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest(businessUnitId, weekId, scheduleId, agentId));
  }

  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param agentId THe ID of the agent (required)
   * @return BuAgentScheduleHistoryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAgentScheduleHistoryResponse> getWorkforcemanagementBusinessunitWeekScheduleHistoryAgentWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, String agentId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(createGetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest(businessUnitId, weekId, scheduleId, agentId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest createGetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest(String businessUnitId, LocalDate weekId, String scheduleId, String agentId) {
    return GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withAgentId(agentId)
    
            .build();
  }

  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param request The request object
   * @return BuAgentScheduleHistoryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAgentScheduleHistoryResponse getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAgentScheduleHistoryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAgentScheduleHistoryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Loads agent&#39;s schedule history.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAgentScheduleHistoryResponse> getWorkforcemanagementBusinessunitWeekScheduleHistoryAgent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAgentScheduleHistoryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAgentScheduleHistoryResponse> response = (ApiResponse<BuAgentScheduleHistoryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAgentScheduleHistoryResponse> response = (ApiResponse<BuAgentScheduleHistoryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format, or &#39;recent&#39; (without quotes) to get recent schedules (required)
   * @param includeOnlyPublished includeOnlyPublished (optional)
   * @param expand expand (optional)
   * @return BuScheduleListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleListing getWorkforcemanagementBusinessunitWeekSchedules(String businessUnitId, String weekId, Boolean includeOnlyPublished, String expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekSchedules(createGetWorkforcemanagementBusinessunitWeekSchedulesRequest(businessUnitId, weekId, includeOnlyPublished, expand));
  }

  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format, or &#39;recent&#39; (without quotes) to get recent schedules (required)
   * @param includeOnlyPublished includeOnlyPublished (optional)
   * @param expand expand (optional)
   * @return BuScheduleListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleListing> getWorkforcemanagementBusinessunitWeekSchedulesWithHttpInfo(String businessUnitId, String weekId, Boolean includeOnlyPublished, String expand) throws IOException {
    return getWorkforcemanagementBusinessunitWeekSchedules(createGetWorkforcemanagementBusinessunitWeekSchedulesRequest(businessUnitId, weekId, includeOnlyPublished, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekSchedulesRequest createGetWorkforcemanagementBusinessunitWeekSchedulesRequest(String businessUnitId, String weekId, Boolean includeOnlyPublished, String expand) {
    return GetWorkforcemanagementBusinessunitWeekSchedulesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withIncludeOnlyPublished(includeOnlyPublished)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param request The request object
   * @return BuScheduleListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleListing getWorkforcemanagementBusinessunitWeekSchedules(GetWorkforcemanagementBusinessunitWeekSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuScheduleListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuScheduleListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of week schedules for the specified week
   * Use \&quot;recent\&quot; (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleListing> getWorkforcemanagementBusinessunitWeekSchedules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuScheduleListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleListing> response = (ApiResponse<BuScheduleListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleListing> response = (ApiResponse<BuScheduleListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param expand  (optional)
   * @return BuShortTermForecast
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuShortTermForecast getWorkforcemanagementBusinessunitWeekShorttermforecast(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecast(createGetWorkforcemanagementBusinessunitWeekShorttermforecastRequest(businessUnitId, weekDateId, forecastId, expand));
  }

  /**
   * Get a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param expand  (optional)
   * @return BuShortTermForecast
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuShortTermForecast> getWorkforcemanagementBusinessunitWeekShorttermforecastWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> expand) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecast(createGetWorkforcemanagementBusinessunitWeekShorttermforecastRequest(businessUnitId, weekDateId, forecastId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastRequest(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> expand) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get a short term forecast
   * 
   * @param request The request object
   * @return BuShortTermForecast
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuShortTermForecast getWorkforcemanagementBusinessunitWeekShorttermforecast(GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuShortTermForecast> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuShortTermForecast>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a short term forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuShortTermForecast> getWorkforcemanagementBusinessunitWeekShorttermforecast(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuShortTermForecast>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuShortTermForecast> response = (ApiResponse<BuShortTermForecast>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuShortTermForecast> response = (ApiResponse<BuShortTermForecast>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param weekNumber The week number to fetch (for multi-week forecasts) (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastData(String businessUnitId, LocalDate weekDateId, String forecastId, Integer weekNumber, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecastData(createGetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest(businessUnitId, weekDateId, forecastId, weekNumber, forceDownloadService));
  }

  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param weekNumber The week number to fetch (for multi-week forecasts) (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuForecastResultResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastDataWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId, Integer weekNumber, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecastData(createGetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest(businessUnitId, weekDateId, forecastId, weekNumber, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest(String businessUnitId, LocalDate weekDateId, String forecastId, Integer weekNumber, Boolean forceDownloadService) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .withWeekNumber(weekNumber)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request The request object
   * @return BuForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastData(GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuForecastResultResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuForecastResultResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the result of a short term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastData(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuForecastResultResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuForecastResultResponse> response = (ApiResponse<BuForecastResultResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuForecastResultResponse> response = (ApiResponse<BuForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets the forecast generation results
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @return BuForecastGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastGenerationResult getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(createGetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest(businessUnitId, weekDateId, forecastId));
  }

  /**
   * Gets the forecast generation results
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @return BuForecastGenerationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastGenerationResult> getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(createGetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest(businessUnitId, weekDateId, forecastId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest(String businessUnitId, LocalDate weekDateId, String forecastId) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .build();
  }

  /**
   * Gets the forecast generation results
   * 
   * @param request The request object
   * @return BuForecastGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastGenerationResult getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuForecastGenerationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuForecastGenerationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the forecast generation results
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastGenerationResult> getWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuForecastGenerationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuForecastGenerationResult> response = (ApiResponse<BuForecastGenerationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuForecastGenerationResult> response = (ApiResponse<BuForecastGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return LongTermForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LongTermForecastResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(String businessUnitId, LocalDate weekDateId, String forecastId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(createGetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest(businessUnitId, weekDateId, forecastId, forceDownloadService));
  }

  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return LongTermForecastResultResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LongTermForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(createGetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest(businessUnitId, weekDateId, forecastId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest(String businessUnitId, LocalDate weekDateId, String forecastId, Boolean forceDownloadService) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request The request object
   * @return LongTermForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public LongTermForecastResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<LongTermForecastResultResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<LongTermForecastResultResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the result of a long term forecast calculation
   * Includes modifications unless you pass the doNotApplyModifications query parameter
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<LongTermForecastResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<LongTermForecastResultResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<LongTermForecastResultResponse> response = (ApiResponse<LongTermForecastResultResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<LongTermForecastResultResponse> response = (ApiResponse<LongTermForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets the forecast planning group snapshot
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @return ForecastPlanningGroupsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ForecastPlanningGroupsResponse getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(createGetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest(businessUnitId, weekDateId, forecastId));
  }

  /**
   * Gets the forecast planning group snapshot
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @return ForecastPlanningGroupsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ForecastPlanningGroupsResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(createGetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest(businessUnitId, weekDateId, forecastId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest(String businessUnitId, LocalDate weekDateId, String forecastId) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .build();
  }

  /**
   * Gets the forecast planning group snapshot
   * 
   * @param request The request object
   * @return ForecastPlanningGroupsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ForecastPlanningGroupsResponse getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ForecastPlanningGroupsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ForecastPlanningGroupsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the forecast planning group snapshot
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ForecastPlanningGroupsResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ForecastPlanningGroupsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ForecastPlanningGroupsResponse> response = (ApiResponse<ForecastPlanningGroupsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ForecastPlanningGroupsResponse> response = (ApiResponse<ForecastPlanningGroupsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format or &#39;recent&#39; (without quotes) to fetch recent forecasts (required)
   * @return BuShortTermForecastListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuShortTermForecastListing getWorkforcemanagementBusinessunitWeekShorttermforecasts(String businessUnitId, String weekDateId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecasts(createGetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest(businessUnitId, weekDateId));
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format or &#39;recent&#39; (without quotes) to fetch recent forecasts (required)
   * @return BuShortTermForecastListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuShortTermForecastListing> getWorkforcemanagementBusinessunitWeekShorttermforecastsWithHttpInfo(String businessUnitId, String weekDateId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecasts(createGetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest(businessUnitId, weekDateId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest(String businessUnitId, String weekDateId) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .build();
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param request The request object
   * @return BuShortTermForecastListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuShortTermForecastListing getWorkforcemanagementBusinessunitWeekShorttermforecasts(GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuShortTermForecastListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuShortTermForecastListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuShortTermForecastListing> getWorkforcemanagementBusinessunitWeekShorttermforecasts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuShortTermForecastListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuShortTermForecastListing> response = (ApiResponse<BuShortTermForecastListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuShortTermForecastListing> response = (ApiResponse<BuShortTermForecastListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get business units
   * 
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return BusinessUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitListing getWorkforcemanagementBusinessunits(String feature, String divisionId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunits(createGetWorkforcemanagementBusinessunitsRequest(feature, divisionId));
  }

  /**
   * Get business units
   * 
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return BusinessUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitListing> getWorkforcemanagementBusinessunitsWithHttpInfo(String feature, String divisionId) throws IOException {
    return getWorkforcemanagementBusinessunits(createGetWorkforcemanagementBusinessunitsRequest(feature, divisionId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitsRequest createGetWorkforcemanagementBusinessunitsRequest(String feature, String divisionId) {
    return GetWorkforcemanagementBusinessunitsRequest.builder()
            .withFeature(feature)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get business units
   * 
   * @param request The request object
   * @return BusinessUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitListing getWorkforcemanagementBusinessunits(GetWorkforcemanagementBusinessunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get business units
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitListing> getWorkforcemanagementBusinessunits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get business units across divisions
   * 
   * @param divisionId The divisionIds to filter by. If omitted, will return business units in all divisions (optional)
   * @return BusinessUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitListing getWorkforcemanagementBusinessunitsDivisionviews(List<String> divisionId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitsDivisionviews(createGetWorkforcemanagementBusinessunitsDivisionviewsRequest(divisionId));
  }

  /**
   * Get business units across divisions
   * 
   * @param divisionId The divisionIds to filter by. If omitted, will return business units in all divisions (optional)
   * @return BusinessUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitListing> getWorkforcemanagementBusinessunitsDivisionviewsWithHttpInfo(List<String> divisionId) throws IOException {
    return getWorkforcemanagementBusinessunitsDivisionviews(createGetWorkforcemanagementBusinessunitsDivisionviewsRequest(divisionId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitsDivisionviewsRequest createGetWorkforcemanagementBusinessunitsDivisionviewsRequest(List<String> divisionId) {
    return GetWorkforcemanagementBusinessunitsDivisionviewsRequest.builder()
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get business units across divisions
   * 
   * @param request The request object
   * @return BusinessUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitListing getWorkforcemanagementBusinessunitsDivisionviews(GetWorkforcemanagementBusinessunitsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get business units across divisions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitListing> getWorkforcemanagementBusinessunitsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitListing> response = (ApiResponse<BusinessUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param calendarId The id of the ics-formatted calendar (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getWorkforcemanagementCalendarDataIcs(String calendarId) throws IOException, ApiException {
    return  getWorkforcemanagementCalendarDataIcs(createGetWorkforcemanagementCalendarDataIcsRequest(calendarId));
  }

  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param calendarId The id of the ics-formatted calendar (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getWorkforcemanagementCalendarDataIcsWithHttpInfo(String calendarId) throws IOException {
    return getWorkforcemanagementCalendarDataIcs(createGetWorkforcemanagementCalendarDataIcsRequest(calendarId).withHttpInfo());
  }

  private GetWorkforcemanagementCalendarDataIcsRequest createGetWorkforcemanagementCalendarDataIcsRequest(String calendarId) {
    return GetWorkforcemanagementCalendarDataIcsRequest.builder()
            .withCalendarId(calendarId)
    
            .build();
  }

  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getWorkforcemanagementCalendarDataIcs(GetWorkforcemanagementCalendarDataIcsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get ics formatted calendar based on shareable link
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getWorkforcemanagementCalendarDataIcs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get existing calendar link for the current user
   * 
   * @return CalendarUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalendarUrlResponse getWorkforcemanagementCalendarUrlIcs() throws IOException, ApiException {
    return  getWorkforcemanagementCalendarUrlIcs(createGetWorkforcemanagementCalendarUrlIcsRequest());
  }

  /**
   * Get existing calendar link for the current user
   * 
   * @return CalendarUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalendarUrlResponse> getWorkforcemanagementCalendarUrlIcsWithHttpInfo() throws IOException {
    return getWorkforcemanagementCalendarUrlIcs(createGetWorkforcemanagementCalendarUrlIcsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementCalendarUrlIcsRequest createGetWorkforcemanagementCalendarUrlIcsRequest() {
    return GetWorkforcemanagementCalendarUrlIcsRequest.builder()
            .build();
  }

  /**
   * Get existing calendar link for the current user
   * 
   * @param request The request object
   * @return CalendarUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalendarUrlResponse getWorkforcemanagementCalendarUrlIcs(GetWorkforcemanagementCalendarUrlIcsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CalendarUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CalendarUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get existing calendar link for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalendarUrlResponse> getWorkforcemanagementCalendarUrlIcs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CalendarUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @return HistoricalImportDeleteJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteJobResponse getWorkforcemanagementHistoricaldataDeletejob() throws IOException, ApiException {
    return  getWorkforcemanagementHistoricaldataDeletejob(createGetWorkforcemanagementHistoricaldataDeletejobRequest());
  }

  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @return HistoricalImportDeleteJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteJobResponse> getWorkforcemanagementHistoricaldataDeletejobWithHttpInfo() throws IOException {
    return getWorkforcemanagementHistoricaldataDeletejob(createGetWorkforcemanagementHistoricaldataDeletejobRequest().withHttpInfo());
  }

  private GetWorkforcemanagementHistoricaldataDeletejobRequest createGetWorkforcemanagementHistoricaldataDeletejobRequest() {
    return GetWorkforcemanagementHistoricaldataDeletejobRequest.builder()
            .build();
  }

  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @param request The request object
   * @return HistoricalImportDeleteJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteJobResponse getWorkforcemanagementHistoricaldataDeletejob(GetWorkforcemanagementHistoricaldataDeletejobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportDeleteJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves delete job status for historical data imports of the organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteJobResponse> getWorkforcemanagementHistoricaldataDeletejob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportDeleteJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @return HistoricalImportStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportStatusListing getWorkforcemanagementHistoricaldataImportstatus() throws IOException, ApiException {
    return  getWorkforcemanagementHistoricaldataImportstatus(createGetWorkforcemanagementHistoricaldataImportstatusRequest());
  }

  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @return HistoricalImportStatusListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportStatusListing> getWorkforcemanagementHistoricaldataImportstatusWithHttpInfo() throws IOException {
    return getWorkforcemanagementHistoricaldataImportstatus(createGetWorkforcemanagementHistoricaldataImportstatusRequest().withHttpInfo());
  }

  private GetWorkforcemanagementHistoricaldataImportstatusRequest createGetWorkforcemanagementHistoricaldataImportstatusRequest() {
    return GetWorkforcemanagementHistoricaldataImportstatusRequest.builder()
            .build();
  }

  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @param request The request object
   * @return HistoricalImportStatusListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportStatusListing getWorkforcemanagementHistoricaldataImportstatus(GetWorkforcemanagementHistoricaldataImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportStatusListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportStatusListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves status of the historical data imports of the organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportStatusListing> getWorkforcemanagementHistoricaldataImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportStatusListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportStatusListing> response = (ApiResponse<HistoricalImportStatusListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportStatusListing> response = (ApiResponse<HistoricalImportStatusListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit getWorkforcemanagementManagementunit(String managementUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunit(createGetWorkforcemanagementManagementunitRequest(managementUnitId, expand));
  }

  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return ManagementUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> getWorkforcemanagementManagementunitWithHttpInfo(String managementUnitId, List<String> expand) throws IOException {
    return getWorkforcemanagementManagementunit(createGetWorkforcemanagementManagementunitRequest(managementUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitRequest createGetWorkforcemanagementManagementunitRequest(String managementUnitId, List<String> expand) {
    return GetWorkforcemanagementManagementunitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param request The request object
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit getWorkforcemanagementManagementunit(GetWorkforcemanagementManagementunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> getWorkforcemanagementManagementunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(managementUnitId));
  }

  /**
   * Get activity codes
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitActivitycodesRequest createGetWorkforcemanagementManagementunitActivitycodesRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitActivitycodesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(GetWorkforcemanagementManagementunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCodeContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get activity codes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCodeContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return UserScheduleAdherenceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleAdherenceListing getWorkforcemanagementManagementunitAdherence(String managementUnitId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitAdherence(createGetWorkforcemanagementManagementunitAdherenceRequest(managementUnitId, forceDownloadService));
  }

  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return UserScheduleAdherenceListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleAdherenceListing> getWorkforcemanagementManagementunitAdherenceWithHttpInfo(String managementUnitId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementManagementunitAdherence(createGetWorkforcemanagementManagementunitAdherenceRequest(managementUnitId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitAdherenceRequest createGetWorkforcemanagementManagementunitAdherenceRequest(String managementUnitId, Boolean forceDownloadService) {
    return GetWorkforcemanagementManagementunitAdherenceRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param request The request object
   * @return UserScheduleAdherenceListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleAdherenceListing getWorkforcemanagementManagementunitAdherence(GetWorkforcemanagementManagementunitAdherenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserScheduleAdherenceListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserScheduleAdherenceListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of user schedule adherence records for the requested management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleAdherenceListing> getWorkforcemanagementManagementunitAdherence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserScheduleAdherenceListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleAdherenceListing> response = (ApiResponse<UserScheduleAdherenceListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleAdherenceListing> response = (ApiResponse<UserScheduleAdherenceListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get data for agent in the management unit
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @param excludeCapabilities Excludes all capabilities of the agent such as queues, languages, and skills (optional)
   * @return WfmAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmAgent getWorkforcemanagementManagementunitAgent(String managementUnitId, String agentId, Boolean excludeCapabilities) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId, excludeCapabilities));
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @param excludeCapabilities Excludes all capabilities of the agent such as queues, languages, and skills (optional)
   * @return WfmAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmAgent> getWorkforcemanagementManagementunitAgentWithHttpInfo(String managementUnitId, String agentId, Boolean excludeCapabilities) throws IOException {
    return getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId, excludeCapabilities).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitAgentRequest createGetWorkforcemanagementManagementunitAgentRequest(String managementUnitId, String agentId, Boolean excludeCapabilities) {
    return GetWorkforcemanagementManagementunitAgentRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withAgentId(agentId)
    
            .withExcludeCapabilities(excludeCapabilities)
    
            .build();
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param request The request object
   * @return WfmAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmAgent getWorkforcemanagementManagementunitAgent(GetWorkforcemanagementManagementunitAgentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmAgent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmAgent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmAgent> getWorkforcemanagementManagementunitAgent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmAgent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmAgent> response = (ApiResponse<WfmAgent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmAgent> response = (ApiResponse<WfmAgent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all the shift trades for a given agent
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @return ShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeListResponse getWorkforcemanagementManagementunitAgentShifttrades(String managementUnitId, String agentId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitAgentShifttrades(createGetWorkforcemanagementManagementunitAgentShifttradesRequest(managementUnitId, agentId));
  }

  /**
   * Gets all the shift trades for a given agent
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @return ShiftTradeListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeListResponse> getWorkforcemanagementManagementunitAgentShifttradesWithHttpInfo(String managementUnitId, String agentId) throws IOException {
    return getWorkforcemanagementManagementunitAgentShifttrades(createGetWorkforcemanagementManagementunitAgentShifttradesRequest(managementUnitId, agentId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitAgentShifttradesRequest createGetWorkforcemanagementManagementunitAgentShifttradesRequest(String managementUnitId, String agentId) {
    return GetWorkforcemanagementManagementunitAgentShifttradesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withAgentId(agentId)
    
            .build();
  }

  /**
   * Gets all the shift trades for a given agent
   * 
   * @param request The request object
   * @return ShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeListResponse getWorkforcemanagementManagementunitAgentShifttrades(GetWorkforcemanagementManagementunitAgentShifttradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShiftTradeListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShiftTradeListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the shift trades for a given agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeListResponse> getWorkforcemanagementManagementunitAgentShifttrades(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShiftTradeListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ShiftTradeMatchesSummaryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeMatchesSummaryResponse getWorkforcemanagementManagementunitShifttradesMatched(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitShifttradesMatched(createGetWorkforcemanagementManagementunitShifttradesMatchedRequest(managementUnitId));
  }

  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ShiftTradeMatchesSummaryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeMatchesSummaryResponse> getWorkforcemanagementManagementunitShifttradesMatchedWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitShifttradesMatched(createGetWorkforcemanagementManagementunitShifttradesMatchedRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitShifttradesMatchedRequest createGetWorkforcemanagementManagementunitShifttradesMatchedRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitShifttradesMatchedRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param request The request object
   * @return ShiftTradeMatchesSummaryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeMatchesSummaryResponse getWorkforcemanagementManagementunitShifttradesMatched(GetWorkforcemanagementManagementunitShifttradesMatchedRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShiftTradeMatchesSummaryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShiftTradeMatchesSummaryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a summary of all shift trades in the matched state
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeMatchesSummaryResponse> getWorkforcemanagementManagementunitShifttradesMatched(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShiftTradeMatchesSummaryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeMatchesSummaryResponse> response = (ApiResponse<ShiftTradeMatchesSummaryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeMatchesSummaryResponse> response = (ApiResponse<ShiftTradeMatchesSummaryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitShifttradesUsers(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitShifttradesUsers(createGetWorkforcemanagementManagementunitShifttradesUsersRequest(managementUnitId));
  }

  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitShifttradesUsersWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitShifttradesUsers(createGetWorkforcemanagementManagementunitShifttradesUsersRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitShifttradesUsersRequest createGetWorkforcemanagementManagementunitShifttradesUsersRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitShifttradesUsersRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param request The request object
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitShifttradesUsers(GetWorkforcemanagementManagementunitShifttradesUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets list of users available for whom you can send direct shift trade requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitShifttradesUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit to fetch (required)
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit getWorkforcemanagementManagementunitTimeofflimit(String managementUnitId, String timeOffLimitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitTimeofflimit(createGetWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId));
  }

  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit to fetch (required)
   * @return TimeOffLimit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> getWorkforcemanagementManagementunitTimeofflimitWithHttpInfo(String managementUnitId, String timeOffLimitId) throws IOException {
    return getWorkforcemanagementManagementunitTimeofflimit(createGetWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitTimeofflimitRequest createGetWorkforcemanagementManagementunitTimeofflimitRequest(String managementUnitId, String timeOffLimitId) {
    return GetWorkforcemanagementManagementunitTimeofflimitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffLimitId(timeOffLimitId)
    
            .build();
  }

  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param request The request object
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit getWorkforcemanagementManagementunitTimeofflimit(GetWorkforcemanagementManagementunitTimeofflimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffLimit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a time off limit object
   * Returns properties of time off limit object, but not daily values.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> getWorkforcemanagementManagementunitTimeofflimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffLimit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @return TimeOffLimitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimitListing getWorkforcemanagementManagementunitTimeofflimits(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitTimeofflimits(createGetWorkforcemanagementManagementunitTimeofflimitsRequest(managementUnitId));
  }

  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @return TimeOffLimitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimitListing> getWorkforcemanagementManagementunitTimeofflimitsWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitTimeofflimits(createGetWorkforcemanagementManagementunitTimeofflimitsRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitTimeofflimitsRequest createGetWorkforcemanagementManagementunitTimeofflimitsRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitTimeofflimitsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param request The request object
   * @return TimeOffLimitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimitListing getWorkforcemanagementManagementunitTimeofflimits(GetWorkforcemanagementManagementunitTimeofflimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffLimitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffLimitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of time off limit objects under management unit.
   * Currently only one time off limit object is allowed under management unit, so the list contains either 0 or 1 element.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimitListing> getWorkforcemanagementManagementunitTimeofflimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffLimitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimitListing> response = (ApiResponse<TimeOffLimitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimitListing> response = (ApiResponse<TimeOffLimitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to fetch (required)
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan getWorkforcemanagementManagementunitTimeoffplan(String managementUnitId, String timeOffPlanId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitTimeoffplan(createGetWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId));
  }

  /**
   * Gets a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to fetch (required)
   * @return TimeOffPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> getWorkforcemanagementManagementunitTimeoffplanWithHttpInfo(String managementUnitId, String timeOffPlanId) throws IOException {
    return getWorkforcemanagementManagementunitTimeoffplan(createGetWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitTimeoffplanRequest createGetWorkforcemanagementManagementunitTimeoffplanRequest(String managementUnitId, String timeOffPlanId) {
    return GetWorkforcemanagementManagementunitTimeoffplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffPlanId(timeOffPlanId)
    
            .build();
  }

  /**
   * Gets a time off plan
   * 
   * @param request The request object
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan getWorkforcemanagementManagementunitTimeoffplan(GetWorkforcemanagementManagementunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a time off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> getWorkforcemanagementManagementunitTimeoffplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets a list of time off plans
   * 
   * @param managementUnitId The management unit ID. (required)
   * @return TimeOffPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlanListing getWorkforcemanagementManagementunitTimeoffplans(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitTimeoffplans(createGetWorkforcemanagementManagementunitTimeoffplansRequest(managementUnitId));
  }

  /**
   * Gets a list of time off plans
   * 
   * @param managementUnitId The management unit ID. (required)
   * @return TimeOffPlanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlanListing> getWorkforcemanagementManagementunitTimeoffplansWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitTimeoffplans(createGetWorkforcemanagementManagementunitTimeoffplansRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitTimeoffplansRequest createGetWorkforcemanagementManagementunitTimeoffplansRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitTimeoffplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Gets a list of time off plans
   * 
   * @param request The request object
   * @return TimeOffPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlanListing getWorkforcemanagementManagementunitTimeoffplans(GetWorkforcemanagementManagementunitTimeoffplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffPlanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffPlanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of time off plans
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlanListing> getWorkforcemanagementManagementunitTimeoffplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffPlanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlanListing> response = (ApiResponse<TimeOffPlanListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlanListing> response = (ApiResponse<TimeOffPlanListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementManagementunitUserTimeoffrequest(String managementUnitId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(managementUnitId, userId, timeOffRequestId));
  }

  /**
   * Get a time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String managementUnitId, String userId, String timeOffRequestId) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(managementUnitId, userId, timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(String managementUnitId, String userId, String timeOffRequestId) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withUserId(userId)
    
            .withTimeOffRequestId(timeOffRequestId)
    
            .build();
  }

  /**
   * Get a time off request
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementManagementunitUserTimeoffrequest(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param userId The userId to whom the time off request applies. (required)
   * @param timeOffRequestId The ID of the time off request, which dates and activityCodeId determine limit values to retrieve (required)
   * @return QueryTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryTimeOffLimitValuesResponse getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(String managementUnitId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(createGetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest(managementUnitId, userId, timeOffRequestId));
  }

  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param userId The userId to whom the time off request applies. (required)
   * @param timeOffRequestId The ID of the time off request, which dates and activityCodeId determine limit values to retrieve (required)
   * @return QueryTimeOffLimitValuesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryTimeOffLimitValuesResponse> getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsWithHttpInfo(String managementUnitId, String userId, String timeOffRequestId) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(createGetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest(managementUnitId, userId, timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest(String managementUnitId, String userId, String timeOffRequestId) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withUserId(userId)
    
            .withTimeOffRequestId(timeOffRequestId)
    
            .build();
  }

  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param request The request object
   * @return QueryTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryTimeOffLimitValuesResponse getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(GetWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryTimeOffLimitValuesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryTimeOffLimitValuesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves time off limit, allocated and waitlisted values according to specific time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryTimeOffLimitValuesResponse> getWorkforcemanagementManagementunitUserTimeoffrequestTimeofflimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryTimeOffLimitValuesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of time off requests for a given user
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(String managementUnitId, String userId, Boolean recentlyReviewed) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(managementUnitId, userId, recentlyReviewed));
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(String managementUnitId, String userId, Boolean recentlyReviewed) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(managementUnitId, userId, recentlyReviewed).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(String managementUnitId, String userId, Boolean recentlyReviewed) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withUserId(userId)
    
            .withRecentlyReviewed(recentlyReviewed)
    
            .build();
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param request The request object
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get users in the management unit
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(managementUnitId));
  }

  /**
   * Get users in the management unit
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUsersRequest createGetWorkforcemanagementManagementunitUsersRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitUsersRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Get users in the management unit
   * 
   * @param request The request object
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(GetWorkforcemanagementManagementunitUsersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmUserEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get users in the management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsers(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmUserEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return WeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleResponse getWorkforcemanagementManagementunitWeekSchedule(String managementUnitId, String weekId, String scheduleId, String expand, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekSchedule(createGetWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId, expand, forceDownloadService));
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return WeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleResponse> getWorkforcemanagementManagementunitWeekScheduleWithHttpInfo(String managementUnitId, String weekId, String scheduleId, String expand, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementManagementunitWeekSchedule(createGetWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId, expand, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekScheduleRequest createGetWorkforcemanagementManagementunitWeekScheduleRequest(String managementUnitId, String weekId, String scheduleId, String expand, Boolean forceDownloadService) {
    return GetWorkforcemanagementManagementunitWeekScheduleRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withExpand(expand)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param request The request object
   * @return WeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleResponse getWorkforcemanagementManagementunitWeekSchedule(GetWorkforcemanagementManagementunitWeekScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleResponse> getWorkforcemanagementManagementunitWeekSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleResponse> response = (ApiResponse<WeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleResponse> response = (ApiResponse<WeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param includeOnlyPublished Return only published schedules (optional)
   * @param earliestWeekDate The start date of the earliest week to query in yyyy-MM-dd format (optional)
   * @param latestWeekDate The start date of the latest week to query in yyyy-MM-dd format (optional)
   * @return WeekScheduleListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleListResponse getWorkforcemanagementManagementunitWeekSchedules(String managementUnitId, String weekId, Boolean includeOnlyPublished, String earliestWeekDate, String latestWeekDate) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekSchedules(createGetWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId, includeOnlyPublished, earliestWeekDate, latestWeekDate));
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param includeOnlyPublished Return only published schedules (optional)
   * @param earliestWeekDate The start date of the earliest week to query in yyyy-MM-dd format (optional)
   * @param latestWeekDate The start date of the latest week to query in yyyy-MM-dd format (optional)
   * @return WeekScheduleListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleListResponse> getWorkforcemanagementManagementunitWeekSchedulesWithHttpInfo(String managementUnitId, String weekId, Boolean includeOnlyPublished, String earliestWeekDate, String latestWeekDate) throws IOException {
    return getWorkforcemanagementManagementunitWeekSchedules(createGetWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId, includeOnlyPublished, earliestWeekDate, latestWeekDate).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekSchedulesRequest createGetWorkforcemanagementManagementunitWeekSchedulesRequest(String managementUnitId, String weekId, Boolean includeOnlyPublished, String earliestWeekDate, String latestWeekDate) {
    return GetWorkforcemanagementManagementunitWeekSchedulesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withIncludeOnlyPublished(includeOnlyPublished)
    
            .withEarliestWeekDate(earliestWeekDate)
    
            .withLatestWeekDate(latestWeekDate)
    
            .build();
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param request The request object
   * @return WeekScheduleListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleListResponse getWorkforcemanagementManagementunitWeekSchedules(GetWorkforcemanagementManagementunitWeekSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WeekScheduleListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WeekScheduleListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleListResponse> getWorkforcemanagementManagementunitWeekSchedules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WeekScheduleListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleListResponse> response = (ApiResponse<WeekScheduleListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleListResponse> response = (ApiResponse<WeekScheduleListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all the shift trades for a given week
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param evaluateMatches Whether to evaluate the matches for violations (optional, default to true)
   * @return WeekShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekShiftTradeListResponse getWorkforcemanagementManagementunitWeekShifttrades(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekShifttrades(createGetWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, evaluateMatches));
  }

  /**
   * Gets all the shift trades for a given week
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param evaluateMatches Whether to evaluate the matches for violations (optional, default to true)
   * @return WeekShiftTradeListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekShiftTradeListResponse> getWorkforcemanagementManagementunitWeekShifttradesWithHttpInfo(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches) throws IOException {
    return getWorkforcemanagementManagementunitWeekShifttrades(createGetWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, evaluateMatches).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekShifttradesRequest createGetWorkforcemanagementManagementunitWeekShifttradesRequest(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches) {
    return GetWorkforcemanagementManagementunitWeekShifttradesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withEvaluateMatches(evaluateMatches)
    
            .build();
  }

  /**
   * Gets all the shift trades for a given week
   * 
   * @param request The request object
   * @return WeekShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekShiftTradeListResponse getWorkforcemanagementManagementunitWeekShifttrades(GetWorkforcemanagementManagementunitWeekShifttradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WeekShiftTradeListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WeekShiftTradeListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the shift trades for a given week
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekShiftTradeListResponse> getWorkforcemanagementManagementunitWeekShifttrades(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WeekShiftTradeListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WeekShiftTradeListResponse> response = (ApiResponse<WeekShiftTradeListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WeekShiftTradeListResponse> response = (ApiResponse<WeekShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to fetch (required)
   * @param includeOnly limit response to the specified fields (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan getWorkforcemanagementManagementunitWorkplan(String managementUnitId, String workPlanId, List<String> includeOnly) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplan(createGetWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, includeOnly));
  }

  /**
   * Get a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to fetch (required)
   * @param includeOnly limit response to the specified fields (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> getWorkforcemanagementManagementunitWorkplanWithHttpInfo(String managementUnitId, String workPlanId, List<String> includeOnly) throws IOException {
    return getWorkforcemanagementManagementunitWorkplan(createGetWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, includeOnly).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplanRequest createGetWorkforcemanagementManagementunitWorkplanRequest(String managementUnitId, String workPlanId, List<String> includeOnly) {
    return GetWorkforcemanagementManagementunitWorkplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .withIncludeOnly(includeOnly)
    
            .build();
  }

  /**
   * Get a work plan
   * 
   * @param request The request object
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan getWorkforcemanagementManagementunitWorkplan(GetWorkforcemanagementManagementunitWorkplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a work plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> getWorkforcemanagementManagementunitWorkplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to fetch (required)
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse getWorkforcemanagementManagementunitWorkplanrotation(String managementUnitId, String workPlanRotationId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplanrotation(createGetWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId));
  }

  /**
   * Get a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to fetch (required)
   * @return WorkPlanRotationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> getWorkforcemanagementManagementunitWorkplanrotationWithHttpInfo(String managementUnitId, String workPlanRotationId) throws IOException {
    return getWorkforcemanagementManagementunitWorkplanrotation(createGetWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplanrotationRequest createGetWorkforcemanagementManagementunitWorkplanrotationRequest(String managementUnitId, String workPlanRotationId) {
    return GetWorkforcemanagementManagementunitWorkplanrotationRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanRotationId(workPlanRotationId)
    
            .build();
  }

  /**
   * Get a work plan rotation
   * 
   * @param request The request object
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse getWorkforcemanagementManagementunitWorkplanrotation(GetWorkforcemanagementManagementunitWorkplanrotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanRotationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a work plan rotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> getWorkforcemanagementManagementunitWorkplanrotation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanRotationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get work plan rotations
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanRotationListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationListResponse getWorkforcemanagementManagementunitWorkplanrotations(String managementUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplanrotations(createGetWorkforcemanagementManagementunitWorkplanrotationsRequest(managementUnitId, expand));
  }

  /**
   * Get work plan rotations
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanRotationListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationListResponse> getWorkforcemanagementManagementunitWorkplanrotationsWithHttpInfo(String managementUnitId, List<String> expand) throws IOException {
    return getWorkforcemanagementManagementunitWorkplanrotations(createGetWorkforcemanagementManagementunitWorkplanrotationsRequest(managementUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplanrotationsRequest createGetWorkforcemanagementManagementunitWorkplanrotationsRequest(String managementUnitId, List<String> expand) {
    return GetWorkforcemanagementManagementunitWorkplanrotationsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get work plan rotations
   * 
   * @param request The request object
   * @return WorkPlanRotationListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationListResponse getWorkforcemanagementManagementunitWorkplanrotations(GetWorkforcemanagementManagementunitWorkplanrotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanRotationListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanRotationListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get work plan rotations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationListResponse> getWorkforcemanagementManagementunitWorkplanrotations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanRotationListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationListResponse> response = (ApiResponse<WorkPlanRotationListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationListResponse> response = (ApiResponse<WorkPlanRotationListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanListResponse getWorkforcemanagementManagementunitWorkplans(String managementUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand));
  }

  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanListResponse> getWorkforcemanagementManagementunitWorkplansWithHttpInfo(String managementUnitId, List<String> expand) throws IOException {
    return getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplansRequest createGetWorkforcemanagementManagementunitWorkplansRequest(String managementUnitId, List<String> expand) {
    return GetWorkforcemanagementManagementunitWorkplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param request The request object
   * @return WorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanListResponse getWorkforcemanagementManagementunitWorkplans(GetWorkforcemanagementManagementunitWorkplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get work plans
   * \&quot;expand=details\&quot; is deprecated
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanListResponse> getWorkforcemanagementManagementunitWorkplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanListResponse> response = (ApiResponse<WorkPlanListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanListResponse> response = (ApiResponse<WorkPlanListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get management units
   * 
   * @param pageSize Deprecated, paging is not supported (optional)
   * @param pageNumber Deprecated, paging is not supported (optional)
   * @param expand Deprecated, expand settings on the single MU route (optional)
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunits(Integer pageSize, Integer pageNumber, String expand, String feature, String divisionId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(pageSize, pageNumber, expand, feature, divisionId));
  }

  /**
   * Get management units
   * 
   * @param pageSize Deprecated, paging is not supported (optional)
   * @param pageNumber Deprecated, paging is not supported (optional)
   * @param expand Deprecated, expand settings on the single MU route (optional)
   * @param feature  (optional)
   * @param divisionId  (optional)
   * @return ManagementUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunitsWithHttpInfo(Integer pageSize, Integer pageNumber, String expand, String feature, String divisionId) throws IOException {
    return getWorkforcemanagementManagementunits(createGetWorkforcemanagementManagementunitsRequest(pageSize, pageNumber, expand, feature, divisionId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitsRequest createGetWorkforcemanagementManagementunitsRequest(Integer pageSize, Integer pageNumber, String expand, String feature, String divisionId) {
    return GetWorkforcemanagementManagementunitsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withExpand(expand)
    
            .withFeature(feature)
    
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get management units
   * 
   * @param request The request object
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunits(GetWorkforcemanagementManagementunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get management units
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get management units across divisions
   * 
   * @param divisionId The divisionIds to filter by. If omitted, will return all divisions (optional)
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunitsDivisionviews(List<String> divisionId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitsDivisionviews(createGetWorkforcemanagementManagementunitsDivisionviewsRequest(divisionId));
  }

  /**
   * Get management units across divisions
   * 
   * @param divisionId The divisionIds to filter by. If omitted, will return all divisions (optional)
   * @return ManagementUnitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunitsDivisionviewsWithHttpInfo(List<String> divisionId) throws IOException {
    return getWorkforcemanagementManagementunitsDivisionviews(createGetWorkforcemanagementManagementunitsDivisionviewsRequest(divisionId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitsDivisionviewsRequest createGetWorkforcemanagementManagementunitsDivisionviewsRequest(List<String> divisionId) {
    return GetWorkforcemanagementManagementunitsDivisionviewsRequest.builder()
            .withDivisionId(divisionId)
    
            .build();
  }

  /**
   * Get management units across divisions
   * 
   * @param request The request object
   * @return ManagementUnitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitListing getWorkforcemanagementManagementunitsDivisionviews(GetWorkforcemanagementManagementunitsDivisionviewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get management units across divisions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitListing> getWorkforcemanagementManagementunitsDivisionviews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of notifications for the current user
   * 
   * @return NotificationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NotificationsResponse getWorkforcemanagementNotifications() throws IOException, ApiException {
    return  getWorkforcemanagementNotifications(createGetWorkforcemanagementNotificationsRequest());
  }

  /**
   * Get a list of notifications for the current user
   * 
   * @return NotificationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NotificationsResponse> getWorkforcemanagementNotificationsWithHttpInfo() throws IOException {
    return getWorkforcemanagementNotifications(createGetWorkforcemanagementNotificationsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementNotificationsRequest createGetWorkforcemanagementNotificationsRequest() {
    return GetWorkforcemanagementNotificationsRequest.builder()
            .build();
  }

  /**
   * Get a list of notifications for the current user
   * 
   * @param request The request object
   * @return NotificationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NotificationsResponse getWorkforcemanagementNotifications(GetWorkforcemanagementNotificationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NotificationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NotificationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of notifications for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NotificationsResponse> getWorkforcemanagementNotifications(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NotificationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NotificationsResponse> response = (ApiResponse<NotificationsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<NotificationsResponse> response = (ApiResponse<NotificationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get status of the scheduling job
   * 
   * @param jobId The id of the scheduling job (required)
   * @return SchedulingStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingStatusResponse getWorkforcemanagementSchedulingjob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementSchedulingjob(createGetWorkforcemanagementSchedulingjobRequest(jobId));
  }

  /**
   * Get status of the scheduling job
   * 
   * @param jobId The id of the scheduling job (required)
   * @return SchedulingStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingStatusResponse> getWorkforcemanagementSchedulingjobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementSchedulingjob(createGetWorkforcemanagementSchedulingjobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementSchedulingjobRequest createGetWorkforcemanagementSchedulingjobRequest(String jobId) {
    return GetWorkforcemanagementSchedulingjobRequest.builder()
            .withJobId(jobId)
    
            .build();
  }

  /**
   * Get status of the scheduling job
   * 
   * @param request The request object
   * @return SchedulingStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingStatusResponse getWorkforcemanagementSchedulingjob(GetWorkforcemanagementSchedulingjobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchedulingStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchedulingStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status of the scheduling job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingStatusResponse> getWorkforcemanagementSchedulingjob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchedulingStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingStatusResponse> response = (ApiResponse<SchedulingStatusResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingStatusResponse> response = (ApiResponse<SchedulingStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets all of my shift trades
   * 
   * @return ShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeListResponse getWorkforcemanagementShifttrades() throws IOException, ApiException {
    return  getWorkforcemanagementShifttrades(createGetWorkforcemanagementShifttradesRequest());
  }

  /**
   * Gets all of my shift trades
   * 
   * @return ShiftTradeListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeListResponse> getWorkforcemanagementShifttradesWithHttpInfo() throws IOException {
    return getWorkforcemanagementShifttrades(createGetWorkforcemanagementShifttradesRequest().withHttpInfo());
  }

  private GetWorkforcemanagementShifttradesRequest createGetWorkforcemanagementShifttradesRequest() {
    return GetWorkforcemanagementShifttradesRequest.builder()
            .build();
  }

  /**
   * Gets all of my shift trades
   * 
   * @param request The request object
   * @return ShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeListResponse getWorkforcemanagementShifttrades(GetWorkforcemanagementShifttradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShiftTradeListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShiftTradeListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all of my shift trades
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeListResponse> getWorkforcemanagementShifttrades(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShiftTradeListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeListResponse> response = (ApiResponse<ShiftTradeListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementTimeoffrequest(String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequest(createGetWorkforcemanagementTimeoffrequestRequest(timeOffRequestId));
  }

  /**
   * Get a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId) throws IOException {
    return getWorkforcemanagementTimeoffrequest(createGetWorkforcemanagementTimeoffrequestRequest(timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestRequest createGetWorkforcemanagementTimeoffrequestRequest(String timeOffRequestId) {
    return GetWorkforcemanagementTimeoffrequestRequest.builder()
            .withTimeOffRequestId(timeOffRequestId)
    
            .build();
  }

  /**
   * Get a time off request for the current user
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementTimeoffrequest(GetWorkforcemanagementTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a time off request for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementTimeoffrequest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return WaitlistPositionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WaitlistPositionListing getWorkforcemanagementTimeoffrequestWaitlistpositions(String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequestWaitlistpositions(createGetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest(timeOffRequestId));
  }

  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @return WaitlistPositionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WaitlistPositionListing> getWorkforcemanagementTimeoffrequestWaitlistpositionsWithHttpInfo(String timeOffRequestId) throws IOException {
    return getWorkforcemanagementTimeoffrequestWaitlistpositions(createGetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest(timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest createGetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest(String timeOffRequestId) {
    return GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest.builder()
            .withTimeOffRequestId(timeOffRequestId)
    
            .build();
  }

  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param request The request object
   * @return WaitlistPositionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WaitlistPositionListing getWorkforcemanagementTimeoffrequestWaitlistpositions(GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WaitlistPositionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WaitlistPositionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the daily waitlist positions of a time off request for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WaitlistPositionListing> getWorkforcemanagementTimeoffrequestWaitlistpositions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WaitlistPositionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(Boolean recentlyReviewed) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest(recentlyReviewed));
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsWithHttpInfo(Boolean recentlyReviewed) throws IOException {
    return getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest(recentlyReviewed).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestsRequest createGetWorkforcemanagementTimeoffrequestsRequest(Boolean recentlyReviewed) {
    return GetWorkforcemanagementTimeoffrequestsRequest.builder()
            .withRecentlyReviewed(recentlyReviewed)
    
            .build();
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param request The request object
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests(GetWorkforcemanagementTimeoffrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequests(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update business unit
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param body body (optional)
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit patchWorkforcemanagementBusinessunit(String businessUnitId, UpdateBusinessUnitRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunit(createPatchWorkforcemanagementBusinessunitRequest(businessUnitId, body));
  }

  /**
   * Update business unit
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param body body (optional)
   * @return BusinessUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> patchWorkforcemanagementBusinessunitWithHttpInfo(String businessUnitId, UpdateBusinessUnitRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunit(createPatchWorkforcemanagementBusinessunitRequest(businessUnitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitRequest createPatchWorkforcemanagementBusinessunitRequest(String businessUnitId, UpdateBusinessUnitRequest body) {
    return PatchWorkforcemanagementBusinessunitRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update business unit
   * 
   * @param request The request object
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit patchWorkforcemanagementBusinessunit(PatchWorkforcemanagementBusinessunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> patchWorkforcemanagementBusinessunit(ApiRequest<UpdateBusinessUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to update (required)
   * @param body body (optional)
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode patchWorkforcemanagementBusinessunitActivitycode(String businessUnitId, String activityCodeId, UpdateActivityCodeRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitActivitycode(createPatchWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId, body));
  }

  /**
   * Update an activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to update (required)
   * @param body body (optional)
   * @return BusinessUnitActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> patchWorkforcemanagementBusinessunitActivitycodeWithHttpInfo(String businessUnitId, String activityCodeId, UpdateActivityCodeRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitActivitycode(createPatchWorkforcemanagementBusinessunitActivitycodeRequest(businessUnitId, activityCodeId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitActivitycodeRequest createPatchWorkforcemanagementBusinessunitActivitycodeRequest(String businessUnitId, String activityCodeId, UpdateActivityCodeRequest body) {
    return PatchWorkforcemanagementBusinessunitActivitycodeRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withActivityCodeId(activityCodeId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an activity code
   * 
   * @param request The request object
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode patchWorkforcemanagementBusinessunitActivitycode(PatchWorkforcemanagementBusinessunitActivitycodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an activity code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> patchWorkforcemanagementBusinessunitActivitycode(ApiRequest<UpdateActivityCodeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates the planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to update (required)
   * @param body body (optional)
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup patchWorkforcemanagementBusinessunitPlanninggroup(String businessUnitId, String planningGroupId, UpdatePlanningGroupRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitPlanninggroup(createPatchWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId, body));
  }

  /**
   * Updates the planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to update (required)
   * @param body body (optional)
   * @return PlanningGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> patchWorkforcemanagementBusinessunitPlanninggroupWithHttpInfo(String businessUnitId, String planningGroupId, UpdatePlanningGroupRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitPlanninggroup(createPatchWorkforcemanagementBusinessunitPlanninggroupRequest(businessUnitId, planningGroupId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitPlanninggroupRequest createPatchWorkforcemanagementBusinessunitPlanninggroupRequest(String businessUnitId, String planningGroupId, UpdatePlanningGroupRequest body) {
    return PatchWorkforcemanagementBusinessunitPlanninggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withPlanningGroupId(planningGroupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates the planning group
   * 
   * @param request The request object
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup patchWorkforcemanagementBusinessunitPlanninggroup(PatchWorkforcemanagementBusinessunitPlanninggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PlanningGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PlanningGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the planning group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> patchWorkforcemanagementBusinessunitPlanninggroup(ApiRequest<UpdatePlanningGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PlanningGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Mark a schedule run as applied
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @param body body (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementBusinessunitSchedulingRun(String businessUnitId, String runId, PatchBuScheduleRunRequest body) throws IOException, ApiException {
     patchWorkforcemanagementBusinessunitSchedulingRun(createPatchWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId, body));
  }

  /**
   * Mark a schedule run as applied
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param runId The ID of the schedule run (required)
   * @param body body (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementBusinessunitSchedulingRunWithHttpInfo(String businessUnitId, String runId, PatchBuScheduleRunRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitSchedulingRun(createPatchWorkforcemanagementBusinessunitSchedulingRunRequest(businessUnitId, runId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitSchedulingRunRequest createPatchWorkforcemanagementBusinessunitSchedulingRunRequest(String businessUnitId, String runId, PatchBuScheduleRunRequest body) {
    return PatchWorkforcemanagementBusinessunitSchedulingRunRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withRunId(runId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Mark a schedule run as applied
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementBusinessunitSchedulingRun(PatchWorkforcemanagementBusinessunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Mark a schedule run as applied
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementBusinessunitSchedulingRun(ApiRequest<PatchBuScheduleRunRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of a service goal template to update (required)
   * @param body body (optional)
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate patchWorkforcemanagementBusinessunitServicegoaltemplate(String businessUnitId, String serviceGoalTemplateId, UpdateServiceGoalTemplate body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitServicegoaltemplate(createPatchWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId, body));
  }

  /**
   * Updates a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of a service goal template to update (required)
   * @param body body (optional)
   * @return ServiceGoalTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> patchWorkforcemanagementBusinessunitServicegoaltemplateWithHttpInfo(String businessUnitId, String serviceGoalTemplateId, UpdateServiceGoalTemplate body) throws IOException {
    return patchWorkforcemanagementBusinessunitServicegoaltemplate(createPatchWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest createPatchWorkforcemanagementBusinessunitServicegoaltemplateRequest(String businessUnitId, String serviceGoalTemplateId, UpdateServiceGoalTemplate body) {
    return PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withServiceGoalTemplateId(serviceGoalTemplateId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates a service goal template
   * 
   * @param request The request object
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate patchWorkforcemanagementBusinessunitServicegoaltemplate(PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a service goal template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> patchWorkforcemanagementBusinessunitServicegoaltemplate(ApiRequest<UpdateServiceGoalTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update the requested management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit patchWorkforcemanagementManagementunit(String managementUnitId, UpdateManagementUnitRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunit(createPatchWorkforcemanagementManagementunitRequest(managementUnitId, body));
  }

  /**
   * Update the requested management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ManagementUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> patchWorkforcemanagementManagementunitWithHttpInfo(String managementUnitId, UpdateManagementUnitRequest body) throws IOException {
    return patchWorkforcemanagementManagementunit(createPatchWorkforcemanagementManagementunitRequest(managementUnitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitRequest createPatchWorkforcemanagementManagementunitRequest(String managementUnitId, UpdateManagementUnitRequest body) {
    return PatchWorkforcemanagementManagementunitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update the requested management unit
   * 
   * @param request The request object
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit patchWorkforcemanagementManagementunit(PatchWorkforcemanagementManagementunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the requested management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> patchWorkforcemanagementManagementunit(ApiRequest<UpdateManagementUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The id of time off limit object to update (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit patchWorkforcemanagementManagementunitTimeofflimit(String managementUnitId, String timeOffLimitId, UpdateTimeOffLimitRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitTimeofflimit(createPatchWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId, body));
  }

  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The id of time off limit object to update (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> patchWorkforcemanagementManagementunitTimeofflimitWithHttpInfo(String managementUnitId, String timeOffLimitId, UpdateTimeOffLimitRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitTimeofflimit(createPatchWorkforcemanagementManagementunitTimeofflimitRequest(managementUnitId, timeOffLimitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitTimeofflimitRequest createPatchWorkforcemanagementManagementunitTimeofflimitRequest(String managementUnitId, String timeOffLimitId, UpdateTimeOffLimitRequest body) {
    return PatchWorkforcemanagementManagementunitTimeofflimitRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffLimitId(timeOffLimitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param request The request object
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit patchWorkforcemanagementManagementunitTimeofflimit(PatchWorkforcemanagementManagementunitTimeofflimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffLimit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> patchWorkforcemanagementManagementunitTimeofflimit(ApiRequest<UpdateTimeOffLimitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffLimit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to update (required)
   * @param body body (optional)
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan patchWorkforcemanagementManagementunitTimeoffplan(String managementUnitId, String timeOffPlanId, UpdateTimeOffPlanRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitTimeoffplan(createPatchWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId, body));
  }

  /**
   * Updates a time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param timeOffPlanId The ID of the time off plan to update (required)
   * @param body body (optional)
   * @return TimeOffPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> patchWorkforcemanagementManagementunitTimeoffplanWithHttpInfo(String managementUnitId, String timeOffPlanId, UpdateTimeOffPlanRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitTimeoffplan(createPatchWorkforcemanagementManagementunitTimeoffplanRequest(managementUnitId, timeOffPlanId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitTimeoffplanRequest createPatchWorkforcemanagementManagementunitTimeoffplanRequest(String managementUnitId, String timeOffPlanId, UpdateTimeOffPlanRequest body) {
    return PatchWorkforcemanagementManagementunitTimeoffplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffPlanId(timeOffPlanId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Updates a time off plan
   * 
   * @param request The request object
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan patchWorkforcemanagementManagementunitTimeoffplan(PatchWorkforcemanagementManagementunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a time off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> patchWorkforcemanagementManagementunitTimeoffplan(ApiRequest<UpdateTimeOffPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementManagementunitUserTimeoffrequest(String managementUnitId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(managementUnitId, userId, timeOffRequestId, body));
  }

  /**
   * Update a time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String managementUnitId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException {
    return patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(managementUnitId, userId, timeOffRequestId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(String managementUnitId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) {
    return PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withUserId(userId)
    
            .withTimeOffRequestId(timeOffRequestId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a time off request
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementManagementunitUserTimeoffrequest(PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequest(ApiRequest<AdminTimeOffRequestPatch> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @return ShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeResponse patchWorkforcemanagementManagementunitWeekShifttrade(String managementUnitId, LocalDate weekDateId, PatchShiftTradeRequest body, String tradeId) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWeekShifttrade(createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(managementUnitId, weekDateId, body, tradeId));
  }

  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @return ShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeResponse> patchWorkforcemanagementManagementunitWeekShifttradeWithHttpInfo(String managementUnitId, LocalDate weekDateId, PatchShiftTradeRequest body, String tradeId) throws IOException {
    return patchWorkforcemanagementManagementunitWeekShifttrade(createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(managementUnitId, weekDateId, body, tradeId).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWeekShifttradeRequest createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(String managementUnitId, LocalDate weekDateId, PatchShiftTradeRequest body, String tradeId) {
    return PatchWorkforcemanagementManagementunitWeekShifttradeRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withTradeId(tradeId)
    
            .build();
  }

  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param request The request object
   * @return ShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeResponse patchWorkforcemanagementManagementunitWeekShifttrade(PatchWorkforcemanagementManagementunitWeekShifttradeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeResponse> patchWorkforcemanagementManagementunitWeekShifttrade(ApiRequest<PatchShiftTradeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (optional)
   * @param validationMode Allows to update work plan even if validation result is invalid (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan patchWorkforcemanagementManagementunitWorkplan(String managementUnitId, String workPlanId, WorkPlan body, String validationMode) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWorkplan(createPatchWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, body, validationMode));
  }

  /**
   * Update a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (optional)
   * @param validationMode Allows to update work plan even if validation result is invalid (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> patchWorkforcemanagementManagementunitWorkplanWithHttpInfo(String managementUnitId, String workPlanId, WorkPlan body, String validationMode) throws IOException {
    return patchWorkforcemanagementManagementunitWorkplan(createPatchWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, body, validationMode).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWorkplanRequest createPatchWorkforcemanagementManagementunitWorkplanRequest(String managementUnitId, String workPlanId, WorkPlan body, String validationMode) {
    return PatchWorkforcemanagementManagementunitWorkplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .withBody(body)
    
            .withValidationMode(validationMode)
    
            .build();
  }

  /**
   * Update a work plan
   * 
   * @param request The request object
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan patchWorkforcemanagementManagementunitWorkplan(PatchWorkforcemanagementManagementunitWorkplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a work plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> patchWorkforcemanagementManagementunitWorkplan(ApiRequest<WorkPlan> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to update (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse patchWorkforcemanagementManagementunitWorkplanrotation(String managementUnitId, String workPlanRotationId, UpdateWorkPlanRotationRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWorkplanrotation(createPatchWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId, body));
  }

  /**
   * Update a work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to update (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> patchWorkforcemanagementManagementunitWorkplanrotationWithHttpInfo(String managementUnitId, String workPlanRotationId, UpdateWorkPlanRotationRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitWorkplanrotation(createPatchWorkforcemanagementManagementunitWorkplanrotationRequest(managementUnitId, workPlanRotationId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWorkplanrotationRequest createPatchWorkforcemanagementManagementunitWorkplanrotationRequest(String managementUnitId, String workPlanRotationId, UpdateWorkPlanRotationRequest body) {
    return PatchWorkforcemanagementManagementunitWorkplanrotationRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanRotationId(workPlanRotationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a work plan rotation
   * 
   * @param request The request object
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse patchWorkforcemanagementManagementunitWorkplanrotation(PatchWorkforcemanagementManagementunitWorkplanrotationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanRotationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a work plan rotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> patchWorkforcemanagementManagementunitWorkplanrotation(ApiRequest<UpdateWorkPlanRotationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanRotationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementTimeoffrequest(String timeOffRequestId, AgentTimeOffRequestPatch body) throws IOException, ApiException {
    return  patchWorkforcemanagementTimeoffrequest(createPatchWorkforcemanagementTimeoffrequestRequest(timeOffRequestId, body));
  }

  /**
   * Update a time off request for the current user
   * 
   * @param timeOffRequestId Time Off Request Id (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementTimeoffrequestWithHttpInfo(String timeOffRequestId, AgentTimeOffRequestPatch body) throws IOException {
    return patchWorkforcemanagementTimeoffrequest(createPatchWorkforcemanagementTimeoffrequestRequest(timeOffRequestId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementTimeoffrequestRequest createPatchWorkforcemanagementTimeoffrequestRequest(String timeOffRequestId, AgentTimeOffRequestPatch body) {
    return PatchWorkforcemanagementTimeoffrequestRequest.builder()
            .withTimeOffRequestId(timeOffRequestId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a time off request for the current user
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementTimeoffrequest(PatchWorkforcemanagementTimeoffrequestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a time off request for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementTimeoffrequest(ApiRequest<AgentTimeOffRequestPatch> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Request a historical adherence report for users across management units
   * 
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementAdherenceHistorical(WfmHistoricalAdherenceQueryForUsers body) throws IOException, ApiException {
    return  postWorkforcemanagementAdherenceHistorical(createPostWorkforcemanagementAdherenceHistoricalRequest(body));
  }

  /**
   * Request a historical adherence report for users across management units
   * 
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementAdherenceHistoricalWithHttpInfo(WfmHistoricalAdherenceQueryForUsers body) throws IOException {
    return postWorkforcemanagementAdherenceHistorical(createPostWorkforcemanagementAdherenceHistoricalRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAdherenceHistoricalRequest createPostWorkforcemanagementAdherenceHistoricalRequest(WfmHistoricalAdherenceQueryForUsers body) {
    return PostWorkforcemanagementAdherenceHistoricalRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Request a historical adherence report for users across management units
   * 
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementAdherenceHistorical(PostWorkforcemanagementAdherenceHistoricalRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalAdherenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical adherence report for users across management units
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementAdherenceHistorical(ApiRequest<WfmHistoricalAdherenceQueryForUsers> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalAdherenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get published schedule for the current user
   * 
   * @param body body (optional)
   * @return BuCurrentAgentScheduleSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuCurrentAgentScheduleSearchResponse postWorkforcemanagementAgentschedulesMine(BuGetCurrentAgentScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAgentschedulesMine(createPostWorkforcemanagementAgentschedulesMineRequest(body));
  }

  /**
   * Get published schedule for the current user
   * 
   * @param body body (optional)
   * @return BuCurrentAgentScheduleSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuCurrentAgentScheduleSearchResponse> postWorkforcemanagementAgentschedulesMineWithHttpInfo(BuGetCurrentAgentScheduleRequest body) throws IOException {
    return postWorkforcemanagementAgentschedulesMine(createPostWorkforcemanagementAgentschedulesMineRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAgentschedulesMineRequest createPostWorkforcemanagementAgentschedulesMineRequest(BuGetCurrentAgentScheduleRequest body) {
    return PostWorkforcemanagementAgentschedulesMineRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request The request object
   * @return BuCurrentAgentScheduleSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuCurrentAgentScheduleSearchResponse postWorkforcemanagementAgentschedulesMine(PostWorkforcemanagementAgentschedulesMineRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuCurrentAgentScheduleSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuCurrentAgentScheduleSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuCurrentAgentScheduleSearchResponse> postWorkforcemanagementAgentschedulesMine(ApiRequest<BuGetCurrentAgentScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuCurrentAgentScheduleSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuCurrentAgentScheduleSearchResponse> response = (ApiResponse<BuCurrentAgentScheduleSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuCurrentAgentScheduleSearchResponse> response = (ApiResponse<BuCurrentAgentScheduleSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param body body (optional)
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode postWorkforcemanagementBusinessunitActivitycodes(String businessUnitId, CreateActivityCodeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitActivitycodes(createPostWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId, body));
  }

  /**
   * Create a new activity code
   * 
   * @param businessUnitId The ID of the business unit, or &#39;mine&#39; for the business unit of the logged-in user. (required)
   * @param body body (optional)
   * @return BusinessUnitActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> postWorkforcemanagementBusinessunitActivitycodesWithHttpInfo(String businessUnitId, CreateActivityCodeRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitActivitycodes(createPostWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitActivitycodesRequest createPostWorkforcemanagementBusinessunitActivitycodesRequest(String businessUnitId, CreateActivityCodeRequest body) {
    return PostWorkforcemanagementBusinessunitActivitycodesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new activity code
   * 
   * @param request The request object
   * @return BusinessUnitActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCode postWorkforcemanagementBusinessunitActivitycodes(PostWorkforcemanagementBusinessunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitActivityCode>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new activity code
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCode> postWorkforcemanagementBusinessunitActivitycodes(ApiRequest<CreateActivityCodeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitActivityCode> response = (ApiResponse<BusinessUnitActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search published schedules
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (optional)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesSearchResponse postWorkforcemanagementBusinessunitAgentschedulesSearch(String businessUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitAgentschedulesSearch(createPostWorkforcemanagementBusinessunitAgentschedulesSearchRequest(businessUnitId, body, forceAsync, forceDownloadService));
  }

  /**
   * Search published schedules
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (optional)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementBusinessunitAgentschedulesSearchWithHttpInfo(String businessUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementBusinessunitAgentschedulesSearch(createPostWorkforcemanagementBusinessunitAgentschedulesSearchRequest(businessUnitId, body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest createPostWorkforcemanagementBusinessunitAgentschedulesSearchRequest(String businessUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Search published schedules
   * 
   * @param request The request object
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesSearchResponse postWorkforcemanagementBusinessunitAgentschedulesSearch(PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search published schedules
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementBusinessunitAgentschedulesSearch(ApiRequest<BuSearchAgentSchedulesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param businessUnitId The business unit ID of the business unit (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncIntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncIntradayResponse postWorkforcemanagementBusinessunitIntraday(String businessUnitId, Boolean forceAsync, IntradayPlanningGroupRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitIntraday(createPostWorkforcemanagementBusinessunitIntradayRequest(businessUnitId, forceAsync, body));
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param businessUnitId The business unit ID of the business unit (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncIntradayResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncIntradayResponse> postWorkforcemanagementBusinessunitIntradayWithHttpInfo(String businessUnitId, Boolean forceAsync, IntradayPlanningGroupRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitIntraday(createPostWorkforcemanagementBusinessunitIntradayRequest(businessUnitId, forceAsync, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitIntradayRequest createPostWorkforcemanagementBusinessunitIntradayRequest(String businessUnitId, Boolean forceAsync, IntradayPlanningGroupRequest body) {
    return PostWorkforcemanagementBusinessunitIntradayRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withForceAsync(forceAsync)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param request The request object
   * @return AsyncIntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncIntradayResponse postWorkforcemanagementBusinessunitIntraday(PostWorkforcemanagementBusinessunitIntradayRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncIntradayResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncIntradayResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncIntradayResponse> postWorkforcemanagementBusinessunitIntraday(ApiRequest<IntradayPlanningGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncIntradayResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncIntradayResponse> response = (ApiResponse<AsyncIntradayResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncIntradayResponse> response = (ApiResponse<AsyncIntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Adds a new planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param body body (optional)
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup postWorkforcemanagementBusinessunitPlanninggroups(String businessUnitId, CreatePlanningGroupRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitPlanninggroups(createPostWorkforcemanagementBusinessunitPlanninggroupsRequest(businessUnitId, body));
  }

  /**
   * Adds a new planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param body body (optional)
   * @return PlanningGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> postWorkforcemanagementBusinessunitPlanninggroupsWithHttpInfo(String businessUnitId, CreatePlanningGroupRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitPlanninggroups(createPostWorkforcemanagementBusinessunitPlanninggroupsRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitPlanninggroupsRequest createPostWorkforcemanagementBusinessunitPlanninggroupsRequest(String businessUnitId, CreatePlanningGroupRequest body) {
    return PostWorkforcemanagementBusinessunitPlanninggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Adds a new planning group
   * 
   * @param request The request object
   * @return PlanningGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PlanningGroup postWorkforcemanagementBusinessunitPlanninggroups(PostWorkforcemanagementBusinessunitPlanninggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PlanningGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PlanningGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Adds a new planning group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PlanningGroup> postWorkforcemanagementBusinessunitPlanninggroups(ApiRequest<CreatePlanningGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PlanningGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PlanningGroup> response = (ApiResponse<PlanningGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Adds a new service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param body body (optional)
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate postWorkforcemanagementBusinessunitServicegoaltemplates(String businessUnitId, CreateServiceGoalTemplate body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitServicegoaltemplates(createPostWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId, body));
  }

  /**
   * Adds a new service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param body body (optional)
   * @return ServiceGoalTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> postWorkforcemanagementBusinessunitServicegoaltemplatesWithHttpInfo(String businessUnitId, CreateServiceGoalTemplate body) throws IOException {
    return postWorkforcemanagementBusinessunitServicegoaltemplates(createPostWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest createPostWorkforcemanagementBusinessunitServicegoaltemplatesRequest(String businessUnitId, CreateServiceGoalTemplate body) {
    return PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Adds a new service goal template
   * 
   * @param request The request object
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate postWorkforcemanagementBusinessunitServicegoaltemplates(PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Adds a new service goal template
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> postWorkforcemanagementBusinessunitServicegoaltemplates(ApiRequest<CreateServiceGoalTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalTemplate> response = (ApiResponse<ServiceGoalTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesQueryResponse postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(String businessUnitId, LocalDate weekId, String scheduleId, BuQueryAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(createPostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest(businessUnitId, weekId, scheduleId, body, forceAsync, forceDownloadService));
  }

  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesQueryResponse> postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, BuQueryAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(createPostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest(businessUnitId, weekId, scheduleId, body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest createPostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest(String businessUnitId, LocalDate weekId, String scheduleId, BuQueryAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param request The request object
   * @return BuAsyncAgentSchedulesQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesQueryResponse postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncAgentSchedulesQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Loads agent schedule data from the schedule. Used in combination with the metadata route
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesQueryResponse> postWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQuery(ApiRequest<BuQueryAgentSchedulesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncAgentSchedulesQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesQueryResponse> response = (ApiResponse<BuAsyncAgentSchedulesQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesQueryResponse> response = (ApiResponse<BuAsyncAgentSchedulesQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Copy a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule to copy (required)
   * @param body body (required)
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse postWorkforcemanagementBusinessunitWeekScheduleCopy(String businessUnitId, LocalDate weekId, String scheduleId, BuCopyScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekScheduleCopy(createPostWorkforcemanagementBusinessunitWeekScheduleCopyRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Copy a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule to copy (required)
   * @param body body (required)
   * @return BuAsyncScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> postWorkforcemanagementBusinessunitWeekScheduleCopyWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, BuCopyScheduleRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekScheduleCopy(createPostWorkforcemanagementBusinessunitWeekScheduleCopyRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest createPostWorkforcemanagementBusinessunitWeekScheduleCopyRequest(String businessUnitId, LocalDate weekId, String scheduleId, BuCopyScheduleRequest body) {
    return PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Copy a schedule
   * 
   * @param request The request object
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse postWorkforcemanagementBusinessunitWeekScheduleCopy(PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> postWorkforcemanagementBusinessunitWeekScheduleCopy(ApiRequest<BuCopyScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleResponse> response = (ApiResponse<BuAsyncScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Start a rescheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return BuAsyncScheduleRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleRunResponse postWorkforcemanagementBusinessunitWeekScheduleReschedule(String businessUnitId, LocalDate weekId, String scheduleId, BuRescheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekScheduleReschedule(createPostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Start a rescheduling run
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return BuAsyncScheduleRunResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekScheduleRescheduleWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, BuRescheduleRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekScheduleReschedule(createPostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest createPostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest(String businessUnitId, LocalDate weekId, String scheduleId, BuRescheduleRequest body) {
    return PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Start a rescheduling run
   * 
   * @param request The request object
   * @return BuAsyncScheduleRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleRunResponse postWorkforcemanagementBusinessunitWeekScheduleReschedule(PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncScheduleRunResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncScheduleRunResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a rescheduling run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekScheduleReschedule(ApiRequest<BuRescheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncScheduleRunResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a blank schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return BuScheduleMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleMetadata postWorkforcemanagementBusinessunitWeekSchedules(String businessUnitId, LocalDate weekId, BuCreateBlankScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedules(createPostWorkforcemanagementBusinessunitWeekSchedulesRequest(businessUnitId, weekId, body));
  }

  /**
   * Create a blank schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return BuScheduleMetadata
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleMetadata> postWorkforcemanagementBusinessunitWeekSchedulesWithHttpInfo(String businessUnitId, LocalDate weekId, BuCreateBlankScheduleRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedules(createPostWorkforcemanagementBusinessunitWeekSchedulesRequest(businessUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulesRequest createPostWorkforcemanagementBusinessunitWeekSchedulesRequest(String businessUnitId, LocalDate weekId, BuCreateBlankScheduleRequest body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulesRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a blank schedule
   * 
   * @param request The request object
   * @return BuScheduleMetadata
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuScheduleMetadata postWorkforcemanagementBusinessunitWeekSchedules(PostWorkforcemanagementBusinessunitWeekSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuScheduleMetadata> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuScheduleMetadata>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a blank schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuScheduleMetadata> postWorkforcemanagementBusinessunitWeekSchedules(ApiRequest<BuCreateBlankScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuScheduleMetadata>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuScheduleMetadata> response = (ApiResponse<BuScheduleMetadata>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Generate a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return BuAsyncScheduleRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleRunResponse postWorkforcemanagementBusinessunitWeekSchedulesGenerate(String businessUnitId, LocalDate weekId, BuGenerateScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedulesGenerate(createPostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest(businessUnitId, weekId, body));
  }

  /**
   * Generate a schedule
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return BuAsyncScheduleRunResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekSchedulesGenerateWithHttpInfo(String businessUnitId, LocalDate weekId, BuGenerateScheduleRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedulesGenerate(createPostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest(businessUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest createPostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest(String businessUnitId, LocalDate weekId, BuGenerateScheduleRequest body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekId(weekId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Generate a schedule
   * 
   * @param request The request object
   * @return BuAsyncScheduleRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleRunResponse postWorkforcemanagementBusinessunitWeekSchedulesGenerate(PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncScheduleRunResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncScheduleRunResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate a schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleRunResponse> postWorkforcemanagementBusinessunitWeekSchedulesGenerate(ApiRequest<BuGenerateScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncScheduleRunResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncScheduleRunResponse> response = (ApiResponse<BuAsyncScheduleRunResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Copy a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast to copy (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncForecastOperationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncForecastOperationResult postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(String businessUnitId, LocalDate weekDateId, String forecastId, CopyBuForecastRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(createPostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest(businessUnitId, weekDateId, forecastId, body, forceAsync));
  }

  /**
   * Copy a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast to copy (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncForecastOperationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastCopyWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId, CopyBuForecastRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(createPostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest(businessUnitId, weekDateId, forecastId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest createPostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest(String businessUnitId, LocalDate weekDateId, String forecastId, CopyBuForecastRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .build();
  }

  /**
   * Copy a short term forecast
   * 
   * @param request The request object
   * @return AsyncForecastOperationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncForecastOperationResult postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncForecastOperationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncForecastOperationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a short term forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastCopy(ApiRequest<CopyBuForecastRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncForecastOperationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Generate a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body  (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncForecastOperationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncForecastOperationResult postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(String businessUnitId, LocalDate weekDateId, GenerateBuForecastRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest(businessUnitId, weekDateId, body, forceAsync));
  }

  /**
   * Generate a short term forecast
   * 
   * @param businessUnitId The business unit ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body  (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncForecastOperationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateWithHttpInfo(String businessUnitId, LocalDate weekDateId, GenerateBuForecastRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest(businessUnitId, weekDateId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest createPostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest(String businessUnitId, LocalDate weekDateId, GenerateBuForecastRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest.builder()
            .withBusinessUnitId(businessUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .build();
  }

  /**
   * Generate a short term forecast
   * 
   * @param request The request object
   * @return AsyncForecastOperationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncForecastOperationResult postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncForecastOperationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncForecastOperationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate a short term forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncForecastOperationResult> postWorkforcemanagementBusinessunitWeekShorttermforecastsGenerate(ApiRequest<GenerateBuForecastRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncForecastOperationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncForecastOperationResult> response = (ApiResponse<AsyncForecastOperationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param body body (optional)
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit postWorkforcemanagementBusinessunits(CreateBusinessUnitRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunits(createPostWorkforcemanagementBusinessunitsRequest(body));
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param body body (optional)
   * @return BusinessUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> postWorkforcemanagementBusinessunitsWithHttpInfo(CreateBusinessUnitRequest body) throws IOException {
    return postWorkforcemanagementBusinessunits(createPostWorkforcemanagementBusinessunitsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitsRequest createPostWorkforcemanagementBusinessunitsRequest(CreateBusinessUnitRequest body) {
    return PostWorkforcemanagementBusinessunitsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param request The request object
   * @return BusinessUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnit postWorkforcemanagementBusinessunits(PostWorkforcemanagementBusinessunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnit> postWorkforcemanagementBusinessunits(ApiRequest<CreateBusinessUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnit> response = (ApiResponse<BusinessUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param language A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize default activity code names in the ics-formatted calendar (optional, default to en-US)
   * @return CalendarUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalendarUrlResponse postWorkforcemanagementCalendarUrlIcs(String language) throws IOException, ApiException {
    return  postWorkforcemanagementCalendarUrlIcs(createPostWorkforcemanagementCalendarUrlIcsRequest(language));
  }

  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param language A language tag (which is sometimes referred to as a \&quot;locale identifier\&quot;) to use to localize default activity code names in the ics-formatted calendar (optional, default to en-US)
   * @return CalendarUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalendarUrlResponse> postWorkforcemanagementCalendarUrlIcsWithHttpInfo(String language) throws IOException {
    return postWorkforcemanagementCalendarUrlIcs(createPostWorkforcemanagementCalendarUrlIcsRequest(language).withHttpInfo());
  }

  private PostWorkforcemanagementCalendarUrlIcsRequest createPostWorkforcemanagementCalendarUrlIcsRequest(String language) {
    return PostWorkforcemanagementCalendarUrlIcsRequest.builder()
            .withLanguage(language)
    
            .build();
  }

  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param request The request object
   * @return CalendarUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalendarUrlResponse postWorkforcemanagementCalendarUrlIcs(PostWorkforcemanagementCalendarUrlIcsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CalendarUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CalendarUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalendarUrlResponse> postWorkforcemanagementCalendarUrlIcs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CalendarUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CalendarUrlResponse> response = (ApiResponse<CalendarUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @return HistoricalImportDeleteJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteJobResponse postWorkforcemanagementHistoricaldataDeletejob() throws IOException, ApiException {
    return  postWorkforcemanagementHistoricaldataDeletejob(createPostWorkforcemanagementHistoricaldataDeletejobRequest());
  }

  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @return HistoricalImportDeleteJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteJobResponse> postWorkforcemanagementHistoricaldataDeletejobWithHttpInfo() throws IOException {
    return postWorkforcemanagementHistoricaldataDeletejob(createPostWorkforcemanagementHistoricaldataDeletejobRequest().withHttpInfo());
  }

  private PostWorkforcemanagementHistoricaldataDeletejobRequest createPostWorkforcemanagementHistoricaldataDeletejobRequest() {
    return PostWorkforcemanagementHistoricaldataDeletejobRequest.builder()
            .build();
  }

  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @param request The request object
   * @return HistoricalImportDeleteJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteJobResponse postWorkforcemanagementHistoricaldataDeletejob(PostWorkforcemanagementHistoricaldataDeletejobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportDeleteJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete the entries of the historical data imports in the organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteJobResponse> postWorkforcemanagementHistoricaldataDeletejob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportDeleteJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteJobResponse> response = (ApiResponse<HistoricalImportDeleteJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Trigger validation process for historical import
   * 
   * @param body body (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postWorkforcemanagementHistoricaldataValidate(ValidationServiceRequest body) throws IOException, ApiException {
     postWorkforcemanagementHistoricaldataValidate(createPostWorkforcemanagementHistoricaldataValidateRequest(body));
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param body body (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postWorkforcemanagementHistoricaldataValidateWithHttpInfo(ValidationServiceRequest body) throws IOException {
    return postWorkforcemanagementHistoricaldataValidate(createPostWorkforcemanagementHistoricaldataValidateRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementHistoricaldataValidateRequest createPostWorkforcemanagementHistoricaldataValidateRequest(ValidationServiceRequest body) {
    return PostWorkforcemanagementHistoricaldataValidateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postWorkforcemanagementHistoricaldataValidate(PostWorkforcemanagementHistoricaldataValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postWorkforcemanagementHistoricaldataValidate(ApiRequest<ValidationServiceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesSearchResponse postWorkforcemanagementManagementunitAgentschedulesSearch(String managementUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitAgentschedulesSearch(createPostWorkforcemanagementManagementunitAgentschedulesSearchRequest(managementUnitId, body, forceAsync, forceDownloadService));
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementManagementunitAgentschedulesSearchWithHttpInfo(String managementUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementManagementunitAgentschedulesSearch(createPostWorkforcemanagementManagementunitAgentschedulesSearchRequest(managementUnitId, body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitAgentschedulesSearchRequest createPostWorkforcemanagementManagementunitAgentschedulesSearchRequest(String managementUnitId, BuSearchAgentSchedulesRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementManagementunitAgentschedulesSearchRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return BuAsyncAgentSchedulesSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncAgentSchedulesSearchResponse postWorkforcemanagementManagementunitAgentschedulesSearch(PostWorkforcemanagementManagementunitAgentschedulesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncAgentSchedulesSearchResponse> postWorkforcemanagementManagementunitAgentschedulesSearch(ApiRequest<BuSearchAgentSchedulesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAsyncAgentSchedulesSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BuAsyncAgentSchedulesSearchResponse> response = (ApiResponse<BuAsyncAgentSchedulesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param managementUnitId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementManagementunitHistoricaladherencequery(String managementUnitId, WfmHistoricalAdherenceQuery body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(managementUnitId, body));
  }

  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param managementUnitId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequeryWithHttpInfo(String managementUnitId, WfmHistoricalAdherenceQuery body) throws IOException {
    return postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(String managementUnitId, WfmHistoricalAdherenceQuery body) {
    return PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementManagementunitHistoricaladherencequery(PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalAdherenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequery(ApiRequest<WfmHistoricalAdherenceQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalAdherenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return MoveManagementUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MoveManagementUnitResponse postWorkforcemanagementManagementunitMove(String managementUnitId, MoveManagementUnitRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitMove(createPostWorkforcemanagementManagementunitMoveRequest(managementUnitId, body));
  }

  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return MoveManagementUnitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MoveManagementUnitResponse> postWorkforcemanagementManagementunitMoveWithHttpInfo(String managementUnitId, MoveManagementUnitRequest body) throws IOException {
    return postWorkforcemanagementManagementunitMove(createPostWorkforcemanagementManagementunitMoveRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitMoveRequest createPostWorkforcemanagementManagementunitMoveRequest(String managementUnitId, MoveManagementUnitRequest body) {
    return PostWorkforcemanagementManagementunitMoveRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param request The request object
   * @return MoveManagementUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MoveManagementUnitResponse postWorkforcemanagementManagementunitMove(PostWorkforcemanagementManagementunitMoveRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MoveManagementUnitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MoveManagementUnitResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Move the requested management unit to a new business unit
   * Returns status 200 if the management unit is already in the requested business unit
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MoveManagementUnitResponse> postWorkforcemanagementManagementunitMove(ApiRequest<MoveManagementUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MoveManagementUnitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MoveManagementUnitResponse> response = (ApiResponse<MoveManagementUnitResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MoveManagementUnitResponse> response = (ApiResponse<MoveManagementUnitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String managementUnitId, UserListScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(managementUnitId, body));
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchWithHttpInfo(String managementUnitId, UserListScheduleRequestBody body) throws IOException {
    return postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitSchedulesSearchRequest createPostWorkforcemanagementManagementunitSchedulesSearchRequest(String managementUnitId, UserListScheduleRequestBody body) {
    return PostWorkforcemanagementManagementunitSchedulesSearchRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(PostWorkforcemanagementManagementunitSchedulesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserScheduleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearch(ApiRequest<UserListScheduleRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserScheduleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit postWorkforcemanagementManagementunitTimeofflimits(String managementUnitId, CreateTimeOffLimitRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeofflimits(createPostWorkforcemanagementManagementunitTimeofflimitsRequest(managementUnitId, body));
  }

  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> postWorkforcemanagementManagementunitTimeofflimitsWithHttpInfo(String managementUnitId, CreateTimeOffLimitRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeofflimits(createPostWorkforcemanagementManagementunitTimeofflimitsRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeofflimitsRequest createPostWorkforcemanagementManagementunitTimeofflimitsRequest(String managementUnitId, CreateTimeOffLimitRequest body) {
    return PostWorkforcemanagementManagementunitTimeofflimitsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param request The request object
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit postWorkforcemanagementManagementunitTimeofflimits(PostWorkforcemanagementManagementunitTimeofflimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffLimit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> postWorkforcemanagementManagementunitTimeofflimits(ApiRequest<CreateTimeOffLimitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffLimit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return QueryTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryTimeOffLimitValuesResponse postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(String managementUnitId, QueryTimeOffLimitValuesRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(createPostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest(managementUnitId, body));
  }

  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return QueryTimeOffLimitValuesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryTimeOffLimitValuesResponse> postWorkforcemanagementManagementunitTimeofflimitsValuesQueryWithHttpInfo(String managementUnitId, QueryTimeOffLimitValuesRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(createPostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest createPostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest(String managementUnitId, QueryTimeOffLimitValuesRequest body) {
    return PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param request The request object
   * @return QueryTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryTimeOffLimitValuesResponse postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryTimeOffLimitValuesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryTimeOffLimitValuesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves time off limit related values based on a given set of filters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryTimeOffLimitValuesResponse> postWorkforcemanagementManagementunitTimeofflimitsValuesQuery(ApiRequest<QueryTimeOffLimitValuesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryTimeOffLimitValuesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueryTimeOffLimitValuesResponse> response = (ApiResponse<QueryTimeOffLimitValuesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a new time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param body body (optional)
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan postWorkforcemanagementManagementunitTimeoffplans(String managementUnitId, CreateTimeOffPlanRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffplans(createPostWorkforcemanagementManagementunitTimeoffplansRequest(managementUnitId, body));
  }

  /**
   * Creates a new time off plan
   * 
   * @param managementUnitId The management unit ID. (required)
   * @param body body (optional)
   * @return TimeOffPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> postWorkforcemanagementManagementunitTimeoffplansWithHttpInfo(String managementUnitId, CreateTimeOffPlanRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffplans(createPostWorkforcemanagementManagementunitTimeoffplansRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffplansRequest createPostWorkforcemanagementManagementunitTimeoffplansRequest(String managementUnitId, CreateTimeOffPlanRequest body) {
    return PostWorkforcemanagementManagementunitTimeoffplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a new time off plan
   * 
   * @param request The request object
   * @return TimeOffPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffPlan postWorkforcemanagementManagementunitTimeoffplans(PostWorkforcemanagementManagementunitTimeoffplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new time off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffPlan> postWorkforcemanagementManagementunitTimeoffplans(ApiRequest<CreateTimeOffPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffPlan> response = (ApiResponse<TimeOffPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList postWorkforcemanagementManagementunitTimeoffrequests(String managementUnitId, CreateAdminTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequests(createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(managementUnitId, body));
  }

  /**
   * Create a new time off request
   * 
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> postWorkforcemanagementManagementunitTimeoffrequestsWithHttpInfo(String managementUnitId, CreateAdminTimeOffRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequests(createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsRequest createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(String managementUnitId, CreateAdminTimeOffRequest body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new time off request
   * 
   * @param request The request object
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList postWorkforcemanagementManagementunitTimeoffrequests(PostWorkforcemanagementManagementunitTimeoffrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> postWorkforcemanagementManagementunitTimeoffrequests(ApiRequest<CreateAdminTimeOffRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestListing postWorkforcemanagementManagementunitTimeoffrequestsQuery(String managementUnitId, TimeOffRequestQueryBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(managementUnitId, body));
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param managementUnitId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestListing> postWorkforcemanagementManagementunitTimeoffrequestsQueryWithHttpInfo(String managementUnitId, TimeOffRequestQueryBody body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(String managementUnitId, TimeOffRequestQueryBody body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param request The request object
   * @return TimeOffRequestListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestListing postWorkforcemanagementManagementunitTimeoffrequestsQuery(PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestListing> postWorkforcemanagementManagementunitTimeoffrequestsQuery(ApiRequest<TimeOffRequestQueryBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestListing> response = (ApiResponse<TimeOffRequestListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestListing> response = (ApiResponse<TimeOffRequestListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return WaitlistPositionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WaitlistPositionListing postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(String managementUnitId, QueryWaitlistPositionsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest(managementUnitId, body));
  }

  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param body body (optional)
   * @return WaitlistPositionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WaitlistPositionListing> postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryWithHttpInfo(String managementUnitId, QueryWaitlistPositionsRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest createPostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest(String managementUnitId, QueryWaitlistPositionsRequest body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param request The request object
   * @return WaitlistPositionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WaitlistPositionListing postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WaitlistPositionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WaitlistPositionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves daily waitlist position for a list of time off requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WaitlistPositionListing> postWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQuery(ApiRequest<QueryWaitlistPositionsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WaitlistPositionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WaitlistPositionListing> response = (ApiResponse<WaitlistPositionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @return MatchShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MatchShiftTradeResponse postWorkforcemanagementManagementunitWeekShifttradeMatch(String managementUnitId, LocalDate weekDateId, MatchShiftTradeRequest body, String tradeId) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttradeMatch(createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(managementUnitId, weekDateId, body, tradeId));
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @return MatchShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MatchShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradeMatchWithHttpInfo(String managementUnitId, LocalDate weekDateId, MatchShiftTradeRequest body, String tradeId) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttradeMatch(createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(managementUnitId, weekDateId, body, tradeId).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(String managementUnitId, LocalDate weekDateId, MatchShiftTradeRequest body, String tradeId) {
    return PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withTradeId(tradeId)
    
            .build();
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param request The request object
   * @return MatchShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MatchShiftTradeResponse postWorkforcemanagementManagementunitWeekShifttradeMatch(PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MatchShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MatchShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MatchShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradeMatch(ApiRequest<MatchShiftTradeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MatchShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MatchShiftTradeResponse> response = (ApiResponse<MatchShiftTradeResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<MatchShiftTradeResponse> response = (ApiResponse<MatchShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Adds a shift trade
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeResponse postWorkforcemanagementManagementunitWeekShifttrades(String managementUnitId, LocalDate weekDateId, AddShiftTradeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttrades(createPostWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, body));
  }

  /**
   * Adds a shift trade
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradesWithHttpInfo(String managementUnitId, LocalDate weekDateId, AddShiftTradeRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttrades(createPostWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradesRequest createPostWorkforcemanagementManagementunitWeekShifttradesRequest(String managementUnitId, LocalDate weekDateId, AddShiftTradeRequest body) {
    return PostWorkforcemanagementManagementunitWeekShifttradesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Adds a shift trade
   * 
   * @param request The request object
   * @return ShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeResponse postWorkforcemanagementManagementunitWeekShifttrades(PostWorkforcemanagementManagementunitWeekShifttradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Adds a shift trade
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttrades(ApiRequest<AddShiftTradeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShiftTradeResponse> response = (ApiResponse<ShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return SearchShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SearchShiftTradesResponse postWorkforcemanagementManagementunitWeekShifttradesSearch(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttradesSearch(createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(managementUnitId, weekDateId, body));
  }

  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return SearchShiftTradesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SearchShiftTradesResponse> postWorkforcemanagementManagementunitWeekShifttradesSearchWithHttpInfo(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttradesSearch(createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(managementUnitId, weekDateId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body) {
    return PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param request The request object
   * @return SearchShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SearchShiftTradesResponse postWorkforcemanagementManagementunitWeekShifttradesSearch(PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SearchShiftTradesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SearchShiftTradesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SearchShiftTradesResponse> postWorkforcemanagementManagementunitWeekShifttradesSearch(ApiRequest<SearchShiftTradesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SearchShiftTradesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SearchShiftTradesResponse> response = (ApiResponse<SearchShiftTradesResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SearchShiftTradesResponse> response = (ApiResponse<SearchShiftTradesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return BulkUpdateShiftTradeStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkUpdateShiftTradeStateResponse postWorkforcemanagementManagementunitWeekShifttradesStateBulk(String managementUnitId, LocalDate weekDateId, BulkShiftTradeStateUpdateRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttradesStateBulk(createPostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest(managementUnitId, weekDateId, body, forceAsync));
  }

  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param managementUnitId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekDateId The start date of the week schedule in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return BulkUpdateShiftTradeStateResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkUpdateShiftTradeStateResponse> postWorkforcemanagementManagementunitWeekShifttradesStateBulkWithHttpInfo(String managementUnitId, LocalDate weekDateId, BulkShiftTradeStateUpdateRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttradesStateBulk(createPostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest(managementUnitId, weekDateId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest createPostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest(String managementUnitId, LocalDate weekDateId, BulkShiftTradeStateUpdateRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .build();
  }

  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param request The request object
   * @return BulkUpdateShiftTradeStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BulkUpdateShiftTradeStateResponse postWorkforcemanagementManagementunitWeekShifttradesStateBulk(PostWorkforcemanagementManagementunitWeekShifttradesStateBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BulkUpdateShiftTradeStateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BulkUpdateShiftTradeStateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the state of a batch of shift trades
   * Admin functionality is not supported with \&quot;mine\&quot;.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BulkUpdateShiftTradeStateResponse> postWorkforcemanagementManagementunitWeekShifttradesStateBulk(ApiRequest<BulkShiftTradeStateUpdateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BulkUpdateShiftTradeStateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BulkUpdateShiftTradeStateResponse> response = (ApiResponse<BulkUpdateShiftTradeStateResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BulkUpdateShiftTradeStateResponse> response = (ApiResponse<BulkUpdateShiftTradeStateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a copy of work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to create a copy (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan postWorkforcemanagementManagementunitWorkplanCopy(String managementUnitId, String workPlanId, CopyWorkPlan body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplanCopy(createPostWorkforcemanagementManagementunitWorkplanCopyRequest(managementUnitId, workPlanId, body));
  }

  /**
   * Create a copy of work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to create a copy (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> postWorkforcemanagementManagementunitWorkplanCopyWithHttpInfo(String managementUnitId, String workPlanId, CopyWorkPlan body) throws IOException {
    return postWorkforcemanagementManagementunitWorkplanCopy(createPostWorkforcemanagementManagementunitWorkplanCopyRequest(managementUnitId, workPlanId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplanCopyRequest createPostWorkforcemanagementManagementunitWorkplanCopyRequest(String managementUnitId, String workPlanId, CopyWorkPlan body) {
    return PostWorkforcemanagementManagementunitWorkplanCopyRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a copy of work plan
   * 
   * @param request The request object
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan postWorkforcemanagementManagementunitWorkplanCopy(PostWorkforcemanagementManagementunitWorkplanCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a copy of work plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> postWorkforcemanagementManagementunitWorkplanCopy(ApiRequest<CopyWorkPlan> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Validate Work Plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to validate. For new work plan, use the word &#39;new&#39; for the ID. (required)
   * @param body body (optional)
   * @param expand  (optional)
   * @return ValidateWorkPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidateWorkPlanResponse postWorkforcemanagementManagementunitWorkplanValidate(String managementUnitId, String workPlanId, WorkPlanValidationRequest body, List<String> expand) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplanValidate(createPostWorkforcemanagementManagementunitWorkplanValidateRequest(managementUnitId, workPlanId, body, expand));
  }

  /**
   * Validate Work Plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to validate. For new work plan, use the word &#39;new&#39; for the ID. (required)
   * @param body body (optional)
   * @param expand  (optional)
   * @return ValidateWorkPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidateWorkPlanResponse> postWorkforcemanagementManagementunitWorkplanValidateWithHttpInfo(String managementUnitId, String workPlanId, WorkPlanValidationRequest body, List<String> expand) throws IOException {
    return postWorkforcemanagementManagementunitWorkplanValidate(createPostWorkforcemanagementManagementunitWorkplanValidateRequest(managementUnitId, workPlanId, body, expand).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplanValidateRequest createPostWorkforcemanagementManagementunitWorkplanValidateRequest(String managementUnitId, String workPlanId, WorkPlanValidationRequest body, List<String> expand) {
    return PostWorkforcemanagementManagementunitWorkplanValidateRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .withBody(body)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Validate Work Plan
   * 
   * @param request The request object
   * @return ValidateWorkPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidateWorkPlanResponse postWorkforcemanagementManagementunitWorkplanValidate(PostWorkforcemanagementManagementunitWorkplanValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ValidateWorkPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ValidateWorkPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate Work Plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidateWorkPlanResponse> postWorkforcemanagementManagementunitWorkplanValidate(ApiRequest<WorkPlanValidationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ValidateWorkPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ValidateWorkPlanResponse> response = (ApiResponse<ValidateWorkPlanResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ValidateWorkPlanResponse> response = (ApiResponse<ValidateWorkPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a copy of work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to create a copy (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse postWorkforcemanagementManagementunitWorkplanrotationCopy(String managementUnitId, String workPlanRotationId, CopyWorkPlanRotationRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplanrotationCopy(createPostWorkforcemanagementManagementunitWorkplanrotationCopyRequest(managementUnitId, workPlanRotationId, body));
  }

  /**
   * Create a copy of work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to create a copy (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotationCopyWithHttpInfo(String managementUnitId, String workPlanRotationId, CopyWorkPlanRotationRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWorkplanrotationCopy(createPostWorkforcemanagementManagementunitWorkplanrotationCopyRequest(managementUnitId, workPlanRotationId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplanrotationCopyRequest createPostWorkforcemanagementManagementunitWorkplanrotationCopyRequest(String managementUnitId, String workPlanRotationId, CopyWorkPlanRotationRequest body) {
    return PostWorkforcemanagementManagementunitWorkplanrotationCopyRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanRotationId(workPlanRotationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a copy of work plan rotation
   * 
   * @param request The request object
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse postWorkforcemanagementManagementunitWorkplanrotationCopy(PostWorkforcemanagementManagementunitWorkplanrotationCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanRotationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a copy of work plan rotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotationCopy(ApiRequest<CopyWorkPlanRotationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanRotationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse postWorkforcemanagementManagementunitWorkplanrotations(String managementUnitId, AddWorkPlanRotationRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplanrotations(createPostWorkforcemanagementManagementunitWorkplanrotationsRequest(managementUnitId, body));
  }

  /**
   * Create a new work plan rotation
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WorkPlanRotationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotationsWithHttpInfo(String managementUnitId, AddWorkPlanRotationRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWorkplanrotations(createPostWorkforcemanagementManagementunitWorkplanrotationsRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplanrotationsRequest createPostWorkforcemanagementManagementunitWorkplanrotationsRequest(String managementUnitId, AddWorkPlanRotationRequest body) {
    return PostWorkforcemanagementManagementunitWorkplanrotationsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new work plan rotation
   * 
   * @param request The request object
   * @return WorkPlanRotationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanRotationResponse postWorkforcemanagementManagementunitWorkplanrotations(PostWorkforcemanagementManagementunitWorkplanrotationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanRotationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanRotationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new work plan rotation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanRotationResponse> postWorkforcemanagementManagementunitWorkplanrotations(ApiRequest<AddWorkPlanRotationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanRotationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanRotationResponse> response = (ApiResponse<WorkPlanRotationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @param validationMode Allows to create work plan even if the validation result is invalid (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan postWorkforcemanagementManagementunitWorkplans(String managementUnitId, CreateWorkPlan body, String validationMode) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplans(createPostWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, body, validationMode));
  }

  /**
   * Create a new work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @param validationMode Allows to create work plan even if the validation result is invalid (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> postWorkforcemanagementManagementunitWorkplansWithHttpInfo(String managementUnitId, CreateWorkPlan body, String validationMode) throws IOException {
    return postWorkforcemanagementManagementunitWorkplans(createPostWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, body, validationMode).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplansRequest createPostWorkforcemanagementManagementunitWorkplansRequest(String managementUnitId, CreateWorkPlan body, String validationMode) {
    return PostWorkforcemanagementManagementunitWorkplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .withValidationMode(validationMode)
    
            .build();
  }

  /**
   * Create a new work plan
   * 
   * @param request The request object
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan postWorkforcemanagementManagementunitWorkplans(PostWorkforcemanagementManagementunitWorkplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlan> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlan>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new work plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> postWorkforcemanagementManagementunitWorkplans(ApiRequest<CreateWorkPlan> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlan>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlan> response = (ApiResponse<WorkPlan>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param body body (optional)
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit postWorkforcemanagementManagementunits(CreateManagementUnitApiRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunits(createPostWorkforcemanagementManagementunitsRequest(body));
  }

  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param body body (optional)
   * @return ManagementUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> postWorkforcemanagementManagementunitsWithHttpInfo(CreateManagementUnitApiRequest body) throws IOException {
    return postWorkforcemanagementManagementunits(createPostWorkforcemanagementManagementunitsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitsRequest createPostWorkforcemanagementManagementunitsRequest(CreateManagementUnitApiRequest body) {
    return PostWorkforcemanagementManagementunitsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param request The request object
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit postWorkforcemanagementManagementunits(PostWorkforcemanagementManagementunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a management unit
   * It may take a minute or two for a new management unit to be available for api operations
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> postWorkforcemanagementManagementunits(ApiRequest<CreateManagementUnitApiRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnit> response = (ApiResponse<ManagementUnit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Mark a list of notifications as read or unread
   * 
   * @param body body (optional)
   * @return UpdateNotificationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateNotificationsResponse postWorkforcemanagementNotificationsUpdate(UpdateNotificationsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementNotificationsUpdate(createPostWorkforcemanagementNotificationsUpdateRequest(body));
  }

  /**
   * Mark a list of notifications as read or unread
   * 
   * @param body body (optional)
   * @return UpdateNotificationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateNotificationsResponse> postWorkforcemanagementNotificationsUpdateWithHttpInfo(UpdateNotificationsRequest body) throws IOException {
    return postWorkforcemanagementNotificationsUpdate(createPostWorkforcemanagementNotificationsUpdateRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementNotificationsUpdateRequest createPostWorkforcemanagementNotificationsUpdateRequest(UpdateNotificationsRequest body) {
    return PostWorkforcemanagementNotificationsUpdateRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Mark a list of notifications as read or unread
   * 
   * @param request The request object
   * @return UpdateNotificationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateNotificationsResponse postWorkforcemanagementNotificationsUpdate(PostWorkforcemanagementNotificationsUpdateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UpdateNotificationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UpdateNotificationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Mark a list of notifications as read or unread
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateNotificationsResponse> postWorkforcemanagementNotificationsUpdate(ApiRequest<UpdateNotificationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UpdateNotificationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UpdateNotificationsResponse> response = (ApiResponse<UpdateNotificationsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UpdateNotificationsResponse> response = (ApiResponse<UpdateNotificationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get published schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(CurrentUserScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementSchedules(createPostWorkforcemanagementSchedulesRequest(body));
  }

  /**
   * Get published schedule for the current user
   * 
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedulesWithHttpInfo(CurrentUserScheduleRequestBody body) throws IOException {
    return postWorkforcemanagementSchedules(createPostWorkforcemanagementSchedulesRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementSchedulesRequest createPostWorkforcemanagementSchedulesRequest(CurrentUserScheduleRequestBody body) {
    return PostWorkforcemanagementSchedulesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request The request object
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementSchedules(PostWorkforcemanagementSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserScheduleContainer> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get published schedule for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementSchedules(ApiRequest<CurrentUserScheduleRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserScheduleContainer>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Queries available time off for the current user
   * 
   * @param body body (optional)
   * @return AvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTimeOffResponse postWorkforcemanagementTimeofflimitsAvailableQuery(AvailableTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTimeofflimitsAvailableQuery(createPostWorkforcemanagementTimeofflimitsAvailableQueryRequest(body));
  }

  /**
   * Queries available time off for the current user
   * 
   * @param body body (optional)
   * @return AvailableTimeOffResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTimeOffResponse> postWorkforcemanagementTimeofflimitsAvailableQueryWithHttpInfo(AvailableTimeOffRequest body) throws IOException {
    return postWorkforcemanagementTimeofflimitsAvailableQuery(createPostWorkforcemanagementTimeofflimitsAvailableQueryRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementTimeofflimitsAvailableQueryRequest createPostWorkforcemanagementTimeofflimitsAvailableQueryRequest(AvailableTimeOffRequest body) {
    return PostWorkforcemanagementTimeofflimitsAvailableQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Queries available time off for the current user
   * 
   * @param request The request object
   * @return AvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AvailableTimeOffResponse postWorkforcemanagementTimeofflimitsAvailableQuery(PostWorkforcemanagementTimeofflimitsAvailableQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AvailableTimeOffResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AvailableTimeOffResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Queries available time off for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AvailableTimeOffResponse> postWorkforcemanagementTimeofflimitsAvailableQuery(ApiRequest<AvailableTimeOffRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AvailableTimeOffResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AvailableTimeOffResponse> response = (ApiResponse<AvailableTimeOffResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AvailableTimeOffResponse> response = (ApiResponse<AvailableTimeOffResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a time off request for the current user
   * 
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse postWorkforcemanagementTimeoffrequests(CreateAgentTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTimeoffrequests(createPostWorkforcemanagementTimeoffrequestsRequest(body));
  }

  /**
   * Create a time off request for the current user
   * 
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> postWorkforcemanagementTimeoffrequestsWithHttpInfo(CreateAgentTimeOffRequest body) throws IOException {
    return postWorkforcemanagementTimeoffrequests(createPostWorkforcemanagementTimeoffrequestsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementTimeoffrequestsRequest createPostWorkforcemanagementTimeoffrequestsRequest(CreateAgentTimeOffRequest body) {
    return PostWorkforcemanagementTimeoffrequestsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a time off request for the current user
   * 
   * @param request The request object
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse postWorkforcemanagementTimeoffrequests(PostWorkforcemanagementTimeoffrequestsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a time off request for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> postWorkforcemanagementTimeoffrequests(ApiRequest<CreateAgentTimeOffRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestResponse> response = (ApiResponse<TimeOffRequestResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to set values for (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit putWorkforcemanagementManagementunitTimeofflimitValues(String managementUnitId, String timeOffLimitId, SetTimeOffLimitValuesRequest body) throws IOException, ApiException {
    return  putWorkforcemanagementManagementunitTimeofflimitValues(createPutWorkforcemanagementManagementunitTimeofflimitValuesRequest(managementUnitId, timeOffLimitId, body));
  }

  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param managementUnitId The management unit ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to set values for (required)
   * @param body body (optional)
   * @return TimeOffLimit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> putWorkforcemanagementManagementunitTimeofflimitValuesWithHttpInfo(String managementUnitId, String timeOffLimitId, SetTimeOffLimitValuesRequest body) throws IOException {
    return putWorkforcemanagementManagementunitTimeofflimitValues(createPutWorkforcemanagementManagementunitTimeofflimitValuesRequest(managementUnitId, timeOffLimitId, body).withHttpInfo());
  }

  private PutWorkforcemanagementManagementunitTimeofflimitValuesRequest createPutWorkforcemanagementManagementunitTimeofflimitValuesRequest(String managementUnitId, String timeOffLimitId, SetTimeOffLimitValuesRequest body) {
    return PutWorkforcemanagementManagementunitTimeofflimitValuesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withTimeOffLimitId(timeOffLimitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param request The request object
   * @return TimeOffLimit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffLimit putWorkforcemanagementManagementunitTimeofflimitValues(PutWorkforcemanagementManagementunitTimeofflimitValuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffLimit> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffLimit>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffLimit> putWorkforcemanagementManagementunitTimeofflimitValues(ApiRequest<SetTimeOffLimitValuesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffLimit>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffLimit> response = (ApiResponse<TimeOffLimit>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
