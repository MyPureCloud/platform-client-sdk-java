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
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsConfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebdeploymentsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationVersionsDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsConfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebdeploymentsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsConfigurationVersionsDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsConfigurationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebdeploymentsDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebdeploymentsConfigurationVersionsDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebdeploymentsDeploymentRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WebDeploymentsApiAsync {
  private final ApiClient pcapiClient;

  public WebDeploymentsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WebDeploymentsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete all versions of a configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebdeploymentsConfigurationAsync(DeleteWebdeploymentsConfigurationRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete all versions of a configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebdeploymentsConfigurationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebdeploymentsDeploymentAsync(DeleteWebdeploymentsDeploymentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebdeploymentsDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a configuration version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersionAsync(GetWebdeploymentsConfigurationVersionRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersion> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a configuration version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersion>> getWebdeploymentsConfigurationVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurationVersionsAsync(GetWebdeploymentsConfigurationVersionsRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersionEntityListing> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersionEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the versions of a configuration
   * This returns the 50 most recent versions for this configuration
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> getWebdeploymentsConfigurationVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get the configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersion> getWebdeploymentsConfigurationVersionsDraftAsync(GetWebdeploymentsConfigurationVersionsDraftRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersion> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersion>> getWebdeploymentsConfigurationVersionsDraftAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * View configuration drafts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersionEntityListing> getWebdeploymentsConfigurationsAsync(GetWebdeploymentsConfigurationsRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersionEntityListing> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersionEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * View configuration drafts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> getWebdeploymentsConfigurationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersionEntityListing> response = (ApiResponse<WebDeploymentConfigurationVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeployment> getWebdeploymentsDeploymentAsync(GetWebdeploymentsDeploymentRequest request, final AsyncApiCallback<WebDeployment> callback) {
    try {
      final SettableFuture<WebDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeployment>> getWebdeploymentsDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentEntityListing> getWebdeploymentsDeploymentsAsync(GetWebdeploymentsDeploymentsRequest request, final AsyncApiCallback<WebDeploymentEntityListing> callback) {
    try {
      final SettableFuture<WebDeploymentEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentEntityListing>> getWebdeploymentsDeploymentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentEntityListing> response = (ApiResponse<WebDeploymentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentEntityListing> response = (ApiResponse<WebDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Publish the configuration draft and create a new version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurationVersionsDraftPublishAsync(PostWebdeploymentsConfigurationVersionsDraftPublishRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersion> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish the configuration draft and create a new version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersion>> postWebdeploymentsConfigurationVersionsDraftPublishAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersion> postWebdeploymentsConfigurationsAsync(PostWebdeploymentsConfigurationsRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersion> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersion>> postWebdeploymentsConfigurationsAsync(ApiRequest<WebDeploymentConfigurationVersion> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeployment> postWebdeploymentsDeploymentsAsync(PostWebdeploymentsDeploymentsRequest request, final AsyncApiCallback<WebDeployment> callback) {
    try {
      final SettableFuture<WebDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeployment>> postWebdeploymentsDeploymentsAsync(ApiRequest<WebDeployment> request, final AsyncApiCallback<ApiResponse<WebDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update the configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeploymentConfigurationVersion> putWebdeploymentsConfigurationVersionsDraftAsync(PutWebdeploymentsConfigurationVersionsDraftRequest request, final AsyncApiCallback<WebDeploymentConfigurationVersion> callback) {
    try {
      final SettableFuture<WebDeploymentConfigurationVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the configuration draft
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeploymentConfigurationVersion>> putWebdeploymentsConfigurationVersionsDraftAsync(ApiRequest<WebDeploymentConfigurationVersion> request, final AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeploymentConfigurationVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeploymentConfigurationVersion>() {}, new AsyncApiCallback<ApiResponse<WebDeploymentConfigurationVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeploymentConfigurationVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeploymentConfigurationVersion> response = (ApiResponse<WebDeploymentConfigurationVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebDeployment> putWebdeploymentsDeploymentAsync(PutWebdeploymentsDeploymentRequest request, final AsyncApiCallback<WebDeployment> callback) {
    try {
      final SettableFuture<WebDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebDeployment>> putWebdeploymentsDeploymentAsync(ApiRequest<WebDeployment> request, final AsyncApiCallback<ApiResponse<WebDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebDeployment>() {}, new AsyncApiCallback<ApiResponse<WebDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebDeployment> response = (ApiResponse<WebDeployment>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
