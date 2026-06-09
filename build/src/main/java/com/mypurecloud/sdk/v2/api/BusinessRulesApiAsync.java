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

import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkAddDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BulkDeleteDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.BulkUpdateDecisionTableRowsResponse;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchema;
import com.mypurecloud.sdk.v2.model.BusinessRulesDataSchemaListing;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaCreateRequest;
import com.mypurecloud.sdk.v2.model.BusinessRulesSchemaUpdateRequest;
import com.mypurecloud.sdk.v2.model.CopyDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.Coretype;
import com.mypurecloud.sdk.v2.model.CoretypeListing;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.CreateDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.DecisionTable;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableExecutionResponse;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableExportJobRequest;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJob;
import com.mypurecloud.sdk.v2.model.DecisionTableImportJobListing;
import com.mypurecloud.sdk.v2.model.DecisionTableListing;
import com.mypurecloud.sdk.v2.model.DecisionTableRow;
import com.mypurecloud.sdk.v2.model.DecisionTableRowListing;
import com.mypurecloud.sdk.v2.model.DecisionTableVersion;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.PutDecisionTableRowRequest;
import com.mypurecloud.sdk.v2.model.SearchDecisionTableRowsRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableImportJobRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableRequest;
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableVersionRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableExportRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteBusinessrulesSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableExportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableImportsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionRowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontableVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontablesRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesDecisiontablesSearchRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasCoretypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetBusinessrulesSchemasCoretypesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableImportRequest;
import com.mypurecloud.sdk.v2.api.request.PatchBusinessrulesDecisiontableVersionRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableImportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionCopyRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkAddRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionRowsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionSyncRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontableVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesDecisiontablesRequest;
import com.mypurecloud.sdk.v2.api.request.PostBusinessrulesSchemasRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesDecisiontableVersionPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesDecisiontableVersionRowRequest;
import com.mypurecloud.sdk.v2.api.request.PutBusinessrulesSchemaRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class BusinessRulesApiAsync {
  private final ApiClient pcapiClient;

  public BusinessRulesApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessRulesApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteBusinessrulesDecisiontableAsync(DeleteBusinessrulesDecisiontableRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteBusinessrulesDecisiontableAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete an export job for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteBusinessrulesDecisiontableExportAsync(DeleteBusinessrulesDecisiontableExportRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an export job for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteBusinessrulesDecisiontableExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteBusinessrulesDecisiontableImportAsync(DeleteBusinessrulesDecisiontableImportRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteBusinessrulesDecisiontableImportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteBusinessrulesDecisiontableVersionAsync(DeleteBusinessrulesDecisiontableVersionRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteBusinessrulesDecisiontableVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteBusinessrulesDecisiontableVersionRowAsync(DeleteBusinessrulesDecisiontableVersionRowRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteBusinessrulesDecisiontableVersionRowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
  public Future<Void> deleteBusinessrulesSchemaAsync(DeleteBusinessrulesSchemaRequest request, final AsyncApiCallback<Void> callback) {
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
  public Future<ApiResponse<Void>> deleteBusinessrulesSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTable> getBusinessrulesDecisiontableAsync(GetBusinessrulesDecisiontableRequest request, final AsyncApiCallback<DecisionTable> callback) {
    try {
      final SettableFuture<DecisionTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTable>() {}, new AsyncApiCallback<ApiResponse<DecisionTable>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTable> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTable>> getBusinessrulesDecisiontableAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTable>() {}, new AsyncApiCallback<ApiResponse<DecisionTable>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an export job for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableExportJob> getBusinessrulesDecisiontableExportAsync(GetBusinessrulesDecisiontableExportRequest request, final AsyncApiCallback<DecisionTableExportJob> callback) {
    try {
      final SettableFuture<DecisionTableExportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get an export job for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableExportJob>> getBusinessrulesDecisiontableExportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableExportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableExportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List export jobs for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableExportJobListing> getBusinessrulesDecisiontableExportsAsync(GetBusinessrulesDecisiontableExportsRequest request, final AsyncApiCallback<DecisionTableExportJobListing> callback) {
    try {
      final SettableFuture<DecisionTableExportJobListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableExportJobListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJobListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List export jobs for a decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableExportJobListing>> getBusinessrulesDecisiontableExportsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableExportJobListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableExportJobListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableExportJobListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJobListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJobListing> response = (ApiResponse<DecisionTableExportJobListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJobListing> response = (ApiResponse<DecisionTableExportJobListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableImportJob> getBusinessrulesDecisiontableImportAsync(GetBusinessrulesDecisiontableImportRequest request, final AsyncApiCallback<DecisionTableImportJob> callback) {
    try {
      final SettableFuture<DecisionTableImportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableImportJob>> getBusinessrulesDecisiontableImportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableImportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableImportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List decision table row import jobs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableImportJobListing> getBusinessrulesDecisiontableImportsAsync(GetBusinessrulesDecisiontableImportsRequest request, final AsyncApiCallback<DecisionTableImportJobListing> callback) {
    try {
      final SettableFuture<DecisionTableImportJobListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableImportJobListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJobListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * List decision table row import jobs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableImportJobListing>> getBusinessrulesDecisiontableImportsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableImportJobListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableImportJobListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableImportJobListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJobListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJobListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJobListing> response = (ApiResponse<DecisionTableImportJobListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJobListing> response = (ApiResponse<DecisionTableImportJobListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> getBusinessrulesDecisiontableVersionAsync(GetBusinessrulesDecisiontableVersionRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> getBusinessrulesDecisiontableVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a decision table row
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableRow> getBusinessrulesDecisiontableVersionRowAsync(GetBusinessrulesDecisiontableVersionRowRequest request, final AsyncApiCallback<DecisionTableRow> callback) {
    try {
      final SettableFuture<DecisionTableRow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a decision table row
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableRow>> getBusinessrulesDecisiontableVersionRowAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableRow>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableRow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableRowListing> getBusinessrulesDecisiontableVersionRowsAsync(GetBusinessrulesDecisiontableVersionRowsRequest request, final AsyncApiCallback<DecisionTableRowListing> callback) {
    try {
      final SettableFuture<DecisionTableRowListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableRowListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRowListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRowListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision table rows.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableRowListing>> getBusinessrulesDecisiontableVersionRowsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableRowListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableRowListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableRowListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRowListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRowListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision table versions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersionListing> getBusinessrulesDecisiontableVersionsAsync(GetBusinessrulesDecisiontableVersionsRequest request, final AsyncApiCallback<DecisionTableVersionListing> callback) {
    try {
      final SettableFuture<DecisionTableVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersionListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersionListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision table versions
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersionListing>> getBusinessrulesDecisiontableVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersionListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersionListing> response = (ApiResponse<DecisionTableVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersionListing> response = (ApiResponse<DecisionTableVersionListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision tables.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableListing> getBusinessrulesDecisiontablesAsync(GetBusinessrulesDecisiontablesRequest request, final AsyncApiCallback<DecisionTableListing> callback) {
    try {
      final SettableFuture<DecisionTableListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of decision tables.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableListing>> getBusinessrulesDecisiontablesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for decision tables.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableListing> getBusinessrulesDecisiontablesSearchAsync(GetBusinessrulesDecisiontablesSearchRequest request, final AsyncApiCallback<DecisionTableListing> callback) {
    try {
      final SettableFuture<DecisionTableListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for decision tables.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableListing>> getBusinessrulesDecisiontablesSearchAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableListing> response = (ApiResponse<DecisionTableListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<BusinessRulesDataSchema> getBusinessrulesSchemaAsync(GetBusinessrulesSchemaRequest request, final AsyncApiCallback<BusinessRulesDataSchema> callback) {
    try {
      final SettableFuture<BusinessRulesDataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<BusinessRulesDataSchema>> getBusinessrulesSchemaAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessRulesDataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<BusinessRulesDataSchemaListing> getBusinessrulesSchemasAsync(GetBusinessrulesSchemasRequest request, final AsyncApiCallback<BusinessRulesDataSchemaListing> callback) {
    try {
      final SettableFuture<BusinessRulesDataSchemaListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchemaListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<BusinessRulesDataSchemaListing>> getBusinessrulesSchemasAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<BusinessRulesDataSchemaListing>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessRulesDataSchemaListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessRulesDataSchemaListing>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchemaListing>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchemaListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchemaListing> response = (ApiResponse<BusinessRulesDataSchemaListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchemaListing> response = (ApiResponse<BusinessRulesDataSchemaListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<Coretype> getBusinessrulesSchemasCoretypeAsync(GetBusinessrulesSchemasCoretypeRequest request, final AsyncApiCallback<Coretype> callback) {
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
  public Future<ApiResponse<Coretype>> getBusinessrulesSchemasCoretypeAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Coretype>> callback) {
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
  public Future<CoretypeListing> getBusinessrulesSchemasCoretypesAsync(GetBusinessrulesSchemasCoretypesRequest request, final AsyncApiCallback<CoretypeListing> callback) {
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
  public Future<ApiResponse<CoretypeListing>> getBusinessrulesSchemasCoretypesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CoretypeListing>> callback) {
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
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTable> patchBusinessrulesDecisiontableAsync(PatchBusinessrulesDecisiontableRequest request, final AsyncApiCallback<DecisionTable> callback) {
    try {
      final SettableFuture<DecisionTable> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTable>() {}, new AsyncApiCallback<ApiResponse<DecisionTable>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTable> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTable>> patchBusinessrulesDecisiontableAsync(ApiRequest<UpdateDecisionTableRequest> request, final AsyncApiCallback<ApiResponse<DecisionTable>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTable>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTable>() {}, new AsyncApiCallback<ApiResponse<DecisionTable>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTable> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTable> response = (ApiResponse<DecisionTable>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableImportJob> patchBusinessrulesDecisiontableImportAsync(PatchBusinessrulesDecisiontableImportRequest request, final AsyncApiCallback<DecisionTableImportJob> callback) {
    try {
      final SettableFuture<DecisionTableImportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableImportJob>> patchBusinessrulesDecisiontableImportAsync(ApiRequest<UpdateDecisionTableImportJobRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableImportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableImportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> patchBusinessrulesDecisiontableVersionAsync(PatchBusinessrulesDecisiontableVersionRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> patchBusinessrulesDecisiontableVersionAsync(ApiRequest<UpdateDecisionTableVersionRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Execute a published decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableExecutionResponse> postBusinessrulesDecisiontableExecuteAsync(PostBusinessrulesDecisiontableExecuteRequest request, final AsyncApiCallback<DecisionTableExecutionResponse> callback) {
    try {
      final SettableFuture<DecisionTableExecutionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExecutionResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Execute a published decision table
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableExecutionResponse>> postBusinessrulesDecisiontableExecuteAsync(ApiRequest<DecisionTableExecutionRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableExecutionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExecutionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableExportJob> postBusinessrulesDecisiontableExportsAsync(PostBusinessrulesDecisiontableExportsRequest request, final AsyncApiCallback<DecisionTableExportJob> callback) {
    try {
      final SettableFuture<DecisionTableExportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create an export job for a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableExportJob>> postBusinessrulesDecisiontableExportsAsync(ApiRequest<DecisionTableExportJobRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableExportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableExportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableExportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExportJob> response = (ApiResponse<DecisionTableExportJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableImportJob> postBusinessrulesDecisiontableImportsAsync(PostBusinessrulesDecisiontableImportsRequest request, final AsyncApiCallback<DecisionTableImportJob> callback) {
    try {
      final SettableFuture<DecisionTableImportJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table row import job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableImportJob>> postBusinessrulesDecisiontableImportsAsync(ApiRequest<CreateDecisionTableImportJobRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableImportJob>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableImportJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableImportJob>() {}, new AsyncApiCallback<ApiResponse<DecisionTableImportJob>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableImportJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableImportJob> response = (ApiResponse<DecisionTableImportJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Copy a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> postBusinessrulesDecisiontableVersionCopyAsync(PostBusinessrulesDecisiontableVersionCopyRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Copy a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> postBusinessrulesDecisiontableVersionCopyAsync(ApiRequest<CopyDecisionTableRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Execute a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableExecutionResponse> postBusinessrulesDecisiontableVersionExecuteAsync(PostBusinessrulesDecisiontableVersionExecuteRequest request, final AsyncApiCallback<DecisionTableExecutionResponse> callback) {
    try {
      final SettableFuture<DecisionTableExecutionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExecutionResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Execute a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableExecutionResponse>> postBusinessrulesDecisiontableVersionExecuteAsync(ApiRequest<DecisionTableExecutionRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableExecutionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableExecutionResponse>() {}, new AsyncApiCallback<ApiResponse<DecisionTableExecutionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableExecutionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableExecutionResponse> response = (ApiResponse<DecisionTableExecutionResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableRow> postBusinessrulesDecisiontableVersionRowsAsync(PostBusinessrulesDecisiontableVersionRowsRequest request, final AsyncApiCallback<DecisionTableRow> callback) {
    try {
      final SettableFuture<DecisionTableRow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableRow>> postBusinessrulesDecisiontableVersionRowsAsync(ApiRequest<CreateDecisionTableRowRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableRow>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableRow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkAddDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkAddAsync(PostBusinessrulesDecisiontableVersionRowsBulkAddRequest request, final AsyncApiCallback<BulkAddDecisionTableRowsResponse> callback) {
    try {
      final SettableFuture<BulkAddDecisionTableRowsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkAddDecisionTableRowsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkAddDecisionTableRowsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkAddDecisionTableRowsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk add decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkAddDecisionTableRowsResponse>> postBusinessrulesDecisiontableVersionRowsBulkAddAsync(ApiRequest<BulkAddDecisionTableRowsRequest> request, final AsyncApiCallback<ApiResponse<BulkAddDecisionTableRowsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkAddDecisionTableRowsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkAddDecisionTableRowsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkAddDecisionTableRowsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkAddDecisionTableRowsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkAddDecisionTableRowsResponse> response = (ApiResponse<BulkAddDecisionTableRowsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkAddDecisionTableRowsResponse> response = (ApiResponse<BulkAddDecisionTableRowsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postBusinessrulesDecisiontableVersionRowsBulkRemoveAsync(PostBusinessrulesDecisiontableVersionRowsBulkRemoveRequest request, final AsyncApiCallback<Void> callback) {
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
   * Bulk delete decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postBusinessrulesDecisiontableVersionRowsBulkRemoveAsync(ApiRequest<BulkDeleteDecisionTableRowsRequest> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<BulkUpdateDecisionTableRowsResponse> postBusinessrulesDecisiontableVersionRowsBulkUpdateAsync(PostBusinessrulesDecisiontableVersionRowsBulkUpdateRequest request, final AsyncApiCallback<BulkUpdateDecisionTableRowsResponse> callback) {
    try {
      final SettableFuture<BulkUpdateDecisionTableRowsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BulkUpdateDecisionTableRowsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkUpdateDecisionTableRowsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkUpdateDecisionTableRowsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Bulk update decision table rows
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<BulkUpdateDecisionTableRowsResponse>> postBusinessrulesDecisiontableVersionRowsBulkUpdateAsync(ApiRequest<BulkUpdateDecisionTableRowsRequest> request, final AsyncApiCallback<ApiResponse<BulkUpdateDecisionTableRowsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<BulkUpdateDecisionTableRowsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BulkUpdateDecisionTableRowsResponse>() {}, new AsyncApiCallback<ApiResponse<BulkUpdateDecisionTableRowsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<BulkUpdateDecisionTableRowsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkUpdateDecisionTableRowsResponse> response = (ApiResponse<BulkUpdateDecisionTableRowsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BulkUpdateDecisionTableRowsResponse> response = (ApiResponse<BulkUpdateDecisionTableRowsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for decision table rows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableRowListing> postBusinessrulesDecisiontableVersionRowsSearchAsync(PostBusinessrulesDecisiontableVersionRowsSearchRequest request, final AsyncApiCallback<DecisionTableRowListing> callback) {
    try {
      final SettableFuture<DecisionTableRowListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableRowListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRowListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRowListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search for decision table rows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableRowListing>> postBusinessrulesDecisiontableVersionRowsSearchAsync(ApiRequest<SearchDecisionTableRowsRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableRowListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableRowListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableRowListing>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRowListing>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRowListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRowListing> response = (ApiResponse<DecisionTableRowListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> postBusinessrulesDecisiontableVersionSyncAsync(PostBusinessrulesDecisiontableVersionSyncRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update the Business Rules Schema to the latest version for a given decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> postBusinessrulesDecisiontableVersionSyncAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> postBusinessrulesDecisiontableVersionsAsync(PostBusinessrulesDecisiontableVersionsRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> postBusinessrulesDecisiontableVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> postBusinessrulesDecisiontablesAsync(PostBusinessrulesDecisiontablesRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a decision table
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> postBusinessrulesDecisiontablesAsync(ApiRequest<CreateDecisionTableRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<BusinessRulesDataSchema> postBusinessrulesSchemasAsync(PostBusinessrulesSchemasRequest request, final AsyncApiCallback<BusinessRulesDataSchema> callback) {
    try {
      final SettableFuture<BusinessRulesDataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<BusinessRulesDataSchema>> postBusinessrulesSchemasAsync(ApiRequest<BusinessRulesSchemaCreateRequest> request, final AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessRulesDataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableVersion> putBusinessrulesDecisiontableVersionPublishAsync(PutBusinessrulesDecisiontableVersionPublishRequest request, final AsyncApiCallback<DecisionTableVersion> callback) {
    try {
      final SettableFuture<DecisionTableVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish a decision table version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableVersion>> putBusinessrulesDecisiontableVersionPublishAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DecisionTableVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableVersion>() {}, new AsyncApiCallback<ApiResponse<DecisionTableVersion>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableVersion> response = (ApiResponse<DecisionTableVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DecisionTableRow> putBusinessrulesDecisiontableVersionRowAsync(PutBusinessrulesDecisiontableVersionRowRequest request, final AsyncApiCallback<DecisionTableRow> callback) {
    try {
      final SettableFuture<DecisionTableRow> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Full update a decision table row
   * Required permissions depend on table content: if the table or row contains queue references, routing:queue:view is required in each queue's division. Future platform objects will require their associated permissions in the relevant divisions when the table or row contains references to them.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DecisionTableRow>> putBusinessrulesDecisiontableVersionRowAsync(ApiRequest<PutDecisionTableRowRequest> request, final AsyncApiCallback<ApiResponse<DecisionTableRow>> callback) {
    try {
      final SettableFuture<ApiResponse<DecisionTableRow>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DecisionTableRow>() {}, new AsyncApiCallback<ApiResponse<DecisionTableRow>>() {
        @Override
        public void onCompleted(ApiResponse<DecisionTableRow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DecisionTableRow> response = (ApiResponse<DecisionTableRow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
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
  public Future<BusinessRulesDataSchema> putBusinessrulesSchemaAsync(PutBusinessrulesSchemaRequest request, final AsyncApiCallback<BusinessRulesDataSchema> callback) {
    try {
      final SettableFuture<BusinessRulesDataSchema> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
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
  public Future<ApiResponse<BusinessRulesDataSchema>> putBusinessrulesSchemaAsync(ApiRequest<BusinessRulesSchemaUpdateRequest> request, final AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>> callback) {
    try {
      final SettableFuture<ApiResponse<BusinessRulesDataSchema>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<BusinessRulesDataSchema>() {}, new AsyncApiCallback<ApiResponse<BusinessRulesDataSchema>>() {
        @Override
        public void onCompleted(ApiResponse<BusinessRulesDataSchema> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<BusinessRulesDataSchema> response = (ApiResponse<BusinessRulesDataSchema>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
