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
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPermissionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationProductsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersAddRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRoleUsersRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRolesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AuthorizationApiAsync {
  private final ApiClient pcapiClient;

  public AuthorizationApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAuthorizationRoleAsync(DeleteAuthorizationRoleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAuthorizationRoleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Removes all the roles from the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteUserRolesAsync(DeleteUserRolesRequest request, final AsyncApiCallback<Void> callback) {
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
   * Removes all the roles from the user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteUserRolesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PermissionCollectionEntityListing> getAuthorizationPermissionsAsync(GetAuthorizationPermissionsRequest request, final AsyncApiCallback<PermissionCollectionEntityListing> callback) {
    try {
      final SettableFuture<PermissionCollectionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PermissionCollectionEntityListing>() {}, new AsyncApiCallback<ApiResponse<PermissionCollectionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PermissionCollectionEntityListing> response) {
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
   * Get all permissions.
   * Retrieve a list of all permission defined in the system.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PermissionCollectionEntityListing>> getAuthorizationPermissionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<PermissionCollectionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<PermissionCollectionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PermissionCollectionEntityListing>() {}, new AsyncApiCallback<ApiResponse<PermissionCollectionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PermissionCollectionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PermissionCollectionEntityListing> response = (ApiResponse<PermissionCollectionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PermissionCollectionEntityListing> response = (ApiResponse<PermissionCollectionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationProductEntityListing> getAuthorizationProductsAsync(GetAuthorizationProductsRequest request, final AsyncApiCallback<OrganizationProductEntityListing> callback) {
    try {
      final SettableFuture<OrganizationProductEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationProductEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationProductEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationProductEntityListing> response) {
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
   * Get the list of enabled products
   * Gets the list of enabled products. Some example product names are: collaborateFree, collaboratePro, communicate, and engage.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationProductEntityListing>> getAuthorizationProductsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationProductEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationProductEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationProductEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationProductEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationProductEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationProductEntityListing> response = (ApiResponse<OrganizationProductEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationProductEntityListing> response = (ApiResponse<OrganizationProductEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrganizationRole> getAuthorizationRoleAsync(GetAuthorizationRoleRequest request, final AsyncApiCallback<DomainOrganizationRole> callback) {
    try {
      final SettableFuture<DomainOrganizationRole> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
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
   * Get a single organization role.
   * Get the organization role specified by its ID.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrganizationRole>> getAuthorizationRoleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrganizationRole>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrgRoleDifference> getAuthorizationRoleComparedefaultRightRoleIdAsync(GetAuthorizationRoleComparedefaultRightRoleIdRequest request, final AsyncApiCallback<DomainOrgRoleDifference> callback) {
    try {
      final SettableFuture<DomainOrgRoleDifference> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {}, new AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrgRoleDifference> response) {
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
   * Get an org role to default role comparison comparison
   * Compares any organization role to a default role id and show differences
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrgRoleDifference>> getAuthorizationRoleComparedefaultRightRoleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrgRoleDifference>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrgRoleDifference>() {}, new AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrgRoleDifference> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of all roles defined for the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationRoleEntityListing> getAuthorizationRolesAsync(GetAuthorizationRolesRequest request, final AsyncApiCallback<OrganizationRoleEntityListing> callback) {
    try {
      final SettableFuture<OrganizationRoleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
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
   * Retrieve a list of all roles defined for the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> getAuthorizationRolesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationRoleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserAuthorization> getUserRolesAsync(GetUserRolesRequest request, final AsyncApiCallback<UserAuthorization> callback) {
    try {
      final SettableFuture<UserAuthorization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserAuthorization>() {}, new AsyncApiCallback<ApiResponse<UserAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<UserAuthorization> response) {
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
   * Returns a listing of roles and permissions for a user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserAuthorization>> getUserRolesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserAuthorization>> callback) {
    try {
      final SettableFuture<ApiResponse<UserAuthorization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserAuthorization>() {}, new AsyncApiCallback<ApiResponse<UserAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<UserAuthorization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrganizationRole> patchAuthorizationRoleAsync(PatchAuthorizationRoleRequest request, final AsyncApiCallback<DomainOrganizationRole> callback) {
    try {
      final SettableFuture<DomainOrganizationRole> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
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
   * Patch Organization Role for needsUpdate Field
   * Patch Organization Role for needsUpdate Field
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrganizationRole>> patchAuthorizationRoleAsync(ApiRequest<DomainOrganizationRole> request, final AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrganizationRole>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrgRoleDifference> postAuthorizationRoleComparedefaultRightRoleIdAsync(PostAuthorizationRoleComparedefaultRightRoleIdRequest request, final AsyncApiCallback<DomainOrgRoleDifference> callback) {
    try {
      final SettableFuture<DomainOrgRoleDifference> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrgRoleDifference>() {}, new AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrgRoleDifference> response) {
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
   * Get an unsaved org role to default role comparison
   * Allows users to compare their existing roles in an unsaved state to its default role
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrgRoleDifference>> postAuthorizationRoleComparedefaultRightRoleIdAsync(ApiRequest<DomainOrganizationRole> request, final AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrgRoleDifference>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrgRoleDifference>() {}, new AsyncApiCallback<ApiResponse<DomainOrgRoleDifference>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrgRoleDifference> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrgRoleDifference> response = (ApiResponse<DomainOrgRoleDifference>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrganizationRole> postAuthorizationRolesAsync(PostAuthorizationRolesRequest request, final AsyncApiCallback<DomainOrganizationRole> callback) {
    try {
      final SettableFuture<DomainOrganizationRole> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
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
   * Create an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrganizationRole>> postAuthorizationRolesAsync(ApiRequest<DomainOrganizationRoleCreate> request, final AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrganizationRole>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
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
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationRoleEntityListing> postAuthorizationRolesDefaultAsync(PostAuthorizationRolesDefaultRequest request, final AsyncApiCallback<OrganizationRoleEntityListing> callback) {
    try {
      final SettableFuture<OrganizationRoleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
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
   * Restores all default roles
   * This endpoint serves several purposes. 1. It provides the org with default roles. This is important for default roles that will be added after go-live (they can retroactively add the new default-role). Note: When not using a query param of force=true, it only adds the default roles not configured for the org; it does not overwrite roles. 2. Using the query param force=true, you can restore all default roles. Note: This does not have an effect on custom roles.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> postAuthorizationRolesDefaultAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationRoleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an organization role.
   * Update
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DomainOrganizationRole> putAuthorizationRoleAsync(PutAuthorizationRoleRequest request, final AsyncApiCallback<DomainOrganizationRole> callback) {
    try {
      final SettableFuture<DomainOrganizationRole> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
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
   * Update an organization role.
   * Update
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DomainOrganizationRole>> putAuthorizationRoleAsync(ApiRequest<DomainOrganizationRoleUpdate> request, final AsyncApiCallback<ApiResponse<DomainOrganizationRole>> callback) {
    try {
      final SettableFuture<ApiResponse<DomainOrganizationRole>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DomainOrganizationRole>() {}, new AsyncApiCallback<ApiResponse<DomainOrganizationRole>>() {
        @Override
        public void onCompleted(ApiResponse<DomainOrganizationRole> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DomainOrganizationRole> response = (ApiResponse<DomainOrganizationRole>)(ApiResponse<?>)(new ApiException(exception));
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
   * Sets the users for the role
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> putAuthorizationRoleUsersAddAsync(PutAuthorizationRoleUsersAddRequest request, final AsyncApiCallback<List<String>> callback) {
    try {
      final SettableFuture<List<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
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
   * Sets the users for the role
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> putAuthorizationRoleUsersAddAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Removes the users from the role
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> putAuthorizationRoleUsersRemoveAsync(PutAuthorizationRoleUsersRemoveRequest request, final AsyncApiCallback<List<String>> callback) {
    try {
      final SettableFuture<List<String>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
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
   * Removes the users from the role
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> putAuthorizationRoleUsersRemoveAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Restore specified default roles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OrganizationRoleEntityListing> putAuthorizationRolesDefaultAsync(PutAuthorizationRolesDefaultRequest request, final AsyncApiCallback<OrganizationRoleEntityListing> callback) {
    try {
      final SettableFuture<OrganizationRoleEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
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
   * Restore specified default roles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OrganizationRoleEntityListing>> putAuthorizationRolesDefaultAsync(ApiRequest<List<DomainOrganizationRole>> request, final AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OrganizationRoleEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OrganizationRoleEntityListing>() {}, new AsyncApiCallback<ApiResponse<OrganizationRoleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OrganizationRoleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OrganizationRoleEntityListing> response = (ApiResponse<OrganizationRoleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Sets the user&#39;s roles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserAuthorization> putUserRolesAsync(PutUserRolesRequest request, final AsyncApiCallback<UserAuthorization> callback) {
    try {
      final SettableFuture<UserAuthorization> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserAuthorization>() {}, new AsyncApiCallback<ApiResponse<UserAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<UserAuthorization> response) {
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
   * Sets the user&#39;s roles
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserAuthorization>> putUserRolesAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<UserAuthorization>> callback) {
    try {
      final SettableFuture<ApiResponse<UserAuthorization>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserAuthorization>() {}, new AsyncApiCallback<ApiResponse<UserAuthorization>>() {
        @Override
        public void onCompleted(ApiResponse<UserAuthorization> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserAuthorization> response = (ApiResponse<UserAuthorization>)(ApiResponse<?>)(new ApiException(exception));
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
