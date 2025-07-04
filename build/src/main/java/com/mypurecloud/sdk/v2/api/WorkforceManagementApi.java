package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

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
import com.mypurecloud.sdk.v2.model.AgentsWorkPlansResponse;
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
import com.mypurecloud.sdk.v2.model.ContinuousForecastGetSessionResponse;
import com.mypurecloud.sdk.v2.model.ContinuousForecastSessionResponse;
import com.mypurecloud.sdk.v2.model.ContinuousForecastSnapshotResponse;
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
import com.mypurecloud.sdk.v2.model.GetAgentsWorkPlansRequest;
import com.mypurecloud.sdk.v2.model.HistoricalImportDeleteFilesJobRequest;
import com.mypurecloud.sdk.v2.model.HistoricalImportDeleteFilesJobResponse;
import com.mypurecloud.sdk.v2.model.HistoricalImportOverallDeleteStatusResponse;
import com.mypurecloud.sdk.v2.model.HistoricalImportStatusJobResponse;
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
import com.mypurecloud.sdk.v2.model.UpdateMuAgentWorkPlansBatchRequest;
import com.mypurecloud.sdk.v2.model.UpdateMuAgentWorkPlansBatchResponse;
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
import com.mypurecloud.sdk.v2.model.ValidationServiceAsyncResponse;
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


import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitStaffinggroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWorkplanbidRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanrotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceExplanationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceExplanationsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceHistoricalBulkJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceHistoricalJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAgentAdherenceExplanationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAgentManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAgentsMeManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsOffersJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsTradeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsTradesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsTradesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAlternativeshiftsTradesStateJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivityplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivityplanRunsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivityplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitActivityplansJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitIntradayPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitSchedulingRunsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitStaffinggroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitStaffinggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitTimeoffplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleHeadcountforecastRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekScheduleHistoryAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastDataRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastLongtermforecastdataRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWorkplanbidRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWorkplanbidGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitWorkplanbidsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementBusinessunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementCalendarDataIcsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataBulkRemoveJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementHistoricaldataImportstatusJobIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementIntegrationsHrisRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementShrinkageJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffbalanceJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestWaitlistpositionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementUserWorkplanbidranksRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementWorkplanbidPreferencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementWorkplanbidWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementWorkplanbidsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementAgentAdherenceExplanationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementAlternativeshiftsTradeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitActivityplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitPlanninggroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitServicegoaltemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitStaffinggroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitWorkplanbidRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitTimeofflimitRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitTimeoffplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWeekShifttradeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanrotationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementUserWorkplanbidranksRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementUsersWorkplanbidranksBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementWorkplanbidPreferencesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceExplanationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceExplanationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceHistoricalRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceHistoricalBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentAdherenceExplanationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentAdherenceExplanationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentsIntegrationsHrisQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentsMePossibleworkshiftsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAgentschedulesMineRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAlternativeshiftsOffersJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAlternativeshiftsTradesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitActivityplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitAgentschedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitIntradayRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitPlanninggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitServicegoaltemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitStaffinggroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitTimeoffplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleAgentschedulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleRescheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastsGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWorkplanbidCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitWorkplanbidsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementBusinessunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementCalendarUrlIcsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementHistoricaldataValidateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitAgentschedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitMoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitShrinkageJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeofflimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeofflimitsValuesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitTimeoffrequestsWaitlistpositionsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTeamAdherenceHistoricalRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTeamShrinkageJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffbalanceJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeofflimitsAvailableQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsEstimateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutWorkforcemanagementAgentIntegrationsHrisRequest;
import com.mypurecloud.sdk.v2.api.request.PutWorkforcemanagementBusinessunitTimeofflimitValuesRequest;
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunit(String businessUnitId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunit(createDeleteWorkforcemanagementBusinessunitRequest(businessUnitId));
  }

  /**
   * Delete business unit
   * A business unit cannot be deleted if it contains one or more management units
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
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
   * Deletes a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitStaffinggroup(String businessUnitId, String staffingGroupId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitStaffinggroup(createDeleteWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId));
  }

  /**
   * Deletes a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitStaffinggroupWithHttpInfo(String businessUnitId, String staffingGroupId) throws IOException {
    return deleteWorkforcemanagementBusinessunitStaffinggroup(createDeleteWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitStaffinggroupRequest createDeleteWorkforcemanagementBusinessunitStaffinggroupRequest(String businessUnitId, String staffingGroupId) {
    return DeleteWorkforcemanagementBusinessunitStaffinggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withStaffingGroupId(staffingGroupId)

            .build();
  }

  /**
   * Deletes a staffing group
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitStaffinggroup(DeleteWorkforcemanagementBusinessunitStaffinggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a staffing group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitStaffinggroup(ApiRequest<Void> request) throws IOException {
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
   * Deletes a time-off limit object
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit object to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitTimeofflimit(String businessUnitId, String timeOffLimitId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitTimeofflimit(createDeleteWorkforcemanagementBusinessunitTimeofflimitRequest(businessUnitId, timeOffLimitId));
  }

  /**
   * Deletes a time-off limit object
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit object to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitTimeofflimitWithHttpInfo(String businessUnitId, String timeOffLimitId) throws IOException {
    return deleteWorkforcemanagementBusinessunitTimeofflimit(createDeleteWorkforcemanagementBusinessunitTimeofflimitRequest(businessUnitId, timeOffLimitId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitTimeofflimitRequest createDeleteWorkforcemanagementBusinessunitTimeofflimitRequest(String businessUnitId, String timeOffLimitId) {
    return DeleteWorkforcemanagementBusinessunitTimeofflimitRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffLimitId(timeOffLimitId)

            .build();
  }

  /**
   * Deletes a time-off limit object
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitTimeofflimit(DeleteWorkforcemanagementBusinessunitTimeofflimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a time-off limit object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitTimeofflimit(ApiRequest<Void> request) throws IOException {
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
   * Deletes a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitTimeoffplan(String businessUnitId, String timeOffPlanId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitTimeoffplan(createDeleteWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId));
  }

  /**
   * Deletes a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitTimeoffplanWithHttpInfo(String businessUnitId, String timeOffPlanId) throws IOException {
    return deleteWorkforcemanagementBusinessunitTimeoffplan(createDeleteWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitTimeoffplanRequest createDeleteWorkforcemanagementBusinessunitTimeoffplanRequest(String businessUnitId, String timeOffPlanId) {
    return DeleteWorkforcemanagementBusinessunitTimeoffplanRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffPlanId(timeOffPlanId)

            .build();
  }

  /**
   * Deletes a time-off plan
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitTimeoffplan(DeleteWorkforcemanagementBusinessunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Deletes a time-off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitTimeoffplan(ApiRequest<Void> request) throws IOException {
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * Delete a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The ID of the work plan bid (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWorkplanbid(String businessUnitId, String bidId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitWorkplanbid(createDeleteWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId));
  }

  /**
   * Delete a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The ID of the work plan bid (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWorkplanbidWithHttpInfo(String businessUnitId, String bidId) throws IOException {
    return deleteWorkforcemanagementBusinessunitWorkplanbid(createDeleteWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitWorkplanbidRequest createDeleteWorkforcemanagementBusinessunitWorkplanbidRequest(String businessUnitId, String bidId) {
    return DeleteWorkforcemanagementBusinessunitWorkplanbidRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .build();
  }

  /**
   * Delete a work plan bid
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWorkplanbid(DeleteWorkforcemanagementBusinessunitWorkplanbidRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWorkplanbid(ApiRequest<Void> request) throws IOException {
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
   * Delete a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWorkplanbidGroup(String businessUnitId, String bidId, String bidGroupId) throws IOException, ApiException {
     deleteWorkforcemanagementBusinessunitWorkplanbidGroup(createDeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId));
  }

  /**
   * Delete a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWorkplanbidGroupWithHttpInfo(String businessUnitId, String bidId, String bidGroupId) throws IOException {
    return deleteWorkforcemanagementBusinessunitWorkplanbidGroup(createDeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId).withHttpInfo());
  }

  private DeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest createDeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest(String businessUnitId, String bidId, String bidGroupId) {
    return DeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBidGroupId(bidGroupId)

            .build();
  }

  /**
   * Delete a bid group by bid group Id
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementBusinessunitWorkplanbidGroup(DeleteWorkforcemanagementBusinessunitWorkplanbidGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a bid group by bid group Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementBusinessunitWorkplanbidGroup(ApiRequest<Void> request) throws IOException {
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunit(String managementUnitId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunit(createDeleteWorkforcemanagementManagementunitRequest(managementUnitId));
  }

  /**
   * Delete management unit
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * Get an adherence explanation for the current user
   * 
   * @param explanationId The ID of the explanation to update (required)
   * @return AdherenceExplanationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationResponse getWorkforcemanagementAdherenceExplanation(String explanationId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherenceExplanation(createGetWorkforcemanagementAdherenceExplanationRequest(explanationId));
  }

  /**
   * Get an adherence explanation for the current user
   * 
   * @param explanationId The ID of the explanation to update (required)
   * @return AdherenceExplanationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationResponse> getWorkforcemanagementAdherenceExplanationWithHttpInfo(String explanationId) throws IOException {
    return getWorkforcemanagementAdherenceExplanation(createGetWorkforcemanagementAdherenceExplanationRequest(explanationId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceExplanationRequest createGetWorkforcemanagementAdherenceExplanationRequest(String explanationId) {
    return GetWorkforcemanagementAdherenceExplanationRequest.builder()
            .withExplanationId(explanationId)

            .build();
  }

  /**
   * Get an adherence explanation for the current user
   * 
   * @param request The request object
   * @return AdherenceExplanationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationResponse getWorkforcemanagementAdherenceExplanation(GetWorkforcemanagementAdherenceExplanationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an adherence explanation for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationResponse> getWorkforcemanagementAdherenceExplanation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationResponse> response = (ApiResponse<AdherenceExplanationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationResponse> response = (ApiResponse<AdherenceExplanationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of an adherence explanation operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AdherenceExplanationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationJob getWorkforcemanagementAdherenceExplanationsJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherenceExplanationsJob(createGetWorkforcemanagementAdherenceExplanationsJobRequest(jobId));
  }

  /**
   * Query the status of an adherence explanation operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AdherenceExplanationJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationJob> getWorkforcemanagementAdherenceExplanationsJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAdherenceExplanationsJob(createGetWorkforcemanagementAdherenceExplanationsJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceExplanationsJobRequest createGetWorkforcemanagementAdherenceExplanationsJobRequest(String jobId) {
    return GetWorkforcemanagementAdherenceExplanationsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an adherence explanation operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return AdherenceExplanationJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationJob getWorkforcemanagementAdherenceExplanationsJob(GetWorkforcemanagementAdherenceExplanationsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an adherence explanation operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationJob> getWorkforcemanagementAdherenceExplanationsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationJob> response = (ApiResponse<AdherenceExplanationJob>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationJob> response = (ApiResponse<AdherenceExplanationJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Request to fetch the status of the historical adherence bulk job. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId ID of the job to get (required)
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceBulkResponse getWorkforcemanagementAdherenceHistoricalBulkJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherenceHistoricalBulkJob(createGetWorkforcemanagementAdherenceHistoricalBulkJobRequest(jobId));
  }

  /**
   * Request to fetch the status of the historical adherence bulk job. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId ID of the job to get (required)
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceBulkResponse> getWorkforcemanagementAdherenceHistoricalBulkJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAdherenceHistoricalBulkJob(createGetWorkforcemanagementAdherenceHistoricalBulkJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceHistoricalBulkJobRequest createGetWorkforcemanagementAdherenceHistoricalBulkJobRequest(String jobId) {
    return GetWorkforcemanagementAdherenceHistoricalBulkJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Request to fetch the status of the historical adherence bulk job. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceBulkResponse getWorkforcemanagementAdherenceHistoricalBulkJob(GetWorkforcemanagementAdherenceHistoricalBulkJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceBulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request to fetch the status of the historical adherence bulk job. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceBulkResponse> getWorkforcemanagementAdherenceHistoricalBulkJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalAdherenceBulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = (ApiResponse<WfmHistoricalAdherenceBulkResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = (ApiResponse<WfmHistoricalAdherenceBulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of a historical adherence request operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId jobId (required)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse getWorkforcemanagementAdherenceHistoricalJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAdherenceHistoricalJob(createGetWorkforcemanagementAdherenceHistoricalJobRequest(jobId));
  }

  /**
   * Query the status of a historical adherence request operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId jobId (required)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> getWorkforcemanagementAdherenceHistoricalJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAdherenceHistoricalJob(createGetWorkforcemanagementAdherenceHistoricalJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAdherenceHistoricalJobRequest createGetWorkforcemanagementAdherenceHistoricalJobRequest(String jobId) {
    return GetWorkforcemanagementAdherenceHistoricalJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of a historical adherence request operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse getWorkforcemanagementAdherenceHistoricalJob(GetWorkforcemanagementAdherenceHistoricalJobRequest request) throws IOException, ApiException {
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
   * Query the status of a historical adherence request operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> getWorkforcemanagementAdherenceHistoricalJob(ApiRequest<Void> request) throws IOException {
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
   * Get an adherence explanation
   * 
   * @param agentId The ID of the agent to query (required)
   * @param explanationId The ID of the explanation to update (required)
   * @return AdherenceExplanationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationResponse getWorkforcemanagementAgentAdherenceExplanation(String agentId, String explanationId) throws IOException, ApiException {
    return  getWorkforcemanagementAgentAdherenceExplanation(createGetWorkforcemanagementAgentAdherenceExplanationRequest(agentId, explanationId));
  }

  /**
   * Get an adherence explanation
   * 
   * @param agentId The ID of the agent to query (required)
   * @param explanationId The ID of the explanation to update (required)
   * @return AdherenceExplanationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationResponse> getWorkforcemanagementAgentAdherenceExplanationWithHttpInfo(String agentId, String explanationId) throws IOException {
    return getWorkforcemanagementAgentAdherenceExplanation(createGetWorkforcemanagementAgentAdherenceExplanationRequest(agentId, explanationId).withHttpInfo());
  }

  private GetWorkforcemanagementAgentAdherenceExplanationRequest createGetWorkforcemanagementAgentAdherenceExplanationRequest(String agentId, String explanationId) {
    return GetWorkforcemanagementAgentAdherenceExplanationRequest.builder()
            .withAgentId(agentId)

            .withExplanationId(explanationId)

            .build();
  }

  /**
   * Get an adherence explanation
   * 
   * @param request The request object
   * @return AdherenceExplanationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationResponse getWorkforcemanagementAgentAdherenceExplanation(GetWorkforcemanagementAgentAdherenceExplanationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an adherence explanation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationResponse> getWorkforcemanagementAgentAdherenceExplanation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationResponse> response = (ApiResponse<AdherenceExplanationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationResponse> response = (ApiResponse<AdherenceExplanationResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query the status of an alternative shift offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsOffersJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsOffersJob(createGetWorkforcemanagementAlternativeshiftsOffersJobRequest(jobId));
  }

  /**
   * Query the status of an alternative shift offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsOffersJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAlternativeshiftsOffersJob(createGetWorkforcemanagementAlternativeshiftsOffersJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsOffersJobRequest createGetWorkforcemanagementAlternativeshiftsOffersJobRequest(String jobId) {
    return GetWorkforcemanagementAlternativeshiftsOffersJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an alternative shift offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsOffersJob(GetWorkforcemanagementAlternativeshiftsOffersJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an alternative shift offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsOffersJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of an alternative shift search offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsOffersSearchJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsOffersSearchJob(createGetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest(jobId));
  }

  /**
   * Query the status of an alternative shift search offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsOffersSearchJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAlternativeshiftsOffersSearchJob(createGetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest createGetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest(String jobId) {
    return GetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an alternative shift search offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsOffersSearchJob(GetWorkforcemanagementAlternativeshiftsOffersSearchJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an alternative shift search offers operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsOffersSearchJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get alternative shifts settings from the current logged in agent’s business unit
   * 
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse getWorkforcemanagementAlternativeshiftsSettings() throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsSettings(createGetWorkforcemanagementAlternativeshiftsSettingsRequest());
  }

  /**
   * Get alternative shifts settings from the current logged in agent’s business unit
   * 
   * @return AlternativeShiftBuSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> getWorkforcemanagementAlternativeshiftsSettingsWithHttpInfo() throws IOException {
    return getWorkforcemanagementAlternativeshiftsSettings(createGetWorkforcemanagementAlternativeshiftsSettingsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsSettingsRequest createGetWorkforcemanagementAlternativeshiftsSettingsRequest() {
    return GetWorkforcemanagementAlternativeshiftsSettingsRequest.builder()
            .build();
  }

  /**
   * Get alternative shifts settings from the current logged in agent’s business unit
   * 
   * @param request The request object
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse getWorkforcemanagementAlternativeshiftsSettings(GetWorkforcemanagementAlternativeshiftsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftBuSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftBuSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get alternative shifts settings from the current logged in agent’s business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> getWorkforcemanagementAlternativeshiftsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftBuSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get my alternative shift trade by trade ID
   * 
   * @param tradeId The ID of the alternative shift trade (required)
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse getWorkforcemanagementAlternativeshiftsTrade(String tradeId) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsTrade(createGetWorkforcemanagementAlternativeshiftsTradeRequest(tradeId));
  }

  /**
   * Get my alternative shift trade by trade ID
   * 
   * @param tradeId The ID of the alternative shift trade (required)
   * @return AlternativeShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> getWorkforcemanagementAlternativeshiftsTradeWithHttpInfo(String tradeId) throws IOException {
    return getWorkforcemanagementAlternativeshiftsTrade(createGetWorkforcemanagementAlternativeshiftsTradeRequest(tradeId).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsTradeRequest createGetWorkforcemanagementAlternativeshiftsTradeRequest(String tradeId) {
    return GetWorkforcemanagementAlternativeshiftsTradeRequest.builder()
            .withTradeId(tradeId)

            .build();
  }

  /**
   * Get my alternative shift trade by trade ID
   * 
   * @param request The request object
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse getWorkforcemanagementAlternativeshiftsTrade(GetWorkforcemanagementAlternativeshiftsTradeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get my alternative shift trade by trade ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> getWorkforcemanagementAlternativeshiftsTrade(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of my alternative shifts trades
   * 
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ListAlternativeShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ListAlternativeShiftTradesResponse getWorkforcemanagementAlternativeshiftsTrades(Boolean forceAsync) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsTrades(createGetWorkforcemanagementAlternativeshiftsTradesRequest(forceAsync));
  }

  /**
   * Get a list of my alternative shifts trades
   * 
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ListAlternativeShiftTradesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ListAlternativeShiftTradesResponse> getWorkforcemanagementAlternativeshiftsTradesWithHttpInfo(Boolean forceAsync) throws IOException {
    return getWorkforcemanagementAlternativeshiftsTrades(createGetWorkforcemanagementAlternativeshiftsTradesRequest(forceAsync).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsTradesRequest createGetWorkforcemanagementAlternativeshiftsTradesRequest(Boolean forceAsync) {
    return GetWorkforcemanagementAlternativeshiftsTradesRequest.builder()
            .withForceAsync(forceAsync)

            .build();
  }

  /**
   * Get a list of my alternative shifts trades
   * 
   * @param request The request object
   * @return ListAlternativeShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ListAlternativeShiftTradesResponse getWorkforcemanagementAlternativeshiftsTrades(GetWorkforcemanagementAlternativeshiftsTradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ListAlternativeShiftTradesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ListAlternativeShiftTradesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of my alternative shifts trades
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ListAlternativeShiftTradesResponse> getWorkforcemanagementAlternativeshiftsTrades(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ListAlternativeShiftTradesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ListAlternativeShiftTradesResponse> response = (ApiResponse<ListAlternativeShiftTradesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ListAlternativeShiftTradesResponse> response = (ApiResponse<ListAlternativeShiftTradesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of an alternative shift trades operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsTradesJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsTradesJob(createGetWorkforcemanagementAlternativeshiftsTradesJobRequest(jobId));
  }

  /**
   * Query the status of an alternative shift trades operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsTradesJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAlternativeshiftsTradesJob(createGetWorkforcemanagementAlternativeshiftsTradesJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsTradesJobRequest createGetWorkforcemanagementAlternativeshiftsTradesJobRequest(String jobId) {
    return GetWorkforcemanagementAlternativeshiftsTradesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an alternative shift trades operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsTradesJob(GetWorkforcemanagementAlternativeshiftsTradesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an alternative shift trades operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsTradesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of an alternative shift trade state operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsTradesStateJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementAlternativeshiftsTradesStateJob(createGetWorkforcemanagementAlternativeshiftsTradesStateJobRequest(jobId));
  }

  /**
   * Query the status of an alternative shift trade state operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param jobId The ID of the job (required)
   * @return AlternativeShiftJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsTradesStateJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementAlternativeshiftsTradesStateJob(createGetWorkforcemanagementAlternativeshiftsTradesStateJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementAlternativeshiftsTradesStateJobRequest createGetWorkforcemanagementAlternativeshiftsTradesStateJobRequest(String jobId) {
    return GetWorkforcemanagementAlternativeshiftsTradesStateJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an alternative shift trade state operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return AlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftJobResponse getWorkforcemanagementAlternativeshiftsTradesStateJob(GetWorkforcemanagementAlternativeshiftsTradesStateJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an alternative shift trade state operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftJobResponse> getWorkforcemanagementAlternativeshiftsTradesStateJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftJobResponse> response = (ApiResponse<AlternativeShiftJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get business unit
   * Expanding \"settings\" will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param expand Include to access additional data on the business unit (optional)
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse getWorkforcemanagementBusinessunit(String businessUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunit(createGetWorkforcemanagementBusinessunitRequest(businessUnitId, expand));
  }

  /**
   * Get business unit
   * Expanding \"settings\" will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param expand Include to access additional data on the business unit (optional)
   * @return BusinessUnitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitResponse> getWorkforcemanagementBusinessunitWithHttpInfo(String businessUnitId, List<String> expand) throws IOException {
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
   * Expanding \"settings\" will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request The request object
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse getWorkforcemanagementBusinessunit(GetWorkforcemanagementBusinessunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get business unit
   * Expanding \"settings\" will retrieve all settings.  All other expands will retrieve only the requested settings field(s).
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitResponse> getWorkforcemanagementBusinessunit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an activity code
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BusinessUnitActivityCodeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitActivityCodeListing getWorkforcemanagementBusinessunitActivitycodes(String businessUnitId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivitycodes(createGetWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId, forceDownloadService));
  }

  /**
   * Get activity codes
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BusinessUnitActivityCodeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitActivityCodeListing> getWorkforcemanagementBusinessunitActivitycodesWithHttpInfo(String businessUnitId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementBusinessunitActivitycodes(createGetWorkforcemanagementBusinessunitActivitycodesRequest(businessUnitId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivitycodesRequest createGetWorkforcemanagementBusinessunitActivitycodesRequest(String businessUnitId, Boolean forceDownloadService) {
    return GetWorkforcemanagementBusinessunitActivitycodesRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withForceDownloadService(forceDownloadService)

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
   * Get an activity plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to fetch (required)
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse getWorkforcemanagementBusinessunitActivityplan(String businessUnitId, String activityPlanId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivityplan(createGetWorkforcemanagementBusinessunitActivityplanRequest(businessUnitId, activityPlanId));
  }

  /**
   * Get an activity plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to fetch (required)
   * @return ActivityPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> getWorkforcemanagementBusinessunitActivityplanWithHttpInfo(String businessUnitId, String activityPlanId) throws IOException {
    return getWorkforcemanagementBusinessunitActivityplan(createGetWorkforcemanagementBusinessunitActivityplanRequest(businessUnitId, activityPlanId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivityplanRequest createGetWorkforcemanagementBusinessunitActivityplanRequest(String businessUnitId, String activityPlanId) {
    return GetWorkforcemanagementBusinessunitActivityplanRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withActivityPlanId(activityPlanId)

            .build();
  }

  /**
   * Get an activity plan
   * 
   * @param request The request object
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse getWorkforcemanagementBusinessunitActivityplan(GetWorkforcemanagementBusinessunitActivityplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an activity plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> getWorkforcemanagementBusinessunitActivityplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets an activity plan run job
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan associated with the run job (required)
   * @param jobId The ID of the activity plan run job (required)
   * @return ActivityPlanRunJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanRunJobResponse getWorkforcemanagementBusinessunitActivityplanRunsJob(String businessUnitId, String activityPlanId, String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivityplanRunsJob(createGetWorkforcemanagementBusinessunitActivityplanRunsJobRequest(businessUnitId, activityPlanId, jobId));
  }

  /**
   * Gets an activity plan run job
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan associated with the run job (required)
   * @param jobId The ID of the activity plan run job (required)
   * @return ActivityPlanRunJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanRunJobResponse> getWorkforcemanagementBusinessunitActivityplanRunsJobWithHttpInfo(String businessUnitId, String activityPlanId, String jobId) throws IOException {
    return getWorkforcemanagementBusinessunitActivityplanRunsJob(createGetWorkforcemanagementBusinessunitActivityplanRunsJobRequest(businessUnitId, activityPlanId, jobId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivityplanRunsJobRequest createGetWorkforcemanagementBusinessunitActivityplanRunsJobRequest(String businessUnitId, String activityPlanId, String jobId) {
    return GetWorkforcemanagementBusinessunitActivityplanRunsJobRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withActivityPlanId(activityPlanId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Gets an activity plan run job
   * 
   * @param request The request object
   * @return ActivityPlanRunJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanRunJobResponse getWorkforcemanagementBusinessunitActivityplanRunsJob(GetWorkforcemanagementBusinessunitActivityplanRunsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanRunJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanRunJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets an activity plan run job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanRunJobResponse> getWorkforcemanagementBusinessunitActivityplanRunsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanRunJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanRunJobResponse> response = (ApiResponse<ActivityPlanRunJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanRunJobResponse> response = (ApiResponse<ActivityPlanRunJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get activity plans
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param state Optionally filter by activity plan state (optional)
   * @return ActivityPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanListing getWorkforcemanagementBusinessunitActivityplans(String businessUnitId, String state) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivityplans(createGetWorkforcemanagementBusinessunitActivityplansRequest(businessUnitId, state));
  }

  /**
   * Get activity plans
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param state Optionally filter by activity plan state (optional)
   * @return ActivityPlanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanListing> getWorkforcemanagementBusinessunitActivityplansWithHttpInfo(String businessUnitId, String state) throws IOException {
    return getWorkforcemanagementBusinessunitActivityplans(createGetWorkforcemanagementBusinessunitActivityplansRequest(businessUnitId, state).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivityplansRequest createGetWorkforcemanagementBusinessunitActivityplansRequest(String businessUnitId, String state) {
    return GetWorkforcemanagementBusinessunitActivityplansRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withState(state)

            .build();
  }

  /**
   * Get activity plans
   * 
   * @param request The request object
   * @return ActivityPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanListing getWorkforcemanagementBusinessunitActivityplans(GetWorkforcemanagementBusinessunitActivityplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get activity plans
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanListing> getWorkforcemanagementBusinessunitActivityplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanListing> response = (ApiResponse<ActivityPlanListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanListing> response = (ApiResponse<ActivityPlanListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the latest job for all activity plans in the business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return ActivityPlanJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanJobListing getWorkforcemanagementBusinessunitActivityplansJobs(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitActivityplansJobs(createGetWorkforcemanagementBusinessunitActivityplansJobsRequest(businessUnitId));
  }

  /**
   * Gets the latest job for all activity plans in the business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return ActivityPlanJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanJobListing> getWorkforcemanagementBusinessunitActivityplansJobsWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitActivityplansJobs(createGetWorkforcemanagementBusinessunitActivityplansJobsRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitActivityplansJobsRequest createGetWorkforcemanagementBusinessunitActivityplansJobsRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitActivityplansJobsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .build();
  }

  /**
   * Gets the latest job for all activity plans in the business unit
   * 
   * @param request The request object
   * @return ActivityPlanJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanJobListing getWorkforcemanagementBusinessunitActivityplansJobs(GetWorkforcemanagementBusinessunitActivityplansJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the latest job for all activity plans in the business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanJobListing> getWorkforcemanagementBusinessunitActivityplansJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanJobListing> response = (ApiResponse<ActivityPlanJobListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanJobListing> response = (ApiResponse<ActivityPlanJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get alternative shifts settings for a business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse getWorkforcemanagementBusinessunitAlternativeshiftsSettings(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitAlternativeshiftsSettings(createGetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(businessUnitId));
  }

  /**
   * Get alternative shifts settings for a business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return AlternativeShiftBuSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> getWorkforcemanagementBusinessunitAlternativeshiftsSettingsWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitAlternativeshiftsSettings(createGetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest createGetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .build();
  }

  /**
   * Get alternative shifts settings for a business unit
   * 
   * @param request The request object
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse getWorkforcemanagementBusinessunitAlternativeshiftsSettings(GetWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftBuSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftBuSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get alternative shifts settings for a business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> getWorkforcemanagementBusinessunitAlternativeshiftsSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftBuSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an alternative shifts trade in a business unit for a given trade ID
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param tradeId The ID of the alternative shift trade (required)
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse getWorkforcemanagementBusinessunitAlternativeshiftsTrade(String businessUnitId, String tradeId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitAlternativeshiftsTrade(createGetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest(businessUnitId, tradeId));
  }

  /**
   * Get an alternative shifts trade in a business unit for a given trade ID
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param tradeId The ID of the alternative shift trade (required)
   * @return AlternativeShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> getWorkforcemanagementBusinessunitAlternativeshiftsTradeWithHttpInfo(String businessUnitId, String tradeId) throws IOException {
    return getWorkforcemanagementBusinessunitAlternativeshiftsTrade(createGetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest(businessUnitId, tradeId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest createGetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest(String businessUnitId, String tradeId) {
    return GetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTradeId(tradeId)

            .build();
  }

  /**
   * Get an alternative shifts trade in a business unit for a given trade ID
   * 
   * @param request The request object
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse getWorkforcemanagementBusinessunitAlternativeshiftsTrade(GetWorkforcemanagementBusinessunitAlternativeshiftsTradeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an alternative shifts trade in a business unit for a given trade ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> getWorkforcemanagementBusinessunitAlternativeshiftsTrade(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the status of an alternative shift search trade operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param businessUnitId The ID of the business unit (required)
   * @param jobId The ID of the job (required)
   * @return BuAlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAlternativeShiftJobResponse getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJob(String businessUnitId, String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJob(createGetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest(businessUnitId, jobId));
  }

  /**
   * Query the status of an alternative shift search trade operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param businessUnitId The ID of the business unit (required)
   * @param jobId The ID of the job (required)
   * @return BuAlternativeShiftJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAlternativeShiftJobResponse> getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobWithHttpInfo(String businessUnitId, String jobId) throws IOException {
    return getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJob(createGetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest(businessUnitId, jobId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest createGetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest(String businessUnitId, String jobId) {
    return GetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Query the status of an alternative shift search trade operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return BuAlternativeShiftJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAlternativeShiftJobResponse getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJob(GetWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuAlternativeShiftJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuAlternativeShiftJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the status of an alternative shift search trade operation. Only the user who started the operation can query the status
   * Job details are only retained if the initial request returned a 202 ACCEPTED response
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAlternativeShiftJobResponse> getWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuAlternativeShiftJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuAlternativeShiftJobResponse> response = (ApiResponse<BuAlternativeShiftJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuAlternativeShiftJobResponse> response = (ApiResponse<BuAlternativeShiftJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get intraday planning groups for the given date
   * 
   * @param businessUnitId The ID of the business unit (required)
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
   * @param businessUnitId The ID of the business unit (required)
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
   * Get the latest session for the business unit ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @return ContinuousForecastGetSessionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastGetSessionResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest(businessUnitId));
  }

  /**
   * Get the latest session for the business unit ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @return ContinuousForecastGetSessionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastGetSessionResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .build();
  }

  /**
   * Get the latest session for the business unit ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ContinuousForecastGetSessionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastGetSessionResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession(GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContinuousForecastGetSessionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContinuousForecastGetSessionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the latest session for the business unit ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastGetSessionResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContinuousForecastGetSessionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContinuousForecastGetSessionResponse> response = (ApiResponse<ContinuousForecastGetSessionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContinuousForecastGetSessionResponse> response = (ApiResponse<ContinuousForecastGetSessionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the session details for the session ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @param sessionId  (required)
   * @return ContinuousForecastSessionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastSessionResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId(String businessUnitId, String sessionId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest(businessUnitId, sessionId));
  }

  /**
   * Get the session details for the session ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @param sessionId  (required)
   * @return ContinuousForecastSessionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastSessionResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdWithHttpInfo(String businessUnitId, String sessionId) throws IOException {
    return getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest(businessUnitId, sessionId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest(String businessUnitId, String sessionId) {
    return GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withSessionId(sessionId)

            .build();
  }

  /**
   * Get the session details for the session ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ContinuousForecastSessionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastSessionResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId(GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContinuousForecastSessionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContinuousForecastSessionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the session details for the session ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastSessionResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContinuousForecastSessionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContinuousForecastSessionResponse> response = (ApiResponse<ContinuousForecastSessionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContinuousForecastSessionResponse> response = (ApiResponse<ContinuousForecastSessionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the snapshot details for the snapshot ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @param sessionId  (required)
   * @param snapshotId  (required)
   * @return ContinuousForecastSnapshotResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastSnapshotResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId(String businessUnitId, String sessionId, String snapshotId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest(businessUnitId, sessionId, snapshotId));
  }

  /**
   * Get the snapshot details for the snapshot ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param businessUnitId  (required)
   * @param sessionId  (required)
   * @param snapshotId  (required)
   * @return ContinuousForecastSnapshotResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastSnapshotResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdWithHttpInfo(String businessUnitId, String sessionId, String snapshotId) throws IOException {
    return getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId(createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest(businessUnitId, sessionId, snapshotId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest createGetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest(String businessUnitId, String sessionId, String snapshotId) {
    return GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withSessionId(sessionId)

            .withSnapshotId(snapshotId)

            .build();
  }

  /**
   * Get the snapshot details for the snapshot ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ContinuousForecastSnapshotResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContinuousForecastSnapshotResponse getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId(GetWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContinuousForecastSnapshotResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContinuousForecastSnapshotResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the snapshot details for the snapshot ID
   * 
   * getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContinuousForecastSnapshotResponse> getWorkforcemanagementBusinessunitMainforecastContinuousforecastSessionSessionIdSnapshotSnapshotId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContinuousForecastSnapshotResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContinuousForecastSnapshotResponse> response = (ApiResponse<ContinuousForecastSnapshotResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ContinuousForecastSnapshotResponse> response = (ApiResponse<ContinuousForecastSnapshotResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all authorized management units in the business unit
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param feature If specified, the list of management units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of management units belonging to the specified division will be returned (optional)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param feature If specified, the list of management units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of management units belonging to the specified division will be returned (optional)
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
   * @param expand Include to access additional data on the service goal template (optional)
   * @return ServiceGoalTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplate getWorkforcemanagementBusinessunitServicegoaltemplate(String businessUnitId, String serviceGoalTemplateId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitServicegoaltemplate(createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId, expand));
  }

  /**
   * Get a service goal template
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param serviceGoalTemplateId The ID of a service goal template to fetch (required)
   * @param expand Include to access additional data on the service goal template (optional)
   * @return ServiceGoalTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplate> getWorkforcemanagementBusinessunitServicegoaltemplateWithHttpInfo(String businessUnitId, String serviceGoalTemplateId, List<String> expand) throws IOException {
    return getWorkforcemanagementBusinessunitServicegoaltemplate(createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(businessUnitId, serviceGoalTemplateId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitServicegoaltemplateRequest createGetWorkforcemanagementBusinessunitServicegoaltemplateRequest(String businessUnitId, String serviceGoalTemplateId, List<String> expand) {
    return GetWorkforcemanagementBusinessunitServicegoaltemplateRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withServiceGoalTemplateId(serviceGoalTemplateId)

            .withExpand(expand)

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
   * @param expand Include to access additional data on the service goal template (optional)
   * @return ServiceGoalTemplateList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalTemplateList getWorkforcemanagementBusinessunitServicegoaltemplates(String businessUnitId, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitServicegoaltemplates(createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId, expand));
  }

  /**
   * Gets list of service goal templates
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param expand Include to access additional data on the service goal template (optional)
   * @return ServiceGoalTemplateList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalTemplateList> getWorkforcemanagementBusinessunitServicegoaltemplatesWithHttpInfo(String businessUnitId, List<String> expand) throws IOException {
    return getWorkforcemanagementBusinessunitServicegoaltemplates(createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(businessUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest createGetWorkforcemanagementBusinessunitServicegoaltemplatesRequest(String businessUnitId, List<String> expand) {
    return GetWorkforcemanagementBusinessunitServicegoaltemplatesRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withExpand(expand)

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
   * Gets a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to fetch (required)
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse getWorkforcemanagementBusinessunitStaffinggroup(String businessUnitId, String staffingGroupId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitStaffinggroup(createGetWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId));
  }

  /**
   * Gets a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to fetch (required)
   * @return StaffingGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> getWorkforcemanagementBusinessunitStaffinggroupWithHttpInfo(String businessUnitId, String staffingGroupId) throws IOException {
    return getWorkforcemanagementBusinessunitStaffinggroup(createGetWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitStaffinggroupRequest createGetWorkforcemanagementBusinessunitStaffinggroupRequest(String businessUnitId, String staffingGroupId) {
    return GetWorkforcemanagementBusinessunitStaffinggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withStaffingGroupId(staffingGroupId)

            .build();
  }

  /**
   * Gets a staffing group
   * 
   * @param request The request object
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse getWorkforcemanagementBusinessunitStaffinggroup(GetWorkforcemanagementBusinessunitStaffinggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StaffingGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StaffingGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a staffing group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> getWorkforcemanagementBusinessunitStaffinggroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StaffingGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a list of staffing groups
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific staffing groups (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return StaffingGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupListing getWorkforcemanagementBusinessunitStaffinggroups(String businessUnitId, String managementUnitId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitStaffinggroups(createGetWorkforcemanagementBusinessunitStaffinggroupsRequest(businessUnitId, managementUnitId, forceDownloadService));
  }

  /**
   * Gets a list of staffing groups
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific staffing groups (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return StaffingGroupListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupListing> getWorkforcemanagementBusinessunitStaffinggroupsWithHttpInfo(String businessUnitId, String managementUnitId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementBusinessunitStaffinggroups(createGetWorkforcemanagementBusinessunitStaffinggroupsRequest(businessUnitId, managementUnitId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitStaffinggroupsRequest createGetWorkforcemanagementBusinessunitStaffinggroupsRequest(String businessUnitId, String managementUnitId, Boolean forceDownloadService) {
    return GetWorkforcemanagementBusinessunitStaffinggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withManagementUnitId(managementUnitId)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Gets a list of staffing groups
   * 
   * @param request The request object
   * @return StaffingGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupListing getWorkforcemanagementBusinessunitStaffinggroups(GetWorkforcemanagementBusinessunitStaffinggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StaffingGroupListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StaffingGroupListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of staffing groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupListing> getWorkforcemanagementBusinessunitStaffinggroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StaffingGroupListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StaffingGroupListing> response = (ApiResponse<StaffingGroupListing>)(ApiResponse<?>)exception;
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
      ApiResponse<StaffingGroupListing> response = (ApiResponse<StaffingGroupListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a time-off limit object
   * Returns properties of time-off limit object, but not daily values
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit to fetch (required)
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse getWorkforcemanagementBusinessunitTimeofflimit(String businessUnitId, String timeOffLimitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitTimeofflimit(createGetWorkforcemanagementBusinessunitTimeofflimitRequest(businessUnitId, timeOffLimitId));
  }

  /**
   * Gets a time-off limit object
   * Returns properties of time-off limit object, but not daily values
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit to fetch (required)
   * @return BuTimeOffLimitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> getWorkforcemanagementBusinessunitTimeofflimitWithHttpInfo(String businessUnitId, String timeOffLimitId) throws IOException {
    return getWorkforcemanagementBusinessunitTimeofflimit(createGetWorkforcemanagementBusinessunitTimeofflimitRequest(businessUnitId, timeOffLimitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitTimeofflimitRequest createGetWorkforcemanagementBusinessunitTimeofflimitRequest(String businessUnitId, String timeOffLimitId) {
    return GetWorkforcemanagementBusinessunitTimeofflimitRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffLimitId(timeOffLimitId)

            .build();
  }

  /**
   * Gets a time-off limit object
   * Returns properties of time-off limit object, but not daily values
   * @param request The request object
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse getWorkforcemanagementBusinessunitTimeofflimit(GetWorkforcemanagementBusinessunitTimeofflimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffLimitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffLimitResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a time-off limit object
   * Returns properties of time-off limit object, but not daily values
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> getWorkforcemanagementBusinessunitTimeofflimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffLimitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a list of time-off limit objects
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific time-off limit objects (optional)
   * @return BuTimeOffLimitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitListing getWorkforcemanagementBusinessunitTimeofflimits(String businessUnitId, String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitTimeofflimits(createGetWorkforcemanagementBusinessunitTimeofflimitsRequest(businessUnitId, managementUnitId));
  }

  /**
   * Gets a list of time-off limit objects
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific time-off limit objects (optional)
   * @return BuTimeOffLimitListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitListing> getWorkforcemanagementBusinessunitTimeofflimitsWithHttpInfo(String businessUnitId, String managementUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitTimeofflimits(createGetWorkforcemanagementBusinessunitTimeofflimitsRequest(businessUnitId, managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitTimeofflimitsRequest createGetWorkforcemanagementBusinessunitTimeofflimitsRequest(String businessUnitId, String managementUnitId) {
    return GetWorkforcemanagementBusinessunitTimeofflimitsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withManagementUnitId(managementUnitId)

            .build();
  }

  /**
   * Gets a list of time-off limit objects
   * 
   * @param request The request object
   * @return BuTimeOffLimitListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitListing getWorkforcemanagementBusinessunitTimeofflimits(GetWorkforcemanagementBusinessunitTimeofflimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffLimitListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffLimitListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of time-off limit objects
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitListing> getWorkforcemanagementBusinessunitTimeofflimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffLimitListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffLimitListing> response = (ApiResponse<BuTimeOffLimitListing>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffLimitListing> response = (ApiResponse<BuTimeOffLimitListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to fetch (required)
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse getWorkforcemanagementBusinessunitTimeoffplan(String businessUnitId, String timeOffPlanId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitTimeoffplan(createGetWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId));
  }

  /**
   * Gets a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to fetch (required)
   * @return BuTimeOffPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> getWorkforcemanagementBusinessunitTimeoffplanWithHttpInfo(String businessUnitId, String timeOffPlanId) throws IOException {
    return getWorkforcemanagementBusinessunitTimeoffplan(createGetWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitTimeoffplanRequest createGetWorkforcemanagementBusinessunitTimeoffplanRequest(String businessUnitId, String timeOffPlanId) {
    return GetWorkforcemanagementBusinessunitTimeoffplanRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffPlanId(timeOffPlanId)

            .build();
  }

  /**
   * Gets a time-off plan
   * 
   * @param request The request object
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse getWorkforcemanagementBusinessunitTimeoffplan(GetWorkforcemanagementBusinessunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a time-off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> getWorkforcemanagementBusinessunitTimeoffplan(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a list of time-off plans
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific staffing groups (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BuTimeOffPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanListing getWorkforcemanagementBusinessunitTimeoffplans(String businessUnitId, String managementUnitId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitTimeoffplans(createGetWorkforcemanagementBusinessunitTimeoffplansRequest(businessUnitId, managementUnitId, forceDownloadService));
  }

  /**
   * Gets a list of time-off plans
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param managementUnitId The ID of the management unit to get management unit specific staffing groups (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BuTimeOffPlanListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanListing> getWorkforcemanagementBusinessunitTimeoffplansWithHttpInfo(String businessUnitId, String managementUnitId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementBusinessunitTimeoffplans(createGetWorkforcemanagementBusinessunitTimeoffplansRequest(businessUnitId, managementUnitId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitTimeoffplansRequest createGetWorkforcemanagementBusinessunitTimeoffplansRequest(String businessUnitId, String managementUnitId, Boolean forceDownloadService) {
    return GetWorkforcemanagementBusinessunitTimeoffplansRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withManagementUnitId(managementUnitId)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Gets a list of time-off plans
   * 
   * @param request The request object
   * @return BuTimeOffPlanListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanListing getWorkforcemanagementBusinessunitTimeoffplans(GetWorkforcemanagementBusinessunitTimeoffplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffPlanListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffPlanListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of time-off plans
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanListing> getWorkforcemanagementBusinessunitTimeoffplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffPlanListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffPlanListing> response = (ApiResponse<BuTimeOffPlanListing>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffPlanListing> response = (ApiResponse<BuTimeOffPlanListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Loads agent's schedule history.
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
   * Loads agent's schedule history.
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
   * Loads agent's schedule history.
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
   * Loads agent's schedule history.
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
   * Get the performance prediction for the associated schedule
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @return PerformancePredictionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionResponse getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictions(String businessUnitId, String weekId, String scheduleId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictions(createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest(businessUnitId, weekId, scheduleId));
  }

  /**
   * Get the performance prediction for the associated schedule
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @return PerformancePredictionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionResponse> getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsWithHttpInfo(String businessUnitId, String weekId, String scheduleId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictions(createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest(businessUnitId, weekId, scheduleId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest(String businessUnitId, String weekId, String scheduleId) {
    return GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Get the performance prediction for the associated schedule
   * 
   * @param request The request object
   * @return PerformancePredictionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionResponse getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictions(GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformancePredictionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformancePredictionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the performance prediction for the associated schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionResponse> getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformancePredictionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformancePredictionResponse> response = (ApiResponse<PerformancePredictionResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformancePredictionResponse> response = (ApiResponse<PerformancePredictionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get recalculated performance prediction result
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the recalculation belongs to (required)
   * @param recalculationId The ID of the recalculation request (required)
   * @return PerformancePredictionRecalculationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationResponse getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculation(String businessUnitId, String weekId, String scheduleId, String recalculationId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculation(createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest(businessUnitId, weekId, scheduleId, recalculationId));
  }

  /**
   * Get recalculated performance prediction result
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the recalculation belongs to (required)
   * @param recalculationId The ID of the recalculation request (required)
   * @return PerformancePredictionRecalculationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationResponse> getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationWithHttpInfo(String businessUnitId, String weekId, String scheduleId, String recalculationId) throws IOException {
    return getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculation(createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest(businessUnitId, weekId, scheduleId, recalculationId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest createGetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest(String businessUnitId, String weekId, String scheduleId, String recalculationId) {
    return GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .withRecalculationId(recalculationId)

            .build();
  }

  /**
   * Get recalculated performance prediction result
   * 
   * @param request The request object
   * @return PerformancePredictionRecalculationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationResponse getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculation(GetWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformancePredictionRecalculationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformancePredictionRecalculationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get recalculated performance prediction result
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationResponse> getWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformancePredictionRecalculationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformancePredictionRecalculationResponse> response = (ApiResponse<PerformancePredictionRecalculationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformancePredictionRecalculationResponse> response = (ApiResponse<PerformancePredictionRecalculationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of week schedules for the specified week
   * Use \"recent\" (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format, or 'recent' (without quotes) to get recent schedules (required)
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
   * Use \"recent\" (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format, or 'recent' (without quotes) to get recent schedules (required)
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
   * Use \"recent\" (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
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
   * Use \"recent\" (without quotes) for the `weekId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any schedule which spans the specified week
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param expand Include to access additional data on the forecast (optional)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param expand Include to access additional data on the forecast (optional)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * Get the staffing requirement by planning group for a forecast
   * 
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param weekNumbers The week numbers to fetch (for multi-week forecasts) staffing requirements. Returns all week data if the list is not specified (optional)
   * @return BuForecastStaffingRequirementsResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastStaffingRequirementsResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirement(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> weekNumbers) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirement(createGetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest(businessUnitId, weekDateId, forecastId, weekNumbers));
  }

  /**
   * Get the staffing requirement by planning group for a forecast
   * 
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param forecastId The ID of the forecast (required)
   * @param weekNumbers The week numbers to fetch (for multi-week forecasts) staffing requirements. Returns all week data if the list is not specified (optional)
   * @return BuForecastStaffingRequirementsResultResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastStaffingRequirementsResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementWithHttpInfo(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> weekNumbers) throws IOException {
    return getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirement(createGetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest(businessUnitId, weekDateId, forecastId, weekNumbers).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest createGetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest(String businessUnitId, LocalDate weekDateId, String forecastId, List<String> weekNumbers) {
    return GetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekDateId(weekDateId)

            .withForecastId(forecastId)

            .withWeekNumbers(weekNumbers)

            .build();
  }

  /**
   * Get the staffing requirement by planning group for a forecast
   * 
   * @param request The request object
   * @return BuForecastStaffingRequirementsResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuForecastStaffingRequirementsResultResponse getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirement(GetWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirementRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuForecastStaffingRequirementsResultResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuForecastStaffingRequirementsResultResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the staffing requirement by planning group for a forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuForecastStaffingRequirementsResultResponse> getWorkforcemanagementBusinessunitWeekShorttermforecastStaffingrequirement(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuForecastStaffingRequirementsResultResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuForecastStaffingRequirementsResultResponse> response = (ApiResponse<BuForecastStaffingRequirementsResultResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuForecastStaffingRequirementsResultResponse> response = (ApiResponse<BuForecastStaffingRequirementsResultResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get short term forecasts
   * Use \"recent\" (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format or 'recent' (without quotes) to fetch recent forecasts (required)
   * @return BuShortTermForecastListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuShortTermForecastListing getWorkforcemanagementBusinessunitWeekShorttermforecasts(String businessUnitId, String weekDateId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWeekShorttermforecasts(createGetWorkforcemanagementBusinessunitWeekShorttermforecastsRequest(businessUnitId, weekDateId));
  }

  /**
   * Get short term forecasts
   * Use \"recent\" (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format or 'recent' (without quotes) to fetch recent forecasts (required)
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
   * Use \"recent\" (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
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
   * Use \"recent\" (without quotes) for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date. Response will include any forecast which spans the specified week
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
   * Get a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The id of the workplanbid (required)
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid getWorkforcemanagementBusinessunitWorkplanbid(String businessUnitId, String bidId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWorkplanbid(createGetWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId));
  }

  /**
   * Get a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The id of the workplanbid (required)
   * @return WorkPlanBid
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> getWorkforcemanagementBusinessunitWorkplanbidWithHttpInfo(String businessUnitId, String bidId) throws IOException {
    return getWorkforcemanagementBusinessunitWorkplanbid(createGetWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWorkplanbidRequest createGetWorkforcemanagementBusinessunitWorkplanbidRequest(String businessUnitId, String bidId) {
    return GetWorkforcemanagementBusinessunitWorkplanbidRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .build();
  }

  /**
   * Get a work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid getWorkforcemanagementBusinessunitWorkplanbid(GetWorkforcemanagementBusinessunitWorkplanbidRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBid> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBid>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> getWorkforcemanagementBusinessunitWorkplanbid(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBid>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse getWorkforcemanagementBusinessunitWorkplanbidGroup(String businessUnitId, String bidId, String bidGroupId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWorkplanbidGroup(createGetWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId));
  }

  /**
   * Get a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @return WorkPlanBidGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> getWorkforcemanagementBusinessunitWorkplanbidGroupWithHttpInfo(String businessUnitId, String bidId, String bidGroupId) throws IOException {
    return getWorkforcemanagementBusinessunitWorkplanbidGroup(createGetWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWorkplanbidGroupRequest createGetWorkforcemanagementBusinessunitWorkplanbidGroupRequest(String businessUnitId, String bidId, String bidGroupId) {
    return GetWorkforcemanagementBusinessunitWorkplanbidGroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBidGroupId(bidGroupId)

            .build();
  }

  /**
   * Get a bid group by bid group Id
   * 
   * @param request The request object
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse getWorkforcemanagementBusinessunitWorkplanbidGroup(GetWorkforcemanagementBusinessunitWorkplanbidGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a bid group by bid group Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> getWorkforcemanagementBusinessunitWorkplanbidGroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the work plan preferences of all the agents in the work plan bid group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId The ID of the work plan bid group (required)
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdminAgentWorkPlanPreferenceResponse getWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(String businessUnitId, String bidId, String bidGroupId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(createGetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(businessUnitId, bidId, bidGroupId));
  }

  /**
   * Gets the work plan preferences of all the agents in the work plan bid group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId The ID of the work plan bid group (required)
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdminAgentWorkPlanPreferenceResponse> getWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesWithHttpInfo(String businessUnitId, String bidId, String bidGroupId) throws IOException {
    return getWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(createGetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(businessUnitId, bidId, bidGroupId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest createGetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(String businessUnitId, String bidId, String bidGroupId) {
    return GetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBidGroupId(bidGroupId)

            .build();
  }

  /**
   * Gets the work plan preferences of all the agents in the work plan bid group
   * 
   * @param request The request object
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdminAgentWorkPlanPreferenceResponse getWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(GetWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdminAgentWorkPlanPreferenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the work plan preferences of all the agents in the work plan bid group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdminAgentWorkPlanPreferenceResponse> getWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdminAgentWorkPlanPreferenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = (ApiResponse<AdminAgentWorkPlanPreferenceResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = (ApiResponse<AdminAgentWorkPlanPreferenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get summary of bid groups that belong to a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @return WorkPlanBidGroupSummaryList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupSummaryList getWorkforcemanagementBusinessunitWorkplanbidGroupsSummary(String businessUnitId, String bidId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWorkplanbidGroupsSummary(createGetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest(businessUnitId, bidId));
  }

  /**
   * Get summary of bid groups that belong to a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @return WorkPlanBidGroupSummaryList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupSummaryList> getWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryWithHttpInfo(String businessUnitId, String bidId) throws IOException {
    return getWorkforcemanagementBusinessunitWorkplanbidGroupsSummary(createGetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest(businessUnitId, bidId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest createGetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest(String businessUnitId, String bidId) {
    return GetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .build();
  }

  /**
   * Get summary of bid groups that belong to a work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBidGroupSummaryList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupSummaryList getWorkforcemanagementBusinessunitWorkplanbidGroupsSummary(GetWorkforcemanagementBusinessunitWorkplanbidGroupsSummaryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidGroupSummaryList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidGroupSummaryList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get summary of bid groups that belong to a work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupSummaryList> getWorkforcemanagementBusinessunitWorkplanbidGroupsSummary(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidGroupSummaryList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidGroupSummaryList> response = (ApiResponse<WorkPlanBidGroupSummaryList>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidGroupSummaryList> response = (ApiResponse<WorkPlanBidGroupSummaryList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of work plan bids
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return WorkPlanBidListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidListResponse getWorkforcemanagementBusinessunitWorkplanbids(String businessUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementBusinessunitWorkplanbids(createGetWorkforcemanagementBusinessunitWorkplanbidsRequest(businessUnitId));
  }

  /**
   * Get list of work plan bids
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @return WorkPlanBidListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidListResponse> getWorkforcemanagementBusinessunitWorkplanbidsWithHttpInfo(String businessUnitId) throws IOException {
    return getWorkforcemanagementBusinessunitWorkplanbids(createGetWorkforcemanagementBusinessunitWorkplanbidsRequest(businessUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementBusinessunitWorkplanbidsRequest createGetWorkforcemanagementBusinessunitWorkplanbidsRequest(String businessUnitId) {
    return GetWorkforcemanagementBusinessunitWorkplanbidsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .build();
  }

  /**
   * Get list of work plan bids
   * 
   * @param request The request object
   * @return WorkPlanBidListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidListResponse getWorkforcemanagementBusinessunitWorkplanbids(GetWorkforcemanagementBusinessunitWorkplanbidsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of work plan bids
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidListResponse> getWorkforcemanagementBusinessunitWorkplanbids(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidListResponse> response = (ApiResponse<WorkPlanBidListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidListResponse> response = (ApiResponse<WorkPlanBidListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get business units
   * 
   * @param feature If specified, the list of business units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of business units belonging to the specified division will be returned (optional)
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
   * @param feature If specified, the list of business units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of business units belonging to the specified division will be returned (optional)
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
   * Retrieves delete job status for historical data imports associated with the job id
   * 
   * @param jobId The job ID of the historical data delete request (required)
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteFilesJobResponse getWorkforcemanagementHistoricaldataBulkRemoveJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementHistoricaldataBulkRemoveJob(createGetWorkforcemanagementHistoricaldataBulkRemoveJobRequest(jobId));
  }

  /**
   * Retrieves delete job status for historical data imports associated with the job id
   * 
   * @param jobId The job ID of the historical data delete request (required)
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteFilesJobResponse> getWorkforcemanagementHistoricaldataBulkRemoveJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementHistoricaldataBulkRemoveJob(createGetWorkforcemanagementHistoricaldataBulkRemoveJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementHistoricaldataBulkRemoveJobRequest createGetWorkforcemanagementHistoricaldataBulkRemoveJobRequest(String jobId) {
    return GetWorkforcemanagementHistoricaldataBulkRemoveJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Retrieves delete job status for historical data imports associated with the job id
   * 
   * @param request The request object
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteFilesJobResponse getWorkforcemanagementHistoricaldataBulkRemoveJob(GetWorkforcemanagementHistoricaldataBulkRemoveJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteFilesJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves delete job status for historical data imports associated with the job id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteFilesJobResponse> getWorkforcemanagementHistoricaldataBulkRemoveJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportDeleteFilesJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = (ApiResponse<HistoricalImportDeleteFilesJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = (ApiResponse<HistoricalImportDeleteFilesJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves all delete job status for historical data
   * 
   * @return HistoricalImportOverallDeleteStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportOverallDeleteStatusResponse getWorkforcemanagementHistoricaldataBulkRemoveJobs() throws IOException, ApiException {
    return  getWorkforcemanagementHistoricaldataBulkRemoveJobs(createGetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest());
  }

  /**
   * Retrieves all delete job status for historical data
   * 
   * @return HistoricalImportOverallDeleteStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportOverallDeleteStatusResponse> getWorkforcemanagementHistoricaldataBulkRemoveJobsWithHttpInfo() throws IOException {
    return getWorkforcemanagementHistoricaldataBulkRemoveJobs(createGetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest createGetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest() {
    return GetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest.builder()
            .build();
  }

  /**
   * Retrieves all delete job status for historical data
   * 
   * @param request The request object
   * @return HistoricalImportOverallDeleteStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportOverallDeleteStatusResponse getWorkforcemanagementHistoricaldataBulkRemoveJobs(GetWorkforcemanagementHistoricaldataBulkRemoveJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportOverallDeleteStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportOverallDeleteStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all delete job status for historical data
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportOverallDeleteStatusResponse> getWorkforcemanagementHistoricaldataBulkRemoveJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportOverallDeleteStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportOverallDeleteStatusResponse> response = (ApiResponse<HistoricalImportOverallDeleteStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HistoricalImportOverallDeleteStatusResponse> response = (ApiResponse<HistoricalImportOverallDeleteStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves status of the historical data imports associated with job id
   * 
   * @param jobId The job Id of the historical data import request (required)
   * @return HistoricalImportStatusJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportStatusJobResponse getWorkforcemanagementHistoricaldataImportstatusJobId(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementHistoricaldataImportstatusJobId(createGetWorkforcemanagementHistoricaldataImportstatusJobIdRequest(jobId));
  }

  /**
   * Retrieves status of the historical data imports associated with job id
   * 
   * @param jobId The job Id of the historical data import request (required)
   * @return HistoricalImportStatusJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportStatusJobResponse> getWorkforcemanagementHistoricaldataImportstatusJobIdWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementHistoricaldataImportstatusJobId(createGetWorkforcemanagementHistoricaldataImportstatusJobIdRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementHistoricaldataImportstatusJobIdRequest createGetWorkforcemanagementHistoricaldataImportstatusJobIdRequest(String jobId) {
    return GetWorkforcemanagementHistoricaldataImportstatusJobIdRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Retrieves status of the historical data imports associated with job id
   * 
   * @param request The request object
   * @return HistoricalImportStatusJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportStatusJobResponse getWorkforcemanagementHistoricaldataImportstatusJobId(GetWorkforcemanagementHistoricaldataImportstatusJobIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportStatusJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportStatusJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves status of the historical data imports associated with job id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportStatusJobResponse> getWorkforcemanagementHistoricaldataImportstatusJobId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportStatusJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportStatusJobResponse> response = (ApiResponse<HistoricalImportStatusJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HistoricalImportStatusJobResponse> response = (ApiResponse<HistoricalImportStatusJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get integrations
   * 
   * @return WfmIntegrationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntegrationListing getWorkforcemanagementIntegrationsHris() throws IOException, ApiException {
    return  getWorkforcemanagementIntegrationsHris(createGetWorkforcemanagementIntegrationsHrisRequest());
  }

  /**
   * Get integrations
   * 
   * @return WfmIntegrationListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntegrationListing> getWorkforcemanagementIntegrationsHrisWithHttpInfo() throws IOException {
    return getWorkforcemanagementIntegrationsHris(createGetWorkforcemanagementIntegrationsHrisRequest().withHttpInfo());
  }

  private GetWorkforcemanagementIntegrationsHrisRequest createGetWorkforcemanagementIntegrationsHrisRequest() {
    return GetWorkforcemanagementIntegrationsHrisRequest.builder()
            .build();
  }

  /**
   * Get integrations
   * 
   * @param request The request object
   * @return WfmIntegrationListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntegrationListing getWorkforcemanagementIntegrationsHris(GetWorkforcemanagementIntegrationsHrisRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmIntegrationListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmIntegrationListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntegrationListing> getWorkforcemanagementIntegrationsHris(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmIntegrationListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntegrationListing> response = (ApiResponse<WfmIntegrationListing>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmIntegrationListing> response = (ApiResponse<WfmIntegrationListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the results of time off types job
   * 
   * @param jobId The ID of the job. (required)
   * @return HrisTimeOffTypesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HrisTimeOffTypesJobResponse getWorkforcemanagementIntegrationsHrisTimeofftypesJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementIntegrationsHrisTimeofftypesJob(createGetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest(jobId));
  }

  /**
   * Query the results of time off types job
   * 
   * @param jobId The ID of the job. (required)
   * @return HrisTimeOffTypesJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HrisTimeOffTypesJobResponse> getWorkforcemanagementIntegrationsHrisTimeofftypesJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementIntegrationsHrisTimeofftypesJob(createGetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest createGetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest(String jobId) {
    return GetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the results of time off types job
   * 
   * @param request The request object
   * @return HrisTimeOffTypesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HrisTimeOffTypesJobResponse getWorkforcemanagementIntegrationsHrisTimeofftypesJob(GetWorkforcemanagementIntegrationsHrisTimeofftypesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HrisTimeOffTypesJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HrisTimeOffTypesJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the results of time off types job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HrisTimeOffTypesJobResponse> getWorkforcemanagementIntegrationsHrisTimeofftypesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HrisTimeOffTypesJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HrisTimeOffTypesJobResponse> response = (ApiResponse<HrisTimeOffTypesJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HrisTimeOffTypesJobResponse> response = (ApiResponse<HrisTimeOffTypesJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get management unit
   * settings.shortTermForecasting is deprecated and now lives on the business unit
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * Deprecated: Instead use /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes. Get the list of activity codes
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(managementUnitId));
  }

  /**
   * Deprecated: Instead use /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes. Get the list of activity codes
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * Deprecated: Instead use /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes. Get the list of activity codes
   * 
   * @param request The request object
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * Deprecated: Instead use /api/v2/workforcemanagement/businessunits/{businessUnitId}/activitycodes. Get the list of activity codes
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @param excludeCapabilities Excludes all capabilities of the agent such as queues, languages, and skills (optional)
   * @param expand  (optional)
   * @return WfmAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmAgent getWorkforcemanagementManagementunitAgent(String managementUnitId, String agentId, Boolean excludeCapabilities, List<String> expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId, excludeCapabilities, expand));
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @param excludeCapabilities Excludes all capabilities of the agent such as queues, languages, and skills (optional)
   * @param expand  (optional)
   * @return WfmAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmAgent> getWorkforcemanagementManagementunitAgentWithHttpInfo(String managementUnitId, String agentId, Boolean excludeCapabilities, List<String> expand) throws IOException {
    return getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId, excludeCapabilities, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitAgentRequest createGetWorkforcemanagementManagementunitAgentRequest(String managementUnitId, String agentId, Boolean excludeCapabilities, List<String> expand) {
    return GetWorkforcemanagementManagementunitAgentRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withAgentId(agentId)

            .withExcludeCapabilities(excludeCapabilities)

            .withExpand(expand)

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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(String managementUnitId, String userId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(managementUnitId, userId));
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(String managementUnitId, String userId) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(managementUnitId, userId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(String managementUnitId, String userId) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withUserId(userId)

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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return WeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public WeekScheduleResponse getWorkforcemanagementManagementunitWeekSchedule(String managementUnitId, String weekId, String scheduleId, String expand, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekSchedule(createGetWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId, expand, forceDownloadService));
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch (required)
   * @param expand Which fields, if any, to expand (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return WeekScheduleResponse
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param includeOnlyPublished Return only published schedules (optional)
   * @param earliestWeekDate The start date of the earliest week to query in yyyy-MM-dd format (optional)
   * @param latestWeekDate The start date of the latest week to query in yyyy-MM-dd format (optional)
   * @return WeekScheduleListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public WeekScheduleListResponse getWorkforcemanagementManagementunitWeekSchedules(String managementUnitId, String weekId, Boolean includeOnlyPublished, String earliestWeekDate, String latestWeekDate) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekSchedules(createGetWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId, includeOnlyPublished, earliestWeekDate, latestWeekDate));
  }

  /**
   * Deprecated.  Use the equivalent business unit resource instead. Get the list of schedules in a week in management unit
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param includeOnlyPublished Return only published schedules (optional)
   * @param earliestWeekDate The start date of the earliest week to query in yyyy-MM-dd format (optional)
   * @param latestWeekDate The start date of the latest week to query in yyyy-MM-dd format (optional)
   * @return WeekScheduleListResponse
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param evaluateMatches Whether to evaluate the matches for violations (optional, default to true)
   * @param includeCrossWeekShifts Whether to include all shift trades with either the initiating shift or the receiving shift in the week (optional, default to false)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return WeekShiftTradeListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekShiftTradeListResponse getWorkforcemanagementManagementunitWeekShifttrades(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches, Boolean includeCrossWeekShifts, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekShifttrades(createGetWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, evaluateMatches, includeCrossWeekShifts, forceDownloadService));
  }

  /**
   * Gets all the shift trades for a given week
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param evaluateMatches Whether to evaluate the matches for violations (optional, default to true)
   * @param includeCrossWeekShifts Whether to include all shift trades with either the initiating shift or the receiving shift in the week (optional, default to false)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return WeekShiftTradeListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekShiftTradeListResponse> getWorkforcemanagementManagementunitWeekShifttradesWithHttpInfo(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches, Boolean includeCrossWeekShifts, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementManagementunitWeekShifttrades(createGetWorkforcemanagementManagementunitWeekShifttradesRequest(managementUnitId, weekDateId, evaluateMatches, includeCrossWeekShifts, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekShifttradesRequest createGetWorkforcemanagementManagementunitWeekShifttradesRequest(String managementUnitId, LocalDate weekDateId, Boolean evaluateMatches, Boolean includeCrossWeekShifts, Boolean forceDownloadService) {
    return GetWorkforcemanagementManagementunitWeekShifttradesRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withWeekDateId(weekDateId)

            .withEvaluateMatches(evaluateMatches)

            .withIncludeCrossWeekShifts(includeCrossWeekShifts)

            .withForceDownloadService(forceDownloadService)

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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
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
   * \"expand=details\" is deprecated
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param expand Include to access additional data on the work plans (optional)
   * @param exclude Exclude specific data on the work plans from the response (optional)
   * @return WorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanListResponse getWorkforcemanagementManagementunitWorkplans(String managementUnitId, List<String> expand, List<String> exclude) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand, exclude));
  }

  /**
   * Get work plans
   * \"expand=details\" is deprecated
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param expand Include to access additional data on the work plans (optional)
   * @param exclude Exclude specific data on the work plans from the response (optional)
   * @return WorkPlanListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanListResponse> getWorkforcemanagementManagementunitWorkplansWithHttpInfo(String managementUnitId, List<String> expand, List<String> exclude) throws IOException {
    return getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand, exclude).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplansRequest createGetWorkforcemanagementManagementunitWorkplansRequest(String managementUnitId, List<String> expand, List<String> exclude) {
    return GetWorkforcemanagementManagementunitWorkplansRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withExpand(expand)

            .withExclude(exclude)

            .build();
  }

  /**
   * Get work plans
   * \"expand=details\" is deprecated
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
   * \"expand=details\" is deprecated
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
   * @param feature If specified, the list of management units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of management units belonging to the specified division will be returned (optional)
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
   * @param feature If specified, the list of management units for which the user is authorized to use the requested feature will be returned (optional)
   * @param divisionId If specified, the list of management units belonging to the specified division will be returned (optional)
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
   * Notifications are only initially sent if you have the relevant Notify and Edit permissions
   * @return NotificationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NotificationsResponse getWorkforcemanagementNotifications() throws IOException, ApiException {
    return  getWorkforcemanagementNotifications(createGetWorkforcemanagementNotificationsRequest());
  }

  /**
   * Get a list of notifications for the current user
   * Notifications are only initially sent if you have the relevant Notify and Edit permissions
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
   * Notifications are only initially sent if you have the relevant Notify and Edit permissions
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
   * Notifications are only initially sent if you have the relevant Notify and Edit permissions
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
   * Request to fetch the status of the historical shrinkage query
   * 
   * @param jobId jobId (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse getWorkforcemanagementShrinkageJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementShrinkageJob(createGetWorkforcemanagementShrinkageJobRequest(jobId));
  }

  /**
   * Request to fetch the status of the historical shrinkage query
   * 
   * @param jobId jobId (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> getWorkforcemanagementShrinkageJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementShrinkageJob(createGetWorkforcemanagementShrinkageJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementShrinkageJobRequest createGetWorkforcemanagementShrinkageJobRequest(String jobId) {
    return GetWorkforcemanagementShrinkageJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Request to fetch the status of the historical shrinkage query
   * 
   * @param request The request object
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse getWorkforcemanagementShrinkageJob(GetWorkforcemanagementShrinkageJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalShrinkageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalShrinkageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request to fetch the status of the historical shrinkage query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> getWorkforcemanagementShrinkageJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalShrinkageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query the results of time off types job
   * 
   * @param jobId The ID of the job. (required)
   * @return TimeOffBalanceJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalanceJobResponse getWorkforcemanagementTimeoffbalanceJob(String jobId) throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffbalanceJob(createGetWorkforcemanagementTimeoffbalanceJobRequest(jobId));
  }

  /**
   * Query the results of time off types job
   * 
   * @param jobId The ID of the job. (required)
   * @return TimeOffBalanceJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalanceJobResponse> getWorkforcemanagementTimeoffbalanceJobWithHttpInfo(String jobId) throws IOException {
    return getWorkforcemanagementTimeoffbalanceJob(createGetWorkforcemanagementTimeoffbalanceJobRequest(jobId).withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffbalanceJobRequest createGetWorkforcemanagementTimeoffbalanceJobRequest(String jobId) {
    return GetWorkforcemanagementTimeoffbalanceJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Query the results of time off types job
   * 
   * @param request The request object
   * @return TimeOffBalanceJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalanceJobResponse getWorkforcemanagementTimeoffbalanceJob(GetWorkforcemanagementTimeoffbalanceJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffBalanceJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffBalanceJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query the results of time off types job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalanceJobResponse> getWorkforcemanagementTimeoffbalanceJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffBalanceJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffBalanceJobResponse> response = (ApiResponse<TimeOffBalanceJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffBalanceJobResponse> response = (ApiResponse<TimeOffBalanceJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a time off request for the current user
   * 
   * @param timeOffRequestId The ID of the time off request (required)
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
   * @param timeOffRequestId The ID of the time off request (required)
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
   * @param timeOffRequestId The ID of the time off request (required)
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
   * @param timeOffRequestId The ID of the time off request (required)
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
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementTimeoffrequests() throws IOException, ApiException {
    return  getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest());
  }

  /**
   * Get a list of time off requests for the current user
   * 
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsWithHttpInfo() throws IOException {
    return getWorkforcemanagementTimeoffrequests(createGetWorkforcemanagementTimeoffrequestsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementTimeoffrequestsRequest createGetWorkforcemanagementTimeoffrequestsRequest() {
    return GetWorkforcemanagementTimeoffrequestsRequest.builder()
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
   * Get work plan bid ranks for a user
   * 
   * @param userId The userId to whom the work plan bid ranks apply. (required)
   * @return WorkPlanBidRanks
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidRanks getWorkforcemanagementUserWorkplanbidranks(String userId) throws IOException, ApiException {
    return  getWorkforcemanagementUserWorkplanbidranks(createGetWorkforcemanagementUserWorkplanbidranksRequest(userId));
  }

  /**
   * Get work plan bid ranks for a user
   * 
   * @param userId The userId to whom the work plan bid ranks apply. (required)
   * @return WorkPlanBidRanks
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidRanks> getWorkforcemanagementUserWorkplanbidranksWithHttpInfo(String userId) throws IOException {
    return getWorkforcemanagementUserWorkplanbidranks(createGetWorkforcemanagementUserWorkplanbidranksRequest(userId).withHttpInfo());
  }

  private GetWorkforcemanagementUserWorkplanbidranksRequest createGetWorkforcemanagementUserWorkplanbidranksRequest(String userId) {
    return GetWorkforcemanagementUserWorkplanbidranksRequest.builder()
            .withUserId(userId)

            .build();
  }

  /**
   * Get work plan bid ranks for a user
   * 
   * @param request The request object
   * @return WorkPlanBidRanks
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidRanks getWorkforcemanagementUserWorkplanbidranks(GetWorkforcemanagementUserWorkplanbidranksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidRanks> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidRanks>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get work plan bid ranks for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidRanks> getWorkforcemanagementUserWorkplanbidranks(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidRanks>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidRanks> response = (ApiResponse<WorkPlanBidRanks>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidRanks> response = (ApiResponse<WorkPlanBidRanks>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets an agent's work plan bidding preference
   * 
   * @param bidId The ID of the work plan bid (required)
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBiddingPreferenceResponse getWorkforcemanagementWorkplanbidPreferences(String bidId) throws IOException, ApiException {
    return  getWorkforcemanagementWorkplanbidPreferences(createGetWorkforcemanagementWorkplanbidPreferencesRequest(bidId));
  }

  /**
   * Gets an agent's work plan bidding preference
   * 
   * @param bidId The ID of the work plan bid (required)
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBiddingPreferenceResponse> getWorkforcemanagementWorkplanbidPreferencesWithHttpInfo(String bidId) throws IOException {
    return getWorkforcemanagementWorkplanbidPreferences(createGetWorkforcemanagementWorkplanbidPreferencesRequest(bidId).withHttpInfo());
  }

  private GetWorkforcemanagementWorkplanbidPreferencesRequest createGetWorkforcemanagementWorkplanbidPreferencesRequest(String bidId) {
    return GetWorkforcemanagementWorkplanbidPreferencesRequest.builder()
            .withBidId(bidId)

            .build();
  }

  /**
   * Gets an agent's work plan bidding preference
   * 
   * @param request The request object
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBiddingPreferenceResponse getWorkforcemanagementWorkplanbidPreferences(GetWorkforcemanagementWorkplanbidPreferencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentWorkPlanBiddingPreferenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets an agent's work plan bidding preference
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBiddingPreferenceResponse> getWorkforcemanagementWorkplanbidPreferences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentWorkPlanBiddingPreferenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = (ApiResponse<AgentWorkPlanBiddingPreferenceResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = (ApiResponse<AgentWorkPlanBiddingPreferenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets an agent's work plans for a bid
   * 
   * @param bidId The ID of the work plan bid (required)
   * @return AgentWorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanListResponse getWorkforcemanagementWorkplanbidWorkplans(String bidId) throws IOException, ApiException {
    return  getWorkforcemanagementWorkplanbidWorkplans(createGetWorkforcemanagementWorkplanbidWorkplansRequest(bidId));
  }

  /**
   * Gets an agent's work plans for a bid
   * 
   * @param bidId The ID of the work plan bid (required)
   * @return AgentWorkPlanListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanListResponse> getWorkforcemanagementWorkplanbidWorkplansWithHttpInfo(String bidId) throws IOException {
    return getWorkforcemanagementWorkplanbidWorkplans(createGetWorkforcemanagementWorkplanbidWorkplansRequest(bidId).withHttpInfo());
  }

  private GetWorkforcemanagementWorkplanbidWorkplansRequest createGetWorkforcemanagementWorkplanbidWorkplansRequest(String bidId) {
    return GetWorkforcemanagementWorkplanbidWorkplansRequest.builder()
            .withBidId(bidId)

            .build();
  }

  /**
   * Gets an agent's work plans for a bid
   * 
   * @param request The request object
   * @return AgentWorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanListResponse getWorkforcemanagementWorkplanbidWorkplans(GetWorkforcemanagementWorkplanbidWorkplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentWorkPlanListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentWorkPlanListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets an agent's work plans for a bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanListResponse> getWorkforcemanagementWorkplanbidWorkplans(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentWorkPlanListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentWorkPlanListResponse> response = (ApiResponse<AgentWorkPlanListResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentWorkPlanListResponse> response = (ApiResponse<AgentWorkPlanListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets the list of work plan bids that belong to an agent
   * 
   * @return AgentWorkPlanBids
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBids getWorkforcemanagementWorkplanbids() throws IOException, ApiException {
    return  getWorkforcemanagementWorkplanbids(createGetWorkforcemanagementWorkplanbidsRequest());
  }

  /**
   * Gets the list of work plan bids that belong to an agent
   * 
   * @return AgentWorkPlanBids
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBids> getWorkforcemanagementWorkplanbidsWithHttpInfo() throws IOException {
    return getWorkforcemanagementWorkplanbids(createGetWorkforcemanagementWorkplanbidsRequest().withHttpInfo());
  }

  private GetWorkforcemanagementWorkplanbidsRequest createGetWorkforcemanagementWorkplanbidsRequest() {
    return GetWorkforcemanagementWorkplanbidsRequest.builder()
            .build();
  }

  /**
   * Gets the list of work plan bids that belong to an agent
   * 
   * @param request The request object
   * @return AgentWorkPlanBids
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBids getWorkforcemanagementWorkplanbids(GetWorkforcemanagementWorkplanbidsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentWorkPlanBids> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentWorkPlanBids>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the list of work plan bids that belong to an agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBids> getWorkforcemanagementWorkplanbids(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentWorkPlanBids>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentWorkPlanBids> response = (ApiResponse<AgentWorkPlanBids>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentWorkPlanBids> response = (ApiResponse<AgentWorkPlanBids>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an adherence explanation
   * 
   * @param agentId The ID of the agent to query (required)
   * @param explanationId The ID of the explanation to update (required)
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse patchWorkforcemanagementAgentAdherenceExplanation(String agentId, String explanationId, UpdateAdherenceExplanationStatusRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementAgentAdherenceExplanation(createPatchWorkforcemanagementAgentAdherenceExplanationRequest(agentId, explanationId, body));
  }

  /**
   * Update an adherence explanation
   * 
   * @param agentId The ID of the agent to query (required)
   * @param explanationId The ID of the explanation to update (required)
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> patchWorkforcemanagementAgentAdherenceExplanationWithHttpInfo(String agentId, String explanationId, UpdateAdherenceExplanationStatusRequest body) throws IOException {
    return patchWorkforcemanagementAgentAdherenceExplanation(createPatchWorkforcemanagementAgentAdherenceExplanationRequest(agentId, explanationId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementAgentAdherenceExplanationRequest createPatchWorkforcemanagementAgentAdherenceExplanationRequest(String agentId, String explanationId, UpdateAdherenceExplanationStatusRequest body) {
    return PatchWorkforcemanagementAgentAdherenceExplanationRequest.builder()
            .withAgentId(agentId)

            .withExplanationId(explanationId)

            .withBody(body)

            .build();
  }

  /**
   * Update an adherence explanation
   * 
   * @param request The request object
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse patchWorkforcemanagementAgentAdherenceExplanation(PatchWorkforcemanagementAgentAdherenceExplanationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an adherence explanation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> patchWorkforcemanagementAgentAdherenceExplanation(ApiRequest<UpdateAdherenceExplanationStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update my alternative shifts trade by trade ID
   * 
   * @param tradeId The ID of the alternative shift trade (required)
   * @param body body (required)
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse patchWorkforcemanagementAlternativeshiftsTrade(String tradeId, AgentUpdateAlternativeShiftTradeRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementAlternativeshiftsTrade(createPatchWorkforcemanagementAlternativeshiftsTradeRequest(tradeId, body));
  }

  /**
   * Update my alternative shifts trade by trade ID
   * 
   * @param tradeId The ID of the alternative shift trade (required)
   * @param body body (required)
   * @return AlternativeShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> patchWorkforcemanagementAlternativeshiftsTradeWithHttpInfo(String tradeId, AgentUpdateAlternativeShiftTradeRequest body) throws IOException {
    return patchWorkforcemanagementAlternativeshiftsTrade(createPatchWorkforcemanagementAlternativeshiftsTradeRequest(tradeId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementAlternativeshiftsTradeRequest createPatchWorkforcemanagementAlternativeshiftsTradeRequest(String tradeId, AgentUpdateAlternativeShiftTradeRequest body) {
    return PatchWorkforcemanagementAlternativeshiftsTradeRequest.builder()
            .withTradeId(tradeId)

            .withBody(body)

            .build();
  }

  /**
   * Update my alternative shifts trade by trade ID
   * 
   * @param request The request object
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse patchWorkforcemanagementAlternativeshiftsTrade(PatchWorkforcemanagementAlternativeshiftsTradeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update my alternative shifts trade by trade ID
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> patchWorkforcemanagementAlternativeshiftsTrade(ApiRequest<AgentUpdateAlternativeShiftTradeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Bulk update alternative shift trade states
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse patchWorkforcemanagementAlternativeshiftsTradesStateJobs(AdminBulkUpdateAlternativeShiftTradeStateRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementAlternativeshiftsTradesStateJobs(createPatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest(body));
  }

  /**
   * Bulk update alternative shift trade states
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> patchWorkforcemanagementAlternativeshiftsTradesStateJobsWithHttpInfo(AdminBulkUpdateAlternativeShiftTradeStateRequest body) throws IOException {
    return patchWorkforcemanagementAlternativeshiftsTradesStateJobs(createPatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest(body).withHttpInfo());
  }

  private PatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest createPatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest(AdminBulkUpdateAlternativeShiftTradeStateRequest body) {
    return PatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Bulk update alternative shift trade states
   * 
   * @param request The request object
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse patchWorkforcemanagementAlternativeshiftsTradesStateJobs(PatchWorkforcemanagementAlternativeshiftsTradesStateJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Bulk update alternative shift trade states
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> patchWorkforcemanagementAlternativeshiftsTradesStateJobs(ApiRequest<AdminBulkUpdateAlternativeShiftTradeStateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update business unit
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param body body (required)
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse patchWorkforcemanagementBusinessunit(String businessUnitId, UpdateBusinessUnitRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunit(createPatchWorkforcemanagementBusinessunitRequest(businessUnitId, body));
  }

  /**
   * Update business unit
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param body body (required)
   * @return BusinessUnitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitResponse> patchWorkforcemanagementBusinessunitWithHttpInfo(String businessUnitId, UpdateBusinessUnitRequest body) throws IOException {
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
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse patchWorkforcemanagementBusinessunit(PatchWorkforcemanagementBusinessunitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitResponse>() {});
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
  public ApiResponse<BusinessUnitResponse> patchWorkforcemanagementBusinessunit(ApiRequest<UpdateBusinessUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an activity code
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to update (required)
   * @param body body (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param activityCodeId The ID of the activity code to update (required)
   * @param body body (required)
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
   * Update an activity plan
   * If a job associated with the activity plan is in 'Processing' state the activity plan cannot be updated
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to update (required)
   * @param body body (required)
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse patchWorkforcemanagementBusinessunitActivityplan(String businessUnitId, String activityPlanId, UpdateActivityPlanRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitActivityplan(createPatchWorkforcemanagementBusinessunitActivityplanRequest(businessUnitId, activityPlanId, body));
  }

  /**
   * Update an activity plan
   * If a job associated with the activity plan is in 'Processing' state the activity plan cannot be updated
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to update (required)
   * @param body body (required)
   * @return ActivityPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> patchWorkforcemanagementBusinessunitActivityplanWithHttpInfo(String businessUnitId, String activityPlanId, UpdateActivityPlanRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitActivityplan(createPatchWorkforcemanagementBusinessunitActivityplanRequest(businessUnitId, activityPlanId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitActivityplanRequest createPatchWorkforcemanagementBusinessunitActivityplanRequest(String businessUnitId, String activityPlanId, UpdateActivityPlanRequest body) {
    return PatchWorkforcemanagementBusinessunitActivityplanRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withActivityPlanId(activityPlanId)

            .withBody(body)

            .build();
  }

  /**
   * Update an activity plan
   * If a job associated with the activity plan is in 'Processing' state the activity plan cannot be updated
   * @param request The request object
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse patchWorkforcemanagementBusinessunitActivityplan(PatchWorkforcemanagementBusinessunitActivityplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an activity plan
   * If a job associated with the activity plan is in 'Processing' state the activity plan cannot be updated
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> patchWorkforcemanagementBusinessunitActivityplan(ApiRequest<UpdateActivityPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update alternative shifts settings for a business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse patchWorkforcemanagementBusinessunitAlternativeshiftsSettings(String businessUnitId, UpdateAlternativeShiftBuSettingsRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitAlternativeshiftsSettings(createPatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(businessUnitId, body));
  }

  /**
   * Update alternative shifts settings for a business unit
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return AlternativeShiftBuSettingsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> patchWorkforcemanagementBusinessunitAlternativeshiftsSettingsWithHttpInfo(String businessUnitId, UpdateAlternativeShiftBuSettingsRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitAlternativeshiftsSettings(createPatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(businessUnitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest createPatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest(String businessUnitId, UpdateAlternativeShiftBuSettingsRequest body) {
    return PatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Update alternative shifts settings for a business unit
   * 
   * @param request The request object
   * @return AlternativeShiftBuSettingsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftBuSettingsResponse patchWorkforcemanagementBusinessunitAlternativeshiftsSettings(PatchWorkforcemanagementBusinessunitAlternativeshiftsSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftBuSettingsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftBuSettingsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update alternative shifts settings for a business unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftBuSettingsResponse> patchWorkforcemanagementBusinessunitAlternativeshiftsSettings(ApiRequest<UpdateAlternativeShiftBuSettingsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftBuSettingsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftBuSettingsResponse> response = (ApiResponse<AlternativeShiftBuSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates the planning group
   * 
   * @param businessUnitId The ID of the business unit. (required)
   * @param planningGroupId The ID of a planning group to update (required)
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * Updates a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to update (required)
   * @param body body (required)
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse patchWorkforcemanagementBusinessunitStaffinggroup(String businessUnitId, String staffingGroupId, UpdateStaffingGroupRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitStaffinggroup(createPatchWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId, body));
  }

  /**
   * Updates a staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param staffingGroupId The ID of the staffing group to update (required)
   * @param body body (required)
   * @return StaffingGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> patchWorkforcemanagementBusinessunitStaffinggroupWithHttpInfo(String businessUnitId, String staffingGroupId, UpdateStaffingGroupRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitStaffinggroup(createPatchWorkforcemanagementBusinessunitStaffinggroupRequest(businessUnitId, staffingGroupId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitStaffinggroupRequest createPatchWorkforcemanagementBusinessunitStaffinggroupRequest(String businessUnitId, String staffingGroupId, UpdateStaffingGroupRequest body) {
    return PatchWorkforcemanagementBusinessunitStaffinggroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withStaffingGroupId(staffingGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a staffing group
   * 
   * @param request The request object
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse patchWorkforcemanagementBusinessunitStaffinggroup(PatchWorkforcemanagementBusinessunitStaffinggroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StaffingGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StaffingGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a staffing group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> patchWorkforcemanagementBusinessunitStaffinggroup(ApiRequest<UpdateStaffingGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StaffingGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to update (required)
   * @param body body (required)
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse patchWorkforcemanagementBusinessunitTimeoffplan(String businessUnitId, String timeOffPlanId, BuUpdateTimeOffPlanRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitTimeoffplan(createPatchWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId, body));
  }

  /**
   * Updates a time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffPlanId The ID of the time-off plan to update (required)
   * @param body body (required)
   * @return BuTimeOffPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> patchWorkforcemanagementBusinessunitTimeoffplanWithHttpInfo(String businessUnitId, String timeOffPlanId, BuUpdateTimeOffPlanRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitTimeoffplan(createPatchWorkforcemanagementBusinessunitTimeoffplanRequest(businessUnitId, timeOffPlanId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitTimeoffplanRequest createPatchWorkforcemanagementBusinessunitTimeoffplanRequest(String businessUnitId, String timeOffPlanId, BuUpdateTimeOffPlanRequest body) {
    return PatchWorkforcemanagementBusinessunitTimeoffplanRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffPlanId(timeOffPlanId)

            .withBody(body)

            .build();
  }

  /**
   * Updates a time-off plan
   * 
   * @param request The request object
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse patchWorkforcemanagementBusinessunitTimeoffplan(PatchWorkforcemanagementBusinessunitTimeoffplanRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates a time-off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> patchWorkforcemanagementBusinessunitTimeoffplan(ApiRequest<BuUpdateTimeOffPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The id of the workplanbid (required)
   * @param body The work plan bid to be updated (required)
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid patchWorkforcemanagementBusinessunitWorkplanbid(String businessUnitId, String bidId, UpdateWorkPlanBid body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitWorkplanbid(createPatchWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId, body));
  }

  /**
   * Update work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The id of the workplanbid (required)
   * @param body The work plan bid to be updated (required)
   * @return WorkPlanBid
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> patchWorkforcemanagementBusinessunitWorkplanbidWithHttpInfo(String businessUnitId, String bidId, UpdateWorkPlanBid body) throws IOException {
    return patchWorkforcemanagementBusinessunitWorkplanbid(createPatchWorkforcemanagementBusinessunitWorkplanbidRequest(businessUnitId, bidId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitWorkplanbidRequest createPatchWorkforcemanagementBusinessunitWorkplanbidRequest(String businessUnitId, String bidId, UpdateWorkPlanBid body) {
    return PatchWorkforcemanagementBusinessunitWorkplanbidRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBody(body)

            .build();
  }

  /**
   * Update work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid patchWorkforcemanagementBusinessunitWorkplanbid(PatchWorkforcemanagementBusinessunitWorkplanbidRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBid> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBid>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> patchWorkforcemanagementBusinessunitWorkplanbid(ApiRequest<UpdateWorkPlanBid> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBid>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @param body body (required)
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse patchWorkforcemanagementBusinessunitWorkplanbidGroup(String businessUnitId, String bidId, String bidGroupId, WorkPlanBidGroupUpdate body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitWorkplanbidGroup(createPatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId, body));
  }

  /**
   * Update a bid group by bid group Id
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId Work Plan Bid Group id (required)
   * @param body body (required)
   * @return WorkPlanBidGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> patchWorkforcemanagementBusinessunitWorkplanbidGroupWithHttpInfo(String businessUnitId, String bidId, String bidGroupId, WorkPlanBidGroupUpdate body) throws IOException {
    return patchWorkforcemanagementBusinessunitWorkplanbidGroup(createPatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest(businessUnitId, bidId, bidGroupId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest createPatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest(String businessUnitId, String bidId, String bidGroupId, WorkPlanBidGroupUpdate body) {
    return PatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBidGroupId(bidGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Update a bid group by bid group Id
   * 
   * @param request The request object
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse patchWorkforcemanagementBusinessunitWorkplanbidGroup(PatchWorkforcemanagementBusinessunitWorkplanbidGroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a bid group by bid group Id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> patchWorkforcemanagementBusinessunitWorkplanbidGroup(ApiRequest<WorkPlanBidGroupUpdate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Overrides the assigned work plan for the specified agents
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId The ID of the work plan bid group (required)
   * @param body body (required)
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdminAgentWorkPlanPreferenceResponse patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(String businessUnitId, String bidId, String bidGroupId, AgentsBidAssignedWorkPlanOverrideRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(createPatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(businessUnitId, bidId, bidGroupId, body));
  }

  /**
   * Overrides the assigned work plan for the specified agents
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param bidGroupId The ID of the work plan bid group (required)
   * @param body body (required)
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdminAgentWorkPlanPreferenceResponse> patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesWithHttpInfo(String businessUnitId, String bidId, String bidGroupId, AgentsBidAssignedWorkPlanOverrideRequest body) throws IOException {
    return patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(createPatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(businessUnitId, bidId, bidGroupId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest createPatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest(String businessUnitId, String bidId, String bidGroupId, AgentsBidAssignedWorkPlanOverrideRequest body) {
    return PatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBidGroupId(bidGroupId)

            .withBody(body)

            .build();
  }

  /**
   * Overrides the assigned work plan for the specified agents
   * 
   * @param request The request object
   * @return AdminAgentWorkPlanPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdminAgentWorkPlanPreferenceResponse patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(PatchWorkforcemanagementBusinessunitWorkplanbidGroupPreferencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdminAgentWorkPlanPreferenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Overrides the assigned work plan for the specified agents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdminAgentWorkPlanPreferenceResponse> patchWorkforcemanagementBusinessunitWorkplanbidGroupPreferences(ApiRequest<AgentsBidAssignedWorkPlanOverrideRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdminAgentWorkPlanPreferenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = (ApiResponse<AdminAgentWorkPlanPreferenceResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdminAgentWorkPlanPreferenceResponse> response = (ApiResponse<AdminAgentWorkPlanPreferenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the requested management unit
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * Update agent configurations
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementManagementunitAgents(String managementUnitId, UpdateMuAgentsRequest body) throws IOException, ApiException {
     patchWorkforcemanagementManagementunitAgents(createPatchWorkforcemanagementManagementunitAgentsRequest(managementUnitId, body));
  }

  /**
   * Update agent configurations
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementManagementunitAgentsWithHttpInfo(String managementUnitId, UpdateMuAgentsRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitAgents(createPatchWorkforcemanagementManagementunitAgentsRequest(managementUnitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitAgentsRequest createPatchWorkforcemanagementManagementunitAgentsRequest(String managementUnitId, UpdateMuAgentsRequest body) {
    return PatchWorkforcemanagementManagementunitAgentsRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Update agent configurations
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchWorkforcemanagementManagementunitAgents(PatchWorkforcemanagementManagementunitAgentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update agent configurations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchWorkforcemanagementManagementunitAgents(ApiRequest<UpdateMuAgentsRequest> request) throws IOException {
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
   * Updates agent work plan configuration
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @return UpdateMuAgentWorkPlansBatchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateMuAgentWorkPlansBatchResponse patchWorkforcemanagementManagementunitAgentsWorkplansBulk(String managementUnitId, UpdateMuAgentWorkPlansBatchRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitAgentsWorkplansBulk(createPatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest(managementUnitId, body));
  }

  /**
   * Updates agent work plan configuration
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @return UpdateMuAgentWorkPlansBatchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateMuAgentWorkPlansBatchResponse> patchWorkforcemanagementManagementunitAgentsWorkplansBulkWithHttpInfo(String managementUnitId, UpdateMuAgentWorkPlansBatchRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitAgentsWorkplansBulk(createPatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest(managementUnitId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest createPatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest(String managementUnitId, UpdateMuAgentWorkPlansBatchRequest body) {
    return PatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Updates agent work plan configuration
   * 
   * @param request The request object
   * @return UpdateMuAgentWorkPlansBatchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateMuAgentWorkPlansBatchResponse patchWorkforcemanagementManagementunitAgentsWorkplansBulk(PatchWorkforcemanagementManagementunitAgentsWorkplansBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UpdateMuAgentWorkPlansBatchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UpdateMuAgentWorkPlansBatchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates agent work plan configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateMuAgentWorkPlansBatchResponse> patchWorkforcemanagementManagementunitAgentsWorkplansBulk(ApiRequest<UpdateMuAgentWorkPlansBatchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UpdateMuAgentWorkPlansBatchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UpdateMuAgentWorkPlansBatchResponse> response = (ApiResponse<UpdateMuAgentWorkPlansBatchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UpdateMuAgentWorkPlansBatchResponse> response = (ApiResponse<UpdateMuAgentWorkPlansBatchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates a time off limit object.
   * Updates time off limit object properties, but not daily values.
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffLimitId The id of time off limit object to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffLimitId The id of time off limit object to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param timeOffPlanId The ID of the time off plan to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param timeOffPlanId The ID of the time off plan to update (required)
   * @param body body (required)
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
   * Set integration status for a time off request.
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffRequestId The ID of the time off request. (required)
   * @param userId The ID of user to whom the time off request belongs. (required)
   * @param body body (required)
   * @return UserTimeOffIntegrationStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserTimeOffIntegrationStatusResponse patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatus(String managementUnitId, String timeOffRequestId, String userId, SetTimeOffIntegrationStatusRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatus(createPatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest(managementUnitId, timeOffRequestId, userId, body));
  }

  /**
   * Set integration status for a time off request.
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffRequestId The ID of the time off request. (required)
   * @param userId The ID of user to whom the time off request belongs. (required)
   * @param body body (required)
   * @return UserTimeOffIntegrationStatusResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserTimeOffIntegrationStatusResponse> patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusWithHttpInfo(String managementUnitId, String timeOffRequestId, String userId, SetTimeOffIntegrationStatusRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatus(createPatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest(managementUnitId, timeOffRequestId, userId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest createPatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest(String managementUnitId, String timeOffRequestId, String userId, SetTimeOffIntegrationStatusRequest body) {
    return PatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withTimeOffRequestId(timeOffRequestId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Set integration status for a time off request.
   * 
   * @param request The request object
   * @return UserTimeOffIntegrationStatusResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserTimeOffIntegrationStatusResponse patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatus(PatchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserTimeOffIntegrationStatusResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserTimeOffIntegrationStatusResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Set integration status for a time off request.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserTimeOffIntegrationStatusResponse> patchWorkforcemanagementManagementunitTimeoffrequestUserIntegrationstatus(ApiRequest<SetTimeOffIntegrationStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserTimeOffIntegrationStatusResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserTimeOffIntegrationStatusResponse> response = (ApiResponse<UserTimeOffIntegrationStatusResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UserTimeOffIntegrationStatusResponse> response = (ApiResponse<UserTimeOffIntegrationStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a time off request
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @param body body (required)
   * @return ShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShiftTradeResponse patchWorkforcemanagementManagementunitWeekShifttrade(String managementUnitId, LocalDate weekDateId, String tradeId, PatchShiftTradeRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWeekShifttrade(createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(managementUnitId, weekDateId, tradeId, body));
  }

  /**
   * Updates a shift trade. This route can only be called by the initiating agent
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @param body body (required)
   * @return ShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShiftTradeResponse> patchWorkforcemanagementManagementunitWeekShifttradeWithHttpInfo(String managementUnitId, LocalDate weekDateId, String tradeId, PatchShiftTradeRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitWeekShifttrade(createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(managementUnitId, weekDateId, tradeId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWeekShifttradeRequest createPatchWorkforcemanagementManagementunitWeekShifttradeRequest(String managementUnitId, LocalDate weekDateId, String tradeId, PatchShiftTradeRequest body) {
    return PatchWorkforcemanagementManagementunitWeekShifttradeRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withWeekDateId(weekDateId)

            .withTradeId(tradeId)

            .withBody(body)

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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to update (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to update (required)
   * @param body body (required)
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
   * @param timeOffRequestId The ID of the time off request (required)
   * @param body body (required)
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
   * @param timeOffRequestId The ID of the time off request (required)
   * @param body body (required)
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
   * Update work plan bid ranks for a user
   * 
   * @param userId The userId to whom the work plan bid ranks apply. (required)
   * @param body body (required)
   * @return WorkPlanBidRanks
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidRanks patchWorkforcemanagementUserWorkplanbidranks(String userId, WorkPlanBidRanks body) throws IOException, ApiException {
    return  patchWorkforcemanagementUserWorkplanbidranks(createPatchWorkforcemanagementUserWorkplanbidranksRequest(userId, body));
  }

  /**
   * Update work plan bid ranks for a user
   * 
   * @param userId The userId to whom the work plan bid ranks apply. (required)
   * @param body body (required)
   * @return WorkPlanBidRanks
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidRanks> patchWorkforcemanagementUserWorkplanbidranksWithHttpInfo(String userId, WorkPlanBidRanks body) throws IOException {
    return patchWorkforcemanagementUserWorkplanbidranks(createPatchWorkforcemanagementUserWorkplanbidranksRequest(userId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementUserWorkplanbidranksRequest createPatchWorkforcemanagementUserWorkplanbidranksRequest(String userId, WorkPlanBidRanks body) {
    return PatchWorkforcemanagementUserWorkplanbidranksRequest.builder()
            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Update work plan bid ranks for a user
   * 
   * @param request The request object
   * @return WorkPlanBidRanks
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidRanks patchWorkforcemanagementUserWorkplanbidranks(PatchWorkforcemanagementUserWorkplanbidranksRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidRanks> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidRanks>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update work plan bid ranks for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidRanks> patchWorkforcemanagementUserWorkplanbidranks(ApiRequest<WorkPlanBidRanks> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidRanks>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidRanks> response = (ApiResponse<WorkPlanBidRanks>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidRanks> response = (ApiResponse<WorkPlanBidRanks>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update bulk work plan bid ranks on users. Max 50 users can be updated at a time.
   * 
   * @param body Users (required)
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing patchWorkforcemanagementUsersWorkplanbidranksBulk(List<WorkPlanBidRanks> body) throws IOException, ApiException {
    return  patchWorkforcemanagementUsersWorkplanbidranksBulk(createPatchWorkforcemanagementUsersWorkplanbidranksBulkRequest(body));
  }

  /**
   * Update bulk work plan bid ranks on users. Max 50 users can be updated at a time.
   * 
   * @param body Users (required)
   * @return EntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> patchWorkforcemanagementUsersWorkplanbidranksBulkWithHttpInfo(List<WorkPlanBidRanks> body) throws IOException {
    return patchWorkforcemanagementUsersWorkplanbidranksBulk(createPatchWorkforcemanagementUsersWorkplanbidranksBulkRequest(body).withHttpInfo());
  }

  private PatchWorkforcemanagementUsersWorkplanbidranksBulkRequest createPatchWorkforcemanagementUsersWorkplanbidranksBulkRequest(List<WorkPlanBidRanks> body) {
    return PatchWorkforcemanagementUsersWorkplanbidranksBulkRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update bulk work plan bid ranks on users. Max 50 users can be updated at a time.
   * 
   * @param request The request object
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing patchWorkforcemanagementUsersWorkplanbidranksBulk(PatchWorkforcemanagementUsersWorkplanbidranksBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update bulk work plan bid ranks on users. Max 50 users can be updated at a time.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> patchWorkforcemanagementUsersWorkplanbidranksBulk(ApiRequest<List<WorkPlanBidRanks>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an agent's work plan bidding preference
   * 
   * @param bidId The ID of the work plan bid (required)
   * @param body body (required)
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBiddingPreferenceResponse patchWorkforcemanagementWorkplanbidPreferences(String bidId, UpdateAgentWorkPlanBiddingPreference body) throws IOException, ApiException {
    return  patchWorkforcemanagementWorkplanbidPreferences(createPatchWorkforcemanagementWorkplanbidPreferencesRequest(bidId, body));
  }

  /**
   * Update an agent's work plan bidding preference
   * 
   * @param bidId The ID of the work plan bid (required)
   * @param body body (required)
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBiddingPreferenceResponse> patchWorkforcemanagementWorkplanbidPreferencesWithHttpInfo(String bidId, UpdateAgentWorkPlanBiddingPreference body) throws IOException {
    return patchWorkforcemanagementWorkplanbidPreferences(createPatchWorkforcemanagementWorkplanbidPreferencesRequest(bidId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementWorkplanbidPreferencesRequest createPatchWorkforcemanagementWorkplanbidPreferencesRequest(String bidId, UpdateAgentWorkPlanBiddingPreference body) {
    return PatchWorkforcemanagementWorkplanbidPreferencesRequest.builder()
            .withBidId(bidId)

            .withBody(body)

            .build();
  }

  /**
   * Update an agent's work plan bidding preference
   * 
   * @param request The request object
   * @return AgentWorkPlanBiddingPreferenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentWorkPlanBiddingPreferenceResponse patchWorkforcemanagementWorkplanbidPreferences(PatchWorkforcemanagementWorkplanbidPreferencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentWorkPlanBiddingPreferenceResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an agent's work plan bidding preference
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentWorkPlanBiddingPreferenceResponse> patchWorkforcemanagementWorkplanbidPreferences(ApiRequest<UpdateAgentWorkPlanBiddingPreference> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentWorkPlanBiddingPreferenceResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = (ApiResponse<AgentWorkPlanBiddingPreferenceResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentWorkPlanBiddingPreferenceResponse> response = (ApiResponse<AgentWorkPlanBiddingPreferenceResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Submit an adherence explanation for the current user
   * 
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse postWorkforcemanagementAdherenceExplanations(AddAdherenceExplanationAgentRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAdherenceExplanations(createPostWorkforcemanagementAdherenceExplanationsRequest(body));
  }

  /**
   * Submit an adherence explanation for the current user
   * 
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> postWorkforcemanagementAdherenceExplanationsWithHttpInfo(AddAdherenceExplanationAgentRequest body) throws IOException {
    return postWorkforcemanagementAdherenceExplanations(createPostWorkforcemanagementAdherenceExplanationsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAdherenceExplanationsRequest createPostWorkforcemanagementAdherenceExplanationsRequest(AddAdherenceExplanationAgentRequest body) {
    return PostWorkforcemanagementAdherenceExplanationsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Submit an adherence explanation for the current user
   * 
   * @param request The request object
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse postWorkforcemanagementAdherenceExplanations(PostWorkforcemanagementAdherenceExplanationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Submit an adherence explanation for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> postWorkforcemanagementAdherenceExplanations(ApiRequest<AddAdherenceExplanationAgentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query adherence explanations for the current user
   * 
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return QueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryAdherenceExplanationsResponse postWorkforcemanagementAdherenceExplanationsQuery(AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementAdherenceExplanationsQuery(createPostWorkforcemanagementAdherenceExplanationsQueryRequest(body, forceAsync, forceDownloadService));
  }

  /**
   * Query adherence explanations for the current user
   * 
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return QueryAdherenceExplanationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryAdherenceExplanationsResponse> postWorkforcemanagementAdherenceExplanationsQueryWithHttpInfo(AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementAdherenceExplanationsQuery(createPostWorkforcemanagementAdherenceExplanationsQueryRequest(body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementAdherenceExplanationsQueryRequest createPostWorkforcemanagementAdherenceExplanationsQueryRequest(AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementAdherenceExplanationsQueryRequest.builder()
            .withBody(body)

            .withForceAsync(forceAsync)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Query adherence explanations for the current user
   * 
   * @param request The request object
   * @return QueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueryAdherenceExplanationsResponse postWorkforcemanagementAdherenceExplanationsQuery(PostWorkforcemanagementAdherenceExplanationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueryAdherenceExplanationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueryAdherenceExplanationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query adherence explanations for the current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueryAdherenceExplanationsResponse> postWorkforcemanagementAdherenceExplanationsQuery(ApiRequest<AgentQueryAdherenceExplanationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueryAdherenceExplanationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueryAdherenceExplanationsResponse> response = (ApiResponse<QueryAdherenceExplanationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<QueryAdherenceExplanationsResponse> response = (ApiResponse<QueryAdherenceExplanationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Deprecated. Use bulk routes instead (/adherence/historical/bulk)
   * 
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementAdherenceHistorical(WfmHistoricalAdherenceQueryForUsers body) throws IOException, ApiException {
    return  postWorkforcemanagementAdherenceHistorical(createPostWorkforcemanagementAdherenceHistoricalRequest(body));
  }

  /**
   * Deprecated. Use bulk routes instead (/adherence/historical/bulk)
   * 
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * Deprecated. Use bulk routes instead (/adherence/historical/bulk)
   * 
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * Deprecated. Use bulk routes instead (/adherence/historical/bulk)
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * Request a historical adherence report in bulk
   * 
   * @param body body (required)
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceBulkResponse postWorkforcemanagementAdherenceHistoricalBulk(WfmHistoricalAdherenceBulkQuery body) throws IOException, ApiException {
    return  postWorkforcemanagementAdherenceHistoricalBulk(createPostWorkforcemanagementAdherenceHistoricalBulkRequest(body));
  }

  /**
   * Request a historical adherence report in bulk
   * 
   * @param body body (required)
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceBulkResponse> postWorkforcemanagementAdherenceHistoricalBulkWithHttpInfo(WfmHistoricalAdherenceBulkQuery body) throws IOException {
    return postWorkforcemanagementAdherenceHistoricalBulk(createPostWorkforcemanagementAdherenceHistoricalBulkRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAdherenceHistoricalBulkRequest createPostWorkforcemanagementAdherenceHistoricalBulkRequest(WfmHistoricalAdherenceBulkQuery body) {
    return PostWorkforcemanagementAdherenceHistoricalBulkRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Request a historical adherence report in bulk
   * 
   * @param request The request object
   * @return WfmHistoricalAdherenceBulkResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceBulkResponse postWorkforcemanagementAdherenceHistoricalBulk(PostWorkforcemanagementAdherenceHistoricalBulkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceBulkResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical adherence report in bulk
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceBulkResponse> postWorkforcemanagementAdherenceHistoricalBulk(ApiRequest<WfmHistoricalAdherenceBulkQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalAdherenceBulkResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = (ApiResponse<WfmHistoricalAdherenceBulkResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalAdherenceBulkResponse> response = (ApiResponse<WfmHistoricalAdherenceBulkResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add an adherence explanation for the requested user
   * 
   * @param agentId The ID of the agent to query (required)
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse postWorkforcemanagementAgentAdherenceExplanations(String agentId, AddAdherenceExplanationAdminRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAgentAdherenceExplanations(createPostWorkforcemanagementAgentAdherenceExplanationsRequest(agentId, body));
  }

  /**
   * Add an adherence explanation for the requested user
   * 
   * @param agentId The ID of the agent to query (required)
   * @param body The request body (required)
   * @return AdherenceExplanationAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> postWorkforcemanagementAgentAdherenceExplanationsWithHttpInfo(String agentId, AddAdherenceExplanationAdminRequest body) throws IOException {
    return postWorkforcemanagementAgentAdherenceExplanations(createPostWorkforcemanagementAgentAdherenceExplanationsRequest(agentId, body).withHttpInfo());
  }

  private PostWorkforcemanagementAgentAdherenceExplanationsRequest createPostWorkforcemanagementAgentAdherenceExplanationsRequest(String agentId, AddAdherenceExplanationAdminRequest body) {
    return PostWorkforcemanagementAgentAdherenceExplanationsRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .build();
  }

  /**
   * Add an adherence explanation for the requested user
   * 
   * @param request The request object
   * @return AdherenceExplanationAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AdherenceExplanationAsyncResponse postWorkforcemanagementAgentAdherenceExplanations(PostWorkforcemanagementAgentAdherenceExplanationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AdherenceExplanationAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AdherenceExplanationAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add an adherence explanation for the requested user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AdherenceExplanationAsyncResponse> postWorkforcemanagementAgentAdherenceExplanations(ApiRequest<AddAdherenceExplanationAdminRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AdherenceExplanationAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AdherenceExplanationAsyncResponse> response = (ApiResponse<AdherenceExplanationAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query adherence explanations for the given agent across a specified range
   * 
   * @param agentId The ID of the agent to query (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return AgentQueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentQueryAdherenceExplanationsResponse postWorkforcemanagementAgentAdherenceExplanationsQuery(String agentId, AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementAgentAdherenceExplanationsQuery(createPostWorkforcemanagementAgentAdherenceExplanationsQueryRequest(agentId, body, forceAsync, forceDownloadService));
  }

  /**
   * Query adherence explanations for the given agent across a specified range
   * 
   * @param agentId The ID of the agent to query (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return AgentQueryAdherenceExplanationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentQueryAdherenceExplanationsResponse> postWorkforcemanagementAgentAdherenceExplanationsQueryWithHttpInfo(String agentId, AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementAgentAdherenceExplanationsQuery(createPostWorkforcemanagementAgentAdherenceExplanationsQueryRequest(agentId, body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementAgentAdherenceExplanationsQueryRequest createPostWorkforcemanagementAgentAdherenceExplanationsQueryRequest(String agentId, AgentQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementAgentAdherenceExplanationsQueryRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .withForceAsync(forceAsync)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Query adherence explanations for the given agent across a specified range
   * 
   * @param request The request object
   * @return AgentQueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentQueryAdherenceExplanationsResponse postWorkforcemanagementAgentAdherenceExplanationsQuery(PostWorkforcemanagementAgentAdherenceExplanationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentQueryAdherenceExplanationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentQueryAdherenceExplanationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query adherence explanations for the given agent across a specified range
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentQueryAdherenceExplanationsResponse> postWorkforcemanagementAgentAdherenceExplanationsQuery(ApiRequest<AgentQueryAdherenceExplanationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentQueryAdherenceExplanationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentQueryAdherenceExplanationsResponse> response = (ApiResponse<AgentQueryAdherenceExplanationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentQueryAdherenceExplanationsResponse> response = (ApiResponse<AgentQueryAdherenceExplanationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Move agents in and out of management unit
   * 
   * @param body body (required)
   * @return MoveAgentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MoveAgentsResponse postWorkforcemanagementAgents(MoveAgentsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAgents(createPostWorkforcemanagementAgentsRequest(body));
  }

  /**
   * Move agents in and out of management unit
   * 
   * @param body body (required)
   * @return MoveAgentsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MoveAgentsResponse> postWorkforcemanagementAgentsWithHttpInfo(MoveAgentsRequest body) throws IOException {
    return postWorkforcemanagementAgents(createPostWorkforcemanagementAgentsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAgentsRequest createPostWorkforcemanagementAgentsRequest(MoveAgentsRequest body) {
    return PostWorkforcemanagementAgentsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Move agents in and out of management unit
   * 
   * @param request The request object
   * @return MoveAgentsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MoveAgentsResponse postWorkforcemanagementAgents(PostWorkforcemanagementAgentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MoveAgentsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MoveAgentsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Move agents in and out of management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MoveAgentsResponse> postWorkforcemanagementAgents(ApiRequest<MoveAgentsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MoveAgentsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MoveAgentsResponse> response = (ApiResponse<MoveAgentsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<MoveAgentsResponse> response = (ApiResponse<MoveAgentsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query integrations for agents
   * 
   * @param body body (required)
   * @return AgentsIntegrationsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentsIntegrationsListing postWorkforcemanagementAgentsIntegrationsHrisQuery(QueryAgentsIntegrationsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAgentsIntegrationsHrisQuery(createPostWorkforcemanagementAgentsIntegrationsHrisQueryRequest(body));
  }

  /**
   * Query integrations for agents
   * 
   * @param body body (required)
   * @return AgentsIntegrationsListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentsIntegrationsListing> postWorkforcemanagementAgentsIntegrationsHrisQueryWithHttpInfo(QueryAgentsIntegrationsRequest body) throws IOException {
    return postWorkforcemanagementAgentsIntegrationsHrisQuery(createPostWorkforcemanagementAgentsIntegrationsHrisQueryRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAgentsIntegrationsHrisQueryRequest createPostWorkforcemanagementAgentsIntegrationsHrisQueryRequest(QueryAgentsIntegrationsRequest body) {
    return PostWorkforcemanagementAgentsIntegrationsHrisQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query integrations for agents
   * 
   * @param request The request object
   * @return AgentsIntegrationsListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentsIntegrationsListing postWorkforcemanagementAgentsIntegrationsHrisQuery(PostWorkforcemanagementAgentsIntegrationsHrisQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentsIntegrationsListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentsIntegrationsListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query integrations for agents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentsIntegrationsListing> postWorkforcemanagementAgentsIntegrationsHrisQuery(ApiRequest<QueryAgentsIntegrationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentsIntegrationsListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentsIntegrationsListing> response = (ApiResponse<AgentsIntegrationsListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentsIntegrationsListing> response = (ApiResponse<AgentsIntegrationsListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get agent possible work shifts for requested time frame
   * 
   * @param body body (required)
   * @return AgentPossibleWorkShiftsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentPossibleWorkShiftsResponse postWorkforcemanagementAgentsMePossibleworkshifts(AgentPossibleWorkShiftsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAgentsMePossibleworkshifts(createPostWorkforcemanagementAgentsMePossibleworkshiftsRequest(body));
  }

  /**
   * Get agent possible work shifts for requested time frame
   * 
   * @param body body (required)
   * @return AgentPossibleWorkShiftsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentPossibleWorkShiftsResponse> postWorkforcemanagementAgentsMePossibleworkshiftsWithHttpInfo(AgentPossibleWorkShiftsRequest body) throws IOException {
    return postWorkforcemanagementAgentsMePossibleworkshifts(createPostWorkforcemanagementAgentsMePossibleworkshiftsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAgentsMePossibleworkshiftsRequest createPostWorkforcemanagementAgentsMePossibleworkshiftsRequest(AgentPossibleWorkShiftsRequest body) {
    return PostWorkforcemanagementAgentsMePossibleworkshiftsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Get agent possible work shifts for requested time frame
   * 
   * @param request The request object
   * @return AgentPossibleWorkShiftsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentPossibleWorkShiftsResponse postWorkforcemanagementAgentsMePossibleworkshifts(PostWorkforcemanagementAgentsMePossibleworkshiftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentPossibleWorkShiftsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentPossibleWorkShiftsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get agent possible work shifts for requested time frame
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentPossibleWorkShiftsResponse> postWorkforcemanagementAgentsMePossibleworkshifts(ApiRequest<AgentPossibleWorkShiftsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentPossibleWorkShiftsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentPossibleWorkShiftsResponse> response = (ApiResponse<AgentPossibleWorkShiftsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentPossibleWorkShiftsResponse> response = (ApiResponse<AgentPossibleWorkShiftsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get published schedule for the current user
   * 
   * @param body body (required)
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
   * @param body body (required)
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
   * Request a list of alternative shift offers for a given schedule
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse postWorkforcemanagementAlternativeshiftsOffersJobs(AlternativeShiftOffersRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAlternativeshiftsOffersJobs(createPostWorkforcemanagementAlternativeshiftsOffersJobsRequest(body));
  }

  /**
   * Request a list of alternative shift offers for a given schedule
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> postWorkforcemanagementAlternativeshiftsOffersJobsWithHttpInfo(AlternativeShiftOffersRequest body) throws IOException {
    return postWorkforcemanagementAlternativeshiftsOffersJobs(createPostWorkforcemanagementAlternativeshiftsOffersJobsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAlternativeshiftsOffersJobsRequest createPostWorkforcemanagementAlternativeshiftsOffersJobsRequest(AlternativeShiftOffersRequest body) {
    return PostWorkforcemanagementAlternativeshiftsOffersJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Request a list of alternative shift offers for a given schedule
   * 
   * @param request The request object
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse postWorkforcemanagementAlternativeshiftsOffersJobs(PostWorkforcemanagementAlternativeshiftsOffersJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a list of alternative shift offers for a given schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> postWorkforcemanagementAlternativeshiftsOffersJobs(ApiRequest<AlternativeShiftOffersRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Request a search of alternative shift offers for a given shift
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse postWorkforcemanagementAlternativeshiftsOffersSearchJobs(AlternativeShiftSearchOffersRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAlternativeshiftsOffersSearchJobs(createPostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest(body));
  }

  /**
   * Request a search of alternative shift offers for a given shift
   * 
   * @param body The request body (required)
   * @return AlternativeShiftAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> postWorkforcemanagementAlternativeshiftsOffersSearchJobsWithHttpInfo(AlternativeShiftSearchOffersRequest body) throws IOException {
    return postWorkforcemanagementAlternativeshiftsOffersSearchJobs(createPostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest createPostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest(AlternativeShiftSearchOffersRequest body) {
    return PostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Request a search of alternative shift offers for a given shift
   * 
   * @param request The request object
   * @return AlternativeShiftAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftAsyncResponse postWorkforcemanagementAlternativeshiftsOffersSearchJobs(PostWorkforcemanagementAlternativeshiftsOffersSearchJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a search of alternative shift offers for a given shift
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftAsyncResponse> postWorkforcemanagementAlternativeshiftsOffersSearchJobs(ApiRequest<AlternativeShiftSearchOffersRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftAsyncResponse> response = (ApiResponse<AlternativeShiftAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create my alternative shift trade using an existing offer's jobId
   * 
   * @param body The request body (required)
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse postWorkforcemanagementAlternativeshiftsTrades(CreateAlternativeShiftTradeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementAlternativeshiftsTrades(createPostWorkforcemanagementAlternativeshiftsTradesRequest(body));
  }

  /**
   * Create my alternative shift trade using an existing offer's jobId
   * 
   * @param body The request body (required)
   * @return AlternativeShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> postWorkforcemanagementAlternativeshiftsTradesWithHttpInfo(CreateAlternativeShiftTradeRequest body) throws IOException {
    return postWorkforcemanagementAlternativeshiftsTrades(createPostWorkforcemanagementAlternativeshiftsTradesRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementAlternativeshiftsTradesRequest createPostWorkforcemanagementAlternativeshiftsTradesRequest(CreateAlternativeShiftTradeRequest body) {
    return PostWorkforcemanagementAlternativeshiftsTradesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create my alternative shift trade using an existing offer's jobId
   * 
   * @param request The request object
   * @return AlternativeShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AlternativeShiftTradeResponse postWorkforcemanagementAlternativeshiftsTrades(PostWorkforcemanagementAlternativeshiftsTradesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AlternativeShiftTradeResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AlternativeShiftTradeResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create my alternative shift trade using an existing offer's jobId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AlternativeShiftTradeResponse> postWorkforcemanagementAlternativeshiftsTrades(ApiRequest<CreateAlternativeShiftTradeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AlternativeShiftTradeResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AlternativeShiftTradeResponse> response = (ApiResponse<AlternativeShiftTradeResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new activity code
   * 
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param businessUnitId The ID of the business unit, or 'mine' for the business unit of the logged-in user. (required)
   * @param body body (required)
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
   * Run an activity plan manually
   * Triggers a job running the activity plan. The activity plan cannot be updated until the job completes
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to run (required)
   * @return ActivityPlanJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanJobResponse postWorkforcemanagementBusinessunitActivityplanRunsJobs(String businessUnitId, String activityPlanId) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitActivityplanRunsJobs(createPostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest(businessUnitId, activityPlanId));
  }

  /**
   * Run an activity plan manually
   * Triggers a job running the activity plan. The activity plan cannot be updated until the job completes
   * @param businessUnitId The ID of the business unit (required)
   * @param activityPlanId The ID of the activity plan to run (required)
   * @return ActivityPlanJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanJobResponse> postWorkforcemanagementBusinessunitActivityplanRunsJobsWithHttpInfo(String businessUnitId, String activityPlanId) throws IOException {
    return postWorkforcemanagementBusinessunitActivityplanRunsJobs(createPostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest(businessUnitId, activityPlanId).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest createPostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest(String businessUnitId, String activityPlanId) {
    return PostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withActivityPlanId(activityPlanId)

            .build();
  }

  /**
   * Run an activity plan manually
   * Triggers a job running the activity plan. The activity plan cannot be updated until the job completes
   * @param request The request object
   * @return ActivityPlanJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanJobResponse postWorkforcemanagementBusinessunitActivityplanRunsJobs(PostWorkforcemanagementBusinessunitActivityplanRunsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Run an activity plan manually
   * Triggers a job running the activity plan. The activity plan cannot be updated until the job completes
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanJobResponse> postWorkforcemanagementBusinessunitActivityplanRunsJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanJobResponse> response = (ApiResponse<ActivityPlanJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanJobResponse> response = (ApiResponse<ActivityPlanJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an activity plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse postWorkforcemanagementBusinessunitActivityplans(String businessUnitId, CreateActivityPlanRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitActivityplans(createPostWorkforcemanagementBusinessunitActivityplansRequest(businessUnitId, body));
  }

  /**
   * Create an activity plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return ActivityPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> postWorkforcemanagementBusinessunitActivityplansWithHttpInfo(String businessUnitId, CreateActivityPlanRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitActivityplans(createPostWorkforcemanagementBusinessunitActivityplansRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitActivityplansRequest createPostWorkforcemanagementBusinessunitActivityplansRequest(String businessUnitId, CreateActivityPlanRequest body) {
    return PostWorkforcemanagementBusinessunitActivityplansRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Create an activity plan
   * 
   * @param request The request object
   * @return ActivityPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityPlanResponse postWorkforcemanagementBusinessunitActivityplans(PostWorkforcemanagementBusinessunitActivityplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an activity plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityPlanResponse> postWorkforcemanagementBusinessunitActivityplans(ApiRequest<CreateActivityPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ActivityPlanResponse> response = (ApiResponse<ActivityPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query adherence explanations across an entire business unit for the requested period
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BuQueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuQueryAdherenceExplanationsResponse postWorkforcemanagementBusinessunitAdherenceExplanationsQuery(String businessUnitId, BuQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitAdherenceExplanationsQuery(createPostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest(businessUnitId, body, forceAsync, forceDownloadService));
  }

  /**
   * Query adherence explanations across an entire business unit for the requested period
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return BuQueryAdherenceExplanationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuQueryAdherenceExplanationsResponse> postWorkforcemanagementBusinessunitAdherenceExplanationsQueryWithHttpInfo(String businessUnitId, BuQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementBusinessunitAdherenceExplanationsQuery(createPostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest(businessUnitId, body, forceAsync, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest createPostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest(String businessUnitId, BuQueryAdherenceExplanationsRequest body, Boolean forceAsync, Boolean forceDownloadService) {
    return PostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .withForceAsync(forceAsync)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Query adherence explanations across an entire business unit for the requested period
   * 
   * @param request The request object
   * @return BuQueryAdherenceExplanationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuQueryAdherenceExplanationsResponse postWorkforcemanagementBusinessunitAdherenceExplanationsQuery(PostWorkforcemanagementBusinessunitAdherenceExplanationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuQueryAdherenceExplanationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuQueryAdherenceExplanationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query adherence explanations across an entire business unit for the requested period
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuQueryAdherenceExplanationsResponse> postWorkforcemanagementBusinessunitAdherenceExplanationsQuery(ApiRequest<BuQueryAdherenceExplanationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuQueryAdherenceExplanationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuQueryAdherenceExplanationsResponse> response = (ApiResponse<BuQueryAdherenceExplanationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuQueryAdherenceExplanationsResponse> response = (ApiResponse<BuQueryAdherenceExplanationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search published schedules
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * List alternative shifts trades for a given management unit or agent
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return BuListAlternativeShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuListAlternativeShiftTradesResponse postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearch(String businessUnitId, SearchAlternativeShiftTradesRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearch(createPostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest(businessUnitId, body, forceAsync));
  }

  /**
   * List alternative shifts trades for a given management unit or agent
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The request body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return BuListAlternativeShiftTradesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuListAlternativeShiftTradesResponse> postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchWithHttpInfo(String businessUnitId, SearchAlternativeShiftTradesRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearch(createPostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest(businessUnitId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest createPostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest(String businessUnitId, SearchAlternativeShiftTradesRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .withForceAsync(forceAsync)

            .build();
  }

  /**
   * List alternative shifts trades for a given management unit or agent
   * 
   * @param request The request object
   * @return BuListAlternativeShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuListAlternativeShiftTradesResponse postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearch(PostWorkforcemanagementBusinessunitAlternativeshiftsTradesSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuListAlternativeShiftTradesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuListAlternativeShiftTradesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List alternative shifts trades for a given management unit or agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuListAlternativeShiftTradesResponse> postWorkforcemanagementBusinessunitAlternativeshiftsTradesSearch(ApiRequest<SearchAlternativeShiftTradesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuListAlternativeShiftTradesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuListAlternativeShiftTradesResponse> response = (ApiResponse<BuListAlternativeShiftTradesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuListAlternativeShiftTradesResponse> response = (ApiResponse<BuListAlternativeShiftTradesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncIntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncIntradayResponse postWorkforcemanagementBusinessunitIntraday(String businessUnitId, IntradayPlanningGroupRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitIntraday(createPostWorkforcemanagementBusinessunitIntradayRequest(businessUnitId, body, forceAsync));
  }

  /**
   * Get intraday data for the given date for the requested planningGroupIds
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return AsyncIntradayResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncIntradayResponse> postWorkforcemanagementBusinessunitIntradayWithHttpInfo(String businessUnitId, IntradayPlanningGroupRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementBusinessunitIntraday(createPostWorkforcemanagementBusinessunitIntradayRequest(businessUnitId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitIntradayRequest createPostWorkforcemanagementBusinessunitIntradayRequest(String businessUnitId, IntradayPlanningGroupRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementBusinessunitIntradayRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .withForceAsync(forceAsync)

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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * Creates a new staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse postWorkforcemanagementBusinessunitStaffinggroups(String businessUnitId, CreateStaffingGroupRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitStaffinggroups(createPostWorkforcemanagementBusinessunitStaffinggroupsRequest(businessUnitId, body));
  }

  /**
   * Creates a new staffing group
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return StaffingGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> postWorkforcemanagementBusinessunitStaffinggroupsWithHttpInfo(String businessUnitId, CreateStaffingGroupRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitStaffinggroups(createPostWorkforcemanagementBusinessunitStaffinggroupsRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitStaffinggroupsRequest createPostWorkforcemanagementBusinessunitStaffinggroupsRequest(String businessUnitId, CreateStaffingGroupRequest body) {
    return PostWorkforcemanagementBusinessunitStaffinggroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a new staffing group
   * 
   * @param request The request object
   * @return StaffingGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public StaffingGroupResponse postWorkforcemanagementBusinessunitStaffinggroups(PostWorkforcemanagementBusinessunitStaffinggroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<StaffingGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<StaffingGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new staffing group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<StaffingGroupResponse> postWorkforcemanagementBusinessunitStaffinggroups(ApiRequest<CreateStaffingGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<StaffingGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<StaffingGroupResponse> response = (ApiResponse<StaffingGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets staffing group associations for a list of user IDs
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service (optional)
   * @return UserStaffingGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStaffingGroupListing postWorkforcemanagementBusinessunitStaffinggroupsQuery(String businessUnitId, QueryUserStaffingGroupListRequest body, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitStaffinggroupsQuery(createPostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest(businessUnitId, body, forceDownloadService));
  }

  /**
   * Gets staffing group associations for a list of user IDs
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service (optional)
   * @return UserStaffingGroupListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStaffingGroupListing> postWorkforcemanagementBusinessunitStaffinggroupsQueryWithHttpInfo(String businessUnitId, QueryUserStaffingGroupListRequest body, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementBusinessunitStaffinggroupsQuery(createPostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest(businessUnitId, body, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest createPostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest(String businessUnitId, QueryUserStaffingGroupListRequest body, Boolean forceDownloadService) {
    return PostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Gets staffing group associations for a list of user IDs
   * 
   * @param request The request object
   * @return UserStaffingGroupListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserStaffingGroupListing postWorkforcemanagementBusinessunitStaffinggroupsQuery(PostWorkforcemanagementBusinessunitStaffinggroupsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserStaffingGroupListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserStaffingGroupListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets staffing group associations for a list of user IDs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserStaffingGroupListing> postWorkforcemanagementBusinessunitStaffinggroupsQuery(ApiRequest<QueryUserStaffingGroupListRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserStaffingGroupListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserStaffingGroupListing> response = (ApiResponse<UserStaffingGroupListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserStaffingGroupListing> response = (ApiResponse<UserStaffingGroupListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a new time-off limit object
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse postWorkforcemanagementBusinessunitTimeofflimits(String businessUnitId, BuCreateTimeOffLimitRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitTimeofflimits(createPostWorkforcemanagementBusinessunitTimeofflimitsRequest(businessUnitId, body));
  }

  /**
   * Creates a new time-off limit object
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffLimitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> postWorkforcemanagementBusinessunitTimeofflimitsWithHttpInfo(String businessUnitId, BuCreateTimeOffLimitRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitTimeofflimits(createPostWorkforcemanagementBusinessunitTimeofflimitsRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitTimeofflimitsRequest createPostWorkforcemanagementBusinessunitTimeofflimitsRequest(String businessUnitId, BuCreateTimeOffLimitRequest body) {
    return PostWorkforcemanagementBusinessunitTimeofflimitsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a new time-off limit object
   * 
   * @param request The request object
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse postWorkforcemanagementBusinessunitTimeofflimits(PostWorkforcemanagementBusinessunitTimeofflimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffLimitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffLimitResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new time-off limit object
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> postWorkforcemanagementBusinessunitTimeofflimits(ApiRequest<BuCreateTimeOffLimitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffLimitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves time-off limit related values based on a given set of filters.
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitValuesResponse postWorkforcemanagementBusinessunitTimeofflimitsValuesQuery(String businessUnitId, QueryTimeOffLimitValuesRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitTimeofflimitsValuesQuery(createPostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest(businessUnitId, body));
  }

  /**
   * Retrieves time-off limit related values based on a given set of filters.
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffLimitValuesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitValuesResponse> postWorkforcemanagementBusinessunitTimeofflimitsValuesQueryWithHttpInfo(String businessUnitId, QueryTimeOffLimitValuesRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitTimeofflimitsValuesQuery(createPostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest createPostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest(String businessUnitId, QueryTimeOffLimitValuesRequest body) {
    return PostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Retrieves time-off limit related values based on a given set of filters.
   * 
   * @param request The request object
   * @return BuTimeOffLimitValuesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitValuesResponse postWorkforcemanagementBusinessunitTimeofflimitsValuesQuery(PostWorkforcemanagementBusinessunitTimeofflimitsValuesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffLimitValuesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffLimitValuesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves time-off limit related values based on a given set of filters.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitValuesResponse> postWorkforcemanagementBusinessunitTimeofflimitsValuesQuery(ApiRequest<QueryTimeOffLimitValuesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffLimitValuesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffLimitValuesResponse> response = (ApiResponse<BuTimeOffLimitValuesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffLimitValuesResponse> response = (ApiResponse<BuTimeOffLimitValuesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a new time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse postWorkforcemanagementBusinessunitTimeoffplans(String businessUnitId, BuCreateTimeOffPlanRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitTimeoffplans(createPostWorkforcemanagementBusinessunitTimeoffplansRequest(businessUnitId, body));
  }

  /**
   * Creates a new time-off plan
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body body (required)
   * @return BuTimeOffPlanResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> postWorkforcemanagementBusinessunitTimeoffplansWithHttpInfo(String businessUnitId, BuCreateTimeOffPlanRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitTimeoffplans(createPostWorkforcemanagementBusinessunitTimeoffplansRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitTimeoffplansRequest createPostWorkforcemanagementBusinessunitTimeoffplansRequest(String businessUnitId, BuCreateTimeOffPlanRequest body) {
    return PostWorkforcemanagementBusinessunitTimeoffplansRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a new time-off plan
   * 
   * @param request The request object
   * @return BuTimeOffPlanResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffPlanResponse postWorkforcemanagementBusinessunitTimeoffplans(PostWorkforcemanagementBusinessunitTimeoffplansRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffPlanResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffPlanResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a new time-off plan
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffPlanResponse> postWorkforcemanagementBusinessunitTimeoffplans(ApiRequest<BuCreateTimeOffPlanRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffPlanResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffPlanResponse> response = (ApiResponse<BuTimeOffPlanResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * Request a daily recalculation of the performance prediction for the associated schedule
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @param body body (required)
   * @return PerformancePredictionRecalculationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationResponse postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculations(String businessUnitId, String weekId, String scheduleId, WfmProcessUploadRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculations(createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Request a daily recalculation of the performance prediction for the associated schedule
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @param body body (required)
   * @return PerformancePredictionRecalculationResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationResponse> postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsWithHttpInfo(String businessUnitId, String weekId, String scheduleId, WfmProcessUploadRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculations(createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest(String businessUnitId, String weekId, String scheduleId, WfmProcessUploadRequest body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Request a daily recalculation of the performance prediction for the associated schedule
   * 
   * @param request The request object
   * @return PerformancePredictionRecalculationResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationResponse postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculations(PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformancePredictionRecalculationResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformancePredictionRecalculationResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a daily recalculation of the performance prediction for the associated schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationResponse> postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculations(ApiRequest<WfmProcessUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformancePredictionRecalculationResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformancePredictionRecalculationResponse> response = (ApiResponse<PerformancePredictionRecalculationResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformancePredictionRecalculationResponse> response = (ApiResponse<PerformancePredictionRecalculationResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Upload daily activity changes to be able to request a performance prediction recalculation
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @param body body (required)
   * @return PerformancePredictionRecalculationUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationUploadResponse postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurl(String businessUnitId, String weekId, String scheduleId, UploadUrlRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurl(createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Upload daily activity changes to be able to request a performance prediction recalculation
   * 
   * @param businessUnitId The ID of the business unit to which the performance prediction belongs (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format (required)
   * @param scheduleId The ID of the schedule the performance prediction belongs to (required)
   * @param body body (required)
   * @return PerformancePredictionRecalculationUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationUploadResponse> postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlWithHttpInfo(String businessUnitId, String weekId, String scheduleId, UploadUrlRequestBody body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurl(createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest createPostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest(String businessUnitId, String weekId, String scheduleId, UploadUrlRequestBody body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Upload daily activity changes to be able to request a performance prediction recalculation
   * 
   * @param request The request object
   * @return PerformancePredictionRecalculationUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PerformancePredictionRecalculationUploadResponse postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurl(PostWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurlRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PerformancePredictionRecalculationUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PerformancePredictionRecalculationUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Upload daily activity changes to be able to request a performance prediction recalculation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PerformancePredictionRecalculationUploadResponse> postWorkforcemanagementBusinessunitWeekSchedulePerformancepredictionsRecalculationsUploadurl(ApiRequest<UploadUrlRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PerformancePredictionRecalculationUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PerformancePredictionRecalculationUploadResponse> response = (ApiResponse<PerformancePredictionRecalculationUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<PerformancePredictionRecalculationUploadResponse> response = (ApiResponse<PerformancePredictionRecalculationUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Starts processing a schedule update
   * Call after uploading the schedule data to the url supplied by the /update/uploadurl route
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse postWorkforcemanagementBusinessunitWeekScheduleUpdate(String businessUnitId, LocalDate weekId, String scheduleId, ProcessScheduleUpdateUploadRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekScheduleUpdate(createPostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Starts processing a schedule update
   * Call after uploading the schedule data to the url supplied by the /update/uploadurl route
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return BuAsyncScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> postWorkforcemanagementBusinessunitWeekScheduleUpdateWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, ProcessScheduleUpdateUploadRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekScheduleUpdate(createPostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest createPostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest(String businessUnitId, LocalDate weekId, String scheduleId, ProcessScheduleUpdateUploadRequest body) {
    return PostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Starts processing a schedule update
   * Call after uploading the schedule data to the url supplied by the /update/uploadurl route
   * @param request The request object
   * @return BuAsyncScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuAsyncScheduleResponse postWorkforcemanagementBusinessunitWeekScheduleUpdate(PostWorkforcemanagementBusinessunitWeekScheduleUpdateRequest request) throws IOException, ApiException {
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
   * Starts processing a schedule update
   * Call after uploading the schedule data to the url supplied by the /update/uploadurl route
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuAsyncScheduleResponse> postWorkforcemanagementBusinessunitWeekScheduleUpdate(ApiRequest<ProcessScheduleUpdateUploadRequest> request) throws IOException {
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
   * Creates a signed upload URL for updating a schedule
   * Once the upload is complete, call the /{scheduleId}/update route to start the schedule update process
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return UpdateScheduleUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateScheduleUploadResponse postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(String businessUnitId, LocalDate weekId, String scheduleId, UploadUrlRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(createPostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest(businessUnitId, weekId, scheduleId, body));
  }

  /**
   * Creates a signed upload URL for updating a schedule
   * Once the upload is complete, call the /{scheduleId}/update route to start the schedule update process
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param scheduleId The ID of the schedule (required)
   * @param body body (required)
   * @return UpdateScheduleUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateScheduleUploadResponse> postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlWithHttpInfo(String businessUnitId, LocalDate weekId, String scheduleId, UploadUrlRequestBody body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(createPostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest(businessUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest createPostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest(String businessUnitId, LocalDate weekId, String scheduleId, UploadUrlRequestBody body) {
    return PostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a signed upload URL for updating a schedule
   * Once the upload is complete, call the /{scheduleId}/update route to start the schedule update process
   * @param request The request object
   * @return UpdateScheduleUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UpdateScheduleUploadResponse postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(PostWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurlRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UpdateScheduleUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UpdateScheduleUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a signed upload URL for updating a schedule
   * Once the upload is complete, call the /{scheduleId}/update route to start the schedule update process
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UpdateScheduleUploadResponse> postWorkforcemanagementBusinessunitWeekScheduleUpdateUploadurl(ApiRequest<UploadUrlRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UpdateScheduleUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UpdateScheduleUploadResponse> response = (ApiResponse<UpdateScheduleUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UpdateScheduleUploadResponse> response = (ApiResponse<UpdateScheduleUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Starts processing a schedule import
   * Call after uploading the schedule data to the url supplied by the /import/uploadurl route
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body  (required)
   * @return ScheduleUploadProcessingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleUploadProcessingResponse postWorkforcemanagementBusinessunitWeekSchedulesImport(String businessUnitId, LocalDate weekId, WfmProcessUploadRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedulesImport(createPostWorkforcemanagementBusinessunitWeekSchedulesImportRequest(businessUnitId, weekId, body));
  }

  /**
   * Starts processing a schedule import
   * Call after uploading the schedule data to the url supplied by the /import/uploadurl route
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body  (required)
   * @return ScheduleUploadProcessingResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleUploadProcessingResponse> postWorkforcemanagementBusinessunitWeekSchedulesImportWithHttpInfo(String businessUnitId, LocalDate weekId, WfmProcessUploadRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedulesImport(createPostWorkforcemanagementBusinessunitWeekSchedulesImportRequest(businessUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulesImportRequest createPostWorkforcemanagementBusinessunitWeekSchedulesImportRequest(String businessUnitId, LocalDate weekId, WfmProcessUploadRequest body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulesImportRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withBody(body)

            .build();
  }

  /**
   * Starts processing a schedule import
   * Call after uploading the schedule data to the url supplied by the /import/uploadurl route
   * @param request The request object
   * @return ScheduleUploadProcessingResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ScheduleUploadProcessingResponse postWorkforcemanagementBusinessunitWeekSchedulesImport(PostWorkforcemanagementBusinessunitWeekSchedulesImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ScheduleUploadProcessingResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ScheduleUploadProcessingResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Starts processing a schedule import
   * Call after uploading the schedule data to the url supplied by the /import/uploadurl route
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ScheduleUploadProcessingResponse> postWorkforcemanagementBusinessunitWeekSchedulesImport(ApiRequest<WfmProcessUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ScheduleUploadProcessingResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ScheduleUploadProcessingResponse> response = (ApiResponse<ScheduleUploadProcessingResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ScheduleUploadProcessingResponse> response = (ApiResponse<ScheduleUploadProcessingResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a signed upload URL for importing a schedule
   * Once the upload is complete, call the /import route to start the schedule import process
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportScheduleUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportScheduleUploadResponse postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(String businessUnitId, LocalDate weekId, UploadUrlRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(createPostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest(businessUnitId, weekId, body));
  }

  /**
   * Creates a signed upload URL for importing a schedule
   * Once the upload is complete, call the /import route to start the schedule import process
   * @param businessUnitId The ID of the business unit (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportScheduleUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportScheduleUploadResponse> postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlWithHttpInfo(String businessUnitId, LocalDate weekId, UploadUrlRequestBody body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(createPostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest(businessUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest createPostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest(String businessUnitId, LocalDate weekId, UploadUrlRequestBody body) {
    return PostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekId(weekId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a signed upload URL for importing a schedule
   * Once the upload is complete, call the /import route to start the schedule import process
   * @param request The request object
   * @return ImportScheduleUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportScheduleUploadResponse postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(PostWorkforcemanagementBusinessunitWeekSchedulesImportUploadurlRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportScheduleUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportScheduleUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a signed upload URL for importing a schedule
   * Once the upload is complete, call the /import route to start the schedule import process
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportScheduleUploadResponse> postWorkforcemanagementBusinessunitWeekSchedulesImportUploadurl(ApiRequest<UploadUrlRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportScheduleUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportScheduleUploadResponse> response = (ApiResponse<ImportScheduleUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportScheduleUploadResponse> response = (ApiResponse<ImportScheduleUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Copy a short term forecast
   * 
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
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
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
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
   * Starts importing the uploaded short term forecast
   * Call after uploading the forecast data to the url supplied by the /import/uploadurl route
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportForecastResponse postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(String businessUnitId, LocalDate weekDateId, WfmProcessUploadRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest(businessUnitId, weekDateId, body));
  }

  /**
   * Starts importing the uploaded short term forecast
   * Call after uploading the forecast data to the url supplied by the /import/uploadurl route
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportForecastResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportForecastResponse> postWorkforcemanagementBusinessunitWeekShorttermforecastsImportWithHttpInfo(String businessUnitId, LocalDate weekDateId, WfmProcessUploadRequest body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest(businessUnitId, weekDateId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest(String businessUnitId, LocalDate weekDateId, WfmProcessUploadRequest body) {
    return PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekDateId(weekDateId)

            .withBody(body)

            .build();
  }

  /**
   * Starts importing the uploaded short term forecast
   * Call after uploading the forecast data to the url supplied by the /import/uploadurl route
   * @param request The request object
   * @return ImportForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportForecastResponse postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportForecastResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportForecastResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Starts importing the uploaded short term forecast
   * Call after uploading the forecast data to the url supplied by the /import/uploadurl route
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportForecastResponse> postWorkforcemanagementBusinessunitWeekShorttermforecastsImport(ApiRequest<WfmProcessUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportForecastResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportForecastResponse> response = (ApiResponse<ImportForecastResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportForecastResponse> response = (ApiResponse<ImportForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a signed upload URL for importing a short term forecast
   * Once the upload is complete, call the /import route to start the short term forecast import process
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportForecastUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportForecastUploadResponse postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(String businessUnitId, LocalDate weekDateId, UploadUrlRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest(businessUnitId, weekDateId, body));
  }

  /**
   * Creates a signed upload URL for importing a short term forecast
   * Once the upload is complete, call the /import route to start the short term forecast import process
   * @param businessUnitId The ID of the business unit to which the forecast belongs (required)
   * @param weekDateId First day of schedule week in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @return ImportForecastUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportForecastUploadResponse> postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlWithHttpInfo(String businessUnitId, LocalDate weekDateId, UploadUrlRequestBody body) throws IOException {
    return postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest(businessUnitId, weekDateId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest createPostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest(String businessUnitId, LocalDate weekDateId, UploadUrlRequestBody body) {
    return PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withWeekDateId(weekDateId)

            .withBody(body)

            .build();
  }

  /**
   * Creates a signed upload URL for importing a short term forecast
   * Once the upload is complete, call the /import route to start the short term forecast import process
   * @param request The request object
   * @return ImportForecastUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportForecastUploadResponse postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(PostWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurlRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportForecastUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportForecastUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a signed upload URL for importing a short term forecast
   * Once the upload is complete, call the /import route to start the short term forecast import process
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportForecastUploadResponse> postWorkforcemanagementBusinessunitWeekShorttermforecastsImportUploadurl(ApiRequest<UploadUrlRequestBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportForecastUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportForecastUploadResponse> response = (ApiResponse<ImportForecastUploadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportForecastUploadResponse> response = (ApiResponse<ImportForecastUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Copy a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The ID of the work plan bid to copy (required)
   * @param body body (required)
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid postWorkforcemanagementBusinessunitWorkplanbidCopy(String businessUnitId, String bidId, CopyWorkPlanBid body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWorkplanbidCopy(createPostWorkforcemanagementBusinessunitWorkplanbidCopyRequest(businessUnitId, bidId, body));
  }

  /**
   * Copy a work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The ID of the work plan bid to copy (required)
   * @param body body (required)
   * @return WorkPlanBid
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> postWorkforcemanagementBusinessunitWorkplanbidCopyWithHttpInfo(String businessUnitId, String bidId, CopyWorkPlanBid body) throws IOException {
    return postWorkforcemanagementBusinessunitWorkplanbidCopy(createPostWorkforcemanagementBusinessunitWorkplanbidCopyRequest(businessUnitId, bidId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWorkplanbidCopyRequest createPostWorkforcemanagementBusinessunitWorkplanbidCopyRequest(String businessUnitId, String bidId, CopyWorkPlanBid body) {
    return PostWorkforcemanagementBusinessunitWorkplanbidCopyRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBody(body)

            .build();
  }

  /**
   * Copy a work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid postWorkforcemanagementBusinessunitWorkplanbidCopy(PostWorkforcemanagementBusinessunitWorkplanbidCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBid> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBid>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> postWorkforcemanagementBusinessunitWorkplanbidCopy(ApiRequest<CopyWorkPlanBid> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBid>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add a bid group in a given work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param body body (required)
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse postWorkforcemanagementBusinessunitWorkplanbidGroups(String businessUnitId, String bidId, WorkPlanBidGroupCreate body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWorkplanbidGroups(createPostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest(businessUnitId, bidId, body));
  }

  /**
   * Add a bid group in a given work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param bidId The work plan bid id of the bid groups (required)
   * @param body body (required)
   * @return WorkPlanBidGroupResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> postWorkforcemanagementBusinessunitWorkplanbidGroupsWithHttpInfo(String businessUnitId, String bidId, WorkPlanBidGroupCreate body) throws IOException {
    return postWorkforcemanagementBusinessunitWorkplanbidGroups(createPostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest(businessUnitId, bidId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest createPostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest(String businessUnitId, String bidId, WorkPlanBidGroupCreate body) {
    return PostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBidId(bidId)

            .withBody(body)

            .build();
  }

  /**
   * Add a bid group in a given work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBidGroupResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBidGroupResponse postWorkforcemanagementBusinessunitWorkplanbidGroups(PostWorkforcemanagementBusinessunitWorkplanbidGroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBidGroupResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBidGroupResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a bid group in a given work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBidGroupResponse> postWorkforcemanagementBusinessunitWorkplanbidGroups(ApiRequest<WorkPlanBidGroupCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBidGroupResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBidGroupResponse> response = (ApiResponse<WorkPlanBidGroupResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The work plan bid to be created (required)
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid postWorkforcemanagementBusinessunitWorkplanbids(String businessUnitId, CreateWorkPlanBid body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunitWorkplanbids(createPostWorkforcemanagementBusinessunitWorkplanbidsRequest(businessUnitId, body));
  }

  /**
   * Create a new work plan bid
   * 
   * @param businessUnitId The ID of the business unit (required)
   * @param body The work plan bid to be created (required)
   * @return WorkPlanBid
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> postWorkforcemanagementBusinessunitWorkplanbidsWithHttpInfo(String businessUnitId, CreateWorkPlanBid body) throws IOException {
    return postWorkforcemanagementBusinessunitWorkplanbids(createPostWorkforcemanagementBusinessunitWorkplanbidsRequest(businessUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementBusinessunitWorkplanbidsRequest createPostWorkforcemanagementBusinessunitWorkplanbidsRequest(String businessUnitId, CreateWorkPlanBid body) {
    return PostWorkforcemanagementBusinessunitWorkplanbidsRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Create a new work plan bid
   * 
   * @param request The request object
   * @return WorkPlanBid
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanBid postWorkforcemanagementBusinessunitWorkplanbids(PostWorkforcemanagementBusinessunitWorkplanbidsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WorkPlanBid> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WorkPlanBid>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new work plan bid
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanBid> postWorkforcemanagementBusinessunitWorkplanbids(ApiRequest<CreateWorkPlanBid> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WorkPlanBid>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)exception;
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
      ApiResponse<WorkPlanBid> response = (ApiResponse<WorkPlanBid>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param body body (required)
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse postWorkforcemanagementBusinessunits(CreateBusinessUnitRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementBusinessunits(createPostWorkforcemanagementBusinessunitsRequest(body));
  }

  /**
   * Add a new business unit
   * It may take a minute or two for a new business unit to be available for api operations
   * @param body body (required)
   * @return BusinessUnitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BusinessUnitResponse> postWorkforcemanagementBusinessunitsWithHttpInfo(CreateBusinessUnitRequest body) throws IOException {
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
   * @return BusinessUnitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BusinessUnitResponse postWorkforcemanagementBusinessunits(PostWorkforcemanagementBusinessunitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BusinessUnitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BusinessUnitResponse>() {});
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
  public ApiResponse<BusinessUnitResponse> postWorkforcemanagementBusinessunits(ApiRequest<CreateBusinessUnitRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BusinessUnitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BusinessUnitResponse> response = (ApiResponse<BusinessUnitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a newly generated calendar link for the current user; if the current user has previously generated one, the generated link will be returned
   * 
   * @param language A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize default activity code names in the ics-formatted calendar (optional, default to "en-US")
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
   * @param language A language tag (which is sometimes referred to as a \"locale identifier\") to use to localize default activity code names in the ics-formatted calendar (optional, default to "en-US")
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
   * Delete the list of the historical data import entries
   * 
   * @param body body (required)
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteFilesJobResponse postWorkforcemanagementHistoricaldataBulkRemoveJobs(HistoricalImportDeleteFilesJobRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementHistoricaldataBulkRemoveJobs(createPostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest(body));
  }

  /**
   * Delete the list of the historical data import entries
   * 
   * @param body body (required)
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteFilesJobResponse> postWorkforcemanagementHistoricaldataBulkRemoveJobsWithHttpInfo(HistoricalImportDeleteFilesJobRequest body) throws IOException {
    return postWorkforcemanagementHistoricaldataBulkRemoveJobs(createPostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest createPostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest(HistoricalImportDeleteFilesJobRequest body) {
    return PostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Delete the list of the historical data import entries
   * 
   * @param request The request object
   * @return HistoricalImportDeleteFilesJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HistoricalImportDeleteFilesJobResponse postWorkforcemanagementHistoricaldataBulkRemoveJobs(PostWorkforcemanagementHistoricaldataBulkRemoveJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HistoricalImportDeleteFilesJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete the list of the historical data import entries
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HistoricalImportDeleteFilesJobResponse> postWorkforcemanagementHistoricaldataBulkRemoveJobs(ApiRequest<HistoricalImportDeleteFilesJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HistoricalImportDeleteFilesJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = (ApiResponse<HistoricalImportDeleteFilesJobResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HistoricalImportDeleteFilesJobResponse> response = (ApiResponse<HistoricalImportDeleteFilesJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param body body (required)
   * @return ValidationServiceAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidationServiceAsyncResponse postWorkforcemanagementHistoricaldataValidate(ValidationServiceRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementHistoricaldataValidate(createPostWorkforcemanagementHistoricaldataValidateRequest(body));
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param body body (required)
   * @return ValidationServiceAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidationServiceAsyncResponse> postWorkforcemanagementHistoricaldataValidateWithHttpInfo(ValidationServiceRequest body) throws IOException {
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
   * @return ValidationServiceAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ValidationServiceAsyncResponse postWorkforcemanagementHistoricaldataValidate(PostWorkforcemanagementHistoricaldataValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ValidationServiceAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ValidationServiceAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Trigger validation process for historical import
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ValidationServiceAsyncResponse> postWorkforcemanagementHistoricaldataValidate(ApiRequest<ValidationServiceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ValidationServiceAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ValidationServiceAsyncResponse> response = (ApiResponse<ValidationServiceAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<ValidationServiceAsyncResponse> response = (ApiResponse<ValidationServiceAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of time off types configured in integration
   * 
   * @param hrisIntegrationId The ID of the HRIS integration for which time off types are queried. (required)
   * @return HrisTimeOffTypesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HrisTimeOffTypesResponse postWorkforcemanagementIntegrationsHriTimeofftypesJobs(String hrisIntegrationId) throws IOException, ApiException {
    return  postWorkforcemanagementIntegrationsHriTimeofftypesJobs(createPostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest(hrisIntegrationId));
  }

  /**
   * Get list of time off types configured in integration
   * 
   * @param hrisIntegrationId The ID of the HRIS integration for which time off types are queried. (required)
   * @return HrisTimeOffTypesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HrisTimeOffTypesResponse> postWorkforcemanagementIntegrationsHriTimeofftypesJobsWithHttpInfo(String hrisIntegrationId) throws IOException {
    return postWorkforcemanagementIntegrationsHriTimeofftypesJobs(createPostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest(hrisIntegrationId).withHttpInfo());
  }

  private PostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest createPostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest(String hrisIntegrationId) {
    return PostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest.builder()
            .withHrisIntegrationId(hrisIntegrationId)

            .build();
  }

  /**
   * Get list of time off types configured in integration
   * 
   * @param request The request object
   * @return HrisTimeOffTypesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public HrisTimeOffTypesResponse postWorkforcemanagementIntegrationsHriTimeofftypesJobs(PostWorkforcemanagementIntegrationsHriTimeofftypesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<HrisTimeOffTypesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<HrisTimeOffTypesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of time off types configured in integration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<HrisTimeOffTypesResponse> postWorkforcemanagementIntegrationsHriTimeofftypesJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<HrisTimeOffTypesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<HrisTimeOffTypesResponse> response = (ApiResponse<HrisTimeOffTypesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<HrisTimeOffTypesResponse> response = (ApiResponse<HrisTimeOffTypesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get agents work plans configuration
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return AgentsWorkPlansResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentsWorkPlansResponse postWorkforcemanagementManagementunitAgentsWorkplansQuery(String managementUnitId, GetAgentsWorkPlansRequest body, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitAgentsWorkplansQuery(createPostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest(managementUnitId, body, forceDownloadService));
  }

  /**
   * Get agents work plans configuration
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return AgentsWorkPlansResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentsWorkPlansResponse> postWorkforcemanagementManagementunitAgentsWorkplansQueryWithHttpInfo(String managementUnitId, GetAgentsWorkPlansRequest body, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementManagementunitAgentsWorkplansQuery(createPostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest(managementUnitId, body, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest createPostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest(String managementUnitId, GetAgentsWorkPlansRequest body, Boolean forceDownloadService) {
    return PostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .withForceDownloadService(forceDownloadService)

            .build();
  }

  /**
   * Get agents work plans configuration
   * 
   * @param request The request object
   * @return AgentsWorkPlansResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentsWorkPlansResponse postWorkforcemanagementManagementunitAgentsWorkplansQuery(PostWorkforcemanagementManagementunitAgentsWorkplansQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentsWorkPlansResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentsWorkPlansResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get agents work plans configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentsWorkPlansResponse> postWorkforcemanagementManagementunitAgentsWorkplansQuery(ApiRequest<GetAgentsWorkPlansRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentsWorkPlansResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentsWorkPlansResponse> response = (ApiResponse<AgentsWorkPlansResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentsWorkPlansResponse> response = (ApiResponse<AgentsWorkPlansResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification. For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String managementUnitId, UserListScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(managementUnitId, body));
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days. Historical Shrinkage for a given date range can be queried in two modes - granular and aggregated. To see granular shrinkage information, provide granularity in the request body. 
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse postWorkforcemanagementManagementunitShrinkageJobs(String managementUnitId, WfmHistoricalShrinkageRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitShrinkageJobs(createPostWorkforcemanagementManagementunitShrinkageJobsRequest(managementUnitId, body));
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days. Historical Shrinkage for a given date range can be queried in two modes - granular and aggregated. To see granular shrinkage information, provide granularity in the request body. 
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> postWorkforcemanagementManagementunitShrinkageJobsWithHttpInfo(String managementUnitId, WfmHistoricalShrinkageRequest body) throws IOException {
    return postWorkforcemanagementManagementunitShrinkageJobs(createPostWorkforcemanagementManagementunitShrinkageJobsRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitShrinkageJobsRequest createPostWorkforcemanagementManagementunitShrinkageJobsRequest(String managementUnitId, WfmHistoricalShrinkageRequest body) {
    return PostWorkforcemanagementManagementunitShrinkageJobsRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days. Historical Shrinkage for a given date range can be queried in two modes - granular and aggregated. To see granular shrinkage information, provide granularity in the request body. 
   * @param request The request object
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse postWorkforcemanagementManagementunitShrinkageJobs(PostWorkforcemanagementManagementunitShrinkageJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalShrinkageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalShrinkageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days. Historical Shrinkage for a given date range can be queried in two modes - granular and aggregated. To see granular shrinkage information, provide granularity in the request body. 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> postWorkforcemanagementManagementunitShrinkageJobs(ApiRequest<WfmHistoricalShrinkageRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalShrinkageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Creates a new time off limit object under management unit.
   * Only one limit object is allowed under management unit, so an attempt to create second object will fail.
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * Retrieves integration statuses for a list of time off requests
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
   * @return UserTimeOffIntegrationStatusResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserTimeOffIntegrationStatusResponseListing postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQuery(String managementUnitId, QueryTimeOffIntegrationStatusRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest(managementUnitId, body));
  }

  /**
   * Retrieves integration statuses for a list of time off requests
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
   * @return UserTimeOffIntegrationStatusResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserTimeOffIntegrationStatusResponseListing> postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryWithHttpInfo(String managementUnitId, QueryTimeOffIntegrationStatusRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest createPostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest(String managementUnitId, QueryTimeOffIntegrationStatusRequest body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .build();
  }

  /**
   * Retrieves integration statuses for a list of time off requests
   * 
   * @param request The request object
   * @return UserTimeOffIntegrationStatusResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserTimeOffIntegrationStatusResponseListing postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQuery(PostWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserTimeOffIntegrationStatusResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserTimeOffIntegrationStatusResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves integration statuses for a list of time off requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserTimeOffIntegrationStatusResponseListing> postWorkforcemanagementManagementunitTimeoffrequestsIntegrationstatusQuery(ApiRequest<QueryTimeOffIntegrationStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserTimeOffIntegrationStatusResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserTimeOffIntegrationStatusResponseListing> response = (ApiResponse<UserTimeOffIntegrationStatusResponseListing>)(ApiResponse<?>)exception;
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
      ApiResponse<UserTimeOffIntegrationStatusResponseListing> response = (ApiResponse<UserTimeOffIntegrationStatusResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return TimeOffRequestListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestListing postWorkforcemanagementManagementunitTimeoffrequestsQuery(String managementUnitId, TimeOffRequestQueryBody body, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(managementUnitId, body, forceDownloadService));
  }

  /**
   * Fetches time off requests matching the conditions specified in the request body
   * Request body requires one of the following: User ID is specified, statuses == [Pending] or date range to be specified and less than or equal to 33 days.  All other fields are filters
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return TimeOffRequestListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestListing> postWorkforcemanagementManagementunitTimeoffrequestsQueryWithHttpInfo(String managementUnitId, TimeOffRequestQueryBody body, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(managementUnitId, body, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(String managementUnitId, TimeOffRequestQueryBody body, Boolean forceDownloadService) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withBody(body)

            .withForceDownloadService(forceDownloadService)

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
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param body body (required)
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
   * Query time off balances for a given user for specified activity code and dates
   * 
   * @param managementUnitId The ID of the management unit (required)
   * @param userId The ID of the user (required)
   * @param body The request body (required)
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementManagementunitUserTimeoffbalanceJobs(String managementUnitId, String userId, TimeOffBalanceRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitUserTimeoffbalanceJobs(createPostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest(managementUnitId, userId, body));
  }

  /**
   * Query time off balances for a given user for specified activity code and dates
   * 
   * @param managementUnitId The ID of the management unit (required)
   * @param userId The ID of the user (required)
   * @param body The request body (required)
   * @return TimeOffBalancesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementManagementunitUserTimeoffbalanceJobsWithHttpInfo(String managementUnitId, String userId, TimeOffBalanceRequest body) throws IOException {
    return postWorkforcemanagementManagementunitUserTimeoffbalanceJobs(createPostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest(managementUnitId, userId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest createPostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest(String managementUnitId, String userId, TimeOffBalanceRequest body) {
    return PostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Query time off balances for a given user for specified activity code and dates
   * 
   * @param request The request object
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementManagementunitUserTimeoffbalanceJobs(PostWorkforcemanagementManagementunitUserTimeoffbalanceJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffBalancesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffBalancesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query time off balances for a given user for specified activity code and dates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementManagementunitUserTimeoffbalanceJobs(ApiRequest<TimeOffBalanceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffBalancesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query time off balances for dates spanned by a given time off request
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param userId The userId to whom the time off request applies. (required)
   * @param timeOffRequestId The time off request id. (required)
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobs(String managementUnitId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobs(createPostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest(managementUnitId, userId, timeOffRequestId));
  }

  /**
   * Query time off balances for dates spanned by a given time off request
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param userId The userId to whom the time off request applies. (required)
   * @param timeOffRequestId The time off request id. (required)
   * @return TimeOffBalancesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsWithHttpInfo(String managementUnitId, String userId, String timeOffRequestId) throws IOException {
    return postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobs(createPostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest(managementUnitId, userId, timeOffRequestId).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest createPostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest(String managementUnitId, String userId, String timeOffRequestId) {
    return PostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withUserId(userId)

            .withTimeOffRequestId(timeOffRequestId)

            .build();
  }

  /**
   * Query time off balances for dates spanned by a given time off request
   * 
   * @param request The request object
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobs(PostWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffBalancesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffBalancesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query time off balances for dates spanned by a given time off request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementManagementunitUserTimeoffrequestTimeoffbalanceJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffBalancesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Estimates available time off for an agent
   * 
   * @param managementUnitId The ID of the management unit (required)
   * @param userId The id of the user for whom the time off request estimate is requested (required)
   * @param body body (required)
   * @return EstimateAvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateAvailableTimeOffResponse postWorkforcemanagementManagementunitUserTimeoffrequestsEstimate(String managementUnitId, String userId, EstimateAvailableTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitUserTimeoffrequestsEstimate(createPostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest(managementUnitId, userId, body));
  }

  /**
   * Estimates available time off for an agent
   * 
   * @param managementUnitId The ID of the management unit (required)
   * @param userId The id of the user for whom the time off request estimate is requested (required)
   * @param body body (required)
   * @return EstimateAvailableTimeOffResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateAvailableTimeOffResponse> postWorkforcemanagementManagementunitUserTimeoffrequestsEstimateWithHttpInfo(String managementUnitId, String userId, EstimateAvailableTimeOffRequest body) throws IOException {
    return postWorkforcemanagementManagementunitUserTimeoffrequestsEstimate(createPostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest(managementUnitId, userId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest createPostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest(String managementUnitId, String userId, EstimateAvailableTimeOffRequest body) {
    return PostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withUserId(userId)

            .withBody(body)

            .build();
  }

  /**
   * Estimates available time off for an agent
   * 
   * @param request The request object
   * @return EstimateAvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateAvailableTimeOffResponse postWorkforcemanagementManagementunitUserTimeoffrequestsEstimate(PostWorkforcemanagementManagementunitUserTimeoffrequestsEstimateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EstimateAvailableTimeOffResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EstimateAvailableTimeOffResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Estimates available time off for an agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateAvailableTimeOffResponse> postWorkforcemanagementManagementunitUserTimeoffrequestsEstimate(ApiRequest<EstimateAvailableTimeOffRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EstimateAvailableTimeOffResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EstimateAvailableTimeOffResponse> response = (ApiResponse<EstimateAvailableTimeOffResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EstimateAvailableTimeOffResponse> response = (ApiResponse<EstimateAvailableTimeOffResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @param body body (required)
   * @return MatchShiftTradeResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MatchShiftTradeResponse postWorkforcemanagementManagementunitWeekShifttradeMatch(String managementUnitId, LocalDate weekDateId, String tradeId, MatchShiftTradeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttradeMatch(createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(managementUnitId, weekDateId, tradeId, body));
  }

  /**
   * Matches a shift trade. This route can only be called by the receiving agent
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param tradeId The ID of the shift trade to update (required)
   * @param body body (required)
   * @return MatchShiftTradeResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MatchShiftTradeResponse> postWorkforcemanagementManagementunitWeekShifttradeMatchWithHttpInfo(String managementUnitId, LocalDate weekDateId, String tradeId, MatchShiftTradeRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttradeMatch(createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(managementUnitId, weekDateId, tradeId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest createPostWorkforcemanagementManagementunitWeekShifttradeMatchRequest(String managementUnitId, LocalDate weekDateId, String tradeId, MatchShiftTradeRequest body) {
    return PostWorkforcemanagementManagementunitWeekShifttradeMatchRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withWeekDateId(weekDateId)

            .withTradeId(tradeId)

            .withBody(body)

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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return SearchShiftTradesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SearchShiftTradesResponse postWorkforcemanagementManagementunitWeekShifttradesSearch(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body, Boolean forceDownloadService) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShifttradesSearch(createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(managementUnitId, weekDateId, body, forceDownloadService));
  }

  /**
   * Searches for potential shift trade matches for the current agent
   * 
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
   * @param body body (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service. For testing/app development purposes (optional)
   * @return SearchShiftTradesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SearchShiftTradesResponse> postWorkforcemanagementManagementunitWeekShifttradesSearchWithHttpInfo(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body, Boolean forceDownloadService) throws IOException {
    return postWorkforcemanagementManagementunitWeekShifttradesSearch(createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(managementUnitId, weekDateId, body, forceDownloadService).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest createPostWorkforcemanagementManagementunitWeekShifttradesSearchRequest(String managementUnitId, LocalDate weekDateId, SearchShiftTradesRequest body, Boolean forceDownloadService) {
    return PostWorkforcemanagementManagementunitWeekShifttradesSearchRequest.builder()
            .withManagementUnitId(managementUnitId)

            .withWeekDateId(weekDateId)

            .withBody(body)

            .withForceDownloadService(forceDownloadService)

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
   * Admin functionality is not supported with \"mine\".
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
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
   * Admin functionality is not supported with \"mine\".
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param weekDateId The start week date of the initiating shift in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd (required)
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
   * Admin functionality is not supported with \"mine\".
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
   * Admin functionality is not supported with \"mine\".
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to create a copy (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to create a copy (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to validate. For new work plan, use the word 'new' for the ID. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to validate. For new work plan, use the word 'new' for the ID. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to create a copy (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param workPlanRotationId The ID of the work plan rotation to create a copy (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit, or 'mine' for the management unit of the logged-in user. (required)
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * @deprecated
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
   * Request a teams historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param teamId The ID of the team (required)
   * @param body body (required)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementTeamAdherenceHistorical(String teamId, WfmHistoricalAdherenceQueryForTeams body) throws IOException, ApiException {
    return  postWorkforcemanagementTeamAdherenceHistorical(createPostWorkforcemanagementTeamAdherenceHistoricalRequest(teamId, body));
  }

  /**
   * Request a teams historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param teamId The ID of the team (required)
   * @param body body (required)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementTeamAdherenceHistoricalWithHttpInfo(String teamId, WfmHistoricalAdherenceQueryForTeams body) throws IOException {
    return postWorkforcemanagementTeamAdherenceHistorical(createPostWorkforcemanagementTeamAdherenceHistoricalRequest(teamId, body).withHttpInfo());
  }

  private PostWorkforcemanagementTeamAdherenceHistoricalRequest createPostWorkforcemanagementTeamAdherenceHistoricalRequest(String teamId, WfmHistoricalAdherenceQueryForTeams body) {
    return PostWorkforcemanagementTeamAdherenceHistoricalRequest.builder()
            .withTeamId(teamId)

            .withBody(body)

            .build();
  }

  /**
   * Request a teams historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request The request object
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementTeamAdherenceHistorical(PostWorkforcemanagementTeamAdherenceHistoricalRequest request) throws IOException, ApiException {
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
   * Request a teams historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementTeamAdherenceHistorical(ApiRequest<WfmHistoricalAdherenceQueryForTeams> request) throws IOException {
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
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days
   * @param teamId The ID of the team (required)
   * @param body body (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse postWorkforcemanagementTeamShrinkageJobs(String teamId, WfmHistoricalShrinkageTeamsRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTeamShrinkageJobs(createPostWorkforcemanagementTeamShrinkageJobsRequest(teamId, body));
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days
   * @param teamId The ID of the team (required)
   * @param body body (required)
   * @return WfmHistoricalShrinkageResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> postWorkforcemanagementTeamShrinkageJobsWithHttpInfo(String teamId, WfmHistoricalShrinkageTeamsRequest body) throws IOException {
    return postWorkforcemanagementTeamShrinkageJobs(createPostWorkforcemanagementTeamShrinkageJobsRequest(teamId, body).withHttpInfo());
  }

  private PostWorkforcemanagementTeamShrinkageJobsRequest createPostWorkforcemanagementTeamShrinkageJobsRequest(String teamId, WfmHistoricalShrinkageTeamsRequest body) {
    return PostWorkforcemanagementTeamShrinkageJobsRequest.builder()
            .withTeamId(teamId)

            .withBody(body)

            .build();
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days
   * @param request The request object
   * @return WfmHistoricalShrinkageResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalShrinkageResponse postWorkforcemanagementTeamShrinkageJobs(PostWorkforcemanagementTeamShrinkageJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmHistoricalShrinkageResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmHistoricalShrinkageResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a historical shrinkage report
   * The maximum supported range for historical shrinkage queries is up to 32 days
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalShrinkageResponse> postWorkforcemanagementTeamShrinkageJobs(ApiRequest<WfmHistoricalShrinkageTeamsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmHistoricalShrinkageResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WfmHistoricalShrinkageResponse> response = (ApiResponse<WfmHistoricalShrinkageResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query time off balances for the current user for specified activity code and dates
   * 
   * @param body The request body (required)
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementTimeoffbalanceJobs(TimeOffBalanceRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTimeoffbalanceJobs(createPostWorkforcemanagementTimeoffbalanceJobsRequest(body));
  }

  /**
   * Query time off balances for the current user for specified activity code and dates
   * 
   * @param body The request body (required)
   * @return TimeOffBalancesResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementTimeoffbalanceJobsWithHttpInfo(TimeOffBalanceRequest body) throws IOException {
    return postWorkforcemanagementTimeoffbalanceJobs(createPostWorkforcemanagementTimeoffbalanceJobsRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementTimeoffbalanceJobsRequest createPostWorkforcemanagementTimeoffbalanceJobsRequest(TimeOffBalanceRequest body) {
    return PostWorkforcemanagementTimeoffbalanceJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query time off balances for the current user for specified activity code and dates
   * 
   * @param request The request object
   * @return TimeOffBalancesResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffBalancesResponse postWorkforcemanagementTimeoffbalanceJobs(PostWorkforcemanagementTimeoffbalanceJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffBalancesResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffBalancesResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query time off balances for the current user for specified activity code and dates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffBalancesResponse> postWorkforcemanagementTimeoffbalanceJobs(ApiRequest<TimeOffBalanceRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffBalancesResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffBalancesResponse> response = (ApiResponse<TimeOffBalancesResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Queries available time off for the current user
   * 
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * @param body body (required)
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
   * Estimates available time off for current user
   * 
   * @param body body (required)
   * @return EstimateAvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateAvailableTimeOffResponse postWorkforcemanagementTimeoffrequestsEstimate(EstimateAvailableTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTimeoffrequestsEstimate(createPostWorkforcemanagementTimeoffrequestsEstimateRequest(body));
  }

  /**
   * Estimates available time off for current user
   * 
   * @param body body (required)
   * @return EstimateAvailableTimeOffResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateAvailableTimeOffResponse> postWorkforcemanagementTimeoffrequestsEstimateWithHttpInfo(EstimateAvailableTimeOffRequest body) throws IOException {
    return postWorkforcemanagementTimeoffrequestsEstimate(createPostWorkforcemanagementTimeoffrequestsEstimateRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementTimeoffrequestsEstimateRequest createPostWorkforcemanagementTimeoffrequestsEstimateRequest(EstimateAvailableTimeOffRequest body) {
    return PostWorkforcemanagementTimeoffrequestsEstimateRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Estimates available time off for current user
   * 
   * @param request The request object
   * @return EstimateAvailableTimeOffResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateAvailableTimeOffResponse postWorkforcemanagementTimeoffrequestsEstimate(PostWorkforcemanagementTimeoffrequestsEstimateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EstimateAvailableTimeOffResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EstimateAvailableTimeOffResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Estimates available time off for current user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateAvailableTimeOffResponse> postWorkforcemanagementTimeoffrequestsEstimate(ApiRequest<EstimateAvailableTimeOffRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EstimateAvailableTimeOffResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EstimateAvailableTimeOffResponse> response = (ApiResponse<EstimateAvailableTimeOffResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EstimateAvailableTimeOffResponse> response = (ApiResponse<EstimateAvailableTimeOffResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves integration statuses for a list of current user time off requests
   * 
   * @param body body (required)
   * @return TimeOffIntegrationStatusResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffIntegrationStatusResponseListing postWorkforcemanagementTimeoffrequestsIntegrationstatusQuery(CurrentUserTimeOffIntegrationStatusRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementTimeoffrequestsIntegrationstatusQuery(createPostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest(body));
  }

  /**
   * Retrieves integration statuses for a list of current user time off requests
   * 
   * @param body body (required)
   * @return TimeOffIntegrationStatusResponseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffIntegrationStatusResponseListing> postWorkforcemanagementTimeoffrequestsIntegrationstatusQueryWithHttpInfo(CurrentUserTimeOffIntegrationStatusRequest body) throws IOException {
    return postWorkforcemanagementTimeoffrequestsIntegrationstatusQuery(createPostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest(body).withHttpInfo());
  }

  private PostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest createPostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest(CurrentUserTimeOffIntegrationStatusRequest body) {
    return PostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Retrieves integration statuses for a list of current user time off requests
   * 
   * @param request The request object
   * @return TimeOffIntegrationStatusResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffIntegrationStatusResponseListing postWorkforcemanagementTimeoffrequestsIntegrationstatusQuery(PostWorkforcemanagementTimeoffrequestsIntegrationstatusQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffIntegrationStatusResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffIntegrationStatusResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves integration statuses for a list of current user time off requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffIntegrationStatusResponseListing> postWorkforcemanagementTimeoffrequestsIntegrationstatusQuery(ApiRequest<CurrentUserTimeOffIntegrationStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffIntegrationStatusResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffIntegrationStatusResponseListing> response = (ApiResponse<TimeOffIntegrationStatusResponseListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TimeOffIntegrationStatusResponseListing> response = (ApiResponse<TimeOffIntegrationStatusResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update integrations for agent
   * 
   * @param agentId The ID of the agent (required)
   * @param body body (required)
   * @return AgentIntegrationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentIntegrationsResponse putWorkforcemanagementAgentIntegrationsHris(String agentId, AgentIntegrationsRequest body) throws IOException, ApiException {
    return  putWorkforcemanagementAgentIntegrationsHris(createPutWorkforcemanagementAgentIntegrationsHrisRequest(agentId, body));
  }

  /**
   * Update integrations for agent
   * 
   * @param agentId The ID of the agent (required)
   * @param body body (required)
   * @return AgentIntegrationsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentIntegrationsResponse> putWorkforcemanagementAgentIntegrationsHrisWithHttpInfo(String agentId, AgentIntegrationsRequest body) throws IOException {
    return putWorkforcemanagementAgentIntegrationsHris(createPutWorkforcemanagementAgentIntegrationsHrisRequest(agentId, body).withHttpInfo());
  }

  private PutWorkforcemanagementAgentIntegrationsHrisRequest createPutWorkforcemanagementAgentIntegrationsHrisRequest(String agentId, AgentIntegrationsRequest body) {
    return PutWorkforcemanagementAgentIntegrationsHrisRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .build();
  }

  /**
   * Update integrations for agent
   * 
   * @param request The request object
   * @return AgentIntegrationsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentIntegrationsResponse putWorkforcemanagementAgentIntegrationsHris(PutWorkforcemanagementAgentIntegrationsHrisRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentIntegrationsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentIntegrationsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update integrations for agent
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentIntegrationsResponse> putWorkforcemanagementAgentIntegrationsHris(ApiRequest<AgentIntegrationsRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentIntegrationsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentIntegrationsResponse> response = (ApiResponse<AgentIntegrationsResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentIntegrationsResponse> response = (ApiResponse<AgentIntegrationsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Sets daily values for a date range of time-off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time-off limit API
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit object to set values for (required)
   * @param body body (required)
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse putWorkforcemanagementBusinessunitTimeofflimitValues(String businessUnitId, String timeOffLimitId, BuSetTimeOffLimitValuesRequest body) throws IOException, ApiException {
    return  putWorkforcemanagementBusinessunitTimeofflimitValues(createPutWorkforcemanagementBusinessunitTimeofflimitValuesRequest(businessUnitId, timeOffLimitId, body));
  }

  /**
   * Sets daily values for a date range of time-off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time-off limit API
   * @param businessUnitId The ID of the business unit (required)
   * @param timeOffLimitId The ID of the time-off limit object to set values for (required)
   * @param body body (required)
   * @return BuTimeOffLimitResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> putWorkforcemanagementBusinessunitTimeofflimitValuesWithHttpInfo(String businessUnitId, String timeOffLimitId, BuSetTimeOffLimitValuesRequest body) throws IOException {
    return putWorkforcemanagementBusinessunitTimeofflimitValues(createPutWorkforcemanagementBusinessunitTimeofflimitValuesRequest(businessUnitId, timeOffLimitId, body).withHttpInfo());
  }

  private PutWorkforcemanagementBusinessunitTimeofflimitValuesRequest createPutWorkforcemanagementBusinessunitTimeofflimitValuesRequest(String businessUnitId, String timeOffLimitId, BuSetTimeOffLimitValuesRequest body) {
    return PutWorkforcemanagementBusinessunitTimeofflimitValuesRequest.builder()
            .withBusinessUnitId(businessUnitId)

            .withTimeOffLimitId(timeOffLimitId)

            .withBody(body)

            .build();
  }

  /**
   * Sets daily values for a date range of time-off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time-off limit API
   * @param request The request object
   * @return BuTimeOffLimitResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BuTimeOffLimitResponse putWorkforcemanagementBusinessunitTimeofflimitValues(PutWorkforcemanagementBusinessunitTimeofflimitValuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BuTimeOffLimitResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BuTimeOffLimitResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Sets daily values for a date range of time-off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time-off limit API
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BuTimeOffLimitResponse> putWorkforcemanagementBusinessunitTimeofflimitValues(ApiRequest<BuSetTimeOffLimitValuesRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BuTimeOffLimitResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<BuTimeOffLimitResponse> response = (ApiResponse<BuTimeOffLimitResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Sets daily values for a date range of time off limit object
   * Note that only limit daily values can be set through API, allocated and waitlisted values are read-only for time off limit API
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to set values for (required)
   * @param body body (required)
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
   * @param managementUnitId The ID of the management unit. (required)
   * @param timeOffLimitId The ID of the time off limit object to set values for (required)
   * @param body body (required)
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
