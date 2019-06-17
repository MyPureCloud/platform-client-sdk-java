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
import com.mypurecloud.sdk.v2.model.WebChatDeployment;
import com.mypurecloud.sdk.v2.model.WebChatDeploymentEntityListing;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequest;
import com.mypurecloud.sdk.v2.model.WebChatGuestMediaRequestEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfo;
import com.mypurecloud.sdk.v2.model.WebChatMemberInfoEntityList;
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import com.mypurecloud.sdk.v2.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.model.WebChatSettings;
import com.mypurecloud.sdk.v2.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.model.WebChatTyping;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatConversationRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatGuestConversationMemberRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMediarequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMediarequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMemberRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMembersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMessageRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatGuestConversationMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWebchatSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWebchatGuestConversationMediarequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatDeploymentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationMemberMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationMemberTypingRequest;
import com.mypurecloud.sdk.v2.api.request.PostWebchatGuestConversationsRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatDeploymentRequest;
import com.mypurecloud.sdk.v2.api.request.PutWebchatSettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WebChatApiAsync {
  private final ApiClient pcapiClient;

  public WebChatApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WebChatApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebchatDeploymentAsync(DeleteWebchatDeploymentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebchatDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Remove a member from a chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebchatGuestConversationMemberAsync(DeleteWebchatGuestConversationMemberRequest request, final AsyncApiCallback<Void> callback) {
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
   * Remove a member from a chat conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebchatGuestConversationMemberAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Remove WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteWebchatSettingsAsync(DeleteWebchatSettingsRequest request, final AsyncApiCallback<Void> callback) {
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
   * Remove WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteWebchatSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> getWebchatDeploymentAsync(GetWebchatDeploymentRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
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
   * Get a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> getWebchatDeploymentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
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
   * List WebChat deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeploymentEntityListing> getWebchatDeploymentsAsync(GetWebchatDeploymentsRequest request, final AsyncApiCallback<WebChatDeploymentEntityListing> callback) {
    try {
      final SettableFuture<WebChatDeploymentEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeploymentEntityListing> response) {
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
   * List WebChat deployments
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeploymentEntityListing>> getWebchatDeploymentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeploymentEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeploymentEntityListing>() {}, new AsyncApiCallback<ApiResponse<WebChatDeploymentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeploymentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeploymentEntityListing> response = (ApiResponse<WebChatDeploymentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a media request in the conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatGuestMediaRequest> getWebchatGuestConversationMediarequestAsync(GetWebchatGuestConversationMediarequestRequest request, final AsyncApiCallback<WebChatGuestMediaRequest> callback) {
    try {
      final SettableFuture<WebChatGuestMediaRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequest>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequest> response) {
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
   * Get a media request in the conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatGuestMediaRequest>> getWebchatGuestConversationMediarequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatGuestMediaRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatGuestMediaRequest>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all media requests to the guest in the conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatGuestMediaRequestEntityList> getWebchatGuestConversationMediarequestsAsync(GetWebchatGuestConversationMediarequestsRequest request, final AsyncApiCallback<WebChatGuestMediaRequestEntityList> callback) {
    try {
      final SettableFuture<WebChatGuestMediaRequestEntityList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequestEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequestEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequestEntityList> response) {
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
   * Get all media requests to the guest in the conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatGuestMediaRequestEntityList>> getWebchatGuestConversationMediarequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatGuestMediaRequestEntityList>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatGuestMediaRequestEntityList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatGuestMediaRequestEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequestEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequestEntityList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequestEntityList> response = (ApiResponse<WebChatGuestMediaRequestEntityList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequestEntityList> response = (ApiResponse<WebChatGuestMediaRequestEntityList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a web chat conversation member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatMemberInfo> getWebchatGuestConversationMemberAsync(GetWebchatGuestConversationMemberRequest request, final AsyncApiCallback<WebChatMemberInfo> callback) {
    try {
      final SettableFuture<WebChatMemberInfo> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatMemberInfo>() {}, new AsyncApiCallback<ApiResponse<WebChatMemberInfo>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMemberInfo> response) {
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
   * Get a web chat conversation member
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatMemberInfo>> getWebchatGuestConversationMemberAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatMemberInfo>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatMemberInfo>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatMemberInfo>() {}, new AsyncApiCallback<ApiResponse<WebChatMemberInfo>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMemberInfo> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMemberInfo> response = (ApiResponse<WebChatMemberInfo>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMemberInfo> response = (ApiResponse<WebChatMemberInfo>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the members of a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatMemberInfoEntityList> getWebchatGuestConversationMembersAsync(GetWebchatGuestConversationMembersRequest request, final AsyncApiCallback<WebChatMemberInfoEntityList> callback) {
    try {
      final SettableFuture<WebChatMemberInfoEntityList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatMemberInfoEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatMemberInfoEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMemberInfoEntityList> response) {
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
   * Get the members of a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatMemberInfoEntityList>> getWebchatGuestConversationMembersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatMemberInfoEntityList>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatMemberInfoEntityList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatMemberInfoEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatMemberInfoEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMemberInfoEntityList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMemberInfoEntityList> response = (ApiResponse<WebChatMemberInfoEntityList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMemberInfoEntityList> response = (ApiResponse<WebChatMemberInfoEntityList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a web chat conversation message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatMessage> getWebchatGuestConversationMessageAsync(GetWebchatGuestConversationMessageRequest request, final AsyncApiCallback<WebChatMessage> callback) {
    try {
      final SettableFuture<WebChatMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatMessage>() {}, new AsyncApiCallback<ApiResponse<WebChatMessage>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessage> response) {
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
   * Get a web chat conversation message
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatMessage>> getWebchatGuestConversationMessageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatMessage>() {}, new AsyncApiCallback<ApiResponse<WebChatMessage>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the messages of a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatMessageEntityList> getWebchatGuestConversationMessagesAsync(GetWebchatGuestConversationMessagesRequest request, final AsyncApiCallback<WebChatMessageEntityList> callback) {
    try {
      final SettableFuture<WebChatMessageEntityList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatMessageEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatMessageEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessageEntityList> response) {
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
   * Get the messages of a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatMessageEntityList>> getWebchatGuestConversationMessagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatMessageEntityList>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatMessageEntityList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatMessageEntityList>() {}, new AsyncApiCallback<ApiResponse<WebChatMessageEntityList>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessageEntityList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessageEntityList> response = (ApiResponse<WebChatMessageEntityList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessageEntityList> response = (ApiResponse<WebChatMessageEntityList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatSettings> getWebchatSettingsAsync(GetWebchatSettingsRequest request, final AsyncApiCallback<WebChatSettings> callback) {
    try {
      final SettableFuture<WebChatSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
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
   * Get WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatSettings>> getWebchatSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatGuestMediaRequest> patchWebchatGuestConversationMediarequestAsync(PatchWebchatGuestConversationMediarequestRequest request, final AsyncApiCallback<WebChatGuestMediaRequest> callback) {
    try {
      final SettableFuture<WebChatGuestMediaRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatGuestMediaRequest>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequest> response) {
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
   * Update a media request in the conversation, setting the state to ACCEPTED/DECLINED/ERRORED
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatGuestMediaRequest>> patchWebchatGuestConversationMediarequestAsync(ApiRequest<WebChatGuestMediaRequest> request, final AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatGuestMediaRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatGuestMediaRequest>() {}, new AsyncApiCallback<ApiResponse<WebChatGuestMediaRequest>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatGuestMediaRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatGuestMediaRequest> response = (ApiResponse<WebChatGuestMediaRequest>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> postWebchatDeploymentsAsync(PostWebchatDeploymentsRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
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
   * Create WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> postWebchatDeploymentsAsync(ApiRequest<WebChatDeployment> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
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
   * Send a message in a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatMessage> postWebchatGuestConversationMemberMessagesAsync(PostWebchatGuestConversationMemberMessagesRequest request, final AsyncApiCallback<WebChatMessage> callback) {
    try {
      final SettableFuture<WebChatMessage> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatMessage>() {}, new AsyncApiCallback<ApiResponse<WebChatMessage>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessage> response) {
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
   * Send a message in a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatMessage>> postWebchatGuestConversationMemberMessagesAsync(ApiRequest<CreateWebChatMessageRequest> request, final AsyncApiCallback<ApiResponse<WebChatMessage>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatMessage>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatMessage>() {}, new AsyncApiCallback<ApiResponse<WebChatMessage>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatMessage> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatMessage> response = (ApiResponse<WebChatMessage>)(ApiResponse<?>)(new ApiException(exception));
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
   * Send a typing-indicator in a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatTyping> postWebchatGuestConversationMemberTypingAsync(PostWebchatGuestConversationMemberTypingRequest request, final AsyncApiCallback<WebChatTyping> callback) {
    try {
      final SettableFuture<WebChatTyping> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatTyping>() {}, new AsyncApiCallback<ApiResponse<WebChatTyping>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatTyping> response) {
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
   * Send a typing-indicator in a chat conversation.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatTyping>> postWebchatGuestConversationMemberTypingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WebChatTyping>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatTyping>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatTyping>() {}, new AsyncApiCallback<ApiResponse<WebChatTyping>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatTyping> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatTyping> response = (ApiResponse<WebChatTyping>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatTyping> response = (ApiResponse<WebChatTyping>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CreateWebChatConversationResponse> postWebchatGuestConversationsAsync(PostWebchatGuestConversationsRequest request, final AsyncApiCallback<CreateWebChatConversationResponse> callback) {
    try {
      final SettableFuture<CreateWebChatConversationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CreateWebChatConversationResponse>() {}, new AsyncApiCallback<ApiResponse<CreateWebChatConversationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateWebChatConversationResponse> response) {
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
   * Create an ACD chat conversation from an external customer.
   * This endpoint will create a new ACD Chat conversation under the specified Chat Deployment.  The conversation will begin with a guest member in it (with a role=CUSTOMER) according to the customer information that is supplied. If the guest member is authenticated, the &#39;memberAuthToken&#39; field should include his JWT as generated by the &#39;POST /api/v2/signeddata&#39; resource; if the guest member is anonymous (and the Deployment permits it) this field can be omitted.  The returned data includes the IDs of the conversation created, along with a newly-create JWT token that you can supply to all future endpoints as authentication to perform operations against that conversation. After successfully creating a conversation, you should connect a websocket to the event stream named in the &#39;eventStreamUri&#39; field of the response; the conversation is not routed until the event stream is attached.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CreateWebChatConversationResponse>> postWebchatGuestConversationsAsync(ApiRequest<CreateWebChatConversationRequest> request, final AsyncApiCallback<ApiResponse<CreateWebChatConversationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CreateWebChatConversationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CreateWebChatConversationResponse>() {}, new AsyncApiCallback<ApiResponse<CreateWebChatConversationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CreateWebChatConversationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateWebChatConversationResponse> response = (ApiResponse<CreateWebChatConversationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CreateWebChatConversationResponse> response = (ApiResponse<CreateWebChatConversationResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatDeployment> putWebchatDeploymentAsync(PutWebchatDeploymentRequest request, final AsyncApiCallback<WebChatDeployment> callback) {
    try {
      final SettableFuture<WebChatDeployment> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
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
   * Update a WebChat deployment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatDeployment>> putWebchatDeploymentAsync(ApiRequest<WebChatDeployment> request, final AsyncApiCallback<ApiResponse<WebChatDeployment>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatDeployment>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatDeployment>() {}, new AsyncApiCallback<ApiResponse<WebChatDeployment>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatDeployment> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatDeployment> response = (ApiResponse<WebChatDeployment>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WebChatSettings> putWebchatSettingsAsync(PutWebchatSettingsRequest request, final AsyncApiCallback<WebChatSettings> callback) {
    try {
      final SettableFuture<WebChatSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
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
   * Update WebChat deployment settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WebChatSettings>> putWebchatSettingsAsync(ApiRequest<WebChatSettings> request, final AsyncApiCallback<ApiResponse<WebChatSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<WebChatSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WebChatSettings>() {}, new AsyncApiCallback<ApiResponse<WebChatSettings>>() {
        @Override
        public void onCompleted(ApiResponse<WebChatSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WebChatSettings> response = (ApiResponse<WebChatSettings>)(ApiResponse<?>)(new ApiException(exception));
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
