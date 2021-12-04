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
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;


import com.mypurecloud.sdk.v2.api.request.DeleteConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingmetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingmetadataRecordingIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetConversationRecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetOrphanrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingBatchrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobFailedrecordingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRecordingsScreensessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRecordingsScreensessionRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationRecordingAnnotationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingBatchrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingCrossplatformMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingLocalkeysSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingMediaretentionpoliciesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingRecordingkeysRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsDeletionprotectionRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsScreensessionsAcknowledgeRequest;
import com.mypurecloud.sdk.v2.api.request.PostRecordingsScreensessionsMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutConversationRecordingAnnotationRequest;
import com.mypurecloud.sdk.v2.api.request.PutOrphanrecordingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingCrossplatformMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingJobRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingLocalkeysSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingMediaretentionpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingRecordingkeysRotationscheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRecordingsDeletionprotectionRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class RecordingApiAsync {
  private final ApiClient pcapiClient;

  public RecordingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteConversationRecordingAnnotationAsync(DeleteConversationRecordingAnnotationRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteConversationRecordingAnnotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Deletes a single orphan recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrphanRecording> deleteOrphanrecordingAsync(DeleteOrphanrecordingRequest request, final AsyncApiCallback<OrphanRecording> callback) {
    try {
      final SettableFuture<OrphanRecording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrphanRecording>() {}, new AsyncApiCallback<ApiResponse<OrphanRecording>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecording> response) {
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
   * Deletes a single orphan recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrphanRecording>> deleteOrphanrecordingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrphanRecording>> callback) {
    try {
      final SettableFuture<ApiResponse<OrphanRecording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrphanRecording>() {}, new AsyncApiCallback<ApiResponse<OrphanRecording>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteRecordingCrossplatformMediaretentionpoliciesAsync(DeleteRecordingCrossplatformMediaretentionpoliciesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteRecordingCrossplatformMediaretentionpoliciesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteRecordingCrossplatformMediaretentionpolicyAsync(DeleteRecordingCrossplatformMediaretentionpolicyRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteRecordingCrossplatformMediaretentionpolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete the recording bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteRecordingJobAsync(DeleteRecordingJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete the recording bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteRecordingJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteRecordingMediaretentionpoliciesAsync(DeleteRecordingMediaretentionpoliciesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete media retention policies
   * Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteRecordingMediaretentionpoliciesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteRecordingMediaretentionpolicyAsync(DeleteRecordingMediaretentionpolicyRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteRecordingMediaretentionpolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Gets a specific recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Recording> getConversationRecordingAsync(GetConversationRecordingRequest request, final AsyncApiCallback<Recording> callback) {
    try {
      final SettableFuture<Recording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
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
   * Gets a specific recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Recording>> getConversationRecordingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Recording>> callback) {
    try {
      final SettableFuture<ApiResponse<Recording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Annotation> getConversationRecordingAnnotationAsync(GetConversationRecordingAnnotationRequest request, final AsyncApiCallback<Annotation> callback) {
    try {
      final SettableFuture<Annotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
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
   * Get annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Annotation>> getConversationRecordingAnnotationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Annotation>> callback) {
    try {
      final SettableFuture<ApiResponse<Annotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get annotations for recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<Annotation>> getConversationRecordingAnnotationsAsync(GetConversationRecordingAnnotationsRequest request, final AsyncApiCallback<List<Annotation>> callback) {
    try {
      final SettableFuture<List<Annotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<Annotation>>() {}, new AsyncApiCallback<ApiResponse<List<Annotation>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Annotation>> response) {
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
   * Get annotations for recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<Annotation>>> getConversationRecordingAnnotationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<Annotation>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<Annotation>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<Annotation>>() {}, new AsyncApiCallback<ApiResponse<List<Annotation>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Annotation>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Annotation>> response = (ApiResponse<List<Annotation>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Annotation>> response = (ApiResponse<List<Annotation>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get recording metadata for a conversation. Does not return playable media.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<RecordingMetadata>> getConversationRecordingmetadataAsync(GetConversationRecordingmetadataRequest request, final AsyncApiCallback<List<RecordingMetadata>> callback) {
    try {
      final SettableFuture<List<RecordingMetadata>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<RecordingMetadata>>() {}, new AsyncApiCallback<ApiResponse<List<RecordingMetadata>>>() {
        @Override
        public void onCompleted(ApiResponse<List<RecordingMetadata>> response) {
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
   * Get recording metadata for a conversation. Does not return playable media.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<RecordingMetadata>>> getConversationRecordingmetadataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<RecordingMetadata>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<RecordingMetadata>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<RecordingMetadata>>() {}, new AsyncApiCallback<ApiResponse<List<RecordingMetadata>>>() {
        @Override
        public void onCompleted(ApiResponse<List<RecordingMetadata>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<RecordingMetadata>> response = (ApiResponse<List<RecordingMetadata>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<RecordingMetadata>> response = (ApiResponse<List<RecordingMetadata>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingMetadata> getConversationRecordingmetadataRecordingIdAsync(GetConversationRecordingmetadataRecordingIdRequest request, final AsyncApiCallback<RecordingMetadata> callback) {
    try {
      final SettableFuture<RecordingMetadata> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingMetadata>() {}, new AsyncApiCallback<ApiResponse<RecordingMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingMetadata> response) {
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
   * Get metadata for a specific recording. Does not return playable media.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingMetadata>> getConversationRecordingmetadataRecordingIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RecordingMetadata>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingMetadata>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingMetadata>() {}, new AsyncApiCallback<ApiResponse<RecordingMetadata>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingMetadata> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingMetadata> response = (ApiResponse<RecordingMetadata>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingMetadata> response = (ApiResponse<RecordingMetadata>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<Recording>> getConversationRecordingsAsync(GetConversationRecordingsRequest request, final AsyncApiCallback<List<Recording>> callback) {
    try {
      final SettableFuture<List<Recording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<Recording>>() {}, new AsyncApiCallback<ApiResponse<List<Recording>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Recording>> response) {
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
   * Get all of a Conversation&#39;s Recordings.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<Recording>>> getConversationRecordingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<Recording>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<Recording>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<Recording>>() {}, new AsyncApiCallback<ApiResponse<List<Recording>>>() {
        @Override
        public void onCompleted(ApiResponse<List<Recording>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Recording>> response = (ApiResponse<List<Recording>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<Recording>> response = (ApiResponse<List<Recording>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets a single orphan recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrphanRecording> getOrphanrecordingAsync(GetOrphanrecordingRequest request, final AsyncApiCallback<OrphanRecording> callback) {
    try {
      final SettableFuture<OrphanRecording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrphanRecording>() {}, new AsyncApiCallback<ApiResponse<OrphanRecording>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecording> response) {
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
   * Gets a single orphan recording
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrphanRecording>> getOrphanrecordingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrphanRecording>> callback) {
    try {
      final SettableFuture<ApiResponse<OrphanRecording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrphanRecording>() {}, new AsyncApiCallback<ApiResponse<OrphanRecording>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecording> response = (ApiResponse<OrphanRecording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Recording> getOrphanrecordingMediaAsync(GetOrphanrecordingMediaRequest request, final AsyncApiCallback<Recording> callback) {
    try {
      final SettableFuture<Recording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
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
   * Gets the media of a single orphan recording
   * A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Recording>> getOrphanrecordingMediaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Recording>> callback) {
    try {
      final SettableFuture<ApiResponse<Recording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets all orphan recordings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrphanRecordingListing> getOrphanrecordingsAsync(GetOrphanrecordingsRequest request, final AsyncApiCallback<OrphanRecordingListing> callback) {
    try {
      final SettableFuture<OrphanRecordingListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrphanRecordingListing>() {}, new AsyncApiCallback<ApiResponse<OrphanRecordingListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecordingListing> response) {
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
   * Gets all orphan recordings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrphanRecordingListing>> getOrphanrecordingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrphanRecordingListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrphanRecordingListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrphanRecordingListing>() {}, new AsyncApiCallback<ApiResponse<OrphanRecordingListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrphanRecordingListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecordingListing> response = (ApiResponse<OrphanRecordingListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrphanRecordingListing> response = (ApiResponse<OrphanRecordingListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BatchDownloadJobStatusResult> getRecordingBatchrequestAsync(GetRecordingBatchrequestRequest request, final AsyncApiCallback<BatchDownloadJobStatusResult> callback) {
    try {
      final SettableFuture<BatchDownloadJobStatusResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BatchDownloadJobStatusResult>() {}, new AsyncApiCallback<ApiResponse<BatchDownloadJobStatusResult>>() {
        @Override
        public void onCompleted(ApiResponse<BatchDownloadJobStatusResult> response) {
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
   * Get the status and results for a batch request job, only the user that submitted the job may retrieve results
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BatchDownloadJobStatusResult>> getRecordingBatchrequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BatchDownloadJobStatusResult>> callback) {
    try {
      final SettableFuture<ApiResponse<BatchDownloadJobStatusResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BatchDownloadJobStatusResult>() {}, new AsyncApiCallback<ApiResponse<BatchDownloadJobStatusResult>>() {
        @Override
        public void onCompleted(ApiResponse<BatchDownloadJobStatusResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchDownloadJobStatusResult> response = (ApiResponse<BatchDownloadJobStatusResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchDownloadJobStatusResult> response = (ApiResponse<BatchDownloadJobStatusResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PolicyEntityListing> getRecordingCrossplatformMediaretentionpoliciesAsync(GetRecordingCrossplatformMediaretentionpoliciesRequest request, final AsyncApiCallback<PolicyEntityListing> callback) {
    try {
      final SettableFuture<PolicyEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {}, new AsyncApiCallback<ApiResponse<PolicyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PolicyEntityListing> response) {
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
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PolicyEntityListing>> getRecordingCrossplatformMediaretentionpoliciesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PolicyEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PolicyEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PolicyEntityListing>() {}, new AsyncApiCallback<ApiResponse<PolicyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PolicyEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CrossPlatformPolicy> getRecordingCrossplatformMediaretentionpolicyAsync(GetRecordingCrossplatformMediaretentionpolicyRequest request, final AsyncApiCallback<CrossPlatformPolicy> callback) {
    try {
      final SettableFuture<CrossPlatformPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
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
   * Get a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CrossPlatformPolicy>> getRecordingCrossplatformMediaretentionpolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CrossPlatformPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<CrossPlatformPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status of the job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingJob> getRecordingJobAsync(GetRecordingJobRequest request, final AsyncApiCallback<RecordingJob> callback) {
    try {
      final SettableFuture<RecordingJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
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
   * Get the status of the job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingJob>> getRecordingJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RecordingJob>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FailedRecordingEntityListing> getRecordingJobFailedrecordingsAsync(GetRecordingJobFailedrecordingsRequest request, final AsyncApiCallback<FailedRecordingEntityListing> callback) {
    try {
      final SettableFuture<FailedRecordingEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FailedRecordingEntityListing>() {}, new AsyncApiCallback<ApiResponse<FailedRecordingEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FailedRecordingEntityListing> response) {
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
   * Get IDs of recordings that the bulk job failed for
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FailedRecordingEntityListing>> getRecordingJobFailedrecordingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FailedRecordingEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FailedRecordingEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FailedRecordingEntityListing>() {}, new AsyncApiCallback<ApiResponse<FailedRecordingEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FailedRecordingEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FailedRecordingEntityListing> response = (ApiResponse<FailedRecordingEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FailedRecordingEntityListing> response = (ApiResponse<FailedRecordingEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status of all jobs within the user&#39;s organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingJobEntityListing> getRecordingJobsAsync(GetRecordingJobsRequest request, final AsyncApiCallback<RecordingJobEntityListing> callback) {
    try {
      final SettableFuture<RecordingJobEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingJobEntityListing>() {}, new AsyncApiCallback<ApiResponse<RecordingJobEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJobEntityListing> response) {
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
   * Get the status of all jobs within the user&#39;s organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingJobEntityListing>> getRecordingJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RecordingJobEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingJobEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingJobEntityListing>() {}, new AsyncApiCallback<ApiResponse<RecordingJobEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJobEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJobEntityListing> response = (ApiResponse<RecordingJobEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJobEntityListing> response = (ApiResponse<RecordingJobEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the local encryption settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocalEncryptionConfiguration> getRecordingLocalkeysSettingAsync(GetRecordingLocalkeysSettingRequest request, final AsyncApiCallback<LocalEncryptionConfiguration> callback) {
    try {
      final SettableFuture<LocalEncryptionConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
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
   * Get the local encryption settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> getRecordingLocalkeysSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<LocalEncryptionConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
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
   * gets a list local key settings data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocalEncryptionConfigurationListing> getRecordingLocalkeysSettingsAsync(GetRecordingLocalkeysSettingsRequest request, final AsyncApiCallback<LocalEncryptionConfigurationListing> callback) {
    try {
      final SettableFuture<LocalEncryptionConfigurationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfigurationListing>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfigurationListing>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfigurationListing> response) {
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
   * gets a list local key settings data
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocalEncryptionConfigurationListing>> getRecordingLocalkeysSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LocalEncryptionConfigurationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LocalEncryptionConfigurationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocalEncryptionConfigurationListing>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfigurationListing>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfigurationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfigurationListing> response = (ApiResponse<LocalEncryptionConfigurationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfigurationListing> response = (ApiResponse<LocalEncryptionConfigurationListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PolicyEntityListing> getRecordingMediaretentionpoliciesAsync(GetRecordingMediaretentionpoliciesRequest request, final AsyncApiCallback<PolicyEntityListing> callback) {
    try {
      final SettableFuture<PolicyEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PolicyEntityListing>() {}, new AsyncApiCallback<ApiResponse<PolicyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PolicyEntityListing> response) {
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
   * Gets media retention policy list with query options to filter on name and enabled.
   * for a less verbose response, add summary=true to this endpoint
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PolicyEntityListing>> getRecordingMediaretentionpoliciesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PolicyEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PolicyEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PolicyEntityListing>() {}, new AsyncApiCallback<ApiResponse<PolicyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PolicyEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PolicyEntityListing> response = (ApiResponse<PolicyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Policy> getRecordingMediaretentionpolicyAsync(GetRecordingMediaretentionpolicyRequest request, final AsyncApiCallback<Policy> callback) {
    try {
      final SettableFuture<Policy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
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
   * Get a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Policy>> getRecordingMediaretentionpolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Policy>> callback) {
    try {
      final SettableFuture<ApiResponse<Policy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get encryption key list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EncryptionKeyEntityListing> getRecordingRecordingkeysAsync(GetRecordingRecordingkeysRequest request, final AsyncApiCallback<EncryptionKeyEntityListing> callback) {
    try {
      final SettableFuture<EncryptionKeyEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EncryptionKeyEntityListing>() {}, new AsyncApiCallback<ApiResponse<EncryptionKeyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKeyEntityListing> response) {
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
   * Get encryption key list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EncryptionKeyEntityListing>> getRecordingRecordingkeysAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EncryptionKeyEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EncryptionKeyEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EncryptionKeyEntityListing>() {}, new AsyncApiCallback<ApiResponse<EncryptionKeyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKeyEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKeyEntityListing> response = (ApiResponse<EncryptionKeyEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKeyEntityListing> response = (ApiResponse<EncryptionKeyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get key rotation schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KeyRotationSchedule> getRecordingRecordingkeysRotationscheduleAsync(GetRecordingRecordingkeysRotationscheduleRequest request, final AsyncApiCallback<KeyRotationSchedule> callback) {
    try {
      final SettableFuture<KeyRotationSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {}, new AsyncApiCallback<ApiResponse<KeyRotationSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<KeyRotationSchedule> response) {
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
   * Get key rotation schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KeyRotationSchedule>> getRecordingRecordingkeysRotationscheduleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<KeyRotationSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<KeyRotationSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KeyRotationSchedule>() {}, new AsyncApiCallback<ApiResponse<KeyRotationSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<KeyRotationSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the Recording Settings for the Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingSettings> getRecordingSettingsAsync(GetRecordingSettingsRequest request, final AsyncApiCallback<RecordingSettings> callback) {
    try {
      final SettableFuture<RecordingSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingSettings>() {}, new AsyncApiCallback<ApiResponse<RecordingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingSettings> response) {
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
   * Get the Recording Settings for the Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingSettings>> getRecordingSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<RecordingSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingSettings>() {}, new AsyncApiCallback<ApiResponse<RecordingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves a paged listing of screen recording sessions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScreenRecordingSessionListing> getRecordingsScreensessionsAsync(GetRecordingsScreensessionsRequest request, final AsyncApiCallback<ScreenRecordingSessionListing> callback) {
    try {
      final SettableFuture<ScreenRecordingSessionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScreenRecordingSessionListing>() {}, new AsyncApiCallback<ApiResponse<ScreenRecordingSessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScreenRecordingSessionListing> response) {
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
   * Retrieves a paged listing of screen recording sessions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScreenRecordingSessionListing>> getRecordingsScreensessionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScreenRecordingSessionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ScreenRecordingSessionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScreenRecordingSessionListing>() {}, new AsyncApiCallback<ApiResponse<ScreenRecordingSessionListing>>() {
        @Override
        public void onCompleted(ApiResponse<ScreenRecordingSessionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScreenRecordingSessionListing> response = (ApiResponse<ScreenRecordingSessionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScreenRecordingSessionListing> response = (ApiResponse<ScreenRecordingSessionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CrossPlatformPolicy> patchRecordingCrossplatformMediaretentionpolicyAsync(PatchRecordingCrossplatformMediaretentionpolicyRequest request, final AsyncApiCallback<CrossPlatformPolicy> callback) {
    try {
      final SettableFuture<CrossPlatformPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
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
   * Patch a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CrossPlatformPolicy>> patchRecordingCrossplatformMediaretentionpolicyAsync(ApiRequest<CrossPlatformPolicyUpdate> request, final AsyncApiCallback<ApiResponse<CrossPlatformPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<CrossPlatformPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Policy> patchRecordingMediaretentionpolicyAsync(PatchRecordingMediaretentionpolicyRequest request, final AsyncApiCallback<Policy> callback) {
    try {
      final SettableFuture<Policy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
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
   * Patch a media retention policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Policy>> patchRecordingMediaretentionpolicyAsync(ApiRequest<PolicyUpdate> request, final AsyncApiCallback<ApiResponse<Policy>> callback) {
    try {
      final SettableFuture<ApiResponse<Policy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a screen recording session
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchRecordingsScreensessionAsync(PatchRecordingsScreensessionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Update a screen recording session
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchRecordingsScreensessionAsync(ApiRequest<ScreenRecordingSessionRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Create annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Annotation> postConversationRecordingAnnotationsAsync(PostConversationRecordingAnnotationsRequest request, final AsyncApiCallback<Annotation> callback) {
    try {
      final SettableFuture<Annotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
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
   * Create annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Annotation>> postConversationRecordingAnnotationsAsync(ApiRequest<Annotation> request, final AsyncApiCallback<ApiResponse<Annotation>> callback) {
    try {
      final SettableFuture<ApiResponse<Annotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BatchDownloadJobSubmissionResult> postRecordingBatchrequestsAsync(PostRecordingBatchrequestsRequest request, final AsyncApiCallback<BatchDownloadJobSubmissionResult> callback) {
    try {
      final SettableFuture<BatchDownloadJobSubmissionResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BatchDownloadJobSubmissionResult>() {}, new AsyncApiCallback<ApiResponse<BatchDownloadJobSubmissionResult>>() {
        @Override
        public void onCompleted(ApiResponse<BatchDownloadJobSubmissionResult> response) {
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
   * Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BatchDownloadJobSubmissionResult>> postRecordingBatchrequestsAsync(ApiRequest<BatchDownloadJobSubmission> request, final AsyncApiCallback<ApiResponse<BatchDownloadJobSubmissionResult>> callback) {
    try {
      final SettableFuture<ApiResponse<BatchDownloadJobSubmissionResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BatchDownloadJobSubmissionResult>() {}, new AsyncApiCallback<ApiResponse<BatchDownloadJobSubmissionResult>>() {
        @Override
        public void onCompleted(ApiResponse<BatchDownloadJobSubmissionResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchDownloadJobSubmissionResult> response = (ApiResponse<BatchDownloadJobSubmissionResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchDownloadJobSubmissionResult> response = (ApiResponse<BatchDownloadJobSubmissionResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CrossPlatformPolicy> postRecordingCrossplatformMediaretentionpoliciesAsync(PostRecordingCrossplatformMediaretentionpoliciesRequest request, final AsyncApiCallback<CrossPlatformPolicy> callback) {
    try {
      final SettableFuture<CrossPlatformPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
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
   * Create media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CrossPlatformPolicy>> postRecordingCrossplatformMediaretentionpoliciesAsync(ApiRequest<CrossPlatformPolicyCreate> request, final AsyncApiCallback<ApiResponse<CrossPlatformPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<CrossPlatformPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a recording bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingJob> postRecordingJobsAsync(PostRecordingJobsRequest request, final AsyncApiCallback<RecordingJob> callback) {
    try {
      final SettableFuture<RecordingJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
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
   * Create a recording bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingJob>> postRecordingJobsAsync(ApiRequest<RecordingJobsQuery> request, final AsyncApiCallback<ApiResponse<RecordingJob>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * create a local recording key
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EncryptionKey> postRecordingLocalkeysAsync(PostRecordingLocalkeysRequest request, final AsyncApiCallback<EncryptionKey> callback) {
    try {
      final SettableFuture<EncryptionKey> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EncryptionKey>() {}, new AsyncApiCallback<ApiResponse<EncryptionKey>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKey> response) {
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
   * create a local recording key
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EncryptionKey>> postRecordingLocalkeysAsync(ApiRequest<LocalEncryptionKeyRequest> request, final AsyncApiCallback<ApiResponse<EncryptionKey>> callback) {
    try {
      final SettableFuture<ApiResponse<EncryptionKey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EncryptionKey>() {}, new AsyncApiCallback<ApiResponse<EncryptionKey>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKey> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)(new ApiException(exception));
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
   * create settings for local key creation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocalEncryptionConfiguration> postRecordingLocalkeysSettingsAsync(PostRecordingLocalkeysSettingsRequest request, final AsyncApiCallback<LocalEncryptionConfiguration> callback) {
    try {
      final SettableFuture<LocalEncryptionConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
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
   * create settings for local key creation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> postRecordingLocalkeysSettingsAsync(ApiRequest<LocalEncryptionConfiguration> request, final AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<LocalEncryptionConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Policy> postRecordingMediaretentionpoliciesAsync(PostRecordingMediaretentionpoliciesRequest request, final AsyncApiCallback<Policy> callback) {
    try {
      final SettableFuture<Policy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
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
   * Create media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Policy>> postRecordingMediaretentionpoliciesAsync(ApiRequest<PolicyCreate> request, final AsyncApiCallback<ApiResponse<Policy>> callback) {
    try {
      final SettableFuture<ApiResponse<Policy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create encryption key
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EncryptionKey> postRecordingRecordingkeysAsync(PostRecordingRecordingkeysRequest request, final AsyncApiCallback<EncryptionKey> callback) {
    try {
      final SettableFuture<EncryptionKey> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EncryptionKey>() {}, new AsyncApiCallback<ApiResponse<EncryptionKey>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKey> response) {
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
   * Create encryption key
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EncryptionKey>> postRecordingRecordingkeysAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EncryptionKey>> callback) {
    try {
      final SettableFuture<ApiResponse<EncryptionKey>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EncryptionKey>() {}, new AsyncApiCallback<ApiResponse<EncryptionKey>>() {
        @Override
        public void onCompleted(ApiResponse<EncryptionKey> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EncryptionKey> response = (ApiResponse<EncryptionKey>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of conversations with protected recordings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<AddressableEntityRef>> postRecordingsDeletionprotectionAsync(PostRecordingsDeletionprotectionRequest request, final AsyncApiCallback<List<AddressableEntityRef>> callback) {
    try {
      final SettableFuture<List<AddressableEntityRef>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<AddressableEntityRef>>() {}, new AsyncApiCallback<ApiResponse<List<AddressableEntityRef>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AddressableEntityRef>> response) {
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
   * Get a list of conversations with protected recordings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<AddressableEntityRef>>> postRecordingsDeletionprotectionAsync(ApiRequest<ConversationDeletionProtectionQuery> request, final AsyncApiCallback<ApiResponse<List<AddressableEntityRef>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<AddressableEntityRef>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<AddressableEntityRef>>() {}, new AsyncApiCallback<ApiResponse<List<AddressableEntityRef>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AddressableEntityRef>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AddressableEntityRef>> response = (ApiResponse<List<AddressableEntityRef>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AddressableEntityRef>> response = (ApiResponse<List<AddressableEntityRef>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Acknowledge a screen recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postRecordingsScreensessionsAcknowledgeAsync(PostRecordingsScreensessionsAcknowledgeRequest request, final AsyncApiCallback<Void> callback) {
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
   * Acknowledge a screen recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postRecordingsScreensessionsAcknowledgeAsync(ApiRequest<AcknowledgeScreenRecordingRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Provide meta-data a screen recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postRecordingsScreensessionsMetadataAsync(PostRecordingsScreensessionsMetadataRequest request, final AsyncApiCallback<Void> callback) {
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
   * Provide meta-data a screen recording.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postRecordingsScreensessionsMetadataAsync(ApiRequest<ScreenRecordingMetaDataRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Recording> putConversationRecordingAsync(PutConversationRecordingRequest request, final AsyncApiCallback<Recording> callback) {
    try {
      final SettableFuture<Recording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
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
   * Updates the retention records on a recording.
   * Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Recording>> putConversationRecordingAsync(ApiRequest<Recording> request, final AsyncApiCallback<ApiResponse<Recording>> callback) {
    try {
      final SettableFuture<ApiResponse<Recording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Annotation> putConversationRecordingAnnotationAsync(PutConversationRecordingAnnotationRequest request, final AsyncApiCallback<Annotation> callback) {
    try {
      final SettableFuture<Annotation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
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
   * Update annotation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Annotation>> putConversationRecordingAnnotationAsync(ApiRequest<Annotation> request, final AsyncApiCallback<ApiResponse<Annotation>> callback) {
    try {
      final SettableFuture<ApiResponse<Annotation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Annotation>() {}, new AsyncApiCallback<ApiResponse<Annotation>>() {
        @Override
        public void onCompleted(ApiResponse<Annotation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Annotation> response = (ApiResponse<Annotation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Recording> putOrphanrecordingAsync(PutOrphanrecordingRequest request, final AsyncApiCallback<Recording> callback) {
    try {
      final SettableFuture<Recording> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
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
   * Updates an orphan recording to a regular recording with retention values
   * If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Recording>> putOrphanrecordingAsync(ApiRequest<OrphanUpdateRequest> request, final AsyncApiCallback<ApiResponse<Recording>> callback) {
    try {
      final SettableFuture<ApiResponse<Recording>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Recording>() {}, new AsyncApiCallback<ApiResponse<Recording>>() {
        @Override
        public void onCompleted(ApiResponse<Recording> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Recording> response = (ApiResponse<Recording>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CrossPlatformPolicy> putRecordingCrossplatformMediaretentionpolicyAsync(PutRecordingCrossplatformMediaretentionpolicyRequest request, final AsyncApiCallback<CrossPlatformPolicy> callback) {
    try {
      final SettableFuture<CrossPlatformPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
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
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CrossPlatformPolicy>> putRecordingCrossplatformMediaretentionpolicyAsync(ApiRequest<CrossPlatformPolicy> request, final AsyncApiCallback<ApiResponse<CrossPlatformPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<CrossPlatformPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CrossPlatformPolicy>() {}, new AsyncApiCallback<ApiResponse<CrossPlatformPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<CrossPlatformPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CrossPlatformPolicy> response = (ApiResponse<CrossPlatformPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording&#39;s retention.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingJob> putRecordingJobAsync(PutRecordingJobRequest request, final AsyncApiCallback<RecordingJob> callback) {
    try {
      final SettableFuture<RecordingJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
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
   * Execute the recording bulk job.
   * A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording&#39;s retention.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingJob>> putRecordingJobAsync(ApiRequest<ExecuteRecordingJobsQuery> request, final AsyncApiCallback<ApiResponse<RecordingJob>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingJob>() {}, new AsyncApiCallback<ApiResponse<RecordingJob>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingJob> response = (ApiResponse<RecordingJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the local encryption settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocalEncryptionConfiguration> putRecordingLocalkeysSettingAsync(PutRecordingLocalkeysSettingRequest request, final AsyncApiCallback<LocalEncryptionConfiguration> callback) {
    try {
      final SettableFuture<LocalEncryptionConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
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
   * Update the local encryption settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocalEncryptionConfiguration>> putRecordingLocalkeysSettingAsync(ApiRequest<LocalEncryptionConfiguration> request, final AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<LocalEncryptionConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocalEncryptionConfiguration>() {}, new AsyncApiCallback<ApiResponse<LocalEncryptionConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LocalEncryptionConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocalEncryptionConfiguration> response = (ApiResponse<LocalEncryptionConfiguration>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Policy> putRecordingMediaretentionpolicyAsync(PutRecordingMediaretentionpolicyRequest request, final AsyncApiCallback<Policy> callback) {
    try {
      final SettableFuture<Policy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
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
   * Update a media retention policy
   * Policy does not work retroactively
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Policy>> putRecordingMediaretentionpolicyAsync(ApiRequest<Policy> request, final AsyncApiCallback<ApiResponse<Policy>> callback) {
    try {
      final SettableFuture<ApiResponse<Policy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Policy>() {}, new AsyncApiCallback<ApiResponse<Policy>>() {
        @Override
        public void onCompleted(ApiResponse<Policy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Policy> response = (ApiResponse<Policy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update key rotation schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<KeyRotationSchedule> putRecordingRecordingkeysRotationscheduleAsync(PutRecordingRecordingkeysRotationscheduleRequest request, final AsyncApiCallback<KeyRotationSchedule> callback) {
    try {
      final SettableFuture<KeyRotationSchedule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KeyRotationSchedule>() {}, new AsyncApiCallback<ApiResponse<KeyRotationSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<KeyRotationSchedule> response) {
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
   * Update key rotation schedule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<KeyRotationSchedule>> putRecordingRecordingkeysRotationscheduleAsync(ApiRequest<KeyRotationSchedule> request, final AsyncApiCallback<ApiResponse<KeyRotationSchedule>> callback) {
    try {
      final SettableFuture<ApiResponse<KeyRotationSchedule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KeyRotationSchedule>() {}, new AsyncApiCallback<ApiResponse<KeyRotationSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<KeyRotationSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KeyRotationSchedule> response = (ApiResponse<KeyRotationSchedule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the Recording Settings for the Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RecordingSettings> putRecordingSettingsAsync(PutRecordingSettingsRequest request, final AsyncApiCallback<RecordingSettings> callback) {
    try {
      final SettableFuture<RecordingSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RecordingSettings>() {}, new AsyncApiCallback<ApiResponse<RecordingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingSettings> response) {
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
   * Update the Recording Settings for the Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RecordingSettings>> putRecordingSettingsAsync(ApiRequest<RecordingSettings> request, final AsyncApiCallback<ApiResponse<RecordingSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<RecordingSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RecordingSettings>() {}, new AsyncApiCallback<ApiResponse<RecordingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<RecordingSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RecordingSettings> response = (ApiResponse<RecordingSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Apply or revoke recording protection for conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> putRecordingsDeletionprotectionAsync(PutRecordingsDeletionprotectionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Apply or revoke recording protection for conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> putRecordingsDeletionprotectionAsync(ApiRequest<ConversationDeletionProtectionQuery> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
