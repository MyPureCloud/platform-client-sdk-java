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

import com.mypurecloud.sdk.v2.model.ApiUsageClientQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageOrganizationQuery;
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.ApiUsageSimpleSearch;
import com.mypurecloud.sdk.v2.model.ClientPublicApiUsageQueryRequest;
import com.mypurecloud.sdk.v2.model.ClientPublicApiUsageResultsResponse;
import com.mypurecloud.sdk.v2.model.ClientUsageQueryResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationPublicApiUsageQueryRequest;
import com.mypurecloud.sdk.v2.model.OrganizationPublicApiUsageResultsResponse;
import com.mypurecloud.sdk.v2.model.OrganizationUsageQueryResponse;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;


import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageQueryResultRequest;
import com.mypurecloud.sdk.v2.api.request.GetOauthClientUsageSummaryRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageAggregatesQueryJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageClientClientIdAggregatesQueryJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageQueryExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsageSimplesearchExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOauthClientUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageAggregatesQueryJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageClientClientIdAggregatesQueryJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageSimplesearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class UsageApiAsync {
  private final ApiClient pcapiClient;

  public UsageApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
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
   * Get the status and results of the usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationPublicApiUsageResultsResponse> getUsageAggregatesQueryJobAsync(GetUsageAggregatesQueryJobRequest request, final AsyncApiCallback<OrganizationPublicApiUsageResultsResponse> callback) {
    try {
      final SettableFuture<OrganizationPublicApiUsageResultsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPublicApiUsageResultsResponse>() {}, new AsyncApiCallback<ApiResponse<OrganizationPublicApiUsageResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPublicApiUsageResultsResponse> response) {
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
   * Get the status and results of the usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationPublicApiUsageResultsResponse>> getUsageAggregatesQueryJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationPublicApiUsageResultsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPublicApiUsageResultsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPublicApiUsageResultsResponse>() {}, new AsyncApiCallback<ApiResponse<OrganizationPublicApiUsageResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPublicApiUsageResultsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPublicApiUsageResultsResponse> response = (ApiResponse<OrganizationPublicApiUsageResultsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPublicApiUsageResultsResponse> response = (ApiResponse<OrganizationPublicApiUsageResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the status and results of the usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ClientPublicApiUsageResultsResponse> getUsageClientClientIdAggregatesQueryJobAsync(GetUsageClientClientIdAggregatesQueryJobRequest request, final AsyncApiCallback<ClientPublicApiUsageResultsResponse> callback) {
    try {
      final SettableFuture<ClientPublicApiUsageResultsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ClientPublicApiUsageResultsResponse>() {}, new AsyncApiCallback<ApiResponse<ClientPublicApiUsageResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ClientPublicApiUsageResultsResponse> response) {
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
   * Get the status and results of the usage query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ClientPublicApiUsageResultsResponse>> getUsageClientClientIdAggregatesQueryJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ClientPublicApiUsageResultsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ClientPublicApiUsageResultsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ClientPublicApiUsageResultsResponse>() {}, new AsyncApiCallback<ApiResponse<ClientPublicApiUsageResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ClientPublicApiUsageResultsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientPublicApiUsageResultsResponse> response = (ApiResponse<ClientPublicApiUsageResultsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientPublicApiUsageResultsResponse> response = (ApiResponse<ClientPublicApiUsageResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
  public Future<ApiUsageQueryResult> getUsageQueryExecutionIdResultsAsync(GetUsageQueryExecutionIdResultsRequest request, final AsyncApiCallback<ApiUsageQueryResult> callback) {
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
  public Future<ApiResponse<ApiUsageQueryResult>> getUsageQueryExecutionIdResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ApiUsageQueryResult>> callback) {
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
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiUsageQueryResult> getUsageSimplesearchExecutionIdResultsAsync(GetUsageSimplesearchExecutionIdResultsRequest request, final AsyncApiCallback<ApiUsageQueryResult> callback) {
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
   * Get the results of a usage search. Number of records to be returned is limited to 20,000 results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ApiUsageQueryResult>> getUsageSimplesearchExecutionIdResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ApiUsageQueryResult>> callback) {
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
  public Future<ApiResponse<UsageExecutionResult>> postOauthClientUsageQueryAsync(ApiRequest<ApiUsageClientQuery> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
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
   * Query your organization's public api usage.
   * After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationUsageQueryResponse> postUsageAggregatesQueryJobsAsync(PostUsageAggregatesQueryJobsRequest request, final AsyncApiCallback<OrganizationUsageQueryResponse> callback) {
    try {
      final SettableFuture<OrganizationUsageQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationUsageQueryResponse>() {}, new AsyncApiCallback<ApiResponse<OrganizationUsageQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationUsageQueryResponse> response) {
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
   * Query your organization's public api usage.
   * After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationUsageQueryResponse>> postUsageAggregatesQueryJobsAsync(ApiRequest<OrganizationPublicApiUsageQueryRequest> request, final AsyncApiCallback<ApiResponse<OrganizationUsageQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationUsageQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationUsageQueryResponse>() {}, new AsyncApiCallback<ApiResponse<OrganizationUsageQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationUsageQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationUsageQueryResponse> response = (ApiResponse<OrganizationUsageQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationUsageQueryResponse> response = (ApiResponse<OrganizationUsageQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query your client's public api usage.
   * After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ClientUsageQueryResponse> postUsageClientClientIdAggregatesQueryJobsAsync(PostUsageClientClientIdAggregatesQueryJobsRequest request, final AsyncApiCallback<ClientUsageQueryResponse> callback) {
    try {
      final SettableFuture<ClientUsageQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ClientUsageQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ClientUsageQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ClientUsageQueryResponse> response) {
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
   * Query your client's public api usage.
   * After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ClientUsageQueryResponse>> postUsageClientClientIdAggregatesQueryJobsAsync(ApiRequest<ClientPublicApiUsageQueryRequest> request, final AsyncApiCallback<ApiResponse<ClientUsageQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ClientUsageQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ClientUsageQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ClientUsageQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ClientUsageQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientUsageQueryResponse> response = (ApiResponse<ClientUsageQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ClientUsageQueryResponse> response = (ApiResponse<ClientUsageQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsageExecutionResult> postUsageQueryAsync(PostUsageQueryRequest request, final AsyncApiCallback<UsageExecutionResult> callback) {
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
   * Query organization API Usage - 
   * After calling this method, you will then need to poll for the query results based on the returned execution Id
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsageExecutionResult>> postUsageQueryAsync(ApiRequest<ApiUsageOrganizationQuery> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
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
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsageExecutionResult> postUsageSimplesearchAsync(PostUsageSimplesearchRequest request, final AsyncApiCallback<UsageExecutionResult> callback) {
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
   * Search organization API Usage
   * After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsageExecutionResult>> postUsageSimplesearchAsync(ApiRequest<ApiUsageSimpleSearch> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
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
