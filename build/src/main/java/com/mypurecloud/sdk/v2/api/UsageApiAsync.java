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
import com.mypurecloud.sdk.v2.model.ApiUsageQueryResult;
import com.mypurecloud.sdk.v2.model.UsageExecutionResult;
import com.mypurecloud.sdk.v2.model.ApiUsageQuery;


import com.mypurecloud.sdk.v2.api.request.GetUsageQueryExecutionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsageQueryRequest;

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
  public Future<ApiResponse<UsageExecutionResult>> postUsageQueryAsync(ApiRequest<ApiUsageQuery> request, final AsyncApiCallback<ApiResponse<UsageExecutionResult>> callback) {
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
