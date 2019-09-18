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

import com.mypurecloud.sdk.v2.model.FlowAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FlowAggregationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQuery;
import com.mypurecloud.sdk.v2.model.FlowObservationQueryResponse;


import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsObservationsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class FlowsApiAsync {
  private final ApiClient pcapiClient;

  public FlowsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public FlowsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Query for flow aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowAggregateQueryResponse> postAnalyticsFlowsAggregatesQueryAsync(PostAnalyticsFlowsAggregatesQueryRequest request, final AsyncApiCallback<FlowAggregateQueryResponse> callback) {
    try {
      final SettableFuture<FlowAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowAggregateQueryResponse> response) {
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
   * Query for flow aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowAggregateQueryResponse>> postAnalyticsFlowsAggregatesQueryAsync(ApiRequest<FlowAggregationQuery> request, final AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowAggregateQueryResponse> response = (ApiResponse<FlowAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for flow observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowObservationQueryResponse> postAnalyticsFlowsObservationsQueryAsync(PostAnalyticsFlowsObservationsQueryRequest request, final AsyncApiCallback<FlowObservationQueryResponse> callback) {
    try {
      final SettableFuture<FlowObservationQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowObservationQueryResponse> response) {
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
   * Query for flow observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowObservationQueryResponse>> postAnalyticsFlowsObservationsQueryAsync(ApiRequest<FlowObservationQuery> request, final AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FlowObservationQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<FlowObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FlowObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowObservationQueryResponse> response = (ApiResponse<FlowObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
