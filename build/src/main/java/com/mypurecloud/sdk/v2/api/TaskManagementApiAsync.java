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

import com.mypurecloud.sdk.v2.model.BulkJob;
import com.mypurecloud.sdk.v2.model.BulkJobAddRequest;
import com.mypurecloud.sdk.v2.model.BulkJobAddResponse;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateRequest;
import com.mypurecloud.sdk.v2.model.BulkJobTerminateResultsResponse;
import com.mypurecloud.sdk.v2.model.BulkJobUpdate;
import com.mypurecloud.sdk.v2.model.BulkJobsListing;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.SchemaQuantityLimits;
import com.mypurecloud.sdk.v2.model.Workbin;
import com.mypurecloud.sdk.v2.model.WorkbinChangeListing;
import com.mypurecloud.sdk.v2.model.WorkbinCreate;
import com.mypurecloud.sdk.v2.model.WorkbinQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkbinQueryRequest;
import com.mypurecloud.sdk.v2.model.WorkbinUpdate;
import com.mypurecloud.sdk.v2.model.WorkbinVersion;
import com.mypurecloud.sdk.v2.model.WorkbinVersionListing;
import com.mypurecloud.sdk.v2.model.Workitem;
import com.mypurecloud.sdk.v2.model.WorkitemChangeListing;
import com.mypurecloud.sdk.v2.model.WorkitemCreate;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRule;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemDateBasedRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemManualAssign;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRule;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemOnAttributeChangeRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRule;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleCreate;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleListing;
import com.mypurecloud.sdk.v2.model.WorkitemOnCreateRuleUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemPagedEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemPostQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobCreate;
import com.mypurecloud.sdk.v2.model.WorkitemQueryJobResponse;
import com.mypurecloud.sdk.v2.model.WorkitemQueryPostRequest;
import com.mypurecloud.sdk.v2.model.WorkitemStatus;
import com.mypurecloud.sdk.v2.model.WorkitemStatusCreate;
import com.mypurecloud.sdk.v2.model.WorkitemStatusListing;
import com.mypurecloud.sdk.v2.model.WorkitemStatusUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemTerminate;
import com.mypurecloud.sdk.v2.model.WorkitemUpdate;
import com.mypurecloud.sdk.v2.model.WorkitemVersion;
import com.mypurecloud.sdk.v2.model.WorkitemVersionListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapup;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupEntityListing;
import com.mypurecloud.sdk.v2.model.WorkitemWrapupUpdate;
import com.mypurecloud.sdk.v2.model.Worktype;
import com.mypurecloud.sdk.v2.model.WorktypeChangeListing;
import com.mypurecloud.sdk.v2.model.WorktypeCreate;
import com.mypurecloud.sdk.v2.model.WorktypeQueryEntityListing;
import com.mypurecloud.sdk.v2.model.WorktypeQueryRequest;
import com.mypurecloud.sdk.v2.model.WorktypeUpdate;
import com.mypurecloud.sdk.v2.model.WorktypeVersion;
import com.mypurecloud.sdk.v2.model.WorktypeVersionListing;


import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemsBulkAddJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemsBulkTerminateJobRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorkitemsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeFlowsDatebasedRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeFlowsOnattributechangeRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeFlowsOncreateRuleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkbinVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemUserWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsBulkAddJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsBulkAddJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsBulkJobsUsersMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsBulkTerminateJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsBulkTerminateJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsQueryJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsQueryJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemaVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemasCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemasCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorkitemsSchemasLimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsDatebasedRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsDatebasedRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsOnattributechangeRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsOnattributechangeRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsOncreateRuleRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeFlowsOncreateRulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeStatusesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetTaskmanagementWorktypeVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkbinRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemAssignmentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemUserWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemUsersMeWrapupsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemsBulkAddJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorkitemsBulkTerminateJobRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeFlowsDatebasedRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeFlowsOnattributechangeRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeFlowsOncreateRuleRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTaskmanagementWorktypeStatusRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkbinsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkbinsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemAcdCancelRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemDisconnectRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemTerminateRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsBulkAddJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsBulkTerminateJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsQueryJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorkitemsSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypeFlowsDatebasedRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypeFlowsOnattributechangeRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypeFlowsOncreateRulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypeStatusesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypesRequest;
import com.mypurecloud.sdk.v2.api.request.PostTaskmanagementWorktypesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutTaskmanagementWorkitemsSchemaRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class TaskManagementApiAsync {
  private final ApiClient pcapiClient;

  public TaskManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public TaskManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorkbinAsync(DeleteTaskmanagementWorkbinRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorkbinAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorkitemAsync(DeleteTaskmanagementWorkitemRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorkitemAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a bulk add job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorkitemsBulkAddJobAsync(DeleteTaskmanagementWorkitemsBulkAddJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a bulk add job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorkitemsBulkAddJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorkitemsBulkTerminateJobAsync(DeleteTaskmanagementWorkitemsBulkTerminateJobRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Bulk job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorkitemsBulkTerminateJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorkitemsSchemaAsync(DeleteTaskmanagementWorkitemsSchemaRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorkitemsSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorktypeAsync(DeleteTaskmanagementWorktypeRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorktypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorktypeFlowsDatebasedRuleAsync(DeleteTaskmanagementWorktypeFlowsDatebasedRuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorktypeFlowsDatebasedRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(DeleteTaskmanagementWorktypeFlowsOnattributechangeRuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorktypeFlowsOncreateRuleAsync(DeleteTaskmanagementWorktypeFlowsOncreateRuleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorktypeFlowsOncreateRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteTaskmanagementWorktypeStatusAsync(DeleteTaskmanagementWorktypeStatusRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteTaskmanagementWorktypeStatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workbin> getTaskmanagementWorkbinAsync(GetTaskmanagementWorkbinRequest request, final AsyncApiCallback<Workbin> callback) {
    try {
      final SettableFuture<Workbin> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
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
   * Get a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workbin>> getTaskmanagementWorkbinAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Workbin>> callback) {
    try {
      final SettableFuture<ApiResponse<Workbin>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a listing of a workbin's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkbinChangeListing> getTaskmanagementWorkbinHistoryAsync(GetTaskmanagementWorkbinHistoryRequest request, final AsyncApiCallback<WorkbinChangeListing> callback) {
    try {
      final SettableFuture<WorkbinChangeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkbinChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinChangeListing> response) {
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
   * Get a listing of a workbin's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkbinChangeListing>> getTaskmanagementWorkbinHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkbinChangeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkbinChangeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkbinChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinChangeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinChangeListing> response = (ApiResponse<WorkbinChangeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinChangeListing> response = (ApiResponse<WorkbinChangeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a version of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkbinVersion> getTaskmanagementWorkbinVersionAsync(GetTaskmanagementWorkbinVersionRequest request, final AsyncApiCallback<WorkbinVersion> callback) {
    try {
      final SettableFuture<WorkbinVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkbinVersion>() {}, new AsyncApiCallback<ApiResponse<WorkbinVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinVersion> response) {
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
   * Get a version of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkbinVersion>> getTaskmanagementWorkbinVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkbinVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkbinVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkbinVersion>() {}, new AsyncApiCallback<ApiResponse<WorkbinVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinVersion> response = (ApiResponse<WorkbinVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinVersion> response = (ApiResponse<WorkbinVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all versions of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkbinVersionListing> getTaskmanagementWorkbinVersionsAsync(GetTaskmanagementWorkbinVersionsRequest request, final AsyncApiCallback<WorkbinVersionListing> callback) {
    try {
      final SettableFuture<WorkbinVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkbinVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinVersionListing> response) {
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
   * Get all versions of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkbinVersionListing>> getTaskmanagementWorkbinVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkbinVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkbinVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkbinVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinVersionListing> response = (ApiResponse<WorkbinVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinVersionListing> response = (ApiResponse<WorkbinVersionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> getTaskmanagementWorkitemAsync(GetTaskmanagementWorkitemRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Get a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> getTaskmanagementWorkitemAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a listing of a workitem's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemChangeListing> getTaskmanagementWorkitemHistoryAsync(GetTaskmanagementWorkitemHistoryRequest request, final AsyncApiCallback<WorkitemChangeListing> callback) {
    try {
      final SettableFuture<WorkitemChangeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemChangeListing> response) {
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
   * Get a listing of a workitem's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemChangeListing>> getTaskmanagementWorkitemHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemChangeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemChangeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemChangeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemChangeListing> response = (ApiResponse<WorkitemChangeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemChangeListing> response = (ApiResponse<WorkitemChangeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemWrapup> getTaskmanagementWorkitemUserWrapupsAsync(GetTaskmanagementWorkitemUserWrapupsRequest request, final AsyncApiCallback<WorkitemWrapup> callback) {
    try {
      final SettableFuture<WorkitemWrapup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
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
   * Get all wrapup codes added for the given user for a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemWrapup>> getTaskmanagementWorkitemUserWrapupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemWrapup>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemWrapup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a version of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemVersion> getTaskmanagementWorkitemVersionAsync(GetTaskmanagementWorkitemVersionRequest request, final AsyncApiCallback<WorkitemVersion> callback) {
    try {
      final SettableFuture<WorkitemVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemVersion>() {}, new AsyncApiCallback<ApiResponse<WorkitemVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemVersion> response) {
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
   * Get a version of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemVersion>> getTaskmanagementWorkitemVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemVersion>() {}, new AsyncApiCallback<ApiResponse<WorkitemVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemVersion> response = (ApiResponse<WorkitemVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemVersion> response = (ApiResponse<WorkitemVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all versions of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemVersionListing> getTaskmanagementWorkitemVersionsAsync(GetTaskmanagementWorkitemVersionsRequest request, final AsyncApiCallback<WorkitemVersionListing> callback) {
    try {
      final SettableFuture<WorkitemVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemVersionListing> response) {
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
   * Get all versions of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemVersionListing>> getTaskmanagementWorkitemVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemVersionListing> response = (ApiResponse<WorkitemVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemVersionListing> response = (ApiResponse<WorkitemVersionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all wrapup codes added for all users for a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemWrapupEntityListing> getTaskmanagementWorkitemWrapupsAsync(GetTaskmanagementWorkitemWrapupsRequest request, final AsyncApiCallback<WorkitemWrapupEntityListing> callback) {
    try {
      final SettableFuture<WorkitemWrapupEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemWrapupEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapupEntityListing> response) {
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
   * Get all wrapup codes added for all users for a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemWrapupEntityListing>> getTaskmanagementWorkitemWrapupsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemWrapupEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemWrapupEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemWrapupEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapupEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapupEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapupEntityListing> response = (ApiResponse<WorkitemWrapupEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapupEntityListing> response = (ApiResponse<WorkitemWrapupEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the bulk add job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> getTaskmanagementWorkitemsBulkAddJobAsync(GetTaskmanagementWorkitemsBulkAddJobRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Get the bulk add job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> getTaskmanagementWorkitemsBulkAddJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get bulk add job results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJobAddResponse> getTaskmanagementWorkitemsBulkAddJobResultsAsync(GetTaskmanagementWorkitemsBulkAddJobResultsRequest request, final AsyncApiCallback<BulkJobAddResponse> callback) {
    try {
      final SettableFuture<BulkJobAddResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJobAddResponse>() {}, new AsyncApiCallback<ApiResponse<BulkJobAddResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobAddResponse> response) {
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
   * Get bulk add job results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJobAddResponse>> getTaskmanagementWorkitemsBulkAddJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BulkJobAddResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJobAddResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJobAddResponse>() {}, new AsyncApiCallback<ApiResponse<BulkJobAddResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobAddResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobAddResponse> response = (ApiResponse<BulkJobAddResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobAddResponse> response = (ApiResponse<BulkJobAddResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get bulk jobs created by the currently logged in user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJobsListing> getTaskmanagementWorkitemsBulkJobsUsersMeAsync(GetTaskmanagementWorkitemsBulkJobsUsersMeRequest request, final AsyncApiCallback<BulkJobsListing> callback) {
    try {
      final SettableFuture<BulkJobsListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJobsListing>() {}, new AsyncApiCallback<ApiResponse<BulkJobsListing>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobsListing> response) {
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
   * Get bulk jobs created by the currently logged in user.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJobsListing>> getTaskmanagementWorkitemsBulkJobsUsersMeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BulkJobsListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJobsListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJobsListing>() {}, new AsyncApiCallback<ApiResponse<BulkJobsListing>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobsListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobsListing> response = (ApiResponse<BulkJobsListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobsListing> response = (ApiResponse<BulkJobsListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the bulk job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> getTaskmanagementWorkitemsBulkTerminateJobAsync(GetTaskmanagementWorkitemsBulkTerminateJobRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Get the bulk job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> getTaskmanagementWorkitemsBulkTerminateJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get bulk terminate job results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJobTerminateResultsResponse> getTaskmanagementWorkitemsBulkTerminateJobResultsAsync(GetTaskmanagementWorkitemsBulkTerminateJobResultsRequest request, final AsyncApiCallback<BulkJobTerminateResultsResponse> callback) {
    try {
      final SettableFuture<BulkJobTerminateResultsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJobTerminateResultsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkJobTerminateResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobTerminateResultsResponse> response) {
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
   * Get bulk terminate job results.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJobTerminateResultsResponse>> getTaskmanagementWorkitemsBulkTerminateJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BulkJobTerminateResultsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJobTerminateResultsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJobTerminateResultsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkJobTerminateResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJobTerminateResultsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobTerminateResultsResponse> response = (ApiResponse<BulkJobTerminateResultsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJobTerminateResultsResponse> response = (ApiResponse<BulkJobTerminateResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the workitem query job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemQueryJobResponse> getTaskmanagementWorkitemsQueryJobAsync(GetTaskmanagementWorkitemsQueryJobRequest request, final AsyncApiCallback<WorkitemQueryJobResponse> callback) {
    try {
      final SettableFuture<WorkitemQueryJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemQueryJobResponse>() {}, new AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemQueryJobResponse> response) {
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
   * Get the workitem query job associated with the job id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemQueryJobResponse>> getTaskmanagementWorkitemsQueryJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemQueryJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemQueryJobResponse>() {}, new AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemQueryJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemQueryJobResponse> response = (ApiResponse<WorkitemQueryJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemQueryJobResponse> response = (ApiResponse<WorkitemQueryJobResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get results from for workitem query job 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemPagedEntityListing> getTaskmanagementWorkitemsQueryJobResultsAsync(GetTaskmanagementWorkitemsQueryJobResultsRequest request, final AsyncApiCallback<WorkitemPagedEntityListing> callback) {
    try {
      final SettableFuture<WorkitemPagedEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemPagedEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemPagedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemPagedEntityListing> response) {
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
   * Get results from for workitem query job 
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemPagedEntityListing>> getTaskmanagementWorkitemsQueryJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemPagedEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemPagedEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemPagedEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemPagedEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemPagedEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemPagedEntityListing> response = (ApiResponse<WorkitemPagedEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemPagedEntityListing> response = (ApiResponse<WorkitemPagedEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getTaskmanagementWorkitemsSchemaAsync(GetTaskmanagementWorkitemsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
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
   * Get a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getTaskmanagementWorkitemsSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getTaskmanagementWorkitemsSchemaVersionAsync(GetTaskmanagementWorkitemsSchemaVersionRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
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
   * Get a specific version of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getTaskmanagementWorkitemsSchemaVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all versions of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> getTaskmanagementWorkitemsSchemaVersionsAsync(GetTaskmanagementWorkitemsSchemaVersionsRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
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
   * Get all versions of a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> getTaskmanagementWorkitemsSchemaVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchemaListing> getTaskmanagementWorkitemsSchemasAsync(GetTaskmanagementWorkitemsSchemasRequest request, final AsyncApiCallback<DataSchemaListing> callback) {
    try {
      final SettableFuture<DataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
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
   * Get a list of schemas.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchemaListing>> getTaskmanagementWorkitemsSchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<DataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchemaListing> response = (ApiResponse<DataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Coretype> getTaskmanagementWorkitemsSchemasCoretypeAsync(GetTaskmanagementWorkitemsSchemasCoretypeRequest request, final AsyncApiCallback<Coretype> callback) {
    try {
      final SettableFuture<Coretype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
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
   * Get a specific named core type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Coretype>> getTaskmanagementWorkitemsSchemasCoretypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Coretype>> callback) {
    try {
      final SettableFuture<ApiResponse<Coretype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Coretype>() {}, new AsyncApiCallback<ApiResponse<Coretype>>() {
        @Override
        public void onCompleted(ApiResponse<Coretype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Coretype> response = (ApiResponse<Coretype>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CoretypeListing> getTaskmanagementWorkitemsSchemasCoretypesAsync(GetTaskmanagementWorkitemsSchemasCoretypesRequest request, final AsyncApiCallback<CoretypeListing> callback) {
    try {
      final SettableFuture<CoretypeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
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
   * Get the core types from which all schemas are built.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CoretypeListing>> getTaskmanagementWorkitemsSchemasCoretypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoretypeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CoretypeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CoretypeListing>() {}, new AsyncApiCallback<ApiResponse<CoretypeListing>>() {
        @Override
        public void onCompleted(ApiResponse<CoretypeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CoretypeListing> response = (ApiResponse<CoretypeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SchemaQuantityLimits> getTaskmanagementWorkitemsSchemasLimitsAsync(GetTaskmanagementWorkitemsSchemasLimitsRequest request, final AsyncApiCallback<SchemaQuantityLimits> callback) {
    try {
      final SettableFuture<SchemaQuantityLimits> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
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
   * Get quantitative limits on schemas
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SchemaQuantityLimits>> getTaskmanagementWorkitemsSchemasLimitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SchemaQuantityLimits>> callback) {
    try {
      final SettableFuture<ApiResponse<SchemaQuantityLimits>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SchemaQuantityLimits>() {}, new AsyncApiCallback<ApiResponse<SchemaQuantityLimits>>() {
        @Override
        public void onCompleted(ApiResponse<SchemaQuantityLimits> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SchemaQuantityLimits> response = (ApiResponse<SchemaQuantityLimits>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Worktype> getTaskmanagementWorktypeAsync(GetTaskmanagementWorktypeRequest request, final AsyncApiCallback<Worktype> callback) {
    try {
      final SettableFuture<Worktype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
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
   * Get a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Worktype>> getTaskmanagementWorktypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Worktype>> callback) {
    try {
      final SettableFuture<ApiResponse<Worktype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemDateBasedRule> getTaskmanagementWorktypeFlowsDatebasedRuleAsync(GetTaskmanagementWorktypeFlowsDatebasedRuleRequest request, final AsyncApiCallback<WorkitemDateBasedRule> callback) {
    try {
      final SettableFuture<WorkitemDateBasedRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
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
   * Get a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemDateBasedRule>> getTaskmanagementWorktypeFlowsDatebasedRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemDateBasedRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all date based rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemDateBasedRuleListing> getTaskmanagementWorktypeFlowsDatebasedRulesAsync(GetTaskmanagementWorktypeFlowsDatebasedRulesRequest request, final AsyncApiCallback<WorkitemDateBasedRuleListing> callback) {
    try {
      final SettableFuture<WorkitemDateBasedRuleListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemDateBasedRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRuleListing> response) {
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
   * Get all date based rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemDateBasedRuleListing>> getTaskmanagementWorktypeFlowsDatebasedRulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemDateBasedRuleListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemDateBasedRuleListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemDateBasedRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRuleListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRuleListing> response = (ApiResponse<WorkitemDateBasedRuleListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRuleListing> response = (ApiResponse<WorkitemDateBasedRuleListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an attribute change rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnAttributeChangeRule> getTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(GetTaskmanagementWorktypeFlowsOnattributechangeRuleRequest request, final AsyncApiCallback<WorkitemOnAttributeChangeRule> callback) {
    try {
      final SettableFuture<WorkitemOnAttributeChangeRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
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
   * Get an attribute change rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnAttributeChangeRule>> getTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnAttributeChangeRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all attribute-change rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnAttributeChangeRuleListing> getTaskmanagementWorktypeFlowsOnattributechangeRulesAsync(GetTaskmanagementWorktypeFlowsOnattributechangeRulesRequest request, final AsyncApiCallback<WorkitemOnAttributeChangeRuleListing> callback) {
    try {
      final SettableFuture<WorkitemOnAttributeChangeRuleListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnAttributeChangeRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRuleListing> response) {
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
   * Get all attribute-change rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnAttributeChangeRuleListing>> getTaskmanagementWorktypeFlowsOnattributechangeRulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRuleListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnAttributeChangeRuleListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnAttributeChangeRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRuleListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRuleListing> response = (ApiResponse<WorkitemOnAttributeChangeRuleListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRuleListing> response = (ApiResponse<WorkitemOnAttributeChangeRuleListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get an on-create rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnCreateRule> getTaskmanagementWorktypeFlowsOncreateRuleAsync(GetTaskmanagementWorktypeFlowsOncreateRuleRequest request, final AsyncApiCallback<WorkitemOnCreateRule> callback) {
    try {
      final SettableFuture<WorkitemOnCreateRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
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
   * Get an on-create rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnCreateRule>> getTaskmanagementWorktypeFlowsOncreateRuleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnCreateRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all on-create rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnCreateRuleListing> getTaskmanagementWorktypeFlowsOncreateRulesAsync(GetTaskmanagementWorktypeFlowsOncreateRulesRequest request, final AsyncApiCallback<WorkitemOnCreateRuleListing> callback) {
    try {
      final SettableFuture<WorkitemOnCreateRuleListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnCreateRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRuleListing> response) {
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
   * Get all on-create rules for a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnCreateRuleListing>> getTaskmanagementWorktypeFlowsOncreateRulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemOnCreateRuleListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnCreateRuleListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnCreateRuleListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRuleListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRuleListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRuleListing> response = (ApiResponse<WorkitemOnCreateRuleListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRuleListing> response = (ApiResponse<WorkitemOnCreateRuleListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a listing of a worktype's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorktypeChangeListing> getTaskmanagementWorktypeHistoryAsync(GetTaskmanagementWorktypeHistoryRequest request, final AsyncApiCallback<WorktypeChangeListing> callback) {
    try {
      final SettableFuture<WorktypeChangeListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorktypeChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeChangeListing> response) {
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
   * Get a listing of a worktype's attribute change history
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorktypeChangeListing>> getTaskmanagementWorktypeHistoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorktypeChangeListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorktypeChangeListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorktypeChangeListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeChangeListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeChangeListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeChangeListing> response = (ApiResponse<WorktypeChangeListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeChangeListing> response = (ApiResponse<WorktypeChangeListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemStatus> getTaskmanagementWorktypeStatusAsync(GetTaskmanagementWorktypeStatusRequest request, final AsyncApiCallback<WorkitemStatus> callback) {
    try {
      final SettableFuture<WorkitemStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
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
   * Get a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemStatus>> getTaskmanagementWorktypeStatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get list of statuses for this worktype.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemStatusListing> getTaskmanagementWorktypeStatusesAsync(GetTaskmanagementWorktypeStatusesRequest request, final AsyncApiCallback<WorkitemStatusListing> callback) {
    try {
      final SettableFuture<WorkitemStatusListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemStatusListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatusListing> response) {
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
   * Get list of statuses for this worktype.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemStatusListing>> getTaskmanagementWorktypeStatusesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorkitemStatusListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemStatusListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemStatusListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatusListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatusListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatusListing> response = (ApiResponse<WorkitemStatusListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatusListing> response = (ApiResponse<WorkitemStatusListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a version of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorktypeVersion> getTaskmanagementWorktypeVersionAsync(GetTaskmanagementWorktypeVersionRequest request, final AsyncApiCallback<WorktypeVersion> callback) {
    try {
      final SettableFuture<WorktypeVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorktypeVersion>() {}, new AsyncApiCallback<ApiResponse<WorktypeVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeVersion> response) {
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
   * Get a version of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorktypeVersion>> getTaskmanagementWorktypeVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorktypeVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<WorktypeVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorktypeVersion>() {}, new AsyncApiCallback<ApiResponse<WorktypeVersion>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeVersion> response = (ApiResponse<WorktypeVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeVersion> response = (ApiResponse<WorktypeVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all versions of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorktypeVersionListing> getTaskmanagementWorktypeVersionsAsync(GetTaskmanagementWorktypeVersionsRequest request, final AsyncApiCallback<WorktypeVersionListing> callback) {
    try {
      final SettableFuture<WorktypeVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorktypeVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeVersionListing> response) {
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
   * Get all versions of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorktypeVersionListing>> getTaskmanagementWorktypeVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WorktypeVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorktypeVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorktypeVersionListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeVersionListing> response = (ApiResponse<WorktypeVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeVersionListing> response = (ApiResponse<WorktypeVersionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workbin> patchTaskmanagementWorkbinAsync(PatchTaskmanagementWorkbinRequest request, final AsyncApiCallback<Workbin> callback) {
    try {
      final SettableFuture<Workbin> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
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
   * Update the attributes of a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workbin>> patchTaskmanagementWorkbinAsync(ApiRequest<WorkbinUpdate> request, final AsyncApiCallback<ApiResponse<Workbin>> callback) {
    try {
      final SettableFuture<ApiResponse<Workbin>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> patchTaskmanagementWorkitemAsync(PatchTaskmanagementWorkitemRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Update the attributes of a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> patchTaskmanagementWorkitemAsync(ApiRequest<WorkitemUpdate> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> patchTaskmanagementWorkitemAssignmentAsync(PatchTaskmanagementWorkitemAssignmentRequest request, final AsyncApiCallback<Void> callback) {
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
   * Attempts to manually assign a specified workitem to a specified user.  Ignores bullseye ring, PAR score, skills, and languages.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> patchTaskmanagementWorkitemAssignmentAsync(ApiRequest<WorkitemManualAssign> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemWrapup> patchTaskmanagementWorkitemUserWrapupsAsync(PatchTaskmanagementWorkitemUserWrapupsRequest request, final AsyncApiCallback<WorkitemWrapup> callback) {
    try {
      final SettableFuture<WorkitemWrapup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
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
   * Add/Remove a wrapup code for a given user in a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemWrapup>> patchTaskmanagementWorkitemUserWrapupsAsync(ApiRequest<WorkitemWrapupUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemWrapup>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemWrapup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemWrapup> patchTaskmanagementWorkitemUsersMeWrapupsAsync(PatchTaskmanagementWorkitemUsersMeWrapupsRequest request, final AsyncApiCallback<WorkitemWrapup> callback) {
    try {
      final SettableFuture<WorkitemWrapup> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
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
   * Add/Remove a wrapup code for the current user in a workitem.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemWrapup>> patchTaskmanagementWorkitemUsersMeWrapupsAsync(ApiRequest<WorkitemWrapupUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemWrapup>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemWrapup>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemWrapup>() {}, new AsyncApiCallback<ApiResponse<WorkitemWrapup>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemWrapup> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemWrapup> response = (ApiResponse<WorkitemWrapup>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update workitem bulk add job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> patchTaskmanagementWorkitemsBulkAddJobAsync(PatchTaskmanagementWorkitemsBulkAddJobRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Update workitem bulk add job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> patchTaskmanagementWorkitemsBulkAddJobAsync(ApiRequest<BulkJobUpdate> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update workitem bulk terminate job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> patchTaskmanagementWorkitemsBulkTerminateJobAsync(PatchTaskmanagementWorkitemsBulkTerminateJobRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Update workitem bulk terminate job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> patchTaskmanagementWorkitemsBulkTerminateJobAsync(ApiRequest<BulkJobUpdate> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Worktype> patchTaskmanagementWorktypeAsync(PatchTaskmanagementWorktypeRequest request, final AsyncApiCallback<Worktype> callback) {
    try {
      final SettableFuture<Worktype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
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
   * Update the attributes of a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Worktype>> patchTaskmanagementWorktypeAsync(ApiRequest<WorktypeUpdate> request, final AsyncApiCallback<ApiResponse<Worktype>> callback) {
    try {
      final SettableFuture<ApiResponse<Worktype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemDateBasedRule> patchTaskmanagementWorktypeFlowsDatebasedRuleAsync(PatchTaskmanagementWorktypeFlowsDatebasedRuleRequest request, final AsyncApiCallback<WorkitemDateBasedRule> callback) {
    try {
      final SettableFuture<WorkitemDateBasedRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
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
   * Update the attributes of a date based rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemDateBasedRule>> patchTaskmanagementWorktypeFlowsDatebasedRuleAsync(ApiRequest<WorkitemDateBasedRuleUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemDateBasedRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnAttributeChangeRule> patchTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(PatchTaskmanagementWorktypeFlowsOnattributechangeRuleRequest request, final AsyncApiCallback<WorkitemOnAttributeChangeRule> callback) {
    try {
      final SettableFuture<WorkitemOnAttributeChangeRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
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
   * Update the attributes of a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnAttributeChangeRule>> patchTaskmanagementWorktypeFlowsOnattributechangeRuleAsync(ApiRequest<WorkitemOnAttributeChangeRuleUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnAttributeChangeRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnCreateRule> patchTaskmanagementWorktypeFlowsOncreateRuleAsync(PatchTaskmanagementWorktypeFlowsOncreateRuleRequest request, final AsyncApiCallback<WorkitemOnCreateRule> callback) {
    try {
      final SettableFuture<WorkitemOnCreateRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
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
   * Update the attributes of a rule
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnCreateRule>> patchTaskmanagementWorktypeFlowsOncreateRuleAsync(ApiRequest<WorkitemOnCreateRuleUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnCreateRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the attributes of a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemStatus> patchTaskmanagementWorktypeStatusAsync(PatchTaskmanagementWorktypeStatusRequest request, final AsyncApiCallback<WorkitemStatus> callback) {
    try {
      final SettableFuture<WorkitemStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
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
   * Update the attributes of a status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemStatus>> patchTaskmanagementWorktypeStatusAsync(ApiRequest<WorkitemStatusUpdate> request, final AsyncApiCallback<ApiResponse<WorkitemStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workbin> postTaskmanagementWorkbinsAsync(PostTaskmanagementWorkbinsRequest request, final AsyncApiCallback<Workbin> callback) {
    try {
      final SettableFuture<Workbin> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
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
   * Create a workbin
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workbin>> postTaskmanagementWorkbinsAsync(ApiRequest<WorkbinCreate> request, final AsyncApiCallback<ApiResponse<Workbin>> callback) {
    try {
      final SettableFuture<ApiResponse<Workbin>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workbin>() {}, new AsyncApiCallback<ApiResponse<Workbin>>() {
        @Override
        public void onCompleted(ApiResponse<Workbin> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workbin> response = (ApiResponse<Workbin>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for workbins
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkbinQueryEntityListing> postTaskmanagementWorkbinsQueryAsync(PostTaskmanagementWorkbinsQueryRequest request, final AsyncApiCallback<WorkbinQueryEntityListing> callback) {
    try {
      final SettableFuture<WorkbinQueryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkbinQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinQueryEntityListing> response) {
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
   * Query for workbins
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkbinQueryEntityListing>> postTaskmanagementWorkbinsQueryAsync(ApiRequest<WorkbinQueryRequest> request, final AsyncApiCallback<ApiResponse<WorkbinQueryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkbinQueryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkbinQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkbinQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkbinQueryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinQueryEntityListing> response = (ApiResponse<WorkbinQueryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkbinQueryEntityListing> response = (ApiResponse<WorkbinQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> postTaskmanagementWorkitemAcdCancelAsync(PostTaskmanagementWorkitemAcdCancelRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Cancel the assignment process for a workitem that is currently queued for assignment through ACD.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> postTaskmanagementWorkitemAcdCancelAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Disconnect the assignee of the workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> postTaskmanagementWorkitemDisconnectAsync(PostTaskmanagementWorkitemDisconnectRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Disconnect the assignee of the workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> postTaskmanagementWorkitemDisconnectAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Terminate a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> postTaskmanagementWorkitemTerminateAsync(PostTaskmanagementWorkitemTerminateRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Terminate a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> postTaskmanagementWorkitemTerminateAsync(ApiRequest<WorkitemTerminate> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Workitem> postTaskmanagementWorkitemsAsync(PostTaskmanagementWorkitemsRequest request, final AsyncApiCallback<Workitem> callback) {
    try {
      final SettableFuture<Workitem> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
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
   * Create a workitem
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Workitem>> postTaskmanagementWorkitemsAsync(ApiRequest<WorkitemCreate> request, final AsyncApiCallback<ApiResponse<Workitem>> callback) {
    try {
      final SettableFuture<ApiResponse<Workitem>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Workitem>() {}, new AsyncApiCallback<ApiResponse<Workitem>>() {
        @Override
        public void onCompleted(ApiResponse<Workitem> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Workitem> response = (ApiResponse<Workitem>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a workitem bulk add job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> postTaskmanagementWorkitemsBulkAddJobsAsync(PostTaskmanagementWorkitemsBulkAddJobsRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Create a workitem bulk add job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> postTaskmanagementWorkitemsBulkAddJobsAsync(ApiRequest<BulkJobAddRequest> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a workitem bulk terminate job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkJob> postTaskmanagementWorkitemsBulkTerminateJobsAsync(PostTaskmanagementWorkitemsBulkTerminateJobsRequest request, final AsyncApiCallback<BulkJob> callback) {
    try {
      final SettableFuture<BulkJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
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
   * Create a workitem bulk terminate job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkJob>> postTaskmanagementWorkitemsBulkTerminateJobsAsync(ApiRequest<BulkJobTerminateRequest> request, final AsyncApiCallback<ApiResponse<BulkJob>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkJob>() {}, new AsyncApiCallback<ApiResponse<BulkJob>>() {
        @Override
        public void onCompleted(ApiResponse<BulkJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkJob> response = (ApiResponse<BulkJob>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemPostQueryEntityListing> postTaskmanagementWorkitemsQueryAsync(PostTaskmanagementWorkitemsQueryRequest request, final AsyncApiCallback<WorkitemPostQueryEntityListing> callback) {
    try {
      final SettableFuture<WorkitemPostQueryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemPostQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemPostQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemPostQueryEntityListing> response) {
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
   * Query for workitems
   * This query requires at least one EQ filter on the workbinId, assigneeId or typeId attributes.
   * postTaskmanagementWorkitemsQuery is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemPostQueryEntityListing>> postTaskmanagementWorkitemsQueryAsync(ApiRequest<WorkitemQueryPostRequest> request, final AsyncApiCallback<ApiResponse<WorkitemPostQueryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemPostQueryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemPostQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorkitemPostQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemPostQueryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemPostQueryEntityListing> response = (ApiResponse<WorkitemPostQueryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemPostQueryEntityListing> response = (ApiResponse<WorkitemPostQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a workitem query job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemQueryJobResponse> postTaskmanagementWorkitemsQueryJobsAsync(PostTaskmanagementWorkitemsQueryJobsRequest request, final AsyncApiCallback<WorkitemQueryJobResponse> callback) {
    try {
      final SettableFuture<WorkitemQueryJobResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemQueryJobResponse>() {}, new AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemQueryJobResponse> response) {
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
   * Create a workitem query job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemQueryJobResponse>> postTaskmanagementWorkitemsQueryJobsAsync(ApiRequest<WorkitemQueryJobCreate> request, final AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemQueryJobResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemQueryJobResponse>() {}, new AsyncApiCallback<ApiResponse<WorkitemQueryJobResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemQueryJobResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemQueryJobResponse> response = (ApiResponse<WorkitemQueryJobResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemQueryJobResponse> response = (ApiResponse<WorkitemQueryJobResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> postTaskmanagementWorkitemsSchemasAsync(PostTaskmanagementWorkitemsSchemasRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
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
   * Create a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> postTaskmanagementWorkitemsSchemasAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add a date based rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemDateBasedRule> postTaskmanagementWorktypeFlowsDatebasedRulesAsync(PostTaskmanagementWorktypeFlowsDatebasedRulesRequest request, final AsyncApiCallback<WorkitemDateBasedRule> callback) {
    try {
      final SettableFuture<WorkitemDateBasedRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
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
   * Add a date based rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemDateBasedRule>> postTaskmanagementWorktypeFlowsDatebasedRulesAsync(ApiRequest<WorkitemDateBasedRuleCreate> request, final AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemDateBasedRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemDateBasedRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemDateBasedRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemDateBasedRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemDateBasedRule> response = (ApiResponse<WorkitemDateBasedRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add an attribute-change rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnAttributeChangeRule> postTaskmanagementWorktypeFlowsOnattributechangeRulesAsync(PostTaskmanagementWorktypeFlowsOnattributechangeRulesRequest request, final AsyncApiCallback<WorkitemOnAttributeChangeRule> callback) {
    try {
      final SettableFuture<WorkitemOnAttributeChangeRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
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
   * Add an attribute-change rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnAttributeChangeRule>> postTaskmanagementWorktypeFlowsOnattributechangeRulesAsync(ApiRequest<WorkitemOnAttributeChangeRuleCreate> request, final AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnAttributeChangeRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnAttributeChangeRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnAttributeChangeRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnAttributeChangeRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnAttributeChangeRule> response = (ApiResponse<WorkitemOnAttributeChangeRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add an on-create rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemOnCreateRule> postTaskmanagementWorktypeFlowsOncreateRulesAsync(PostTaskmanagementWorktypeFlowsOncreateRulesRequest request, final AsyncApiCallback<WorkitemOnCreateRule> callback) {
    try {
      final SettableFuture<WorkitemOnCreateRule> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
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
   * Add an on-create rule to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemOnCreateRule>> postTaskmanagementWorktypeFlowsOncreateRulesAsync(ApiRequest<WorkitemOnCreateRuleCreate> request, final AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemOnCreateRule>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemOnCreateRule>() {}, new AsyncApiCallback<ApiResponse<WorkitemOnCreateRule>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemOnCreateRule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemOnCreateRule> response = (ApiResponse<WorkitemOnCreateRule>)(ApiResponse<?>)(new ApiException(exception));
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
   * Add a status to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorkitemStatus> postTaskmanagementWorktypeStatusesAsync(PostTaskmanagementWorktypeStatusesRequest request, final AsyncApiCallback<WorkitemStatus> callback) {
    try {
      final SettableFuture<WorkitemStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
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
   * Add a status to a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorkitemStatus>> postTaskmanagementWorktypeStatusesAsync(ApiRequest<WorkitemStatusCreate> request, final AsyncApiCallback<ApiResponse<WorkitemStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<WorkitemStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorkitemStatus>() {}, new AsyncApiCallback<ApiResponse<WorkitemStatus>>() {
        @Override
        public void onCompleted(ApiResponse<WorkitemStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorkitemStatus> response = (ApiResponse<WorkitemStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Worktype> postTaskmanagementWorktypesAsync(PostTaskmanagementWorktypesRequest request, final AsyncApiCallback<Worktype> callback) {
    try {
      final SettableFuture<Worktype> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
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
   * Create a worktype
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Worktype>> postTaskmanagementWorktypesAsync(ApiRequest<WorktypeCreate> request, final AsyncApiCallback<ApiResponse<Worktype>> callback) {
    try {
      final SettableFuture<ApiResponse<Worktype>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Worktype>() {}, new AsyncApiCallback<ApiResponse<Worktype>>() {
        @Override
        public void onCompleted(ApiResponse<Worktype> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Worktype> response = (ApiResponse<Worktype>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for worktypes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WorktypeQueryEntityListing> postTaskmanagementWorktypesQueryAsync(PostTaskmanagementWorktypesQueryRequest request, final AsyncApiCallback<WorktypeQueryEntityListing> callback) {
    try {
      final SettableFuture<WorktypeQueryEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WorktypeQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeQueryEntityListing> response) {
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
   * Query for worktypes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WorktypeQueryEntityListing>> postTaskmanagementWorktypesQueryAsync(ApiRequest<WorktypeQueryRequest> request, final AsyncApiCallback<ApiResponse<WorktypeQueryEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WorktypeQueryEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WorktypeQueryEntityListing>() {}, new AsyncApiCallback<ApiResponse<WorktypeQueryEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WorktypeQueryEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeQueryEntityListing> response = (ApiResponse<WorktypeQueryEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WorktypeQueryEntityListing> response = (ApiResponse<WorktypeQueryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataSchema> putTaskmanagementWorkitemsSchemaAsync(PutTaskmanagementWorkitemsSchemaRequest request, final AsyncApiCallback<DataSchema> callback) {
    try {
      final SettableFuture<DataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
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
   * Update a schema
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataSchema>> putTaskmanagementWorkitemsSchemaAsync(ApiRequest<DataSchema> request, final AsyncApiCallback<ApiResponse<DataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<DataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataSchema>() {}, new AsyncApiCallback<ApiResponse<DataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<DataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataSchema> response = (ApiResponse<DataSchema>)(ApiResponse<?>)(new ApiException(exception));
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
