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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.QualityAuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.EvaluationAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.EvaluationAggregationQuery;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SurveyAggregationQuery;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.QMAuditQueryRequest;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;


import com.mypurecloud.sdk.v2.api.request.DeleteQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormsSurveyRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveyVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsSurveysBulkContextsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsSurveysRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveyRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualitySurveysScorableRequest;
import com.mypurecloud.sdk.v2.api.request.PatchQualityFormsSurveyRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationsAuditsQueryRequest;
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
  public Future<Evaluation> deleteQualityConversationEvaluationAsync(DeleteQualityConversationEvaluationRequest request, final AsyncApiCallback<Evaluation> callback) {
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
   * Delete an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Evaluation>> deleteQualityConversationEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Evaluation>> callback) {
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
   * Delete an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Gets a list of Agent Activities
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
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
   * Includes the number of evaluations and average evaluation score. These statistics include released evaluations only when evaluatorUserId is provided. In the absence of evaluatorUserId in the request, the api excludes evaluations which are set to never release for the calculation of evaluation statistics. 
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
   * 
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
   * 
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
  public Future<Evaluation> getQualityConversationEvaluationAsync(GetQualityConversationEvaluationRequest request, final AsyncApiCallback<Evaluation> callback) {
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
   * Get an evaluation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Evaluation>> getQualityConversationEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Evaluation>> callback) {
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
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
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
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId. When querying by agentUserId (and not conversationId or evaluatorUserId), the results are sorted by release date. Evaluations set to &#39;Never Release&#39; are omitted in this case. When querying by evaluatorUserId or conversationId (including when combined with agentUserId), the results are sorted by assigned date.
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
   */
  public Future<EvaluationForm> getQualityFormAsync(GetQualityFormRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> getQualityFormAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationFormEntityListing> getQualityFormVersionsAsync(GetQualityFormVersionsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormEntityListing> getQualityFormsAsync(GetQualityFormsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationForm> getQualityFormsEvaluationAsync(GetQualityFormsEvaluationRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> getQualityFormsEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationFormEntityListing> getQualityFormsEvaluationVersionsAsync(GetQualityFormsEvaluationVersionsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormsEvaluationVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationFormEntityListing> getQualityFormsEvaluationsAsync(GetQualityFormsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityFormsEvaluationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
   * Get the list of survey forms
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
   * Get the list of survey forms
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
   */
  public Future<EvaluationForm> getQualityPublishedformAsync(GetQualityPublishedformRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> getQualityPublishedformAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationFormEntityListing> getQualityPublishedformsAsync(GetQualityPublishedformsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityPublishedformsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationForm> getQualityPublishedformsEvaluationAsync(GetQualityPublishedformsEvaluationRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> getQualityPublishedformsEvaluationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationFormEntityListing> getQualityPublishedformsEvaluationsAsync(GetQualityPublishedformsEvaluationsRequest request, final AsyncApiCallback<EvaluationFormEntityListing> callback) {
    try {
      final SettableFuture<EvaluationFormEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationFormEntityListing>> getQualityPublishedformsEvaluationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationFormEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationFormEntityListing>() {}, new AsyncApiCallback<ApiResponse<EvaluationFormEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationFormEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<ApiResponse<Evaluation>> postQualityConversationEvaluationsAsync(ApiRequest<Evaluation> request, final AsyncApiCallback<ApiResponse<Evaluation>> callback) {
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
   */
  public Future<EvaluationForm> postQualityFormsAsync(PostQualityFormsRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> postQualityFormsAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationForm> postQualityFormsEvaluationsAsync(PostQualityFormsEvaluationsRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> postQualityFormsEvaluationsAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
   */
  public Future<EvaluationForm> postQualityPublishedformsAsync(PostQualityPublishedformsRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> postQualityPublishedformsAsync(ApiRequest<PublishForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationForm> postQualityPublishedformsEvaluationsAsync(PostQualityPublishedformsEvaluationsRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> postQualityPublishedformsEvaluationsAsync(ApiRequest<PublishForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Evaluation> putQualityConversationEvaluationAsync(PutQualityConversationEvaluationRequest request, final AsyncApiCallback<Evaluation> callback) {
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
   * Update an evaluation
   * The quality:evaluation:edit permission allows modification of most fields, while the quality:evaluation:editScore permission allows an evaluator to change just the question scores, and the quality:evaluation:editAgentSignoff permission allows an agent to change the agent comments and sign off on the evaluation.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Evaluation>> putQualityConversationEvaluationAsync(ApiRequest<Evaluation> request, final AsyncApiCallback<ApiResponse<Evaluation>> callback) {
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
   * Update an evaluation form.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EvaluationForm> putQualityFormAsync(PutQualityFormRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> putQualityFormAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<EvaluationForm> putQualityFormsEvaluationAsync(PutQualityFormsEvaluationRequest request, final AsyncApiCallback<EvaluationForm> callback) {
    try {
      final SettableFuture<EvaluationForm> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<EvaluationForm>> putQualityFormsEvaluationAsync(ApiRequest<EvaluationForm> request, final AsyncApiCallback<ApiResponse<EvaluationForm>> callback) {
    try {
      final SettableFuture<ApiResponse<EvaluationForm>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EvaluationForm>() {}, new AsyncApiCallback<ApiResponse<EvaluationForm>>() {
        @Override
        public void onCompleted(ApiResponse<EvaluationForm> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
