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

import com.mypurecloud.sdk.v2.model.EmergencyLocation;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ErrorInfo;


import com.mypurecloud.sdk.v2.api.request.GetCarrierservicesIntegrationsEmergencylocationsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PostCarrierservicesIntegrationsEmergencylocationsMeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class CarrierServicesApiAsync {
  private final ApiClient pcapiClient;

  public CarrierServicesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public CarrierServicesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get location for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyLocation> getCarrierservicesIntegrationsEmergencylocationsMeAsync(GetCarrierservicesIntegrationsEmergencylocationsMeRequest request, final AsyncApiCallback<EmergencyLocation> callback) {
    try {
      final SettableFuture<EmergencyLocation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyLocation>() {}, new AsyncApiCallback<ApiResponse<EmergencyLocation>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyLocation> response) {
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
   * Get location for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyLocation>> getCarrierservicesIntegrationsEmergencylocationsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EmergencyLocation>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyLocation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyLocation>() {}, new AsyncApiCallback<ApiResponse<EmergencyLocation>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyLocation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)(new ApiException(exception));
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
   * Set current location for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EmergencyLocation> postCarrierservicesIntegrationsEmergencylocationsMeAsync(PostCarrierservicesIntegrationsEmergencylocationsMeRequest request, final AsyncApiCallback<EmergencyLocation> callback) {
    try {
      final SettableFuture<EmergencyLocation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EmergencyLocation>() {}, new AsyncApiCallback<ApiResponse<EmergencyLocation>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyLocation> response) {
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
   * Set current location for the logged in user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EmergencyLocation>> postCarrierservicesIntegrationsEmergencylocationsMeAsync(ApiRequest<EmergencyLocation> request, final AsyncApiCallback<ApiResponse<EmergencyLocation>> callback) {
    try {
      final SettableFuture<ApiResponse<EmergencyLocation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EmergencyLocation>() {}, new AsyncApiCallback<ApiResponse<EmergencyLocation>>() {
        @Override
        public void onCompleted(ApiResponse<EmergencyLocation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EmergencyLocation> response = (ApiResponse<EmergencyLocation>)(ApiResponse<?>)(new ApiException(exception));
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
