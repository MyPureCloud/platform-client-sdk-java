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
import com.mypurecloud.sdk.v2.model.MutableUserPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinition;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceDefinitionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.PresenceSettings;
import com.mypurecloud.sdk.v2.model.Source;
import com.mypurecloud.sdk.v2.model.SourceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UcUserPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.UserPrimarySource;


import com.mypurecloud.sdk.v2.api.request.DeletePresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.DeletePresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.GetPresenceDefinitions0Request;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceSourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresenceUserPrimarysourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersPresenceBulkRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersPresencesPurecloudBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresenceDefinitions0Request;
import com.mypurecloud.sdk.v2.api.request.PostPresenceSourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceDefinition0Request;
import com.mypurecloud.sdk.v2.api.request.PutPresenceSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceSourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresenceUserPrimarysourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.PutUsersPresencesBulkRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class PresenceApiAsync {
  private final ApiClient pcapiClient;

  public PresenceApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public PresenceApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deletePresenceDefinition0Async(DeletePresenceDefinition0Request request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deletePresenceDefinition0Async(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deletePresenceSourceAsync(DeletePresenceSourceRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deletePresenceSourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Presence Definition. Apps should migrate to use DELETE /api/v2/presence/definitions/{definitionId} instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<Void> deletePresencedefinitionAsync(DeletePresencedefinitionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Presence Definition. Apps should migrate to use DELETE /api/v2/presence/definitions/{definitionId} instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<Void>> deletePresencedefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationPresenceDefinition> getPresenceDefinition0Async(GetPresenceDefinition0Request request, final AsyncApiCallback<OrganizationPresenceDefinition> callback) {
    try {
      final SettableFuture<OrganizationPresenceDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
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
   * Get a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationPresenceDefinition>> getPresenceDefinition0Async(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresenceDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Presence Definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationPresenceDefinitionEntityListing> getPresenceDefinitions0Async(GetPresenceDefinitions0Request request, final AsyncApiCallback<OrganizationPresenceDefinitionEntityListing> callback) {
    try {
      final SettableFuture<OrganizationPresenceDefinitionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinitionEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinitionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinitionEntityListing> response) {
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
   * Get a list of Presence Definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationPresenceDefinitionEntityListing>> getPresenceDefinitions0Async(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationPresenceDefinitionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresenceDefinitionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresenceDefinitionEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinitionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinitionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinitionEntityListing> response = (ApiResponse<OrganizationPresenceDefinitionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinitionEntityListing> response = (ApiResponse<OrganizationPresenceDefinitionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the presence settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PresenceSettings> getPresenceSettingsAsync(GetPresenceSettingsRequest request, final AsyncApiCallback<PresenceSettings> callback) {
    try {
      final SettableFuture<PresenceSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PresenceSettings>() {}, new AsyncApiCallback<ApiResponse<PresenceSettings>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceSettings> response) {
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
   * Get the presence settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PresenceSettings>> getPresenceSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PresenceSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<PresenceSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PresenceSettings>() {}, new AsyncApiCallback<ApiResponse<PresenceSettings>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Source> getPresenceSourceAsync(GetPresenceSourceRequest request, final AsyncApiCallback<Source> callback) {
    try {
      final SettableFuture<Source> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
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
   * Get a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Source>> getPresenceSourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Source>> callback) {
    try {
      final SettableFuture<ApiResponse<Source>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of Presence Sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SourceEntityListing> getPresenceSourcesAsync(GetPresenceSourcesRequest request, final AsyncApiCallback<SourceEntityListing> callback) {
    try {
      final SettableFuture<SourceEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SourceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SourceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SourceEntityListing> response) {
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
   * Get a list of Presence Sources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SourceEntityListing>> getPresenceSourcesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SourceEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SourceEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SourceEntityListing>() {}, new AsyncApiCallback<ApiResponse<SourceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SourceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceEntityListing> response = (ApiResponse<SourceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SourceEntityListing> response = (ApiResponse<SourceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user's Primary Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPrimarySource> getPresenceUserPrimarysourceAsync(GetPresenceUserPrimarysourceRequest request, final AsyncApiCallback<UserPrimarySource> callback) {
    try {
      final SettableFuture<UserPrimarySource> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPrimarySource>() {}, new AsyncApiCallback<ApiResponse<UserPrimarySource>>() {
        @Override
        public void onCompleted(ApiResponse<UserPrimarySource> response) {
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
   * Get a user's Primary Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPrimarySource>> getPresenceUserPrimarysourceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserPrimarySource>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPrimarySource>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPrimarySource>() {}, new AsyncApiCallback<ApiResponse<UserPrimarySource>>() {
        @Override
        public void onCompleted(ApiResponse<UserPrimarySource> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a Presence Definition. Apps should migrate to use GET /api/v2/presence/definitions/{definitionId} instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<OrganizationPresence> getPresencedefinitionAsync(GetPresencedefinitionRequest request, final AsyncApiCallback<OrganizationPresence> callback) {
    try {
      final SettableFuture<OrganizationPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
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
   * Get a Presence Definition. Apps should migrate to use GET /api/v2/presence/definitions/{definitionId} instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<OrganizationPresence>> getPresencedefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an Organization's list of Presence Definitions. Apps should migrate to use GET /api/v2/presence/definitions instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<OrganizationPresenceEntityListing> getPresencedefinitionsAsync(GetPresencedefinitionsRequest request, final AsyncApiCallback<OrganizationPresenceEntityListing> callback) {
    try {
      final SettableFuture<OrganizationPresenceEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceEntityListing> response) {
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
   * Get an Organization's list of Presence Definitions. Apps should migrate to use GET /api/v2/presence/definitions instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<OrganizationPresenceEntityListing>> getPresencedefinitionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationPresenceEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresenceEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresenceEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceEntityListing> response = (ApiResponse<OrganizationPresenceEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceEntityListing> response = (ApiResponse<OrganizationPresenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of SystemPresences
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<SystemPresence>> getSystempresencesAsync(GetSystempresencesRequest request, final AsyncApiCallback<List<SystemPresence>> callback) {
    try {
      final SettableFuture<List<SystemPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<SystemPresence>>() {}, new AsyncApiCallback<ApiResponse<List<SystemPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SystemPresence>> response) {
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
   * Get the list of SystemPresences
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<SystemPresence>>> getSystempresencesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<SystemPresence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<SystemPresence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<SystemPresence>>() {}, new AsyncApiCallback<ApiResponse<List<SystemPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<SystemPresence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SystemPresence>> response = (ApiResponse<List<SystemPresence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<SystemPresence>> response = (ApiResponse<List<SystemPresence>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresence> getUserPresenceAsync(GetUserPresenceRequest request, final AsyncApiCallback<UserPresence> callback) {
    try {
      final SettableFuture<UserPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
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
   * Get a user's Presence
   * Get a user's presence for the specified source that is not specifically listed.  Used to support custom presence sources. This endpoint does not support registered presence sources.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresence>> getUserPresenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user's Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresence> getUserPresencesPurecloudAsync(GetUserPresencesPurecloudRequest request, final AsyncApiCallback<UserPresence> callback) {
    try {
      final SettableFuture<UserPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
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
   * Get a user's Genesys Cloud presence.
   * Get the default Genesys Cloud user presence source PURECLOUD
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresence>> getUserPresencesPurecloudAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get bulk user presences for a single presence source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UcUserPresence>> getUsersPresenceBulkAsync(GetUsersPresenceBulkRequest request, final AsyncApiCallback<List<UcUserPresence>> callback) {
    try {
      final SettableFuture<List<UcUserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UcUserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UcUserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UcUserPresence>> response) {
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
   * Get bulk user presences for a single presence source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UcUserPresence>>> getUsersPresenceBulkAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<UcUserPresence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<UcUserPresence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UcUserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UcUserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UcUserPresence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UcUserPresence>> response = (ApiResponse<List<UcUserPresence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UcUserPresence>> response = (ApiResponse<List<UcUserPresence>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get bulk user presences for a Genesys Cloud (PURECLOUD) presence source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UcUserPresence>> getUsersPresencesPurecloudBulkAsync(GetUsersPresencesPurecloudBulkRequest request, final AsyncApiCallback<List<UcUserPresence>> callback) {
    try {
      final SettableFuture<List<UcUserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UcUserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UcUserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UcUserPresence>> response) {
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
   * Get bulk user presences for a Genesys Cloud (PURECLOUD) presence source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UcUserPresence>>> getUsersPresencesPurecloudBulkAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<UcUserPresence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<UcUserPresence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UcUserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UcUserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UcUserPresence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UcUserPresence>> response = (ApiResponse<List<UcUserPresence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UcUserPresence>> response = (ApiResponse<List<UcUserPresence>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresence> patchUserPresenceAsync(PatchUserPresenceRequest request, final AsyncApiCallback<UserPresence> callback) {
    try {
      final SettableFuture<UserPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
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
   * Patch a user's Presence
   * Patch a user's presence for the specified source that is not specifically listed. This endpoint does not support registered presence sources. The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the 'source' defined in the path as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresence>> patchUserPresenceAsync(ApiRequest<UserPresence> request, final AsyncApiCallback<ApiResponse<UserPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPresence> patchUserPresencesPurecloudAsync(PatchUserPresencesPurecloudRequest request, final AsyncApiCallback<UserPresence> callback) {
    try {
      final SettableFuture<UserPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
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
   * Patch a Genesys Cloud user's presence
   * The presence object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the PURECLOUD source as the user's primary presence source. Option 2: Provide the presenceDefinition value. The 'id' is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPresence>> patchUserPresencesPurecloudAsync(ApiRequest<UserPresence> request, final AsyncApiCallback<ApiResponse<UserPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPresence>() {}, new AsyncApiCallback<ApiResponse<UserPresence>>() {
        @Override
        public void onCompleted(ApiResponse<UserPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPresence> response = (ApiResponse<UserPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationPresenceDefinition> postPresenceDefinitions0Async(PostPresenceDefinitions0Request request, final AsyncApiCallback<OrganizationPresenceDefinition> callback) {
    try {
      final SettableFuture<OrganizationPresenceDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
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
   * Create a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationPresenceDefinition>> postPresenceDefinitions0Async(ApiRequest<OrganizationPresenceDefinition> request, final AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresenceDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Source> postPresenceSourcesAsync(PostPresenceSourcesRequest request, final AsyncApiCallback<Source> callback) {
    try {
      final SettableFuture<Source> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
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
   * Create a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Source>> postPresenceSourcesAsync(ApiRequest<Source> request, final AsyncApiCallback<ApiResponse<Source>> callback) {
    try {
      final SettableFuture<ApiResponse<Source>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a Presence Definition. Apps should migrate to use POST /api/v2/presence/definitions instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<OrganizationPresence> postPresencedefinitionsAsync(PostPresencedefinitionsRequest request, final AsyncApiCallback<OrganizationPresence> callback) {
    try {
      final SettableFuture<OrganizationPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
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
   * Create a Presence Definition. Apps should migrate to use POST /api/v2/presence/definitions instead
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<OrganizationPresence>> postPresencedefinitionsAsync(ApiRequest<OrganizationPresence> request, final AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationPresenceDefinition> putPresenceDefinition0Async(PutPresenceDefinition0Request request, final AsyncApiCallback<OrganizationPresenceDefinition> callback) {
    try {
      final SettableFuture<OrganizationPresenceDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
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
   * Update a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationPresenceDefinition>> putPresenceDefinition0Async(ApiRequest<OrganizationPresenceDefinition> request, final AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresenceDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresenceDefinition>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresenceDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresenceDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresenceDefinition> response = (ApiResponse<OrganizationPresenceDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the presence settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PresenceSettings> putPresenceSettingsAsync(PutPresenceSettingsRequest request, final AsyncApiCallback<PresenceSettings> callback) {
    try {
      final SettableFuture<PresenceSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PresenceSettings>() {}, new AsyncApiCallback<ApiResponse<PresenceSettings>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceSettings> response) {
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
   * Update the presence settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PresenceSettings>> putPresenceSettingsAsync(ApiRequest<PresenceSettings> request, final AsyncApiCallback<ApiResponse<PresenceSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<PresenceSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PresenceSettings>() {}, new AsyncApiCallback<ApiResponse<PresenceSettings>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceSettings> response = (ApiResponse<PresenceSettings>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Source> putPresenceSourceAsync(PutPresenceSourceRequest request, final AsyncApiCallback<Source> callback) {
    try {
      final SettableFuture<Source> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
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
   * Update a Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Source>> putPresenceSourceAsync(ApiRequest<Source> request, final AsyncApiCallback<ApiResponse<Source>> callback) {
    try {
      final SettableFuture<ApiResponse<Source>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Source>() {}, new AsyncApiCallback<ApiResponse<Source>>() {
        @Override
        public void onCompleted(ApiResponse<Source> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Source> response = (ApiResponse<Source>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a user's Primary Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserPrimarySource> putPresenceUserPrimarysourceAsync(PutPresenceUserPrimarysourceRequest request, final AsyncApiCallback<UserPrimarySource> callback) {
    try {
      final SettableFuture<UserPrimarySource> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserPrimarySource>() {}, new AsyncApiCallback<ApiResponse<UserPrimarySource>>() {
        @Override
        public void onCompleted(ApiResponse<UserPrimarySource> response) {
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
   * Update a user's Primary Presence Source
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserPrimarySource>> putPresenceUserPrimarysourceAsync(ApiRequest<UserPrimarySource> request, final AsyncApiCallback<ApiResponse<UserPrimarySource>> callback) {
    try {
      final SettableFuture<ApiResponse<UserPrimarySource>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserPrimarySource>() {}, new AsyncApiCallback<ApiResponse<UserPrimarySource>>() {
        @Override
        public void onCompleted(ApiResponse<UserPrimarySource> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserPrimarySource> response = (ApiResponse<UserPrimarySource>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a Presence Definition. Apps should migrate to use PUT /api/v2/presence/definitions/{definitionId} instead)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<OrganizationPresence> putPresencedefinitionAsync(PutPresencedefinitionRequest request, final AsyncApiCallback<OrganizationPresence> callback) {
    try {
      final SettableFuture<OrganizationPresence> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
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
   * Update a Presence Definition. Apps should migrate to use PUT /api/v2/presence/definitions/{definitionId} instead)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<OrganizationPresence>> putPresencedefinitionAsync(ApiRequest<OrganizationPresence> request, final AsyncApiCallback<ApiResponse<OrganizationPresence>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationPresence>() {}, new AsyncApiCallback<ApiResponse<OrganizationPresence>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationPresence> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationPresence> response = (ApiResponse<OrganizationPresence>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update bulk user Presences
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UserPresence>> putUsersPresencesBulkAsync(PutUsersPresencesBulkRequest request, final AsyncApiCallback<List<UserPresence>> callback) {
    try {
      final SettableFuture<List<UserPresence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserPresence>> response) {
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
   * Update bulk user Presences
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UserPresence>>> putUsersPresencesBulkAsync(ApiRequest<List<MutableUserPresence>> request, final AsyncApiCallback<ApiResponse<List<UserPresence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<UserPresence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UserPresence>>() {}, new AsyncApiCallback<ApiResponse<List<UserPresence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserPresence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserPresence>> response = (ApiResponse<List<UserPresence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserPresence>> response = (ApiResponse<List<UserPresence>>)(ApiResponse<?>)(new ApiException(exception));
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
