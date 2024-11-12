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

import com.mypurecloud.sdk.v2.model.AnalyticsConversationWithoutAttributesMultiGetResponse;
import com.mypurecloud.sdk.v2.model.ConversationParticipantSearchRequest;
import com.mypurecloud.sdk.v2.model.DocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.DocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.DocumentationV2SearchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.model.GKNDocumentationSearchResponse;
import com.mypurecloud.sdk.v2.model.GroupSearchRequest;
import com.mypurecloud.sdk.v2.model.GroupsSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonCursorSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.LocationSearchRequest;
import com.mypurecloud.sdk.v2.model.LocationsSearchResponse;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SiteSearchRequest;
import com.mypurecloud.sdk.v2.model.SitesSearchResponse;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamSearchRequest;
import com.mypurecloud.sdk.v2.model.TeamsSearchResponse;
import com.mypurecloud.sdk.v2.model.TranscriptConversationDetailSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.VoicemailSearchRequest;
import com.mypurecloud.sdk.v2.model.VoicemailsSearchResponse;


import com.mypurecloud.sdk.v2.api.request.GetDocumentationGknSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyProvidersEdgesSitesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetVoicemailSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsTranscriptsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostConversationsParticipantsAttributesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationAllSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationGknSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostDocumentationSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostGroupsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostLocationsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostSearchSuggestRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTranscriptsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostTeamsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyProvidersEdgesSitesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchConversationTargetRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchQueuemembersManageRequest;
import com.mypurecloud.sdk.v2.api.request.PostUsersSearchTeamsAssignRequest;
import com.mypurecloud.sdk.v2.api.request.PostVoicemailSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class SearchApiAsync {
  private final ApiClient pcapiClient;

  public SearchApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GKNDocumentationSearchResponse> getDocumentationGknSearchAsync(GetDocumentationGknSearchRequest request, final AsyncApiCallback<GKNDocumentationSearchResponse> callback) {
    try {
      final SettableFuture<GKNDocumentationSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GKNDocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GKNDocumentationSearchResponse> response) {
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
   * Search gkn documentation using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GKNDocumentationSearchResponse>> getDocumentationGknSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GKNDocumentationSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GKNDocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GKNDocumentationSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentationSearchResponse> getDocumentationSearchAsync(GetDocumentationSearchRequest request, final AsyncApiCallback<DocumentationSearchResponse> callback) {
    try {
      final SettableFuture<DocumentationSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentationSearchResponse> response) {
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
   * Search documentation using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentationSearchResponse>> getDocumentationSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DocumentationSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentationSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentationSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GroupsSearchResponse> getGroupsSearchAsync(GetGroupsSearchRequest request, final AsyncApiCallback<GroupsSearchResponse> callback) {
    try {
      final SettableFuture<GroupsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GroupsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GroupsSearchResponse> response) {
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
   * Search groups using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GroupsSearchResponse>> getGroupsSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GroupsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GroupsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GroupsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GroupsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocationsSearchResponse> getLocationsSearchAsync(GetLocationsSearchRequest request, final AsyncApiCallback<LocationsSearchResponse> callback) {
    try {
      final SettableFuture<LocationsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
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
   * Search locations using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocationsSearchResponse>> getLocationsSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LocationsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search using the q64 value returned from a previous search.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonNodeSearchResponse> getSearchAsync(GetSearchRequest request, final AsyncApiCallback<JsonNodeSearchResponse> callback) {
    try {
      final SettableFuture<JsonNodeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
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
   * Search using the q64 value returned from a previous search.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonNodeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonNodeSearchResponse> getSearchSuggestAsync(GetSearchSuggestRequest request, final AsyncApiCallback<JsonNodeSearchResponse> callback) {
    try {
      final SettableFuture<JsonNodeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
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
   * Suggest resources using the q64 value returned from a previous suggest query.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> getSearchSuggestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonNodeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search sites using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SitesSearchResponse> getTelephonyProvidersEdgesSitesSearchAsync(GetTelephonyProvidersEdgesSitesSearchRequest request, final AsyncApiCallback<SitesSearchResponse> callback) {
    try {
      final SettableFuture<SitesSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SitesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<SitesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SitesSearchResponse> response) {
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
   * Search sites using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SitesSearchResponse>> getTelephonyProvidersEdgesSitesSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SitesSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SitesSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SitesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<SitesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SitesSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search users using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersSearchResponse> getUsersSearchAsync(GetUsersSearchRequest request, final AsyncApiCallback<UsersSearchResponse> callback) {
    try {
      final SettableFuture<UsersSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
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
   * Search users using the q64 value returned from a previous search
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersSearchResponse>> getUsersSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationWithoutAttributesMultiGetResponse> postAnalyticsConversationsTranscriptsQueryAsync(PostAnalyticsConversationsTranscriptsQueryRequest request, final AsyncApiCallback<AnalyticsConversationWithoutAttributesMultiGetResponse> callback) {
    try {
      final SettableFuture<AnalyticsConversationWithoutAttributesMultiGetResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> postAnalyticsConversationsTranscriptsQueryAsync(ApiRequest<TranscriptConversationDetailSearchRequest> request, final AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationWithoutAttributesMultiGetResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse> response = (ApiResponse<AnalyticsConversationWithoutAttributesMultiGetResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonCursorSearchResponse> postConversationsParticipantsAttributesSearchAsync(PostConversationsParticipantsAttributesSearchRequest request, final AsyncApiCallback<JsonCursorSearchResponse> callback) {
    try {
      final SettableFuture<JsonCursorSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonCursorSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonCursorSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonCursorSearchResponse> response) {
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
   * Search conversations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonCursorSearchResponse>> postConversationsParticipantsAttributesSearchAsync(ApiRequest<ConversationParticipantSearchRequest> request, final AsyncApiCallback<ApiResponse<JsonCursorSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonCursorSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonCursorSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonCursorSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonCursorSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonCursorSearchResponse> response = (ApiResponse<JsonCursorSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonCursorSearchResponse> response = (ApiResponse<JsonCursorSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search all documents
   * 
   * postDocumentationAllSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonNodeSearchResponse> postDocumentationAllSearchAsync(PostDocumentationAllSearchRequest request, final AsyncApiCallback<JsonNodeSearchResponse> callback) {
    try {
      final SettableFuture<JsonNodeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
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
   * Search all documents
   * 
   * postDocumentationAllSearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postDocumentationAllSearchAsync(ApiRequest<DocumentationV2SearchRequest> request, final AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonNodeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search gkn documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GKNDocumentationSearchResponse> postDocumentationGknSearchAsync(PostDocumentationGknSearchRequest request, final AsyncApiCallback<GKNDocumentationSearchResponse> callback) {
    try {
      final SettableFuture<GKNDocumentationSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GKNDocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GKNDocumentationSearchResponse> response) {
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
   * Search gkn documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GKNDocumentationSearchResponse>> postDocumentationGknSearchAsync(ApiRequest<GKNDocumentationSearchRequest> request, final AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GKNDocumentationSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GKNDocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GKNDocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GKNDocumentationSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GKNDocumentationSearchResponse> response = (ApiResponse<GKNDocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DocumentationSearchResponse> postDocumentationSearchAsync(PostDocumentationSearchRequest request, final AsyncApiCallback<DocumentationSearchResponse> callback) {
    try {
      final SettableFuture<DocumentationSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentationSearchResponse> response) {
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
   * Search documentation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DocumentationSearchResponse>> postDocumentationSearchAsync(ApiRequest<DocumentationSearchRequest> request, final AsyncApiCallback<ApiResponse<DocumentationSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DocumentationSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DocumentationSearchResponse>() {}, new AsyncApiCallback<ApiResponse<DocumentationSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DocumentationSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DocumentationSearchResponse> response = (ApiResponse<DocumentationSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GroupsSearchResponse> postGroupsSearchAsync(PostGroupsSearchRequest request, final AsyncApiCallback<GroupsSearchResponse> callback) {
    try {
      final SettableFuture<GroupsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GroupsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GroupsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GroupsSearchResponse> response) {
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
   * Search groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GroupsSearchResponse>> postGroupsSearchAsync(ApiRequest<GroupSearchRequest> request, final AsyncApiCallback<ApiResponse<GroupsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<GroupsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GroupsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<GroupsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<GroupsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GroupsSearchResponse> response = (ApiResponse<GroupsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search Documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearchAsync(PostKnowledgeKnowledgebaseSearchRequest request, final AsyncApiCallback<KnowledgeSearchResponse> callback) {
    try {
      final SettableFuture<KnowledgeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<KnowledgeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSearchResponse> response) {
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
   * Search Documents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   * @deprecated
   */
  public Future<ApiResponse<KnowledgeSearchResponse>> postKnowledgeKnowledgebaseSearchAsync(ApiRequest<KnowledgeSearchRequest> request, final AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<KnowledgeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<KnowledgeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<KnowledgeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<KnowledgeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search locations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LocationsSearchResponse> postLocationsSearchAsync(PostLocationsSearchRequest request, final AsyncApiCallback<LocationsSearchResponse> callback) {
    try {
      final SettableFuture<LocationsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
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
   * Search locations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LocationsSearchResponse>> postLocationsSearchAsync(ApiRequest<LocationSearchRequest> request, final AsyncApiCallback<ApiResponse<LocationsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<LocationsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LocationsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<LocationsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<LocationsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LocationsSearchResponse> response = (ApiResponse<LocationsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonNodeSearchResponse> postSearchAsync(PostSearchRequest request, final AsyncApiCallback<JsonNodeSearchResponse> callback) {
    try {
      final SettableFuture<JsonNodeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchAsync(ApiRequest<SearchRequest> request, final AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonNodeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Suggest resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonNodeSearchResponse> postSearchSuggestAsync(PostSearchSuggestRequest request, final AsyncApiCallback<JsonNodeSearchResponse> callback) {
    try {
      final SettableFuture<JsonNodeSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
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
   * Suggest resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonNodeSearchResponse>> postSearchSuggestAsync(ApiRequest<SuggestSearchRequest> request, final AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonNodeSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonNodeSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonNodeSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonNodeSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonNodeSearchResponse> response = (ApiResponse<JsonNodeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearchAsync(PostSpeechandtextanalyticsTranscriptsSearchRequest request, final AsyncApiCallback<JsonSearchResponse> callback) {
    try {
      final SettableFuture<JsonSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSearchResponse> response) {
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonSearchResponse>> postSpeechandtextanalyticsTranscriptsSearchAsync(ApiRequest<TranscriptSearchRequest> request, final AsyncApiCallback<ApiResponse<JsonSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TeamsSearchResponse> postTeamsSearchAsync(PostTeamsSearchRequest request, final AsyncApiCallback<TeamsSearchResponse> callback) {
    try {
      final SettableFuture<TeamsSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TeamsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<TeamsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TeamsSearchResponse> response) {
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
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TeamsSearchResponse>> postTeamsSearchAsync(ApiRequest<TeamSearchRequest> request, final AsyncApiCallback<ApiResponse<TeamsSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TeamsSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TeamsSearchResponse>() {}, new AsyncApiCallback<ApiResponse<TeamsSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TeamsSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TeamsSearchResponse> response = (ApiResponse<TeamsSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TeamsSearchResponse> response = (ApiResponse<TeamsSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search sites
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SitesSearchResponse> postTelephonyProvidersEdgesSitesSearchAsync(PostTelephonyProvidersEdgesSitesSearchRequest request, final AsyncApiCallback<SitesSearchResponse> callback) {
    try {
      final SettableFuture<SitesSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SitesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<SitesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SitesSearchResponse> response) {
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
   * Search sites
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SitesSearchResponse>> postTelephonyProvidersEdgesSitesSearchAsync(ApiRequest<SiteSearchRequest> request, final AsyncApiCallback<ApiResponse<SitesSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SitesSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SitesSearchResponse>() {}, new AsyncApiCallback<ApiResponse<SitesSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SitesSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SitesSearchResponse> response = (ApiResponse<SitesSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersSearchResponse> postUsersSearchAsync(PostUsersSearchRequest request, final AsyncApiCallback<UsersSearchResponse> callback) {
    try {
      final SettableFuture<UsersSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
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
   * Search users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchAsync(ApiRequest<UserSearchRequest> request, final AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search users as conversation targets
   * 
   * postUsersSearchConversationTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersSearchResponse> postUsersSearchConversationTargetAsync(PostUsersSearchConversationTargetRequest request, final AsyncApiCallback<UsersSearchResponse> callback) {
    try {
      final SettableFuture<UsersSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
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
   * Search users as conversation targets
   * 
   * postUsersSearchConversationTarget is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchConversationTargetAsync(ApiRequest<UserSearchRequest> request, final AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search manage queue member
   * 
   * postUsersSearchQueuemembersManage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersSearchResponse> postUsersSearchQueuemembersManageAsync(PostUsersSearchQueuemembersManageRequest request, final AsyncApiCallback<UsersSearchResponse> callback) {
    try {
      final SettableFuture<UsersSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
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
   * Search manage queue member
   * 
   * postUsersSearchQueuemembersManage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchQueuemembersManageAsync(ApiRequest<UserSearchRequest> request, final AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Search users assigned to teams
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UsersSearchResponse> postUsersSearchTeamsAssignAsync(PostUsersSearchTeamsAssignRequest request, final AsyncApiCallback<UsersSearchResponse> callback) {
    try {
      final SettableFuture<UsersSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
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
   * Search users assigned to teams
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UsersSearchResponse>> postUsersSearchTeamsAssignAsync(ApiRequest<UserSearchRequest> request, final AsyncApiCallback<ApiResponse<UsersSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<UsersSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UsersSearchResponse>() {}, new AsyncApiCallback<ApiResponse<UsersSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<UsersSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UsersSearchResponse> response = (ApiResponse<UsersSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
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
