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

import com.mypurecloud.sdk.v2.model.ScimError;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimGroupListResponse;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypesListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaListResponse;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimUserListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;


import com.mypurecloud.sdk.v2.api.request.DeleteScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimGroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimResourcetypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimResourcetypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimServiceproviderconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2GroupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ResourcetypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ResourcetypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2SchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2SchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2ServiceproviderconfigRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.GetScimV2UsersRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.PatchScimV2UserRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostScimV2UsersRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimGroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimUserRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimV2GroupRequest;
import com.mypurecloud.sdk.v2.api.request.PutScimV2UserRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class SCIMApiAsync {
  private final ApiClient pcapiClient;

  public SCIMApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SCIMApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteScimUserAsync(DeleteScimUserRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
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
   * Delete a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteScimUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
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
   * Delete a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Empty> deleteScimV2UserAsync(DeleteScimV2UserRequest request, final AsyncApiCallback<Empty> callback) {
    try {
      final SettableFuture<Empty> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
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
   * Delete a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Empty>> deleteScimV2UserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Empty>> callback) {
    try {
      final SettableFuture<ApiResponse<Empty>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Empty>() {}, new AsyncApiCallback<ApiResponse<Empty>>() {
        @Override
        public void onCompleted(ApiResponse<Empty> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Empty> response = (ApiResponse<Empty>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> getScimGroupAsync(GetScimGroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Get a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> getScimGroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimGroupListResponse> getScimGroupsAsync(GetScimGroupsRequest request, final AsyncApiCallback<ScimGroupListResponse> callback) {
    try {
      final SettableFuture<ScimGroupListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimGroupListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimGroupListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimGroupListResponse> response) {
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
   * Get a list of groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimGroupListResponse>> getScimGroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimGroupListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimGroupListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimGroupListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimGroupListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimGroupListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a resource type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimConfigResourceType> getScimResourcetypeAsync(GetScimResourcetypeRequest request, final AsyncApiCallback<ScimConfigResourceType> callback) {
    try {
      final SettableFuture<ScimConfigResourceType> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimConfigResourceType>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceType>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceType> response) {
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
   * Get a resource type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimConfigResourceType>> getScimResourcetypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimConfigResourceType>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimConfigResourceType>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimConfigResourceType>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceType>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceType> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of resource types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimConfigResourceTypesListResponse> getScimResourcetypesAsync(GetScimResourcetypesRequest request, final AsyncApiCallback<ScimConfigResourceTypesListResponse> callback) {
    try {
      final SettableFuture<ScimConfigResourceTypesListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimConfigResourceTypesListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceTypesListResponse> response) {
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
   * Get a list of resource types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimConfigResourceTypesListResponse>> getScimResourcetypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimConfigResourceTypesListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimConfigResourceTypesListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceTypesListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a SCIM schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2SchemaDefinition> getScimSchemaAsync(GetScimSchemaRequest request, final AsyncApiCallback<ScimV2SchemaDefinition> callback) {
    try {
      final SettableFuture<ScimV2SchemaDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2SchemaDefinition>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaDefinition> response) {
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
   * Get a SCIM schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2SchemaDefinition>> getScimSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2SchemaDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2SchemaDefinition>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of SCIM schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2SchemaListResponse> getScimSchemasAsync(GetScimSchemasRequest request, final AsyncApiCallback<ScimV2SchemaListResponse> callback) {
    try {
      final SettableFuture<ScimV2SchemaListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2SchemaListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaListResponse> response) {
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
   * Get a list of SCIM schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2SchemaListResponse>> getScimSchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2SchemaListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2SchemaListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a service provider&#39;s configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimServiceProviderConfig> getScimServiceproviderconfigAsync(GetScimServiceproviderconfigRequest request, final AsyncApiCallback<ScimServiceProviderConfig> callback) {
    try {
      final SettableFuture<ScimServiceProviderConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimServiceProviderConfig>() {}, new AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>>() {
        @Override
        public void onCompleted(ApiResponse<ScimServiceProviderConfig> response) {
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
   * Get a service provider&#39;s configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimServiceProviderConfig>> getScimServiceproviderconfigAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimServiceProviderConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimServiceProviderConfig>() {}, new AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>>() {
        @Override
        public void onCompleted(ApiResponse<ScimServiceProviderConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> getScimUserAsync(GetScimUserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Get a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> getScimUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of users
   * To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \&quot;active eq false\&quot;. By default, returns SCIM attributes \&quot;externalId\&quot;, \&quot;enterprise-user:manager\&quot;, and \&quot;roles\&quot;. To exclude these attributes, set the attributes parameter to \&quot;id,active\&quot; or the excludeAttributes parameter to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimUserListResponse> getScimUsersAsync(GetScimUsersRequest request, final AsyncApiCallback<ScimUserListResponse> callback) {
    try {
      final SettableFuture<ScimUserListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimUserListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimUserListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimUserListResponse> response) {
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
   * Get a list of users
   * To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \&quot;active eq false\&quot;. By default, returns SCIM attributes \&quot;externalId\&quot;, \&quot;enterprise-user:manager\&quot;, and \&quot;roles\&quot;. To exclude these attributes, set the attributes parameter to \&quot;id,active\&quot; or the excludeAttributes parameter to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimUserListResponse>> getScimUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimUserListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimUserListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimUserListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimUserListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimUserListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> getScimV2GroupAsync(GetScimV2GroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Get a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> getScimV2GroupAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimGroupListResponse> getScimV2GroupsAsync(GetScimV2GroupsRequest request, final AsyncApiCallback<ScimGroupListResponse> callback) {
    try {
      final SettableFuture<ScimGroupListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimGroupListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimGroupListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimGroupListResponse> response) {
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
   * Get a list of groups
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimGroupListResponse>> getScimV2GroupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimGroupListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimGroupListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimGroupListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimGroupListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimGroupListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimGroupListResponse> response = (ApiResponse<ScimGroupListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a resource type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimConfigResourceType> getScimV2ResourcetypeAsync(GetScimV2ResourcetypeRequest request, final AsyncApiCallback<ScimConfigResourceType> callback) {
    try {
      final SettableFuture<ScimConfigResourceType> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimConfigResourceType>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceType>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceType> response) {
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
   * Get a resource type
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimConfigResourceType>> getScimV2ResourcetypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimConfigResourceType>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimConfigResourceType>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimConfigResourceType>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceType>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceType> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceType> response = (ApiResponse<ScimConfigResourceType>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of resource types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimConfigResourceTypesListResponse> getScimV2ResourcetypesAsync(GetScimV2ResourcetypesRequest request, final AsyncApiCallback<ScimConfigResourceTypesListResponse> callback) {
    try {
      final SettableFuture<ScimConfigResourceTypesListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimConfigResourceTypesListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceTypesListResponse> response) {
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
   * Get a list of resource types
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimConfigResourceTypesListResponse>> getScimV2ResourcetypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimConfigResourceTypesListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimConfigResourceTypesListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimConfigResourceTypesListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimConfigResourceTypesListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimConfigResourceTypesListResponse> response = (ApiResponse<ScimConfigResourceTypesListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a SCIM schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2SchemaDefinition> getScimV2SchemaAsync(GetScimV2SchemaRequest request, final AsyncApiCallback<ScimV2SchemaDefinition> callback) {
    try {
      final SettableFuture<ScimV2SchemaDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2SchemaDefinition>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaDefinition> response) {
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
   * Get a SCIM schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2SchemaDefinition>> getScimV2SchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2SchemaDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2SchemaDefinition>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaDefinition> response = (ApiResponse<ScimV2SchemaDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of SCIM schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2SchemaListResponse> getScimV2SchemasAsync(GetScimV2SchemasRequest request, final AsyncApiCallback<ScimV2SchemaListResponse> callback) {
    try {
      final SettableFuture<ScimV2SchemaListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2SchemaListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaListResponse> response) {
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
   * Get a list of SCIM schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2SchemaListResponse>> getScimV2SchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2SchemaListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2SchemaListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimV2SchemaListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2SchemaListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2SchemaListResponse> response = (ApiResponse<ScimV2SchemaListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a service provider&#39;s configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimServiceProviderConfig> getScimV2ServiceproviderconfigAsync(GetScimV2ServiceproviderconfigRequest request, final AsyncApiCallback<ScimServiceProviderConfig> callback) {
    try {
      final SettableFuture<ScimServiceProviderConfig> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimServiceProviderConfig>() {}, new AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>>() {
        @Override
        public void onCompleted(ApiResponse<ScimServiceProviderConfig> response) {
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
   * Get a service provider&#39;s configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimServiceProviderConfig>> getScimV2ServiceproviderconfigAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimServiceProviderConfig>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimServiceProviderConfig>() {}, new AsyncApiCallback<ApiResponse<ScimServiceProviderConfig>>() {
        @Override
        public void onCompleted(ApiResponse<ScimServiceProviderConfig> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimServiceProviderConfig> response = (ApiResponse<ScimServiceProviderConfig>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> getScimV2UserAsync(GetScimV2UserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Get a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> getScimV2UserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of users
   * To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \&quot;active eq false\&quot;. By default, returns SCIM attributes \&quot;externalId\&quot;, \&quot;enterprise-user:manager\&quot;, and \&quot;roles\&quot;. To exclude these attributes, set the attributes parameter to \&quot;id,active\&quot; or the excludeAttributes parameter to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimUserListResponse> getScimV2UsersAsync(GetScimV2UsersRequest request, final AsyncApiCallback<ScimUserListResponse> callback) {
    try {
      final SettableFuture<ScimUserListResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimUserListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimUserListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimUserListResponse> response) {
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
   * Get a list of users
   * To return all active users, do not use the filter parameter. To return inactive users, set the filter parameter to \&quot;active eq false\&quot;. By default, returns SCIM attributes \&quot;externalId\&quot;, \&quot;enterprise-user:manager\&quot;, and \&quot;roles\&quot;. To exclude these attributes, set the attributes parameter to \&quot;id,active\&quot; or the excludeAttributes parameter to \&quot;externalId,roles,urn:ietf:params:scim:schemas:extension:enterprise:2.0:User:division\&quot;.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimUserListResponse>> getScimV2UsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ScimUserListResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimUserListResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimUserListResponse>() {}, new AsyncApiCallback<ApiResponse<ScimUserListResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ScimUserListResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimUserListResponse> response = (ApiResponse<ScimUserListResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Modify a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> patchScimGroupAsync(PatchScimGroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Modify a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> patchScimGroupAsync(ApiRequest<ScimV2PatchRequest> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Modify a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> patchScimUserAsync(PatchScimUserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Modify a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> patchScimUserAsync(ApiRequest<ScimV2PatchRequest> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Modify a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> patchScimV2GroupAsync(PatchScimV2GroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Modify a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> patchScimV2GroupAsync(ApiRequest<ScimV2PatchRequest> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Modify a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> patchScimV2UserAsync(PatchScimV2UserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Modify a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> patchScimV2UserAsync(ApiRequest<ScimV2PatchRequest> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> postScimUsersAsync(PostScimUsersRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Create a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> postScimUsersAsync(ApiRequest<ScimV2CreateUser> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> postScimV2UsersAsync(PostScimV2UsersRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Create a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> postScimV2UsersAsync(ApiRequest<ScimV2CreateUser> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Replace a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> putScimGroupAsync(PutScimGroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Replace a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> putScimGroupAsync(ApiRequest<ScimV2Group> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Replace a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> putScimUserAsync(PutScimUserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Replace a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> putScimUserAsync(ApiRequest<ScimV2User> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
   * Replace a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2Group> putScimV2GroupAsync(PutScimV2GroupRequest request, final AsyncApiCallback<ScimV2Group> callback) {
    try {
      final SettableFuture<ScimV2Group> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
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
   * Replace a group
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2Group>> putScimV2GroupAsync(ApiRequest<ScimV2Group> request, final AsyncApiCallback<ApiResponse<ScimV2Group>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2Group>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2Group>() {}, new AsyncApiCallback<ApiResponse<ScimV2Group>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2Group> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2Group> response = (ApiResponse<ScimV2Group>)(ApiResponse<?>)(new ApiException(exception));
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
   * Replace a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ScimV2User> putScimV2UserAsync(PutScimV2UserRequest request, final AsyncApiCallback<ScimV2User> callback) {
    try {
      final SettableFuture<ScimV2User> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
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
   * Replace a user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ScimV2User>> putScimV2UserAsync(ApiRequest<ScimV2User> request, final AsyncApiCallback<ApiResponse<ScimV2User>> callback) {
    try {
      final SettableFuture<ApiResponse<ScimV2User>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ScimV2User>() {}, new AsyncApiCallback<ApiResponse<ScimV2User>>() {
        @Override
        public void onCompleted(ApiResponse<ScimV2User> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ScimV2User> response = (ApiResponse<ScimV2User>)(ApiResponse<?>)(new ApiException(exception));
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
