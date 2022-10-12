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

import com.mypurecloud.sdk.v2.model.BatchConversationEventRequest;
import com.mypurecloud.sdk.v2.model.BatchEventResponse;
import com.mypurecloud.sdk.v2.model.BatchUserPresenceEventRequest;
import com.mypurecloud.sdk.v2.model.BatchUserRoutingStatusEventRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.PostEventsConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostEventsUsersPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PostEventsUsersRoutingstatusRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class EventsApiAsync {
  private final ApiClient pcapiClient;

  public EventsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Publish Conversation Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BatchEventResponse> postEventsConversationsAsync(PostEventsConversationsRequest request, final AsyncApiCallback<BatchEventResponse> callback) {
    try {
      final SettableFuture<BatchEventResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
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
   * Publish Conversation Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BatchEventResponse>> postEventsConversationsAsync(ApiRequest<BatchConversationEventRequest> request, final AsyncApiCallback<ApiResponse<BatchEventResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BatchEventResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Publish User Presence Status Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BatchEventResponse> postEventsUsersPresenceAsync(PostEventsUsersPresenceRequest request, final AsyncApiCallback<BatchEventResponse> callback) {
    try {
      final SettableFuture<BatchEventResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
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
   * Publish User Presence Status Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BatchEventResponse>> postEventsUsersPresenceAsync(ApiRequest<BatchUserPresenceEventRequest> request, final AsyncApiCallback<ApiResponse<BatchEventResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BatchEventResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Publish Agent Routing Status Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BatchEventResponse> postEventsUsersRoutingstatusAsync(PostEventsUsersRoutingstatusRequest request, final AsyncApiCallback<BatchEventResponse> callback) {
    try {
      final SettableFuture<BatchEventResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
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
   * Publish Agent Routing Status Batch Events
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BatchEventResponse>> postEventsUsersRoutingstatusAsync(ApiRequest<BatchUserRoutingStatusEventRequest> request, final AsyncApiCallback<ApiResponse<BatchEventResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BatchEventResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BatchEventResponse>() {}, new AsyncApiCallback<ApiResponse<BatchEventResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BatchEventResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BatchEventResponse> response = (ApiResponse<BatchEventResponse>)(ApiResponse<?>)(new ApiException(exception));
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
