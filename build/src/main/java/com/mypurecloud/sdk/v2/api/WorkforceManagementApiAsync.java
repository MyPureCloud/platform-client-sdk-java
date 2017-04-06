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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.TimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.TimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;


import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchWorkforcemanagementTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementSchedulesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WorkforceManagementApiAsync {
  private final ApiClient pcapiClient;

  public WorkforceManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceAsync(GetWorkforcemanagementAdherenceRequest request, AsyncApiCallback<List<UserScheduleAdherence>> callback) {
    try {
      SettableFuture<List<UserScheduleAdherence>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
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
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UserScheduleAdherence>>> getWorkforcemanagementAdherenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>> callback) {
    try {
      SettableFuture<ApiResponse<List<UserScheduleAdherence>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get activity codes corresponding to a management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesAsync(GetWorkforcemanagementManagementunitActivitycodesRequest request, AsyncApiCallback<ActivityCodeContainer> callback) {
    try {
      SettableFuture<ActivityCodeContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
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
   * Get activity codes corresponding to a management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActivityCodeContainer>> getWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ActivityCodeContainer>> callback) {
    try {
      SettableFuture<ApiResponse<ActivityCodeContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a time off request by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request, AsyncApiCallback<TimeOffRequest> callback) {
    try {
      SettableFuture<TimeOffRequest> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
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
   * Get a time off request by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequest>> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequest>> callback) {
    try {
      SettableFuture<ApiResponse<TimeOffRequest>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of time off requests for any user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request, AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
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
   * Get a list of time off requests for any user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get agents in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersAsync(GetWorkforcemanagementManagementunitUsersRequest request, AsyncApiCallback<WfmUserEntityListing> callback) {
    try {
      SettableFuture<WfmUserEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
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
   * Get agents in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmUserEntityListing>> getWorkforcemanagementManagementunitUsersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WfmUserEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<WfmUserEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<ManagementUnit>> getWorkforcemanagementManagementunitsAsync(GetWorkforcemanagementManagementunitsRequest request, AsyncApiCallback<List<ManagementUnit>> callback) {
    try {
      SettableFuture<List<ManagementUnit>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<ManagementUnit>>() {}, new AsyncApiCallback<ApiResponse<List<ManagementUnit>>>() {
        @Override
        public void onCompleted(ApiResponse<List<ManagementUnit>> response) {
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
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<ManagementUnit>>> getWorkforcemanagementManagementunitsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<ManagementUnit>>> callback) {
    try {
      SettableFuture<ApiResponse<List<ManagementUnit>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<ManagementUnit>>() {}, new AsyncApiCallback<ApiResponse<List<ManagementUnit>>>() {
        @Override
        public void onCompleted(ApiResponse<List<ManagementUnit>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<ManagementUnit>> response = (ApiResponse<List<ManagementUnit>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<ManagementUnit>> response = (ApiResponse<List<ManagementUnit>>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a time off request for the current user by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequest> getWorkforcemanagementTimeoffrequestAsync(GetWorkforcemanagementTimeoffrequestRequest request, AsyncApiCallback<TimeOffRequest> callback) {
    try {
      SettableFuture<TimeOffRequest> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
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
   * Get a time off request for the current user by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequest>> getWorkforcemanagementTimeoffrequestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequest>> callback) {
    try {
      SettableFuture<ApiResponse<TimeOffRequest>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of time off requests for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> getWorkforcemanagementTimeoffrequestsAsync(GetWorkforcemanagementTimeoffrequestsRequest request, AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
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
   * Get a list of time off requests for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementTimeoffrequestsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
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
   * Mark a time off request for the current user as read or unread
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchWorkforcemanagementTimeoffrequestAsync(PatchWorkforcemanagementTimeoffrequestRequest request, AsyncApiCallback<Void> callback) {
    try {
      SettableFuture<Void> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Mark a time off request for the current user as read or unread
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchWorkforcemanagementTimeoffrequestAsync(ApiRequest<TimeOffRequestPatch> request, AsyncApiCallback<ApiResponse<Void>> callback) {
    try {
      SettableFuture<ApiResponse<Void>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
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
   * Get user schedules within the given time range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchAsync(PostWorkforcemanagementManagementunitSchedulesSearchRequest request, AsyncApiCallback<UserScheduleContainer> callback) {
    try {
      SettableFuture<UserScheduleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
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
   * Get user schedules within the given time range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementManagementunitSchedulesSearchAsync(ApiRequest<UserListScheduleRequestBody> request, AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<UserScheduleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleContainer> postWorkforcemanagementSchedulesAsync(PostWorkforcemanagementSchedulesRequest request, AsyncApiCallback<UserScheduleContainer> callback) {
    try {
      SettableFuture<UserScheduleContainer> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
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
   * Get a schedule for the current user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementSchedulesAsync(ApiRequest<CurrentUserScheduleRequestBody> request, AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    try {
      SettableFuture<ApiResponse<UserScheduleContainer>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
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
