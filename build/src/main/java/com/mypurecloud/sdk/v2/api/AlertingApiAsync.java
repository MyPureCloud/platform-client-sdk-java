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
import com.mypurecloud.sdk.v2.model.HeartBeatAlert;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertContainer;
import com.mypurecloud.sdk.v2.model.HeartBeatRule;
import com.mypurecloud.sdk.v2.model.HeartBeatRuleContainer;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlert;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlertContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusRule;
import com.mypurecloud.sdk.v2.model.RoutingStatusRuleContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceAlert;
import com.mypurecloud.sdk.v2.model.UserPresenceAlertContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceRule;
import com.mypurecloud.sdk.v2.model.UserPresenceRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;


import com.mypurecloud.sdk.v2.api.request.DeleteAlertingHeartbeatAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRoutingstatusAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingUserpresenceAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingUserpresenceRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingHeartbeatRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsAlertsUnreadRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingInteractionstatsRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRoutingstatusRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceAlertsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingUserpresenceRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingHeartbeatRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingInteractionstatsRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRoutingstatusRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingUserpresenceRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingHeartbeatRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingInteractionstatsAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingInteractionstatsRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingRoutingstatusRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingUserpresenceRuleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AlertingApiAsync {
  private final ApiClient pcapiClient;

  public AlertingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a heart beat alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingHeartbeatAlertAsync(DeleteAlertingHeartbeatAlertRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a heart beat alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingHeartbeatAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingHeartbeatRuleAsync(DeleteAlertingHeartbeatRuleRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingHeartbeatRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete an interaction stats alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingInteractionstatsAlertAsync(DeleteAlertingInteractionstatsAlertRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete an interaction stats alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingInteractionstatsAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingInteractionstatsRuleAsync(DeleteAlertingInteractionstatsRuleRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingInteractionstatsRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a routing status alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingRoutingstatusAlertAsync(DeleteAlertingRoutingstatusAlertRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a routing status alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingRoutingstatusAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingRoutingstatusRuleAsync(DeleteAlertingRoutingstatusRuleRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingRoutingstatusRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a user presence alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingUserpresenceAlertAsync(DeleteAlertingUserpresenceAlertRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a user presence alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingUserpresenceAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingUserpresenceRuleAsync(DeleteAlertingUserpresenceRuleRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Delete a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingUserpresenceRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Get a heart beat alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatAlert> getAlertingHeartbeatAlertAsync(GetAlertingHeartbeatAlertRequest request, AsyncApiCallback<HeartBeatAlert> callback) {
    try {
      SettableFuture<HeartBeatAlert> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatAlert>() {}, new AsyncApiCallback<ApiResponse<HeartBeatAlert>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatAlert> response) {
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
   * Get a heart beat alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatAlert>> getAlertingHeartbeatAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatAlert>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatAlert>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatAlert>() {}, new AsyncApiCallback<ApiResponse<HeartBeatAlert>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatAlert> response = (ApiResponse<HeartBeatAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatAlert> response = (ApiResponse<HeartBeatAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get heart beat alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatAlertContainer> getAlertingHeartbeatAlertsAsync(GetAlertingHeartbeatAlertsRequest request, AsyncApiCallback<HeartBeatAlertContainer> callback) {
    try {
      SettableFuture<HeartBeatAlertContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatAlertContainer>() {}, new AsyncApiCallback<ApiResponse<HeartBeatAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatAlertContainer> response) {
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
   * Get heart beat alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatAlertContainer>> getAlertingHeartbeatAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatAlertContainer>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatAlertContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatAlertContainer>() {}, new AsyncApiCallback<ApiResponse<HeartBeatAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatAlertContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatAlertContainer> response = (ApiResponse<HeartBeatAlertContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatAlertContainer> response = (ApiResponse<HeartBeatAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatRule> getAlertingHeartbeatRuleAsync(GetAlertingHeartbeatRuleRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    try {
      SettableFuture<HeartBeatRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
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
   * Get a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatRule>> getAlertingHeartbeatRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a heart beat rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatRuleContainer> getAlertingHeartbeatRulesAsync(GetAlertingHeartbeatRulesRequest request, AsyncApiCallback<HeartBeatRuleContainer> callback) {
    try {
      SettableFuture<HeartBeatRuleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatRuleContainer>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRuleContainer> response) {
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
   * Get a heart beat rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatRuleContainer>> getAlertingHeartbeatRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<HeartBeatRuleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatRuleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatRuleContainer>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRuleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRuleContainer> response = (ApiResponse<HeartBeatRuleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRuleContainer> response = (ApiResponse<HeartBeatRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an interaction stats alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsAlert> getAlertingInteractionstatsAlertAsync(GetAlertingInteractionstatsAlertRequest request, AsyncApiCallback<InteractionStatsAlert> callback) {
    try {
      SettableFuture<InteractionStatsAlert> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsAlert>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsAlert>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsAlert> response) {
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
   * Get an interaction stats alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsAlert>> getAlertingInteractionstatsAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsAlert>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsAlert>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsAlert>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsAlert>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsAlert> response = (ApiResponse<InteractionStatsAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsAlert> response = (ApiResponse<InteractionStatsAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get interaction stats alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsAlertContainer> getAlertingInteractionstatsAlertsAsync(GetAlertingInteractionstatsAlertsRequest request, AsyncApiCallback<InteractionStatsAlertContainer> callback) {
    try {
      SettableFuture<InteractionStatsAlertContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsAlertContainer>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsAlertContainer> response) {
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
   * Get interaction stats alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsAlertContainer>> getAlertingInteractionstatsAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsAlertContainer>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsAlertContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsAlertContainer>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsAlertContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsAlertContainer> response = (ApiResponse<InteractionStatsAlertContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsAlertContainer> response = (ApiResponse<InteractionStatsAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets user unread count of interaction stats alerts.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnreadMetric> getAlertingInteractionstatsAlertsUnreadAsync(GetAlertingInteractionstatsAlertsUnreadRequest request, AsyncApiCallback<UnreadMetric> callback) {
    try {
      SettableFuture<UnreadMetric> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnreadMetric>() {}, new AsyncApiCallback<ApiResponse<UnreadMetric>>() {
        @Override
        public void onCompleted(ApiResponse<UnreadMetric> response) {
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
   * Gets user unread count of interaction stats alerts.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnreadMetric>> getAlertingInteractionstatsAlertsUnreadAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UnreadMetric>> callback) {
    try {
      SettableFuture<ApiResponse<UnreadMetric>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnreadMetric>() {}, new AsyncApiCallback<ApiResponse<UnreadMetric>>() {
        @Override
        public void onCompleted(ApiResponse<UnreadMetric> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnreadMetric> response = (ApiResponse<UnreadMetric>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnreadMetric> response = (ApiResponse<UnreadMetric>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsRule> getAlertingInteractionstatsRuleAsync(GetAlertingInteractionstatsRuleRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    try {
      SettableFuture<InteractionStatsRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
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
   * Get an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsRule>> getAlertingInteractionstatsRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an interaction stats rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsRuleContainer> getAlertingInteractionstatsRulesAsync(GetAlertingInteractionstatsRulesRequest request, AsyncApiCallback<InteractionStatsRuleContainer> callback) {
    try {
      SettableFuture<InteractionStatsRuleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRuleContainer>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRuleContainer> response) {
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
   * Get an interaction stats rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsRuleContainer>> getAlertingInteractionstatsRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InteractionStatsRuleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsRuleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsRuleContainer>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRuleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRuleContainer> response = (ApiResponse<InteractionStatsRuleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRuleContainer> response = (ApiResponse<InteractionStatsRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a routing status alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusAlert> getAlertingRoutingstatusAlertAsync(GetAlertingRoutingstatusAlertRequest request, AsyncApiCallback<RoutingStatusAlert> callback) {
    try {
      SettableFuture<RoutingStatusAlert> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusAlert>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusAlert>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusAlert> response) {
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
   * Get a routing status alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusAlert>> getAlertingRoutingstatusAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusAlert>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusAlert>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusAlert>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusAlert>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusAlert> response = (ApiResponse<RoutingStatusAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusAlert> response = (ApiResponse<RoutingStatusAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get routing status alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusAlertContainer> getAlertingRoutingstatusAlertsAsync(GetAlertingRoutingstatusAlertsRequest request, AsyncApiCallback<RoutingStatusAlertContainer> callback) {
    try {
      SettableFuture<RoutingStatusAlertContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusAlertContainer>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusAlertContainer> response) {
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
   * Get routing status alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusAlertContainer>> getAlertingRoutingstatusAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusAlertContainer>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusAlertContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusAlertContainer>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusAlertContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusAlertContainer> response = (ApiResponse<RoutingStatusAlertContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusAlertContainer> response = (ApiResponse<RoutingStatusAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusRule> getAlertingRoutingstatusRuleAsync(GetAlertingRoutingstatusRuleRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    try {
      SettableFuture<RoutingStatusRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
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
   * Get a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusRule>> getAlertingRoutingstatusRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a routing status rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusRuleContainer> getAlertingRoutingstatusRulesAsync(GetAlertingRoutingstatusRulesRequest request, AsyncApiCallback<RoutingStatusRuleContainer> callback) {
    try {
      SettableFuture<RoutingStatusRuleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRuleContainer>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRuleContainer> response) {
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
   * Get a routing status rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusRuleContainer>> getAlertingRoutingstatusRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingStatusRuleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusRuleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusRuleContainer>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRuleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRuleContainer> response = (ApiResponse<RoutingStatusRuleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRuleContainer> response = (ApiResponse<RoutingStatusRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user presence alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceAlert> getAlertingUserpresenceAlertAsync(GetAlertingUserpresenceAlertRequest request, AsyncApiCallback<UserPresenceAlert> callback) {
    try {
      SettableFuture<UserPresenceAlert> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceAlert>() {}, new AsyncApiCallback<ApiResponse<UserPresenceAlert>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceAlert> response) {
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
   * Get a user presence alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceAlert>> getAlertingUserpresenceAlertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceAlert>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceAlert>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceAlert>() {}, new AsyncApiCallback<ApiResponse<UserPresenceAlert>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceAlert> response = (ApiResponse<UserPresenceAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceAlert> response = (ApiResponse<UserPresenceAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get user presence alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceAlertContainer> getAlertingUserpresenceAlertsAsync(GetAlertingUserpresenceAlertsRequest request, AsyncApiCallback<UserPresenceAlertContainer> callback) {
    try {
      SettableFuture<UserPresenceAlertContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceAlertContainer>() {}, new AsyncApiCallback<ApiResponse<UserPresenceAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceAlertContainer> response) {
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
   * Get user presence alert list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceAlertContainer>> getAlertingUserpresenceAlertsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceAlertContainer>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceAlertContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceAlertContainer>() {}, new AsyncApiCallback<ApiResponse<UserPresenceAlertContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceAlertContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceAlertContainer> response = (ApiResponse<UserPresenceAlertContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceAlertContainer> response = (ApiResponse<UserPresenceAlertContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceRule> getAlertingUserpresenceRuleAsync(GetAlertingUserpresenceRuleRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    try {
      SettableFuture<UserPresenceRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
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
   * Get a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceRule>> getAlertingUserpresenceRuleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user presence rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceRuleContainer> getAlertingUserpresenceRulesAsync(GetAlertingUserpresenceRulesRequest request, AsyncApiCallback<UserPresenceRuleContainer> callback) {
    try {
      SettableFuture<UserPresenceRuleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceRuleContainer>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRuleContainer> response) {
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
   * Get a user presence rule list.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceRuleContainer>> getAlertingUserpresenceRulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserPresenceRuleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceRuleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceRuleContainer>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRuleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRuleContainer> response = (ApiResponse<UserPresenceRuleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRuleContainer> response = (ApiResponse<UserPresenceRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatRule> postAlertingHeartbeatRulesAsync(PostAlertingHeartbeatRulesRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    try {
      SettableFuture<HeartBeatRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
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
   * Create a heart beat rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatRule>> postAlertingHeartbeatRulesAsync(ApiRequest<HeartBeatRule> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsRule> postAlertingInteractionstatsRulesAsync(PostAlertingInteractionstatsRulesRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    try {
      SettableFuture<InteractionStatsRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
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
   * Create an interaction stats rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsRule>> postAlertingInteractionstatsRulesAsync(ApiRequest<InteractionStatsRule> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusRule> postAlertingRoutingstatusRulesAsync(PostAlertingRoutingstatusRulesRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    try {
      SettableFuture<RoutingStatusRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
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
   * Create a routing status rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusRule>> postAlertingRoutingstatusRulesAsync(ApiRequest<RoutingStatusRule> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceRule> postAlertingUserpresenceRulesAsync(PostAlertingUserpresenceRulesRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    try {
      SettableFuture<UserPresenceRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
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
   * Create a user presence rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceRule>> postAlertingUserpresenceRulesAsync(ApiRequest<UserPresenceRule> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a heart beat rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<HeartBeatRule> putAlertingHeartbeatRuleAsync(PutAlertingHeartbeatRuleRequest request, AsyncApiCallback<HeartBeatRule> callback) {
    try {
      SettableFuture<HeartBeatRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
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
   * Update a heart beat rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<HeartBeatRule>> putAlertingHeartbeatRuleAsync(ApiRequest<HeartBeatRule> request, AsyncApiCallback<ApiResponse<HeartBeatRule>> callback) {
    try {
      SettableFuture<ApiResponse<HeartBeatRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<HeartBeatRule>() {}, new AsyncApiCallback<ApiResponse<HeartBeatRule>>() {
        @Override
        public void onCompleted(ApiResponse<HeartBeatRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<HeartBeatRule> response = (ApiResponse<HeartBeatRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an interaction stats alert read status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnreadStatus> putAlertingInteractionstatsAlertAsync(PutAlertingInteractionstatsAlertRequest request, AsyncApiCallback<UnreadStatus> callback) {
    try {
      SettableFuture<UnreadStatus> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnreadStatus>() {}, new AsyncApiCallback<ApiResponse<UnreadStatus>>() {
        @Override
        public void onCompleted(ApiResponse<UnreadStatus> response) {
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
   * Update an interaction stats alert read status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnreadStatus>> putAlertingInteractionstatsAlertAsync(ApiRequest<UnreadStatus> request, AsyncApiCallback<ApiResponse<UnreadStatus>> callback) {
    try {
      SettableFuture<ApiResponse<UnreadStatus>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnreadStatus>() {}, new AsyncApiCallback<ApiResponse<UnreadStatus>>() {
        @Override
        public void onCompleted(ApiResponse<UnreadStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnreadStatus> response = (ApiResponse<UnreadStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnreadStatus> response = (ApiResponse<UnreadStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an interaction stats rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InteractionStatsRule> putAlertingInteractionstatsRuleAsync(PutAlertingInteractionstatsRuleRequest request, AsyncApiCallback<InteractionStatsRule> callback) {
    try {
      SettableFuture<InteractionStatsRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
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
   * Update an interaction stats rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InteractionStatsRule>> putAlertingInteractionstatsRuleAsync(ApiRequest<InteractionStatsRule> request, AsyncApiCallback<ApiResponse<InteractionStatsRule>> callback) {
    try {
      SettableFuture<ApiResponse<InteractionStatsRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InteractionStatsRule>() {}, new AsyncApiCallback<ApiResponse<InteractionStatsRule>>() {
        @Override
        public void onCompleted(ApiResponse<InteractionStatsRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InteractionStatsRule> response = (ApiResponse<InteractionStatsRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a routing status rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RoutingStatusRule> putAlertingRoutingstatusRuleAsync(PutAlertingRoutingstatusRuleRequest request, AsyncApiCallback<RoutingStatusRule> callback) {
    try {
      SettableFuture<RoutingStatusRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
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
   * Update a routing status rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RoutingStatusRule>> putAlertingRoutingstatusRuleAsync(ApiRequest<RoutingStatusRule> request, AsyncApiCallback<ApiResponse<RoutingStatusRule>> callback) {
    try {
      SettableFuture<ApiResponse<RoutingStatusRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RoutingStatusRule>() {}, new AsyncApiCallback<ApiResponse<RoutingStatusRule>>() {
        @Override
        public void onCompleted(ApiResponse<RoutingStatusRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RoutingStatusRule> response = (ApiResponse<RoutingStatusRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a user presence rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresenceRule> putAlertingUserpresenceRuleAsync(PutAlertingUserpresenceRuleRequest request, AsyncApiCallback<UserPresenceRule> callback) {
    try {
      SettableFuture<UserPresenceRule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
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
   * Update a user presence rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresenceRule>> putAlertingUserpresenceRuleAsync(ApiRequest<UserPresenceRule> request, AsyncApiCallback<ApiResponse<UserPresenceRule>> callback) {
    try {
      SettableFuture<ApiResponse<UserPresenceRule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresenceRule>() {}, new AsyncApiCallback<ApiResponse<UserPresenceRule>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresenceRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresenceRule> response = (ApiResponse<UserPresenceRule>)(ApiResponse<?>)(new ApiException(exception));
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
