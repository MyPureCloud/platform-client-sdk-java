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
import com.mypurecloud.sdk.v2.model.ReportingTurnsResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.DataAvailabilityResponse;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
import com.mypurecloud.sdk.v2.model.ReportingExportMetadataJobListing;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.BotAggregationQuery;
import com.mypurecloud.sdk.v2.model.BotAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.ConversationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.QueueObservationQuery;
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.TranscriptAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.TranscriptAggregationQuery;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.AsyncUserDetailsQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsBotflowReportingturnsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsJobsAvailabilityRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingTimeperiodsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsUsersDetailsJobsAvailabilityRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsBotsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationDetailsPropertiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsTranscriptsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingScheduleRunreportRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsTranscriptsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
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
   * Delete/cancel an async request
   * 
   * @param jobId jobId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsConversationsDetailsJob(String jobId) throws IOException, ApiException {
     deleteAnalyticsConversationsDetailsJob(createDeleteAnalyticsConversationsDetailsJobRequest(jobId));
  }

  /**
   * Delete/cancel an async request
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
   * Delete/cancel an async request
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
   * Delete/cancel an async request
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
   * Get Reporting Turns.
   * 
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param actionId Optional action ID to get the reporting turns associated to a particular flow action (optional)
   * @param sessionId Optional session ID to get the reporting turns for a particular session (optional)
   * @return ReportingTurnsResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingTurnsResponse getAnalyticsBotflowReportingturns(String botFlowId, String after, String pageSize, String actionId, String sessionId) throws IOException, ApiException {
    return  getAnalyticsBotflowReportingturns(createGetAnalyticsBotflowReportingturnsRequest(botFlowId, after, pageSize, actionId, sessionId));
  }

  /**
   * Get Reporting Turns.
   * 
   * @param botFlowId ID of the bot flow. (required)
   * @param after The cursor that points to the ID of the last item in the list of entities that has been returned. (optional)
   * @param pageSize Max number of entities to return. Maximum of 250 (optional, default to 50)
   * @param actionId Optional action ID to get the reporting turns associated to a particular flow action (optional)
   * @param sessionId Optional session ID to get the reporting turns for a particular session (optional)
   * @return ReportingTurnsResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingTurnsResponse> getAnalyticsBotflowReportingturnsWithHttpInfo(String botFlowId, String after, String pageSize, String actionId, String sessionId) throws IOException {
    return getAnalyticsBotflowReportingturns(createGetAnalyticsBotflowReportingturnsRequest(botFlowId, after, pageSize, actionId, sessionId).withHttpInfo());
  }

  private GetAnalyticsBotflowReportingturnsRequest createGetAnalyticsBotflowReportingturnsRequest(String botFlowId, String after, String pageSize, String actionId, String sessionId) {
    return GetAnalyticsBotflowReportingturnsRequest.builder()
            .withBotFlowId(botFlowId)
    
            .withAfter(after)
    
            .withPageSize(pageSize)
    
            .withActionId(actionId)
    
            .withSessionId(sessionId)
    
            .build();
  }

  /**
   * Get Reporting Turns.
   * 
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
   * 
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
   * Fetch a page of results for an async query
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
   * Fetch a page of results for an async query
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
   * Fetch a page of results for an async query
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
   * Fetch a page of results for an async query
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
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(String scheduleId) throws IOException, ApiException {
    return  postAnalyticsReportingScheduleRunreport(createPostAnalyticsReportingScheduleRunreportRequest(scheduleId));
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws IOException if the request fails to be processed
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
   * 
   * @param request The request object
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule postAnalyticsReportingSchedules(ReportSchedule body) throws IOException, ApiException {
    return  postAnalyticsReportingSchedules(createPostAnalyticsReportingSchedulesRequest(body));
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
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
   * Create a scheduled report job.
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * Create a scheduled report job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule putAnalyticsReportingSchedule(String scheduleId, ReportSchedule body) throws IOException, ApiException {
    return  putAnalyticsReportingSchedule(createPutAnalyticsReportingScheduleRequest(scheduleId, body));
  }

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
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
   * 
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
