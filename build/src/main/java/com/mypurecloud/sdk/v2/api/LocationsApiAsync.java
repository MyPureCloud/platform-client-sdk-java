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
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;


import com.mypurecloud.sdk.v2.api.request.GetLocationRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class LocationsApiAsync {
  private final ApiClient pcapiClient;

  public LocationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LocationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get Location by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocationDefinition> getLocationAsync(GetLocationRequest request, AsyncApiCallback<LocationDefinition> callback) {
    try {
      SettableFuture<LocationDefinition> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocationDefinition>() {}, new AsyncApiCallback<ApiResponse<LocationDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<LocationDefinition> response) {
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
   * Get Location by ID.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocationDefinition>> getLocationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocationDefinition>> callback) {
    try {
      SettableFuture<ApiResponse<LocationDefinition>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocationDefinition>() {}, new AsyncApiCallback<ApiResponse<LocationDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<LocationDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationDefinition> response = (ApiResponse<LocationDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationDefinition> response = (ApiResponse<LocationDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of all locations.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<LocationDefinition>> getLocationsAsync(GetLocationsRequest request, AsyncApiCallback<List<LocationDefinition>> callback) {
    try {
      SettableFuture<List<LocationDefinition>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<LocationDefinition>>() {}, new AsyncApiCallback<ApiResponse<List<LocationDefinition>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LocationDefinition>> response) {
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
   * Get a list of all locations.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<LocationDefinition>>> getLocationsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<LocationDefinition>>> callback) {
    try {
      SettableFuture<ApiResponse<List<LocationDefinition>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<LocationDefinition>>() {}, new AsyncApiCallback<ApiResponse<List<LocationDefinition>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LocationDefinition>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LocationDefinition>> response = (ApiResponse<List<LocationDefinition>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LocationDefinition>> response = (ApiResponse<List<LocationDefinition>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocationsSearchResponse> getLocationsSearchAsync(GetLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) {
    try {
      SettableFuture<LocationsSearchResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
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
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocationsSearchResponse>> getLocationsSearchAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) {
    try {
      SettableFuture<ApiResponse<LocationsSearchResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search locations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocationsSearchResponse> postLocationsSearchAsync(PostLocationsSearchRequest request, AsyncApiCallback<LocationsSearchResponse> callback) {
    try {
      SettableFuture<LocationsSearchResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
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
   * Search locations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocationsSearchResponse>> postLocationsSearchAsync(ApiRequest<LocationSearchRequest> request, AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) {
    try {
      SettableFuture<ApiResponse<LocationsSearchResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
