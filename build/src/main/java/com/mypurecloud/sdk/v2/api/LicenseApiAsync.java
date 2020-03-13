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
import com.mypurecloud.sdk.v2.model.LicenseDefinition;
import com.mypurecloud.sdk.v2.model.LicenseOrgToggle;
import com.mypurecloud.sdk.v2.model.LicenseUser;
import com.mypurecloud.sdk.v2.model.UserLicensesEntityListing;
import com.mypurecloud.sdk.v2.model.LicenseBatchAssignmentRequest;
import com.mypurecloud.sdk.v2.model.LicenseUpdateStatus;


import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseDefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseToggleRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseUserRequest;
import com.mypurecloud.sdk.v2.api.request.GetLicenseUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseInferRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseOrganizationRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseToggleRequest;
import com.mypurecloud.sdk.v2.api.request.PostLicenseUsersRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class LicenseApiAsync {
  private final ApiClient pcapiClient;

  public LicenseApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LicenseApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get PureCloud license definition.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LicenseDefinition> getLicenseDefinitionAsync(GetLicenseDefinitionRequest request, final AsyncApiCallback<LicenseDefinition> callback) {
    try {
      final SettableFuture<LicenseDefinition> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LicenseDefinition>() {}, new AsyncApiCallback<ApiResponse<LicenseDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseDefinition> response) {
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
   * Get PureCloud license definition.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LicenseDefinition>> getLicenseDefinitionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LicenseDefinition>> callback) {
    try {
      final SettableFuture<ApiResponse<LicenseDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LicenseDefinition>() {}, new AsyncApiCallback<ApiResponse<LicenseDefinition>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseDefinition> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseDefinition> response = (ApiResponse<LicenseDefinition>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseDefinition> response = (ApiResponse<LicenseDefinition>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all PureCloud license definitions available for the organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<LicenseDefinition>> getLicenseDefinitionsAsync(GetLicenseDefinitionsRequest request, final AsyncApiCallback<List<LicenseDefinition>> callback) {
    try {
      final SettableFuture<List<LicenseDefinition>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<LicenseDefinition>>() {}, new AsyncApiCallback<ApiResponse<List<LicenseDefinition>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LicenseDefinition>> response) {
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
   * Get all PureCloud license definitions available for the organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<LicenseDefinition>>> getLicenseDefinitionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<LicenseDefinition>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<LicenseDefinition>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<LicenseDefinition>>() {}, new AsyncApiCallback<ApiResponse<List<LicenseDefinition>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LicenseDefinition>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LicenseDefinition>> response = (ApiResponse<List<LicenseDefinition>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LicenseDefinition>> response = (ApiResponse<List<LicenseDefinition>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get PureCloud license feature toggle value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LicenseOrgToggle> getLicenseToggleAsync(GetLicenseToggleRequest request, final AsyncApiCallback<LicenseOrgToggle> callback) {
    try {
      final SettableFuture<LicenseOrgToggle> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LicenseOrgToggle>() {}, new AsyncApiCallback<ApiResponse<LicenseOrgToggle>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseOrgToggle> response) {
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
   * Get PureCloud license feature toggle value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LicenseOrgToggle>> getLicenseToggleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LicenseOrgToggle>> callback) {
    try {
      final SettableFuture<ApiResponse<LicenseOrgToggle>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LicenseOrgToggle>() {}, new AsyncApiCallback<ApiResponse<LicenseOrgToggle>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseOrgToggle> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get licenses for specified user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LicenseUser> getLicenseUserAsync(GetLicenseUserRequest request, final AsyncApiCallback<LicenseUser> callback) {
    try {
      final SettableFuture<LicenseUser> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LicenseUser>() {}, new AsyncApiCallback<ApiResponse<LicenseUser>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseUser> response) {
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
   * Get licenses for specified user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LicenseUser>> getLicenseUserAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LicenseUser>> callback) {
    try {
      final SettableFuture<ApiResponse<LicenseUser>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LicenseUser>() {}, new AsyncApiCallback<ApiResponse<LicenseUser>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseUser> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseUser> response = (ApiResponse<LicenseUser>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseUser> response = (ApiResponse<LicenseUser>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserLicensesEntityListing> getLicenseUsersAsync(GetLicenseUsersRequest request, final AsyncApiCallback<UserLicensesEntityListing> callback) {
    try {
      final SettableFuture<UserLicensesEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserLicensesEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserLicensesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserLicensesEntityListing> response) {
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
   * Get a page of users and their licenses
   * Retrieve a page of users in an organization along with the licenses they possess.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserLicensesEntityListing>> getLicenseUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UserLicensesEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UserLicensesEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserLicensesEntityListing>() {}, new AsyncApiCallback<ApiResponse<UserLicensesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UserLicensesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserLicensesEntityListing> response = (ApiResponse<UserLicensesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserLicensesEntityListing> response = (ApiResponse<UserLicensesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> postLicenseInferAsync(PostLicenseInferRequest request, final AsyncApiCallback<List<String>> callback) {
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
   * Get a list of licenses inferred based on a list of roleIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> postLicenseInferAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<List<String>>> callback) {
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
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<LicenseUpdateStatus>> postLicenseOrganizationAsync(PostLicenseOrganizationRequest request, final AsyncApiCallback<List<LicenseUpdateStatus>> callback) {
    try {
      final SettableFuture<List<LicenseUpdateStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<LicenseUpdateStatus>>() {}, new AsyncApiCallback<ApiResponse<List<LicenseUpdateStatus>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LicenseUpdateStatus>> response) {
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
   * Update the organization&#39;s license assignments in a batch.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<LicenseUpdateStatus>>> postLicenseOrganizationAsync(ApiRequest<LicenseBatchAssignmentRequest> request, final AsyncApiCallback<ApiResponse<List<LicenseUpdateStatus>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<LicenseUpdateStatus>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<LicenseUpdateStatus>>() {}, new AsyncApiCallback<ApiResponse<List<LicenseUpdateStatus>>>() {
        @Override
        public void onCompleted(ApiResponse<List<LicenseUpdateStatus>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LicenseUpdateStatus>> response = (ApiResponse<List<LicenseUpdateStatus>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<LicenseUpdateStatus>> response = (ApiResponse<List<LicenseUpdateStatus>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Switch PureCloud license feature toggle value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<LicenseOrgToggle> postLicenseToggleAsync(PostLicenseToggleRequest request, final AsyncApiCallback<LicenseOrgToggle> callback) {
    try {
      final SettableFuture<LicenseOrgToggle> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<LicenseOrgToggle>() {}, new AsyncApiCallback<ApiResponse<LicenseOrgToggle>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseOrgToggle> response) {
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
   * Switch PureCloud license feature toggle value.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<LicenseOrgToggle>> postLicenseToggleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<LicenseOrgToggle>> callback) {
    try {
      final SettableFuture<ApiResponse<LicenseOrgToggle>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<LicenseOrgToggle>() {}, new AsyncApiCallback<ApiResponse<LicenseOrgToggle>>() {
        @Override
        public void onCompleted(ApiResponse<LicenseOrgToggle> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<LicenseOrgToggle> response = (ApiResponse<LicenseOrgToggle>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch user licenses in a batch.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Map<String, Object>> postLicenseUsersAsync(PostLicenseUsersRequest request, final AsyncApiCallback<Map<String, Object>> callback) {
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
   * Fetch user licenses in a batch.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Map<String, Object>>> postLicenseUsersAsync(ApiRequest<List<String>> request, final AsyncApiCallback<ApiResponse<Map<String, Object>>> callback) {
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
