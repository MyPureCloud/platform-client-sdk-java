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
import com.mypurecloud.sdk.v2.model.OAuthAuthorization;
import com.mypurecloud.sdk.v2.model.OAuthAuthorizationListing;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;
import com.mypurecloud.sdk.v2.model.OAuthScope;
import com.mypurecloud.sdk.v2.model.OAuthScopeListing;
import com.mypurecloud.sdk.v2.model.ApiUsageQuery;
import com.mypurecloud.sdk.v2.model.OAuthClientRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthAuthorizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthAuthorizationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageQueryResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthScopeRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthScopesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientSecretRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientsRequest;
import com.mypurecloud.sdk.v2.api.request.PutOauthClientRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class OAuthApiAsync {
  private final ApiClient pcapiClient;

  public OAuthApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OAuthApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteOauthClientAsync(DeleteOauthClientRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteOauthClientAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a client that is authorized by the resource owner
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthAuthorization> getOauthAuthorizationAsync(GetOauthAuthorizationRequest request, final AsyncApiCallback<OAuthAuthorization> callback) {
    try {
      final SettableFuture<OAuthAuthorization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthAuthorization>() {}, new AsyncApiCallback<ApiResponse<OAuthAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthAuthorization> response) {
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
   * Get a client that is authorized by the resource owner
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthAuthorization>> getOauthAuthorizationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthAuthorization>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthAuthorization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthAuthorization>() {}, new AsyncApiCallback<ApiResponse<OAuthAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthAuthorization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthAuthorization> response = (ApiResponse<OAuthAuthorization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthAuthorization> response = (ApiResponse<OAuthAuthorization>)(ApiResponse<?>)(new ApiException(exception));
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
   * List clients that are authorized by the resource owner
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthAuthorizationListing> getOauthAuthorizationsAsync(GetOauthAuthorizationsRequest request, final AsyncApiCallback<OAuthAuthorizationListing> callback) {
    try {
      final SettableFuture<OAuthAuthorizationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthAuthorizationListing>() {}, new AsyncApiCallback<ApiResponse<OAuthAuthorizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthAuthorizationListing> response) {
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
   * List clients that are authorized by the resource owner
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthAuthorizationListing>> getOauthAuthorizationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthAuthorizationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthAuthorizationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthAuthorizationListing>() {}, new AsyncApiCallback<ApiResponse<OAuthAuthorizationListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthAuthorizationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthAuthorizationListing> response = (ApiResponse<OAuthAuthorizationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthAuthorizationListing> response = (ApiResponse<OAuthAuthorizationListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthClient> getOauthClientAsync(GetOauthClientRequest request, final AsyncApiCallback<OAuthClient> callback) {
    try {
      final SettableFuture<OAuthClient> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
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
   * Get OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthClient>> getOauthClientAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthClient>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthClient>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the results of a usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiUsageQueryResult> getOauthClientUsageQueryResultAsync(GetOauthClientUsageQueryResultRequest request, final AsyncApiCallback<ApiUsageQueryResult> callback) {
    try {
      final SettableFuture<ApiUsageQueryResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ApiUsageQueryResult>() {}, new AsyncApiCallback<ApiResponse<ApiUsageQueryResult>>() {
        @Override
        public void onCompleted(ApiResponse<ApiUsageQueryResult> response) {
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
   * Get the results of a usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ApiUsageQueryResult>> getOauthClientUsageQueryResultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ApiUsageQueryResult>> callback) {
    try {
      final SettableFuture<ApiResponse<ApiUsageQueryResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ApiUsageQueryResult>() {}, new AsyncApiCallback<ApiResponse<ApiUsageQueryResult>>() {
        @Override
        public void onCompleted(ApiResponse<ApiUsageQueryResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ApiUsageQueryResult> response = (ApiResponse<ApiUsageQueryResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsageExecutionResult> getOauthClientUsageSummaryAsync(GetOauthClientUsageSummaryRequest request, final AsyncApiCallback<UsageExecutionResult> callback) {
    try {
      final SettableFuture<UsageExecutionResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsageExecutionResult>() {}, new AsyncApiCallback<ApiResponse<UsageExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<UsageExecutionResult> response) {
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
   * Get a summary of OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsageExecutionResult>> getOauthClientUsageSummaryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
    try {
      final SettableFuture<ApiResponse<UsageExecutionResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsageExecutionResult>() {}, new AsyncApiCallback<ApiResponse<UsageExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<UsageExecutionResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * The list of OAuth clients
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthClientEntityListing> getOauthClientsAsync(GetOauthClientsRequest request, final AsyncApiCallback<OAuthClientEntityListing> callback) {
    try {
      final SettableFuture<OAuthClientEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthClientEntityListing>() {}, new AsyncApiCallback<ApiResponse<OAuthClientEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClientEntityListing> response) {
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
   * The list of OAuth clients
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthClientEntityListing>> getOauthClientsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthClientEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthClientEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthClientEntityListing>() {}, new AsyncApiCallback<ApiResponse<OAuthClientEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClientEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClientEntityListing> response = (ApiResponse<OAuthClientEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * An OAuth scope
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthScope> getOauthScopeAsync(GetOauthScopeRequest request, final AsyncApiCallback<OAuthScope> callback) {
    try {
      final SettableFuture<OAuthScope> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthScope>() {}, new AsyncApiCallback<ApiResponse<OAuthScope>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthScope> response) {
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
   * An OAuth scope
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthScope>> getOauthScopeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthScope>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthScope>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthScope>() {}, new AsyncApiCallback<ApiResponse<OAuthScope>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthScope> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthScope> response = (ApiResponse<OAuthScope>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthScope> response = (ApiResponse<OAuthScope>)(ApiResponse<?>)(new ApiException(exception));
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
   * The list of OAuth scopes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthScopeListing> getOauthScopesAsync(GetOauthScopesRequest request, final AsyncApiCallback<OAuthScopeListing> callback) {
    try {
      final SettableFuture<OAuthScopeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthScopeListing>() {}, new AsyncApiCallback<ApiResponse<OAuthScopeListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthScopeListing> response) {
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
   * The list of OAuth scopes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthScopeListing>> getOauthScopesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthScopeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthScopeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthScopeListing>() {}, new AsyncApiCallback<ApiResponse<OAuthScopeListing>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthScopeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthScopeListing> response = (ApiResponse<OAuthScopeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthScopeListing> response = (ApiResponse<OAuthScopeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthClient> postOauthClientSecretAsync(PostOauthClientSecretRequest request, final AsyncApiCallback<OAuthClient> callback) {
    try {
      final SettableFuture<OAuthClient> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
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
   * Regenerate Client Secret
   * This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthClient>> postOauthClientSecretAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OAuthClient>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthClient>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsageExecutionResult> postOauthClientUsageQueryAsync(PostOauthClientUsageQueryRequest request, final AsyncApiCallback<UsageExecutionResult> callback) {
    try {
      final SettableFuture<UsageExecutionResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsageExecutionResult>() {}, new AsyncApiCallback<ApiResponse<UsageExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<UsageExecutionResult> response) {
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
   * Query for OAuth client API usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsageExecutionResult>> postOauthClientUsageQueryAsync(ApiRequest<ApiUsageQuery> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
    try {
      final SettableFuture<ApiResponse<UsageExecutionResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsageExecutionResult>() {}, new AsyncApiCallback<ApiResponse<UsageExecutionResult>>() {
        @Override
        public void onCompleted(ApiResponse<UsageExecutionResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsageExecutionResult> response = (ApiResponse<UsageExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthClient> postOauthClientsAsync(PostOauthClientsRequest request, final AsyncApiCallback<OAuthClient> callback) {
    try {
      final SettableFuture<OAuthClient> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
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
   * Create OAuth client
   * The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthClient>> postOauthClientsAsync(ApiRequest<OAuthClientRequest> request, final AsyncApiCallback<ApiResponse<OAuthClient>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthClient>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OAuthClient> putOauthClientAsync(PutOauthClientRequest request, final AsyncApiCallback<OAuthClient> callback) {
    try {
      final SettableFuture<OAuthClient> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
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
   * Update OAuth Client
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OAuthClient>> putOauthClientAsync(ApiRequest<OAuthClientRequest> request, final AsyncApiCallback<ApiResponse<OAuthClient>> callback) {
    try {
      final SettableFuture<ApiResponse<OAuthClient>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OAuthClient>() {}, new AsyncApiCallback<ApiResponse<OAuthClient>>() {
        @Override
        public void onCompleted(ApiResponse<OAuthClient> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OAuthClient> response = (ApiResponse<OAuthClient>)(ApiResponse<?>)(new ApiException(exception));
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
