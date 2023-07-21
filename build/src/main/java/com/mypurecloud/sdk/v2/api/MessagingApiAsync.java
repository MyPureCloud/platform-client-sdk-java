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
import com.mypurecloud.sdk.v2.model.MessagingConfigListing;
import com.mypurecloud.sdk.v2.model.MessagingSetting;
import com.mypurecloud.sdk.v2.model.MessagingSettingDefaultRequest;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequest;
import com.mypurecloud.sdk.v2.model.SupportedContent;
import com.mypurecloud.sdk.v2.model.SupportedContentListing;


import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSettingsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSettingsDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentRequest;
import com.mypurecloud.sdk.v2.api.request.GetMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchMessagingSettingRequest;
import com.mypurecloud.sdk.v2.api.request.PatchMessagingSupportedcontentSupportedContentIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostMessagingSupportedcontentRequest;
import com.mypurecloud.sdk.v2.api.request.PutMessagingSettingsDefaultRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class MessagingApiAsync {
  private final ApiClient pcapiClient;

  public MessagingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deleteMessagingSettingAsync(DeleteMessagingSettingRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deleteMessagingSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deleteMessagingSettingsDefaultAsync(DeleteMessagingSettingsDefaultRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete the organization's default setting, a global default will be applied to integrations without settings
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deleteMessagingSettingsDefaultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deleteMessagingSupportedcontentSupportedContentIdAsync(DeleteMessagingSupportedcontentSupportedContentIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a supported content profile
   * Deprecated - use DELETE /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deleteMessagingSupportedcontentSupportedContentIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingSetting> getMessagingSettingAsync(GetMessagingSettingRequest request, final AsyncApiCallback<MessagingSetting> callback) {
    try {
      final SettableFuture<MessagingSetting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
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
   * Get a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingSetting>> getMessagingSettingAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingSetting>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingSetting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of messaging settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingConfigListing> getMessagingSettingsAsync(GetMessagingSettingsRequest request, final AsyncApiCallback<MessagingConfigListing> callback) {
    try {
      final SettableFuture<MessagingConfigListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingConfigListing>() {}, new AsyncApiCallback<ApiResponse<MessagingConfigListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingConfigListing> response) {
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
   * Get a list of messaging settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingConfigListing>> getMessagingSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingConfigListing>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingConfigListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingConfigListing>() {}, new AsyncApiCallback<ApiResponse<MessagingConfigListing>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingConfigListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingConfigListing> response = (ApiResponse<MessagingConfigListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingConfigListing> response = (ApiResponse<MessagingConfigListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingSetting> getMessagingSettingsDefaultAsync(GetMessagingSettingsDefaultRequest request, final AsyncApiCallback<MessagingSetting> callback) {
    try {
      final SettableFuture<MessagingSetting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
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
   * Get the organization's default settings that will be used as the default when creating an integration.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingSetting>> getMessagingSettingsDefaultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<MessagingSetting>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingSetting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<SupportedContentListing> getMessagingSupportedcontentAsync(GetMessagingSupportedcontentRequest request, final AsyncApiCallback<SupportedContentListing> callback) {
    try {
      final SettableFuture<SupportedContentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SupportedContentListing>() {}, new AsyncApiCallback<ApiResponse<SupportedContentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContentListing> response) {
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
   * Get a list of Supported Content profiles
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<SupportedContentListing>> getMessagingSupportedcontentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SupportedContentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SupportedContentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SupportedContentListing>() {}, new AsyncApiCallback<ApiResponse<SupportedContentListing>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContentListing> response = (ApiResponse<SupportedContentListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<SupportedContent> getMessagingSupportedcontentSupportedContentIdAsync(GetMessagingSupportedcontentSupportedContentIdRequest request, final AsyncApiCallback<SupportedContent> callback) {
    try {
      final SettableFuture<SupportedContent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
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
   * Get a supported content profile
   * Deprecated - use GET /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<SupportedContent>> getMessagingSupportedcontentSupportedContentIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SupportedContent>> callback) {
    try {
      final SettableFuture<ApiResponse<SupportedContent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingSetting> patchMessagingSettingAsync(PatchMessagingSettingRequest request, final AsyncApiCallback<MessagingSetting> callback) {
    try {
      final SettableFuture<MessagingSetting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
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
   * Update a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingSetting>> patchMessagingSettingAsync(ApiRequest<MessagingSettingRequest> request, final AsyncApiCallback<ApiResponse<MessagingSetting>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingSetting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<SupportedContent> patchMessagingSupportedcontentSupportedContentIdAsync(PatchMessagingSupportedcontentSupportedContentIdRequest request, final AsyncApiCallback<SupportedContent> callback) {
    try {
      final SettableFuture<SupportedContent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
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
   * Update a supported content profile
   * Deprecated - use PATCH /api/v2/conversations/messaging/supportedcontent/{supportedContentId} as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<SupportedContent>> patchMessagingSupportedcontentSupportedContentIdAsync(ApiRequest<SupportedContent> request, final AsyncApiCallback<ApiResponse<SupportedContent>> callback) {
    try {
      final SettableFuture<ApiResponse<SupportedContent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingSetting> postMessagingSettingsAsync(PostMessagingSettingsRequest request, final AsyncApiCallback<MessagingSetting> callback) {
    try {
      final SettableFuture<MessagingSetting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
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
   * Create a messaging setting
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingSetting>> postMessagingSettingsAsync(ApiRequest<MessagingSettingRequest> request, final AsyncApiCallback<ApiResponse<MessagingSetting>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingSetting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<SupportedContent> postMessagingSupportedcontentAsync(PostMessagingSupportedcontentRequest request, final AsyncApiCallback<SupportedContent> callback) {
    try {
      final SettableFuture<SupportedContent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
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
   * Create a Supported Content profile
   * Deprecated - use POST /api/v2/conversations/messaging/supportedcontent as replacement
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<SupportedContent>> postMessagingSupportedcontentAsync(ApiRequest<SupportedContent> request, final AsyncApiCallback<ApiResponse<SupportedContent>> callback) {
    try {
      final SettableFuture<ApiResponse<SupportedContent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SupportedContent>() {}, new AsyncApiCallback<ApiResponse<SupportedContent>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedContent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedContent> response = (ApiResponse<SupportedContent>)(ApiResponse<?>)(new ApiException(exception));
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
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<MessagingSetting> putMessagingSettingsDefaultAsync(PutMessagingSettingsDefaultRequest request, final AsyncApiCallback<MessagingSetting> callback) {
    try {
      final SettableFuture<MessagingSetting> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
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
   * Set the organization's default settings that may be applied to an integration when it is created.
   * When an integration is created a settings ID may be assigned to it. If the settings ID is not supplied, the default settings will be applied to it.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<MessagingSetting>> putMessagingSettingsDefaultAsync(ApiRequest<MessagingSettingDefaultRequest> request, final AsyncApiCallback<ApiResponse<MessagingSetting>> callback) {
    try {
      final SettableFuture<ApiResponse<MessagingSetting>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<MessagingSetting>() {}, new AsyncApiCallback<ApiResponse<MessagingSetting>>() {
        @Override
        public void onCompleted(ApiResponse<MessagingSetting> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<MessagingSetting> response = (ApiResponse<MessagingSetting>)(ApiResponse<?>)(new ApiException(exception));
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
