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
import com.mypurecloud.sdk.v2.model.UsersRulesCreateRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesDependent;
import com.mypurecloud.sdk.v2.model.UsersRulesDependentList;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryResponse;
import com.mypurecloud.sdk.v2.model.UsersRulesQueryRuleRequest;
import com.mypurecloud.sdk.v2.model.UsersRulesRule;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleList;
import com.mypurecloud.sdk.v2.model.UsersRulesRuleSettings;
import com.mypurecloud.sdk.v2.model.UsersRulesUpdateRuleRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleDependentTypeIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRuleDependentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersRulesSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUsersRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersRulesQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class UsersRulesApiAsync {
  private final ApiClient pcapiClient;

  public UsersRulesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersRulesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteUsersRuleAsync(DeleteUsersRuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an existing users rule
   * 
   * deleteUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteUsersRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesRule> getUsersRuleAsync(GetUsersRuleRequest request, final AsyncApiCallback<UsersRulesRule> callback) {
    try {
      final SettableFuture<UsersRulesRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
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
   * Get a users rule
   * 
   * getUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesRule>> getUsersRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersRulesRule>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesDependent> getUsersRuleDependentTypeIdAsync(GetUsersRuleDependentTypeIdRequest request, final AsyncApiCallback<UsersRulesDependent> callback) {
    try {
      final SettableFuture<UsersRulesDependent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesDependent>() {}, new AsyncApiCallback<ApiResponse<UsersRulesDependent>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesDependent> response) {
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
   * Get dependent of a users rule
   * 
   * getUsersRuleDependentTypeId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesDependent>> getUsersRuleDependentTypeIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersRulesDependent>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesDependent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesDependent>() {}, new AsyncApiCallback<ApiResponse<UsersRulesDependent>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesDependent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesDependent> response = (ApiResponse<UsersRulesDependent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesDependent> response = (ApiResponse<UsersRulesDependent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesDependentList> getUsersRuleDependentsAsync(GetUsersRuleDependentsRequest request, final AsyncApiCallback<UsersRulesDependentList> callback) {
    try {
      final SettableFuture<UsersRulesDependentList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesDependentList>() {}, new AsyncApiCallback<ApiResponse<UsersRulesDependentList>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesDependentList> response) {
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
   * Get dependents for a users rule
   * 
   * getUsersRuleDependents is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesDependentList>> getUsersRuleDependentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersRulesDependentList>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesDependentList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesDependentList>() {}, new AsyncApiCallback<ApiResponse<UsersRulesDependentList>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesDependentList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesDependentList> response = (ApiResponse<UsersRulesDependentList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesDependentList> response = (ApiResponse<UsersRulesDependentList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesRuleList> getUsersRulesAsync(GetUsersRulesRequest request, final AsyncApiCallback<UsersRulesRuleList> callback) {
    try {
      final SettableFuture<UsersRulesRuleList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesRuleList>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRuleList>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRuleList> response) {
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
   * Get the list of users rules
   * 
   * getUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesRuleList>> getUsersRulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersRulesRuleList>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesRuleList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesRuleList>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRuleList>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRuleList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRuleList> response = (ApiResponse<UsersRulesRuleList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRuleList> response = (ApiResponse<UsersRulesRuleList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesRuleSettings> getUsersRulesSettingAsync(GetUsersRulesSettingRequest request, final AsyncApiCallback<UsersRulesRuleSettings> callback) {
    try {
      final SettableFuture<UsersRulesRuleSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesRuleSettings>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRuleSettings>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRuleSettings> response) {
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
   * Get the settings for a specific users rule type
   * 
   * getUsersRulesSetting is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesRuleSettings>> getUsersRulesSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersRulesRuleSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesRuleSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesRuleSettings>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRuleSettings>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRuleSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRuleSettings> response = (ApiResponse<UsersRulesRuleSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRuleSettings> response = (ApiResponse<UsersRulesRuleSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesRule> patchUsersRuleAsync(PatchUsersRuleRequest request, final AsyncApiCallback<UsersRulesRule> callback) {
    try {
      final SettableFuture<UsersRulesRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
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
   * Update an existing users rule
   * This will update an existing users rule with the specified fields.
   * patchUsersRule is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesRule>> patchUsersRuleAsync(ApiRequest<UsersRulesUpdateRuleRequest> request, final AsyncApiCallback<ApiResponse<UsersRulesRule>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesRule> postUsersRulesAsync(PostUsersRulesRequest request, final AsyncApiCallback<UsersRulesRule> callback) {
    try {
      final SettableFuture<UsersRulesRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
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
   * Create a new rule
   * This will create a new rule with the specified fields.
   * postUsersRules is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesRule>> postUsersRulesAsync(ApiRequest<UsersRulesCreateRuleRequest> request, final AsyncApiCallback<ApiResponse<UsersRulesRule>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesRule>() {}, new AsyncApiCallback<ApiResponse<UsersRulesRule>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesRule> response = (ApiResponse<UsersRulesRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersRulesQueryResponse> postUsersRulesQueryAsync(PostUsersRulesQueryRequest request, final AsyncApiCallback<UsersRulesQueryResponse> callback) {
    try {
      final SettableFuture<UsersRulesQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersRulesQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UsersRulesQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesQueryResponse> response) {
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
   * Query the result of a users rule
   * This will query the result of a rule.
   * postUsersRulesQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersRulesQueryResponse>> postUsersRulesQueryAsync(ApiRequest<UsersRulesQueryRuleRequest> request, final AsyncApiCallback<ApiResponse<UsersRulesQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersRulesQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersRulesQueryResponse>() {}, new AsyncApiCallback<ApiResponse<UsersRulesQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersRulesQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesQueryResponse> response = (ApiResponse<UsersRulesQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersRulesQueryResponse> response = (ApiResponse<UsersRulesQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
