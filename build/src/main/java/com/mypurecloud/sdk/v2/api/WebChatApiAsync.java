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
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatSettings;


import com.mypurecloud.sdk.v2.api.request.DeleteWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WebChatApiAsync {
  private final ApiClient pcapiClient;

  public WebChatApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WebChatApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebchatDeploymentAsync(DeleteWebchatDeploymentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebchatDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Remove WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebchatSettingsAsync(DeleteWebchatSettingsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Remove WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebchatSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> getWebchatDeploymentAsync(GetWebchatDeploymentRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> getWebchatDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * List WebChat deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeploymentEntityListing> getWebchatDeploymentsAsync(GetWebchatDeploymentsRequest request, final AsyncApiCallback<WebChatDeploymentEntityListing> callback) {
    try {
      final SettableFuture<WebChatDeploymentEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeploymentEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List WebChat deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeploymentEntityListing>> getWebchatDeploymentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeploymentEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeploymentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatSettings> getWebchatSettingsAsync(GetWebchatSettingsRequest request, final AsyncApiCallback<WebChatSettings> callback) {
    try {
      final SettableFuture<WebChatSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatSettings>> getWebchatSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> postWebchatDeploymentsAsync(PostWebchatDeploymentsRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> postWebchatDeploymentsAsync(ApiRequest<WebChatDeployment> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatSettings> postWebchatSettingsAsync(PostWebchatSettingsRequest request, final AsyncApiCallback<WebChatSettings> callback) {
    try {
      final SettableFuture<WebChatSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatSettings>> postWebchatSettingsAsync(ApiRequest<WebChatSettings> request, final AsyncApiCallback<ApiResponse<WebChatSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> putWebchatDeploymentAsync(PutWebchatDeploymentRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> putWebchatDeploymentAsync(ApiRequest<WebChatDeployment> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatSettings> putWebchatSettingsAsync(PutWebchatSettingsRequest request, final AsyncApiCallback<WebChatSettings> callback) {
    try {
      final SettableFuture<WebChatSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatSettings>> putWebchatSettingsAsync(ApiRequest<WebChatSettings> request, final AsyncApiCallback<ApiResponse<WebChatSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
