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

import com.mypurecloud.sdk.v2.model.DependencyCount;
import com.mypurecloud.sdk.v2.model.DependencyEntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest;
import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest;
import com.mypurecloud.sdk.v2.api.request.GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class DependenciesApiAsync {
  private final ApiClient pcapiClient;

  public DependenciesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public DependenciesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get entities that require the given entity
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyAsync(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyRequest request, final AsyncApiCallback<DependencyEntityListing> callback) {
    try {
      final SettableFuture<DependencyEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get entities that require the given entity
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyEntityListing>> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyCount> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsAsync(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsRequest request, final AsyncApiCallback<DependencyCount> callback) {
    try {
      final SettableFuture<DependencyCount> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyCount>() {}, new AsyncApiCallback<ApiResponse<DependencyCount>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyCount> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * An estimated count of entities that depend on this entity, including indirect dependencies.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyCount>> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiredbycountsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyCount>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyCount>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyCount>() {}, new AsyncApiCallback<ApiResponse<DependencyCount>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyCount> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyCount> response = (ApiResponse<DependencyCount>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyCount> response = (ApiResponse<DependencyCount>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyEntityListing> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresAsync(GetDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresRequest request, final AsyncApiCallback<DependencyEntityListing> callback) {
    try {
      final SettableFuture<DependencyEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get entities that the given entity requires
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyEntityListing>> getDependenciesTypeEntityTypeIdEntityIdConnectionsRequiresAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DependencyEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DependencyEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyEntityListing> response = (ApiResponse<DependencyEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
