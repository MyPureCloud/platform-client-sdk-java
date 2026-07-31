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

import com.mypurecloud.sdk.v2.model.AgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentEntityListing;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJob;
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentVersionPublishJobRequest;
import com.mypurecloud.sdk.v2.model.CreateAgenticVirtualAgent;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UpdateAgenticVirtualAgent;


import com.mypurecloud.sdk.v2.api.request.DeleteAgenticVirtualagentJobsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAgenticVirtualagentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchAgenticVirtualagentRequest;
import com.mypurecloud.sdk.v2.api.request.PostAgenticVirtualagentVersionJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAgenticVirtualagentsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class VirtualAgentsApiAsync {
  private final ApiClient pcapiClient;

  public VirtualAgentsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public VirtualAgentsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgentJob> deleteAgenticVirtualagentJobsAsync(DeleteAgenticVirtualagentJobsRequest request, final AsyncApiCallback<AgenticVirtualAgentJob> callback) {
    try {
      final SettableFuture<AgenticVirtualAgentJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the deletion of a virtualAgent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgentJob>> deleteAgenticVirtualagentJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgentJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgentJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgent> getAgenticVirtualagentAsync(GetAgenticVirtualagentRequest request, final AsyncApiCallback<AgenticVirtualAgent> callback) {
    try {
      final SettableFuture<AgenticVirtualAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgent>> getAgenticVirtualagentAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgentJob> getAgenticVirtualagentJobAsync(GetAgenticVirtualagentJobRequest request, final AsyncApiCallback<AgenticVirtualAgentJob> callback) {
    try {
      final SettableFuture<AgenticVirtualAgentJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a virtualAgent job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgentJob>> getAgenticVirtualagentJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgentJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgentJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentJob> response = (ApiResponse<AgenticVirtualAgentJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all virtual agents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgentEntityListing> getAgenticVirtualagentsAsync(GetAgenticVirtualagentsRequest request, final AsyncApiCallback<AgenticVirtualAgentEntityListing> callback) {
    try {
      final SettableFuture<AgenticVirtualAgentEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentEntityListing>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get all virtual agents.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgentEntityListing>> getAgenticVirtualagentsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgentEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgentEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgentEntityListing>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentEntityListing> response = (ApiResponse<AgenticVirtualAgentEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentEntityListing> response = (ApiResponse<AgenticVirtualAgentEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgent> patchAgenticVirtualagentAsync(PatchAgenticVirtualagentRequest request, final AsyncApiCallback<AgenticVirtualAgent> callback) {
    try {
      final SettableFuture<AgenticVirtualAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgent>> patchAgenticVirtualagentAsync(ApiRequest<UpdateAgenticVirtualAgent> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgentVersionPublishJob> postAgenticVirtualagentVersionJobsAsync(PostAgenticVirtualagentVersionJobsRequest request, final AsyncApiCallback<AgenticVirtualAgentVersionPublishJob> callback) {
    try {
      final SettableFuture<AgenticVirtualAgentVersionPublishJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgentVersionPublishJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentVersionPublishJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentVersionPublishJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Start the publishing of a virtual agent version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgentVersionPublishJob>> postAgenticVirtualagentVersionJobsAsync(ApiRequest<AgenticVirtualAgentVersionPublishJobRequest> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgentVersionPublishJob>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgentVersionPublishJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgentVersionPublishJob>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgentVersionPublishJob>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgentVersionPublishJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentVersionPublishJob> response = (ApiResponse<AgenticVirtualAgentVersionPublishJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgentVersionPublishJob> response = (ApiResponse<AgenticVirtualAgentVersionPublishJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AgenticVirtualAgent> postAgenticVirtualagentsAsync(PostAgenticVirtualagentsRequest request, final AsyncApiCallback<AgenticVirtualAgent> callback) {
    try {
      final SettableFuture<AgenticVirtualAgent> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a virtual agent.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AgenticVirtualAgent>> postAgenticVirtualagentsAsync(ApiRequest<CreateAgenticVirtualAgent> request, final AsyncApiCallback<ApiResponse<AgenticVirtualAgent>> callback) {
    try {
      final SettableFuture<ApiResponse<AgenticVirtualAgent>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AgenticVirtualAgent>() {}, new AsyncApiCallback<ApiResponse<AgenticVirtualAgent>>() {
        @Override
        public void onCompleted(ApiResponse<AgenticVirtualAgent> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AgenticVirtualAgent> response = (ApiResponse<AgenticVirtualAgent>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
