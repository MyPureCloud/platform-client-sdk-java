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
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersAgentuiAgentsAutoanswerAgentIdSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class AgentUIApiAsync {
  private final ApiClient pcapiClient;

  public AgentUIApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AgentUIApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
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
