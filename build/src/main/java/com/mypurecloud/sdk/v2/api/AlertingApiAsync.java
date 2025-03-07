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

import com.mypurecloud.sdk.v2.model.AlertListing;
import com.mypurecloud.sdk.v2.model.AlertRequest;
import com.mypurecloud.sdk.v2.model.AlertingUnreadStatus;
import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CommonAlert;
import com.mypurecloud.sdk.v2.model.CommonAlertBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.CommonAllAlertUpdateRequest;
import com.mypurecloud.sdk.v2.model.CommonRule;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkDeleteRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleBulkUpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CommonRuleContainer;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetAlertQuery;
import com.mypurecloud.sdk.v2.model.GetRulesQuery;
import com.mypurecloud.sdk.v2.model.ModifiableRuleProperties;


import com.mypurecloud.sdk.v2.api.request.DeleteAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingAlertsAllRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAlertingRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.GetAlertingRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertsAllRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingAlertsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAlertingRulesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingAlertsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAlertingRulesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingAlertRequest;
import com.mypurecloud.sdk.v2.api.request.PutAlertingRuleRequest;

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
   * Delete an alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingAlertAsync(DeleteAlertingAlertRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingAlertAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete all alerts for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteAlertingAlertsAllAsync(DeleteAlertingAlertsAllRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
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
   * Delete all alerts for the user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteAlertingAlertsAllAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAlertingRuleAsync(DeleteAlertingRuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAlertingRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get an alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonAlert> getAlertingAlertAsync(GetAlertingAlertRequest request, final AsyncApiCallback<CommonAlert> callback) {
    try {
      final SettableFuture<CommonAlert> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonAlert>() {}, new AsyncApiCallback<ApiResponse<CommonAlert>>() {
        @Override
        public void onCompleted(ApiResponse<CommonAlert> response) {
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
   * Get an alert
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonAlert>> getAlertingAlertAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CommonAlert>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonAlert>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonAlert>() {}, new AsyncApiCallback<ApiResponse<CommonAlert>>() {
        @Override
        public void onCompleted(ApiResponse<CommonAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonRule> getAlertingRuleAsync(GetAlertingRuleRequest request, final AsyncApiCallback<CommonRule> callback) {
    try {
      final SettableFuture<CommonRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
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
   * Get a rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonRule>> getAlertingRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CommonRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonAlert> patchAlertingAlertAsync(PatchAlertingAlertRequest request, final AsyncApiCallback<CommonAlert> callback) {
    try {
      final SettableFuture<CommonAlert> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonAlert>() {}, new AsyncApiCallback<ApiResponse<CommonAlert>>() {
        @Override
        public void onCompleted(ApiResponse<CommonAlert> response) {
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
   * Allows an entity to mute/snooze an alert or update the unread status of the alert.
   * Snoozing an alert temporarily stop it from resending notifications to individualsas well as other services within Genesys Cloud for a given period.  Muting an alert will only block the notifications to individuals.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonAlert>> patchAlertingAlertAsync(ApiRequest<AlertRequest> request, final AsyncApiCallback<ApiResponse<CommonAlert>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonAlert>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonAlert>() {}, new AsyncApiCallback<ApiResponse<CommonAlert>>() {
        @Override
        public void onCompleted(ApiResponse<CommonAlert> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonAlert> response = (ApiResponse<CommonAlert>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates all alerts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> patchAlertingAlertsAllAsync(PatchAlertingAlertsAllRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
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
   * Updates all alerts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> patchAlertingAlertsAllAsync(ApiRequest<CommonAllAlertUpdateRequest> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk alert updates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> patchAlertingAlertsBulkAsync(PatchAlertingAlertsBulkRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
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
   * Bulk alert updates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> patchAlertingAlertsBulkAsync(ApiRequest<CommonAlertBulkUpdateRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk update of notification lists
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> patchAlertingRulesBulkAsync(PatchAlertingRulesBulkRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
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
   * Bulk update of notification lists
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> patchAlertingRulesBulkAsync(ApiRequest<CommonRuleBulkUpdateNotificationsRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AlertListing> postAlertingAlertsQueryAsync(PostAlertingAlertsQueryRequest request, final AsyncApiCallback<AlertListing> callback) {
    try {
      final SettableFuture<AlertListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AlertListing>() {}, new AsyncApiCallback<ApiResponse<AlertListing>>() {
        @Override
        public void onCompleted(ApiResponse<AlertListing> response) {
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
   * Gets a paged list of alerts. The max page size is 50
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AlertListing>> postAlertingAlertsQueryAsync(ApiRequest<GetAlertQuery> request, final AsyncApiCallback<ApiResponse<AlertListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AlertListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AlertListing>() {}, new AsyncApiCallback<ApiResponse<AlertListing>>() {
        @Override
        public void onCompleted(ApiResponse<AlertListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AlertListing> response = (ApiResponse<AlertListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AlertListing> response = (ApiResponse<AlertListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonRule> postAlertingRulesAsync(PostAlertingRulesRequest request, final AsyncApiCallback<CommonRule> callback) {
    try {
      final SettableFuture<CommonRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
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
   * Create a Rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonRule>> postAlertingRulesAsync(ApiRequest<CommonRule> request, final AsyncApiCallback<ApiResponse<CommonRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk remove rules
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkResponse> postAlertingRulesBulkRemoveAsync(PostAlertingRulesBulkRemoveRequest request, final AsyncApiCallback<BulkResponse> callback) {
    try {
      final SettableFuture<BulkResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
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
   * Bulk remove rules
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkResponse>> postAlertingRulesBulkRemoveAsync(ApiRequest<CommonRuleBulkDeleteRequest> request, final AsyncApiCallback<ApiResponse<BulkResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkResponse>() {}, new AsyncApiCallback<ApiResponse<BulkResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkResponse> response = (ApiResponse<BulkResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonRuleContainer> postAlertingRulesQueryAsync(PostAlertingRulesQueryRequest request, final AsyncApiCallback<CommonRuleContainer> callback) {
    try {
      final SettableFuture<CommonRuleContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonRuleContainer>() {}, new AsyncApiCallback<ApiResponse<CommonRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRuleContainer> response) {
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
   * Get a paged list of rules.  The max size of the page is 50 items.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonRuleContainer>> postAlertingRulesQueryAsync(ApiRequest<GetRulesQuery> request, final AsyncApiCallback<ApiResponse<CommonRuleContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonRuleContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonRuleContainer>() {}, new AsyncApiCallback<ApiResponse<CommonRuleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRuleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRuleContainer> response = (ApiResponse<CommonRuleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRuleContainer> response = (ApiResponse<CommonRuleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an alert read status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AlertingUnreadStatus> putAlertingAlertAsync(PutAlertingAlertRequest request, final AsyncApiCallback<AlertingUnreadStatus> callback) {
    try {
      final SettableFuture<AlertingUnreadStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AlertingUnreadStatus>() {}, new AsyncApiCallback<ApiResponse<AlertingUnreadStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AlertingUnreadStatus> response) {
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
   * Update an alert read status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AlertingUnreadStatus>> putAlertingAlertAsync(ApiRequest<AlertingUnreadStatus> request, final AsyncApiCallback<ApiResponse<AlertingUnreadStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<AlertingUnreadStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AlertingUnreadStatus>() {}, new AsyncApiCallback<ApiResponse<AlertingUnreadStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AlertingUnreadStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AlertingUnreadStatus> response = (ApiResponse<AlertingUnreadStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AlertingUnreadStatus> response = (ApiResponse<AlertingUnreadStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommonRule> putAlertingRuleAsync(PutAlertingRuleRequest request, final AsyncApiCallback<CommonRule> callback) {
    try {
      final SettableFuture<CommonRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
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
   * Update a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommonRule>> putAlertingRuleAsync(ApiRequest<ModifiableRuleProperties> request, final AsyncApiCallback<ApiResponse<CommonRule>> callback) {
    try {
      final SettableFuture<ApiResponse<CommonRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommonRule>() {}, new AsyncApiCallback<ApiResponse<CommonRule>>() {
        @Override
        public void onCompleted(ApiResponse<CommonRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommonRule> response = (ApiResponse<CommonRule>)(ApiResponse<?>)(new ApiException(exception));
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
