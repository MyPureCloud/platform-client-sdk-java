package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ActionAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ActionAggregationQuery;
import com.mypurecloud.sdk.v2.model.ActionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ActionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsDataRetentionResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsReportingSettings;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.BotAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAggregationQuery;
import com.mypurecloud.sdk.v2.model.BotAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationActivityQuery;
import com.mypurecloud.sdk.v2.model.ConversationActivityResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityQuery;
import com.mypurecloud.sdk.v2.model.FlowActivityResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowExecutionAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowExecutionAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowExecutionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowExecutionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeAggregationQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.ReportingExportMetadataJobListing;
import com.mypurecloud.sdk.v2.model.ReportingTurnsResponse;
import com.mypurecloud.sdk.v2.model.ResolutionAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ResolutionAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityQuery;
import com.mypurecloud.sdk.v2.model.RoutingActivityResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.SessionsResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TaskManagementAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TaskManagementAggregationQuery;
import com.mypurecloud.sdk.v2.model.TaskManagementAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TaskManagementAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TeamActivityQuery;
import com.mypurecloud.sdk.v2.model.TeamActivityResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.UpdateAnalyticsDataRetentionRequest;
import com.mypurecloud.sdk.v2.model.UserActivityQuery;
import com.mypurecloud.sdk.v2.model.UserActivityResponse;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsActionsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsActionsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsBotflowReportingturnsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsBotflowSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsBotsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsBotsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobsAvailabilityRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsDataretentionSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsEvaluationsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsEvaluationsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowexecutionsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowexecutionsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsFlowsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsKnowledgeAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsKnowledgeAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingExportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingExportsMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingReportIdMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingReportformatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryLatestRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryRunIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingTimeperiodsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsResolutionsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsResolutionsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsSurveysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsSurveysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsTaskmanagementAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsTaskmanagementAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsTranscriptsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsTranscriptsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobsAvailabilityRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAnalyticsReportingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsActionsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsActionsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsBotsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsBotsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationDetailsPropertiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsTranscriptsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowexecutionsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowexecutionsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsKnowledgeAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsKnowledgeAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingScheduleRunreportRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsResolutionsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsRoutingActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTaskmanagementAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTaskmanagementAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTeamsActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTranscriptsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTranscriptsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersActivityQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAnalyticsDataretentionSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutAnalyticsReportingScheduleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsApi {
  private final ApiClient pcapiClient;

  public AnalyticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete/cancel an async details job
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsConversationsDetailsJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsConversationsDetailsJob(createDeleteAnalyticsConversationsDetailsJobRequest(jobId));
  }

  /**
   * Delete/cancel an async details job
   * 
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsConversationsDetailsJobWithHttpInfo(String jobId) throws IOException {
    return deleteAnalyticsConversationsDetailsJob(createDeleteAnalyticsConversationsDetailsJobRequest(jobId).withHttpInfo());
  }

  private DeleteAnalyticsConversationsDetailsJobRequest createDeleteAnalyticsConversationsDetailsJobRequest(String jobId) {
    return DeleteAnalyticsConversationsDetailsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Delete/cancel an async details job
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsConversationsDetailsJob(DeleteAnalyticsConversationsDetailsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete/cancel an async details job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsConversationsDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
     deleteAnalyticsReportingSchedule(createDeleteAnalyticsReportingScheduleRequest(scheduleId));
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException {
    return deleteAnalyticsReportingSchedule(createDeleteAnalyticsReportingScheduleRequest(scheduleId).withHttpInfo());
  }

  private DeleteAnalyticsReportingScheduleRequest createDeleteAnalyticsReportingScheduleRequest(String scheduleId) {
    return DeleteAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsReportingSchedule(DeleteAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException {
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
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsUsersDetailsJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsUsersDetailsJob(createDeleteAnalyticsUsersDetailsJobRequest(jobId));
  }

  /**
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsUsersDetailsJobWithHttpInfo(String jobId) throws IOException {
    return deleteAnalyticsUsersDetailsJob(createDeleteAnalyticsUsersDetailsJobRequest(jobId).withHttpInfo());
  }

  private DeleteAnalyticsUsersDetailsJobRequest createDeleteAnalyticsUsersDetailsJobRequest(String jobId) {
    return DeleteAnalyticsUsersDetailsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Delete/cancel an async request
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsUsersDetailsJob(DeleteAnalyticsUsersDetailsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete/cancel an async request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsUsersDetailsJob(ApiRequest<Void> request) throws IOException {
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
   * Get status for async query for action aggregates
   * 
   * getAnalyticsActionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsActionsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsActionsAggregatesJob(createGetAnalyticsActionsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for action aggregates
   * 
   * getAnalyticsActionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsActionsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsActionsAggregatesJob(createGetAnalyticsActionsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsActionsAggregatesJobRequest createGetAnalyticsActionsAggregatesJobRequest(String jobId) {
    return GetAnalyticsActionsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for action aggregates
   * 
   * getAnalyticsActionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsActionsAggregatesJob(GetAnalyticsActionsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for action aggregates
   * 
   * getAnalyticsActionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsActionsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsActionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ActionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionAsyncAggregateQueryResponse getAnalyticsActionsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsActionsAggregatesJobResults(createGetAnalyticsActionsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsActionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ActionAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionAsyncAggregateQueryResponse> getAnalyticsActionsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsActionsAggregatesJobResults(createGetAnalyticsActionsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsActionsAggregatesJobResultsRequest createGetAnalyticsActionsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsActionsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsActionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ActionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionAsyncAggregateQueryResponse getAnalyticsActionsAggregatesJobResults(GetAnalyticsActionsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsActionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionAsyncAggregateQueryResponse> getAnalyticsActionsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionAsyncAggregateQueryResponse> response = (ApiResponse<ActionAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionAsyncAggregateQueryResponse> response = (ApiResponse<ActionAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Reporting Turns.
   * Returns the reporting turns grouped by session, in reverse chronological order from the date the session was created, with the reporting turns from the most recent session appearing at the start of the list. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param interval Date range filter based on the date the individual resources were completed. UTC is the default if no TZ is supplied, however alternate timezones can be used e.g: '2022-11-22T09:11:11.111+08:00/2022-11-30T07:17:44.586-07'. . Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional, default to null)
   * @param actionId Optional action ID to get the reporting turns associated to a particular flow action (optional)
   * @param sessionId Optional session ID to get the reporting turns for a particular session. Specifying a session ID alongside an action ID or a language or any ask action results is not allowed. (optional)
   * @param language Optional language code to get the reporting turns for a particular language (optional, default to null)
   * @param askActionResults Optional case-insensitive comma separated list of ask action results to filter the reporting turns. (optional)
   * @return ReportingTurnsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingTurnsResponse getAnalyticsBotflowReportingturns(String botFlowId, String after, String pageSize, String interval, String actionId, String sessionId, String language, String askActionResults) throws IOException, ApiException {
    return  getAnalyticsBotflowReportingturns(createGetAnalyticsBotflowReportingturnsRequest(botFlowId, after, pageSize, interval, actionId, sessionId, language, askActionResults));
  }

  /**
   * Get Reporting Turns.
   * Returns the reporting turns grouped by session, in reverse chronological order from the date the session was created, with the reporting turns from the most recent session appearing at the start of the list. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param interval Date range filter based on the date the individual resources were completed. UTC is the default if no TZ is supplied, however alternate timezones can be used e.g: '2022-11-22T09:11:11.111+08:00/2022-11-30T07:17:44.586-07'. . Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional, default to null)
   * @param actionId Optional action ID to get the reporting turns associated to a particular flow action (optional)
   * @param sessionId Optional session ID to get the reporting turns for a particular session. Specifying a session ID alongside an action ID or a language or any ask action results is not allowed. (optional)
   * @param language Optional language code to get the reporting turns for a particular language (optional, default to null)
   * @param askActionResults Optional case-insensitive comma separated list of ask action results to filter the reporting turns. (optional)
   * @return ReportingTurnsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingTurnsResponse> getAnalyticsBotflowReportingturnsWithHttpInfo(String botFlowId, String after, String pageSize, String interval, String actionId, String sessionId, String language, String askActionResults) throws IOException {
    return getAnalyticsBotflowReportingturns(createGetAnalyticsBotflowReportingturnsRequest(botFlowId, after, pageSize, interval, actionId, sessionId, language, askActionResults).withHttpInfo());
  }

  private GetAnalyticsBotflowReportingturnsRequest createGetAnalyticsBotflowReportingturnsRequest(String botFlowId, String after, String pageSize, String interval, String actionId, String sessionId, String language, String askActionResults) {
    return GetAnalyticsBotflowReportingturnsRequest.builder()
            .withBotFlowId(botFlowId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withInterval(interval)

            .withActionId(actionId)

            .withSessionId(sessionId)

            .withLanguage(language)

            .withAskActionResults(askActionResults)

            .build();
  }

  /**
   * Get Reporting Turns.
   * Returns the reporting turns grouped by session, in reverse chronological order from the date the session was created, with the reporting turns from the most recent session appearing at the start of the list. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param request The request object
   * @return ReportingTurnsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingTurnsResponse getAnalyticsBotflowReportingturns(GetAnalyticsBotflowReportingturnsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingTurnsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingTurnsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Reporting Turns.
   * Returns the reporting turns grouped by session, in reverse chronological order from the date the session was created, with the reporting turns from the most recent session appearing at the start of the list. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingTurnsResponse> getAnalyticsBotflowReportingturns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingTurnsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingTurnsResponse> response = (ApiResponse<ReportingTurnsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingTurnsResponse> response = (ApiResponse<ReportingTurnsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Bot Flow Sessions.
   * Returns the bot flow sessions in reverse chronological order from the date they were created. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param interval Date range filter based on the date the individual resources were completed. UTC is the default if no TZ is supplied, however alternate timezones can be used e.g: '2022-11-22T09:11:11.111+08:00/2022-11-30T07:17:44.586-07'. . Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional, default to null)
   * @param botResultCategories Optional case-insensitive comma separated list of Bot Result Categories to filter sessions by. (optional)
   * @param endLanguage Optional case-insensitive language code to filter sessions by the language the sessions ended in. (optional)
   * @return SessionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionsResponse getAnalyticsBotflowSessions(String botFlowId, String after, String pageSize, String interval, String botResultCategories, String endLanguage) throws IOException, ApiException {
    return  getAnalyticsBotflowSessions(createGetAnalyticsBotflowSessionsRequest(botFlowId, after, pageSize, interval, botResultCategories, endLanguage));
  }

  /**
   * Get Bot Flow Sessions.
   * Returns the bot flow sessions in reverse chronological order from the date they were created. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param interval Date range filter based on the date the individual resources were completed. UTC is the default if no TZ is supplied, however alternate timezones can be used e.g: '2022-11-22T09:11:11.111+08:00/2022-11-30T07:17:44.586-07'. . Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss (optional, default to null)
   * @param botResultCategories Optional case-insensitive comma separated list of Bot Result Categories to filter sessions by. (optional)
   * @param endLanguage Optional case-insensitive language code to filter sessions by the language the sessions ended in. (optional)
   * @return SessionsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionsResponse> getAnalyticsBotflowSessionsWithHttpInfo(String botFlowId, String after, String pageSize, String interval, String botResultCategories, String endLanguage) throws IOException {
    return getAnalyticsBotflowSessions(createGetAnalyticsBotflowSessionsRequest(botFlowId, after, pageSize, interval, botResultCategories, endLanguage).withHttpInfo());
  }

  private GetAnalyticsBotflowSessionsRequest createGetAnalyticsBotflowSessionsRequest(String botFlowId, String after, String pageSize, String interval, String botResultCategories, String endLanguage) {
    return GetAnalyticsBotflowSessionsRequest.builder()
            .withBotFlowId(botFlowId)

            .withAfter(after)

            .withPageSize(pageSize)

            .withInterval(interval)

            .withBotResultCategories(botResultCategories)

            .withEndLanguage(endLanguage)

            .build();
  }

  /**
   * Get Bot Flow Sessions.
   * Returns the bot flow sessions in reverse chronological order from the date they were created. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param request The request object
   * @return SessionsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionsResponse getAnalyticsBotflowSessions(GetAnalyticsBotflowSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SessionsResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SessionsResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Bot Flow Sessions.
   * Returns the bot flow sessions in reverse chronological order from the date they were created. For pagination, clients should keep sending requests using the value of 'nextUri' in the response, until it's no longer present, only then have all items have been returned. Note: resources returned by this endpoint are not persisted indefinitely, as they are deleted after approximately, but not before, 10 days.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionsResponse> getAnalyticsBotflowSessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SessionsResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SessionsResponse> response = (ApiResponse<SessionsResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SessionsResponse> response = (ApiResponse<SessionsResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for bot aggregates
   * 
   * getAnalyticsBotsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsBotsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsBotsAggregatesJob(createGetAnalyticsBotsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for bot aggregates
   * 
   * getAnalyticsBotsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsBotsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsBotsAggregatesJob(createGetAnalyticsBotsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsBotsAggregatesJobRequest createGetAnalyticsBotsAggregatesJobRequest(String jobId) {
    return GetAnalyticsBotsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for bot aggregates
   * 
   * getAnalyticsBotsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsBotsAggregatesJob(GetAnalyticsBotsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for bot aggregates
   * 
   * getAnalyticsBotsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsBotsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsBotsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return BotAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BotAsyncAggregateQueryResponse getAnalyticsBotsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsBotsAggregatesJobResults(createGetAnalyticsBotsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsBotsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return BotAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BotAsyncAggregateQueryResponse> getAnalyticsBotsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsBotsAggregatesJobResults(createGetAnalyticsBotsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsBotsAggregatesJobResultsRequest createGetAnalyticsBotsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsBotsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsBotsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return BotAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BotAsyncAggregateQueryResponse getAnalyticsBotsAggregatesJobResults(GetAnalyticsBotsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BotAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BotAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsBotsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BotAsyncAggregateQueryResponse> getAnalyticsBotsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BotAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BotAsyncAggregateQueryResponse> response = (ApiResponse<BotAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BotAsyncAggregateQueryResponse> response = (ApiResponse<BotAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversationWithoutAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributes getAnalyticsConversationDetails(String conversationId) throws IOException, ApiException {
    return  getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId));
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversationWithoutAttributes
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributes> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws IOException {
    return getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId).withHttpInfo());
  }

  private GetAnalyticsConversationDetailsRequest createGetAnalyticsConversationDetailsRequest(String conversationId) {
    return GetAnalyticsConversationDetailsRequest.builder()
            .withConversationId(conversationId)

            .build();
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return AnalyticsConversationWithoutAttributes
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributes getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributes> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributes>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributes> getAnalyticsConversationDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributes>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for conversation aggregates
   * 
   * getAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsConversationsAggregatesJob(createGetAnalyticsConversationsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for conversation aggregates
   * 
   * getAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsConversationsAggregatesJob(createGetAnalyticsConversationsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsConversationsAggregatesJobRequest createGetAnalyticsConversationsAggregatesJobRequest(String jobId) {
    return GetAnalyticsConversationsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for conversation aggregates
   * 
   * getAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsAggregatesJob(GetAnalyticsConversationsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for conversation aggregates
   * 
   * getAnalyticsConversationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsConversationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ConversationAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAsyncAggregateQueryResponse getAnalyticsConversationsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsConversationsAggregatesJobResults(createGetAnalyticsConversationsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsConversationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ConversationAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationAsyncAggregateQueryResponse> getAnalyticsConversationsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsConversationsAggregatesJobResults(createGetAnalyticsConversationsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsConversationsAggregatesJobResultsRequest createGetAnalyticsConversationsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsConversationsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsConversationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ConversationAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAsyncAggregateQueryResponse getAnalyticsConversationsAggregatesJobResults(GetAnalyticsConversationsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsConversationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationAsyncAggregateQueryResponse> getAnalyticsConversationsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAsyncAggregateQueryResponse> response = (ApiResponse<ConversationAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAsyncAggregateQueryResponse> response = (ApiResponse<ConversationAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse getAnalyticsConversationsDetails(List<String> id) throws IOException, ApiException {
    return  getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id));
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> getAnalyticsConversationsDetailsWithHttpInfo(List<String> id) throws IOException {
    return getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsRequest createGetAnalyticsConversationsDetailsRequest(List<String> id) {
    return GetAnalyticsConversationsDetailsRequest.builder()
            .withId(id)

            .build();
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse getAnalyticsConversationsDetails(GetAnalyticsConversationsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> getAnalyticsConversationsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsDetailsJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJob(createGetAnalyticsConversationsDetailsJobRequest(jobId));
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsDetailsJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsConversationsDetailsJob(createGetAnalyticsConversationsDetailsJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobRequest createGetAnalyticsConversationsDetailsJobRequest(String jobId) {
    return GetAnalyticsConversationsDetailsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsConversationsDetailsJob(GetAnalyticsConversationsDetailsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsConversationsDetailsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async details job
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationAsyncQueryResponse getAnalyticsConversationsDetailsJobResults(String jobId, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJobResults(createGetAnalyticsConversationsDetailsJobResultsRequest(jobId, cursor, pageSize));
  }

  /**
   * Fetch a page of results for an async details job
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationAsyncQueryResponse> getAnalyticsConversationsDetailsJobResultsWithHttpInfo(String jobId, String cursor, Integer pageSize) throws IOException {
    return getAnalyticsConversationsDetailsJobResults(createGetAnalyticsConversationsDetailsJobResultsRequest(jobId, cursor, pageSize).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobResultsRequest createGetAnalyticsConversationsDetailsJobResultsRequest(String jobId, String cursor, Integer pageSize) {
    return GetAnalyticsConversationsDetailsJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Fetch a page of results for an async details job
   * 
   * @param request The request object
   * @return AnalyticsConversationAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationAsyncQueryResponse getAnalyticsConversationsDetailsJobResults(GetAnalyticsConversationsDetailsJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationAsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async details job
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationAsyncQueryResponse> getAnalyticsConversationsDetailsJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationAsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsConversationsDetailsJobsAvailability() throws IOException, ApiException {
    return  getAnalyticsConversationsDetailsJobsAvailability(createGetAnalyticsConversationsDetailsJobsAvailabilityRequest());
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsConversationsDetailsJobsAvailabilityWithHttpInfo() throws IOException {
    return getAnalyticsConversationsDetailsJobsAvailability(createGetAnalyticsConversationsDetailsJobsAvailabilityRequest().withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsJobsAvailabilityRequest createGetAnalyticsConversationsDetailsJobsAvailabilityRequest() {
    return GetAnalyticsConversationsDetailsJobsAvailabilityRequest.builder()
            .build();
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsConversationsDetailsJobsAvailability(GetAnalyticsConversationsDetailsJobsAvailabilityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataAvailabilityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataAvailabilityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsConversationsDetailsJobsAvailability(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataAvailabilityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get analytics data retention setting
   * 
   * @return AnalyticsDataRetentionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsDataRetentionResponse getAnalyticsDataretentionSettings() throws IOException, ApiException {
    return  getAnalyticsDataretentionSettings(createGetAnalyticsDataretentionSettingsRequest());
  }

  /**
   * Get analytics data retention setting
   * 
   * @return AnalyticsDataRetentionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsDataRetentionResponse> getAnalyticsDataretentionSettingsWithHttpInfo() throws IOException {
    return getAnalyticsDataretentionSettings(createGetAnalyticsDataretentionSettingsRequest().withHttpInfo());
  }

  private GetAnalyticsDataretentionSettingsRequest createGetAnalyticsDataretentionSettingsRequest() {
    return GetAnalyticsDataretentionSettingsRequest.builder()
            .build();
  }

  /**
   * Get analytics data retention setting
   * 
   * @param request The request object
   * @return AnalyticsDataRetentionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsDataRetentionResponse getAnalyticsDataretentionSettings(GetAnalyticsDataretentionSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsDataRetentionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsDataRetentionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get analytics data retention setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsDataRetentionResponse> getAnalyticsDataretentionSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsDataRetentionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsDataRetentionResponse> response = (ApiResponse<AnalyticsDataRetentionResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsDataRetentionResponse> response = (ApiResponse<AnalyticsDataRetentionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsEvaluationsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsEvaluationsAggregatesJob(createGetAnalyticsEvaluationsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsEvaluationsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsEvaluationsAggregatesJob(createGetAnalyticsEvaluationsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsEvaluationsAggregatesJobRequest createGetAnalyticsEvaluationsAggregatesJobRequest(String jobId) {
    return GetAnalyticsEvaluationsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsEvaluationsAggregatesJob(GetAnalyticsEvaluationsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsEvaluationsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return EvaluationAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAsyncAggregateQueryResponse getAnalyticsEvaluationsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsEvaluationsAggregatesJobResults(createGetAnalyticsEvaluationsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return EvaluationAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAsyncAggregateQueryResponse> getAnalyticsEvaluationsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsEvaluationsAggregatesJobResults(createGetAnalyticsEvaluationsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsEvaluationsAggregatesJobResultsRequest createGetAnalyticsEvaluationsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsEvaluationsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return EvaluationAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAsyncAggregateQueryResponse getAnalyticsEvaluationsAggregatesJobResults(GetAnalyticsEvaluationsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAsyncAggregateQueryResponse> getAnalyticsEvaluationsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationAsyncAggregateQueryResponse> response = (ApiResponse<EvaluationAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationAsyncAggregateQueryResponse> response = (ApiResponse<EvaluationAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for flow execution aggregates
   * 
   * getAnalyticsFlowexecutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowexecutionsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsFlowexecutionsAggregatesJob(createGetAnalyticsFlowexecutionsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for flow execution aggregates
   * 
   * getAnalyticsFlowexecutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowexecutionsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsFlowexecutionsAggregatesJob(createGetAnalyticsFlowexecutionsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsFlowexecutionsAggregatesJobRequest createGetAnalyticsFlowexecutionsAggregatesJobRequest(String jobId) {
    return GetAnalyticsFlowexecutionsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for flow execution aggregates
   * 
   * getAnalyticsFlowexecutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowexecutionsAggregatesJob(GetAnalyticsFlowexecutionsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for flow execution aggregates
   * 
   * getAnalyticsFlowexecutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowexecutionsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowexecutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowExecutionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionAsyncAggregateQueryResponse getAnalyticsFlowexecutionsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsFlowexecutionsAggregatesJobResults(createGetAnalyticsFlowexecutionsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowexecutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowExecutionAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionAsyncAggregateQueryResponse> getAnalyticsFlowexecutionsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsFlowexecutionsAggregatesJobResults(createGetAnalyticsFlowexecutionsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsFlowexecutionsAggregatesJobResultsRequest createGetAnalyticsFlowexecutionsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsFlowexecutionsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowexecutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return FlowExecutionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionAsyncAggregateQueryResponse getAnalyticsFlowexecutionsAggregatesJobResults(GetAnalyticsFlowexecutionsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowExecutionAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowExecutionAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowexecutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionAsyncAggregateQueryResponse> getAnalyticsFlowexecutionsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowExecutionAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionAsyncAggregateQueryResponse> response = (ApiResponse<FlowExecutionAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionAsyncAggregateQueryResponse> response = (ApiResponse<FlowExecutionAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsFlowsAggregatesJob(createGetAnalyticsFlowsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsFlowsAggregatesJob(createGetAnalyticsFlowsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsFlowsAggregatesJobRequest createGetAnalyticsFlowsAggregatesJobRequest(String jobId) {
    return GetAnalyticsFlowsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsFlowsAggregatesJob(GetAnalyticsFlowsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for Flow aggregates
   * 
   * getAnalyticsFlowsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsFlowsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAsyncAggregateQueryResponse getAnalyticsFlowsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsFlowsAggregatesJobResults(createGetAnalyticsFlowsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return FlowAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAsyncAggregateQueryResponse> getAnalyticsFlowsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsFlowsAggregatesJobResults(createGetAnalyticsFlowsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsFlowsAggregatesJobResultsRequest createGetAnalyticsFlowsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsFlowsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return FlowAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAsyncAggregateQueryResponse getAnalyticsFlowsAggregatesJobResults(GetAnalyticsFlowsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsFlowsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAsyncAggregateQueryResponse> getAnalyticsFlowsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAsyncAggregateQueryResponse> response = (ApiResponse<FlowAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAsyncAggregateQueryResponse> response = (ApiResponse<FlowAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsJourneysAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJob(createGetAnalyticsJourneysAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsJourneysAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsJourneysAggregatesJob(createGetAnalyticsJourneysAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsJourneysAggregatesJobRequest createGetAnalyticsJourneysAggregatesJobRequest(String jobId) {
    return GetAnalyticsJourneysAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsJourneysAggregatesJob(GetAnalyticsJourneysAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsJourneysAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAsyncAggregateQueryResponse getAnalyticsJourneysAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJobResults(createGetAnalyticsJourneysAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAsyncAggregateQueryResponse> getAnalyticsJourneysAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsJourneysAggregatesJobResults(createGetAnalyticsJourneysAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsJourneysAggregatesJobResultsRequest createGetAnalyticsJourneysAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsJourneysAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAsyncAggregateQueryResponse getAnalyticsJourneysAggregatesJobResults(GetAnalyticsJourneysAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAsyncAggregateQueryResponse> getAnalyticsJourneysAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for knowledge aggregates
   * 
   * getAnalyticsKnowledgeAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsKnowledgeAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsKnowledgeAggregatesJob(createGetAnalyticsKnowledgeAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for knowledge aggregates
   * 
   * getAnalyticsKnowledgeAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsKnowledgeAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsKnowledgeAggregatesJob(createGetAnalyticsKnowledgeAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsKnowledgeAggregatesJobRequest createGetAnalyticsKnowledgeAggregatesJobRequest(String jobId) {
    return GetAnalyticsKnowledgeAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for knowledge aggregates
   * 
   * getAnalyticsKnowledgeAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsKnowledgeAggregatesJob(GetAnalyticsKnowledgeAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for knowledge aggregates
   * 
   * getAnalyticsKnowledgeAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsKnowledgeAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsKnowledgeAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return KnowledgeAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAsyncAggregateQueryResponse getAnalyticsKnowledgeAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsKnowledgeAggregatesJobResults(createGetAnalyticsKnowledgeAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsKnowledgeAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return KnowledgeAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAsyncAggregateQueryResponse> getAnalyticsKnowledgeAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsKnowledgeAggregatesJobResults(createGetAnalyticsKnowledgeAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsKnowledgeAggregatesJobResultsRequest createGetAnalyticsKnowledgeAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsKnowledgeAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsKnowledgeAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAsyncAggregateQueryResponse getAnalyticsKnowledgeAggregatesJobResults(GetAnalyticsKnowledgeAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsKnowledgeAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAsyncAggregateQueryResponse> getAnalyticsKnowledgeAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAsyncAggregateQueryResponse> response = (ApiResponse<KnowledgeAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAsyncAggregateQueryResponse> response = (ApiResponse<KnowledgeAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all view export requests for a user
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportingExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobListing getAnalyticsReportingExports(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsReportingExports(createGetAnalyticsReportingExportsRequest(pageNumber, pageSize));
  }

  /**
   * Get all view export requests for a user
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportingExportJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobListing> getAnalyticsReportingExportsWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getAnalyticsReportingExports(createGetAnalyticsReportingExportsRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetAnalyticsReportingExportsRequest createGetAnalyticsReportingExportsRequest(Integer pageNumber, Integer pageSize) {
    return GetAnalyticsReportingExportsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get all view export requests for a user
   * 
   * @param request The request object
   * @return ReportingExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobListing getAnalyticsReportingExports(GetAnalyticsReportingExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingExportJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingExportJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all view export requests for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobListing> getAnalyticsReportingExports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingExportJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all export metadata
   * 
   * @return ReportingExportMetadataJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportMetadataJobListing getAnalyticsReportingExportsMetadata() throws IOException, ApiException {
    return  getAnalyticsReportingExportsMetadata(createGetAnalyticsReportingExportsMetadataRequest());
  }

  /**
   * Get all export metadata
   * 
   * @return ReportingExportMetadataJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportMetadataJobListing> getAnalyticsReportingExportsMetadataWithHttpInfo() throws IOException {
    return getAnalyticsReportingExportsMetadata(createGetAnalyticsReportingExportsMetadataRequest().withHttpInfo());
  }

  private GetAnalyticsReportingExportsMetadataRequest createGetAnalyticsReportingExportsMetadataRequest() {
    return GetAnalyticsReportingExportsMetadataRequest.builder()
            .build();
  }

  /**
   * Get all export metadata
   * 
   * @param request The request object
   * @return ReportingExportMetadataJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportMetadataJobListing getAnalyticsReportingExportsMetadata(GetAnalyticsReportingExportsMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingExportMetadataJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingExportMetadataJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all export metadata
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportMetadataJobListing> getAnalyticsReportingExportsMetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingExportMetadataJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportMetadataJobListing> response = (ApiResponse<ReportingExportMetadataJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportMetadataJobListing> response = (ApiResponse<ReportingExportMetadataJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(Integer pageNumber, Integer pageSize, String locale) throws IOException, ApiException {
    return  getAnalyticsReportingMetadata(createGetAnalyticsReportingMetadataRequest(pageNumber, pageSize, locale));
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadataWithHttpInfo(Integer pageNumber, Integer pageSize, String locale) throws IOException {
    return getAnalyticsReportingMetadata(createGetAnalyticsReportingMetadataRequest(pageNumber, pageSize, locale).withHttpInfo());
  }

  private GetAnalyticsReportingMetadataRequest createGetAnalyticsReportingMetadataRequest(Integer pageNumber, Integer pageSize, String locale) {
    return GetAnalyticsReportingMetadataRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withLocale(locale)

            .build();
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request The request object
   * @return ReportMetaDataEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(GetAnalyticsReportingMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportMetaDataEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportMetaDataEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(String reportId, String locale) throws IOException, ApiException {
    return  getAnalyticsReportingReportIdMetadata(createGetAnalyticsReportingReportIdMetadataRequest(reportId, locale));
  }

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadataWithHttpInfo(String reportId, String locale) throws IOException {
    return getAnalyticsReportingReportIdMetadata(createGetAnalyticsReportingReportIdMetadataRequest(reportId, locale).withHttpInfo());
  }

  private GetAnalyticsReportingReportIdMetadataRequest createGetAnalyticsReportingReportIdMetadataRequest(String reportId, String locale) {
    return GetAnalyticsReportingReportIdMetadataRequest.builder()
            .withReportId(reportId)

            .withLocale(locale)

            .build();
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request The request object
   * @return ReportMetaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(GetAnalyticsReportingReportIdMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportMetaData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportMetaData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportMetaData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingReportformats() throws IOException, ApiException {
    return  getAnalyticsReportingReportformats(createGetAnalyticsReportingReportformatsRequest());
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformatsWithHttpInfo() throws IOException {
    return getAnalyticsReportingReportformats(createGetAnalyticsReportingReportformatsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingReportformatsRequest createGetAnalyticsReportingReportformatsRequest() {
    return GetAnalyticsReportingReportformatsRequest.builder()
            .build();
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingReportformats(GetAnalyticsReportingReportformatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformats(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule getAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingSchedule(createGetAnalyticsReportingScheduleRequest(scheduleId));
  }

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException {
    return getAnalyticsReportingSchedule(createGetAnalyticsReportingScheduleRequest(scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleRequest createGetAnalyticsReportingScheduleRequest(String scheduleId) {
    return GetAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule getAnalyticsReportingSchedule(GetAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistory(createGetAnalyticsReportingScheduleHistoryRequest(scheduleId, pageNumber, pageSize));
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryWithHttpInfo(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException {
    return getAnalyticsReportingScheduleHistory(createGetAnalyticsReportingScheduleHistoryRequest(scheduleId, pageNumber, pageSize).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryRequest createGetAnalyticsReportingScheduleHistoryRequest(String scheduleId, Integer pageNumber, Integer pageSize) {
    return GetAnalyticsReportingScheduleHistoryRequest.builder()
            .withScheduleId(scheduleId)

            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request The request object
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(GetAnalyticsReportingScheduleHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntryEntityDomainListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntryEntityDomainListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistoryLatest(createGetAnalyticsReportingScheduleHistoryLatestRequest(scheduleId));
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestWithHttpInfo(String scheduleId) throws IOException {
    return getAnalyticsReportingScheduleHistoryLatest(createGetAnalyticsReportingScheduleHistoryLatestRequest(scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryLatestRequest createGetAnalyticsReportingScheduleHistoryLatestRequest(String scheduleId) {
    return GetAnalyticsReportingScheduleHistoryLatestRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request The request object
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(GetAnalyticsReportingScheduleHistoryLatestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntry> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntry>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(String runId, String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistoryRunId(createGetAnalyticsReportingScheduleHistoryRunIdRequest(runId, scheduleId));
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdWithHttpInfo(String runId, String scheduleId) throws IOException {
    return getAnalyticsReportingScheduleHistoryRunId(createGetAnalyticsReportingScheduleHistoryRunIdRequest(runId, scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryRunIdRequest createGetAnalyticsReportingScheduleHistoryRunIdRequest(String runId, String scheduleId) {
    return GetAnalyticsReportingScheduleHistoryRunIdRequest.builder()
            .withRunId(runId)

            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request The request object
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(GetAnalyticsReportingScheduleHistoryRunIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntry> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntry>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsReportingSchedules(createGetAnalyticsReportingSchedulesRequest(pageNumber, pageSize));
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedulesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getAnalyticsReportingSchedules(createGetAnalyticsReportingSchedulesRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetAnalyticsReportingSchedulesRequest createGetAnalyticsReportingSchedulesRequest(Integer pageNumber, Integer pageSize) {
    return GetAnalyticsReportingSchedulesRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request The request object
   * @return ReportScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(GetAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportScheduleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportScheduleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get AnalyticsReportingSettings for an organization
   * 
   * @return AnalyticsReportingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsReportingSettings getAnalyticsReportingSettings() throws IOException, ApiException {
    return  getAnalyticsReportingSettings(createGetAnalyticsReportingSettingsRequest());
  }

  /**
   * Get AnalyticsReportingSettings for an organization
   * 
   * @return AnalyticsReportingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsReportingSettings> getAnalyticsReportingSettingsWithHttpInfo() throws IOException {
    return getAnalyticsReportingSettings(createGetAnalyticsReportingSettingsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingSettingsRequest createGetAnalyticsReportingSettingsRequest() {
    return GetAnalyticsReportingSettingsRequest.builder()
            .build();
  }

  /**
   * Get AnalyticsReportingSettings for an organization
   * 
   * @param request The request object
   * @return AnalyticsReportingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsReportingSettings getAnalyticsReportingSettings(GetAnalyticsReportingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsReportingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsReportingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get AnalyticsReportingSettings for an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsReportingSettings> getAnalyticsReportingSettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsReportingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsReportingSettings> response = (ApiResponse<AnalyticsReportingSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsReportingSettings> response = (ApiResponse<AnalyticsReportingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingTimeperiods() throws IOException, ApiException {
    return  getAnalyticsReportingTimeperiods(createGetAnalyticsReportingTimeperiodsRequest());
  }

  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiodsWithHttpInfo() throws IOException {
    return getAnalyticsReportingTimeperiods(createGetAnalyticsReportingTimeperiodsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingTimeperiodsRequest createGetAnalyticsReportingTimeperiodsRequest() {
    return GetAnalyticsReportingTimeperiodsRequest.builder()
            .build();
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingTimeperiods(GetAnalyticsReportingTimeperiodsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiods(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for resolution aggregates
   * 
   * getAnalyticsResolutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsResolutionsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsResolutionsAggregatesJob(createGetAnalyticsResolutionsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for resolution aggregates
   * 
   * getAnalyticsResolutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsResolutionsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsResolutionsAggregatesJob(createGetAnalyticsResolutionsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsResolutionsAggregatesJobRequest createGetAnalyticsResolutionsAggregatesJobRequest(String jobId) {
    return GetAnalyticsResolutionsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for resolution aggregates
   * 
   * getAnalyticsResolutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsResolutionsAggregatesJob(GetAnalyticsResolutionsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for resolution aggregates
   * 
   * getAnalyticsResolutionsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsResolutionsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsResolutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ResolutionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResolutionAsyncAggregateQueryResponse getAnalyticsResolutionsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsResolutionsAggregatesJobResults(createGetAnalyticsResolutionsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsResolutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return ResolutionAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResolutionAsyncAggregateQueryResponse> getAnalyticsResolutionsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsResolutionsAggregatesJobResults(createGetAnalyticsResolutionsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsResolutionsAggregatesJobResultsRequest createGetAnalyticsResolutionsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsResolutionsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsResolutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ResolutionAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResolutionAsyncAggregateQueryResponse getAnalyticsResolutionsAggregatesJobResults(GetAnalyticsResolutionsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResolutionAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResolutionAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsResolutionsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResolutionAsyncAggregateQueryResponse> getAnalyticsResolutionsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResolutionAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResolutionAsyncAggregateQueryResponse> response = (ApiResponse<ResolutionAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ResolutionAsyncAggregateQueryResponse> response = (ApiResponse<ResolutionAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsSurveysAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsSurveysAggregatesJob(createGetAnalyticsSurveysAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsSurveysAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsSurveysAggregatesJob(createGetAnalyticsSurveysAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsSurveysAggregatesJobRequest createGetAnalyticsSurveysAggregatesJobRequest(String jobId) {
    return GetAnalyticsSurveysAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsSurveysAggregatesJob(GetAnalyticsSurveysAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsSurveysAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SurveyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAsyncAggregateQueryResponse getAnalyticsSurveysAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsSurveysAggregatesJobResults(createGetAnalyticsSurveysAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return SurveyAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAsyncAggregateQueryResponse> getAnalyticsSurveysAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsSurveysAggregatesJobResults(createGetAnalyticsSurveysAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsSurveysAggregatesJobResultsRequest createGetAnalyticsSurveysAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsSurveysAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return SurveyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAsyncAggregateQueryResponse getAnalyticsSurveysAggregatesJobResults(GetAnalyticsSurveysAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAsyncAggregateQueryResponse> getAnalyticsSurveysAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyAsyncAggregateQueryResponse> response = (ApiResponse<SurveyAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyAsyncAggregateQueryResponse> response = (ApiResponse<SurveyAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for task management aggregates
   * 
   * getAnalyticsTaskmanagementAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsTaskmanagementAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsTaskmanagementAggregatesJob(createGetAnalyticsTaskmanagementAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for task management aggregates
   * 
   * getAnalyticsTaskmanagementAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsTaskmanagementAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsTaskmanagementAggregatesJob(createGetAnalyticsTaskmanagementAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsTaskmanagementAggregatesJobRequest createGetAnalyticsTaskmanagementAggregatesJobRequest(String jobId) {
    return GetAnalyticsTaskmanagementAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for task management aggregates
   * 
   * getAnalyticsTaskmanagementAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsTaskmanagementAggregatesJob(GetAnalyticsTaskmanagementAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for task management aggregates
   * 
   * getAnalyticsTaskmanagementAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsTaskmanagementAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async task management query
   * 
   * getAnalyticsTaskmanagementAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return TaskManagementAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TaskManagementAsyncAggregateQueryResponse getAnalyticsTaskmanagementAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsTaskmanagementAggregatesJobResults(createGetAnalyticsTaskmanagementAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async task management query
   * 
   * getAnalyticsTaskmanagementAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return TaskManagementAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TaskManagementAsyncAggregateQueryResponse> getAnalyticsTaskmanagementAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsTaskmanagementAggregatesJobResults(createGetAnalyticsTaskmanagementAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsTaskmanagementAggregatesJobResultsRequest createGetAnalyticsTaskmanagementAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsTaskmanagementAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async task management query
   * 
   * getAnalyticsTaskmanagementAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return TaskManagementAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TaskManagementAsyncAggregateQueryResponse getAnalyticsTaskmanagementAggregatesJobResults(GetAnalyticsTaskmanagementAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TaskManagementAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TaskManagementAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async task management query
   * 
   * getAnalyticsTaskmanagementAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TaskManagementAsyncAggregateQueryResponse> getAnalyticsTaskmanagementAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TaskManagementAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TaskManagementAsyncAggregateQueryResponse> response = (ApiResponse<TaskManagementAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TaskManagementAsyncAggregateQueryResponse> response = (ApiResponse<TaskManagementAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for transcript aggregates
   * 
   * getAnalyticsTranscriptsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsTranscriptsAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsTranscriptsAggregatesJob(createGetAnalyticsTranscriptsAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for transcript aggregates
   * 
   * getAnalyticsTranscriptsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsTranscriptsAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsTranscriptsAggregatesJob(createGetAnalyticsTranscriptsAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsTranscriptsAggregatesJobRequest createGetAnalyticsTranscriptsAggregatesJobRequest(String jobId) {
    return GetAnalyticsTranscriptsAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for transcript aggregates
   * 
   * getAnalyticsTranscriptsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsTranscriptsAggregatesJob(GetAnalyticsTranscriptsAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for transcript aggregates
   * 
   * getAnalyticsTranscriptsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsTranscriptsAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsTranscriptsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return TranscriptAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptAsyncAggregateQueryResponse getAnalyticsTranscriptsAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsTranscriptsAggregatesJobResults(createGetAnalyticsTranscriptsAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsTranscriptsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return TranscriptAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptAsyncAggregateQueryResponse> getAnalyticsTranscriptsAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsTranscriptsAggregatesJobResults(createGetAnalyticsTranscriptsAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsTranscriptsAggregatesJobResultsRequest createGetAnalyticsTranscriptsAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsTranscriptsAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsTranscriptsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return TranscriptAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptAsyncAggregateQueryResponse getAnalyticsTranscriptsAggregatesJobResults(GetAnalyticsTranscriptsAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsTranscriptsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptAsyncAggregateQueryResponse> getAnalyticsTranscriptsAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptAsyncAggregateQueryResponse> response = (ApiResponse<TranscriptAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptAsyncAggregateQueryResponse> response = (ApiResponse<TranscriptAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for user aggregates
   * 
   * getAnalyticsUsersAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsUsersAggregatesJob(createGetAnalyticsUsersAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for user aggregates
   * 
   * getAnalyticsUsersAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsUsersAggregatesJob(createGetAnalyticsUsersAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsUsersAggregatesJobRequest createGetAnalyticsUsersAggregatesJobRequest(String jobId) {
    return GetAnalyticsUsersAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for user aggregates
   * 
   * getAnalyticsUsersAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersAggregatesJob(GetAnalyticsUsersAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for user aggregates
   * 
   * getAnalyticsUsersAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsUsersAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return UserAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAsyncAggregateQueryResponse getAnalyticsUsersAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsUsersAggregatesJobResults(createGetAnalyticsUsersAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsUsersAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return UserAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAsyncAggregateQueryResponse> getAnalyticsUsersAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsUsersAggregatesJobResults(createGetAnalyticsUsersAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsUsersAggregatesJobResultsRequest createGetAnalyticsUsersAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsUsersAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsUsersAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UserAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAsyncAggregateQueryResponse getAnalyticsUsersAggregatesJobResults(GetAnalyticsUsersAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsUsersAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAsyncAggregateQueryResponse> getAnalyticsUsersAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAsyncAggregateQueryResponse> response = (ApiResponse<UserAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserAsyncAggregateQueryResponse> response = (ApiResponse<UserAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get status for async query for user details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersDetailsJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJob(createGetAnalyticsUsersDetailsJobRequest(jobId));
  }

  /**
   * Get status for async query for user details
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersDetailsJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsUsersDetailsJob(createGetAnalyticsUsersDetailsJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobRequest createGetAnalyticsUsersDetailsJobRequest(String jobId) {
    return GetAnalyticsUsersDetailsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for user details
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsUsersDetailsJob(GetAnalyticsUsersDetailsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsUsersDetailsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsAsyncQueryResponse getAnalyticsUsersDetailsJobResults(String jobId, String cursor, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJobResults(createGetAnalyticsUsersDetailsJobResultsRequest(jobId, cursor, pageSize));
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param jobId jobId (required)
   * @param cursor Indicates where to resume query results (not required for first page) (optional)
   * @param pageSize The desired maximum number of results (optional)
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> getAnalyticsUsersDetailsJobResultsWithHttpInfo(String jobId, String cursor, Integer pageSize) throws IOException {
    return getAnalyticsUsersDetailsJobResults(createGetAnalyticsUsersDetailsJobResultsRequest(jobId, cursor, pageSize).withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobResultsRequest createGetAnalyticsUsersDetailsJobResultsRequest(String jobId, String cursor, Integer pageSize) {
    return GetAnalyticsUsersDetailsJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .withPageSize(pageSize)

            .build();
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsAsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsAsyncQueryResponse getAnalyticsUsersDetailsJobResults(GetAnalyticsUsersDetailsJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> getAnalyticsUsersDetailsJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsUsersDetailsJobsAvailability() throws IOException, ApiException {
    return  getAnalyticsUsersDetailsJobsAvailability(createGetAnalyticsUsersDetailsJobsAvailabilityRequest());
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @return DataAvailabilityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsUsersDetailsJobsAvailabilityWithHttpInfo() throws IOException {
    return getAnalyticsUsersDetailsJobsAvailability(createGetAnalyticsUsersDetailsJobsAvailabilityRequest().withHttpInfo());
  }

  private GetAnalyticsUsersDetailsJobsAvailabilityRequest createGetAnalyticsUsersDetailsJobsAvailabilityRequest() {
    return GetAnalyticsUsersDetailsJobsAvailabilityRequest.builder()
            .build();
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return DataAvailabilityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DataAvailabilityResponse getAnalyticsUsersDetailsJobsAvailability(GetAnalyticsUsersDetailsJobsAvailabilityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DataAvailabilityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DataAvailabilityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DataAvailabilityResponse> getAnalyticsUsersDetailsJobsAvailability(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DataAvailabilityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Patch AnalyticsReportingSettings values for an organization
   * 
   * @param body AnalyticsReportingSettingsRequest (required)
   * @return AnalyticsReportingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsReportingSettings patchAnalyticsReportingSettings(AnalyticsReportingSettings body) throws IOException, ApiException {
    return  patchAnalyticsReportingSettings(createPatchAnalyticsReportingSettingsRequest(body));
  }

  /**
   * Patch AnalyticsReportingSettings values for an organization
   * 
   * @param body AnalyticsReportingSettingsRequest (required)
   * @return AnalyticsReportingSettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsReportingSettings> patchAnalyticsReportingSettingsWithHttpInfo(AnalyticsReportingSettings body) throws IOException {
    return patchAnalyticsReportingSettings(createPatchAnalyticsReportingSettingsRequest(body).withHttpInfo());
  }

  private PatchAnalyticsReportingSettingsRequest createPatchAnalyticsReportingSettingsRequest(AnalyticsReportingSettings body) {
    return PatchAnalyticsReportingSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Patch AnalyticsReportingSettings values for an organization
   * 
   * @param request The request object
   * @return AnalyticsReportingSettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsReportingSettings patchAnalyticsReportingSettings(PatchAnalyticsReportingSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsReportingSettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsReportingSettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch AnalyticsReportingSettings values for an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsReportingSettings> patchAnalyticsReportingSettings(ApiRequest<AnalyticsReportingSettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsReportingSettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsReportingSettings> response = (ApiResponse<AnalyticsReportingSettings>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsReportingSettings> response = (ApiResponse<AnalyticsReportingSettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for action aggregates asynchronously
   * 
   * postAnalyticsActionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsActionsAggregatesJobs(ActionAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsActionsAggregatesJobs(createPostAnalyticsActionsAggregatesJobsRequest(body));
  }

  /**
   * Query for action aggregates asynchronously
   * 
   * postAnalyticsActionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsActionsAggregatesJobsWithHttpInfo(ActionAsyncAggregationQuery body) throws IOException {
    return postAnalyticsActionsAggregatesJobs(createPostAnalyticsActionsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsActionsAggregatesJobsRequest createPostAnalyticsActionsAggregatesJobsRequest(ActionAsyncAggregationQuery body) {
    return PostAnalyticsActionsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for action aggregates asynchronously
   * 
   * postAnalyticsActionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsActionsAggregatesJobs(PostAnalyticsActionsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for action aggregates asynchronously
   * 
   * postAnalyticsActionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsActionsAggregatesJobs(ApiRequest<ActionAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for action aggregates
   * 
   * @param body query (required)
   * @return ActionAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionAggregateQueryResponse postAnalyticsActionsAggregatesQuery(ActionAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsActionsAggregatesQuery(createPostAnalyticsActionsAggregatesQueryRequest(body));
  }

  /**
   * Query for action aggregates
   * 
   * @param body query (required)
   * @return ActionAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionAggregateQueryResponse> postAnalyticsActionsAggregatesQueryWithHttpInfo(ActionAggregationQuery body) throws IOException {
    return postAnalyticsActionsAggregatesQuery(createPostAnalyticsActionsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsActionsAggregatesQueryRequest createPostAnalyticsActionsAggregatesQueryRequest(ActionAggregationQuery body) {
    return PostAnalyticsActionsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for action aggregates
   * 
   * @param request The request object
   * @return ActionAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionAggregateQueryResponse postAnalyticsActionsAggregatesQuery(PostAnalyticsActionsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for action aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionAggregateQueryResponse> postAnalyticsActionsAggregatesQuery(ApiRequest<ActionAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionAggregateQueryResponse> response = (ApiResponse<ActionAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionAggregateQueryResponse> response = (ApiResponse<ActionAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for bot aggregates asynchronously
   * 
   * postAnalyticsBotsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsBotsAggregatesJobs(BotAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsBotsAggregatesJobs(createPostAnalyticsBotsAggregatesJobsRequest(body));
  }

  /**
   * Query for bot aggregates asynchronously
   * 
   * postAnalyticsBotsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsBotsAggregatesJobsWithHttpInfo(BotAsyncAggregationQuery body) throws IOException {
    return postAnalyticsBotsAggregatesJobs(createPostAnalyticsBotsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsBotsAggregatesJobsRequest createPostAnalyticsBotsAggregatesJobsRequest(BotAsyncAggregationQuery body) {
    return PostAnalyticsBotsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for bot aggregates asynchronously
   * 
   * postAnalyticsBotsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsBotsAggregatesJobs(PostAnalyticsBotsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for bot aggregates asynchronously
   * 
   * postAnalyticsBotsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsBotsAggregatesJobs(ApiRequest<BotAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for bot aggregates
   * 
   * @param body query (required)
   * @return BotAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BotAggregateQueryResponse postAnalyticsBotsAggregatesQuery(BotAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsBotsAggregatesQuery(createPostAnalyticsBotsAggregatesQueryRequest(body));
  }

  /**
   * Query for bot aggregates
   * 
   * @param body query (required)
   * @return BotAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BotAggregateQueryResponse> postAnalyticsBotsAggregatesQueryWithHttpInfo(BotAggregationQuery body) throws IOException {
    return postAnalyticsBotsAggregatesQuery(createPostAnalyticsBotsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsBotsAggregatesQueryRequest createPostAnalyticsBotsAggregatesQueryRequest(BotAggregationQuery body) {
    return PostAnalyticsBotsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for bot aggregates
   * 
   * @param request The request object
   * @return BotAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public BotAggregateQueryResponse postAnalyticsBotsAggregatesQuery(PostAnalyticsBotsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<BotAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<BotAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for bot aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<BotAggregateQueryResponse> postAnalyticsBotsAggregatesQuery(ApiRequest<BotAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<BotAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<BotAggregateQueryResponse> response = (ApiResponse<BotAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<BotAggregateQueryResponse> response = (ApiResponse<BotAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(String conversationId, PropertyIndexRequest body) throws IOException, ApiException {
    return  postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body));
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesWithHttpInfo(String conversationId, PropertyIndexRequest body) throws IOException {
    return postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body).withHttpInfo());
  }

  private PostAnalyticsConversationDetailsPropertiesRequest createPostAnalyticsConversationDetailsPropertiesRequest(String conversationId, PropertyIndexRequest body) {
    return PostAnalyticsConversationDetailsPropertiesRequest.builder()
            .withConversationId(conversationId)

            .withBody(body)

            .build();
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(PostAnalyticsConversationDetailsPropertiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PropertyIndexRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsProperties(ApiRequest<PropertyIndexRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PropertyIndexRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation activity observations
   * 
   * postAnalyticsConversationsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return ConversationActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationActivityResponse postAnalyticsConversationsActivityQuery(ConversationActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsConversationsActivityQuery(createPostAnalyticsConversationsActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for conversation activity observations
   * 
   * postAnalyticsConversationsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return ConversationActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationActivityResponse> postAnalyticsConversationsActivityQueryWithHttpInfo(ConversationActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsConversationsActivityQuery(createPostAnalyticsConversationsActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsConversationsActivityQueryRequest createPostAnalyticsConversationsActivityQueryRequest(ConversationActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsConversationsActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for conversation activity observations
   * 
   * postAnalyticsConversationsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return ConversationActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationActivityResponse postAnalyticsConversationsActivityQuery(PostAnalyticsConversationsActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation activity observations
   * 
   * postAnalyticsConversationsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationActivityResponse> postAnalyticsConversationsActivityQuery(ApiRequest<ConversationActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationActivityResponse> response = (ApiResponse<ConversationActivityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationActivityResponse> response = (ApiResponse<ConversationActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation aggregates asynchronously
   * 
   * postAnalyticsConversationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsAggregatesJobs(ConversationAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsAggregatesJobs(createPostAnalyticsConversationsAggregatesJobsRequest(body));
  }

  /**
   * Query for conversation aggregates asynchronously
   * 
   * postAnalyticsConversationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsAggregatesJobsWithHttpInfo(ConversationAsyncAggregationQuery body) throws IOException {
    return postAnalyticsConversationsAggregatesJobs(createPostAnalyticsConversationsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsAggregatesJobsRequest createPostAnalyticsConversationsAggregatesJobsRequest(ConversationAsyncAggregationQuery body) {
    return PostAnalyticsConversationsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for conversation aggregates asynchronously
   * 
   * postAnalyticsConversationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsAggregatesJobs(PostAnalyticsConversationsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation aggregates asynchronously
   * 
   * postAnalyticsConversationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsAggregatesJobs(ApiRequest<ConversationAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return ConversationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAggregateQueryResponse postAnalyticsConversationsAggregatesQuery(ConversationAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body));
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return ConversationAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationAggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(ConversationAggregationQuery body) throws IOException {
    return postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsAggregatesQueryRequest createPostAnalyticsConversationsAggregatesQueryRequest(ConversationAggregationQuery body) {
    return PostAnalyticsConversationsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return ConversationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ConversationAggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ConversationAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ConversationAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ConversationAggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<ConversationAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ConversationAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsDetailsJobs(AsyncConversationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsDetailsJobs(createPostAnalyticsConversationsDetailsJobsRequest(body));
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsDetailsJobsWithHttpInfo(AsyncConversationQuery body) throws IOException {
    return postAnalyticsConversationsDetailsJobs(createPostAnalyticsConversationsDetailsJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsDetailsJobsRequest createPostAnalyticsConversationsDetailsJobsRequest(AsyncConversationQuery body) {
    return PostAnalyticsConversationsDetailsJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsConversationsDetailsJobs(PostAnalyticsConversationsDetailsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsConversationsDetailsJobs(ApiRequest<AsyncConversationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(ConversationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body));
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryWithHttpInfo(ConversationQuery body) throws IOException {
    return postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsDetailsQueryRequest createPostAnalyticsConversationsDetailsQueryRequest(ConversationQuery body) {
    return PostAnalyticsConversationsDetailsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(PostAnalyticsConversationsDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(ApiRequest<ConversationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse postAnalyticsConversationsTranscriptsQuery(TranscriptConversationDetailSearchRequest body) throws IOException, ApiException {
    return  postAnalyticsConversationsTranscriptsQuery(createPostAnalyticsConversationsTranscriptsQueryRequest(body));
  }

  /**
   * Search resources.
   * 
   * @param body Search request options (required)
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQueryWithHttpInfo(TranscriptConversationDetailSearchRequest body) throws IOException {
    return postAnalyticsConversationsTranscriptsQuery(createPostAnalyticsConversationsTranscriptsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsTranscriptsQueryRequest createPostAnalyticsConversationsTranscriptsQueryRequest(TranscriptConversationDetailSearchRequest body) {
    return PostAnalyticsConversationsTranscriptsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return AnalyticsConversationWithoutAttributesMultiGetResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationWithoutAttributesMultiGetResponse postAnalyticsConversationsTranscriptsQuery(PostAnalyticsConversationsTranscriptsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search resources.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQuery(ApiRequest<TranscriptConversationDetailSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsEvaluationsAggregatesJobs(EvaluationAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsEvaluationsAggregatesJobs(createPostAnalyticsEvaluationsAggregatesJobsRequest(body));
  }

  /**
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsEvaluationsAggregatesJobsWithHttpInfo(EvaluationAsyncAggregationQuery body) throws IOException {
    return postAnalyticsEvaluationsAggregatesJobs(createPostAnalyticsEvaluationsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsEvaluationsAggregatesJobsRequest createPostAnalyticsEvaluationsAggregatesJobsRequest(EvaluationAsyncAggregationQuery body) {
    return PostAnalyticsEvaluationsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsEvaluationsAggregatesJobs(PostAnalyticsEvaluationsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsEvaluationsAggregatesJobs(ApiRequest<EvaluationAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return EvaluationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(EvaluationAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body));
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return EvaluationAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(EvaluationAggregationQuery body) throws IOException {
    return postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsEvaluationsAggregatesQueryRequest createPostAnalyticsEvaluationsAggregatesQueryRequest(EvaluationAggregationQuery body) {
    return PostAnalyticsEvaluationsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return EvaluationAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationAggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationAggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<EvaluationAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow execution aggregates asynchronously
   * 
   * postAnalyticsFlowexecutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowexecutionsAggregatesJobs(FlowExecutionAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowexecutionsAggregatesJobs(createPostAnalyticsFlowexecutionsAggregatesJobsRequest(body));
  }

  /**
   * Query for flow execution aggregates asynchronously
   * 
   * postAnalyticsFlowexecutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowexecutionsAggregatesJobsWithHttpInfo(FlowExecutionAsyncAggregationQuery body) throws IOException {
    return postAnalyticsFlowexecutionsAggregatesJobs(createPostAnalyticsFlowexecutionsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowexecutionsAggregatesJobsRequest createPostAnalyticsFlowexecutionsAggregatesJobsRequest(FlowExecutionAsyncAggregationQuery body) {
    return PostAnalyticsFlowexecutionsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow execution aggregates asynchronously
   * 
   * postAnalyticsFlowexecutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowexecutionsAggregatesJobs(PostAnalyticsFlowexecutionsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow execution aggregates asynchronously
   * 
   * postAnalyticsFlowexecutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowexecutionsAggregatesJobs(ApiRequest<FlowExecutionAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow execution aggregates
   * 
   * postAnalyticsFlowexecutionsAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return FlowExecutionAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionAggregateQueryResponse postAnalyticsFlowexecutionsAggregatesQuery(FlowExecutionAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowexecutionsAggregatesQuery(createPostAnalyticsFlowexecutionsAggregatesQueryRequest(body));
  }

  /**
   * Query for flow execution aggregates
   * 
   * postAnalyticsFlowexecutionsAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return FlowExecutionAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionAggregateQueryResponse> postAnalyticsFlowexecutionsAggregatesQueryWithHttpInfo(FlowExecutionAggregationQuery body) throws IOException {
    return postAnalyticsFlowexecutionsAggregatesQuery(createPostAnalyticsFlowexecutionsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowexecutionsAggregatesQueryRequest createPostAnalyticsFlowexecutionsAggregatesQueryRequest(FlowExecutionAggregationQuery body) {
    return PostAnalyticsFlowexecutionsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow execution aggregates
   * 
   * postAnalyticsFlowexecutionsAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return FlowExecutionAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowExecutionAggregateQueryResponse postAnalyticsFlowexecutionsAggregatesQuery(PostAnalyticsFlowexecutionsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowExecutionAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowExecutionAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow execution aggregates
   * 
   * postAnalyticsFlowexecutionsAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowExecutionAggregateQueryResponse> postAnalyticsFlowexecutionsAggregatesQuery(ApiRequest<FlowExecutionAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowExecutionAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionAggregateQueryResponse> response = (ApiResponse<FlowExecutionAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowExecutionAggregateQueryResponse> response = (ApiResponse<FlowExecutionAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow activity observations
   * 
   * postAnalyticsFlowsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return FlowActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowActivityResponse postAnalyticsFlowsActivityQuery(FlowActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsFlowsActivityQuery(createPostAnalyticsFlowsActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for flow activity observations
   * 
   * postAnalyticsFlowsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return FlowActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowActivityResponse> postAnalyticsFlowsActivityQueryWithHttpInfo(FlowActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsFlowsActivityQuery(createPostAnalyticsFlowsActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsFlowsActivityQueryRequest createPostAnalyticsFlowsActivityQueryRequest(FlowActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsFlowsActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for flow activity observations
   * 
   * postAnalyticsFlowsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return FlowActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowActivityResponse postAnalyticsFlowsActivityQuery(PostAnalyticsFlowsActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow activity observations
   * 
   * postAnalyticsFlowsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowActivityResponse> postAnalyticsFlowsActivityQuery(ApiRequest<FlowActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowActivityResponse> response = (ApiResponse<FlowActivityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowActivityResponse> response = (ApiResponse<FlowActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowsAggregatesJobs(FlowAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesJobs(createPostAnalyticsFlowsAggregatesJobsRequest(body));
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowsAggregatesJobsWithHttpInfo(FlowAsyncAggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesJobs(createPostAnalyticsFlowsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesJobsRequest createPostAnalyticsFlowsAggregatesJobsRequest(FlowAsyncAggregationQuery body) {
    return PostAnalyticsFlowsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsFlowsAggregatesJobs(PostAnalyticsFlowsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow aggregates asynchronously
   * 
   * postAnalyticsFlowsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsFlowsAggregatesJobs(ApiRequest<FlowAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return FlowAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAggregateQueryResponse postAnalyticsFlowsAggregatesQuery(FlowAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body));
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return FlowAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQueryWithHttpInfo(FlowAggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesQueryRequest createPostAnalyticsFlowsAggregatesQueryRequest(FlowAggregationQuery body) {
    return PostAnalyticsFlowsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return FlowAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowAggregateQueryResponse postAnalyticsFlowsAggregatesQuery(PostAnalyticsFlowsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQuery(ApiRequest<FlowAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return FlowObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowObservationQueryResponse postAnalyticsFlowsObservationsQuery(FlowObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body));
  }

  /**
   * Query for flow observations
   * 
   * @param body query (required)
   * @return FlowObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQueryWithHttpInfo(FlowObservationQuery body) throws IOException {
    return postAnalyticsFlowsObservationsQuery(createPostAnalyticsFlowsObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsObservationsQueryRequest createPostAnalyticsFlowsObservationsQueryRequest(FlowObservationQuery body) {
    return PostAnalyticsFlowsObservationsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow observations
   * 
   * @param request The request object
   * @return FlowObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowObservationQueryResponse postAnalyticsFlowsObservationsQuery(PostAnalyticsFlowsObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQuery(ApiRequest<FlowObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsJourneysAggregatesJobs(JourneyAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsJourneysAggregatesJobs(createPostAnalyticsJourneysAggregatesJobsRequest(body));
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsJourneysAggregatesJobsWithHttpInfo(JourneyAsyncAggregationQuery body) throws IOException {
    return postAnalyticsJourneysAggregatesJobs(createPostAnalyticsJourneysAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsJourneysAggregatesJobsRequest createPostAnalyticsJourneysAggregatesJobsRequest(JourneyAsyncAggregationQuery body) {
    return PostAnalyticsJourneysAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsJourneysAggregatesJobs(PostAnalyticsJourneysAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsJourneysAggregatesJobs(ApiRequest<JourneyAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for journey aggregates
   * 
   * @param body query (required)
   * @return JourneyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAggregateQueryResponse postAnalyticsJourneysAggregatesQuery(JourneyAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsJourneysAggregatesQuery(createPostAnalyticsJourneysAggregatesQueryRequest(body));
  }

  /**
   * Query for journey aggregates
   * 
   * @param body query (required)
   * @return JourneyAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQueryWithHttpInfo(JourneyAggregationQuery body) throws IOException {
    return postAnalyticsJourneysAggregatesQuery(createPostAnalyticsJourneysAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsJourneysAggregatesQueryRequest createPostAnalyticsJourneysAggregatesQueryRequest(JourneyAggregationQuery body) {
    return PostAnalyticsJourneysAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for journey aggregates
   * 
   * @param request The request object
   * @return JourneyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAggregateQueryResponse postAnalyticsJourneysAggregatesQuery(PostAnalyticsJourneysAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for journey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQuery(ApiRequest<JourneyAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for knowledge aggregates asynchronously
   * 
   * postAnalyticsKnowledgeAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsKnowledgeAggregatesJobs(KnowledgeAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsKnowledgeAggregatesJobs(createPostAnalyticsKnowledgeAggregatesJobsRequest(body));
  }

  /**
   * Query for knowledge aggregates asynchronously
   * 
   * postAnalyticsKnowledgeAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsKnowledgeAggregatesJobsWithHttpInfo(KnowledgeAsyncAggregationQuery body) throws IOException {
    return postAnalyticsKnowledgeAggregatesJobs(createPostAnalyticsKnowledgeAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsKnowledgeAggregatesJobsRequest createPostAnalyticsKnowledgeAggregatesJobsRequest(KnowledgeAsyncAggregationQuery body) {
    return PostAnalyticsKnowledgeAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for knowledge aggregates asynchronously
   * 
   * postAnalyticsKnowledgeAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsKnowledgeAggregatesJobs(PostAnalyticsKnowledgeAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for knowledge aggregates asynchronously
   * 
   * postAnalyticsKnowledgeAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsKnowledgeAggregatesJobs(ApiRequest<KnowledgeAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for knowledge aggregates
   * 
   * postAnalyticsKnowledgeAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return KnowledgeAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAggregateQueryResponse postAnalyticsKnowledgeAggregatesQuery(KnowledgeAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsKnowledgeAggregatesQuery(createPostAnalyticsKnowledgeAggregatesQueryRequest(body));
  }

  /**
   * Query for knowledge aggregates
   * 
   * postAnalyticsKnowledgeAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return KnowledgeAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAggregateQueryResponse> postAnalyticsKnowledgeAggregatesQueryWithHttpInfo(KnowledgeAggregationQuery body) throws IOException {
    return postAnalyticsKnowledgeAggregatesQuery(createPostAnalyticsKnowledgeAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsKnowledgeAggregatesQueryRequest createPostAnalyticsKnowledgeAggregatesQueryRequest(KnowledgeAggregationQuery body) {
    return PostAnalyticsKnowledgeAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for knowledge aggregates
   * 
   * postAnalyticsKnowledgeAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return KnowledgeAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeAggregateQueryResponse postAnalyticsKnowledgeAggregatesQuery(PostAnalyticsKnowledgeAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for knowledge aggregates
   * 
   * postAnalyticsKnowledgeAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeAggregateQueryResponse> postAnalyticsKnowledgeAggregatesQuery(ApiRequest<KnowledgeAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAggregateQueryResponse> response = (ApiResponse<KnowledgeAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeAggregateQueryResponse> response = (ApiResponse<KnowledgeAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QueueObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueObservationQueryResponse postAnalyticsQueuesObservationsQuery(QueueObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body));
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QueueObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueObservationQueryResponse> postAnalyticsQueuesObservationsQueryWithHttpInfo(QueueObservationQuery body) throws IOException {
    return postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsQueuesObservationsQueryRequest createPostAnalyticsQueuesObservationsQueryRequest(QueueObservationQuery body) {
    return PostAnalyticsQueuesObservationsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return QueueObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QueueObservationQueryResponse postAnalyticsQueuesObservationsQuery(PostAnalyticsQueuesObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QueueObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QueueObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QueueObservationQueryResponse> postAnalyticsQueuesObservationsQuery(ApiRequest<QueueObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QueueObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param body ReportingExportJobRequest (required)
   * @return ReportingExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobResponse postAnalyticsReportingExports(ReportingExportJobRequest body) throws IOException, ApiException {
    return  postAnalyticsReportingExports(createPostAnalyticsReportingExportsRequest(body));
  }

  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param body ReportingExportJobRequest (required)
   * @return ReportingExportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobResponse> postAnalyticsReportingExportsWithHttpInfo(ReportingExportJobRequest body) throws IOException {
    return postAnalyticsReportingExports(createPostAnalyticsReportingExportsRequest(body).withHttpInfo());
  }

  private PostAnalyticsReportingExportsRequest createPostAnalyticsReportingExportsRequest(ReportingExportJobRequest body) {
    return PostAnalyticsReportingExportsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param request The request object
   * @return ReportingExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobResponse postAnalyticsReportingExports(PostAnalyticsReportingExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingExportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingExportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobResponse> postAnalyticsReportingExports(ApiRequest<ReportingExportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingExportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports/{exportId}/execute instead
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(String scheduleId) throws IOException, ApiException {
    return  postAnalyticsReportingScheduleRunreport(createPostAnalyticsReportingScheduleRunreportRequest(scheduleId));
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports/{exportId}/execute instead
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreportWithHttpInfo(String scheduleId) throws IOException {
    return postAnalyticsReportingScheduleRunreport(createPostAnalyticsReportingScheduleRunreportRequest(scheduleId).withHttpInfo());
  }

  private PostAnalyticsReportingScheduleRunreportRequest createPostAnalyticsReportingScheduleRunreportRequest(String scheduleId) {
    return PostAnalyticsReportingScheduleRunreportRequest.builder()
            .withScheduleId(scheduleId)

            .build();
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports/{exportId}/execute instead
   * @param request The request object
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(PostAnalyticsReportingScheduleRunreportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RunNowResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RunNowResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports/{exportId}/execute instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RunNowResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a scheduled report job
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports instead
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ReportSchedule postAnalyticsReportingSchedules(ReportSchedule body) throws IOException, ApiException {
    return  postAnalyticsReportingSchedules(createPostAnalyticsReportingSchedulesRequest(body));
  }

  /**
   * Create a scheduled report job
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports instead
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedulesWithHttpInfo(ReportSchedule body) throws IOException {
    return postAnalyticsReportingSchedules(createPostAnalyticsReportingSchedulesRequest(body).withHttpInfo());
  }

  private PostAnalyticsReportingSchedulesRequest createPostAnalyticsReportingSchedulesRequest(ReportSchedule body) {
    return PostAnalyticsReportingSchedulesRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a scheduled report job
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports instead
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ReportSchedule postAnalyticsReportingSchedules(PostAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a scheduled report job
   * This route is deprecated, please use POST:api/v2/analytics/reporting/exports instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedules(ApiRequest<ReportSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for resolution aggregates asynchronously
   * 
   * postAnalyticsResolutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsResolutionsAggregatesJobs(ResolutionAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsResolutionsAggregatesJobs(createPostAnalyticsResolutionsAggregatesJobsRequest(body));
  }

  /**
   * Query for resolution aggregates asynchronously
   * 
   * postAnalyticsResolutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsResolutionsAggregatesJobsWithHttpInfo(ResolutionAsyncAggregationQuery body) throws IOException {
    return postAnalyticsResolutionsAggregatesJobs(createPostAnalyticsResolutionsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsResolutionsAggregatesJobsRequest createPostAnalyticsResolutionsAggregatesJobsRequest(ResolutionAsyncAggregationQuery body) {
    return PostAnalyticsResolutionsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for resolution aggregates asynchronously
   * 
   * postAnalyticsResolutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsResolutionsAggregatesJobs(PostAnalyticsResolutionsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for resolution aggregates asynchronously
   * 
   * postAnalyticsResolutionsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsResolutionsAggregatesJobs(ApiRequest<ResolutionAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsRoutingActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return RoutingActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingActivityResponse postAnalyticsRoutingActivityQuery(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsRoutingActivityQuery(createPostAnalyticsRoutingActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsRoutingActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return RoutingActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingActivityResponse> postAnalyticsRoutingActivityQueryWithHttpInfo(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsRoutingActivityQuery(createPostAnalyticsRoutingActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsRoutingActivityQueryRequest createPostAnalyticsRoutingActivityQueryRequest(RoutingActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsRoutingActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsRoutingActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return RoutingActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RoutingActivityResponse postAnalyticsRoutingActivityQuery(PostAnalyticsRoutingActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RoutingActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RoutingActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsRoutingActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RoutingActivityResponse> postAnalyticsRoutingActivityQuery(ApiRequest<RoutingActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RoutingActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingActivityResponse> response = (ApiResponse<RoutingActivityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RoutingActivityResponse> response = (ApiResponse<RoutingActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsSurveysAggregatesJobs(SurveyAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsSurveysAggregatesJobs(createPostAnalyticsSurveysAggregatesJobsRequest(body));
  }

  /**
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsSurveysAggregatesJobsWithHttpInfo(SurveyAsyncAggregationQuery body) throws IOException {
    return postAnalyticsSurveysAggregatesJobs(createPostAnalyticsSurveysAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsSurveysAggregatesJobsRequest createPostAnalyticsSurveysAggregatesJobsRequest(SurveyAsyncAggregationQuery body) {
    return PostAnalyticsSurveysAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsSurveysAggregatesJobs(PostAnalyticsSurveysAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsSurveysAggregatesJobs(ApiRequest<SurveyAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return SurveyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAggregateQueryResponse postAnalyticsSurveysAggregatesQuery(SurveyAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body));
  }

  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return SurveyAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAggregateQueryResponse> postAnalyticsSurveysAggregatesQueryWithHttpInfo(SurveyAggregationQuery body) throws IOException {
    return postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsSurveysAggregatesQueryRequest createPostAnalyticsSurveysAggregatesQueryRequest(SurveyAggregationQuery body) {
    return PostAnalyticsSurveysAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return SurveyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SurveyAggregateQueryResponse postAnalyticsSurveysAggregatesQuery(PostAnalyticsSurveysAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SurveyAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SurveyAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SurveyAggregateQueryResponse> postAnalyticsSurveysAggregatesQuery(ApiRequest<SurveyAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SurveyAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for task management aggregates asynchronously
   * 
   * postAnalyticsTaskmanagementAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsTaskmanagementAggregatesJobs(TaskManagementAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsTaskmanagementAggregatesJobs(createPostAnalyticsTaskmanagementAggregatesJobsRequest(body));
  }

  /**
   * Query for task management aggregates asynchronously
   * 
   * postAnalyticsTaskmanagementAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsTaskmanagementAggregatesJobsWithHttpInfo(TaskManagementAsyncAggregationQuery body) throws IOException {
    return postAnalyticsTaskmanagementAggregatesJobs(createPostAnalyticsTaskmanagementAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsTaskmanagementAggregatesJobsRequest createPostAnalyticsTaskmanagementAggregatesJobsRequest(TaskManagementAsyncAggregationQuery body) {
    return PostAnalyticsTaskmanagementAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for task management aggregates asynchronously
   * 
   * postAnalyticsTaskmanagementAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsTaskmanagementAggregatesJobs(PostAnalyticsTaskmanagementAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for task management aggregates asynchronously
   * 
   * postAnalyticsTaskmanagementAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsTaskmanagementAggregatesJobs(ApiRequest<TaskManagementAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for task management aggregates
   * 
   * postAnalyticsTaskmanagementAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return TaskManagementAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TaskManagementAggregateQueryResponse postAnalyticsTaskmanagementAggregatesQuery(TaskManagementAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsTaskmanagementAggregatesQuery(createPostAnalyticsTaskmanagementAggregatesQueryRequest(body));
  }

  /**
   * Query for task management aggregates
   * 
   * postAnalyticsTaskmanagementAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return TaskManagementAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TaskManagementAggregateQueryResponse> postAnalyticsTaskmanagementAggregatesQueryWithHttpInfo(TaskManagementAggregationQuery body) throws IOException {
    return postAnalyticsTaskmanagementAggregatesQuery(createPostAnalyticsTaskmanagementAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsTaskmanagementAggregatesQueryRequest createPostAnalyticsTaskmanagementAggregatesQueryRequest(TaskManagementAggregationQuery body) {
    return PostAnalyticsTaskmanagementAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for task management aggregates
   * 
   * postAnalyticsTaskmanagementAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return TaskManagementAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TaskManagementAggregateQueryResponse postAnalyticsTaskmanagementAggregatesQuery(PostAnalyticsTaskmanagementAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TaskManagementAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TaskManagementAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for task management aggregates
   * 
   * postAnalyticsTaskmanagementAggregatesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TaskManagementAggregateQueryResponse> postAnalyticsTaskmanagementAggregatesQuery(ApiRequest<TaskManagementAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TaskManagementAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TaskManagementAggregateQueryResponse> response = (ApiResponse<TaskManagementAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TaskManagementAggregateQueryResponse> response = (ApiResponse<TaskManagementAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for team activity observations
   * 
   * postAnalyticsTeamsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return TeamActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamActivityResponse postAnalyticsTeamsActivityQuery(TeamActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsTeamsActivityQuery(createPostAnalyticsTeamsActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for team activity observations
   * 
   * postAnalyticsTeamsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return TeamActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamActivityResponse> postAnalyticsTeamsActivityQueryWithHttpInfo(TeamActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsTeamsActivityQuery(createPostAnalyticsTeamsActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsTeamsActivityQueryRequest createPostAnalyticsTeamsActivityQueryRequest(TeamActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsTeamsActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for team activity observations
   * 
   * postAnalyticsTeamsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return TeamActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TeamActivityResponse postAnalyticsTeamsActivityQuery(PostAnalyticsTeamsActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TeamActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TeamActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for team activity observations
   * 
   * postAnalyticsTeamsActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TeamActivityResponse> postAnalyticsTeamsActivityQuery(ApiRequest<TeamActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TeamActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TeamActivityResponse> response = (ApiResponse<TeamActivityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TeamActivityResponse> response = (ApiResponse<TeamActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for transcript aggregates asynchronously
   * 
   * postAnalyticsTranscriptsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsTranscriptsAggregatesJobs(TranscriptAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsTranscriptsAggregatesJobs(createPostAnalyticsTranscriptsAggregatesJobsRequest(body));
  }

  /**
   * Query for transcript aggregates asynchronously
   * 
   * postAnalyticsTranscriptsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsTranscriptsAggregatesJobsWithHttpInfo(TranscriptAsyncAggregationQuery body) throws IOException {
    return postAnalyticsTranscriptsAggregatesJobs(createPostAnalyticsTranscriptsAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsTranscriptsAggregatesJobsRequest createPostAnalyticsTranscriptsAggregatesJobsRequest(TranscriptAsyncAggregationQuery body) {
    return PostAnalyticsTranscriptsAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for transcript aggregates asynchronously
   * 
   * postAnalyticsTranscriptsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsTranscriptsAggregatesJobs(PostAnalyticsTranscriptsAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for transcript aggregates asynchronously
   * 
   * postAnalyticsTranscriptsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsTranscriptsAggregatesJobs(ApiRequest<TranscriptAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for transcript aggregates
   * 
   * @param body query (required)
   * @return TranscriptAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptAggregateQueryResponse postAnalyticsTranscriptsAggregatesQuery(TranscriptAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsTranscriptsAggregatesQuery(createPostAnalyticsTranscriptsAggregatesQueryRequest(body));
  }

  /**
   * Query for transcript aggregates
   * 
   * @param body query (required)
   * @return TranscriptAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptAggregateQueryResponse> postAnalyticsTranscriptsAggregatesQueryWithHttpInfo(TranscriptAggregationQuery body) throws IOException {
    return postAnalyticsTranscriptsAggregatesQuery(createPostAnalyticsTranscriptsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsTranscriptsAggregatesQueryRequest createPostAnalyticsTranscriptsAggregatesQueryRequest(TranscriptAggregationQuery body) {
    return PostAnalyticsTranscriptsAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for transcript aggregates
   * 
   * @param request The request object
   * @return TranscriptAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TranscriptAggregateQueryResponse postAnalyticsTranscriptsAggregatesQuery(PostAnalyticsTranscriptsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TranscriptAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TranscriptAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for transcript aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TranscriptAggregateQueryResponse> postAnalyticsTranscriptsAggregatesQuery(ApiRequest<TranscriptAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TranscriptAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptAggregateQueryResponse> response = (ApiResponse<TranscriptAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TranscriptAggregateQueryResponse> response = (ApiResponse<TranscriptAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsUsersActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return UserActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserActivityResponse postAnalyticsUsersActivityQuery(UserActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  postAnalyticsUsersActivityQuery(createPostAnalyticsUsersActivityQueryRequest(body, pageSize, pageNumber));
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsUsersActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @param pageSize The desired page size (optional)
   * @param pageNumber The desired page number (optional)
   * @return UserActivityResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserActivityResponse> postAnalyticsUsersActivityQueryWithHttpInfo(UserActivityQuery body, Integer pageSize, Integer pageNumber) throws IOException {
    return postAnalyticsUsersActivityQuery(createPostAnalyticsUsersActivityQueryRequest(body, pageSize, pageNumber).withHttpInfo());
  }

  private PostAnalyticsUsersActivityQueryRequest createPostAnalyticsUsersActivityQueryRequest(UserActivityQuery body, Integer pageSize, Integer pageNumber) {
    return PostAnalyticsUsersActivityQueryRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .build();
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsUsersActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return UserActivityResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserActivityResponse postAnalyticsUsersActivityQuery(PostAnalyticsUsersActivityQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserActivityResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserActivityResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user activity observations
   * 
   * postAnalyticsUsersActivityQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserActivityResponse> postAnalyticsUsersActivityQuery(ApiRequest<UserActivityQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserActivityResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserActivityResponse> response = (ApiResponse<UserActivityResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserActivityResponse> response = (ApiResponse<UserActivityResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user aggregates asynchronously
   * 
   * postAnalyticsUsersAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersAggregatesJobs(UserAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersAggregatesJobs(createPostAnalyticsUsersAggregatesJobsRequest(body));
  }

  /**
   * Query for user aggregates asynchronously
   * 
   * postAnalyticsUsersAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersAggregatesJobsWithHttpInfo(UserAsyncAggregationQuery body) throws IOException {
    return postAnalyticsUsersAggregatesJobs(createPostAnalyticsUsersAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersAggregatesJobsRequest createPostAnalyticsUsersAggregatesJobsRequest(UserAsyncAggregationQuery body) {
    return PostAnalyticsUsersAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for user aggregates asynchronously
   * 
   * postAnalyticsUsersAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersAggregatesJobs(PostAnalyticsUsersAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user aggregates asynchronously
   * 
   * postAnalyticsUsersAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersAggregatesJobs(ApiRequest<UserAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return UserAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAggregateQueryResponse postAnalyticsUsersAggregatesQuery(UserAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body));
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return UserAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAggregateQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(UserAggregationQuery body) throws IOException {
    return postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersAggregatesQueryRequest createPostAnalyticsUsersAggregatesQueryRequest(UserAggregationQuery body) {
    return PostAnalyticsUsersAggregatesQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return UserAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserAggregateQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserAggregateQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<UserAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersDetailsJobs(AsyncUserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsJobs(createPostAnalyticsUsersDetailsJobsRequest(body));
  }

  /**
   * Query for user details asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersDetailsJobsWithHttpInfo(AsyncUserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsJobs(createPostAnalyticsUsersDetailsJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsJobsRequest createPostAnalyticsUsersDetailsJobsRequest(AsyncUserDetailsQuery body) {
    return PostAnalyticsUsersDetailsJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for user details asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsUsersDetailsJobs(PostAnalyticsUsersDetailsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user details asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsUsersDetailsJobs(ApiRequest<AsyncUserDetailsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body));
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsQueryRequest createPostAnalyticsUsersDetailsQueryRequest(UserDetailsQuery body) {
    return PostAnalyticsUsersDetailsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return UserObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserObservationQueryResponse postAnalyticsUsersObservationsQuery(UserObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body));
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return UserObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(UserObservationQuery body) throws IOException {
    return postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersObservationsQueryRequest createPostAnalyticsUsersObservationsQueryRequest(UserObservationQuery body) {
    return PostAnalyticsUsersObservationsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return UserObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<UserObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update analytics data retention setting
   * 
   * @param body retentionDays (required)
   * @return AnalyticsDataRetentionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsDataRetentionResponse putAnalyticsDataretentionSettings(UpdateAnalyticsDataRetentionRequest body) throws IOException, ApiException {
    return  putAnalyticsDataretentionSettings(createPutAnalyticsDataretentionSettingsRequest(body));
  }

  /**
   * Update analytics data retention setting
   * 
   * @param body retentionDays (required)
   * @return AnalyticsDataRetentionResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsDataRetentionResponse> putAnalyticsDataretentionSettingsWithHttpInfo(UpdateAnalyticsDataRetentionRequest body) throws IOException {
    return putAnalyticsDataretentionSettings(createPutAnalyticsDataretentionSettingsRequest(body).withHttpInfo());
  }

  private PutAnalyticsDataretentionSettingsRequest createPutAnalyticsDataretentionSettingsRequest(UpdateAnalyticsDataRetentionRequest body) {
    return PutAnalyticsDataretentionSettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update analytics data retention setting
   * 
   * @param request The request object
   * @return AnalyticsDataRetentionResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsDataRetentionResponse putAnalyticsDataretentionSettings(PutAnalyticsDataretentionSettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsDataRetentionResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsDataRetentionResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update analytics data retention setting
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsDataRetentionResponse> putAnalyticsDataretentionSettings(ApiRequest<UpdateAnalyticsDataRetentionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsDataRetentionResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsDataRetentionResponse> response = (ApiResponse<AnalyticsDataRetentionResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsDataRetentionResponse> response = (ApiResponse<AnalyticsDataRetentionResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a scheduled report job.
   * This route is deprecated, please use PATCH:api/v2/analytics/reporting/exports/{exportId}/schedule instead
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ReportSchedule putAnalyticsReportingSchedule(String scheduleId, ReportSchedule body) throws IOException, ApiException {
    return  putAnalyticsReportingSchedule(createPutAnalyticsReportingScheduleRequest(scheduleId, body));
  }

  /**
   * Update a scheduled report job.
   * This route is deprecated, please use PATCH:api/v2/analytics/reporting/exports/{exportId}/schedule instead
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingScheduleWithHttpInfo(String scheduleId, ReportSchedule body) throws IOException {
    return putAnalyticsReportingSchedule(createPutAnalyticsReportingScheduleRequest(scheduleId, body).withHttpInfo());
  }

  private PutAnalyticsReportingScheduleRequest createPutAnalyticsReportingScheduleRequest(String scheduleId, ReportSchedule body) {
    return PutAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)

            .withBody(body)

            .build();
  }

  /**
   * Update a scheduled report job.
   * This route is deprecated, please use PATCH:api/v2/analytics/reporting/exports/{exportId}/schedule instead
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ReportSchedule putAnalyticsReportingSchedule(PutAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a scheduled report job.
   * This route is deprecated, please use PATCH:api/v2/analytics/reporting/exports/{exportId}/schedule instead
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   * @deprecated
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingSchedule(ApiRequest<ReportSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
