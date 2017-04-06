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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;


import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumedresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingConsumingresourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingDeletedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingObjectRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectDependencytrackingUpdatedresourceconsumersRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.GetArchitectSystempromptsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowLatestconfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionConfigurationRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectDependencytrackingBuildRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectPromptsRequest;
import com.mypurecloud.sdk.v2.api.request.PostArchitectSystempromptResourcesRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckinRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsCheckoutRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsDeactivateRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsRevertRequest;
import com.mypurecloud.sdk.v2.api.request.PostFlowsActionsUnlockRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectPromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutArchitectSystempromptResourceRequest;
import com.mypurecloud.sdk.v2.api.request.PutFlowRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class ArchitectApiAsync {
  private final ApiClient pcapiClient;

  public ArchitectApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public ArchitectApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectPromptAsync(DeleteArchitectPromptRequest request, AsyncApiCallback<Void> callback) {
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
   * Delete specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteArchitectPromptResourceAsync(DeleteArchitectPromptResourceRequest request, AsyncApiCallback<Void> callback) {
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
   * Delete specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteArchitectPromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> deleteArchitectPromptsAsync(DeleteArchitectPromptsRequest request, AsyncApiCallback<Operation> callback) {
    try {
      SettableFuture<Operation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Batch-delete a list of prompts asynchronously
   * Multiple IDs can be specified, in which case all specified prompts will be deleted.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> deleteArchitectPromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteArchitectSystempromptResourceAsync(DeleteArchitectSystempromptResourceRequest request, AsyncApiCallback<String> callback) {
    try {
      SettableFuture<String> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteArchitectSystempromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    try {
      SettableFuture<ApiResponse<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<String>() {}, new AsyncApiCallback<ApiResponse<String>>() {
        @Override
        public void onCompleted(ApiResponse<String> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteFlowAsync(DeleteFlowRequest request, AsyncApiCallback<Void> callback) {
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
   * Delete flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteFlowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> deleteFlowsAsync(DeleteFlowsRequest request, AsyncApiCallback<Operation> callback) {
    try {
      SettableFuture<Operation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Batch-delete a list of flows asynchronously
   * Multiple IDs can be specified, in which case all specified flows will be deleted.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> deleteFlowsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingAsync(GetArchitectDependencytrackingRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that have a given display name
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyStatus> getArchitectDependencytrackingBuildAsync(GetArchitectDependencytrackingBuildRequest request, AsyncApiCallback<DependencyStatus> callback) {
    try {
      SettableFuture<DependencyStatus> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyStatus>() {}, new AsyncApiCallback<ApiResponse<DependencyStatus>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyStatus> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking build status for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyStatus>> getArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyStatus>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyStatus>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyStatus>() {}, new AsyncApiCallback<ApiResponse<DependencyStatus>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyStatus> response = (ApiResponse<DependencyStatus>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsumedResourcesEntityListing> getArchitectDependencytrackingConsumedresourcesAsync(GetArchitectDependencytrackingConsumedresourcesRequest request, AsyncApiCallback<ConsumedResourcesEntityListing> callback) {
    try {
      SettableFuture<ConsumedResourcesEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsumedResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumedResourcesEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get resources that are consumed by a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsumedResourcesEntityListing>> getArchitectDependencytrackingConsumedresourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ConsumedResourcesEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsumedResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumedResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumedResourcesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumedResourcesEntityListing> response = (ApiResponse<ConsumedResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConsumingResourcesEntityListing> getArchitectDependencytrackingConsumingresourcesAsync(GetArchitectDependencytrackingConsumingresourcesRequest request, AsyncApiCallback<ConsumingResourcesEntityListing> callback) {
    try {
      SettableFuture<ConsumingResourcesEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConsumingResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumingResourcesEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get resources that consume a given Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConsumingResourcesEntityListing>> getArchitectDependencytrackingConsumingresourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ConsumingResourcesEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConsumingResourcesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConsumingResourcesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConsumingResourcesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConsumingResourcesEntityListing> response = (ApiResponse<ConsumingResourcesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingDeletedresourceconsumersAsync(GetArchitectDependencytrackingDeletedresourceconsumersRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that consume deleted resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingDeletedresourceconsumersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObject> getArchitectDependencytrackingObjectAsync(GetArchitectDependencytrackingObjectRequest request, AsyncApiCallback<DependencyObject> callback) {
    try {
      SettableFuture<DependencyObject> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObject>() {}, new AsyncApiCallback<ApiResponse<DependencyObject>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObject> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Dependency Tracking object
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObject>> getArchitectDependencytrackingObjectAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObject>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyObject>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObject>() {}, new AsyncApiCallback<ApiResponse<DependencyObject>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObject> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObject> response = (ApiResponse<DependencyObject>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyType> getArchitectDependencytrackingTypeAsync(GetArchitectDependencytrackingTypeRequest request, AsyncApiCallback<DependencyType> callback) {
    try {
      SettableFuture<DependencyType> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyType>() {}, new AsyncApiCallback<ApiResponse<DependencyType>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyType> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Dependency Tracking type.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyType>> getArchitectDependencytrackingTypeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyType>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyType>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyType>() {}, new AsyncApiCallback<ApiResponse<DependencyType>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyType> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyType> response = (ApiResponse<DependencyType>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyTypeEntityListing> getArchitectDependencytrackingTypesAsync(GetArchitectDependencytrackingTypesRequest request, AsyncApiCallback<DependencyTypeEntityListing> callback) {
    try {
      SettableFuture<DependencyTypeEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyTypeEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking types.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyTypeEntityListing>> getArchitectDependencytrackingTypesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyTypeEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyTypeEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyTypeEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyTypeEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyTypeEntityListing> response = (ApiResponse<DependencyTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DependencyObjectEntityListing> getArchitectDependencytrackingUpdatedresourceconsumersAsync(GetArchitectDependencytrackingUpdatedresourceconsumersRequest request, AsyncApiCallback<DependencyObjectEntityListing> callback) {
    try {
      SettableFuture<DependencyObjectEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Dependency Tracking objects that depend on updated resources
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DependencyObjectEntityListing>> getArchitectDependencytrackingUpdatedresourceconsumersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<DependencyObjectEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DependencyObjectEntityListing>() {}, new AsyncApiCallback<ApiResponse<DependencyObjectEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DependencyObjectEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DependencyObjectEntityListing> response = (ApiResponse<DependencyObjectEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> getArchitectPromptAsync(GetArchitectPromptRequest request, AsyncApiCallback<Prompt> callback) {
    try {
      SettableFuture<Prompt> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> getArchitectPromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> getArchitectPromptResourceAsync(GetArchitectPromptResourceRequest request, AsyncApiCallback<PromptAsset> callback) {
    try {
      SettableFuture<PromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> getArchitectPromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAssetEntityListing> getArchitectPromptResourcesAsync(GetArchitectPromptResourcesRequest request, AsyncApiCallback<PromptAssetEntityListing> callback) {
    try {
      SettableFuture<PromptAssetEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of user prompt resources
   * The returned list is pageable, and query parameters can be used for filtering.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAssetEntityListing>> getArchitectPromptResourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptAssetEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PromptAssetEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAssetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAssetEntityListing> response = (ApiResponse<PromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptEntityListing> getArchitectPromptsAsync(GetArchitectPromptsRequest request, AsyncApiCallback<PromptEntityListing> callback) {
    try {
      SettableFuture<PromptEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of user prompts
   * The returned list is pageable, and query parameters can be used for filtering.  Multiple names can be specified, in which case all matching prompts will be returned, and no other filters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptEntityListing>> getArchitectPromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<PromptEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<PromptEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<PromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<PromptEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptEntityListing> response = (ApiResponse<PromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a system prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPrompt> getArchitectSystempromptAsync(GetArchitectSystempromptRequest request, AsyncApiCallback<SystemPrompt> callback) {
    try {
      SettableFuture<SystemPrompt> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPrompt>() {}, new AsyncApiCallback<ApiResponse<SystemPrompt>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPrompt> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a system prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPrompt>> getArchitectSystempromptAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPrompt>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPrompt>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPrompt>() {}, new AsyncApiCallback<ApiResponse<SystemPrompt>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPrompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPrompt> response = (ApiResponse<SystemPrompt>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a system prompt resource.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> getArchitectSystempromptResourceAsync(GetArchitectSystempromptResourceRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a system prompt resource.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> getArchitectSystempromptResourceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get system prompt resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAssetEntityListing> getArchitectSystempromptResourcesAsync(GetArchitectSystempromptResourcesRequest request, AsyncApiCallback<SystemPromptAssetEntityListing> callback) {
    try {
      SettableFuture<SystemPromptAssetEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAssetEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get system prompt resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAssetEntityListing>> getArchitectSystempromptResourcesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPromptAssetEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAssetEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAssetEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAssetEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAssetEntityListing> response = (ApiResponse<SystemPromptAssetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get System Prompts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptEntityListing> getArchitectSystempromptsAsync(GetArchitectSystempromptsRequest request, AsyncApiCallback<SystemPromptEntityListing> callback) {
    try {
      SettableFuture<SystemPromptEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get System Prompts
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptEntityListing>> getArchitectSystempromptsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SystemPromptEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPromptEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptEntityListing>() {}, new AsyncApiCallback<ApiResponse<SystemPromptEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptEntityListing> response = (ApiResponse<SystemPromptEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> getFlowAsync(GetFlowRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> getFlowAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Object> getFlowLatestconfigurationAsync(GetFlowLatestconfigurationRequest request, AsyncApiCallback<Object> callback) {
    try {
      SettableFuture<Object> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the latest configuration for flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Object>> getFlowLatestconfigurationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Object>> callback) {
    try {
      SettableFuture<ApiResponse<Object>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersion> getFlowVersionAsync(GetFlowVersionRequest request, AsyncApiCallback<FlowVersion> callback) {
    try {
      SettableFuture<FlowVersion> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersion>> getFlowVersionAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    try {
      SettableFuture<ApiResponse<FlowVersion>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow version configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Object> getFlowVersionConfigurationAsync(GetFlowVersionConfigurationRequest request, AsyncApiCallback<Object> callback) {
    try {
      SettableFuture<Object> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow version configuration
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Object>> getFlowVersionConfigurationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Object>> callback) {
    try {
      SettableFuture<ApiResponse<Object>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Object>() {}, new AsyncApiCallback<ApiResponse<Object>>() {
        @Override
        public void onCompleted(ApiResponse<Object> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow version list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersionEntityListing> getFlowVersionsAsync(GetFlowVersionsRequest request, AsyncApiCallback<FlowVersionEntityListing> callback) {
    try {
      SettableFuture<FlowVersionEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersionEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get flow version list
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersionEntityListing>> getFlowVersionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowVersionEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<FlowVersionEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersionEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowVersionEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersionEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersionEntityListing> response = (ApiResponse<FlowVersionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowEntityListing> getFlowsAsync(GetFlowsRequest request, AsyncApiCallback<FlowEntityListing> callback) {
    try {
      SettableFuture<FlowEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a pageable list of flows, filtered by query parameters
   * Multiple IDs can be specified, in which case all matching flows will be returned, and no other parameters will be evaluated.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowEntityListing>> getFlowsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<FlowEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<FlowEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowEntityListing>() {}, new AsyncApiCallback<ApiResponse<FlowEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FlowEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowEntityListing> response = (ApiResponse<FlowEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Rebuild Dependency Tracking data for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> postArchitectDependencytrackingBuildAsync(PostArchitectDependencytrackingBuildRequest request, AsyncApiCallback<Void> callback) {
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
   * Rebuild Dependency Tracking data for an organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> postArchitectDependencytrackingBuildAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Create a new user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> postArchitectPromptResourcesAsync(PostArchitectPromptResourcesRequest request, AsyncApiCallback<PromptAsset> callback) {
    try {
      SettableFuture<PromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> postArchitectPromptResourcesAsync(ApiRequest<PromptAssetCreate> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> postArchitectPromptsAsync(PostArchitectPromptsRequest request, AsyncApiCallback<Prompt> callback) {
    try {
      SettableFuture<Prompt> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> postArchitectPromptsAsync(ApiRequest<Prompt> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> postArchitectSystempromptResourcesAsync(PostArchitectSystempromptResourcesRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> postArchitectSystempromptResourcesAsync(ApiRequest<SystemPromptAsset> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FlowVersion> postFlowVersionsAsync(PostFlowVersionsRequest request, AsyncApiCallback<FlowVersion> callback) {
    try {
      SettableFuture<FlowVersion> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FlowVersion>> postFlowVersionsAsync(ApiRequest<Object> request, AsyncApiCallback<ApiResponse<FlowVersion>> callback) {
    try {
      SettableFuture<ApiResponse<FlowVersion>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FlowVersion>() {}, new AsyncApiCallback<ApiResponse<FlowVersion>>() {
        @Override
        public void onCompleted(ApiResponse<FlowVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FlowVersion> response = (ApiResponse<FlowVersion>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsAsync(PostFlowsRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsAsync(ApiRequest<Flow> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Check-in flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsCheckinAsync(PostFlowsActionsCheckinRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Check-in flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsCheckinAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Check-out flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsCheckoutAsync(PostFlowsActionsCheckoutRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Check-out flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsCheckoutAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deactivate flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsDeactivateAsync(PostFlowsActionsDeactivateRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Deactivate flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsDeactivateAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Operation> postFlowsActionsPublishAsync(PostFlowsActionsPublishRequest request, AsyncApiCallback<Operation> callback) {
    try {
      SettableFuture<Operation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Publish flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Operation>> postFlowsActionsPublishAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Operation>> callback) {
    try {
      SettableFuture<ApiResponse<Operation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Operation>() {}, new AsyncApiCallback<ApiResponse<Operation>>() {
        @Override
        public void onCompleted(ApiResponse<Operation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Operation> response = (ApiResponse<Operation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Revert flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsRevertAsync(PostFlowsActionsRevertRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Revert flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsRevertAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> postFlowsActionsUnlockAsync(PostFlowsActionsUnlockRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Unlock flow
   * Allows for unlocking a flow in the case where there is no flow configuration available, and thus a check-in will not unlock the flow. The user must have Architect Admin permissions to perform this action.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> postFlowsActionsUnlockAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Prompt> putArchitectPromptAsync(PutArchitectPromptRequest request, AsyncApiCallback<Prompt> callback) {
    try {
      SettableFuture<Prompt> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update specified user prompt
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Prompt>> putArchitectPromptAsync(ApiRequest<Prompt> request, AsyncApiCallback<ApiResponse<Prompt>> callback) {
    try {
      SettableFuture<ApiResponse<Prompt>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Prompt>() {}, new AsyncApiCallback<ApiResponse<Prompt>>() {
        @Override
        public void onCompleted(ApiResponse<Prompt> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Prompt> response = (ApiResponse<Prompt>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PromptAsset> putArchitectPromptResourceAsync(PutArchitectPromptResourceRequest request, AsyncApiCallback<PromptAsset> callback) {
    try {
      SettableFuture<PromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update specified user prompt resource
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PromptAsset>> putArchitectPromptResourceAsync(ApiRequest<PromptAsset> request, AsyncApiCallback<ApiResponse<PromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<PromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PromptAsset>() {}, new AsyncApiCallback<ApiResponse<PromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<PromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PromptAsset> response = (ApiResponse<PromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SystemPromptAsset> putArchitectSystempromptResourceAsync(PutArchitectSystempromptResourceRequest request, AsyncApiCallback<SystemPromptAsset> callback) {
    try {
      SettableFuture<SystemPromptAsset> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Updates a system prompt resource override.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SystemPromptAsset>> putArchitectSystempromptResourceAsync(ApiRequest<SystemPromptAsset> request, AsyncApiCallback<ApiResponse<SystemPromptAsset>> callback) {
    try {
      SettableFuture<ApiResponse<SystemPromptAsset>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SystemPromptAsset>() {}, new AsyncApiCallback<ApiResponse<SystemPromptAsset>>() {
        @Override
        public void onCompleted(ApiResponse<SystemPromptAsset> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SystemPromptAsset> response = (ApiResponse<SystemPromptAsset>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Flow> putFlowAsync(PutFlowRequest request, AsyncApiCallback<Flow> callback) {
    try {
      SettableFuture<Flow> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update flow
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Flow>> putFlowAsync(ApiRequest<Flow> request, AsyncApiCallback<ApiResponse<Flow>> callback) {
    try {
      SettableFuture<ApiResponse<Flow>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Flow>() {}, new AsyncApiCallback<ApiResponse<Flow>>() {
        @Override
        public void onCompleted(ApiResponse<Flow> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Flow> response = (ApiResponse<Flow>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
