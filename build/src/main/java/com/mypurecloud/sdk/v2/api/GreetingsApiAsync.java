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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.GreetingListing;


import com.mypurecloud.sdk.v2.api.request.DeleteGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingRequest;
import com.mypurecloud.sdk.v2.api.request.PutGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutGroupGreetingsDefaultsRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserGreetingsDefaultsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class GreetingsApiAsync {
  private final ApiClient pcapiClient;

  public GreetingsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public GreetingsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Deletes a Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteGreetingAsync(DeleteGreetingRequest request, final AsyncApiCallback<Void> callback) {
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
   * Deletes a Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteGreetingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Greeting> getGreetingAsync(GetGreetingRequest request, final AsyncApiCallback<Greeting> callback) {
    try {
      final SettableFuture<Greeting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
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
   * Get a Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Greeting>> getGreetingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Greeting>> callback) {
    try {
      final SettableFuture<ApiResponse<Greeting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get media playback URI for this greeting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GreetingMediaInfo> getGreetingMediaAsync(GetGreetingMediaRequest request, final AsyncApiCallback<GreetingMediaInfo> callback) {
    try {
      final SettableFuture<GreetingMediaInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GreetingMediaInfo>() {}, new AsyncApiCallback<ApiResponse<GreetingMediaInfo>>() {
        @Override
        public void onCompleted(ApiResponse<GreetingMediaInfo> response) {
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
   * Get media playback URI for this greeting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GreetingMediaInfo>> getGreetingMediaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GreetingMediaInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<GreetingMediaInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GreetingMediaInfo>() {}, new AsyncApiCallback<ApiResponse<GreetingMediaInfo>>() {
        @Override
        public void onCompleted(ApiResponse<GreetingMediaInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GreetingMediaInfo> response = (ApiResponse<GreetingMediaInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GreetingMediaInfo> response = (ApiResponse<GreetingMediaInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets an Organization&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEntityListing> getGreetingsAsync(GetGreetingsRequest request, final AsyncApiCallback<DomainEntityListing> callback) {
    try {
      final SettableFuture<DomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityListing> response) {
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
   * Gets an Organization&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEntityListing>> getGreetingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> getGreetingsDefaultsAsync(GetGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Get an Organization&#39;s DefaultGreetingList
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> getGreetingsDefaultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of the Group&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GreetingListing> getGroupGreetingsAsync(GetGroupGreetingsRequest request, final AsyncApiCallback<GreetingListing> callback) {
    try {
      final SettableFuture<GreetingListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GreetingListing>() {}, new AsyncApiCallback<ApiResponse<GreetingListing>>() {
        @Override
        public void onCompleted(ApiResponse<GreetingListing> response) {
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
   * Get a list of the Group&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GreetingListing>> getGroupGreetingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GreetingListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GreetingListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GreetingListing>() {}, new AsyncApiCallback<ApiResponse<GreetingListing>>() {
        @Override
        public void onCompleted(ApiResponse<GreetingListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GreetingListing> response = (ApiResponse<GreetingListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GreetingListing> response = (ApiResponse<GreetingListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> getGroupGreetingsDefaultsAsync(GetGroupGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Grabs the list of Default Greetings given a Group&#39;s ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> getGroupGreetingsDefaultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of the User&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainEntityListing> getUserGreetingsAsync(GetUserGreetingsRequest request, final AsyncApiCallback<DomainEntityListing> callback) {
    try {
      final SettableFuture<DomainEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityListing> response) {
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
   * Get a list of the User&#39;s Greetings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainEntityListing>> getUserGreetingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DomainEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainEntityListing>() {}, new AsyncApiCallback<ApiResponse<DomainEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DomainEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainEntityListing> response = (ApiResponse<DomainEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> getUserGreetingsDefaultsAsync(GetUserGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Grabs the list of Default Greetings given a User&#39;s ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> getUserGreetingsDefaultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Greeting for an Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Greeting> postGreetingsAsync(PostGreetingsRequest request, final AsyncApiCallback<Greeting> callback) {
    try {
      final SettableFuture<Greeting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
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
   * Create a Greeting for an Organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Greeting>> postGreetingsAsync(ApiRequest<Greeting> request, final AsyncApiCallback<ApiResponse<Greeting>> callback) {
    try {
      final SettableFuture<ApiResponse<Greeting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a Greeting for a Group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Greeting> postGroupGreetingsAsync(PostGroupGreetingsRequest request, final AsyncApiCallback<Greeting> callback) {
    try {
      final SettableFuture<Greeting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
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
   * Creates a Greeting for a Group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Greeting>> postGroupGreetingsAsync(ApiRequest<Greeting> request, final AsyncApiCallback<ApiResponse<Greeting>> callback) {
    try {
      final SettableFuture<ApiResponse<Greeting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Creates a Greeting for a User
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Greeting> postUserGreetingsAsync(PostUserGreetingsRequest request, final AsyncApiCallback<Greeting> callback) {
    try {
      final SettableFuture<Greeting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
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
   * Creates a Greeting for a User
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Greeting>> postUserGreetingsAsync(ApiRequest<Greeting> request, final AsyncApiCallback<ApiResponse<Greeting>> callback) {
    try {
      final SettableFuture<ApiResponse<Greeting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates the Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Greeting> putGreetingAsync(PutGreetingRequest request, final AsyncApiCallback<Greeting> callback) {
    try {
      final SettableFuture<Greeting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
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
   * Updates the Greeting with the given GreetingId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Greeting>> putGreetingAsync(ApiRequest<Greeting> request, final AsyncApiCallback<ApiResponse<Greeting>> callback) {
    try {
      final SettableFuture<ApiResponse<Greeting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Greeting>() {}, new AsyncApiCallback<ApiResponse<Greeting>>() {
        @Override
        public void onCompleted(ApiResponse<Greeting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Greeting> response = (ApiResponse<Greeting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> putGreetingsDefaultsAsync(PutGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Update an Organization&#39;s DefaultGreetingList
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> putGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> putGroupGreetingsDefaultsAsync(PutGroupGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Updates the DefaultGreetingList of the specified Group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> putGroupGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DefaultGreetingList> putUserGreetingsDefaultsAsync(PutUserGreetingsDefaultsRequest request, final AsyncApiCallback<DefaultGreetingList> callback) {
    try {
      final SettableFuture<DefaultGreetingList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
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
   * Updates the DefaultGreetingList of the specified User
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DefaultGreetingList>> putUserGreetingsDefaultsAsync(ApiRequest<DefaultGreetingList> request, final AsyncApiCallback<ApiResponse<DefaultGreetingList>> callback) {
    try {
      final SettableFuture<ApiResponse<DefaultGreetingList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DefaultGreetingList>() {}, new AsyncApiCallback<ApiResponse<DefaultGreetingList>>() {
        @Override
        public void onCompleted(ApiResponse<DefaultGreetingList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DefaultGreetingList> response = (ApiResponse<DefaultGreetingList>)(ApiResponse<?>)(new ApiException(exception));
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
