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

import com.mypurecloud.sdk.v2.model.ServerDate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IpAddressRangeListing;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.ParsedCertificate;
import com.mypurecloud.sdk.v2.model.Certificate;


import com.mypurecloud.sdk.v2.api.request.GetDateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIprangesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTimezonesRequest;
import com.mypurecloud.sdk.v2.api.request.PostCertificateDetailsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class UtilitiesApiAsync {
  private final ApiClient pcapiClient;

  public UtilitiesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public UtilitiesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get the current system date/time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ServerDate> getDateAsync(GetDateRequest request, final AsyncApiCallback<ServerDate> callback) {
    try {
      final SettableFuture<ServerDate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ServerDate>() {}, new AsyncApiCallback<ApiResponse<ServerDate>>() {
        @Override
        public void onCompleted(ApiResponse<ServerDate> response) {
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
   * Get the current system date/time
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ServerDate>> getDateAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ServerDate>> callback) {
    try {
      final SettableFuture<ApiResponse<ServerDate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ServerDate>() {}, new AsyncApiCallback<ApiResponse<ServerDate>>() {
        @Override
        public void onCompleted(ApiResponse<ServerDate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ServerDate> response = (ApiResponse<ServerDate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ServerDate> response = (ApiResponse<ServerDate>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get public ip address ranges for PureCloud
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IpAddressRangeListing> getIprangesAsync(GetIprangesRequest request, final AsyncApiCallback<IpAddressRangeListing> callback) {
    try {
      final SettableFuture<IpAddressRangeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IpAddressRangeListing>() {}, new AsyncApiCallback<ApiResponse<IpAddressRangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressRangeListing> response) {
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
   * Get public ip address ranges for PureCloud
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IpAddressRangeListing>> getIprangesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IpAddressRangeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IpAddressRangeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IpAddressRangeListing>() {}, new AsyncApiCallback<ApiResponse<IpAddressRangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<IpAddressRangeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressRangeListing> response = (ApiResponse<IpAddressRangeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IpAddressRangeListing> response = (ApiResponse<IpAddressRangeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get time zones list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeZoneEntityListing> getTimezonesAsync(GetTimezonesRequest request, final AsyncApiCallback<TimeZoneEntityListing> callback) {
    try {
      final SettableFuture<TimeZoneEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeZoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<TimeZoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneEntityListing> response) {
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
   * Get time zones list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeZoneEntityListing>> getTimezonesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeZoneEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeZoneEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeZoneEntityListing>() {}, new AsyncApiCallback<ApiResponse<TimeZoneEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TimeZoneEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeZoneEntityListing> response = (ApiResponse<TimeZoneEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ParsedCertificate> postCertificateDetailsAsync(PostCertificateDetailsRequest request, final AsyncApiCallback<ParsedCertificate> callback) {
    try {
      final SettableFuture<ParsedCertificate> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ParsedCertificate>() {}, new AsyncApiCallback<ApiResponse<ParsedCertificate>>() {
        @Override
        public void onCompleted(ApiResponse<ParsedCertificate> response) {
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
   * Returns the information about an X509 PEM encoded certificate or certificate chain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ParsedCertificate>> postCertificateDetailsAsync(ApiRequest<Certificate> request, final AsyncApiCallback<ApiResponse<ParsedCertificate>> callback) {
    try {
      final SettableFuture<ApiResponse<ParsedCertificate>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ParsedCertificate>() {}, new AsyncApiCallback<ApiResponse<ParsedCertificate>>() {
        @Override
        public void onCompleted(ApiResponse<ParsedCertificate> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ParsedCertificate> response = (ApiResponse<ParsedCertificate>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ParsedCertificate> response = (ApiResponse<ParsedCertificate>)(ApiResponse<?>)(new ApiException(exception));
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
