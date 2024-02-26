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

import com.mypurecloud.sdk.v2.model.ActionEventRequest;
import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateRequest;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateResult;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.AddressableEntityListing;
import com.mypurecloud.sdk.v2.model.AppEventRequest;
import com.mypurecloud.sdk.v2.model.AppEventResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DeploymentPing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.FlowPaths;
import com.mypurecloud.sdk.v2.model.FlowPathsQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.JourneySegmentRequest;
import com.mypurecloud.sdk.v2.model.JourneyView;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;


import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomesPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyViewRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactJourneySessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyDeploymentCustomerPingRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesAttributionsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesAttributionsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionEventsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionOutcomescoresRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActionmapsEstimatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyDeploymentActioneventRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyDeploymentAppeventsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyFlowsPathsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesAttributionsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class JourneyApiAsync {
  private final ApiClient pcapiClient;

  public JourneyApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public JourneyApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneyActionmapAsync(DeleteJourneyActionmapRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneyActionmapAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneyActiontemplateAsync(DeleteJourneyActiontemplateRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneyActiontemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneyOutcomeAsync(DeleteJourneyOutcomeRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneyOutcomeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete an outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneyOutcomesPredictorAsync(DeleteJourneyOutcomesPredictorRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneyOutcomesPredictorAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneySegmentAsync(DeleteJourneySegmentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneySegmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Journey View by ID
   * deletes all versions
   * deleteJourneyView is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteJourneyViewAsync(DeleteJourneyViewRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Journey View by ID
   * deletes all versions
   * deleteJourneyView is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteJourneyViewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getAnalyticsJourneysAggregatesJobAsync(GetAnalyticsJourneysAggregatesJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
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
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getAnalyticsJourneysAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
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
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyAsyncAggregateQueryResponse> getAnalyticsJourneysAggregatesJobResultsAsync(GetAnalyticsJourneysAggregatesJobResultsRequest request, final AsyncApiCallback<JourneyAsyncAggregateQueryResponse> callback) {
    try {
      final SettableFuture<JourneyAsyncAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyAsyncAggregateQueryResponse>> getAnalyticsJourneysAggregatesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JourneyAsyncAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyAsyncAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SessionListing> getExternalcontactsContactJourneySessionsAsync(GetExternalcontactsContactJourneySessionsRequest request, final AsyncApiCallback<SessionListing> callback) {
    try {
      final SettableFuture<SessionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SessionListing>() {}, new AsyncApiCallback<ApiResponse<SessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<SessionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SessionListing>> getExternalcontactsContactJourneySessionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SessionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SessionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SessionListing>() {}, new AsyncApiCallback<ApiResponse<SessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<SessionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionMap> getJourneyActionmapAsync(GetJourneyActionmapRequest request, final AsyncApiCallback<ActionMap> callback) {
    try {
      final SettableFuture<ActionMap> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionMap>> getJourneyActionmapAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionMap>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionMap>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action maps.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionMapListing> getJourneyActionmapsAsync(GetJourneyActionmapsRequest request, final AsyncApiCallback<ActionMapListing> callback) {
    try {
      final SettableFuture<ActionMapListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionMapListing>() {}, new AsyncApiCallback<ApiResponse<ActionMapListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMapListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action maps.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionMapListing>> getJourneyActionmapsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionMapListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionMapListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionMapListing>() {}, new AsyncApiCallback<ApiResponse<ActionMapListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMapListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMapListing> response = (ApiResponse<ActionMapListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMapListing> response = (ApiResponse<ActionMapListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> getJourneyActionmapsEstimatesJobAsync(GetJourneyActionmapsEstimatesJobRequest request, final AsyncApiCallback<String> callback) {
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
   * Get status of job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> getJourneyActionmapsEstimatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<String>> callback) {
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
   * Get estimates from completed job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionMapEstimateResult> getJourneyActionmapsEstimatesJobResultsAsync(GetJourneyActionmapsEstimatesJobResultsRequest request, final AsyncApiCallback<ActionMapEstimateResult> callback) {
    try {
      final SettableFuture<ActionMapEstimateResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionMapEstimateResult>() {}, new AsyncApiCallback<ApiResponse<ActionMapEstimateResult>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMapEstimateResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get estimates from completed job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionMapEstimateResult>> getJourneyActionmapsEstimatesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionMapEstimateResult>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionMapEstimateResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionMapEstimateResult>() {}, new AsyncApiCallback<ApiResponse<ActionMapEstimateResult>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMapEstimateResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMapEstimateResult> response = (ApiResponse<ActionMapEstimateResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMapEstimateResult> response = (ApiResponse<ActionMapEstimateResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTarget> getJourneyActiontargetAsync(GetJourneyActiontargetRequest request, final AsyncApiCallback<ActionTarget> callback) {
    try {
      final SettableFuture<ActionTarget> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTarget>> getJourneyActiontargetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTarget>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTarget>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action targets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTargetListing> getJourneyActiontargetsAsync(GetJourneyActiontargetsRequest request, final AsyncApiCallback<ActionTargetListing> callback) {
    try {
      final SettableFuture<ActionTargetListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTargetListing>() {}, new AsyncApiCallback<ApiResponse<ActionTargetListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTargetListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action targets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTargetListing>> getJourneyActiontargetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTargetListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTargetListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTargetListing>() {}, new AsyncApiCallback<ApiResponse<ActionTargetListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTargetListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTemplate> getJourneyActiontemplateAsync(GetJourneyActiontemplateRequest request, final AsyncApiCallback<ActionTemplate> callback) {
    try {
      final SettableFuture<ActionTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTemplate>> getJourneyActiontemplateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTemplateListing> getJourneyActiontemplatesAsync(GetJourneyActiontemplatesRequest request, final AsyncApiCallback<ActionTemplateListing> callback) {
    try {
      final SettableFuture<ActionTemplateListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTemplateListing>() {}, new AsyncApiCallback<ApiResponse<ActionTemplateListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplateListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action templates.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTemplateListing>> getJourneyActiontemplatesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTemplateListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTemplateListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTemplateListing>() {}, new AsyncApiCallback<ApiResponse<ActionTemplateListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplateListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplateListing> response = (ApiResponse<ActionTemplateListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplateListing> response = (ApiResponse<ActionTemplateListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send a ping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DeploymentPing> getJourneyDeploymentCustomerPingAsync(GetJourneyDeploymentCustomerPingRequest request, final AsyncApiCallback<DeploymentPing> callback) {
    try {
      final SettableFuture<DeploymentPing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DeploymentPing>() {}, new AsyncApiCallback<ApiResponse<DeploymentPing>>() {
        @Override
        public void onCompleted(ApiResponse<DeploymentPing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send a ping.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DeploymentPing>> getJourneyDeploymentCustomerPingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DeploymentPing>> callback) {
    try {
      final SettableFuture<ApiResponse<DeploymentPing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DeploymentPing>() {}, new AsyncApiCallback<ApiResponse<DeploymentPing>>() {
        @Override
        public void onCompleted(ApiResponse<DeploymentPing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DeploymentPing> response = (ApiResponse<DeploymentPing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DeploymentPing> response = (ApiResponse<DeploymentPing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Outcome> getJourneyOutcomeAsync(GetJourneyOutcomeRequest request, final AsyncApiCallback<Outcome> callback) {
    try {
      final SettableFuture<Outcome> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Outcome>> getJourneyOutcomeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Outcome>> callback) {
    try {
      final SettableFuture<ApiResponse<Outcome>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all outcomes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomeListing> getJourneyOutcomesAsync(GetJourneyOutcomesRequest request, final AsyncApiCallback<OutcomeListing> callback) {
    try {
      final SettableFuture<OutcomeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomeListing>() {}, new AsyncApiCallback<ApiResponse<OutcomeListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all outcomes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomeListing>> getJourneyOutcomesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomeListing>() {}, new AsyncApiCallback<ApiResponse<OutcomeListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeListing> response = (ApiResponse<OutcomeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeListing> response = (ApiResponse<OutcomeListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job status.
   * 
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomeAttributionJobStateResponse> getJourneyOutcomesAttributionsJobAsync(GetJourneyOutcomesAttributionsJobRequest request, final AsyncApiCallback<OutcomeAttributionJobStateResponse> callback) {
    try {
      final SettableFuture<OutcomeAttributionJobStateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomeAttributionJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionJobStateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job status.
   * 
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomeAttributionJobStateResponse>> getJourneyOutcomesAttributionsJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomeAttributionJobStateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomeAttributionJobStateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomeAttributionJobStateResponse>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionJobStateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionJobStateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionJobStateResponse> response = (ApiResponse<OutcomeAttributionJobStateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionJobStateResponse> response = (ApiResponse<OutcomeAttributionJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomeAttributionResponseListing> getJourneyOutcomesAttributionsJobResultsAsync(GetJourneyOutcomesAttributionsJobResultsRequest request, final AsyncApiCallback<OutcomeAttributionResponseListing> callback) {
    try {
      final SettableFuture<OutcomeAttributionResponseListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomeAttributionResponseListing>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionResponseListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomeAttributionResponseListing>> getJourneyOutcomesAttributionsJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomeAttributionResponseListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomeAttributionResponseListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomeAttributionResponseListing>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionResponseListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionResponseListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionResponseListing> response = (ApiResponse<OutcomeAttributionResponseListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionResponseListing> response = (ApiResponse<OutcomeAttributionResponseListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomePredictor> getJourneyOutcomesPredictorAsync(GetJourneyOutcomesPredictorRequest request, final AsyncApiCallback<OutcomePredictor> callback) {
    try {
      final SettableFuture<OutcomePredictor> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomePredictor>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictor>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictor> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomePredictor>> getJourneyOutcomesPredictorAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomePredictor>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomePredictor>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomePredictor>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictor>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictor> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomePredictorListing> getJourneyOutcomesPredictorsAsync(GetJourneyOutcomesPredictorsRequest request, final AsyncApiCallback<OutcomePredictorListing> callback) {
    try {
      final SettableFuture<OutcomePredictorListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomePredictorListing>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictorListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictorListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomePredictorListing>> getJourneyOutcomesPredictorsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomePredictorListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomePredictorListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomePredictorListing>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictorListing>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictorListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictorListing> response = (ApiResponse<OutcomePredictorListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictorListing> response = (ApiResponse<OutcomePredictorListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneySegment> getJourneySegmentAsync(GetJourneySegmentRequest request, final AsyncApiCallback<JourneySegment> callback) {
    try {
      final SettableFuture<JourneySegment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneySegment>> getJourneySegmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JourneySegment>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneySegment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all segments.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SegmentListing> getJourneySegmentsAsync(GetJourneySegmentsRequest request, final AsyncApiCallback<SegmentListing> callback) {
    try {
      final SettableFuture<SegmentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SegmentListing>() {}, new AsyncApiCallback<ApiResponse<SegmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SegmentListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all segments.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SegmentListing>> getJourneySegmentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SegmentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SegmentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SegmentListing>() {}, new AsyncApiCallback<ApiResponse<SegmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SegmentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SegmentListing> response = (ApiResponse<SegmentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SegmentListing> response = (ApiResponse<SegmentListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Session> getJourneySessionAsync(GetJourneySessionRequest request, final AsyncApiCallback<Session> callback) {
    try {
      final SettableFuture<Session> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Session>() {}, new AsyncApiCallback<ApiResponse<Session>>() {
        @Override
        public void onCompleted(ApiResponse<Session> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single session.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Session>> getJourneySessionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Session>> callback) {
    try {
      final SettableFuture<ApiResponse<Session>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Session>() {}, new AsyncApiCallback<ApiResponse<Session>>() {
        @Override
        public void onCompleted(ApiResponse<Session> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Session> response = (ApiResponse<Session>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Session> response = (ApiResponse<Session>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all events for a given session.
   * 
   * getJourneySessionEvents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventListing> getJourneySessionEventsAsync(GetJourneySessionEventsRequest request, final AsyncApiCallback<EventListing> callback) {
    try {
      final SettableFuture<EventListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventListing>() {}, new AsyncApiCallback<ApiResponse<EventListing>>() {
        @Override
        public void onCompleted(ApiResponse<EventListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all events for a given session.
   * 
   * getJourneySessionEvents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventListing>> getJourneySessionEventsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EventListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EventListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventListing>() {}, new AsyncApiCallback<ApiResponse<EventListing>>() {
        @Override
        public void onCompleted(ApiResponse<EventListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomeScoresResult> getJourneySessionOutcomescoresAsync(GetJourneySessionOutcomescoresRequest request, final AsyncApiCallback<OutcomeScoresResult> callback) {
    try {
      final SettableFuture<OutcomeScoresResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomeScoresResult>() {}, new AsyncApiCallback<ApiResponse<OutcomeScoresResult>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeScoresResult> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomeScoresResult>> getJourneySessionOutcomescoresAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OutcomeScoresResult>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomeScoresResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomeScoresResult>() {}, new AsyncApiCallback<ApiResponse<OutcomeScoresResult>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeScoresResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeScoresResult> response = (ApiResponse<OutcomeScoresResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeScoresResult> response = (ApiResponse<OutcomeScoresResult>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Journey View by ID
   * returns the latest version
   * getJourneyView is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyView> getJourneyViewAsync(GetJourneyViewRequest request, final AsyncApiCallback<JourneyView> callback) {
    try {
      final SettableFuture<JourneyView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Journey View by ID
   * returns the latest version
   * getJourneyView is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyView>> getJourneyViewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JourneyView>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Journey View by ID and version
   * 
   * getJourneyViewVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyView> getJourneyViewVersionAsync(GetJourneyViewVersionRequest request, final AsyncApiCallback<JourneyView> callback) {
    try {
      final SettableFuture<JourneyView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Journey View by ID and version
   * 
   * getJourneyViewVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyView>> getJourneyViewVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JourneyView>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Journey Views
   * 
   * getJourneyViews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AddressableEntityListing> getJourneyViewsAsync(GetJourneyViewsRequest request, final AsyncApiCallback<AddressableEntityListing> callback) {
    try {
      final SettableFuture<AddressableEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AddressableEntityListing>() {}, new AsyncApiCallback<ApiResponse<AddressableEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AddressableEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of Journey Views
   * 
   * getJourneyViews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AddressableEntityListing>> getJourneyViewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AddressableEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AddressableEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AddressableEntityListing>() {}, new AsyncApiCallback<ApiResponse<AddressableEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AddressableEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AddressableEntityListing> response = (ApiResponse<AddressableEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AddressableEntityListing> response = (ApiResponse<AddressableEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionMap> patchJourneyActionmapAsync(PatchJourneyActionmapRequest request, final AsyncApiCallback<ActionMap> callback) {
    try {
      final SettableFuture<ActionMap> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update single action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionMap>> patchJourneyActionmapAsync(ApiRequest<PatchActionMap> request, final AsyncApiCallback<ApiResponse<ActionMap>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionMap>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTarget> patchJourneyActiontargetAsync(PatchJourneyActiontargetRequest request, final AsyncApiCallback<ActionTarget> callback) {
    try {
      final SettableFuture<ActionTarget> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTarget>> patchJourneyActiontargetAsync(ApiRequest<PatchActionTarget> request, final AsyncApiCallback<ApiResponse<ActionTarget>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTarget>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTemplate> patchJourneyActiontemplateAsync(PatchJourneyActiontemplateRequest request, final AsyncApiCallback<ActionTemplate> callback) {
    try {
      final SettableFuture<ActionTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTemplate>> patchJourneyActiontemplateAsync(ApiRequest<PatchActionTemplate> request, final AsyncApiCallback<ApiResponse<ActionTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Outcome> patchJourneyOutcomeAsync(PatchJourneyOutcomeRequest request, final AsyncApiCallback<Outcome> callback) {
    try {
      final SettableFuture<Outcome> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Outcome>> patchJourneyOutcomeAsync(ApiRequest<PatchOutcome> request, final AsyncApiCallback<ApiResponse<Outcome>> callback) {
    try {
      final SettableFuture<ApiResponse<Outcome>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneySegment> patchJourneySegmentAsync(PatchJourneySegmentRequest request, final AsyncApiCallback<JourneySegment> callback) {
    try {
      final SettableFuture<JourneySegment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneySegment>> patchJourneySegmentAsync(ApiRequest<PatchSegment> request, final AsyncApiCallback<ApiResponse<JourneySegment>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneySegment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postAnalyticsJourneysAggregatesJobsAsync(PostAnalyticsJourneysAggregatesJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
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
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postAnalyticsJourneysAggregatesJobsAsync(ApiRequest<JourneyAsyncAggregationQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
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
   * Create an action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionMap> postJourneyActionmapsAsync(PostJourneyActionmapsRequest request, final AsyncApiCallback<ActionMap> callback) {
    try {
      final SettableFuture<ActionMap> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an action map.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionMap>> postJourneyActionmapsAsync(ApiRequest<ActionMap> request, final AsyncApiCallback<ApiResponse<ActionMap>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionMap>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionMap>() {}, new AsyncApiCallback<ApiResponse<ActionMap>>() {
        @Override
        public void onCompleted(ApiResponse<ActionMap> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for estimates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EstimateJobAsyncResponse> postJourneyActionmapsEstimatesJobsAsync(PostJourneyActionmapsEstimatesJobsRequest request, final AsyncApiCallback<EstimateJobAsyncResponse> callback) {
    try {
      final SettableFuture<EstimateJobAsyncResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EstimateJobAsyncResponse>() {}, new AsyncApiCallback<ApiResponse<EstimateJobAsyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EstimateJobAsyncResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for estimates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EstimateJobAsyncResponse>> postJourneyActionmapsEstimatesJobsAsync(ApiRequest<ActionMapEstimateRequest> request, final AsyncApiCallback<ApiResponse<EstimateJobAsyncResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EstimateJobAsyncResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EstimateJobAsyncResponse>() {}, new AsyncApiCallback<ApiResponse<EstimateJobAsyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EstimateJobAsyncResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimateJobAsyncResponse> response = (ApiResponse<EstimateJobAsyncResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EstimateJobAsyncResponse> response = (ApiResponse<EstimateJobAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTemplate> postJourneyActiontemplatesAsync(PostJourneyActiontemplatesRequest request, final AsyncApiCallback<ActionTemplate> callback) {
    try {
      final SettableFuture<ActionTemplate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a single action template.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTemplate>> postJourneyActiontemplatesAsync(ApiRequest<ActionTemplate> request, final AsyncApiCallback<ApiResponse<ActionTemplate>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTemplate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTemplate>() {}, new AsyncApiCallback<ApiResponse<ActionTemplate>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTemplate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postJourneyDeploymentActioneventAsync(PostJourneyDeploymentActioneventRequest request, final AsyncApiCallback<Void> callback) {
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
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postJourneyDeploymentActioneventAsync(ApiRequest<ActionEventRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AppEventResponse> postJourneyDeploymentAppeventsAsync(PostJourneyDeploymentAppeventsRequest request, final AsyncApiCallback<AppEventResponse> callback) {
    try {
      final SettableFuture<AppEventResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AppEventResponse>() {}, new AsyncApiCallback<ApiResponse<AppEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AppEventResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AppEventResponse>> postJourneyDeploymentAppeventsAsync(ApiRequest<AppEventRequest> request, final AsyncApiCallback<ApiResponse<AppEventResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AppEventResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AppEventResponse>() {}, new AsyncApiCallback<ApiResponse<AppEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AppEventResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AppEventResponse> response = (ApiResponse<AppEventResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AppEventResponse> response = (ApiResponse<AppEventResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for flow paths.
   * 
   * postJourneyFlowsPathsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowPaths> postJourneyFlowsPathsQueryAsync(PostJourneyFlowsPathsQueryRequest request, final AsyncApiCallback<FlowPaths> callback) {
    try {
      final SettableFuture<FlowPaths> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowPaths>() {}, new AsyncApiCallback<ApiResponse<FlowPaths>>() {
        @Override
        public void onCompleted(ApiResponse<FlowPaths> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for flow paths.
   * 
   * postJourneyFlowsPathsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowPaths>> postJourneyFlowsPathsQueryAsync(ApiRequest<FlowPathsQuery> request, final AsyncApiCallback<ApiResponse<FlowPaths>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowPaths>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowPaths>() {}, new AsyncApiCallback<ApiResponse<FlowPaths>>() {
        @Override
        public void onCompleted(ApiResponse<FlowPaths> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowPaths> response = (ApiResponse<FlowPaths>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowPaths> response = (ApiResponse<FlowPaths>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Outcome> postJourneyOutcomesAsync(PostJourneyOutcomesRequest request, final AsyncApiCallback<Outcome> callback) {
    try {
      final SettableFuture<Outcome> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an outcome.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Outcome>> postJourneyOutcomesAsync(ApiRequest<OutcomeRequest> request, final AsyncApiCallback<ApiResponse<Outcome>> callback) {
    try {
      final SettableFuture<ApiResponse<Outcome>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Outcome>() {}, new AsyncApiCallback<ApiResponse<Outcome>>() {
        @Override
        public void onCompleted(ApiResponse<Outcome> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Outcome Attributions
   * 
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomeAttributionAsyncResponse> postJourneyOutcomesAttributionsJobsAsync(PostJourneyOutcomesAttributionsJobsRequest request, final AsyncApiCallback<OutcomeAttributionAsyncResponse> callback) {
    try {
      final SettableFuture<OutcomeAttributionAsyncResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomeAttributionAsyncResponse>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionAsyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionAsyncResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Outcome Attributions
   * 
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomeAttributionAsyncResponse>> postJourneyOutcomesAttributionsJobsAsync(ApiRequest<OutcomeAttributionListing> request, final AsyncApiCallback<ApiResponse<OutcomeAttributionAsyncResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomeAttributionAsyncResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomeAttributionAsyncResponse>() {}, new AsyncApiCallback<ApiResponse<OutcomeAttributionAsyncResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomeAttributionAsyncResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionAsyncResponse> response = (ApiResponse<OutcomeAttributionAsyncResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomeAttributionAsyncResponse> response = (ApiResponse<OutcomeAttributionAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OutcomePredictor> postJourneyOutcomesPredictorsAsync(PostJourneyOutcomesPredictorsRequest request, final AsyncApiCallback<OutcomePredictor> callback) {
    try {
      final SettableFuture<OutcomePredictor> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OutcomePredictor>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictor>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictor> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an outcome predictor.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OutcomePredictor>> postJourneyOutcomesPredictorsAsync(ApiRequest<OutcomePredictorRequest> request, final AsyncApiCallback<ApiResponse<OutcomePredictor>> callback) {
    try {
      final SettableFuture<ApiResponse<OutcomePredictor>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OutcomePredictor>() {}, new AsyncApiCallback<ApiResponse<OutcomePredictor>>() {
        @Override
        public void onCompleted(ApiResponse<OutcomePredictor> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneySegment> postJourneySegmentsAsync(PostJourneySegmentsRequest request, final AsyncApiCallback<JourneySegment> callback) {
    try {
      final SettableFuture<JourneySegment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a segment.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneySegment>> postJourneySegmentsAsync(ApiRequest<JourneySegmentRequest> request, final AsyncApiCallback<ApiResponse<JourneySegment>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneySegment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneySegment>() {}, new AsyncApiCallback<ApiResponse<JourneySegment>>() {
        @Override
        public void onCompleted(ApiResponse<JourneySegment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * postJourneyViewVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyView> postJourneyViewVersionsAsync(PostJourneyViewVersionsRequest request, final AsyncApiCallback<JourneyView> callback) {
    try {
      final SettableFuture<JourneyView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * postJourneyViewVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyView>> postJourneyViewVersionsAsync(ApiRequest<JourneyView> request, final AsyncApiCallback<ApiResponse<JourneyView>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Journey View
   * 
   * postJourneyViews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyView> postJourneyViewsAsync(PostJourneyViewsRequest request, final AsyncApiCallback<JourneyView> callback) {
    try {
      final SettableFuture<JourneyView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new Journey View
   * 
   * postJourneyViews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyView>> postJourneyViewsAsync(ApiRequest<JourneyView> request, final AsyncApiCallback<ApiResponse<JourneyView>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyView>() {}, new AsyncApiCallback<ApiResponse<JourneyView>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
