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
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;


import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class JourneyApiAsync {
  private final ApiClient pcapiClient;

  public JourneyApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public JourneyApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Retrieve a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTarget> getJourneyActiontargetAsync(GetJourneyActiontargetRequest request, final AsyncApiCallback<ActionTarget> callback) {
    try {
      final SettableFuture<ActionTarget> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTarget>> getJourneyActiontargetAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTarget>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTarget>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Retrieve all action targets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTargetListing> getJourneyActiontargetsAsync(GetJourneyActiontargetsRequest request, final AsyncApiCallback<ActionTargetListing> callback) {
    try {
      final SettableFuture<ActionTargetListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTargetListing>() {}, new AsyncApiCallback<ApiResponse<ActionTargetListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTargetListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Retrieve all action targets.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTargetListing>> getJourneyActiontargetsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActionTargetListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTargetListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTargetListing>() {}, new AsyncApiCallback<ApiResponse<ActionTargetListing>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTargetListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Update a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActionTarget> patchJourneyActiontargetAsync(PatchJourneyActiontargetRequest request, final AsyncApiCallback<ActionTarget> callback) {
    try {
      final SettableFuture<ActionTarget> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a single action target.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActionTarget>> patchJourneyActiontargetAsync(ApiRequest<PatchActionTarget> request, final AsyncApiCallback<ApiResponse<ActionTarget>> callback) {
    try {
      final SettableFuture<ApiResponse<ActionTarget>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActionTarget>() {}, new AsyncApiCallback<ApiResponse<ActionTarget>>() {
        @Override
        public void onCompleted(ApiResponse<ActionTarget> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Query for journey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQueryAsync(PostAnalyticsJourneysAggregatesQueryRequest request, final AsyncApiCallback<JourneyAggregateQueryResponse> callback) {
    try {
      final SettableFuture<JourneyAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JourneyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for journey aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JourneyAggregateQueryResponse>> postAnalyticsJourneysAggregatesQueryAsync(ApiRequest<JourneyAggregationQuery> request, final AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JourneyAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JourneyAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<JourneyAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JourneyAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
