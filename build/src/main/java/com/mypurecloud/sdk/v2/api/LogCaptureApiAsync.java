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
import com.mypurecloud.sdk.v2.model.LogCaptureDownloadExecutionResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryRequest;
import com.mypurecloud.sdk.v2.model.LogCaptureQueryResponse;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfiguration;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationListing;
import com.mypurecloud.sdk.v2.model.LogCaptureUserConfigurationResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteDiagnosticsLogcaptureBrowserUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetDiagnosticsLogcaptureBrowserUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserEntriesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostDiagnosticsLogcaptureBrowserUserRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class LogCaptureApiAsync {
  private final ApiClient pcapiClient;

  public LogCaptureApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LogCaptureApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Disable browser log capture for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteDiagnosticsLogcaptureBrowserUserAsync(DeleteDiagnosticsLogcaptureBrowserUserRequest request, final AsyncApiCallback<Void> callback) {
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
   * Disable browser log capture for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteDiagnosticsLogcaptureBrowserUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Gets status of async download execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureDownloadExecutionResponse> getDiagnosticsLogcaptureBrowserEntriesDownloadJobAsync(GetDiagnosticsLogcaptureBrowserEntriesDownloadJobRequest request, final AsyncApiCallback<LogCaptureDownloadExecutionResponse> callback) {
    try {
      final SettableFuture<LogCaptureDownloadExecutionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureDownloadExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureDownloadExecutionResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Gets status of async download execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureDownloadExecutionResponse>> getDiagnosticsLogcaptureBrowserEntriesDownloadJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureDownloadExecutionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureDownloadExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureDownloadExecutionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureUserConfigurationResponse> getDiagnosticsLogcaptureBrowserUserAsync(GetDiagnosticsLogcaptureBrowserUserRequest request, final AsyncApiCallback<LogCaptureUserConfigurationResponse> callback) {
    try {
      final SettableFuture<LogCaptureUserConfigurationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureUserConfigurationResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfigurationResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get log capture configuration for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureUserConfigurationResponse>> getDiagnosticsLogcaptureBrowserUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureUserConfigurationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureUserConfigurationResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfigurationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfigurationResponse> response = (ApiResponse<LogCaptureUserConfigurationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfigurationResponse> response = (ApiResponse<LogCaptureUserConfigurationResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureUserConfigurationListing> getDiagnosticsLogcaptureBrowserUsersAsync(GetDiagnosticsLogcaptureBrowserUsersRequest request, final AsyncApiCallback<LogCaptureUserConfigurationListing> callback) {
    try {
      final SettableFuture<LogCaptureUserConfigurationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureUserConfigurationListing>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfigurationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all log capture enabled users for an org
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureUserConfigurationListing>> getDiagnosticsLogcaptureBrowserUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureUserConfigurationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureUserConfigurationListing>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfigurationListing>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfigurationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfigurationListing> response = (ApiResponse<LogCaptureUserConfigurationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfigurationListing> response = (ApiResponse<LogCaptureUserConfigurationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates an async download execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureDownloadExecutionResponse> postDiagnosticsLogcaptureBrowserEntriesDownloadJobsAsync(PostDiagnosticsLogcaptureBrowserEntriesDownloadJobsRequest request, final AsyncApiCallback<LogCaptureDownloadExecutionResponse> callback) {
    try {
      final SettableFuture<LogCaptureDownloadExecutionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureDownloadExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureDownloadExecutionResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Creates an async download execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureDownloadExecutionResponse>> postDiagnosticsLogcaptureBrowserEntriesDownloadJobsAsync(ApiRequest<LogCaptureQueryRequest> request, final AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureDownloadExecutionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureDownloadExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureDownloadExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureDownloadExecutionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureDownloadExecutionResponse> response = (ApiResponse<LogCaptureDownloadExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureQueryResponse> postDiagnosticsLogcaptureBrowserEntriesQueryAsync(PostDiagnosticsLogcaptureBrowserEntriesQueryRequest request, final AsyncApiCallback<LogCaptureQueryResponse> callback) {
    try {
      final SettableFuture<LogCaptureQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureQueryResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureQueryResponse>> postDiagnosticsLogcaptureBrowserEntriesQueryAsync(ApiRequest<LogCaptureQueryRequest> request, final AsyncApiCallback<ApiResponse<LogCaptureQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureQueryResponse>() {}, new AsyncApiCallback<ApiResponse<LogCaptureQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureQueryResponse> response = (ApiResponse<LogCaptureQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureQueryResponse> response = (ApiResponse<LogCaptureQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LogCaptureUserConfiguration> postDiagnosticsLogcaptureBrowserUserAsync(PostDiagnosticsLogcaptureBrowserUserRequest request, final AsyncApiCallback<LogCaptureUserConfiguration> callback) {
    try {
      final SettableFuture<LogCaptureUserConfiguration> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LogCaptureUserConfiguration>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfiguration> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Enable log capture for a user or update expiration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LogCaptureUserConfiguration>> postDiagnosticsLogcaptureBrowserUserAsync(ApiRequest<LogCaptureUserConfiguration> request, final AsyncApiCallback<ApiResponse<LogCaptureUserConfiguration>> callback) {
    try {
      final SettableFuture<ApiResponse<LogCaptureUserConfiguration>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LogCaptureUserConfiguration>() {}, new AsyncApiCallback<ApiResponse<LogCaptureUserConfiguration>>() {
        @Override
        public void onCompleted(ApiResponse<LogCaptureUserConfiguration> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfiguration> response = (ApiResponse<LogCaptureUserConfiguration>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LogCaptureUserConfiguration> response = (ApiResponse<LogCaptureUserConfiguration>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
