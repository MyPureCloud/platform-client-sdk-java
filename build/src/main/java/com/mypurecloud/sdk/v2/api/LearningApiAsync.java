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

import com.mypurecloud.sdk.v2.model.AssessmentScoringSet;
import com.mypurecloud.sdk.v2.model.AssignedLearningModuleDomainEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.LearningAssessmentScoringRequest;
import com.mypurecloud.sdk.v2.model.LearningAssignment;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateParam;
import com.mypurecloud.sdk.v2.model.LearningAssignmentAggregateResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkAddResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentBulkRemoveResponse;
import com.mypurecloud.sdk.v2.model.LearningAssignmentCreate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentExternalUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentItem;
import com.mypurecloud.sdk.v2.model.LearningAssignmentReschedule;
import com.mypurecloud.sdk.v2.model.LearningAssignmentStep;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUpdate;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserListing;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUserQuery;
import com.mypurecloud.sdk.v2.model.LearningAssignmentsDomainEntity;
import com.mypurecloud.sdk.v2.model.LearningModule;
import com.mypurecloud.sdk.v2.model.LearningModuleCoverArtResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleJobRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleJobResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewGetResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateResponse;
import com.mypurecloud.sdk.v2.model.LearningModulePublishRequest;
import com.mypurecloud.sdk.v2.model.LearningModulePublishResponse;
import com.mypurecloud.sdk.v2.model.LearningModuleRequest;
import com.mypurecloud.sdk.v2.model.LearningModuleRule;
import com.mypurecloud.sdk.v2.model.LearningModulesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryRequest;
import com.mypurecloud.sdk.v2.model.LearningScheduleSlotsQueryResponse;
import com.mypurecloud.sdk.v2.model.LearningScormResponse;
import com.mypurecloud.sdk.v2.model.LearningScormUploadRequest;
import com.mypurecloud.sdk.v2.model.LearningScormUploadResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentStepRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningAssignmentsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulePreviewRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModuleVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningModulesCoverartCoverArtIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetLearningScormScormIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentRescheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningAssignmentStepRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLearningModuleUserAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssessmentsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentReassignRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentResetRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningAssignmentsBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModuleJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulePublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningModulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningRulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningScheduleslotsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostLearningScormRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModulePreviewRequest;
import com.mypurecloud.sdk.v2.api.request.PutLearningModuleRuleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class LearningApiAsync {
  private final ApiClient pcapiClient;

  public LearningApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LearningApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a learning assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteLearningAssignmentAsync(DeleteLearningAssignmentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a learning assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteLearningAssignmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteLearningModuleAsync(DeleteLearningModuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a learning module
   * This will delete a learning module if it is unpublished or it will delete a published and archived learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteLearningModuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> getLearningAssignmentAsync(GetLearningAssignmentRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Learning Assignment
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> getLearningAssignmentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentStep> getLearningAssignmentStepAsync(GetLearningAssignmentStepRequest request, final AsyncApiCallback<LearningAssignmentStep> callback) {
    try {
      final SettableFuture<LearningAssignmentStep> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentStep>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentStep>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentStep> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentStep>> getLearningAssignmentStepAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignmentStep>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentStep>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentStep>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentStep>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentStep> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentsDomainEntity> getLearningAssignmentsAsync(GetLearningAssignmentsRequest request, final AsyncApiCallback<LearningAssignmentsDomainEntity> callback) {
    try {
      final SettableFuture<LearningAssignmentsDomainEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentsDomainEntity>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentsDomainEntity> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List of Learning module Assignments
   * Either moduleId or user value is required
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentsDomainEntity>> getLearningAssignmentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentsDomainEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentsDomainEntity>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentsDomainEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentsDomainEntity> getLearningAssignmentsMeAsync(GetLearningAssignmentsMeRequest request, final AsyncApiCallback<LearningAssignmentsDomainEntity> callback) {
    try {
      final SettableFuture<LearningAssignmentsDomainEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentsDomainEntity>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentsDomainEntity> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List of Learning Assignments assigned to current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentsDomainEntity>> getLearningAssignmentsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentsDomainEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentsDomainEntity>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentsDomainEntity>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentsDomainEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentsDomainEntity> response = (ApiResponse<LearningAssignmentsDomainEntity>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModule> getLearningModuleAsync(GetLearningModuleRequest request, final AsyncApiCallback<LearningModule> callback) {
    try {
      final SettableFuture<LearningModule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModule>> getLearningModuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModuleJobResponse> getLearningModuleJobAsync(GetLearningModuleJobRequest request, final AsyncApiCallback<LearningModuleJobResponse> callback) {
    try {
      final SettableFuture<LearningModuleJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModuleJobResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific Learning Module job status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModuleJobResponse>> getLearningModuleJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModuleJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModuleJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModuleJobResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module preview
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModulePreviewGetResponse> getLearningModulePreviewAsync(GetLearningModulePreviewRequest request, final AsyncApiCallback<LearningModulePreviewGetResponse> callback) {
    try {
      final SettableFuture<LearningModulePreviewGetResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModulePreviewGetResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePreviewGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePreviewGetResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module preview
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModulePreviewGetResponse>> getLearningModulePreviewAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModulePreviewGetResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModulePreviewGetResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModulePreviewGetResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePreviewGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePreviewGetResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePreviewGetResponse> response = (ApiResponse<LearningModulePreviewGetResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePreviewGetResponse> response = (ApiResponse<LearningModulePreviewGetResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModuleRule> getLearningModuleRuleAsync(GetLearningModuleRuleRequest request, final AsyncApiCallback<LearningModuleRule> callback) {
    try {
      final SettableFuture<LearningModuleRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModuleRule>() {}, new AsyncApiCallback<ApiResponse<LearningModuleRule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleRule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a learning module rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModuleRule>> getLearningModuleRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModuleRule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModuleRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModuleRule>() {}, new AsyncApiCallback<ApiResponse<LearningModuleRule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specific version of a published module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModule> getLearningModuleVersionAsync(GetLearningModuleVersionRequest request, final AsyncApiCallback<LearningModule> callback) {
    try {
      final SettableFuture<LearningModule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specific version of a published module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModule>> getLearningModuleVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModulesDomainEntityListing> getLearningModulesAsync(GetLearningModulesRequest request, final AsyncApiCallback<LearningModulesDomainEntityListing> callback) {
    try {
      final SettableFuture<LearningModulesDomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModulesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<LearningModulesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulesDomainEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all learning modules of an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModulesDomainEntityListing>> getLearningModulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModulesDomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModulesDomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModulesDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<LearningModulesDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulesDomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulesDomainEntityListing> response = (ApiResponse<LearningModulesDomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulesDomainEntityListing> response = (ApiResponse<LearningModulesDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssignedLearningModuleDomainEntityListing> getLearningModulesAssignmentsAsync(GetLearningModulesAssignmentsRequest request, final AsyncApiCallback<AssignedLearningModuleDomainEntityListing> callback) {
    try {
      final SettableFuture<AssignedLearningModuleDomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssignedLearningModuleDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<AssignedLearningModuleDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AssignedLearningModuleDomainEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all learning modules of an organization including assignments for a specific user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssignedLearningModuleDomainEntityListing>> getLearningModulesAssignmentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AssignedLearningModuleDomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AssignedLearningModuleDomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssignedLearningModuleDomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<AssignedLearningModuleDomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AssignedLearningModuleDomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssignedLearningModuleDomainEntityListing> response = (ApiResponse<AssignedLearningModuleDomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssignedLearningModuleDomainEntityListing> response = (ApiResponse<AssignedLearningModuleDomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModuleCoverArtResponse> getLearningModulesCoverartCoverArtIdAsync(GetLearningModulesCoverartCoverArtIdRequest request, final AsyncApiCallback<LearningModuleCoverArtResponse> callback) {
    try {
      final SettableFuture<LearningModuleCoverArtResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModuleCoverArtResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleCoverArtResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleCoverArtResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a specific Learning Module cover art using ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModuleCoverArtResponse>> getLearningModulesCoverartCoverArtIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningModuleCoverArtResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModuleCoverArtResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModuleCoverArtResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleCoverArtResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleCoverArtResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleCoverArtResponse> response = (ApiResponse<LearningModuleCoverArtResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleCoverArtResponse> response = (ApiResponse<LearningModuleCoverArtResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningScormResponse> getLearningScormScormIdAsync(GetLearningScormScormIdRequest request, final AsyncApiCallback<LearningScormResponse> callback) {
    try {
      final SettableFuture<LearningScormResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningScormResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScormResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Learning SCORM Result
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningScormResponse>> getLearningScormScormIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningScormResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningScormResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningScormResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScormResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScormResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScormResponse> response = (ApiResponse<LearningScormResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScormResponse> response = (ApiResponse<LearningScormResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> patchLearningAssignmentAsync(PatchLearningAssignmentRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> patchLearningAssignmentAsync(ApiRequest<LearningAssignmentUpdate> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> patchLearningAssignmentRescheduleAsync(PatchLearningAssignmentRescheduleRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reschedule Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> patchLearningAssignmentRescheduleAsync(ApiRequest<LearningAssignmentReschedule> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentStep> patchLearningAssignmentStepAsync(PatchLearningAssignmentStepRequest request, final AsyncApiCallback<LearningAssignmentStep> callback) {
    try {
      final SettableFuture<LearningAssignmentStep> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentStep>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentStep>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentStep> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Learning Assignment Step
   * Permission not required if you are the assigned user of the learning assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentStep>> patchLearningAssignmentStepAsync(ApiRequest<LearningAssignmentStep> request, final AsyncApiCallback<ApiResponse<LearningAssignmentStep>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentStep>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentStep>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentStep>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentStep> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentStep> response = (ApiResponse<LearningAssignmentStep>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> patchLearningModuleUserAssignmentsAsync(PatchLearningModuleUserAssignmentsRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update an external assignment for a specific user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> patchLearningModuleUserAssignmentsAsync(ApiRequest<LearningAssignmentExternalUpdate> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Score learning assessment for preview
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssessmentScoringSet> postLearningAssessmentsScoringAsync(PostLearningAssessmentsScoringRequest request, final AsyncApiCallback<AssessmentScoringSet> callback) {
    try {
      final SettableFuture<AssessmentScoringSet> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssessmentScoringSet>() {}, new AsyncApiCallback<ApiResponse<AssessmentScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<AssessmentScoringSet> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Score learning assessment for preview
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssessmentScoringSet>> postLearningAssessmentsScoringAsync(ApiRequest<LearningAssessmentScoringRequest> request, final AsyncApiCallback<ApiResponse<AssessmentScoringSet>> callback) {
    try {
      final SettableFuture<ApiResponse<AssessmentScoringSet>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssessmentScoringSet>() {}, new AsyncApiCallback<ApiResponse<AssessmentScoringSet>>() {
        @Override
        public void onCompleted(ApiResponse<AssessmentScoringSet> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssessmentScoringSet> response = (ApiResponse<AssessmentScoringSet>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssessmentScoringSet> response = (ApiResponse<AssessmentScoringSet>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> postLearningAssignmentReassignAsync(PostLearningAssignmentReassignRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reassign Learning Assignment
   * This will reassign the state of the assignment to 'Assigned' and update the assignment to the latest version of the module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> postLearningAssignmentReassignAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> postLearningAssignmentResetAsync(PostLearningAssignmentResetRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Reset Learning Assignment
   * This will reset the state of the assignment to 'Assigned' and remove the version of Learning module associated with the assignment
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> postLearningAssignmentResetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignment> postLearningAssignmentsAsync(PostLearningAssignmentsRequest request, final AsyncApiCallback<LearningAssignment> callback) {
    try {
      final SettableFuture<LearningAssignment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create Learning Assignment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignment>> postLearningAssignmentsAsync(ApiRequest<LearningAssignmentCreate> request, final AsyncApiCallback<ApiResponse<LearningAssignment>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignment>() {}, new AsyncApiCallback<ApiResponse<LearningAssignment>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignment> response = (ApiResponse<LearningAssignment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentAggregateResponse> postLearningAssignmentsAggregatesQueryAsync(PostLearningAssignmentsAggregatesQueryRequest request, final AsyncApiCallback<LearningAssignmentAggregateResponse> callback) {
    try {
      final SettableFuture<LearningAssignmentAggregateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentAggregateResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentAggregateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentAggregateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve aggregated assignment data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentAggregateResponse>> postLearningAssignmentsAggregatesQueryAsync(ApiRequest<LearningAssignmentAggregateParam> request, final AsyncApiCallback<ApiResponse<LearningAssignmentAggregateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentAggregateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentAggregateResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentAggregateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentAggregateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentAggregateResponse> response = (ApiResponse<LearningAssignmentAggregateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentAggregateResponse> response = (ApiResponse<LearningAssignmentAggregateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple learning assignments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentBulkAddResponse> postLearningAssignmentsBulkaddAsync(PostLearningAssignmentsBulkaddRequest request, final AsyncApiCallback<LearningAssignmentBulkAddResponse> callback) {
    try {
      final SettableFuture<LearningAssignmentBulkAddResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentBulkAddResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentBulkAddResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentBulkAddResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Add multiple learning assignments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentBulkAddResponse>> postLearningAssignmentsBulkaddAsync(ApiRequest<List<LearningAssignmentItem>> request, final AsyncApiCallback<ApiResponse<LearningAssignmentBulkAddResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentBulkAddResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentBulkAddResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentBulkAddResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentBulkAddResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentBulkAddResponse> response = (ApiResponse<LearningAssignmentBulkAddResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentBulkAddResponse> response = (ApiResponse<LearningAssignmentBulkAddResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentBulkRemoveResponse> postLearningAssignmentsBulkremoveAsync(PostLearningAssignmentsBulkremoveRequest request, final AsyncApiCallback<LearningAssignmentBulkRemoveResponse> callback) {
    try {
      final SettableFuture<LearningAssignmentBulkRemoveResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentBulkRemoveResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentBulkRemoveResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentBulkRemoveResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Remove multiple Learning Assignments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentBulkRemoveResponse>> postLearningAssignmentsBulkremoveAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<LearningAssignmentBulkRemoveResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentBulkRemoveResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentBulkRemoveResponse>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentBulkRemoveResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentBulkRemoveResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentBulkRemoveResponse> response = (ApiResponse<LearningAssignmentBulkRemoveResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentBulkRemoveResponse> response = (ApiResponse<LearningAssignmentBulkRemoveResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModuleJobResponse> postLearningModuleJobsAsync(PostLearningModuleJobsRequest request, final AsyncApiCallback<LearningModuleJobResponse> callback) {
    try {
      final SettableFuture<LearningModuleJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModuleJobResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleJobResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Starts a specified operation on learning module
   * This will initiate operation specified in the request body for a learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModuleJobResponse>> postLearningModuleJobsAsync(ApiRequest<LearningModuleJobRequest> request, final AsyncApiCallback<ApiResponse<LearningModuleJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModuleJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModuleJobResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModuleJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleJobResponse> response = (ApiResponse<LearningModuleJobResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a Learning module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModulePublishResponse> postLearningModulePublishAsync(PostLearningModulePublishRequest request, final AsyncApiCallback<LearningModulePublishResponse> callback) {
    try {
      final SettableFuture<LearningModulePublishResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModulePublishResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePublishResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePublishResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a Learning module
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModulePublishResponse>> postLearningModulePublishAsync(ApiRequest<LearningModulePublishRequest> request, final AsyncApiCallback<ApiResponse<LearningModulePublishResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModulePublishResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModulePublishResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePublishResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePublishResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePublishResponse> response = (ApiResponse<LearningModulePublishResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePublishResponse> response = (ApiResponse<LearningModulePublishResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModule> postLearningModulesAsync(PostLearningModulesRequest request, final AsyncApiCallback<LearningModule> callback) {
    try {
      final SettableFuture<LearningModule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new learning module
   * This will create a new unpublished learning module with the specified fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModule>> postLearningModulesAsync(ApiRequest<LearningModuleRequest> request, final AsyncApiCallback<ApiResponse<LearningModule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningAssignmentUserListing> postLearningRulesQueryAsync(PostLearningRulesQueryRequest request, final AsyncApiCallback<LearningAssignmentUserListing> callback) {
    try {
      final SettableFuture<LearningAssignmentUserListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningAssignmentUserListing>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentUserListing>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentUserListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get users for learning module rule
   * This will get the users who matches the given rule.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningAssignmentUserListing>> postLearningRulesQueryAsync(ApiRequest<LearningAssignmentUserQuery> request, final AsyncApiCallback<ApiResponse<LearningAssignmentUserListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningAssignmentUserListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningAssignmentUserListing>() {}, new AsyncApiCallback<ApiResponse<LearningAssignmentUserListing>>() {
        @Override
        public void onCompleted(ApiResponse<LearningAssignmentUserListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentUserListing> response = (ApiResponse<LearningAssignmentUserListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningAssignmentUserListing> response = (ApiResponse<LearningAssignmentUserListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningScheduleSlotsQueryResponse> postLearningScheduleslotsQueryAsync(PostLearningScheduleslotsQueryRequest request, final AsyncApiCallback<LearningScheduleSlotsQueryResponse> callback) {
    try {
      final SettableFuture<LearningScheduleSlotsQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningScheduleSlotsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScheduleSlotsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScheduleSlotsQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of possible slots where a learning activity can be scheduled.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningScheduleSlotsQueryResponse>> postLearningScheduleslotsQueryAsync(ApiRequest<LearningScheduleSlotsQueryRequest> request, final AsyncApiCallback<ApiResponse<LearningScheduleSlotsQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningScheduleSlotsQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningScheduleSlotsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScheduleSlotsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScheduleSlotsQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScheduleSlotsQueryResponse> response = (ApiResponse<LearningScheduleSlotsQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScheduleSlotsQueryResponse> response = (ApiResponse<LearningScheduleSlotsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningScormUploadResponse> postLearningScormAsync(PostLearningScormRequest request, final AsyncApiCallback<LearningScormUploadResponse> callback) {
    try {
      final SettableFuture<LearningScormUploadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningScormUploadResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScormUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScormUploadResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a SCORM package upload request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningScormUploadResponse>> postLearningScormAsync(ApiRequest<LearningScormUploadRequest> request, final AsyncApiCallback<ApiResponse<LearningScormUploadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningScormUploadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningScormUploadResponse>() {}, new AsyncApiCallback<ApiResponse<LearningScormUploadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningScormUploadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScormUploadResponse> response = (ApiResponse<LearningScormUploadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningScormUploadResponse> response = (ApiResponse<LearningScormUploadResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModule> putLearningModuleAsync(PutLearningModuleRequest request, final AsyncApiCallback<LearningModule> callback) {
    try {
      final SettableFuture<LearningModule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module
   * This will update the name, description, completion time in days and inform steps for a learning module
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModule>> putLearningModuleAsync(ApiRequest<LearningModuleRequest> request, final AsyncApiCallback<ApiResponse<LearningModule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModule>() {}, new AsyncApiCallback<ApiResponse<LearningModule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModule> response = (ApiResponse<LearningModule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModulePreviewUpdateResponse> putLearningModulePreviewAsync(PutLearningModulePreviewRequest request, final AsyncApiCallback<LearningModulePreviewUpdateResponse> callback) {
    try {
      final SettableFuture<LearningModulePreviewUpdateResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModulePreviewUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePreviewUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePreviewUpdateResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module preview
   * This will update a learning module preview
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModulePreviewUpdateResponse>> putLearningModulePreviewAsync(ApiRequest<LearningModulePreviewUpdateRequest> request, final AsyncApiCallback<ApiResponse<LearningModulePreviewUpdateResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModulePreviewUpdateResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModulePreviewUpdateResponse>() {}, new AsyncApiCallback<ApiResponse<LearningModulePreviewUpdateResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModulePreviewUpdateResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePreviewUpdateResponse> response = (ApiResponse<LearningModulePreviewUpdateResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModulePreviewUpdateResponse> response = (ApiResponse<LearningModulePreviewUpdateResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LearningModuleRule> putLearningModuleRuleAsync(PutLearningModuleRuleRequest request, final AsyncApiCallback<LearningModuleRule> callback) {
    try {
      final SettableFuture<LearningModuleRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LearningModuleRule>() {}, new AsyncApiCallback<ApiResponse<LearningModuleRule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleRule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a learning module rule
   * This will update a learning module rule with the specified fields.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LearningModuleRule>> putLearningModuleRuleAsync(ApiRequest<LearningModuleRule> request, final AsyncApiCallback<ApiResponse<LearningModuleRule>> callback) {
    try {
      final SettableFuture<ApiResponse<LearningModuleRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LearningModuleRule>() {}, new AsyncApiCallback<ApiResponse<LearningModuleRule>>() {
        @Override
        public void onCompleted(ApiResponse<LearningModuleRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LearningModuleRule> response = (ApiResponse<LearningModuleRule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
