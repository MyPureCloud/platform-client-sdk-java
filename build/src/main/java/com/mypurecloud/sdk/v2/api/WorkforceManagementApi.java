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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
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
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.ForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
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
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitAgentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitIntradayQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSchedulingRunsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitServicegoalgroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitActivitycodeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitSchedulingRunRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitServicegoalgroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWeekScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementManagementunitWorkplanRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementAdherenceHistoricalRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitIntradayRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplanCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitWorkplansRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementTimeoffrequestsRequest;

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
   * Delete management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunit(String muId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunit(createDeleteWorkforcemanagementManagementunitRequest(muId));
  }

  /**
   * Delete management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWithHttpInfo(String muId) throws IOException {
    return deleteWorkforcemanagementManagementunit(createDeleteWorkforcemanagementManagementunitRequest(muId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitRequest createDeleteWorkforcemanagementManagementunitRequest(String muId) {
    return DeleteWorkforcemanagementManagementunitRequest.builder()
            .withMuId(muId)
    
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
   * Deletes an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitActivitycode(String muId, String acId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitActivitycode(createDeleteWorkforcemanagementManagementunitActivitycodeRequest(muId, acId));
  }

  /**
   * Deletes an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitActivitycodeWithHttpInfo(String muId, String acId) throws IOException {
    return deleteWorkforcemanagementManagementunitActivitycode(createDeleteWorkforcemanagementManagementunitActivitycodeRequest(muId, acId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitActivitycodeRequest createDeleteWorkforcemanagementManagementunitActivitycodeRequest(String muId, String acId) {
    return DeleteWorkforcemanagementManagementunitActivitycodeRequest.builder()
            .withMuId(muId)
    
            .withAcId(acId)
    
            .build();
  }

  /**
   * Deletes an activity code
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitActivitycode(DeleteWorkforcemanagementManagementunitActivitycodeRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitActivitycode(ApiRequest<Void> request) throws IOException {
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
   * Cancel a schedule run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitSchedulingRun(String managementUnitId, String runId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitSchedulingRun(createDeleteWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId));
  }

  /**
   * Cancel a schedule run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitSchedulingRunWithHttpInfo(String managementUnitId, String runId) throws IOException {
    return deleteWorkforcemanagementManagementunitSchedulingRun(createDeleteWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitSchedulingRunRequest createDeleteWorkforcemanagementManagementunitSchedulingRunRequest(String managementUnitId, String runId) {
    return DeleteWorkforcemanagementManagementunitSchedulingRunRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withRunId(runId)
    
            .build();
  }

  /**
   * Cancel a schedule run
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitSchedulingRun(DeleteWorkforcemanagementManagementunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Cancel a schedule run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitSchedulingRun(ApiRequest<Void> request) throws IOException {
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
   * Delete a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitServicegoalgroup(String managementUnitId, String serviceGoalGroupId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitServicegoalgroup(createDeleteWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId));
  }

  /**
   * Delete a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitServicegoalgroupWithHttpInfo(String managementUnitId, String serviceGoalGroupId) throws IOException {
    return deleteWorkforcemanagementManagementunitServicegoalgroup(createDeleteWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitServicegoalgroupRequest createDeleteWorkforcemanagementManagementunitServicegoalgroupRequest(String managementUnitId, String serviceGoalGroupId) {
    return DeleteWorkforcemanagementManagementunitServicegoalgroupRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withServiceGoalGroupId(serviceGoalGroupId)
    
            .build();
  }

  /**
   * Delete a service goal group
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitServicegoalgroup(DeleteWorkforcemanagementManagementunitServicegoalgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a service goal group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitServicegoalgroup(ApiRequest<Void> request) throws IOException {
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
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of theschedule to delete (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWeekSchedule(String managementUnitId, String weekId, String scheduleId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitWeekSchedule(createDeleteWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId));
  }

  /**
   * Delete a schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of theschedule to delete (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWeekScheduleWithHttpInfo(String managementUnitId, String weekId, String scheduleId) throws IOException {
    return deleteWorkforcemanagementManagementunitWeekSchedule(createDeleteWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitWeekScheduleRequest createDeleteWorkforcemanagementManagementunitWeekScheduleRequest(String managementUnitId, String weekId, String scheduleId) {
    return DeleteWorkforcemanagementManagementunitWeekScheduleRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Delete a schedule
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWeekSchedule(DeleteWorkforcemanagementManagementunitWeekScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWeekSchedule(ApiRequest<Void> request) throws IOException {
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
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteWorkforcemanagementManagementunitWeekShorttermforecast(String managementUnitId, String weekDateId, String forecastId) throws IOException, ApiException {
     deleteWorkforcemanagementManagementunitWeekShorttermforecast(createDeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest(managementUnitId, weekDateId, forecastId));
  }

  /**
   * Delete a short term forecast
   * Must not be tied to any schedules
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWeekShorttermforecastWithHttpInfo(String managementUnitId, String weekDateId, String forecastId) throws IOException {
    return deleteWorkforcemanagementManagementunitWeekShorttermforecast(createDeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest(managementUnitId, weekDateId, forecastId).withHttpInfo());
  }

  private DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest createDeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest(String managementUnitId, String weekDateId, String forecastId) {
    return DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest.builder()
            .withManagementUnitId(managementUnitId)
    
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
  public void deleteWorkforcemanagementManagementunitWeekShorttermforecast(DeleteWorkforcemanagementManagementunitWeekShorttermforecastRequest request) throws IOException, ApiException {
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
  public ApiResponse<Void> deleteWorkforcemanagementManagementunitWeekShorttermforecast(ApiRequest<Void> request) throws IOException {
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
   * Get management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return ManagementUnit
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnit getWorkforcemanagementManagementunit(String muId, String expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunit(createGetWorkforcemanagementManagementunitRequest(muId, expand));
  }

  /**
   * Get management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return ManagementUnit
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnit> getWorkforcemanagementManagementunitWithHttpInfo(String muId, String expand) throws IOException {
    return getWorkforcemanagementManagementunit(createGetWorkforcemanagementManagementunitRequest(muId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitRequest createGetWorkforcemanagementManagementunitRequest(String muId, String expand) {
    return GetWorkforcemanagementManagementunitRequest.builder()
            .withMuId(muId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get management unit
   * 
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
   * 
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
   * Get an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to fetch (required)
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode getWorkforcemanagementManagementunitActivitycode(String muId, String acId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycode(createGetWorkforcemanagementManagementunitActivitycodeRequest(muId, acId));
  }

  /**
   * Get an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to fetch (required)
   * @return ActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCode> getWorkforcemanagementManagementunitActivitycodeWithHttpInfo(String muId, String acId) throws IOException {
    return getWorkforcemanagementManagementunitActivitycode(createGetWorkforcemanagementManagementunitActivitycodeRequest(muId, acId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitActivitycodeRequest createGetWorkforcemanagementManagementunitActivitycodeRequest(String muId, String acId) {
    return GetWorkforcemanagementManagementunitActivitycodeRequest.builder()
            .withMuId(muId)
    
            .withAcId(acId)
    
            .build();
  }

  /**
   * Get an activity code
   * 
   * @param request The request object
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode getWorkforcemanagementManagementunitActivitycode(GetWorkforcemanagementManagementunitActivitycodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCode>() {});
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
  public ApiResponse<ActivityCode> getWorkforcemanagementManagementunitActivitycode(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCodeContainer getWorkforcemanagementManagementunitActivitycodes(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(muId));
  }

  /**
   * Get activity codes
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ActivityCodeContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String muId) throws IOException {
    return getWorkforcemanagementManagementunitActivitycodes(createGetWorkforcemanagementManagementunitActivitycodesRequest(muId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitActivitycodesRequest createGetWorkforcemanagementManagementunitActivitycodesRequest(String muId) {
    return GetWorkforcemanagementManagementunitActivitycodesRequest.builder()
            .withMuId(muId)
    
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
   * Get data for agent in the management unit
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @return WfmAgent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmAgent getWorkforcemanagementManagementunitAgent(String managementUnitId, String agentId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId));
  }

  /**
   * Get data for agent in the management unit
   * 
   * @param managementUnitId The id of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param agentId The agent id (required)
   * @return WfmAgent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmAgent> getWorkforcemanagementManagementunitAgentWithHttpInfo(String managementUnitId, String agentId) throws IOException {
    return getWorkforcemanagementManagementunitAgent(createGetWorkforcemanagementManagementunitAgentRequest(managementUnitId, agentId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitAgentRequest createGetWorkforcemanagementManagementunitAgentRequest(String managementUnitId, String agentId) {
    return GetWorkforcemanagementManagementunitAgentRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withAgentId(agentId)
    
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
   * Get intraday queues for the given date
   * 
   * @param muId The management unit ID of the management unit (required)
   * @param date yyyy-MM-dd date string interpreted in the configured management unit time zone (required)
   * @return WfmIntradayQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayQueueListing getWorkforcemanagementManagementunitIntradayQueues(String muId, String date) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitIntradayQueues(createGetWorkforcemanagementManagementunitIntradayQueuesRequest(muId, date));
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param muId The management unit ID of the management unit (required)
   * @param date yyyy-MM-dd date string interpreted in the configured management unit time zone (required)
   * @return WfmIntradayQueueListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueuesWithHttpInfo(String muId, String date) throws IOException {
    return getWorkforcemanagementManagementunitIntradayQueues(createGetWorkforcemanagementManagementunitIntradayQueuesRequest(muId, date).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitIntradayQueuesRequest createGetWorkforcemanagementManagementunitIntradayQueuesRequest(String muId, String date) {
    return GetWorkforcemanagementManagementunitIntradayQueuesRequest.builder()
            .withMuId(muId)
    
            .withDate(date)
    
            .build();
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param request The request object
   * @return WfmIntradayQueueListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmIntradayQueueListing getWorkforcemanagementManagementunitIntradayQueues(GetWorkforcemanagementManagementunitIntradayQueuesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WfmIntradayQueueListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WfmIntradayQueueListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueues(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WfmIntradayQueueListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets the status for a specific scheduling run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @return SchedulingRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingRunResponse getWorkforcemanagementManagementunitSchedulingRun(String managementUnitId, String runId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitSchedulingRun(createGetWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId));
  }

  /**
   * Gets the status for a specific scheduling run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @return SchedulingRunResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingRunResponse> getWorkforcemanagementManagementunitSchedulingRunWithHttpInfo(String managementUnitId, String runId) throws IOException {
    return getWorkforcemanagementManagementunitSchedulingRun(createGetWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitSchedulingRunRequest createGetWorkforcemanagementManagementunitSchedulingRunRequest(String managementUnitId, String runId) {
    return GetWorkforcemanagementManagementunitSchedulingRunRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withRunId(runId)
    
            .build();
  }

  /**
   * Gets the status for a specific scheduling run
   * 
   * @param request The request object
   * @return SchedulingRunResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingRunResponse getWorkforcemanagementManagementunitSchedulingRun(GetWorkforcemanagementManagementunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchedulingRunResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchedulingRunResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the status for a specific scheduling run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingRunResponse> getWorkforcemanagementManagementunitSchedulingRun(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchedulingRunResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingRunResponse> response = (ApiResponse<SchedulingRunResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingRunResponse> response = (ApiResponse<SchedulingRunResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets the result of a specific scheduling run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @return RescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RescheduleResult getWorkforcemanagementManagementunitSchedulingRunResult(String managementUnitId, String runId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitSchedulingRunResult(createGetWorkforcemanagementManagementunitSchedulingRunResultRequest(managementUnitId, runId));
  }

  /**
   * Gets the result of a specific scheduling run
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @return RescheduleResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RescheduleResult> getWorkforcemanagementManagementunitSchedulingRunResultWithHttpInfo(String managementUnitId, String runId) throws IOException {
    return getWorkforcemanagementManagementunitSchedulingRunResult(createGetWorkforcemanagementManagementunitSchedulingRunResultRequest(managementUnitId, runId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitSchedulingRunResultRequest createGetWorkforcemanagementManagementunitSchedulingRunResultRequest(String managementUnitId, String runId) {
    return GetWorkforcemanagementManagementunitSchedulingRunResultRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withRunId(runId)
    
            .build();
  }

  /**
   * Gets the result of a specific scheduling run
   * 
   * @param request The request object
   * @return RescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RescheduleResult getWorkforcemanagementManagementunitSchedulingRunResult(GetWorkforcemanagementManagementunitSchedulingRunResultRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RescheduleResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RescheduleResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the result of a specific scheduling run
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RescheduleResult> getWorkforcemanagementManagementunitSchedulingRunResult(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RescheduleResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the status of all the ongoing schedule runs
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @return SchedulingRunListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingRunListResponse getWorkforcemanagementManagementunitSchedulingRuns(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitSchedulingRuns(createGetWorkforcemanagementManagementunitSchedulingRunsRequest(managementUnitId));
  }

  /**
   * Get the status of all the ongoing schedule runs
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @return SchedulingRunListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingRunListResponse> getWorkforcemanagementManagementunitSchedulingRunsWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitSchedulingRuns(createGetWorkforcemanagementManagementunitSchedulingRunsRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitSchedulingRunsRequest createGetWorkforcemanagementManagementunitSchedulingRunsRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitSchedulingRunsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Get the status of all the ongoing schedule runs
   * 
   * @param request The request object
   * @return SchedulingRunListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SchedulingRunListResponse getWorkforcemanagementManagementunitSchedulingRuns(GetWorkforcemanagementManagementunitSchedulingRunsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SchedulingRunListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SchedulingRunListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the status of all the ongoing schedule runs
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SchedulingRunListResponse> getWorkforcemanagementManagementunitSchedulingRuns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SchedulingRunListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingRunListResponse> response = (ApiResponse<SchedulingRunListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SchedulingRunListResponse> response = (ApiResponse<SchedulingRunListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to fetch (required)
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup getWorkforcemanagementManagementunitServicegoalgroup(String managementUnitId, String serviceGoalGroupId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitServicegoalgroup(createGetWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId));
  }

  /**
   * Get a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to fetch (required)
   * @return ServiceGoalGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> getWorkforcemanagementManagementunitServicegoalgroupWithHttpInfo(String managementUnitId, String serviceGoalGroupId) throws IOException {
    return getWorkforcemanagementManagementunitServicegoalgroup(createGetWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitServicegoalgroupRequest createGetWorkforcemanagementManagementunitServicegoalgroupRequest(String managementUnitId, String serviceGoalGroupId) {
    return GetWorkforcemanagementManagementunitServicegoalgroupRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withServiceGoalGroupId(serviceGoalGroupId)
    
            .build();
  }

  /**
   * Get a service goal group
   * 
   * @param request The request object
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup getWorkforcemanagementManagementunitServicegoalgroup(GetWorkforcemanagementManagementunitServicegoalgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a service goal group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> getWorkforcemanagementManagementunitServicegoalgroup(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get service goal groups
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ServiceGoalGroupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroupList getWorkforcemanagementManagementunitServicegoalgroups(String managementUnitId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitServicegoalgroups(createGetWorkforcemanagementManagementunitServicegoalgroupsRequest(managementUnitId));
  }

  /**
   * Get service goal groups
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ServiceGoalGroupList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroupList> getWorkforcemanagementManagementunitServicegoalgroupsWithHttpInfo(String managementUnitId) throws IOException {
    return getWorkforcemanagementManagementunitServicegoalgroups(createGetWorkforcemanagementManagementunitServicegoalgroupsRequest(managementUnitId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitServicegoalgroupsRequest createGetWorkforcemanagementManagementunitServicegoalgroupsRequest(String managementUnitId) {
    return GetWorkforcemanagementManagementunitServicegoalgroupsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .build();
  }

  /**
   * Get service goal groups
   * 
   * @param request The request object
   * @return ServiceGoalGroupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroupList getWorkforcemanagementManagementunitServicegoalgroups(GetWorkforcemanagementManagementunitServicegoalgroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalGroupList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalGroupList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get service goal groups
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroupList> getWorkforcemanagementManagementunitServicegoalgroups(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalGroupList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroupList> response = (ApiResponse<ServiceGoalGroupList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroupList> response = (ApiResponse<ServiceGoalGroupList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the settings for the requested management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ManagementUnitSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitSettings getWorkforcemanagementManagementunitSettings(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitSettings(createGetWorkforcemanagementManagementunitSettingsRequest(muId));
  }

  /**
   * Get the settings for the requested management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return ManagementUnitSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitSettings> getWorkforcemanagementManagementunitSettingsWithHttpInfo(String muId) throws IOException {
    return getWorkforcemanagementManagementunitSettings(createGetWorkforcemanagementManagementunitSettingsRequest(muId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitSettingsRequest createGetWorkforcemanagementManagementunitSettingsRequest(String muId) {
    return GetWorkforcemanagementManagementunitSettingsRequest.builder()
            .withMuId(muId)
    
            .build();
  }

  /**
   * Get the settings for the requested management unit
   * 
   * @param request The request object
   * @return ManagementUnitSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitSettings getWorkforcemanagementManagementunitSettings(GetWorkforcemanagementManagementunitSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the settings for the requested management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitSettings> getWorkforcemanagementManagementunitSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitSettings> response = (ApiResponse<ManagementUnitSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitSettings> response = (ApiResponse<ManagementUnitSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse getWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId));
  }

  /**
   * Get a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param timeOffRequestId Time Off Request Id (required)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> getWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequest(createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestRequest(String muId, String userId, String timeOffRequestId) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withMuId(muId)
    
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
   * Get a list of time off requests for a given user
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList getWorkforcemanagementManagementunitUserTimeoffrequests(String muId, String userId, Boolean recentlyReviewed) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(muId, userId, recentlyReviewed));
  }

  /**
   * Get a list of time off requests for a given user
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The userId to whom the Time Off Request applies. (required)
   * @param recentlyReviewed Limit results to requests that have been reviewed within the preceding 30 days (optional, default to false)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsWithHttpInfo(String muId, String userId, Boolean recentlyReviewed) throws IOException {
    return getWorkforcemanagementManagementunitUserTimeoffrequests(createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(muId, userId, recentlyReviewed).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest createGetWorkforcemanagementManagementunitUserTimeoffrequestsRequest(String muId, String userId, Boolean recentlyReviewed) {
    return GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest.builder()
            .withMuId(muId)
    
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
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmUserEntityListing getWorkforcemanagementManagementunitUsers(String muId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(muId));
  }

  /**
   * Get users in the management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @return WfmUserEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersWithHttpInfo(String muId) throws IOException {
    return getWorkforcemanagementManagementunitUsers(createGetWorkforcemanagementManagementunitUsersRequest(muId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitUsersRequest createGetWorkforcemanagementManagementunitUsersRequest(String muId) {
    return GetWorkforcemanagementManagementunitUsersRequest.builder()
            .withMuId(muId)
    
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
   * Get a week schedule
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
   * Get a week schedule
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
   * Get a week schedule
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
   * Get a week schedule
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
   * Get week schedule generation results
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch generation results (required)
   * @return WeekScheduleGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleGenerationResult getWorkforcemanagementManagementunitWeekScheduleGenerationresults(String managementUnitId, String weekId, String scheduleId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekScheduleGenerationresults(createGetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest(managementUnitId, weekId, scheduleId));
  }

  /**
   * Get week schedule generation results
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to fetch generation results (required)
   * @return WeekScheduleGenerationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleGenerationResult> getWorkforcemanagementManagementunitWeekScheduleGenerationresultsWithHttpInfo(String managementUnitId, String weekId, String scheduleId) throws IOException {
    return getWorkforcemanagementManagementunitWeekScheduleGenerationresults(createGetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest(managementUnitId, weekId, scheduleId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest createGetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest(String managementUnitId, String weekId, String scheduleId) {
    return GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Get week schedule generation results
   * 
   * @param request The request object
   * @return WeekScheduleGenerationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleGenerationResult getWorkforcemanagementManagementunitWeekScheduleGenerationresults(GetWorkforcemanagementManagementunitWeekScheduleGenerationresultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WeekScheduleGenerationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WeekScheduleGenerationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get week schedule generation results
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleGenerationResult> getWorkforcemanagementManagementunitWeekScheduleGenerationresults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WeekScheduleGenerationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleGenerationResult> response = (ApiResponse<WeekScheduleGenerationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<WeekScheduleGenerationResult> response = (ApiResponse<WeekScheduleGenerationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get the list of schedules in a week in management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @return WeekScheduleListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WeekScheduleListResponse getWorkforcemanagementManagementunitWeekSchedules(String managementUnitId, String weekId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekSchedules(createGetWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId));
  }

  /**
   * Get the list of schedules in a week in management unit
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @return WeekScheduleListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WeekScheduleListResponse> getWorkforcemanagementManagementunitWeekSchedulesWithHttpInfo(String managementUnitId, String weekId) throws IOException {
    return getWorkforcemanagementManagementunitWeekSchedules(createGetWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekSchedulesRequest createGetWorkforcemanagementManagementunitWeekSchedulesRequest(String managementUnitId, String weekId) {
    return GetWorkforcemanagementManagementunitWeekSchedulesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .build();
  }

  /**
   * Get the list of schedules in a week in management unit
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
   * Get the list of schedules in a week in management unit
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
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return ForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ForecastResultResponse getWorkforcemanagementManagementunitWeekShorttermforecastFinal(String managementUnitId, String weekDateId, String forecastId, Boolean forceDownloadService) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekShorttermforecastFinal(createGetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest(managementUnitId, weekDateId, forecastId, forceDownloadService));
  }

  /**
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast (required)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @return ForecastResultResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ForecastResultResponse> getWorkforcemanagementManagementunitWeekShorttermforecastFinalWithHttpInfo(String managementUnitId, String weekDateId, String forecastId, Boolean forceDownloadService) throws IOException {
    return getWorkforcemanagementManagementunitWeekShorttermforecastFinal(createGetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest(managementUnitId, weekDateId, forecastId, forceDownloadService).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest createGetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest(String managementUnitId, String weekDateId, String forecastId, Boolean forceDownloadService) {
    return GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withForecastId(forecastId)
    
            .withForceDownloadService(forceDownloadService)
    
            .build();
  }

  /**
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param request The request object
   * @return ForecastResultResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ForecastResultResponse getWorkforcemanagementManagementunitWeekShorttermforecastFinal(GetWorkforcemanagementManagementunitWeekShorttermforecastFinalRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ForecastResultResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ForecastResultResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the final result of a short term forecast calculation with modifications applied
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ForecastResultResponse> getWorkforcemanagementManagementunitWeekShorttermforecastFinal(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ForecastResultResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ForecastResultResponse> response = (ApiResponse<ForecastResultResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ForecastResultResponse> response = (ApiResponse<ForecastResultResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @return ShortTermForecastListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastListResponse getWorkforcemanagementManagementunitWeekShorttermforecasts(String managementUnitId, String weekDateId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWeekShorttermforecasts(createGetWorkforcemanagementManagementunitWeekShorttermforecastsRequest(managementUnitId, weekDateId));
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @return ShortTermForecastListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShortTermForecastListResponse> getWorkforcemanagementManagementunitWeekShorttermforecastsWithHttpInfo(String managementUnitId, String weekDateId) throws IOException {
    return getWorkforcemanagementManagementunitWeekShorttermforecasts(createGetWorkforcemanagementManagementunitWeekShorttermforecastsRequest(managementUnitId, weekDateId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest createGetWorkforcemanagementManagementunitWeekShorttermforecastsRequest(String managementUnitId, String weekDateId) {
    return GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .build();
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param request The request object
   * @return ShortTermForecastListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastListResponse getWorkforcemanagementManagementunitWeekShorttermforecasts(GetWorkforcemanagementManagementunitWeekShorttermforecastsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShortTermForecastListResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShortTermForecastListResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get short term forecasts
   * Use \&quot;recent\&quot; for the `weekDateId` path parameter to fetch all forecasts for +/- 26 weeks from the current date
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShortTermForecastListResponse> getWorkforcemanagementManagementunitWeekShorttermforecasts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShortTermForecastListResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastListResponse> response = (ApiResponse<ShortTermForecastListResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastListResponse> response = (ApiResponse<ShortTermForecastListResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to fetch (required)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan getWorkforcemanagementManagementunitWorkplan(String managementUnitId, String workPlanId) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplan(createGetWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId));
  }

  /**
   * Get a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to fetch (required)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> getWorkforcemanagementManagementunitWorkplanWithHttpInfo(String managementUnitId, String workPlanId) throws IOException {
    return getWorkforcemanagementManagementunitWorkplan(createGetWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplanRequest createGetWorkforcemanagementManagementunitWorkplanRequest(String managementUnitId, String workPlanId) {
    return GetWorkforcemanagementManagementunitWorkplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
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
   * Get work plans
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanListResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlanListResponse getWorkforcemanagementManagementunitWorkplans(String managementUnitId, String expand) throws IOException, ApiException {
    return  getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand));
  }

  /**
   * Get work plans
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param expand  (optional)
   * @return WorkPlanListResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlanListResponse> getWorkforcemanagementManagementunitWorkplansWithHttpInfo(String managementUnitId, String expand) throws IOException {
    return getWorkforcemanagementManagementunitWorkplans(createGetWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, expand).withHttpInfo());
  }

  private GetWorkforcemanagementManagementunitWorkplansRequest createGetWorkforcemanagementManagementunitWorkplansRequest(String managementUnitId, String expand) {
    return GetWorkforcemanagementManagementunitWorkplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withExpand(expand)
    
            .build();
  }

  /**
   * Get work plans
   * 
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
   * 
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
   * @param pageSize  (optional)
   * @param pageNumber  (optional)
   * @param expand  (optional)
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
   * @param pageSize  (optional)
   * @param pageNumber  (optional)
   * @param expand  (optional)
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
   * Update an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to update (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode patchWorkforcemanagementManagementunitActivitycode(String muId, String acId, UpdateActivityCodeRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitActivitycode(createPatchWorkforcemanagementManagementunitActivitycodeRequest(muId, acId, body));
  }

  /**
   * Update an activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param acId The ID of the activity code to update (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCode> patchWorkforcemanagementManagementunitActivitycodeWithHttpInfo(String muId, String acId, UpdateActivityCodeRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitActivitycode(createPatchWorkforcemanagementManagementunitActivitycodeRequest(muId, acId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitActivitycodeRequest createPatchWorkforcemanagementManagementunitActivitycodeRequest(String muId, String acId, UpdateActivityCodeRequest body) {
    return PatchWorkforcemanagementManagementunitActivitycodeRequest.builder()
            .withMuId(muId)
    
            .withAcId(acId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an activity code
   * 
   * @param request The request object
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode patchWorkforcemanagementManagementunitActivitycode(PatchWorkforcemanagementManagementunitActivitycodeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCode>() {});
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
  public ApiResponse<ActivityCode> patchWorkforcemanagementManagementunitActivitycode(ApiRequest<UpdateActivityCodeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @param body body (optional)
   * @return RescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RescheduleResult patchWorkforcemanagementManagementunitSchedulingRun(String managementUnitId, String runId, UpdateSchedulingRunRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitSchedulingRun(createPatchWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId, body));
  }

  /**
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param managementUnitId The ID of the management unit. (required)
   * @param runId The ID of the schedule run (required)
   * @param body body (optional)
   * @return RescheduleResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RescheduleResult> patchWorkforcemanagementManagementunitSchedulingRunWithHttpInfo(String managementUnitId, String runId, UpdateSchedulingRunRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitSchedulingRun(createPatchWorkforcemanagementManagementunitSchedulingRunRequest(managementUnitId, runId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitSchedulingRunRequest createPatchWorkforcemanagementManagementunitSchedulingRunRequest(String managementUnitId, String runId, UpdateSchedulingRunRequest body) {
    return PatchWorkforcemanagementManagementunitSchedulingRunRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withRunId(runId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param request The request object
   * @return RescheduleResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RescheduleResult patchWorkforcemanagementManagementunitSchedulingRun(PatchWorkforcemanagementManagementunitSchedulingRunRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RescheduleResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RescheduleResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Marks a specific scheduling run as applied, allowing a new rescheduling run to be started
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RescheduleResult> patchWorkforcemanagementManagementunitSchedulingRun(ApiRequest<UpdateSchedulingRunRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RescheduleResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RescheduleResult> response = (ApiResponse<RescheduleResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to update (required)
   * @param body body (optional)
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup patchWorkforcemanagementManagementunitServicegoalgroup(String managementUnitId, String serviceGoalGroupId, ServiceGoalGroup body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitServicegoalgroup(createPatchWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId, body));
  }

  /**
   * Update a service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param serviceGoalGroupId The ID of the service goal group to update (required)
   * @param body body (optional)
   * @return ServiceGoalGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> patchWorkforcemanagementManagementunitServicegoalgroupWithHttpInfo(String managementUnitId, String serviceGoalGroupId, ServiceGoalGroup body) throws IOException {
    return patchWorkforcemanagementManagementunitServicegoalgroup(createPatchWorkforcemanagementManagementunitServicegoalgroupRequest(managementUnitId, serviceGoalGroupId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitServicegoalgroupRequest createPatchWorkforcemanagementManagementunitServicegoalgroupRequest(String managementUnitId, String serviceGoalGroupId, ServiceGoalGroup body) {
    return PatchWorkforcemanagementManagementunitServicegoalgroupRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withServiceGoalGroupId(serviceGoalGroupId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a service goal group
   * 
   * @param request The request object
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup patchWorkforcemanagementManagementunitServicegoalgroup(PatchWorkforcemanagementManagementunitServicegoalgroupRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a service goal group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> patchWorkforcemanagementManagementunitServicegoalgroup(ApiRequest<ServiceGoalGroup> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch the settings for the requested management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body config (optional)
   * @return ManagementUnitSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitSettings patchWorkforcemanagementManagementunitSettings(String muId, ManagementUnitSettings body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitSettings(createPatchWorkforcemanagementManagementunitSettingsRequest(muId, body));
  }

  /**
   * Patch the settings for the requested management unit
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body config (optional)
   * @return ManagementUnitSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitSettings> patchWorkforcemanagementManagementunitSettingsWithHttpInfo(String muId, ManagementUnitSettings body) throws IOException {
    return patchWorkforcemanagementManagementunitSettings(createPatchWorkforcemanagementManagementunitSettingsRequest(muId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitSettingsRequest createPatchWorkforcemanagementManagementunitSettingsRequest(String muId, ManagementUnitSettings body) {
    return PatchWorkforcemanagementManagementunitSettingsRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch the settings for the requested management unit
   * 
   * @param request The request object
   * @return ManagementUnitSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ManagementUnitSettings patchWorkforcemanagementManagementunitSettings(PatchWorkforcemanagementManagementunitSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ManagementUnitSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ManagementUnitSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch the settings for the requested management unit
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ManagementUnitSettings> patchWorkforcemanagementManagementunitSettings(ApiRequest<ManagementUnitSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ManagementUnitSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitSettings> response = (ApiResponse<ManagementUnitSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ManagementUnitSettings> response = (ApiResponse<ManagementUnitSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestResponse patchWorkforcemanagementManagementunitUserTimeoffrequest(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId, body));
  }

  /**
   * Update a time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param userId The id of the user the requested time off request belongs to (required)
   * @param timeOffRequestId The id of the time off request to update (required)
   * @param body body (optional)
   * @return TimeOffRequestResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestResponse> patchWorkforcemanagementManagementunitUserTimeoffrequestWithHttpInfo(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) throws IOException {
    return patchWorkforcemanagementManagementunitUserTimeoffrequest(createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(muId, userId, timeOffRequestId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest createPatchWorkforcemanagementManagementunitUserTimeoffrequestRequest(String muId, String userId, String timeOffRequestId, AdminTimeOffRequestPatch body) {
    return PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.builder()
            .withMuId(muId)
    
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
   * Update a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to update. Use partial uploads of user schedules if activity count in schedule is greater than 17500 (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse patchWorkforcemanagementManagementunitWeekSchedule(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, UpdateWeekScheduleRequest body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWeekSchedule(createPatchWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId, forceAsync, forceDownloadService, body));
  }

  /**
   * Update a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to update. Use partial uploads of user schedules if activity count in schedule is greater than 17500 (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> patchWorkforcemanagementManagementunitWeekScheduleWithHttpInfo(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, UpdateWeekScheduleRequest body) throws IOException {
    return patchWorkforcemanagementManagementunitWeekSchedule(createPatchWorkforcemanagementManagementunitWeekScheduleRequest(managementUnitId, weekId, scheduleId, forceAsync, forceDownloadService, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWeekScheduleRequest createPatchWorkforcemanagementManagementunitWeekScheduleRequest(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, UpdateWeekScheduleRequest body) {
    return PatchWorkforcemanagementManagementunitWeekScheduleRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a week schedule
   * 
   * @param request The request object
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse patchWorkforcemanagementManagementunitWeekSchedule(PatchWorkforcemanagementManagementunitWeekScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncWeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a week schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> patchWorkforcemanagementManagementunitWeekSchedule(ApiRequest<UpdateWeekScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncWeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan patchWorkforcemanagementManagementunitWorkplan(String managementUnitId, String workPlanId, WorkPlan body) throws IOException, ApiException {
    return  patchWorkforcemanagementManagementunitWorkplan(createPatchWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, body));
  }

  /**
   * Update a work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param workPlanId The ID of the work plan to update (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> patchWorkforcemanagementManagementunitWorkplanWithHttpInfo(String managementUnitId, String workPlanId, WorkPlan body) throws IOException {
    return patchWorkforcemanagementManagementunitWorkplan(createPatchWorkforcemanagementManagementunitWorkplanRequest(managementUnitId, workPlanId, body).withHttpInfo());
  }

  private PatchWorkforcemanagementManagementunitWorkplanRequest createPatchWorkforcemanagementManagementunitWorkplanRequest(String managementUnitId, String workPlanId, WorkPlan body) {
    return PatchWorkforcemanagementManagementunitWorkplanRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWorkPlanId(workPlanId)
    
            .withBody(body)
    
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
   * Create a new activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode postWorkforcemanagementManagementunitActivitycodes(String muId, CreateActivityCodeRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitActivitycodes(createPostWorkforcemanagementManagementunitActivitycodesRequest(muId, body));
  }

  /**
   * Create a new activity code
   * 
   * @param muId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ActivityCode
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActivityCode> postWorkforcemanagementManagementunitActivitycodesWithHttpInfo(String muId, CreateActivityCodeRequest body) throws IOException {
    return postWorkforcemanagementManagementunitActivitycodes(createPostWorkforcemanagementManagementunitActivitycodesRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitActivitycodesRequest createPostWorkforcemanagementManagementunitActivitycodesRequest(String muId, CreateActivityCodeRequest body) {
    return PostWorkforcemanagementManagementunitActivitycodesRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new activity code
   * 
   * @param request The request object
   * @return ActivityCode
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActivityCode postWorkforcemanagementManagementunitActivitycodes(PostWorkforcemanagementManagementunitActivitycodesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActivityCode> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActivityCode>() {});
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
  public ApiResponse<ActivityCode> postWorkforcemanagementManagementunitActivitycodes(ApiRequest<CreateActivityCodeRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActivityCode>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param muId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WfmHistoricalAdherenceResponse postWorkforcemanagementManagementunitHistoricaladherencequery(String muId, WfmHistoricalAdherenceQuery body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(muId, body));
  }

  /**
   * Request a historical adherence report
   * The maximum supported range for historical adherence queries is 31 days, or 7 days with includeExceptions = true
   * @param muId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return WfmHistoricalAdherenceResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequeryWithHttpInfo(String muId, WfmHistoricalAdherenceQuery body) throws IOException {
    return postWorkforcemanagementManagementunitHistoricaladherencequery(createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest createPostWorkforcemanagementManagementunitHistoricaladherencequeryRequest(String muId, WfmHistoricalAdherenceQuery body) {
    return PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest.builder()
            .withMuId(muId)
    
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
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param muId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return IntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntradayResponse postWorkforcemanagementManagementunitIntraday(String muId, IntradayQueryDataCommand body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitIntraday(createPostWorkforcemanagementManagementunitIntradayRequest(muId, body));
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param muId The management unit ID of the management unit (required)
   * @param body body (optional)
   * @return IntradayResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntradayResponse> postWorkforcemanagementManagementunitIntradayWithHttpInfo(String muId, IntradayQueryDataCommand body) throws IOException {
    return postWorkforcemanagementManagementunitIntraday(createPostWorkforcemanagementManagementunitIntradayRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitIntradayRequest createPostWorkforcemanagementManagementunitIntradayRequest(String muId, IntradayQueryDataCommand body) {
    return PostWorkforcemanagementManagementunitIntradayRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request The request object
   * @return IntradayResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntradayResponse postWorkforcemanagementManagementunitIntraday(PostWorkforcemanagementManagementunitIntradayRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntradayResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntradayResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntradayResponse> postWorkforcemanagementManagementunitIntraday(ApiRequest<IntradayQueryDataCommand> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntradayResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserScheduleContainer postWorkforcemanagementManagementunitSchedulesSearch(String muId, UserListScheduleRequestBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(muId, body));
  }

  /**
   * Query published schedules for given given time range for set of users
   * 
   * @param muId The management unit ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return UserScheduleContainer
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchWithHttpInfo(String muId, UserListScheduleRequestBody body) throws IOException {
    return postWorkforcemanagementManagementunitSchedulesSearch(createPostWorkforcemanagementManagementunitSchedulesSearchRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitSchedulesSearchRequest createPostWorkforcemanagementManagementunitSchedulesSearchRequest(String muId, UserListScheduleRequestBody body) {
    return PostWorkforcemanagementManagementunitSchedulesSearchRequest.builder()
            .withMuId(muId)
    
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
   * Create a new service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup postWorkforcemanagementManagementunitServicegoalgroups(String managementUnitId, CreateServiceGoalGroupRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitServicegoalgroups(createPostWorkforcemanagementManagementunitServicegoalgroupsRequest(managementUnitId, body));
  }

  /**
   * Create a new service goal group
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return ServiceGoalGroup
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> postWorkforcemanagementManagementunitServicegoalgroupsWithHttpInfo(String managementUnitId, CreateServiceGoalGroupRequest body) throws IOException {
    return postWorkforcemanagementManagementunitServicegoalgroups(createPostWorkforcemanagementManagementunitServicegoalgroupsRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitServicegoalgroupsRequest createPostWorkforcemanagementManagementunitServicegoalgroupsRequest(String managementUnitId, CreateServiceGoalGroupRequest body) {
    return PostWorkforcemanagementManagementunitServicegoalgroupsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new service goal group
   * 
   * @param request The request object
   * @return ServiceGoalGroup
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ServiceGoalGroup postWorkforcemanagementManagementunitServicegoalgroups(PostWorkforcemanagementManagementunitServicegoalgroupsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ServiceGoalGroup> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ServiceGoalGroup>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new service goal group
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ServiceGoalGroup> postWorkforcemanagementManagementunitServicegoalgroups(ApiRequest<CreateServiceGoalGroupRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ServiceGoalGroup>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ServiceGoalGroup> response = (ApiResponse<ServiceGoalGroup>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestList postWorkforcemanagementManagementunitTimeoffrequests(String muId, CreateAdminTimeOffRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequests(createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(muId, body));
  }

  /**
   * Create a new time off request
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestList> postWorkforcemanagementManagementunitTimeoffrequestsWithHttpInfo(String muId, CreateAdminTimeOffRequest body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequests(createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsRequest createPostWorkforcemanagementManagementunitTimeoffrequestsRequest(String muId, CreateAdminTimeOffRequest body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsRequest.builder()
            .withMuId(muId)
    
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
   * Gets a list of time off requests from lookup ids
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestEntityList postWorkforcemanagementManagementunitTimeoffrequestsFetchdetails(String muId, TimeOffRequestLookupList body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsFetchdetails(createPostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest(muId, body));
  }

  /**
   * Gets a list of time off requests from lookup ids
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestEntityList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestEntityList> postWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsWithHttpInfo(String muId, TimeOffRequestLookupList body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsFetchdetails(createPostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest createPostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest(String muId, TimeOffRequestLookupList body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Gets a list of time off requests from lookup ids
   * 
   * @param request The request object
   * @return TimeOffRequestEntityList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestEntityList postWorkforcemanagementManagementunitTimeoffrequestsFetchdetails(PostWorkforcemanagementManagementunitTimeoffrequestsFetchdetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestEntityList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestEntityList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of time off requests from lookup ids
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestEntityList> postWorkforcemanagementManagementunitTimeoffrequestsFetchdetails(ApiRequest<TimeOffRequestLookupList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestEntityList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestEntityList> response = (ApiResponse<TimeOffRequestEntityList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestEntityList> response = (ApiResponse<TimeOffRequestEntityList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestLookupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestLookupList postWorkforcemanagementManagementunitTimeoffrequestsQuery(String muId, TimeOffRequestQueryBody body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(muId, body));
  }

  /**
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param muId The muId of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return TimeOffRequestLookupList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestLookupList> postWorkforcemanagementManagementunitTimeoffrequestsQueryWithHttpInfo(String muId, TimeOffRequestQueryBody body) throws IOException {
    return postWorkforcemanagementManagementunitTimeoffrequestsQuery(createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(muId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest createPostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest(String muId, TimeOffRequestQueryBody body) {
    return PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest.builder()
            .withMuId(muId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param request The request object
   * @return TimeOffRequestLookupList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TimeOffRequestLookupList postWorkforcemanagementManagementunitTimeoffrequestsQuery(PostWorkforcemanagementManagementunitTimeoffrequestsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TimeOffRequestLookupList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TimeOffRequestLookupList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets the lookup ids to fetch the specified set of requests
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TimeOffRequestLookupList> postWorkforcemanagementManagementunitTimeoffrequestsQuery(ApiRequest<TimeOffRequestQueryBody> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TimeOffRequestLookupList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestLookupList> response = (ApiResponse<TimeOffRequestLookupList>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TimeOffRequestLookupList> response = (ApiResponse<TimeOffRequestLookupList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Copy a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to copy from (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekScheduleCopy(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, CopyWeekScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekScheduleCopy(createPostWorkforcemanagementManagementunitWeekScheduleCopyRequest(managementUnitId, weekId, scheduleId, forceAsync, forceDownloadService, body));
  }

  /**
   * Copy a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to copy from (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleCopyWithHttpInfo(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, CopyWeekScheduleRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekScheduleCopy(createPostWorkforcemanagementManagementunitWeekScheduleCopyRequest(managementUnitId, weekId, scheduleId, forceAsync, forceDownloadService, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekScheduleCopyRequest createPostWorkforcemanagementManagementunitWeekScheduleCopyRequest(String managementUnitId, String weekId, String scheduleId, Boolean forceAsync, Boolean forceDownloadService, CopyWeekScheduleRequest body) {
    return PostWorkforcemanagementManagementunitWeekScheduleCopyRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Copy a week schedule
   * 
   * @param request The request object
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekScheduleCopy(PostWorkforcemanagementManagementunitWeekScheduleCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncWeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Copy a week schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleCopy(ApiRequest<CopyWeekScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncWeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to re-optimize (required)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekScheduleReschedule(String managementUnitId, String weekId, String scheduleId, RescheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekScheduleReschedule(createPostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest(managementUnitId, weekId, scheduleId, body));
  }

  /**
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param scheduleId The ID of the schedule to re-optimize (required)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleRescheduleWithHttpInfo(String managementUnitId, String weekId, String scheduleId, RescheduleRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekScheduleReschedule(createPostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest(managementUnitId, weekId, scheduleId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest createPostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest(String managementUnitId, String weekId, String scheduleId, RescheduleRequest body) {
    return PostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withScheduleId(scheduleId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param request The request object
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekScheduleReschedule(PostWorkforcemanagementManagementunitWeekScheduleRescheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncWeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start a scheduling run to compute the reschedule. When the scheduling run finishes, a client can get the reschedule changes and then the client can apply them to the schedule, save the schedule, and mark the scheduling run as applied
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekScheduleReschedule(ApiRequest<RescheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncWeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekSchedules(String managementUnitId, String weekId, Boolean forceAsync, Boolean forceDownloadService, ImportWeekScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekSchedules(createPostWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId, forceAsync, forceDownloadService, body));
  }

  /**
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @param forceDownloadService Force the result of this operation to be sent via download service.  For testing/app development purposes (optional)
   * @param body body (optional)
   * @return AsyncWeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedulesWithHttpInfo(String managementUnitId, String weekId, Boolean forceAsync, Boolean forceDownloadService, ImportWeekScheduleRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekSchedules(createPostWorkforcemanagementManagementunitWeekSchedulesRequest(managementUnitId, weekId, forceAsync, forceDownloadService, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekSchedulesRequest createPostWorkforcemanagementManagementunitWeekSchedulesRequest(String managementUnitId, String weekId, Boolean forceAsync, Boolean forceDownloadService, ImportWeekScheduleRequest body) {
    return PostWorkforcemanagementManagementunitWeekSchedulesRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withForceAsync(forceAsync)
    
            .withForceDownloadService(forceDownloadService)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param request The request object
   * @return AsyncWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncWeekScheduleResponse postWorkforcemanagementManagementunitWeekSchedules(PostWorkforcemanagementManagementunitWeekSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncWeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncWeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a schedule for a week in management unit using imported data. Use partial uploads of user schedules if activity count in schedule is greater than 17500
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedules(ApiRequest<ImportWeekScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncWeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncWeekScheduleResponse> response = (ApiResponse<AsyncWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Generate a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param body body (optional)
   * @return GenerateWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenerateWeekScheduleResponse postWorkforcemanagementManagementunitWeekSchedulesGenerate(String managementUnitId, String weekId, GenerateWeekScheduleRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekSchedulesGenerate(createPostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest(managementUnitId, weekId, body));
  }

  /**
   * Generate a week schedule
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param body body (optional)
   * @return GenerateWeekScheduleResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GenerateWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedulesGenerateWithHttpInfo(String managementUnitId, String weekId, GenerateWeekScheduleRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekSchedulesGenerate(createPostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest(managementUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest createPostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest(String managementUnitId, String weekId, GenerateWeekScheduleRequest body) {
    return PostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Generate a week schedule
   * 
   * @param request The request object
   * @return GenerateWeekScheduleResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenerateWeekScheduleResponse postWorkforcemanagementManagementunitWeekSchedulesGenerate(PostWorkforcemanagementManagementunitWeekSchedulesGenerateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GenerateWeekScheduleResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GenerateWeekScheduleResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate a week schedule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GenerateWeekScheduleResponse> postWorkforcemanagementManagementunitWeekSchedulesGenerate(ApiRequest<GenerateWeekScheduleRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GenerateWeekScheduleResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GenerateWeekScheduleResponse> response = (ApiResponse<GenerateWeekScheduleResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GenerateWeekScheduleResponse> response = (ApiResponse<GenerateWeekScheduleResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param body body (optional)
   * @return PartialUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PartialUploadResponse postWorkforcemanagementManagementunitWeekSchedulesPartialupload(String managementUnitId, String weekId, UserSchedulesPartialUploadRequest body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekSchedulesPartialupload(createPostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest(managementUnitId, weekId, body));
  }

  /**
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param weekId First day of schedule week in yyyy-MM-dd format. (required)
   * @param body body (optional)
   * @return PartialUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PartialUploadResponse> postWorkforcemanagementManagementunitWeekSchedulesPartialuploadWithHttpInfo(String managementUnitId, String weekId, UserSchedulesPartialUploadRequest body) throws IOException {
    return postWorkforcemanagementManagementunitWeekSchedulesPartialupload(createPostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest(managementUnitId, weekId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest createPostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest(String managementUnitId, String weekId, UserSchedulesPartialUploadRequest body) {
    return PostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekId(weekId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param request The request object
   * @return PartialUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PartialUploadResponse postWorkforcemanagementManagementunitWeekSchedulesPartialupload(PostWorkforcemanagementManagementunitWeekSchedulesPartialuploadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PartialUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PartialUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Partial upload of user schedules where activity count is greater than 17500
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PartialUploadResponse> postWorkforcemanagementManagementunitWeekSchedulesPartialupload(ApiRequest<UserSchedulesPartialUploadRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PartialUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Copy a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast to copy (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecastCopy(String managementUnitId, String weekDateId, String forecastId, CopyShortTermForecastRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShorttermforecastCopy(createPostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest(managementUnitId, weekDateId, forecastId, body, forceAsync));
  }

  /**
   * Copy a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param forecastId The ID of the forecast to copy (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ShortTermForecastResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastCopyWithHttpInfo(String managementUnitId, String weekDateId, String forecastId, CopyShortTermForecastRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementManagementunitWeekShorttermforecastCopy(createPostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest(managementUnitId, weekDateId, forecastId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest createPostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest(String managementUnitId, String weekDateId, String forecastId, CopyShortTermForecastRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest.builder()
            .withManagementUnitId(managementUnitId)
    
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
   * @return ShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecastCopy(PostWorkforcemanagementManagementunitWeekShorttermforecastCopyRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShortTermForecastResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShortTermForecastResponse>() {});
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
  public ApiResponse<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastCopy(ApiRequest<CopyShortTermForecastRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShortTermForecastResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Import a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecasts(String managementUnitId, String weekDateId, ImportShortTermForecastRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShorttermforecasts(createPostWorkforcemanagementManagementunitWeekShorttermforecastsRequest(managementUnitId, weekDateId, body, forceAsync));
  }

  /**
   * Import a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body body (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return ShortTermForecastResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsWithHttpInfo(String managementUnitId, String weekDateId, ImportShortTermForecastRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementManagementunitWeekShorttermforecasts(createPostWorkforcemanagementManagementunitWeekShorttermforecastsRequest(managementUnitId, weekDateId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest createPostWorkforcemanagementManagementunitWeekShorttermforecastsRequest(String managementUnitId, String weekDateId, ImportShortTermForecastRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .build();
  }

  /**
   * Import a short term forecast
   * 
   * @param request The request object
   * @return ShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecasts(PostWorkforcemanagementManagementunitWeekShorttermforecastsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ShortTermForecastResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ShortTermForecastResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Import a short term forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecasts(ApiRequest<ImportShortTermForecastRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ShortTermForecastResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ShortTermForecastResponse> response = (ApiResponse<ShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Generate a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body  (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return GenerateShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenerateShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecastsGenerate(String managementUnitId, String weekDateId, GenerateShortTermForecastRequest body, Boolean forceAsync) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShorttermforecastsGenerate(createPostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest(managementUnitId, weekDateId, body, forceAsync));
  }

  /**
   * Generate a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body  (required)
   * @param forceAsync Force the result of this operation to be sent asynchronously via notification.  For testing/app development purposes (optional)
   * @return GenerateShortTermForecastResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<GenerateShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsGenerateWithHttpInfo(String managementUnitId, String weekDateId, GenerateShortTermForecastRequest body, Boolean forceAsync) throws IOException {
    return postWorkforcemanagementManagementunitWeekShorttermforecastsGenerate(createPostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest(managementUnitId, weekDateId, body, forceAsync).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest createPostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest(String managementUnitId, String weekDateId, GenerateShortTermForecastRequest body, Boolean forceAsync) {
    return PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .withForceAsync(forceAsync)
    
            .build();
  }

  /**
   * Generate a short term forecast
   * 
   * @param request The request object
   * @return GenerateShortTermForecastResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public GenerateShortTermForecastResponse postWorkforcemanagementManagementunitWeekShorttermforecastsGenerate(PostWorkforcemanagementManagementunitWeekShorttermforecastsGenerateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<GenerateShortTermForecastResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<GenerateShortTermForecastResponse>() {});
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
  public ApiResponse<GenerateShortTermForecastResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsGenerate(ApiRequest<GenerateShortTermForecastRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<GenerateShortTermForecastResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<GenerateShortTermForecastResponse> response = (ApiResponse<GenerateShortTermForecastResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<GenerateShortTermForecastResponse> response = (ApiResponse<GenerateShortTermForecastResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Import a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body body (required)
   * @return PartialUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PartialUploadResponse postWorkforcemanagementManagementunitWeekShorttermforecastsPartialupload(String managementUnitId, String weekDateId, RouteGroupList body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWeekShorttermforecastsPartialupload(createPostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest(managementUnitId, weekDateId, body));
  }

  /**
   * Import a short term forecast
   * 
   * @param managementUnitId The management unit ID of the management unit to which the forecast belongs (required)
   * @param weekDateId The week start date of the forecast in yyyy-MM-dd format (required)
   * @param body body (required)
   * @return PartialUploadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PartialUploadResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadWithHttpInfo(String managementUnitId, String weekDateId, RouteGroupList body) throws IOException {
    return postWorkforcemanagementManagementunitWeekShorttermforecastsPartialupload(createPostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest(managementUnitId, weekDateId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest createPostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest(String managementUnitId, String weekDateId, RouteGroupList body) {
    return PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withWeekDateId(weekDateId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Import a short term forecast
   * 
   * @param request The request object
   * @return PartialUploadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PartialUploadResponse postWorkforcemanagementManagementunitWeekShorttermforecastsPartialupload(PostWorkforcemanagementManagementunitWeekShorttermforecastsPartialuploadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PartialUploadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PartialUploadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Import a short term forecast
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PartialUploadResponse> postWorkforcemanagementManagementunitWeekShorttermforecastsPartialupload(ApiRequest<RouteGroupList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PartialUploadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PartialUploadResponse> response = (ApiResponse<PartialUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WorkPlan postWorkforcemanagementManagementunitWorkplans(String managementUnitId, CreateWorkPlan body) throws IOException, ApiException {
    return  postWorkforcemanagementManagementunitWorkplans(createPostWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, body));
  }

  /**
   * Create a new work plan
   * 
   * @param managementUnitId The ID of the management unit, or &#39;mine&#39; for the management unit of the logged-in user. (required)
   * @param body body (optional)
   * @return WorkPlan
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WorkPlan> postWorkforcemanagementManagementunitWorkplansWithHttpInfo(String managementUnitId, CreateWorkPlan body) throws IOException {
    return postWorkforcemanagementManagementunitWorkplans(createPostWorkforcemanagementManagementunitWorkplansRequest(managementUnitId, body).withHttpInfo());
  }

  private PostWorkforcemanagementManagementunitWorkplansRequest createPostWorkforcemanagementManagementunitWorkplansRequest(String managementUnitId, CreateWorkPlan body) {
    return PostWorkforcemanagementManagementunitWorkplansRequest.builder()
            .withManagementUnitId(managementUnitId)
    
            .withBody(body)
    
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
   * 
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
   * 
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
   * 
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
   * 
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

  
}
