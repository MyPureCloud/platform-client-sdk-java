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
import com.mypurecloud.sdk.v2.model.NluDomain;
import com.mypurecloud.sdk.v2.model.NluFeedbackListing;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.NluFeedbackResponse;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluDomainVersionQualityReport;
import com.mypurecloud.sdk.v2.model.NluDomainVersionListing;
import com.mypurecloud.sdk.v2.model.NluDomainListing;
import com.mypurecloud.sdk.v2.model.NluFeedbackRequest;
import com.mypurecloud.sdk.v2.model.NluDetectionResponse;
import com.mypurecloud.sdk.v2.model.NluDetectionRequest;
import com.mypurecloud.sdk.v2.model.NluDomainVersionTrainingResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainFeedbackFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionReportRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetLanguageunderstandingDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchLanguageunderstandingDomainRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainFeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionDetectRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainVersionTrainRequest;
import com.mypurecloud.sdk.v2.api.request.PostLanguageunderstandingDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PutLanguageunderstandingDomainVersionRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class LanguageUnderstandingApiAsync {
  private final ApiClient pcapiClient;

  public LanguageUnderstandingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public LanguageUnderstandingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteLanguageunderstandingDomainAsync(DeleteLanguageunderstandingDomainRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteLanguageunderstandingDomainAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteLanguageunderstandingDomainFeedbackFeedbackIdAsync(DeleteLanguageunderstandingDomainFeedbackFeedbackIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete the feedback on the NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteLanguageunderstandingDomainFeedbackFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Find an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomain> getLanguageunderstandingDomainAsync(GetLanguageunderstandingDomainRequest request, final AsyncApiCallback<NluDomain> callback) {
    try {
      final SettableFuture<NluDomain> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
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
   * Find an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomain>> getLanguageunderstandingDomainAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomain>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomain>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluFeedbackListing> getLanguageunderstandingDomainFeedbackAsync(GetLanguageunderstandingDomainFeedbackRequest request, final AsyncApiCallback<NluFeedbackListing> callback) {
    try {
      final SettableFuture<NluFeedbackListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluFeedbackListing>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackListing> response) {
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
   * Get all feedback in the given NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluFeedbackListing>> getLanguageunderstandingDomainFeedbackAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluFeedbackListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NluFeedbackListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluFeedbackListing>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackListing> response = (ApiResponse<NluFeedbackListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackListing> response = (ApiResponse<NluFeedbackListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Find a Feedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluFeedbackResponse> getLanguageunderstandingDomainFeedbackFeedbackIdAsync(GetLanguageunderstandingDomainFeedbackFeedbackIdRequest request, final AsyncApiCallback<NluFeedbackResponse> callback) {
    try {
      final SettableFuture<NluFeedbackResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackResponse> response) {
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
   * Find a Feedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluFeedbackResponse>> getLanguageunderstandingDomainFeedbackFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluFeedbackResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<NluFeedbackResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Find an NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersion> getLanguageunderstandingDomainVersionAsync(GetLanguageunderstandingDomainVersionRequest request, final AsyncApiCallback<NluDomainVersion> callback) {
    try {
      final SettableFuture<NluDomainVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
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
   * Find an NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersion>> getLanguageunderstandingDomainVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersionQualityReport> getLanguageunderstandingDomainVersionReportAsync(GetLanguageunderstandingDomainVersionReportRequest request, final AsyncApiCallback<NluDomainVersionQualityReport> callback) {
    try {
      final SettableFuture<NluDomainVersionQualityReport> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersionQualityReport>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionQualityReport>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionQualityReport> response) {
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
   * Retrieved quality report for the specified NLU Domain Version
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersionQualityReport>> getLanguageunderstandingDomainVersionReportAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainVersionQualityReport>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersionQualityReport>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersionQualityReport>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionQualityReport>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionQualityReport> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionQualityReport> response = (ApiResponse<NluDomainVersionQualityReport>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionQualityReport> response = (ApiResponse<NluDomainVersionQualityReport>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersionListing> getLanguageunderstandingDomainVersionsAsync(GetLanguageunderstandingDomainVersionsRequest request, final AsyncApiCallback<NluDomainVersionListing> callback) {
    try {
      final SettableFuture<NluDomainVersionListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersionListing>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionListing> response) {
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
   * Get all NLU Domain Versions for a given Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersionListing>> getLanguageunderstandingDomainVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainVersionListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersionListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersionListing>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionListing> response = (ApiResponse<NluDomainVersionListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionListing> response = (ApiResponse<NluDomainVersionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get all NLU Domains.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainListing> getLanguageunderstandingDomainsAsync(GetLanguageunderstandingDomainsRequest request, final AsyncApiCallback<NluDomainListing> callback) {
    try {
      final SettableFuture<NluDomainListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainListing>() {}, new AsyncApiCallback<ApiResponse<NluDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainListing> response) {
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
   * Get all NLU Domains.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainListing>> getLanguageunderstandingDomainsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainListing>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainListing>() {}, new AsyncApiCallback<ApiResponse<NluDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainListing> response = (ApiResponse<NluDomainListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainListing> response = (ApiResponse<NluDomainListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomain> patchLanguageunderstandingDomainAsync(PatchLanguageunderstandingDomainRequest request, final AsyncApiCallback<NluDomain> callback) {
    try {
      final SettableFuture<NluDomain> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
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
   * Update an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomain>> patchLanguageunderstandingDomainAsync(ApiRequest<NluDomain> request, final AsyncApiCallback<ApiResponse<NluDomain>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomain>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create feedback for the NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluFeedbackResponse> postLanguageunderstandingDomainFeedbackAsync(PostLanguageunderstandingDomainFeedbackRequest request, final AsyncApiCallback<NluFeedbackResponse> callback) {
    try {
      final SettableFuture<NluFeedbackResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackResponse> response) {
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
   * Create feedback for the NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluFeedbackResponse>> postLanguageunderstandingDomainFeedbackAsync(ApiRequest<NluFeedbackRequest> request, final AsyncApiCallback<ApiResponse<NluFeedbackResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<NluFeedbackResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluFeedbackResponse>() {}, new AsyncApiCallback<ApiResponse<NluFeedbackResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluFeedbackResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluFeedbackResponse> response = (ApiResponse<NluFeedbackResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDetectionResponse> postLanguageunderstandingDomainVersionDetectAsync(PostLanguageunderstandingDomainVersionDetectRequest request, final AsyncApiCallback<NluDetectionResponse> callback) {
    try {
      final SettableFuture<NluDetectionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDetectionResponse>() {}, new AsyncApiCallback<ApiResponse<NluDetectionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluDetectionResponse> response) {
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
   * Detect intent, entities, etc. in the submitted text using the specified NLU domain version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDetectionResponse>> postLanguageunderstandingDomainVersionDetectAsync(ApiRequest<NluDetectionRequest> request, final AsyncApiCallback<ApiResponse<NluDetectionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDetectionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDetectionResponse>() {}, new AsyncApiCallback<ApiResponse<NluDetectionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluDetectionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDetectionResponse> response = (ApiResponse<NluDetectionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDetectionResponse> response = (ApiResponse<NluDetectionResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Publish the draft NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersion> postLanguageunderstandingDomainVersionPublishAsync(PostLanguageunderstandingDomainVersionPublishRequest request, final AsyncApiCallback<NluDomainVersion> callback) {
    try {
      final SettableFuture<NluDomainVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
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
   * Publish the draft NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersion>> postLanguageunderstandingDomainVersionPublishAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
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
   * Train the draft NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersionTrainingResponse> postLanguageunderstandingDomainVersionTrainAsync(PostLanguageunderstandingDomainVersionTrainRequest request, final AsyncApiCallback<NluDomainVersionTrainingResponse> callback) {
    try {
      final SettableFuture<NluDomainVersionTrainingResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersionTrainingResponse>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionTrainingResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionTrainingResponse> response) {
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
   * Train the draft NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersionTrainingResponse>> postLanguageunderstandingDomainVersionTrainAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<NluDomainVersionTrainingResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersionTrainingResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersionTrainingResponse>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersionTrainingResponse>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersionTrainingResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionTrainingResponse> response = (ApiResponse<NluDomainVersionTrainingResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersionTrainingResponse> response = (ApiResponse<NluDomainVersionTrainingResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomain> postLanguageunderstandingDomainsAsync(PostLanguageunderstandingDomainsRequest request, final AsyncApiCallback<NluDomain> callback) {
    try {
      final SettableFuture<NluDomain> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
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
   * Create an NLU Domain.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomain>> postLanguageunderstandingDomainsAsync(ApiRequest<NluDomain> request, final AsyncApiCallback<ApiResponse<NluDomain>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomain>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomain>() {}, new AsyncApiCallback<ApiResponse<NluDomain>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomain> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomain> response = (ApiResponse<NluDomain>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update an NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<NluDomainVersion> putLanguageunderstandingDomainVersionAsync(PutLanguageunderstandingDomainVersionRequest request, final AsyncApiCallback<NluDomainVersion> callback) {
    try {
      final SettableFuture<NluDomainVersion> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
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
   * Update an NLU Domain Version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<NluDomainVersion>> putLanguageunderstandingDomainVersionAsync(ApiRequest<NluDomainVersion> request, final AsyncApiCallback<ApiResponse<NluDomainVersion>> callback) {
    try {
      final SettableFuture<ApiResponse<NluDomainVersion>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<NluDomainVersion>() {}, new AsyncApiCallback<ApiResponse<NluDomainVersion>>() {
        @Override
        public void onCompleted(ApiResponse<NluDomainVersion> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<NluDomainVersion> response = (ApiResponse<NluDomainVersion>)(ApiResponse<?>)(new ApiException(exception));
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
