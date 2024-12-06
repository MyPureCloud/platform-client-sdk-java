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
import com.mypurecloud.sdk.v2.model.EventAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.model.EventAggregatesResponse;
import com.mypurecloud.sdk.v2.model.EventDefinition;
import com.mypurecloud.sdk.v2.model.EventDefinitionListing;
import com.mypurecloud.sdk.v2.model.EventQueryRequest;
import com.mypurecloud.sdk.v2.model.EventQueryResponse;


import com.mypurecloud.sdk.v2.api.request.GetUsageEventsDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageEventsDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageEventsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageEventsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class OperationalEventsApiAsync {
  private final ApiClient pcapiClient;

  public OperationalEventsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OperationalEventsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get an operational event definition by its id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventDefinition> getUsageEventsDefinitionAsync(GetUsageEventsDefinitionRequest request, final AsyncApiCallback<EventDefinition> callback) {
    try {
      final SettableFuture<EventDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventDefinition>() {}, new AsyncApiCallback<ApiResponse<EventDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<EventDefinition> response) {
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
   * Get an operational event definition by its id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventDefinition>> getUsageEventsDefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EventDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<EventDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventDefinition>() {}, new AsyncApiCallback<ApiResponse<EventDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<EventDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventDefinition> response = (ApiResponse<EventDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventDefinition> response = (ApiResponse<EventDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all operational event definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventDefinitionListing> getUsageEventsDefinitionsAsync(GetUsageEventsDefinitionsRequest request, final AsyncApiCallback<EventDefinitionListing> callback) {
    try {
      final SettableFuture<EventDefinitionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventDefinitionListing>() {}, new AsyncApiCallback<ApiResponse<EventDefinitionListing>>() {
        @Override
        public void onCompleted(ApiResponse<EventDefinitionListing> response) {
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
   * Get all operational event definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventDefinitionListing>> getUsageEventsDefinitionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EventDefinitionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EventDefinitionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventDefinitionListing>() {}, new AsyncApiCallback<ApiResponse<EventDefinitionListing>>() {
        @Override
        public void onCompleted(ApiResponse<EventDefinitionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventDefinitionListing> response = (ApiResponse<EventDefinitionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventDefinitionListing> response = (ApiResponse<EventDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get aggregates for operational events in a timeframe.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventAggregatesResponse> postUsageEventsAggregatesQueryAsync(PostUsageEventsAggregatesQueryRequest request, final AsyncApiCallback<EventAggregatesResponse> callback) {
    try {
      final SettableFuture<EventAggregatesResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventAggregatesResponse>() {}, new AsyncApiCallback<ApiResponse<EventAggregatesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EventAggregatesResponse> response) {
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
   * Get aggregates for operational events in a timeframe.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventAggregatesResponse>> postUsageEventsAggregatesQueryAsync(ApiRequest<EventAggregatesQueryRequest> request, final AsyncApiCallback<ApiResponse<EventAggregatesResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EventAggregatesResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventAggregatesResponse>() {}, new AsyncApiCallback<ApiResponse<EventAggregatesResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EventAggregatesResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventAggregatesResponse> response = (ApiResponse<EventAggregatesResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventAggregatesResponse> response = (ApiResponse<EventAggregatesResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query operational events in a timeframe.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EventQueryResponse> postUsageEventsQueryAsync(PostUsageEventsQueryRequest request, final AsyncApiCallback<EventQueryResponse> callback) {
    try {
      final SettableFuture<EventQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EventQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EventQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EventQueryResponse> response) {
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
   * Query operational events in a timeframe.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EventQueryResponse>> postUsageEventsQueryAsync(ApiRequest<EventQueryRequest> request, final AsyncApiCallback<ApiResponse<EventQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EventQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EventQueryResponse>() {}, new AsyncApiCallback<ApiResponse<EventQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EventQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EventQueryResponse> response = (ApiResponse<EventQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EventQueryResponse> response = (ApiResponse<EventQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
