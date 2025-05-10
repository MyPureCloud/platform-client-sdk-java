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

import com.mypurecloud.sdk.v2.model.AutoAnswerSettings;
import com.mypurecloud.sdk.v2.model.EmailSettings;
import com.mypurecloud.sdk.v2.model.EmailThreadingSettings;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataGlobalSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;
import com.mypurecloud.sdk.v2.model.ExternalContactsSettings;
import com.mypurecloud.sdk.v2.model.UpdatedSettingsResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteExternalcontactsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchEmailsSettingsThreadingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSettingsExecutiondataRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutExternalcontactsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class SettingsApiAsync {
  private final ApiClient pcapiClient;

  public SettingsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SettingsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Reset email threading settings to default
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteEmailsSettingsThreadingAsync(DeleteEmailsSettingsThreadingRequest request, final AsyncApiCallback<Void> callback) {
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
   * Reset email threading settings to default
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteEmailsSettingsThreadingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UpdatedSettingsResponse> deleteExternalcontactsSettingsAsync(DeleteExternalcontactsSettingsRequest request, final AsyncApiCallback<UpdatedSettingsResponse> callback) {
    try {
      final SettableFuture<UpdatedSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UpdatedSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdatedSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UpdatedSettingsResponse>> deleteExternalcontactsSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UpdatedSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UpdatedSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdatedSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdatedSettingsResponse> response = (ApiResponse<UpdatedSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdatedSettingsResponse> response = (ApiResponse<UpdatedSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get email Contact Center settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailSettings> getEmailsSettingsAsync(GetEmailsSettingsRequest request, final AsyncApiCallback<EmailSettings> callback) {
    try {
      final SettableFuture<EmailSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailSettings>() {}, new AsyncApiCallback<ApiResponse<EmailSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get email Contact Center settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailSettings>> getEmailsSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmailSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailSettings>() {}, new AsyncApiCallback<ApiResponse<EmailSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get email threading settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailThreadingSettings> getEmailsSettingsThreadingAsync(GetEmailsSettingsThreadingRequest request, final AsyncApiCallback<EmailThreadingSettings> callback) {
    try {
      final SettableFuture<EmailThreadingSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailThreadingSettings>() {}, new AsyncApiCallback<ApiResponse<EmailThreadingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailThreadingSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get email threading settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailThreadingSettings>> getEmailsSettingsThreadingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmailThreadingSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailThreadingSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailThreadingSettings>() {}, new AsyncApiCallback<ApiResponse<EmailThreadingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailThreadingSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExternalContactsSettings> getExternalcontactsSettingsAsync(GetExternalcontactsSettingsRequest request, final AsyncApiCallback<ExternalContactsSettings> callback) {
    try {
      final SettableFuture<ExternalContactsSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExternalContactsSettings>() {}, new AsyncApiCallback<ApiResponse<ExternalContactsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContactsSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExternalContactsSettings>> getExternalcontactsSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExternalContactsSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ExternalContactsSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExternalContactsSettings>() {}, new AsyncApiCallback<ApiResponse<ExternalContactsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ExternalContactsSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContactsSettings> response = (ApiResponse<ExternalContactsSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExternalContactsSettings> response = (ApiResponse<ExternalContactsSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExecutionDataGlobalSettingsResponse> getSettingsExecutiondataAsync(GetSettingsExecutiondataRequest request, final AsyncApiCallback<ExecutionDataGlobalSettingsResponse> callback) {
    try {
      final SettableFuture<ExecutionDataGlobalSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExecutionDataGlobalSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataGlobalSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the execution history enabled setting.
   * Get the execution history enabled setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExecutionDataGlobalSettingsResponse>> getSettingsExecutiondataAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ExecutionDataGlobalSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExecutionDataGlobalSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataGlobalSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AutoAnswerSettings> getUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request, final AsyncApiCallback<AutoAnswerSettings> callback) {
    try {
      final SettableFuture<AutoAnswerSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AutoAnswerSettings>> getUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AutoAnswerSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<AutoAnswerSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch email Contact Center settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailSettings> patchEmailsSettingsAsync(PatchEmailsSettingsRequest request, final AsyncApiCallback<EmailSettings> callback) {
    try {
      final SettableFuture<EmailSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailSettings>() {}, new AsyncApiCallback<ApiResponse<EmailSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch email Contact Center settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailSettings>> patchEmailsSettingsAsync(ApiRequest<EmailSettings> request, final AsyncApiCallback<ApiResponse<EmailSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailSettings>() {}, new AsyncApiCallback<ApiResponse<EmailSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailSettings> response = (ApiResponse<EmailSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch email threading settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmailThreadingSettings> patchEmailsSettingsThreadingAsync(PatchEmailsSettingsThreadingRequest request, final AsyncApiCallback<EmailThreadingSettings> callback) {
    try {
      final SettableFuture<EmailThreadingSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmailThreadingSettings>() {}, new AsyncApiCallback<ApiResponse<EmailThreadingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailThreadingSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch email threading settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmailThreadingSettings>> patchEmailsSettingsThreadingAsync(ApiRequest<EmailThreadingSettings> request, final AsyncApiCallback<ApiResponse<EmailThreadingSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<EmailThreadingSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmailThreadingSettings>() {}, new AsyncApiCallback<ApiResponse<EmailThreadingSettings>>() {
        @Override
        public void onCompleted(ApiResponse<EmailThreadingSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmailThreadingSettings> response = (ApiResponse<EmailThreadingSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ExecutionDataGlobalSettingsResponse> patchSettingsExecutiondataAsync(PatchSettingsExecutiondataRequest request, final AsyncApiCallback<ExecutionDataGlobalSettingsResponse> callback) {
    try {
      final SettableFuture<ExecutionDataGlobalSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ExecutionDataGlobalSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataGlobalSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Edit the execution history on off setting.
   * Edit the execution history on off setting.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ExecutionDataGlobalSettingsResponse>> patchSettingsExecutiondataAsync(ApiRequest<ExecutionDataSettingsRequest> request, final AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ExecutionDataGlobalSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ExecutionDataGlobalSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<ExecutionDataGlobalSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ExecutionDataGlobalSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ExecutionDataGlobalSettingsResponse> response = (ApiResponse<ExecutionDataGlobalSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AutoAnswerSettings> patchUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request, final AsyncApiCallback<AutoAnswerSettings> callback) {
    try {
      final SettableFuture<AutoAnswerSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AutoAnswerSettings>> patchUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(ApiRequest<AutoAnswerSettings> request, final AsyncApiCallback<ApiResponse<AutoAnswerSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<AutoAnswerSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UpdatedSettingsResponse> putExternalcontactsSettingsAsync(PutExternalcontactsSettingsRequest request, final AsyncApiCallback<UpdatedSettingsResponse> callback) {
    try {
      final SettableFuture<UpdatedSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UpdatedSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdatedSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UpdatedSettingsResponse>> putExternalcontactsSettingsAsync(ApiRequest<ExternalContactsSettings> request, final AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UpdatedSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UpdatedSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<UpdatedSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UpdatedSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdatedSettingsResponse> response = (ApiResponse<UpdatedSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UpdatedSettingsResponse> response = (ApiResponse<UpdatedSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AutoAnswerSettings> putUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest request, final AsyncApiCallback<AutoAnswerSettings> callback) {
    try {
      final SettableFuture<AutoAnswerSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set agent auto answer settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AutoAnswerSettings>> putUsersAgentuiAgentsAutoanswerAgentIdSettingsAsync(ApiRequest<AutoAnswerSettings> request, final AsyncApiCallback<ApiResponse<AutoAnswerSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<AutoAnswerSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AutoAnswerSettings>() {}, new AsyncApiCallback<ApiResponse<AutoAnswerSettings>>() {
        @Override
        public void onCompleted(ApiResponse<AutoAnswerSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AutoAnswerSettings> response = (ApiResponse<AutoAnswerSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
