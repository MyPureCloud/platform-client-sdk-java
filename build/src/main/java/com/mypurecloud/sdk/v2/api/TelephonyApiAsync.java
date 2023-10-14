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

import com.mypurecloud.sdk.v2.model.Callheader;
import com.mypurecloud.sdk.v2.model.Callmessage;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MediaRegions;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;


import com.mypurecloud.sdk.v2.api.request.GetTelephonyMediaregionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySipmessagesConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySipmessagesConversationHeadersRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesDownloadDownloadIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonySiptracesDownloadRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class TelephonyApiAsync {
  private final ApiClient pcapiClient;

  public TelephonyApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public TelephonyApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<MediaRegions> getTelephonyMediaregionsAsync(GetTelephonyMediaregionsRequest request, final AsyncApiCallback<MediaRegions> callback) {
    try {
      final SettableFuture<MediaRegions> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MediaRegions>() {}, new AsyncApiCallback<ApiResponse<MediaRegions>>() {
        @Override
        public void onCompleted(ApiResponse<MediaRegions> response) {
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
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<MediaRegions>> getTelephonyMediaregionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MediaRegions>> callback) {
    try {
      final SettableFuture<ApiResponse<MediaRegions>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MediaRegions>() {}, new AsyncApiCallback<ApiResponse<MediaRegions>>() {
        @Override
        public void onCompleted(ApiResponse<MediaRegions> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MediaRegions> response = (ApiResponse<MediaRegions>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MediaRegions> response = (ApiResponse<MediaRegions>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a SIP message.
   * Get the raw form of the SIP message
   * getTelephonySipmessagesConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Callmessage> getTelephonySipmessagesConversationAsync(GetTelephonySipmessagesConversationRequest request, final AsyncApiCallback<Callmessage> callback) {
    try {
      final SettableFuture<Callmessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Callmessage>() {}, new AsyncApiCallback<ApiResponse<Callmessage>>() {
        @Override
        public void onCompleted(ApiResponse<Callmessage> response) {
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
   * Get a SIP message.
   * Get the raw form of the SIP message
   * getTelephonySipmessagesConversation is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Callmessage>> getTelephonySipmessagesConversationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Callmessage>> callback) {
    try {
      final SettableFuture<ApiResponse<Callmessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Callmessage>() {}, new AsyncApiCallback<ApiResponse<Callmessage>>() {
        @Override
        public void onCompleted(ApiResponse<Callmessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Callmessage> response = (ApiResponse<Callmessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Callmessage> response = (ApiResponse<Callmessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * getTelephonySipmessagesConversationHeaders is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Callheader> getTelephonySipmessagesConversationHeadersAsync(GetTelephonySipmessagesConversationHeadersRequest request, final AsyncApiCallback<Callheader> callback) {
    try {
      final SettableFuture<Callheader> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Callheader>() {}, new AsyncApiCallback<ApiResponse<Callheader>>() {
        @Override
        public void onCompleted(ApiResponse<Callheader> response) {
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
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * getTelephonySipmessagesConversationHeaders is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Callheader>> getTelephonySipmessagesConversationHeadersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Callheader>> callback) {
    try {
      final SettableFuture<ApiResponse<Callheader>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Callheader>() {}, new AsyncApiCallback<ApiResponse<Callheader>>() {
        @Override
        public void onCompleted(ApiResponse<Callheader> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Callheader> response = (ApiResponse<Callheader>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Callheader> response = (ApiResponse<Callheader>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SipSearchResult> getTelephonySiptracesAsync(GetTelephonySiptracesRequest request, final AsyncApiCallback<SipSearchResult> callback) {
    try {
      final SettableFuture<SipSearchResult> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SipSearchResult>() {}, new AsyncApiCallback<ApiResponse<SipSearchResult>>() {
        @Override
        public void onCompleted(ApiResponse<SipSearchResult> response) {
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
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SipSearchResult>> getTelephonySiptracesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SipSearchResult>> callback) {
    try {
      final SettableFuture<ApiResponse<SipSearchResult>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SipSearchResult>() {}, new AsyncApiCallback<ApiResponse<SipSearchResult>>() {
        @Override
        public void onCompleted(ApiResponse<SipSearchResult> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get signed S3 URL for a pcap download
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SignedUrlResponse> getTelephonySiptracesDownloadDownloadIdAsync(GetTelephonySiptracesDownloadDownloadIdRequest request, final AsyncApiCallback<SignedUrlResponse> callback) {
    try {
      final SettableFuture<SignedUrlResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SignedUrlResponse>() {}, new AsyncApiCallback<ApiResponse<SignedUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SignedUrlResponse> response) {
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
   * Get signed S3 URL for a pcap download
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SignedUrlResponse>> getTelephonySiptracesDownloadDownloadIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SignedUrlResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SignedUrlResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SignedUrlResponse>() {}, new AsyncApiCallback<ApiResponse<SignedUrlResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SignedUrlResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Request a download of a pcap file to S3
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SipDownloadResponse> postTelephonySiptracesDownloadAsync(PostTelephonySiptracesDownloadRequest request, final AsyncApiCallback<SipDownloadResponse> callback) {
    try {
      final SettableFuture<SipDownloadResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SipDownloadResponse>() {}, new AsyncApiCallback<ApiResponse<SipDownloadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SipDownloadResponse> response) {
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
   * Request a download of a pcap file to S3
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SipDownloadResponse>> postTelephonySiptracesDownloadAsync(ApiRequest<SIPSearchPublicRequest> request, final AsyncApiCallback<ApiResponse<SipDownloadResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SipDownloadResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SipDownloadResponse>() {}, new AsyncApiCallback<ApiResponse<SipDownloadResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SipDownloadResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
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
