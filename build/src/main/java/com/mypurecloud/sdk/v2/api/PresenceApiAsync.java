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
import com.mypurecloud.sdk.v2.model.OrganizationPresence;
import com.mypurecloud.sdk.v2.model.OrganizationPresenceEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPresence;
import com.mypurecloud.sdk.v2.model.UserPresence;
import com.mypurecloud.sdk.v2.model.PresenceExpand;


import com.mypurecloud.sdk.v2.api.request.DeletePresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetPresencedefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSystempresencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesMicrosoftteamsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserPresencesZoomphoneRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresenceRequest;
import com.mypurecloud.sdk.v2.api.request.PatchUserPresencesPurecloudRequest;
import com.mypurecloud.sdk.v2.api.request.PostPresencedefinitionsRequest;
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
   * Delete a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Get a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Get an Organization&#39;s list of Presence Definitions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
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
   * Get a user&#39;s Presence
   * Get a user&#39;s presence for the specified source that is not specifically listed.  Used to support custom presence sources.
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
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PresenceExpand> getUserPresencesMicrosoftteamsAsync(GetUserPresencesMicrosoftteamsRequest request, final AsyncApiCallback<PresenceExpand> callback) {
    try {
      final SettableFuture<PresenceExpand> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PresenceExpand>() {}, new AsyncApiCallback<ApiResponse<PresenceExpand>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceExpand> response) {
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
   * Get a user&#39;s Microsoft Teams presence.
   * Gets the presence for a Microsoft Teams user.  This will return the Microsoft Teams presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PresenceExpand>> getUserPresencesMicrosoftteamsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PresenceExpand>> callback) {
    try {
      final SettableFuture<ApiResponse<PresenceExpand>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PresenceExpand>() {}, new AsyncApiCallback<ApiResponse<PresenceExpand>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceExpand> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user&#39;s Genesys Cloud presence.
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
   * Get a user&#39;s Genesys Cloud presence.
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
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PresenceExpand> getUserPresencesZoomphoneAsync(GetUserPresencesZoomphoneRequest request, final AsyncApiCallback<PresenceExpand> callback) {
    try {
      final SettableFuture<PresenceExpand> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PresenceExpand>() {}, new AsyncApiCallback<ApiResponse<PresenceExpand>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceExpand> response) {
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
   * Get a user&#39;s Zoom Phone presence.
   * Gets the presence for a Zoom user.  This will return the Zoom Phone presence mapped to Genesys Cloud presence with additional activity details in the message field. This presence source is read-only.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PresenceExpand>> getUserPresencesZoomphoneAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PresenceExpand>> callback) {
    try {
      final SettableFuture<ApiResponse<PresenceExpand>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PresenceExpand>() {}, new AsyncApiCallback<ApiResponse<PresenceExpand>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceExpand> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceExpand> response = (ApiResponse<PresenceExpand>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a user&#39;s Presence
   * Patch a user&#39;s presence for the specified source that is not specifically listed. The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the &#39;source&#39; defined in the path as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Patch a Genesys Cloud user&#39;s presence
   * The presence object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the PURECLOUD source as the user&#39;s primary presence source. Option 2: Provide the presenceDefinition value. The &#39;id&#39; is the only value required within the presenceDefinition. Option 3: Provide the message value. Option 1 can be combined with Option 2 and/or Option 3.
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
   * Create a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
   * Update a Presence Definition
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
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
  public Future<ApiResponse<List<UserPresence>>> putUsersPresencesBulkAsync(ApiRequest<List<UserPresence>> request, final AsyncApiCallback<ApiResponse<List<UserPresence>>> callback) {
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
