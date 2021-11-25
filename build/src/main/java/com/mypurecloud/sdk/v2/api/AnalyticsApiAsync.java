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
import java.util.concurrent.Future;


public class AnalyticsApiAsync {
  private final ApiClient pcapiClient;

  public AnalyticsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete/cancel an async request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAnalyticsConversationsDetailsJobAsync(DeleteAnalyticsConversationsDetailsJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete/cancel an async request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAnalyticsConversationsDetailsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAnalyticsReportingScheduleAsync(DeleteAnalyticsReportingScheduleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAnalyticsReportingScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete/cancel an async request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAnalyticsUsersDetailsJobAsync(DeleteAnalyticsUsersDetailsJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete/cancel an async request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAnalyticsUsersDetailsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get Reporting Turns.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportingTurnsResponse> getAnalyticsBotflowReportingturnsAsync(GetAnalyticsBotflowReportingturnsRequest request, final AsyncApiCallback<ReportingTurnsResponse> callback) {
    try {
      final SettableFuture<ReportingTurnsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportingTurnsResponse>() {}, new AsyncApiCallback<ApiResponse<ReportingTurnsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingTurnsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Reporting Turns.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportingTurnsResponse>> getAnalyticsBotflowReportingturnsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportingTurnsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportingTurnsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportingTurnsResponse>() {}, new AsyncApiCallback<ApiResponse<ReportingTurnsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingTurnsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingTurnsResponse> response = (ApiResponse<ReportingTurnsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingTurnsResponse> response = (ApiResponse<ReportingTurnsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationWithoutAttributes> getAnalyticsConversationDetailsAsync(GetAnalyticsConversationDetailsRequest request, final AsyncApiCallback<AnalyticsConversationWithoutAttributes> callback) {
    try {
      final SettableFuture<AnalyticsConversationWithoutAttributes> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributes>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributes>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributes> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationWithoutAttributes>> getAnalyticsConversationDetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributes>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationWithoutAttributes>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationWithoutAttributes>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributes>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributes> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributes> response = (ApiResponse<AnalyticsConversationWithoutAttributes>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Gets multiple conversations by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationWithoutAttributesMultiGetResponse> getAnalyticsConversationsDetailsAsync(GetAnalyticsConversationsDetailsRequest request, final AsyncApiCallback<AnalyticsConversationWithoutAttributesMultiGetResponse> callback) {
    try {
      final SettableFuture<AnalyticsConversationWithoutAttributesMultiGetResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> getAnalyticsConversationsDetailsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get status for async query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getAnalyticsConversationsDetailsJobAsync(GetAnalyticsConversationsDetailsJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
    try {
      final SettableFuture<AsyncQueryStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status for async query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getAnalyticsConversationsDetailsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Fetch a page of results for an async query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationAsyncQueryResponse> getAnalyticsConversationsDetailsJobResultsAsync(GetAnalyticsConversationsDetailsJobResultsRequest request, final AsyncApiCallback<AnalyticsConversationAsyncQueryResponse> callback) {
    try {
      final SettableFuture<AnalyticsConversationAsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationAsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationAsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationAsyncQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationAsyncQueryResponse>> getAnalyticsConversationsDetailsJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationAsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationAsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationAsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationAsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationAsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationAsyncQueryResponse> response = (ApiResponse<AnalyticsConversationAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Lookup the datalake availability date and time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataAvailabilityResponse> getAnalyticsConversationsDetailsJobsAvailabilityAsync(GetAnalyticsConversationsDetailsJobsAvailabilityRequest request, final AsyncApiCallback<DataAvailabilityResponse> callback) {
    try {
      final SettableFuture<DataAvailabilityResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataAvailabilityResponse>() {}, new AsyncApiCallback<ApiResponse<DataAvailabilityResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DataAvailabilityResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataAvailabilityResponse>> getAnalyticsConversationsDetailsJobsAvailabilityAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataAvailabilityResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DataAvailabilityResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataAvailabilityResponse>() {}, new AsyncApiCallback<ApiResponse<DataAvailabilityResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DataAvailabilityResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get all view export requests for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportingExportJobListing> getAnalyticsReportingExportsAsync(GetAnalyticsReportingExportsRequest request, final AsyncApiCallback<ReportingExportJobListing> callback) {
    try {
      final SettableFuture<ReportingExportJobListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportingExportJobListing>() {}, new AsyncApiCallback<ApiResponse<ReportingExportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportJobListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all view export requests for a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportingExportJobListing>> getAnalyticsReportingExportsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportingExportJobListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportingExportJobListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportingExportJobListing>() {}, new AsyncApiCallback<ApiResponse<ReportingExportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportJobListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get all export metadata
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportingExportMetadataJobListing> getAnalyticsReportingExportsMetadataAsync(GetAnalyticsReportingExportsMetadataRequest request, final AsyncApiCallback<ReportingExportMetadataJobListing> callback) {
    try {
      final SettableFuture<ReportingExportMetadataJobListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportingExportMetadataJobListing>() {}, new AsyncApiCallback<ApiResponse<ReportingExportMetadataJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportMetadataJobListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all export metadata
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportingExportMetadataJobListing>> getAnalyticsReportingExportsMetadataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportingExportMetadataJobListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportingExportMetadataJobListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportingExportMetadataJobListing>() {}, new AsyncApiCallback<ApiResponse<ReportingExportMetadataJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportMetadataJobListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportMetadataJobListing> response = (ApiResponse<ReportingExportMetadataJobListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportMetadataJobListing> response = (ApiResponse<ReportingExportMetadataJobListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get list of reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportMetaDataEntityListing> getAnalyticsReportingMetadataAsync(GetAnalyticsReportingMetadataRequest request, final AsyncApiCallback<ReportMetaDataEntityListing> callback) {
    try {
      final SettableFuture<ReportMetaDataEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaDataEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportMetaDataEntityListing>> getAnalyticsReportingMetadataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportMetaDataEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportMetaDataEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaDataEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportMetaData> getAnalyticsReportingReportIdMetadataAsync(GetAnalyticsReportingReportIdMetadataRequest request, final AsyncApiCallback<ReportMetaData> callback) {
    try {
      final SettableFuture<ReportMetaData> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportMetaData>() {}, new AsyncApiCallback<ApiResponse<ReportMetaData>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaData> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportMetaData>> getAnalyticsReportingReportIdMetadataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportMetaData>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportMetaData>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportMetaData>() {}, new AsyncApiCallback<ApiResponse<ReportMetaData>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaData> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> getAnalyticsReportingReportformatsAsync(GetAnalyticsReportingReportformatsRequest request, final AsyncApiCallback<List<String>> callback) {
    try {
      final SettableFuture<List<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingReportformatsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> getAnalyticsReportingScheduleAsync(GetAnalyticsReportingScheduleRequest request, final AsyncApiCallback<ReportSchedule> callback) {
    try {
      final SettableFuture<ReportSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> getAnalyticsReportingScheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryAsync(GetAnalyticsReportingScheduleHistoryRequest request, final AsyncApiCallback<ReportRunEntryEntityDomainListing> callback) {
    try {
      final SettableFuture<ReportRunEntryEntityDomainListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntryEntityDomainListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntryEntityDomainListing>> getAnalyticsReportingScheduleHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportRunEntryEntityDomainListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntryEntityDomainListing>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntryEntityDomainListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestAsync(GetAnalyticsReportingScheduleHistoryLatestRequest request, final AsyncApiCallback<ReportRunEntry> callback) {
    try {
      final SettableFuture<ReportRunEntry> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryLatestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportRunEntry>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdAsync(GetAnalyticsReportingScheduleHistoryRunIdRequest request, final AsyncApiCallback<ReportRunEntry> callback) {
    try {
      final SettableFuture<ReportRunEntry> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryRunIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportRunEntry>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportScheduleEntityListing> getAnalyticsReportingSchedulesAsync(GetAnalyticsReportingSchedulesRequest request, final AsyncApiCallback<ReportScheduleEntityListing> callback) {
    try {
      final SettableFuture<ReportScheduleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportScheduleEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportScheduleEntityListing>> getAnalyticsReportingSchedulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportScheduleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportScheduleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of report time periods.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> getAnalyticsReportingTimeperiodsAsync(GetAnalyticsReportingTimeperiodsRequest request, final AsyncApiCallback<List<String>> callback) {
    try {
      final SettableFuture<List<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingTimeperiodsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get status for async query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getAnalyticsUsersDetailsJobAsync(GetAnalyticsUsersDetailsJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
    try {
      final SettableFuture<AsyncQueryStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status for async query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getAnalyticsUsersDetailsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Fetch a page of results for an async query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsUserDetailsAsyncQueryResponse> getAnalyticsUsersDetailsJobResultsAsync(GetAnalyticsUsersDetailsJobResultsRequest request, final AsyncApiCallback<AnalyticsUserDetailsAsyncQueryResponse> callback) {
    try {
      final SettableFuture<AnalyticsUserDetailsAsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a page of results for an async query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>> getAnalyticsUsersDetailsJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsUserDetailsAsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsAsyncQueryResponse> response = (ApiResponse<AnalyticsUserDetailsAsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Lookup the datalake availability date and time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataAvailabilityResponse> getAnalyticsUsersDetailsJobsAvailabilityAsync(GetAnalyticsUsersDetailsJobsAvailabilityRequest request, final AsyncApiCallback<DataAvailabilityResponse> callback) {
    try {
      final SettableFuture<DataAvailabilityResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataAvailabilityResponse>() {}, new AsyncApiCallback<ApiResponse<DataAvailabilityResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DataAvailabilityResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Lookup the datalake availability date and time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataAvailabilityResponse>> getAnalyticsUsersDetailsJobsAvailabilityAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataAvailabilityResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DataAvailabilityResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataAvailabilityResponse>() {}, new AsyncApiCallback<ApiResponse<DataAvailabilityResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DataAvailabilityResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataAvailabilityResponse> response = (ApiResponse<DataAvailabilityResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for bot aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BotAggregateQueryResponse> postAnalyticsBotsAggregatesQueryAsync(PostAnalyticsBotsAggregatesQueryRequest request, final AsyncApiCallback<BotAggregateQueryResponse> callback) {
    try {
      final SettableFuture<BotAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BotAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<BotAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BotAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for bot aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BotAggregateQueryResponse>> postAnalyticsBotsAggregatesQueryAsync(ApiRequest<BotAggregationQuery> request, final AsyncApiCallback<ApiResponse<BotAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BotAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BotAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<BotAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BotAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BotAggregateQueryResponse> response = (ApiResponse<BotAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BotAggregateQueryResponse> response = (ApiResponse<BotAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesAsync(PostAnalyticsConversationDetailsPropertiesRequest request, final AsyncApiCallback<PropertyIndexRequest> callback) {
    try {
      final SettableFuture<PropertyIndexRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PropertyIndexRequest>> postAnalyticsConversationDetailsPropertiesAsync(ApiRequest<PropertyIndexRequest> request, final AsyncApiCallback<ApiResponse<PropertyIndexRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<PropertyIndexRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConversationAggregateQueryResponse> postAnalyticsConversationsAggregatesQueryAsync(PostAnalyticsConversationsAggregatesQueryRequest request, final AsyncApiCallback<ConversationAggregateQueryResponse> callback) {
    try {
      final SettableFuture<ConversationAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConversationAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ConversationAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConversationAggregateQueryResponse>> postAnalyticsConversationsAggregatesQueryAsync(ApiRequest<ConversationAggregationQuery> request, final AsyncApiCallback<ApiResponse<ConversationAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ConversationAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConversationAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ConversationAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationAggregateQueryResponse> response = (ApiResponse<ConversationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for conversation details asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postAnalyticsConversationsDetailsJobsAsync(PostAnalyticsConversationsDetailsJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
    try {
      final SettableFuture<AsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postAnalyticsConversationsDetailsJobsAsync(ApiRequest<AsyncConversationQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryAsync(PostAnalyticsConversationsDetailsQueryRequest request, final AsyncApiCallback<AnalyticsConversationQueryResponse> callback) {
    try {
      final SettableFuture<AnalyticsConversationQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationQueryResponse>> postAnalyticsConversationsDetailsQueryAsync(ApiRequest<ConversationQuery> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQueryAsync(PostAnalyticsConversationsTranscriptsQueryRequest request, final AsyncApiCallback<AnalyticsConversationWithoutAttributesMultiGetResponse> callback) {
    try {
      final SettableFuture<AnalyticsConversationWithoutAttributesMultiGetResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> postAnalyticsConversationsTranscriptsQueryAsync(ApiRequest<TranscriptConversationDetailSearchRequest> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for evaluation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationAggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryAsync(PostAnalyticsEvaluationsAggregatesQueryRequest request, final AsyncApiCallback<EvaluationAggregateQueryResponse> callback) {
    try {
      final SettableFuture<EvaluationAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationAggregateQueryResponse>> postAnalyticsEvaluationsAggregatesQueryAsync(ApiRequest<EvaluationAggregationQuery> request, final AsyncApiCallback<ApiResponse<EvaluationAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationAggregateQueryResponse> response = (ApiResponse<EvaluationAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for flow aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQueryAsync(PostAnalyticsFlowsAggregatesQueryRequest request, final AsyncApiCallback<FlowAggregateQueryResponse> callback) {
    try {
      final SettableFuture<FlowAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowAggregateQueryResponse>> postAnalyticsFlowsAggregatesQueryAsync(ApiRequest<FlowAggregationQuery> request, final AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for flow observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQueryAsync(PostAnalyticsFlowsObservationsQueryRequest request, final AsyncApiCallback<FlowObservationQueryResponse> callback) {
    try {
      final SettableFuture<FlowObservationQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowObservationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for flow observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowObservationQueryResponse>> postAnalyticsFlowsObservationsQueryAsync(ApiRequest<FlowObservationQuery> request, final AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowObservationQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for journey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQueryAsync(PostAnalyticsJourneysAggregatesQueryRequest request, final AsyncApiCallback<JourneyAggregateQueryResponse> callback) {
    try {
      final SettableFuture<JourneyAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for journey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyAggregateQueryResponse>> postAnalyticsJourneysAggregatesQueryAsync(ApiRequest<JourneyAggregationQuery> request, final AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QueueObservationQueryResponse> postAnalyticsQueuesObservationsQueryAsync(PostAnalyticsQueuesObservationsQueryRequest request, final AsyncApiCallback<QueueObservationQueryResponse> callback) {
    try {
      final SettableFuture<QueueObservationQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QueueObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QueueObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueueObservationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QueueObservationQueryResponse>> postAnalyticsQueuesObservationsQueryAsync(ApiRequest<QueueObservationQuery> request, final AsyncApiCallback<ApiResponse<QueueObservationQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QueueObservationQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QueueObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QueueObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QueueObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QueueObservationQueryResponse> response = (ApiResponse<QueueObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportingExportJobResponse> postAnalyticsReportingExportsAsync(PostAnalyticsReportingExportsRequest request, final AsyncApiCallback<ReportingExportJobResponse> callback) {
    try {
      final SettableFuture<ReportingExportJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportingExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ReportingExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Generate a view export request
   * This API creates a reporting export but the desired way to export analytics data is to use the analytics query APIs instead
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportingExportJobResponse>> postAnalyticsReportingExportsAsync(ApiRequest<ReportingExportJobRequest> request, final AsyncApiCallback<ApiResponse<ReportingExportJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportingExportJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportingExportJobResponse>() {}, new AsyncApiCallback<ApiResponse<ReportingExportJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ReportingExportJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RunNowResponse> postAnalyticsReportingScheduleRunreportAsync(PostAnalyticsReportingScheduleRunreportRequest request, final AsyncApiCallback<RunNowResponse> callback) {
    try {
      final SettableFuture<RunNowResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RunNowResponse>() {}, new AsyncApiCallback<ApiResponse<RunNowResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RunNowResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RunNowResponse>> postAnalyticsReportingScheduleRunreportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RunNowResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<RunNowResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RunNowResponse>() {}, new AsyncApiCallback<ApiResponse<RunNowResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RunNowResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> postAnalyticsReportingSchedulesAsync(PostAnalyticsReportingSchedulesRequest request, final AsyncApiCallback<ReportSchedule> callback) {
    try {
      final SettableFuture<ReportSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> postAnalyticsReportingSchedulesAsync(ApiRequest<ReportSchedule> request, final AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for survey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyAggregateQueryResponse> postAnalyticsSurveysAggregatesQueryAsync(PostAnalyticsSurveysAggregatesQueryRequest request, final AsyncApiCallback<SurveyAggregateQueryResponse> callback) {
    try {
      final SettableFuture<SurveyAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SurveyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for survey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyAggregateQueryResponse>> postAnalyticsSurveysAggregatesQueryAsync(ApiRequest<SurveyAggregationQuery> request, final AsyncApiCallback<ApiResponse<SurveyAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SurveyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyAggregateQueryResponse> response = (ApiResponse<SurveyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for transcript aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TranscriptAggregateQueryResponse> postAnalyticsTranscriptsAggregatesQueryAsync(PostAnalyticsTranscriptsAggregatesQueryRequest request, final AsyncApiCallback<TranscriptAggregateQueryResponse> callback) {
    try {
      final SettableFuture<TranscriptAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TranscriptAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<TranscriptAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for transcript aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TranscriptAggregateQueryResponse>> postAnalyticsTranscriptsAggregatesQueryAsync(ApiRequest<TranscriptAggregationQuery> request, final AsyncApiCallback<ApiResponse<TranscriptAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TranscriptAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TranscriptAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<TranscriptAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptAggregateQueryResponse> response = (ApiResponse<TranscriptAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptAggregateQueryResponse> response = (ApiResponse<TranscriptAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for user aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserAggregateQueryResponse> postAnalyticsUsersAggregatesQueryAsync(PostAnalyticsUsersAggregatesQueryRequest request, final AsyncApiCallback<UserAggregateQueryResponse> callback) {
    try {
      final SettableFuture<UserAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UserAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UserAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserAggregateQueryResponse>> postAnalyticsUsersAggregatesQueryAsync(ApiRequest<UserAggregationQuery> request, final AsyncApiCallback<ApiResponse<UserAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UserAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UserAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UserAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAggregateQueryResponse> response = (ApiResponse<UserAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for user details asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postAnalyticsUsersDetailsJobsAsync(PostAnalyticsUsersDetailsJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
    try {
      final SettableFuture<AsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user details asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postAnalyticsUsersDetailsJobsAsync(ApiRequest<AsyncUserDetailsQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryAsync(PostAnalyticsUsersDetailsQueryRequest request, final AsyncApiCallback<AnalyticsUserDetailsQueryResponse> callback) {
    try {
      final SettableFuture<AnalyticsUserDetailsQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsUserDetailsQueryResponse>> postAnalyticsUsersDetailsQueryAsync(ApiRequest<UserDetailsQuery> request, final AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsUserDetailsQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for user observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserObservationQueryResponse> postAnalyticsUsersObservationsQueryAsync(PostAnalyticsUsersObservationsQueryRequest request, final AsyncApiCallback<UserObservationQueryResponse> callback) {
    try {
      final SettableFuture<UserObservationQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UserObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UserObservationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserObservationQueryResponse>> postAnalyticsUsersObservationsQueryAsync(ApiRequest<UserObservationQuery> request, final AsyncApiCallback<ApiResponse<UserObservationQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UserObservationQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UserObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UserObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserObservationQueryResponse> response = (ApiResponse<UserObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> putAnalyticsReportingScheduleAsync(PutAnalyticsReportingScheduleRequest request, final AsyncApiCallback<ReportSchedule> callback) {
    try {
      final SettableFuture<ReportSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> putAnalyticsReportingScheduleAsync(ApiRequest<ReportSchedule> request, final AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
