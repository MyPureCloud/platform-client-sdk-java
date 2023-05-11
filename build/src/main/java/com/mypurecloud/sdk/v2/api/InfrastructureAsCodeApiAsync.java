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

import com.mypurecloud.sdk.v2.model.AcceleratorInput;
import com.mypurecloud.sdk.v2.model.AcceleratorList;
import com.mypurecloud.sdk.v2.model.AcceleratorSpecification;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InfrastructureascodeJob;


import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeAcceleratorRequest;
import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeAcceleratorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetInfrastructureascodeJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostInfrastructureascodeJobsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class InfrastructureAsCodeApiAsync {
  private final ApiClient pcapiClient;

  public InfrastructureAsCodeApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public InfrastructureAsCodeApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AcceleratorSpecification> getInfrastructureascodeAcceleratorAsync(GetInfrastructureascodeAcceleratorRequest request, final AsyncApiCallback<AcceleratorSpecification> callback) {
    try {
      final SettableFuture<AcceleratorSpecification> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AcceleratorSpecification>() {}, new AsyncApiCallback<ApiResponse<AcceleratorSpecification>>() {
        @Override
        public void onCompleted(ApiResponse<AcceleratorSpecification> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get information about an accelerator
   * Get the complete metadata specification for an accelerator, including requirements and parameters.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AcceleratorSpecification>> getInfrastructureascodeAcceleratorAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AcceleratorSpecification>> callback) {
    try {
      final SettableFuture<ApiResponse<AcceleratorSpecification>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AcceleratorSpecification>() {}, new AsyncApiCallback<ApiResponse<AcceleratorSpecification>>() {
        @Override
        public void onCompleted(ApiResponse<AcceleratorSpecification> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AcceleratorSpecification> response = (ApiResponse<AcceleratorSpecification>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AcceleratorSpecification> response = (ApiResponse<AcceleratorSpecification>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AcceleratorList> getInfrastructureascodeAcceleratorsAsync(GetInfrastructureascodeAcceleratorsRequest request, final AsyncApiCallback<AcceleratorList> callback) {
    try {
      final SettableFuture<AcceleratorList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AcceleratorList>() {}, new AsyncApiCallback<ApiResponse<AcceleratorList>>() {
        @Override
        public void onCompleted(ApiResponse<AcceleratorList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of available accelerators
   * Search for accelerators that can be run.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AcceleratorList>> getInfrastructureascodeAcceleratorsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AcceleratorList>> callback) {
    try {
      final SettableFuture<ApiResponse<AcceleratorList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AcceleratorList>() {}, new AsyncApiCallback<ApiResponse<AcceleratorList>>() {
        @Override
        public void onCompleted(ApiResponse<AcceleratorList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AcceleratorList> response = (ApiResponse<AcceleratorList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AcceleratorList> response = (ApiResponse<AcceleratorList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InfrastructureascodeJob> getInfrastructureascodeJobAsync(GetInfrastructureascodeJobRequest request, final AsyncApiCallback<InfrastructureascodeJob> callback) {
    try {
      final SettableFuture<InfrastructureascodeJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job status and results
   * Get the execution status of a submitted job, optionally including results and error details.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InfrastructureascodeJob>> getInfrastructureascodeJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InfrastructureascodeJob>> callback) {
    try {
      final SettableFuture<ApiResponse<InfrastructureascodeJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InfrastructureascodeJob> getInfrastructureascodeJobsAsync(GetInfrastructureascodeJobsRequest request, final AsyncApiCallback<InfrastructureascodeJob> callback) {
    try {
      final SettableFuture<InfrastructureascodeJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get job history
   * Get a history of submitted jobs, optionally including error messages.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InfrastructureascodeJob>> getInfrastructureascodeJobsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InfrastructureascodeJob>> callback) {
    try {
      final SettableFuture<ApiResponse<InfrastructureascodeJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InfrastructureascodeJob> postInfrastructureascodeJobsAsync(PostInfrastructureascodeJobsRequest request, final AsyncApiCallback<InfrastructureascodeJob> callback) {
    try {
      final SettableFuture<InfrastructureascodeJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Job
   * Create and submit a job for remote execution or see job planning results.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InfrastructureascodeJob>> postInfrastructureascodeJobsAsync(ApiRequest<AcceleratorInput> request, final AsyncApiCallback<ApiResponse<InfrastructureascodeJob>> callback) {
    try {
      final SettableFuture<ApiResponse<InfrastructureascodeJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InfrastructureascodeJob>() {}, new AsyncApiCallback<ApiResponse<InfrastructureascodeJob>>() {
        @Override
        public void onCompleted(ApiResponse<InfrastructureascodeJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InfrastructureascodeJob> response = (ApiResponse<InfrastructureascodeJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
