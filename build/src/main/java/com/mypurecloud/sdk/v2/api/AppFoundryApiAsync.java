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
import com.mypurecloud.sdk.v2.model.AppFoundryListingCategory;
import com.mypurecloud.sdk.v2.model.PagedListingEntity;


import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategorySubCategoryNameRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AppFoundryApiAsync {
  private final ApiClient pcapiClient;

  public AppFoundryApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AppFoundryApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Return a structured hierarchy of available listing categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<AppFoundryListingCategory>> getAppfoundryPlatformNameCategoriesAsync(GetAppfoundryPlatformNameCategoriesRequest request, final AsyncApiCallback<List<AppFoundryListingCategory>> callback) {
    try {
      final SettableFuture<List<AppFoundryListingCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<AppFoundryListingCategory>>() {}, new AsyncApiCallback<ApiResponse<List<AppFoundryListingCategory>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AppFoundryListingCategory>> response) {
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
   * Return a structured hierarchy of available listing categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<AppFoundryListingCategory>>> getAppfoundryPlatformNameCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<AppFoundryListingCategory>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<AppFoundryListingCategory>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<AppFoundryListingCategory>>() {}, new AsyncApiCallback<ApiResponse<List<AppFoundryListingCategory>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AppFoundryListingCategory>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AppFoundryListingCategory>> response = (ApiResponse<List<AppFoundryListingCategory>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AppFoundryListingCategory>> response = (ApiResponse<List<AppFoundryListingCategory>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PagedListingEntity> getAppfoundryPlatformNameCategoryAsync(GetAppfoundryPlatformNameCategoryRequest request, final AsyncApiCallback<PagedListingEntity> callback) {
    try {
      final SettableFuture<PagedListingEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PagedListingEntity>() {}, new AsyncApiCallback<ApiResponse<PagedListingEntity>>() {
        @Override
        public void onCompleted(ApiResponse<PagedListingEntity> response) {
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
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PagedListingEntity>> getAppfoundryPlatformNameCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PagedListingEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<PagedListingEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PagedListingEntity>() {}, new AsyncApiCallback<ApiResponse<PagedListingEntity>>() {
        @Override
        public void onCompleted(ApiResponse<PagedListingEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get listings that are part of the specified subcategory
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PagedListingEntity> getAppfoundryPlatformNameCategorySubCategoryNameAsync(GetAppfoundryPlatformNameCategorySubCategoryNameRequest request, final AsyncApiCallback<PagedListingEntity> callback) {
    try {
      final SettableFuture<PagedListingEntity> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PagedListingEntity>() {}, new AsyncApiCallback<ApiResponse<PagedListingEntity>>() {
        @Override
        public void onCompleted(ApiResponse<PagedListingEntity> response) {
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
   * Get listings that are part of the specified subcategory
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PagedListingEntity>> getAppfoundryPlatformNameCategorySubCategoryNameAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PagedListingEntity>> callback) {
    try {
      final SettableFuture<ApiResponse<PagedListingEntity>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PagedListingEntity>() {}, new AsyncApiCallback<ApiResponse<PagedListingEntity>>() {
        @Override
        public void onCompleted(ApiResponse<PagedListingEntity> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)(new ApiException(exception));
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
