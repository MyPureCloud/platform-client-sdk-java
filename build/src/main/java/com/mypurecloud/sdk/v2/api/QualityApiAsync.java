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

import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import com.mypurecloud.sdk.v2.model.AiScoringSettings;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQueryMe;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.EvaluationCreateBody;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormDivisionView;
import com.mypurecloud.sdk.v2.model.EvaluationFormDivisionViewListing;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponse;
import com.mypurecloud.sdk.v2.model.EvaluationFormResponseEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationResponse;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormDivisionView;
import com.mypurecloud.sdk.v2.model.SurveyFormDivisionViewListing;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsEvaluationsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsSurveysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsEvaluationsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsEvaluationsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsSurveysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsSurveysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityAgentsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationsAuditsQueryTransactionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationsAuditsQueryTransactionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluatorsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsEvaluationsBulkContextsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkContextsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationsDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationsDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveysDivisionviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveysDivisionviewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveysScorableRequest;
import com.mypurecloud.sdk.v2.api.request.PatchQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationsAuditsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityEvaluationsAggregatesQueryMeRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityEvaluationsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualitySurveysScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormsEvaluationAiscoringSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualitySurveysScorableRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class QualityApiAsync {
  private final ApiClient pcapiClient;

  public QualityApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public QualityApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete/cancel an async request for evaluation aggregates
   * 
   * deleteAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAnalyticsEvaluationsAggregatesJobAsync(DeleteAnalyticsEvaluationsAggregatesJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete/cancel an async request for evaluation aggregates
   * 
   * deleteAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAnalyticsEvaluationsAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete/cancel an async request for survey aggregates
   * 
   * deleteAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAnalyticsSurveysAggregatesJobAsync(DeleteAnalyticsSurveysAggregatesJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete/cancel an async request for survey aggregates
   * 
   * deleteAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAnalyticsSurveysAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a calibration by id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Calibration> deleteQualityCalibrationAsync(DeleteQualityCalibrationRequest request, final AsyncApiCallback<Calibration> callback) {
    try {
      final SettableFuture<Calibration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a calibration by id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Calibration>> deleteQualityCalibrationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Calibration>> callback) {
    try {
      final SettableFuture<ApiResponse<Calibration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationResponse> deleteQualityConversationEvaluationAsync(DeleteQualityConversationEvaluationRequest request, final AsyncApiCallback<EvaluationResponse> callback) {
    try {
      final SettableFuture<EvaluationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationResponse>> deleteQualityConversationEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deleteQualityFormAsync(DeleteQualityFormRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deleteQualityFormAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteQualityFormsEvaluationAsync(DeleteQualityFormsEvaluationRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteQualityFormsEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteQualityFormsSurveyAsync(DeleteQualityFormsSurveyRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteQualityFormsSurveyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getAnalyticsEvaluationsAggregatesJobAsync(GetAnalyticsEvaluationsAggregatesJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
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
   * Get status for async query for evaluation aggregates
   * 
   * getAnalyticsEvaluationsAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getAnalyticsEvaluationsAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
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
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationAsyncAggregateQueryResponse> getAnalyticsEvaluationsAggregatesJobResultsAsync(GetAnalyticsEvaluationsAggregatesJobResultsRequest request, final AsyncApiCallback<EvaluationAsyncAggregateQueryResponse> callback) {
    try {
      final SettableFuture<EvaluationAsyncAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
   * getAnalyticsEvaluationsAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationAsyncAggregateQueryResponse>> getAnalyticsEvaluationsAggregatesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationAsyncAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationAsyncAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationAsyncAggregateQueryResponse> response = (ApiResponse<EvaluationAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationAsyncAggregateQueryResponse> response = (ApiResponse<EvaluationAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getAnalyticsSurveysAggregatesJobAsync(GetAnalyticsSurveysAggregatesJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
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
   * Get status for async query for survey aggregates
   * 
   * getAnalyticsSurveysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getAnalyticsSurveysAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
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
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyAsyncAggregateQueryResponse> getAnalyticsSurveysAggregatesJobResultsAsync(GetAnalyticsSurveysAggregatesJobResultsRequest request, final AsyncApiCallback<SurveyAsyncAggregateQueryResponse> callback) {
    try {
      final SettableFuture<SurveyAsyncAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SurveyAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
   * getAnalyticsSurveysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyAsyncAggregateQueryResponse>> getAnalyticsSurveysAggregatesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyAsyncAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyAsyncAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SurveyAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyAsyncAggregateQueryResponse> response = (ApiResponse<SurveyAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyAsyncAggregateQueryResponse> response = (ApiResponse<SurveyAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of Agent Activities
   * Each item on the list shows one agent's evaluation activity comprised of the number of evaluations and the highest, average, and lowest standard and critical scores, as well as a sub list showing the number and average score of evaluations for each evaluator for that agent.  evaluatorUserId, startTime, and endTime are all filtering criteria. If specified, the only evaluations used to compile the agent activity response will be ones that match the filtering criteria. agentUserId, name, group, and agentTeamId are all agent selection criteria. criteria.  If one or more agent selection criteria are specified, then the returned activity will include users that match the criteria even if those users did not have any agent activity or evaluations that do not match any filtering criteria.  If no agent selection criteria are specified but an evaluatorUserId is, then the returned activity will be only for those agents that had evaluations where the evaluator is the evaluatorUserId.  If no agent selection criteria are specified and no evaluatorUserId is specified, then the returned activity will be for all users
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgentActivityEntityListing> getQualityAgentsActivityAsync(GetQualityAgentsActivityRequest request, final AsyncApiCallback<AgentActivityEntityListing> callback) {
    try {
      final SettableFuture<AgentActivityEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgentActivityEntityListing>() {}, new AsyncApiCallback<ApiResponse<AgentActivityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgentActivityEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets a list of Agent Activities
   * Each item on the list shows one agent's evaluation activity comprised of the number of evaluations and the highest, average, and lowest standard and critical scores, as well as a sub list showing the number and average score of evaluations for each evaluator for that agent.  evaluatorUserId, startTime, and endTime are all filtering criteria. If specified, the only evaluations used to compile the agent activity response will be ones that match the filtering criteria. agentUserId, name, group, and agentTeamId are all agent selection criteria. criteria.  If one or more agent selection criteria are specified, then the returned activity will include users that match the criteria even if those users did not have any agent activity or evaluations that do not match any filtering criteria.  If no agent selection criteria are specified but an evaluatorUserId is, then the returned activity will be only for those agents that had evaluations where the evaluator is the evaluatorUserId.  If no agent selection criteria are specified and no evaluatorUserId is specified, then the returned activity will be for all users
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgentActivityEntityListing>> getQualityAgentsActivityAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgentActivityEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AgentActivityEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgentActivityEntityListing>() {}, new AsyncApiCallback<ApiResponse<AgentActivityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgentActivityEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Calibration> getQualityCalibrationAsync(GetQualityCalibrationRequest request, final AsyncApiCallback<Calibration> callback) {
    try {
      final SettableFuture<Calibration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a calibration by id.  Requires either calibrator id or conversation id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Calibration>> getQualityCalibrationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Calibration>> callback) {
    try {
      final SettableFuture<ApiResponse<Calibration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of calibrations
   * NOTE: The count for total and pageCount might not be accurate when querying for a large number of calibrations. nextUri, if present, will indicate that there are more calibrations to fetch.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CalibrationEntityListing> getQualityCalibrationsAsync(GetQualityCalibrationsRequest request, final AsyncApiCallback<CalibrationEntityListing> callback) {
    try {
      final SettableFuture<CalibrationEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CalibrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CalibrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CalibrationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of calibrations
   * NOTE: The count for total and pageCount might not be accurate when querying for a large number of calibrations. nextUri, if present, will indicate that there are more calibrations to fetch.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CalibrationEntityListing>> getQualityCalibrationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CalibrationEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CalibrationEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CalibrationEntityListing>() {}, new AsyncApiCallback<ApiResponse<CalibrationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CalibrationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationResponse> getQualityConversationEvaluationAsync(GetQualityConversationEvaluationRequest request, final AsyncApiCallback<EvaluationResponse> callback) {
    try {
      final SettableFuture<EvaluationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationResponse>> getQualityConversationEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the surveys for a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<Survey>> getQualityConversationSurveysAsync(GetQualityConversationSurveysRequest request, final AsyncApiCallback<List<Survey>> callback) {
    try {
      final SettableFuture<List<Survey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<Survey>>() {}, new AsyncApiCallback<ApiResponse<List<Survey>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Survey>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the surveys for a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<Survey>>> getQualityConversationSurveysAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<Survey>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<Survey>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<Survey>>() {}, new AsyncApiCallback<ApiResponse<List<Survey>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Survey>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Survey>> response = (ApiResponse<List<Survey>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Survey>> response = (ApiResponse<List<Survey>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QualityAuditQueryExecutionStatusResponse> getQualityConversationsAuditsQueryTransactionIdAsync(GetQualityConversationsAuditsQueryTransactionIdRequest request, final AsyncApiCallback<QualityAuditQueryExecutionStatusResponse> callback) {
    try {
      final SettableFuture<QualityAuditQueryExecutionStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QualityAuditQueryExecutionStatusResponse>> getQualityConversationsAuditsQueryTransactionIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QualityAuditQueryExecutionStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QualityAuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get results of audit query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QualityAuditQueryExecutionResultsResponse> getQualityConversationsAuditsQueryTransactionIdResultsAsync(GetQualityConversationsAuditsQueryTransactionIdResultsRequest request, final AsyncApiCallback<QualityAuditQueryExecutionResultsResponse> callback) {
    try {
      final SettableFuture<QualityAuditQueryExecutionResultsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionResultsResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionResultsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get results of audit query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QualityAuditQueryExecutionResultsResponse>> getQualityConversationsAuditsQueryTransactionIdResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionResultsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QualityAuditQueryExecutionResultsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QualityAuditQueryExecutionResultsResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionResultsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionResultsResponse> response = (ApiResponse<QualityAuditQueryExecutionResultsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionResultsResponse> response = (ApiResponse<QualityAuditQueryExecutionResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, agentUserId or assigneeUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to 'Never Release' are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date. NOTE: The count for total and pageCount might not be accurate when querying for a large number of evaluations. nextUri, if present, will indicate that there are more evaluations to fetch. The evaluation entities contained in the response might only contain a subset of all the properties listed below. It is often because a given property's value has not yet been populated or is not applicable in the current state of the evaluation. It might also be because the missing property in the response was not requested by the user.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationEntityListing> getQualityEvaluationsQueryAsync(GetQualityEvaluationsQueryRequest request, final AsyncApiCallback<EvaluationEntityListing> callback) {
    try {
      final SettableFuture<EvaluationEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, agentUserId or assigneeUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to 'Never Release' are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date. NOTE: The count for total and pageCount might not be accurate when querying for a large number of evaluations. nextUri, if present, will indicate that there are more evaluations to fetch. The evaluation entities contained in the response might only contain a subset of all the properties listed below. It is often because a given property's value has not yet been populated or is not applicable in the current state of the evaluation. It might also be because the missing property in the response was not requested by the user.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationEntityListing>> getQualityEvaluationsQueryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluator activity
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluatorActivityEntityListing> getQualityEvaluatorsActivityAsync(GetQualityEvaluatorsActivityRequest request, final AsyncApiCallback<EvaluatorActivityEntityListing> callback) {
    try {
      final SettableFuture<EvaluatorActivityEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluatorActivityEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluatorActivityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluatorActivityEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluator activity
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluatorActivityEntityListing>> getQualityEvaluatorsActivityAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluatorActivityEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluatorActivityEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluatorActivityEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluatorActivityEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluatorActivityEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponse> getQualityFormAsync(GetQualityFormRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponse>> getQualityFormAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponseEntityListing> getQualityFormVersionsAsync(GetQualityFormVersionsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityFormVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponseEntityListing> getQualityFormsAsync(GetQualityFormsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityFormsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponse> getQualityFormsEvaluationAsync(GetQualityFormsEvaluationRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponse>> getQualityFormsEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponseEntityListing> getQualityFormsEvaluationVersionsAsync(GetQualityFormsEvaluationVersionsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityFormsEvaluationVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of evaluation forms
   * By default, \"published\" field is always returned as false for all evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form. In addition, \"questionGroups\", the detailed information about evaluation form, is not returned. We will enhance this field in a future release.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponseEntityListing> getQualityFormsEvaluationsAsync(GetQualityFormsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of evaluation forms
   * By default, \"published\" field is always returned as false for all evaluation forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding evaluation form. In addition, \"questionGroups\", the detailed information about evaluation form, is not returned. We will enhance this field in a future release.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityFormsEvaluationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of the latest published evaluation form versions by context ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<EvaluationFormResponse>> getQualityFormsEvaluationsBulkContextsAsync(GetQualityFormsEvaluationsBulkContextsRequest request, final AsyncApiCallback<List<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<List<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<EvaluationFormResponse>>() {}, new AsyncApiCallback<ApiResponse<List<EvaluationFormResponse>>>() {
        @Override
        public void onCompleted(ApiResponse<List<EvaluationFormResponse>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of the latest published evaluation form versions by context ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<EvaluationFormResponse>>> getQualityFormsEvaluationsBulkContextsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<EvaluationFormResponse>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<EvaluationFormResponse>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<EvaluationFormResponse>>() {}, new AsyncApiCallback<ApiResponse<List<EvaluationFormResponse>>>() {
        @Override
        public void onCompleted(ApiResponse<List<EvaluationFormResponse>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<EvaluationFormResponse>> response = (ApiResponse<List<EvaluationFormResponse>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<EvaluationFormResponse>> response = (ApiResponse<List<EvaluationFormResponse>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> getQualityFormsSurveyAsync(GetQualityFormsSurveyRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey form
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> getQualityFormsSurveyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormEntityListing> getQualityFormsSurveyVersionsAsync(GetQualityFormsSurveyVersionsRequest request, final AsyncApiCallback<SurveyFormEntityListing> callback) {
    try {
      final SettableFuture<SurveyFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets all the revisions for a specific survey.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormEntityListing>> getQualityFormsSurveyVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of survey forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormEntityListing> getQualityFormsSurveysAsync(GetQualityFormsSurveysRequest request, final AsyncApiCallback<SurveyFormEntityListing> callback) {
    try {
      final SettableFuture<SurveyFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of survey forms. If you set \"expand=publishHistory\", then you will be able to get published versions for each corresponding survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormEntityListing>> getQualityFormsSurveysAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormEntityListing> getQualityFormsSurveysBulkAsync(GetQualityFormsSurveysBulkRequest request, final AsyncApiCallback<SurveyFormEntityListing> callback) {
    try {
      final SettableFuture<SurveyFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of survey forms by their ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormEntityListing>> getQualityFormsSurveysBulkAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<SurveyForm>> getQualityFormsSurveysBulkContextsAsync(GetQualityFormsSurveysBulkContextsRequest request, final AsyncApiCallback<List<SurveyForm>> callback) {
    try {
      final SettableFuture<List<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<SurveyForm>>() {}, new AsyncApiCallback<ApiResponse<List<SurveyForm>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SurveyForm>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a list of the latest form versions by context ids
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<SurveyForm>>> getQualityFormsSurveysBulkContextsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<SurveyForm>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<SurveyForm>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<SurveyForm>>() {}, new AsyncApiCallback<ApiResponse<List<SurveyForm>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SurveyForm>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SurveyForm>> response = (ApiResponse<List<SurveyForm>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SurveyForm>> response = (ApiResponse<List<SurveyForm>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponse> getQualityPublishedformAsync(GetQualityPublishedformRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponse>> getQualityPublishedformAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponseEntityListing> getQualityPublishedformsAsync(GetQualityPublishedformsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityPublishedformsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponse> getQualityPublishedformsEvaluationAsync(GetQualityPublishedformsEvaluationRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponse>> getQualityPublishedformsEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponseEntityListing> getQualityPublishedformsEvaluationsAsync(GetQualityPublishedformsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormResponseEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponseEntityListing>> getQualityPublishedformsEvaluationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponseEntityListing> response = (ApiResponse<EvaluationFormResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an evaluation form across any division.
   * 
   * getQualityPublishedformsEvaluationsDivisionview is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormDivisionView> getQualityPublishedformsEvaluationsDivisionviewAsync(GetQualityPublishedformsEvaluationsDivisionviewRequest request, final AsyncApiCallback<EvaluationFormDivisionView> callback) {
    try {
      final SettableFuture<EvaluationFormDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormDivisionView>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an evaluation form across any division.
   * 
   * getQualityPublishedformsEvaluationsDivisionview is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormDivisionView>> getQualityPublishedformsEvaluationsDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormDivisionView>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormDivisionView> response = (ApiResponse<EvaluationFormDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormDivisionView> response = (ApiResponse<EvaluationFormDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms across any division.
   * 
   * getQualityPublishedformsEvaluationsDivisionviews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormDivisionViewListing> getQualityPublishedformsEvaluationsDivisionviewsAsync(GetQualityPublishedformsEvaluationsDivisionviewsRequest request, final AsyncApiCallback<EvaluationFormDivisionViewListing> callback) {
    try {
      final SettableFuture<EvaluationFormDivisionViewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormDivisionViewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published evaluation forms across any division.
   * 
   * getQualityPublishedformsEvaluationsDivisionviews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormDivisionViewListing>> getQualityPublishedformsEvaluationsDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormDivisionViewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormDivisionViewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormDivisionViewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormDivisionViewListing> response = (ApiResponse<EvaluationFormDivisionViewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormDivisionViewListing> response = (ApiResponse<EvaluationFormDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> getQualityPublishedformsSurveyAsync(GetQualityPublishedformsSurveyRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> getQualityPublishedformsSurveyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published survey forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormEntityListing> getQualityPublishedformsSurveysAsync(GetQualityPublishedformsSurveysRequest request, final AsyncApiCallback<SurveyFormEntityListing> callback) {
    try {
      final SettableFuture<SurveyFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published survey forms.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormEntityListing>> getQualityPublishedformsSurveysAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormEntityListing> response = (ApiResponse<SurveyFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an enabled survey form across any division.
   * 
   * getQualityPublishedformsSurveysDivisionview is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormDivisionView> getQualityPublishedformsSurveysDivisionviewAsync(GetQualityPublishedformsSurveysDivisionviewRequest request, final AsyncApiCallback<SurveyFormDivisionView> callback) {
    try {
      final SettableFuture<SurveyFormDivisionView> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormDivisionView>() {}, new AsyncApiCallback<ApiResponse<SurveyFormDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormDivisionView> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the most recent published version of an enabled survey form across any division.
   * 
   * getQualityPublishedformsSurveysDivisionview is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormDivisionView>> getQualityPublishedformsSurveysDivisionviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormDivisionView>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormDivisionView>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormDivisionView>() {}, new AsyncApiCallback<ApiResponse<SurveyFormDivisionView>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormDivisionView> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormDivisionView> response = (ApiResponse<SurveyFormDivisionView>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormDivisionView> response = (ApiResponse<SurveyFormDivisionView>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published and enabled survey forms across any division.
   * 
   * getQualityPublishedformsSurveysDivisionviews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyFormDivisionViewListing> getQualityPublishedformsSurveysDivisionviewsAsync(GetQualityPublishedformsSurveysDivisionviewsRequest request, final AsyncApiCallback<SurveyFormDivisionViewListing> callback) {
    try {
      final SettableFuture<SurveyFormDivisionViewListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyFormDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormDivisionViewListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the published and enabled survey forms across any division.
   * 
   * getQualityPublishedformsSurveysDivisionviews is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyFormDivisionViewListing>> getQualityPublishedformsSurveysDivisionviewsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SurveyFormDivisionViewListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyFormDivisionViewListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyFormDivisionViewListing>() {}, new AsyncApiCallback<ApiResponse<SurveyFormDivisionViewListing>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyFormDivisionViewListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormDivisionViewListing> response = (ApiResponse<SurveyFormDivisionViewListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyFormDivisionViewListing> response = (ApiResponse<SurveyFormDivisionViewListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey for a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Survey> getQualitySurveyAsync(GetQualitySurveyRequest request, final AsyncApiCallback<Survey> callback) {
    try {
      final SettableFuture<Survey> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Survey>() {}, new AsyncApiCallback<ApiResponse<Survey>>() {
        @Override
        public void onCompleted(ApiResponse<Survey> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey for a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Survey>> getQualitySurveyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Survey>> callback) {
    try {
      final SettableFuture<ApiResponse<Survey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Survey>() {}, new AsyncApiCallback<ApiResponse<Survey>>() {
        @Override
        public void onCompleted(ApiResponse<Survey> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Survey> response = (ApiResponse<Survey>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Survey> response = (ApiResponse<Survey>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScorableSurvey> getQualitySurveysScorableAsync(GetQualitySurveysScorableRequest request, final AsyncApiCallback<ScorableSurvey> callback) {
    try {
      final SettableFuture<ScorableSurvey> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScorableSurvey>() {}, new AsyncApiCallback<ApiResponse<ScorableSurvey>>() {
        @Override
        public void onCompleted(ApiResponse<ScorableSurvey> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScorableSurvey>> getQualitySurveysScorableAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScorableSurvey>> callback) {
    try {
      final SettableFuture<ApiResponse<ScorableSurvey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScorableSurvey>() {}, new AsyncApiCallback<ApiResponse<ScorableSurvey>>() {
        @Override
        public void onCompleted(ApiResponse<ScorableSurvey> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> patchQualityFormsSurveyAsync(PatchQualityFormsSurveyRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Disable a particular version of a survey form and invalidates any invitations that have already been sent to customers using this version of the form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> patchQualityFormsSurveyAsync(ApiRequest<SurveyForm> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postAnalyticsEvaluationsAggregatesJobsAsync(PostAnalyticsEvaluationsAggregatesJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
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
   * Query for evaluation aggregates asynchronously
   * 
   * postAnalyticsEvaluationsAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postAnalyticsEvaluationsAggregatesJobsAsync(ApiRequest<EvaluationAsyncAggregationQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
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
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postAnalyticsSurveysAggregatesJobsAsync(PostAnalyticsSurveysAggregatesJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
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
   * Query for survey aggregates asynchronously
   * 
   * postAnalyticsSurveysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postAnalyticsSurveysAggregatesJobsAsync(ApiRequest<SurveyAsyncAggregationQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
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
   * Create a calibration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Calibration> postQualityCalibrationsAsync(PostQualityCalibrationsRequest request, final AsyncApiCallback<Calibration> callback) {
    try {
      final SettableFuture<Calibration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a calibration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Calibration>> postQualityCalibrationsAsync(ApiRequest<CalibrationCreate> request, final AsyncApiCallback<ApiResponse<Calibration>> callback) {
    try {
      final SettableFuture<ApiResponse<Calibration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Evaluation> postQualityConversationEvaluationsAsync(PostQualityConversationEvaluationsRequest request, final AsyncApiCallback<Evaluation> callback) {
    try {
      final SettableFuture<Evaluation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Evaluation>() {}, new AsyncApiCallback<ApiResponse<Evaluation>>() {
        @Override
        public void onCompleted(ApiResponse<Evaluation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Evaluation>> postQualityConversationEvaluationsAsync(ApiRequest<EvaluationCreateBody> request, final AsyncApiCallback<ApiResponse<Evaluation>> callback) {
    try {
      final SettableFuture<ApiResponse<Evaluation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Evaluation>() {}, new AsyncApiCallback<ApiResponse<Evaluation>>() {
        @Override
        public void onCompleted(ApiResponse<Evaluation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QualityAuditQueryExecutionStatusResponse> postQualityConversationsAuditsQueryAsync(PostQualityConversationsAuditsQueryRequest request, final AsyncApiCallback<QualityAuditQueryExecutionStatusResponse> callback) {
    try {
      final SettableFuture<QualityAuditQueryExecutionStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QualityAuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QualityAuditQueryExecutionStatusResponse>> postQualityConversationsAuditsQueryAsync(ApiRequest<QMAuditQueryRequest> request, final AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<QualityAuditQueryExecutionStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QualityAuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<QualityAuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualityAuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QualityAuditQueryExecutionStatusResponse> response = (ApiResponse<QualityAuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for evaluation aggregates for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationAggregateQueryResponse> postQualityEvaluationsAggregatesQueryMeAsync(PostQualityEvaluationsAggregatesQueryMeRequest request, final AsyncApiCallback<EvaluationAggregateQueryResponse> callback) {
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
   * Query for evaluation aggregates for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationAggregateQueryResponse>> postQualityEvaluationsAggregatesQueryMeAsync(ApiRequest<EvaluationAggregationQueryMe> request, final AsyncApiCallback<ApiResponse<EvaluationAggregateQueryResponse>> callback) {
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
   * Score evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationScoringSet> postQualityEvaluationsScoringAsync(PostQualityEvaluationsScoringRequest request, final AsyncApiCallback<EvaluationScoringSet> callback) {
    try {
      final SettableFuture<EvaluationScoringSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationScoringSet>() {}, new AsyncApiCallback<ApiResponse<EvaluationScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationScoringSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Score evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationScoringSet>> postQualityEvaluationsScoringAsync(ApiRequest<EvaluationFormAndScoringSet> request, final AsyncApiCallback<ApiResponse<EvaluationScoringSet>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationScoringSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationScoringSet>() {}, new AsyncApiCallback<ApiResponse<EvaluationScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationScoringSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponse> postQualityFormsAsync(PostQualityFormsRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponse>> postQualityFormsAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponse> postQualityFormsEvaluationsAsync(PostQualityFormsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponse>> postQualityFormsEvaluationsAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> postQualityFormsSurveysAsync(PostQualityFormsSurveysRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> postQualityFormsSurveysAsync(ApiRequest<SurveyForm> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponse> postQualityPublishedformsAsync(PostQualityPublishedformsRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponse>> postQualityPublishedformsAsync(ApiRequest<PublishForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponse> postQualityPublishedformsEvaluationsAsync(PostQualityPublishedformsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponse>> postQualityPublishedformsEvaluationsAsync(ApiRequest<PublishForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> postQualityPublishedformsSurveysAsync(PostQualityPublishedformsSurveysRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> postQualityPublishedformsSurveysAsync(ApiRequest<PublishForm> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Score survey
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyScoringSet> postQualitySurveysScoringAsync(PostQualitySurveysScoringRequest request, final AsyncApiCallback<SurveyScoringSet> callback) {
    try {
      final SettableFuture<SurveyScoringSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyScoringSet>() {}, new AsyncApiCallback<ApiResponse<SurveyScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyScoringSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Score survey
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyScoringSet>> postQualitySurveysScoringAsync(ApiRequest<SurveyFormAndScoringSet> request, final AsyncApiCallback<ApiResponse<SurveyScoringSet>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyScoringSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyScoringSet>() {}, new AsyncApiCallback<ApiResponse<SurveyScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyScoringSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyScoringSet> response = (ApiResponse<SurveyScoringSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyScoringSet> response = (ApiResponse<SurveyScoringSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Calibration> putQualityCalibrationAsync(PutQualityCalibrationRequest request, final AsyncApiCallback<Calibration> callback) {
    try {
      final SettableFuture<Calibration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Calibration>> putQualityCalibrationAsync(ApiRequest<Calibration> request, final AsyncApiCallback<ApiResponse<Calibration>> callback) {
    try {
      final SettableFuture<ApiResponse<Calibration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Calibration>() {}, new AsyncApiCallback<ApiResponse<Calibration>>() {
        @Override
        public void onCompleted(ApiResponse<Calibration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation. authorizedActions is not returned for this PUT request, and is only returned for GET requests to this endpoint.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationResponse> putQualityConversationEvaluationAsync(PutQualityConversationEvaluationRequest request, final AsyncApiCallback<EvaluationResponse> callback) {
    try {
      final SettableFuture<EvaluationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation. authorizedActions is not returned for this PUT request, and is only returned for GET requests to this endpoint.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationResponse>> putQualityConversationEvaluationAsync(ApiRequest<Evaluation> request, final AsyncApiCallback<ApiResponse<EvaluationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationResponse> response = (ApiResponse<EvaluationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<EvaluationFormResponse> putQualityFormAsync(PutQualityFormRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<EvaluationFormResponse>> putQualityFormAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormResponse> putQualityFormsEvaluationAsync(PutQualityFormsEvaluationRequest request, final AsyncApiCallback<EvaluationFormResponse> callback) {
    try {
      final SettableFuture<EvaluationFormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormResponse>> putQualityFormsEvaluationAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationFormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormResponse>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormResponse> response = (ApiResponse<EvaluationFormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the AI Scoring settings of an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AiScoringSettings> putQualityFormsEvaluationAiscoringSettingsAsync(PutQualityFormsEvaluationAiscoringSettingsRequest request, final AsyncApiCallback<AiScoringSettings> callback) {
    try {
      final SettableFuture<AiScoringSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AiScoringSettings>() {}, new AsyncApiCallback<ApiResponse<AiScoringSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AiScoringSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the AI Scoring settings of an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AiScoringSettings>> putQualityFormsEvaluationAiscoringSettingsAsync(ApiRequest<AiScoringSettings> request, final AsyncApiCallback<ApiResponse<AiScoringSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<AiScoringSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AiScoringSettings>() {}, new AsyncApiCallback<ApiResponse<AiScoringSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AiScoringSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AiScoringSettings> response = (ApiResponse<AiScoringSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AiScoringSettings> response = (ApiResponse<AiScoringSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SurveyForm> putQualityFormsSurveyAsync(PutQualityFormsSurveyRequest request, final AsyncApiCallback<SurveyForm> callback) {
    try {
      final SettableFuture<SurveyForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a survey form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SurveyForm>> putQualityFormsSurveyAsync(ApiRequest<SurveyForm> request, final AsyncApiCallback<ApiResponse<SurveyForm>> callback) {
    try {
      final SettableFuture<ApiResponse<SurveyForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SurveyForm>() {}, new AsyncApiCallback<ApiResponse<SurveyForm>>() {
        @Override
        public void onCompleted(ApiResponse<SurveyForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SurveyForm> response = (ApiResponse<SurveyForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScorableSurvey> putQualitySurveysScorableAsync(PutQualitySurveysScorableRequest request, final AsyncApiCallback<ScorableSurvey> callback) {
    try {
      final SettableFuture<ScorableSurvey> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScorableSurvey>() {}, new AsyncApiCallback<ApiResponse<ScorableSurvey>>() {
        @Override
        public void onCompleted(ApiResponse<ScorableSurvey> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a survey as an end-customer, for the purposes of scoring it.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScorableSurvey>> putQualitySurveysScorableAsync(ApiRequest<ScorableSurvey> request, final AsyncApiCallback<ApiResponse<ScorableSurvey>> callback) {
    try {
      final SettableFuture<ApiResponse<ScorableSurvey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScorableSurvey>() {}, new AsyncApiCallback<ApiResponse<ScorableSurvey>>() {
        @Override
        public void onCompleted(ApiResponse<ScorableSurvey> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScorableSurvey> response = (ApiResponse<ScorableSurvey>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
