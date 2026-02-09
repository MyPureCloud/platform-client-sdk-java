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

import com.mypurecloud.sdk.v2.model.AssistantCopilotVariation;
import com.mypurecloud.sdk.v2.model.AssistantCopilotVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;


import com.mypurecloud.sdk.v2.api.request.DeleteAssistantVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantVariationRequest;
import com.mypurecloud.sdk.v2.api.request.GetAssistantVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAssistantVariationsRequest;
import com.mypurecloud.sdk.v2.api.request.PutAssistantVariationRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class AssistantCopilotVariationsApiAsync {
  private final ApiClient pcapiClient;

  public AssistantCopilotVariationsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AssistantCopilotVariationsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteAssistantVariationAsync(DeleteAssistantVariationRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteAssistantVariationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssistantCopilotVariation> getAssistantVariationAsync(GetAssistantVariationRequest request, final AsyncApiCallback<AssistantCopilotVariation> callback) {
    try {
      final SettableFuture<AssistantCopilotVariation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssistantCopilotVariation>> getAssistantVariationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AssistantCopilotVariation>> callback) {
    try {
      final SettableFuture<ApiResponse<AssistantCopilotVariation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssistantCopilotVariationListing> getAssistantVariationsAsync(GetAssistantVariationsRequest request, final AsyncApiCallback<AssistantCopilotVariationListing> callback) {
    try {
      final SettableFuture<AssistantCopilotVariationListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssistantCopilotVariationListing>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariationListing>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariationListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get variations of an assistant copilot
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssistantCopilotVariationListing>> getAssistantVariationsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AssistantCopilotVariationListing>> callback) {
    try {
      final SettableFuture<ApiResponse<AssistantCopilotVariationListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssistantCopilotVariationListing>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariationListing>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariationListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariationListing> response = (ApiResponse<AssistantCopilotVariationListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariationListing> response = (ApiResponse<AssistantCopilotVariationListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create assistant copilot variation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssistantCopilotVariation> postAssistantVariationsAsync(PostAssistantVariationsRequest request, final AsyncApiCallback<AssistantCopilotVariation> callback) {
    try {
      final SettableFuture<AssistantCopilotVariation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create assistant copilot variation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssistantCopilotVariation>> postAssistantVariationsAsync(ApiRequest<AssistantCopilotVariation> request, final AsyncApiCallback<ApiResponse<AssistantCopilotVariation>> callback) {
    try {
      final SettableFuture<ApiResponse<AssistantCopilotVariation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AssistantCopilotVariation> putAssistantVariationAsync(PutAssistantVariationRequest request, final AsyncApiCallback<AssistantCopilotVariation> callback) {
    try {
      final SettableFuture<AssistantCopilotVariation> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update assistant copilot variation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AssistantCopilotVariation>> putAssistantVariationAsync(ApiRequest<AssistantCopilotVariation> request, final AsyncApiCallback<ApiResponse<AssistantCopilotVariation>> callback) {
    try {
      final SettableFuture<ApiResponse<AssistantCopilotVariation>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AssistantCopilotVariation>() {}, new AsyncApiCallback<ApiResponse<AssistantCopilotVariation>>() {
        @Override
        public void onCompleted(ApiResponse<AssistantCopilotVariation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AssistantCopilotVariation> response = (ApiResponse<AssistantCopilotVariation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
