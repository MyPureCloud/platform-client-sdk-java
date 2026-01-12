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

import com.mypurecloud.sdk.v2.model.BulkAddSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkRemoveSourceIntentsRequest;
import com.mypurecloud.sdk.v2.model.BulkSourceIntentsResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntent;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentRequest;
import com.mypurecloud.sdk.v2.model.CustomerIntentAssignmentResponse;
import com.mypurecloud.sdk.v2.model.CustomerIntentListing;
import com.mypurecloud.sdk.v2.model.CustomerIntentPatch;
import com.mypurecloud.sdk.v2.model.CustomerIntentResponse;
import com.mypurecloud.sdk.v2.model.CustomerSourceIntentListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntentsCategory;
import com.mypurecloud.sdk.v2.model.IntentsCategoryListing;
import com.mypurecloud.sdk.v2.model.IntentsCategoryPatch;


import com.mypurecloud.sdk.v2.api.request.DeleteIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsAssignmentsExternalcontactRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentSourceintentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsCustomerintentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntentsSourceintentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntentsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntentsCustomerintentRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentSourceintentsBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentSourceintentsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntentsCustomerintentsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class IntentsApiAsync {
  private final ApiClient pcapiClient;

  public IntentsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public IntentsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteIntentsCategoryAsync(DeleteIntentsCategoryRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteIntentsCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteIntentsCustomerintentAsync(DeleteIntentsCustomerintentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteIntentsCustomerintentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get customer intent assignments for externalContactId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentAssignmentListing> getIntentsAssignmentsExternalcontactAsync(GetIntentsAssignmentsExternalcontactRequest request, final AsyncApiCallback<CustomerIntentAssignmentListing> callback) {
    try {
      final SettableFuture<CustomerIntentAssignmentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentAssignmentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentAssignmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentAssignmentListing> response) {
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
   * Get customer intent assignments for externalContactId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentAssignmentListing>> getIntentsAssignmentsExternalcontactAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CustomerIntentAssignmentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentAssignmentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentAssignmentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentAssignmentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentAssignmentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentAssignmentListing> response = (ApiResponse<CustomerIntentAssignmentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentAssignmentListing> response = (ApiResponse<CustomerIntentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntentsCategoryListing> getIntentsCategoriesAsync(GetIntentsCategoriesRequest request, final AsyncApiCallback<IntentsCategoryListing> callback) {
    try {
      final SettableFuture<IntentsCategoryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntentsCategoryListing>() {}, new AsyncApiCallback<ApiResponse<IntentsCategoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategoryListing> response) {
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
   * Get categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntentsCategoryListing>> getIntentsCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntentsCategoryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<IntentsCategoryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntentsCategoryListing>() {}, new AsyncApiCallback<ApiResponse<IntentsCategoryListing>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategoryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategoryListing> response = (ApiResponse<IntentsCategoryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategoryListing> response = (ApiResponse<IntentsCategoryListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntentsCategory> getIntentsCategoryAsync(GetIntentsCategoryRequest request, final AsyncApiCallback<IntentsCategory> callback) {
    try {
      final SettableFuture<IntentsCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
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
   * Get category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntentsCategory>> getIntentsCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<IntentsCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<IntentsCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentResponse> getIntentsCustomerintentAsync(GetIntentsCustomerintentRequest request, final AsyncApiCallback<CustomerIntentResponse> callback) {
    try {
      final SettableFuture<CustomerIntentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
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
   * Get customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentResponse>> getIntentsCustomerintentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CustomerIntentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get source intents mapped to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerSourceIntentListing> getIntentsCustomerintentSourceintentsAsync(GetIntentsCustomerintentSourceintentsRequest request, final AsyncApiCallback<CustomerSourceIntentListing> callback) {
    try {
      final SettableFuture<CustomerSourceIntentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerSourceIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerSourceIntentListing> response) {
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
   * Get source intents mapped to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerSourceIntentListing>> getIntentsCustomerintentSourceintentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerSourceIntentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerSourceIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerSourceIntentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get customer intents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentListing> getIntentsCustomerintentsAsync(GetIntentsCustomerintentsRequest request, final AsyncApiCallback<CustomerIntentListing> callback) {
    try {
      final SettableFuture<CustomerIntentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentListing> response) {
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
   * Get customer intents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentListing>> getIntentsCustomerintentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CustomerIntentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentListing> response = (ApiResponse<CustomerIntentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentListing> response = (ApiResponse<CustomerIntentListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerSourceIntentListing> getIntentsSourceintentsAsync(GetIntentsSourceintentsRequest request, final AsyncApiCallback<CustomerSourceIntentListing> callback) {
    try {
      final SettableFuture<CustomerSourceIntentListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerSourceIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerSourceIntentListing> response) {
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
   * Get all mapped source intents by type. If no type selected default is type Segment
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerSourceIntentListing>> getIntentsSourceintentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerSourceIntentListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerSourceIntentListing>() {}, new AsyncApiCallback<ApiResponse<CustomerSourceIntentListing>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerSourceIntentListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerSourceIntentListing> response = (ApiResponse<CustomerSourceIntentListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntentsCategory> patchIntentsCategoryAsync(PatchIntentsCategoryRequest request, final AsyncApiCallback<IntentsCategory> callback) {
    try {
      final SettableFuture<IntentsCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
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
   * Patch category for categoryId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntentsCategory>> patchIntentsCategoryAsync(ApiRequest<IntentsCategoryPatch> request, final AsyncApiCallback<ApiResponse<IntentsCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<IntentsCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
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
   * Patch customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentResponse> patchIntentsCustomerintentAsync(PatchIntentsCustomerintentRequest request, final AsyncApiCallback<CustomerIntentResponse> callback) {
    try {
      final SettableFuture<CustomerIntentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
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
   * Patch customer intent for customerIntentId
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentResponse>> patchIntentsCustomerintentAsync(ApiRequest<CustomerIntentPatch> request, final AsyncApiCallback<ApiResponse<CustomerIntentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create customer intent assignment for external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentAssignmentResponse> postIntentsAssignmentsExternalcontactCustomerintentAssignmentAsync(PostIntentsAssignmentsExternalcontactCustomerintentAssignmentRequest request, final AsyncApiCallback<CustomerIntentAssignmentResponse> callback) {
    try {
      final SettableFuture<CustomerIntentAssignmentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentAssignmentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentAssignmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentAssignmentResponse> response) {
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
   * Create customer intent assignment for external contact
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentAssignmentResponse>> postIntentsAssignmentsExternalcontactCustomerintentAssignmentAsync(ApiRequest<CustomerIntentAssignmentRequest> request, final AsyncApiCallback<ApiResponse<CustomerIntentAssignmentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentAssignmentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentAssignmentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentAssignmentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentAssignmentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentAssignmentResponse> response = (ApiResponse<CustomerIntentAssignmentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentAssignmentResponse> response = (ApiResponse<CustomerIntentAssignmentResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntentsCategory> postIntentsCategoriesAsync(PostIntentsCategoriesRequest request, final AsyncApiCallback<IntentsCategory> callback) {
    try {
      final SettableFuture<IntentsCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
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
   * Create category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntentsCategory>> postIntentsCategoriesAsync(ApiRequest<IntentsCategory> request, final AsyncApiCallback<ApiResponse<IntentsCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<IntentsCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntentsCategory>() {}, new AsyncApiCallback<ApiResponse<IntentsCategory>>() {
        @Override
        public void onCompleted(ApiResponse<IntentsCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntentsCategory> response = (ApiResponse<IntentsCategory>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk add source intents to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkAddAsync(PostIntentsCustomerintentSourceintentsBulkAddRequest request, final AsyncApiCallback<BulkSourceIntentsResponse> callback) {
    try {
      final SettableFuture<BulkSourceIntentsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkSourceIntentsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkSourceIntentsResponse> response) {
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
   * Bulk add source intents to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkSourceIntentsResponse>> postIntentsCustomerintentSourceintentsBulkAddAsync(ApiRequest<BulkAddSourceIntentsRequest> request, final AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkSourceIntentsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkSourceIntentsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkSourceIntentsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkSourceIntentsResponse> postIntentsCustomerintentSourceintentsBulkRemoveAsync(PostIntentsCustomerintentSourceintentsBulkRemoveRequest request, final AsyncApiCallback<BulkSourceIntentsResponse> callback) {
    try {
      final SettableFuture<BulkSourceIntentsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkSourceIntentsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkSourceIntentsResponse> response) {
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
   * Bulk remove source intents mapped to a customer intent
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkSourceIntentsResponse>> postIntentsCustomerintentSourceintentsBulkRemoveAsync(ApiRequest<BulkRemoveSourceIntentsRequest> request, final AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkSourceIntentsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkSourceIntentsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkSourceIntentsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkSourceIntentsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkSourceIntentsResponse> response = (ApiResponse<BulkSourceIntentsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create customer intents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CustomerIntentResponse> postIntentsCustomerintentsAsync(PostIntentsCustomerintentsRequest request, final AsyncApiCallback<CustomerIntentResponse> callback) {
    try {
      final SettableFuture<CustomerIntentResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
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
   * Create customer intents
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CustomerIntentResponse>> postIntentsCustomerintentsAsync(ApiRequest<CustomerIntent> request, final AsyncApiCallback<ApiResponse<CustomerIntentResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<CustomerIntentResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CustomerIntentResponse>() {}, new AsyncApiCallback<ApiResponse<CustomerIntentResponse>>() {
        @Override
        public void onCompleted(ApiResponse<CustomerIntentResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CustomerIntentResponse> response = (ApiResponse<CustomerIntentResponse>)(ApiResponse<?>)(new ApiException(exception));
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
