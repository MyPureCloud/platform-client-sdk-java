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

import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class SocialMediaApiAsync {
  private final ApiClient pcapiClient;

  public SocialMediaApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SocialMediaApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a social topic.
   * 
   * deleteSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaTopicAsync(DeleteSocialmediaTopicRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a social topic.
   * 
   * deleteSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaTopicAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Facebook data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Facebook data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a open data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaTopicDataingestionrulesOpenOpenIdAsync(DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a open data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaTopicDataingestionrulesOpenOpenIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a X (formally Twitter) data ingestion rule.
   * 
   * deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get a single social topic.
   * 
   * getSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialTopicResponse> getSocialmediaTopicAsync(GetSocialmediaTopicRequest request, final AsyncApiCallback<SocialTopicResponse> callback) {
    try {
      final SettableFuture<SocialTopicResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
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
   * Get a single social topic.
   * 
   * getSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialTopicResponse>> getSocialmediaTopicAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SocialTopicResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialTopicResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single Facebook data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request, final AsyncApiCallback<FacebookDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
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
   * Get a single Facebook data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleResponse>> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single Facebook data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionAsync(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest request, final AsyncApiCallback<FacebookDataIngestionRuleVersionResponse> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleVersionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleVersionResponse> response) {
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
   * Get a single Facebook data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleVersionResponse>> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleVersionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleVersionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleVersionResponse> response = (ApiResponse<FacebookDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleVersionResponse> response = (ApiResponse<FacebookDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the Facebook data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsAsync(GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest request, final AsyncApiCallback<FacebookDataIngestionRuleVersionResponseEntityListing> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleVersionResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response) {
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
   * Get the Facebook data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>> getSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<FacebookDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single open data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesOpenOpenIdAsync(GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest request, final AsyncApiCallback<OpenDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
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
   * Get a single open data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleResponse>> getSocialmediaTopicDataingestionrulesOpenOpenIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single Open data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionAsync(GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest request, final AsyncApiCallback<OpenDataIngestionRuleVersionResponse> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleVersionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleVersionResponse> response) {
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
   * Get a single Open data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleVersionResponse>> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleVersionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleVersionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleVersionResponse> response = (ApiResponse<OpenDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleVersionResponse> response = (ApiResponse<OpenDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the Open data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionsAsync(GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest request, final AsyncApiCallback<OpenDataIngestionRuleVersionResponseEntityListing> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleVersionResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response) {
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
   * Get the Open data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesOpenOpenIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>> getSocialmediaTopicDataingestionrulesOpenOpenIdVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<OpenDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request, final AsyncApiCallback<TwitterDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
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
   * Get a single X (formally Twitter) data ingestion rule.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleResponse>> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionAsync(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest request, final AsyncApiCallback<TwitterDataIngestionRuleVersionResponse> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleVersionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleVersionResponse> response) {
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
   * Get a single X (formally Twitter) data ingestion rule version.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleVersionResponse>> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleVersionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleVersionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleVersionResponse> response = (ApiResponse<TwitterDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleVersionResponse> response = (ApiResponse<TwitterDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the Open data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsAsync(GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest request, final AsyncApiCallback<TwitterDataIngestionRuleVersionResponseEntityListing> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleVersionResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response) {
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
   * Get the Open data ingestion rule versions.
   * 
   * getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>> getSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<TwitterDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve all social topics.
   * 
   * getSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialTopicResponseEntityListing> getSocialmediaTopicsAsync(GetSocialmediaTopicsRequest request, final AsyncApiCallback<SocialTopicResponseEntityListing> callback) {
    try {
      final SettableFuture<SocialTopicResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialTopicResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponseEntityListing> response) {
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
   * Retrieve all social topics.
   * 
   * getSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialTopicResponseEntityListing>> getSocialmediaTopicsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SocialTopicResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialTopicResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialTopicResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponseEntityListing> response = (ApiResponse<SocialTopicResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponseEntityListing> response = (ApiResponse<SocialTopicResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a social topic.
   * 
   * patchSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialTopicResponse> patchSocialmediaTopicAsync(PatchSocialmediaTopicRequest request, final AsyncApiCallback<SocialTopicResponse> callback) {
    try {
      final SettableFuture<SocialTopicResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
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
   * Update a social topic.
   * 
   * patchSocialmediaTopic is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialTopicResponse>> patchSocialmediaTopicAsync(ApiRequest<SocialTopicPatchRequest> request, final AsyncApiCallback<ApiResponse<SocialTopicResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialTopicResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the status of a Facebook data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request, final AsyncApiCallback<FacebookDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
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
   * Update the status of a Facebook data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleResponse>> patchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(ApiRequest<DataIngestionRuleStatusPatchRequest> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the status of a open data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesOpenOpenIdAsync(PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest request, final AsyncApiCallback<OpenDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
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
   * Update the status of a open data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleResponse>> patchSocialmediaTopicDataingestionrulesOpenOpenIdAsync(ApiRequest<DataIngestionRuleStatusPatchRequest> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request, final AsyncApiCallback<TwitterDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
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
   * Update the status of a X (formally Twitter) data ingestion rule.
   * 
   * patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleResponse>> patchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(ApiRequest<DataIngestionRuleStatusPatchRequest> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an Facebook data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesFacebook is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesFacebookAsync(PostSocialmediaTopicDataingestionrulesFacebookRequest request, final AsyncApiCallback<FacebookDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
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
   * Create an Facebook data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesFacebook is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleResponse>> postSocialmediaTopicDataingestionrulesFacebookAsync(ApiRequest<FacebookDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an open data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesOpen is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesOpenAsync(PostSocialmediaTopicDataingestionrulesOpenRequest request, final AsyncApiCallback<OpenDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
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
   * Create an open data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesOpen is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleResponse>> postSocialmediaTopicDataingestionrulesOpenAsync(ApiRequest<OpenDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an twitter data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesTwitter is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesTwitterAsync(PostSocialmediaTopicDataingestionrulesTwitterRequest request, final AsyncApiCallback<TwitterDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
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
   * Create an twitter data ingestion rule.
   * 
   * postSocialmediaTopicDataingestionrulesTwitter is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleResponse>> postSocialmediaTopicDataingestionrulesTwitterAsync(ApiRequest<TwitterDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create a social topic.
   * 
   * postSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialTopicResponse> postSocialmediaTopicsAsync(PostSocialmediaTopicsRequest request, final AsyncApiCallback<SocialTopicResponse> callback) {
    try {
      final SettableFuture<SocialTopicResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
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
   * Create a social topic.
   * 
   * postSocialmediaTopics is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialTopicResponse>> postSocialmediaTopicsAsync(ApiRequest<SocialTopicRequest> request, final AsyncApiCallback<ApiResponse<SocialTopicResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialTopicResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialTopicResponse>() {}, new AsyncApiCallback<ApiResponse<SocialTopicResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialTopicResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialTopicResponse> response = (ApiResponse<SocialTopicResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the Facebook data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<FacebookDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest request, final AsyncApiCallback<FacebookDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<FacebookDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
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
   * Update the Facebook data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<FacebookDataIngestionRuleResponse>> putSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdAsync(ApiRequest<FacebookDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<FacebookDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<FacebookDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<FacebookDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<FacebookDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<FacebookDataIngestionRuleResponse> response = (ApiResponse<FacebookDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the open data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesOpenOpenIdAsync(PutSocialmediaTopicDataingestionrulesOpenOpenIdRequest request, final AsyncApiCallback<OpenDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<OpenDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
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
   * Update the open data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesOpenOpenId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenDataIngestionRuleResponse>> putSocialmediaTopicDataingestionrulesOpenOpenIdAsync(ApiRequest<OpenDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<OpenDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<OpenDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenDataIngestionRuleResponse> response = (ApiResponse<OpenDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(PutSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest request, final AsyncApiCallback<TwitterDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<TwitterDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
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
   * Update the X (formally Twitter) data ingestion rule.
   * 
   * putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleId is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataIngestionRuleResponse>> putSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdAsync(ApiRequest<TwitterDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataIngestionRuleResponse> response = (ApiResponse<TwitterDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
