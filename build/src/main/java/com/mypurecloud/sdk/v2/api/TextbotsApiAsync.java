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

import com.mypurecloud.sdk.v2.model.TextBotFlowTurnRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.TextBotFlowTurnResponse;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchRequest;
import com.mypurecloud.sdk.v2.model.TextBotFlowLaunchResponse;
import com.mypurecloud.sdk.v2.model.PostTextResponse;
import com.mypurecloud.sdk.v2.model.PostTextRequest;


import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotflowsSessionTurnsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotflowsSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTextbotsBotsExecuteRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class TextbotsApiAsync {
  private final ApiClient pcapiClient;

  public TextbotsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public TextbotsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TextBotFlowTurnResponse> postTextbotsBotflowsSessionTurnsAsync(PostTextbotsBotflowsSessionTurnsRequest request, final AsyncApiCallback<TextBotFlowTurnResponse> callback) {
    try {
      final SettableFuture<TextBotFlowTurnResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TextBotFlowTurnResponse>() {}, new AsyncApiCallback<ApiResponse<TextBotFlowTurnResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TextBotFlowTurnResponse> response) {
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
   * Issue a bot flow turn event
   * Send a turn event to an executing bot flow and produce the next action to take.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TextBotFlowTurnResponse>> postTextbotsBotflowsSessionTurnsAsync(ApiRequest<TextBotFlowTurnRequest> request, final AsyncApiCallback<ApiResponse<TextBotFlowTurnResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TextBotFlowTurnResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TextBotFlowTurnResponse>() {}, new AsyncApiCallback<ApiResponse<TextBotFlowTurnResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TextBotFlowTurnResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TextBotFlowTurnResponse> response = (ApiResponse<TextBotFlowTurnResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TextBotFlowTurnResponse> response = (ApiResponse<TextBotFlowTurnResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TextBotFlowLaunchResponse> postTextbotsBotflowsSessionsAsync(PostTextbotsBotflowsSessionsRequest request, final AsyncApiCallback<TextBotFlowLaunchResponse> callback) {
    try {
      final SettableFuture<TextBotFlowLaunchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TextBotFlowLaunchResponse>() {}, new AsyncApiCallback<ApiResponse<TextBotFlowLaunchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TextBotFlowLaunchResponse> response) {
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
   * Create an execution instance of a bot flow definition.
   * The launch is asynchronous; use the returned instance ID to post turns to it using &#39;POST /api/v2/textbots/botflows/sessions/{sessionId}/turns&#39;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TextBotFlowLaunchResponse>> postTextbotsBotflowsSessionsAsync(ApiRequest<TextBotFlowLaunchRequest> request, final AsyncApiCallback<ApiResponse<TextBotFlowLaunchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TextBotFlowLaunchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TextBotFlowLaunchResponse>() {}, new AsyncApiCallback<ApiResponse<TextBotFlowLaunchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TextBotFlowLaunchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TextBotFlowLaunchResponse> response = (ApiResponse<TextBotFlowLaunchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TextBotFlowLaunchResponse> response = (ApiResponse<TextBotFlowLaunchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PostTextResponse> postTextbotsBotsExecuteAsync(PostTextbotsBotsExecuteRequest request, final AsyncApiCallback<PostTextResponse> callback) {
    try {
      final SettableFuture<PostTextResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PostTextResponse>() {}, new AsyncApiCallback<ApiResponse<PostTextResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PostTextResponse> response) {
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
   * Send an intent to a bot to start a dialog/interact with it via text
   * This will either start a bot with the given id or relay a communication to an existing bot session.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PostTextResponse>> postTextbotsBotsExecuteAsync(ApiRequest<PostTextRequest> request, final AsyncApiCallback<ApiResponse<PostTextResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<PostTextResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PostTextResponse>() {}, new AsyncApiCallback<ApiResponse<PostTextResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PostTextResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PostTextResponse> response = (ApiResponse<PostTextResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PostTextResponse> response = (ApiResponse<PostTextResponse>)(ApiResponse<?>)(new ApiException(exception));
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
