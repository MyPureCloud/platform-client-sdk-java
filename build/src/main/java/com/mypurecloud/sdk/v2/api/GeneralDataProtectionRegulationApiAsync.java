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
import com.mypurecloud.sdk.v2.model.GDPRRequest;
import com.mypurecloud.sdk.v2.model.GDPRRequestEntityListing;
import com.mypurecloud.sdk.v2.model.GDPRSubjectEntityListing;


import com.mypurecloud.sdk.v2.api.request.GetGdprRequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetGdprRequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGdprSubjectsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGdprRequestsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class GeneralDataProtectionRegulationApiAsync {
  private final ApiClient pcapiClient;

  public GeneralDataProtectionRegulationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GeneralDataProtectionRegulationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get an existing GDPR request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GDPRRequest> getGdprRequestAsync(GetGdprRequestRequest request, final AsyncApiCallback<GDPRRequest> callback) {
    try {
      final SettableFuture<GDPRRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GDPRRequest>() {}, new AsyncApiCallback<ApiResponse<GDPRRequest>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequest> response) {
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
   * Get an existing GDPR request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GDPRRequest>> getGdprRequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GDPRRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<GDPRRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GDPRRequest>() {}, new AsyncApiCallback<ApiResponse<GDPRRequest>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all GDPR requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GDPRRequestEntityListing> getGdprRequestsAsync(GetGdprRequestsRequest request, final AsyncApiCallback<GDPRRequestEntityListing> callback) {
    try {
      final SettableFuture<GDPRRequestEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GDPRRequestEntityListing>() {}, new AsyncApiCallback<ApiResponse<GDPRRequestEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequestEntityListing> response) {
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
   * Get all GDPR requests
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GDPRRequestEntityListing>> getGdprRequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GDPRRequestEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GDPRRequestEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GDPRRequestEntityListing>() {}, new AsyncApiCallback<ApiResponse<GDPRRequestEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequestEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequestEntityListing> response = (ApiResponse<GDPRRequestEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequestEntityListing> response = (ApiResponse<GDPRRequestEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get GDPR subjects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GDPRSubjectEntityListing> getGdprSubjectsAsync(GetGdprSubjectsRequest request, final AsyncApiCallback<GDPRSubjectEntityListing> callback) {
    try {
      final SettableFuture<GDPRSubjectEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GDPRSubjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<GDPRSubjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRSubjectEntityListing> response) {
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
   * Get GDPR subjects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GDPRSubjectEntityListing>> getGdprSubjectsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GDPRSubjectEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GDPRSubjectEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GDPRSubjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<GDPRSubjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRSubjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRSubjectEntityListing> response = (ApiResponse<GDPRSubjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRSubjectEntityListing> response = (ApiResponse<GDPRSubjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Submit a new GDPR request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GDPRRequest> postGdprRequestsAsync(PostGdprRequestsRequest request, final AsyncApiCallback<GDPRRequest> callback) {
    try {
      final SettableFuture<GDPRRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GDPRRequest>() {}, new AsyncApiCallback<ApiResponse<GDPRRequest>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequest> response) {
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
   * Submit a new GDPR request
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GDPRRequest>> postGdprRequestsAsync(ApiRequest<GDPRRequest> request, final AsyncApiCallback<ApiResponse<GDPRRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<GDPRRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GDPRRequest>() {}, new AsyncApiCallback<ApiResponse<GDPRRequest>>() {
        @Override
        public void onCompleted(ApiResponse<GDPRRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GDPRRequest> response = (ApiResponse<GDPRRequest>)(ApiResponse<?>)(new ApiException(exception));
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
