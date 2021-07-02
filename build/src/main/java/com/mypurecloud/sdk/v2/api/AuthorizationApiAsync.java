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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzDivisionGrantEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzDivisionEntityListing;
import com.mypurecloud.sdk.v2.model.DivsPermittedEntityListing;
import com.mypurecloud.sdk.v2.model.PermissionCollectionEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationProductEntityListing;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRole;
import com.mypurecloud.sdk.v2.model.DomainOrgRoleDifference;
import com.mypurecloud.sdk.v2.model.SubjectDivisionGrantsEntityListing;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.OrganizationRoleEntityListing;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.SubjectDivisions;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleCreate;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.DomainOrganizationRoleUpdate;


import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionGrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsHomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionsLimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationDivisionspermittedPagedSubjectIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationPermissionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationProductsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleSubjectgrantsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRoleUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuthorizationSubjectsRolecountsRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionObjectRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionRestoreRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationDivisionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRoleComparedefaultRightRoleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationRolesDefaultRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkaddRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkremoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectBulkreplaceRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuthorizationSubjectDivisionRoleRequest;
import com.mypurecloud.sdk.v2.api.request.PutAuthorizationDivisionRequest;
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
   * Delete a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAuthorizationDivisionAsync(DeleteAuthorizationDivisionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAuthorizationDivisionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a grant of a role in a division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAuthorizationSubjectDivisionRoleAsync(DeleteAuthorizationSubjectDivisionRoleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a grant of a role in a division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAuthorizationSubjectDivisionRoleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Returns an authorization division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivision> getAuthorizationDivisionAsync(GetAuthorizationDivisionRequest request, final AsyncApiCallback<AuthzDivision> callback) {
    try {
      final SettableFuture<AuthzDivision> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
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
   * Returns an authorization division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivision>> getAuthorizationDivisionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzDivision>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivisionGrantEntityListing> getAuthorizationDivisionGrantsAsync(GetAuthorizationDivisionGrantsRequest request, final AsyncApiCallback<AuthzDivisionGrantEntityListing> callback) {
    try {
      final SettableFuture<AuthzDivisionGrantEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivisionGrantEntityListing>() {}, new AsyncApiCallback<ApiResponse<AuthzDivisionGrantEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivisionGrantEntityListing> response) {
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
   * Gets all grants for a given division.
   * Returns all grants assigned to a given division. Maximum page size is 500.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivisionGrantEntityListing>> getAuthorizationDivisionGrantsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzDivisionGrantEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivisionGrantEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivisionGrantEntityListing>() {}, new AsyncApiCallback<ApiResponse<AuthzDivisionGrantEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivisionGrantEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivisionGrantEntityListing> response = (ApiResponse<AuthzDivisionGrantEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivisionGrantEntityListing> response = (ApiResponse<AuthzDivisionGrantEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivisionEntityListing> getAuthorizationDivisionsAsync(GetAuthorizationDivisionsRequest request, final AsyncApiCallback<AuthzDivisionEntityListing> callback) {
    try {
      final SettableFuture<AuthzDivisionEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivisionEntityListing>() {}, new AsyncApiCallback<ApiResponse<AuthzDivisionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivisionEntityListing> response) {
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
   * Retrieve a list of all divisions defined for the organization
   * Request specific divisions by id using a query param \&quot;id\&quot;, e.g.  ?id=5f777167-63be-4c24-ad41-374155d9e28b&amp;id=72e9fb25-c484-488d-9312-7acba82435b3
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivisionEntityListing>> getAuthorizationDivisionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzDivisionEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivisionEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivisionEntityListing>() {}, new AsyncApiCallback<ApiResponse<AuthzDivisionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivisionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivisionEntityListing> response = (ApiResponse<AuthzDivisionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivision> getAuthorizationDivisionsHomeAsync(GetAuthorizationDivisionsHomeRequest request, final AsyncApiCallback<AuthzDivision> callback) {
    try {
      final SettableFuture<AuthzDivision> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
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
   * Retrieve the home division for the organization.
   * Will not include object counts.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivision>> getAuthorizationDivisionsHomeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzDivision>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns the maximum allowed number of divisions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Integer> getAuthorizationDivisionsLimitAsync(GetAuthorizationDivisionsLimitRequest request, final AsyncApiCallback<Integer> callback) {
    try {
      final SettableFuture<Integer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Integer>() {}, new AsyncApiCallback<ApiResponse<Integer>>() {
        @Override
        public void onCompleted(ApiResponse<Integer> response) {
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
   * Returns the maximum allowed number of divisions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Integer>> getAuthorizationDivisionsLimitAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Integer>> callback) {
    try {
      final SettableFuture<ApiResponse<Integer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Integer>() {}, new AsyncApiCallback<ApiResponse<Integer>>() {
        @Override
        public void onCompleted(ApiResponse<Integer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Integer> response = (ApiResponse<Integer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<AuthzDivision>> getAuthorizationDivisionspermittedMeAsync(GetAuthorizationDivisionspermittedMeRequest request, final AsyncApiCallback<List<AuthzDivision>> callback) {
    try {
      final SettableFuture<List<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<AuthzDivision>>() {}, new AsyncApiCallback<ApiResponse<List<AuthzDivision>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AuthzDivision>> response) {
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
   * Returns which divisions the current user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<AuthzDivision>>> getAuthorizationDivisionspermittedMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<AuthzDivision>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<AuthzDivision>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<AuthzDivision>>() {}, new AsyncApiCallback<ApiResponse<List<AuthzDivision>>>() {
        @Override
        public void onCompleted(ApiResponse<List<AuthzDivision>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<AuthzDivision>> response = (ApiResponse<List<AuthzDivision>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedMeAsync(GetAuthorizationDivisionspermittedPagedMeRequest request, final AsyncApiCallback<DivsPermittedEntityListing> callback) {
    try {
      final SettableFuture<DivsPermittedEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {}, new AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DivsPermittedEntityListing> response) {
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
   * Returns which divisions the current user has the given permission in.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DivsPermittedEntityListing>> getAuthorizationDivisionspermittedPagedMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DivsPermittedEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DivsPermittedEntityListing>() {}, new AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DivsPermittedEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DivsPermittedEntityListing> getAuthorizationDivisionspermittedPagedSubjectIdAsync(GetAuthorizationDivisionspermittedPagedSubjectIdRequest request, final AsyncApiCallback<DivsPermittedEntityListing> callback) {
    try {
      final SettableFuture<DivsPermittedEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DivsPermittedEntityListing>() {}, new AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DivsPermittedEntityListing> response) {
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
   * Returns which divisions the specified user has the given permission in.
   * This route is deprecated, use authorization/divisionspermitted/paged/me instead.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DivsPermittedEntityListing>> getAuthorizationDivisionspermittedPagedSubjectIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DivsPermittedEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DivsPermittedEntityListing>() {}, new AsyncApiCallback<ApiResponse<DivsPermittedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DivsPermittedEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DivsPermittedEntityListing> response = (ApiResponse<DivsPermittedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an org role to default role comparison
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
   * Get an org role to default role comparison
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
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SubjectDivisionGrantsEntityListing> getAuthorizationRoleSubjectgrantsAsync(GetAuthorizationRoleSubjectgrantsRequest request, final AsyncApiCallback<SubjectDivisionGrantsEntityListing> callback) {
    try {
      final SettableFuture<SubjectDivisionGrantsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SubjectDivisionGrantsEntityListing>() {}, new AsyncApiCallback<ApiResponse<SubjectDivisionGrantsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SubjectDivisionGrantsEntityListing> response) {
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
   * Get the subjects&#39; granted divisions in the specified role.
   * Includes the divisions for which the subject has a grant.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SubjectDivisionGrantsEntityListing>> getAuthorizationRoleSubjectgrantsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SubjectDivisionGrantsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SubjectDivisionGrantsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SubjectDivisionGrantsEntityListing>() {}, new AsyncApiCallback<ApiResponse<SubjectDivisionGrantsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SubjectDivisionGrantsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SubjectDivisionGrantsEntityListing> response = (ApiResponse<SubjectDivisionGrantsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SubjectDivisionGrantsEntityListing> response = (ApiResponse<SubjectDivisionGrantsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserEntityListing> getAuthorizationRoleUsersAsync(GetAuthorizationRoleUsersRequest request, final AsyncApiCallback<UserEntityListing> callback) {
    try {
      final SettableFuture<UserEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserEntityListing> response) {
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
   * Get a list of the users in a specified role.
   * Get an array of the UUIDs of the users in the specified role.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserEntityListing>> getAuthorizationRoleUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UserEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserEntityListing> response = (ApiResponse<UserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
  public Future<AuthzSubject> getAuthorizationSubjectAsync(GetAuthorizationSubjectRequest request, final AsyncApiCallback<AuthzSubject> callback) {
    try {
      final SettableFuture<AuthzSubject> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzSubject>() {}, new AsyncApiCallback<ApiResponse<AuthzSubject>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzSubject> response) {
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
  public Future<ApiResponse<AuthzSubject>> getAuthorizationSubjectAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzSubject>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzSubject>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzSubject>() {}, new AsyncApiCallback<ApiResponse<AuthzSubject>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzSubject> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
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
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzSubject> getAuthorizationSubjectsMeAsync(GetAuthorizationSubjectsMeRequest request, final AsyncApiCallback<AuthzSubject> callback) {
    try {
      final SettableFuture<AuthzSubject> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzSubject>() {}, new AsyncApiCallback<ApiResponse<AuthzSubject>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzSubject> response) {
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
   * Returns a listing of roles and permissions for the currently authenticated user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzSubject>> getAuthorizationSubjectsMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuthzSubject>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzSubject>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzSubject>() {}, new AsyncApiCallback<ApiResponse<AuthzSubject>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzSubject> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzSubject> response = (ApiResponse<AuthzSubject>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the count of roles granted to a list of subjects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Map<String, Object>> getAuthorizationSubjectsRolecountsAsync(GetAuthorizationSubjectsRolecountsRequest request, final AsyncApiCallback<Map<String, Object>> callback) {
    try {
      final SettableFuture<Map<String, Object>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
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
   * Get the count of roles granted to a list of subjects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Map<String, Object>>> getAuthorizationSubjectsRolecountsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
    try {
      final SettableFuture<ApiResponse<Map<String, Object>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Map<String, Object>>() {}, new AsyncApiCallback<ApiResponse<Map<String, Object>>>() {
        @Override
        public void onCompleted(ApiResponse<Map<String, Object>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Map<String, Object>> response = (ApiResponse<Map<String, Object>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationDivisionObjectAsync(PostAuthorizationDivisionObjectRequest request, final AsyncApiCallback<Void> callback) {
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
   * Assign a list of objects to a division
   * Set the division of a specified list of objects. The objects must all be of the same type, one of:  CAMPAIGN, MANAGEMENTUNIT, FLOW, QUEUE, DATATABLES or USER.  The body of the request is a list of object IDs, which are expected to be  GUIDs, e.g. [\&quot;206ce31f-61ec-40ed-a8b1-be6f06303998\&quot;,\&quot;250a754e-f5e4-4f51-800f-a92f09d3bf8c\&quot;]
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationDivisionObjectAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Recreate a previously deleted division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivision> postAuthorizationDivisionRestoreAsync(PostAuthorizationDivisionRestoreRequest request, final AsyncApiCallback<AuthzDivision> callback) {
    try {
      final SettableFuture<AuthzDivision> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
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
   * Recreate a previously deleted division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivision>> postAuthorizationDivisionRestoreAsync(ApiRequest<AuthzDivision> request, final AsyncApiCallback<ApiResponse<AuthzDivision>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivision> postAuthorizationDivisionsAsync(PostAuthorizationDivisionsRequest request, final AsyncApiCallback<AuthzDivision> callback) {
    try {
      final SettableFuture<AuthzDivision> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
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
   * Create a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivision>> postAuthorizationDivisionsAsync(ApiRequest<AuthzDivision> request, final AsyncApiCallback<ApiResponse<AuthzDivision>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationRoleAsync(PostAuthorizationRoleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Bulk-grant subjects and divisions with an organization role.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationRoleAsync(ApiRequest<SubjectDivisions> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationSubjectBulkaddAsync(PostAuthorizationSubjectBulkaddRequest request, final AsyncApiCallback<Void> callback) {
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
   * Bulk-grant roles and divisions to a subject.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationSubjectBulkaddAsync(ApiRequest<RoleDivisionGrants> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Bulk-remove grants from a subject.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationSubjectBulkremoveAsync(PostAuthorizationSubjectBulkremoveRequest request, final AsyncApiCallback<Void> callback) {
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
   * Bulk-remove grants from a subject.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationSubjectBulkremoveAsync(ApiRequest<RoleDivisionGrants> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationSubjectBulkreplaceAsync(PostAuthorizationSubjectBulkreplaceRequest request, final AsyncApiCallback<Void> callback) {
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
   * Replace subject&#39;s roles and divisions with the exact list supplied in the request.
   * This operation will not remove grants that are inherited from group membership. It will only set the grants directly applied to the subject.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationSubjectBulkreplaceAsync(ApiRequest<RoleDivisionGrants> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Make a grant of a role in a division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postAuthorizationSubjectDivisionRoleAsync(PostAuthorizationSubjectDivisionRoleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Make a grant of a role in a division
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postAuthorizationSubjectDivisionRoleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Update a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuthzDivision> putAuthorizationDivisionAsync(PutAuthorizationDivisionRequest request, final AsyncApiCallback<AuthzDivision> callback) {
    try {
      final SettableFuture<AuthzDivision> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
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
   * Update a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuthzDivision>> putAuthorizationDivisionAsync(ApiRequest<AuthzDivision> request, final AsyncApiCallback<ApiResponse<AuthzDivision>> callback) {
    try {
      final SettableFuture<ApiResponse<AuthzDivision>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuthzDivision>() {}, new AsyncApiCallback<ApiResponse<AuthzDivision>>() {
        @Override
        public void onCompleted(ApiResponse<AuthzDivision> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuthzDivision> response = (ApiResponse<AuthzDivision>)(ApiResponse<?>)(new ApiException(exception));
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
