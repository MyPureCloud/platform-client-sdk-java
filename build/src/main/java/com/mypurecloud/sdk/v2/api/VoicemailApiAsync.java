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
import com.mypurecloud.sdk.v2.model.VoicemailMailboxInfo;
import com.mypurecloud.sdk.v2.model.VoicemailMessageEntityListing;
import com.mypurecloud.sdk.v2.model.VoicemailGroupPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailUserPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailMediaInfo;
import com.mypurecloud.sdk.v2.model.VoicemailOrganizationPolicy;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;
import com.mypurecloud.sdk.v2.model.CopyVoicemailMessage;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMailboxRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMeMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessageMediaRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailQueueMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailGroupPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMePolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PatchVoicemailUserpolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailMessageRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailPolicyRequest;
import com.mypurecloud.sdk.v2.api.request.PutVoicemailUserpolicyRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class VoicemailApiAsync {
  private final ApiClient pcapiClient;

  public VoicemailApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public VoicemailApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteVoicemailMessageAsync(DeleteVoicemailMessageRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a voicemail message.
   * A user voicemail can only be deleted by its associated user. A group voicemail can only be deleted by a user that is a member of the group. A queue voicemail can only be deleted by a user with the acd voicemail delete permission.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteVoicemailMessageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete all voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteVoicemailMessagesAsync(DeleteVoicemailMessagesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete all voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteVoicemailMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get the group&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMailboxInfo> getVoicemailGroupMailboxAsync(GetVoicemailGroupMailboxRequest request, final AsyncApiCallback<VoicemailMailboxInfo> callback) {
    try {
      final SettableFuture<VoicemailMailboxInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
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
   * Get the group&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailGroupMailboxAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMailboxInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessageEntityListing> getVoicemailGroupMessagesAsync(GetVoicemailGroupMessagesRequest request, final AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    try {
      final SettableFuture<VoicemailMessageEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailGroupMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessageEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a group&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailGroupPolicy> getVoicemailGroupPolicyAsync(GetVoicemailGroupPolicyRequest request, final AsyncApiCallback<VoicemailGroupPolicy> callback) {
    try {
      final SettableFuture<VoicemailGroupPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailGroupPolicy> response) {
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
   * Get a group&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailGroupPolicy>> getVoicemailGroupPolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailGroupPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailGroupPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailGroupPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the current user&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMailboxInfo> getVoicemailMailboxAsync(GetVoicemailMailboxRequest request, final AsyncApiCallback<VoicemailMailboxInfo> callback) {
    try {
      final SettableFuture<VoicemailMailboxInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
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
   * Get the current user&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailMailboxAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMailboxInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the current user&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMailboxInfo> getVoicemailMeMailboxAsync(GetVoicemailMeMailboxRequest request, final AsyncApiCallback<VoicemailMailboxInfo> callback) {
    try {
      final SettableFuture<VoicemailMailboxInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
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
   * Get the current user&#39;s mailbox information
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMailboxInfo>> getVoicemailMeMailboxAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMailboxInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMailboxInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMailboxInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMailboxInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMailboxInfo> response = (ApiResponse<VoicemailMailboxInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessageEntityListing> getVoicemailMeMessagesAsync(GetVoicemailMeMessagesRequest request, final AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    try {
      final SettableFuture<VoicemailMessageEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailMeMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessageEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the current user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailUserPolicy> getVoicemailMePolicyAsync(GetVoicemailMePolicyRequest request, final AsyncApiCallback<VoicemailUserPolicy> callback) {
    try {
      final SettableFuture<VoicemailUserPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
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
   * Get the current user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailUserPolicy>> getVoicemailMePolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailUserPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a voicemail message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessage> getVoicemailMessageAsync(GetVoicemailMessageRequest request, final AsyncApiCallback<VoicemailMessage> callback) {
    try {
      final SettableFuture<VoicemailMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
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
   * Get a voicemail message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessage>> getVoicemailMessageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get media playback URI for this voicemail message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMediaInfo> getVoicemailMessageMediaAsync(GetVoicemailMessageMediaRequest request, final AsyncApiCallback<VoicemailMediaInfo> callback) {
    try {
      final SettableFuture<VoicemailMediaInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMediaInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMediaInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMediaInfo> response) {
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
   * Get media playback URI for this voicemail message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMediaInfo>> getVoicemailMessageMediaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMediaInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMediaInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMediaInfo>() {}, new AsyncApiCallback<ApiResponse<VoicemailMediaInfo>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMediaInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMediaInfo> response = (ApiResponse<VoicemailMediaInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMediaInfo> response = (ApiResponse<VoicemailMediaInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessageEntityListing> getVoicemailMessagesAsync(GetVoicemailMessagesRequest request, final AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    try {
      final SettableFuture<VoicemailMessageEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessageEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailOrganizationPolicy> getVoicemailPolicyAsync(GetVoicemailPolicyRequest request, final AsyncApiCallback<VoicemailOrganizationPolicy> callback) {
    try {
      final SettableFuture<VoicemailOrganizationPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailOrganizationPolicy> response) {
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
   * Get a policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailOrganizationPolicy>> getVoicemailPolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailOrganizationPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailOrganizationPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailOrganizationPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessageEntityListing> getVoicemailQueueMessagesAsync(GetVoicemailQueueMessagesRequest request, final AsyncApiCallback<VoicemailMessageEntityListing> callback) {
    try {
      final SettableFuture<VoicemailMessageEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
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
   * List voicemail messages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessageEntityListing>> getVoicemailQueueMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessageEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessageEntityListing> response = (ApiResponse<VoicemailMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailsSearchResponse> getVoicemailSearchAsync(GetVoicemailSearchRequest request, final AsyncApiCallback<VoicemailsSearchResponse> callback) {
    try {
      final SettableFuture<VoicemailsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailsSearchResponse> response) {
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
   * Search voicemails using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> getVoicemailSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailUserPolicy> getVoicemailUserpolicyAsync(GetVoicemailUserpolicyRequest request, final AsyncApiCallback<VoicemailUserPolicy> callback) {
    try {
      final SettableFuture<VoicemailUserPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
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
   * Get a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailUserPolicy>> getVoicemailUserpolicyAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailUserPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a group&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailGroupPolicy> patchVoicemailGroupPolicyAsync(PatchVoicemailGroupPolicyRequest request, final AsyncApiCallback<VoicemailGroupPolicy> callback) {
    try {
      final SettableFuture<VoicemailGroupPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailGroupPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailGroupPolicy> response) {
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
   * Update a group&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailGroupPolicy>> patchVoicemailGroupPolicyAsync(ApiRequest<VoicemailGroupPolicy> request, final AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailGroupPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailGroupPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailGroupPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailGroupPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailGroupPolicy> response = (ApiResponse<VoicemailGroupPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the current user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailUserPolicy> patchVoicemailMePolicyAsync(PatchVoicemailMePolicyRequest request, final AsyncApiCallback<VoicemailUserPolicy> callback) {
    try {
      final SettableFuture<VoicemailUserPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
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
   * Update the current user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailUserPolicy>> patchVoicemailMePolicyAsync(ApiRequest<VoicemailUserPolicy> request, final AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailUserPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessage> patchVoicemailMessageAsync(PatchVoicemailMessageRequest request, final AsyncApiCallback<VoicemailMessage> callback) {
    try {
      final SettableFuture<VoicemailMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
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
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessage>> patchVoicemailMessageAsync(ApiRequest<VoicemailMessage> request, final AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailUserPolicy> patchVoicemailUserpolicyAsync(PatchVoicemailUserpolicyRequest request, final AsyncApiCallback<VoicemailUserPolicy> callback) {
    try {
      final SettableFuture<VoicemailUserPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
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
   * Update a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailUserPolicy>> patchVoicemailUserpolicyAsync(ApiRequest<VoicemailUserPolicy> request, final AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailUserPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Copy a voicemail message to a user or group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessage> postVoicemailMessagesAsync(PostVoicemailMessagesRequest request, final AsyncApiCallback<VoicemailMessage> callback) {
    try {
      final SettableFuture<VoicemailMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
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
   * Copy a voicemail message to a user or group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessage>> postVoicemailMessagesAsync(ApiRequest<CopyVoicemailMessage> request, final AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search voicemails
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailsSearchResponse> postVoicemailSearchAsync(PostVoicemailSearchRequest request, final AsyncApiCallback<VoicemailsSearchResponse> callback) {
    try {
      final SettableFuture<VoicemailsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailsSearchResponse> response) {
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
   * Search voicemails
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailsSearchResponse>> postVoicemailSearchAsync(ApiRequest<VoicemailSearchRequest> request, final AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<VoicemailsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailsSearchResponse> response = (ApiResponse<VoicemailsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailMessage> putVoicemailMessageAsync(PutVoicemailMessageRequest request, final AsyncApiCallback<VoicemailMessage> callback) {
    try {
      final SettableFuture<VoicemailMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
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
   * Update a voicemail message
   * A user voicemail can only be modified by its associated user. A group voicemail can only be modified by a user that is a member of the group. A queue voicemail can only be modified by a participant of the conversation the voicemail is associated with.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailMessage>> putVoicemailMessageAsync(ApiRequest<VoicemailMessage> request, final AsyncApiCallback<ApiResponse<VoicemailMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailMessage>() {}, new AsyncApiCallback<ApiResponse<VoicemailMessage>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailMessage> response = (ApiResponse<VoicemailMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailOrganizationPolicy> putVoicemailPolicyAsync(PutVoicemailPolicyRequest request, final AsyncApiCallback<VoicemailOrganizationPolicy> callback) {
    try {
      final SettableFuture<VoicemailOrganizationPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailOrganizationPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailOrganizationPolicy> response) {
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
   * Update a policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailOrganizationPolicy>> putVoicemailPolicyAsync(ApiRequest<VoicemailOrganizationPolicy> request, final AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailOrganizationPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailOrganizationPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailOrganizationPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailOrganizationPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailOrganizationPolicy> response = (ApiResponse<VoicemailOrganizationPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<VoicemailUserPolicy> putVoicemailUserpolicyAsync(PutVoicemailUserpolicyRequest request, final AsyncApiCallback<VoicemailUserPolicy> callback) {
    try {
      final SettableFuture<VoicemailUserPolicy> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
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
   * Update a user&#39;s voicemail policy
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<VoicemailUserPolicy>> putVoicemailUserpolicyAsync(ApiRequest<VoicemailUserPolicy> request, final AsyncApiCallback<ApiResponse<VoicemailUserPolicy>> callback) {
    try {
      final SettableFuture<ApiResponse<VoicemailUserPolicy>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<VoicemailUserPolicy>() {}, new AsyncApiCallback<ApiResponse<VoicemailUserPolicy>>() {
        @Override
        public void onCompleted(ApiResponse<VoicemailUserPolicy> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<VoicemailUserPolicy> response = (ApiResponse<VoicemailUserPolicy>)(ApiResponse<?>)(new ApiException(exception));
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
