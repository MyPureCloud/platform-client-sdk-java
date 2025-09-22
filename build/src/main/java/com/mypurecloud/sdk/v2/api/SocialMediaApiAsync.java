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

import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleResponseEntityListing;
import com.mypurecloud.sdk.v2.model.DataIngestionRuleStatusPatchRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EscalationRuleRequest;
import com.mypurecloud.sdk.v2.model.EscalationRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.FacebookDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.InstagramDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ManualEscalationRequest;
import com.mypurecloud.sdk.v2.model.ManualEscalationResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.OpenDataIngestionRuleVersionResponseEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaNormalizedMessage;
import com.mypurecloud.sdk.v2.model.OpenSocialMediaReactionsRequest;
import com.mypurecloud.sdk.v2.model.OpenSocialNormalizedMessageEntityListing;
import com.mypurecloud.sdk.v2.model.OpenSocialReactionsNormalizedEventEntityListing;
import com.mypurecloud.sdk.v2.model.SocialEscalationResponseEntityListing;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQuery;
import com.mypurecloud.sdk.v2.model.SocialMediaAsyncDetailQueryResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicPatchRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicRequest;
import com.mypurecloud.sdk.v2.model.SocialTopicResponse;
import com.mypurecloud.sdk.v2.model.SocialTopicResponseEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataHistoricalTweetResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleRequest;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponse;
import com.mypurecloud.sdk.v2.model.TwitterDataIngestionRuleVersionResponseEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaMessageRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsMessagesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaAnalyticsMessagesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaEscalationrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesOpenOpenIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesOpenOpenIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSocialmediaTopicDataingestionrulesTwitterTwitterIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaAnalyticsAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaAnalyticsMessagesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaEscalationrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaEscalationsMessagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesFacebookRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesInstagramRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicDataingestionrulesTwitterRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSocialmediaTwitterHistoricalTweetsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaEscalationruleRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesFacebookFacebookIngestionRuleIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest;
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
   * Delete an escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaEscalationruleAsync(DeleteSocialmediaEscalationruleRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete an escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaEscalationruleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaMessageAsync(DeleteSocialmediaMessageRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a social media message.
   * 
   * deleteSocialmediaMessage is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaMessageAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a social topic.
   * 
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
   * Delete a Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(DeleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get status for async query for social media aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getSocialmediaAnalyticsAggregatesJobAsync(GetSocialmediaAnalyticsAggregatesJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
    try {
      final SettableFuture<AsyncQueryStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
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
   * Get status for async query for social media aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getSocialmediaAnalyticsAggregatesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch a page of results for an async social media query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialMediaAsyncAggregateQueryResponse> getSocialmediaAnalyticsAggregatesJobResultsAsync(GetSocialmediaAnalyticsAggregatesJobResultsRequest request, final AsyncApiCallback<SocialMediaAsyncAggregateQueryResponse> callback) {
    try {
      final SettableFuture<SocialMediaAsyncAggregateQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialMediaAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SocialMediaAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialMediaAsyncAggregateQueryResponse> response) {
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
   * Fetch a page of results for an async social media query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialMediaAsyncAggregateQueryResponse>> getSocialmediaAnalyticsAggregatesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SocialMediaAsyncAggregateQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialMediaAsyncAggregateQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialMediaAsyncAggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SocialMediaAsyncAggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialMediaAsyncAggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialMediaAsyncAggregateQueryResponse> response = (ApiResponse<SocialMediaAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialMediaAsyncAggregateQueryResponse> response = (ApiResponse<SocialMediaAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get status for async query for social media messages job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryStatus> getSocialmediaAnalyticsMessagesJobAsync(GetSocialmediaAnalyticsMessagesJobRequest request, final AsyncApiCallback<AsyncQueryStatus> callback) {
    try {
      final SettableFuture<AsyncQueryStatus> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
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
   * Get status for async query for social media messages job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryStatus>> getSocialmediaAnalyticsMessagesJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AsyncQueryStatus>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryStatus>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryStatus>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryStatus>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryStatus> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
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
   * Fetch a page of results for an async social media messages query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialMediaAsyncDetailQueryResponse> getSocialmediaAnalyticsMessagesJobResultsAsync(GetSocialmediaAnalyticsMessagesJobResultsRequest request, final AsyncApiCallback<SocialMediaAsyncDetailQueryResponse> callback) {
    try {
      final SettableFuture<SocialMediaAsyncDetailQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialMediaAsyncDetailQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SocialMediaAsyncDetailQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialMediaAsyncDetailQueryResponse> response) {
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
   * Fetch a page of results for an async social media messages query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialMediaAsyncDetailQueryResponse>> getSocialmediaAnalyticsMessagesJobResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SocialMediaAsyncDetailQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialMediaAsyncDetailQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialMediaAsyncDetailQueryResponse>() {}, new AsyncApiCallback<ApiResponse<SocialMediaAsyncDetailQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SocialMediaAsyncDetailQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialMediaAsyncDetailQueryResponse> response = (ApiResponse<SocialMediaAsyncDetailQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialMediaAsyncDetailQueryResponse> response = (ApiResponse<SocialMediaAsyncDetailQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EscalationRuleResponse> getSocialmediaEscalationruleAsync(GetSocialmediaEscalationruleRequest request, final AsyncApiCallback<EscalationRuleResponse> callback) {
    try {
      final SettableFuture<EscalationRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
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
   * Get a single escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EscalationRuleResponse>> getSocialmediaEscalationruleAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EscalationRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EscalationRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve all escalation rules for a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SocialEscalationResponseEntityListing> getSocialmediaEscalationrulesAsync(GetSocialmediaEscalationrulesRequest request, final AsyncApiCallback<SocialEscalationResponseEntityListing> callback) {
    try {
      final SettableFuture<SocialEscalationResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SocialEscalationResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<SocialEscalationResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SocialEscalationResponseEntityListing> response) {
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
   * Retrieve all escalation rules for a division.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SocialEscalationResponseEntityListing>> getSocialmediaEscalationrulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SocialEscalationResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SocialEscalationResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SocialEscalationResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<SocialEscalationResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SocialEscalationResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialEscalationResponseEntityListing> response = (ApiResponse<SocialEscalationResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SocialEscalationResponseEntityListing> response = (ApiResponse<SocialEscalationResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DataIngestionRuleResponseEntityListing> getSocialmediaTopicDataingestionrulesAsync(GetSocialmediaTopicDataingestionrulesRequest request, final AsyncApiCallback<DataIngestionRuleResponseEntityListing> callback) {
    try {
      final SettableFuture<DataIngestionRuleResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DataIngestionRuleResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataIngestionRuleResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataIngestionRuleResponseEntityListing> response) {
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
   * Retrieve all social topic data ingestion rules with pagination.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DataIngestionRuleResponseEntityListing>> getSocialmediaTopicDataingestionrulesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DataIngestionRuleResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DataIngestionRuleResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DataIngestionRuleResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<DataIngestionRuleResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DataIngestionRuleResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DataIngestionRuleResponseEntityListing> response = (ApiResponse<DataIngestionRuleResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DataIngestionRuleResponseEntityListing> response = (ApiResponse<DataIngestionRuleResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request, final AsyncApiCallback<InstagramDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
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
   * Get a single Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleResponse>> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get a single Instagram data ingestion rule version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleVersionResponse> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionAsync(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionRequest request, final AsyncApiCallback<InstagramDataIngestionRuleVersionResponse> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleVersionResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleVersionResponse> response) {
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
   * Get a single Instagram data ingestion rule version.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleVersionResponse>> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleVersionResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleVersionResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleVersionResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleVersionResponse> response = (ApiResponse<InstagramDataIngestionRuleVersionResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleVersionResponse> response = (ApiResponse<InstagramDataIngestionRuleVersionResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Get the Instagram data ingestion rule versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleVersionResponseEntityListing> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsAsync(GetSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsRequest request, final AsyncApiCallback<InstagramDataIngestionRuleVersionResponseEntityListing> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleVersionResponseEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response) {
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
   * Get the Instagram data ingestion rule versions.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>> getSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdVersionsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleVersionResponseEntityListing>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing> response = (ApiResponse<InstagramDataIngestionRuleVersionResponseEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleResponse> patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(PatchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request, final AsyncApiCallback<InstagramDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
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
   * Update the status of a Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleResponse>> patchSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(ApiRequest<DataIngestionRuleStatusPatchRequest> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for social media aggregates asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postSocialmediaAnalyticsAggregatesJobsAsync(PostSocialmediaAnalyticsAggregatesJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
    try {
      final SettableFuture<AsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
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
   * Query for social media aggregates asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postSocialmediaAnalyticsAggregatesJobsAsync(ApiRequest<SocialMediaAsyncAggregationQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for social media messages asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AsyncQueryResponse> postSocialmediaAnalyticsMessagesJobsAsync(PostSocialmediaAnalyticsMessagesJobsRequest request, final AsyncApiCallback<AsyncQueryResponse> callback) {
    try {
      final SettableFuture<AsyncQueryResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
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
   * Query for social media messages asynchronously
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AsyncQueryResponse>> postSocialmediaAnalyticsMessagesJobsAsync(ApiRequest<SocialMediaAsyncDetailQuery> request, final AsyncApiCallback<ApiResponse<AsyncQueryResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AsyncQueryResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AsyncQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AsyncQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AsyncQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EscalationRuleResponse> postSocialmediaEscalationrulesAsync(PostSocialmediaEscalationrulesRequest request, final AsyncApiCallback<EscalationRuleResponse> callback) {
    try {
      final SettableFuture<EscalationRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
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
   * Create an escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EscalationRuleResponse>> postSocialmediaEscalationrulesAsync(ApiRequest<EscalationRuleRequest> request, final AsyncApiCallback<ApiResponse<EscalationRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EscalationRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Escalate message to a conversation manually
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManualEscalationResponse> postSocialmediaEscalationsMessagesAsync(PostSocialmediaEscalationsMessagesRequest request, final AsyncApiCallback<ManualEscalationResponse> callback) {
    try {
      final SettableFuture<ManualEscalationResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManualEscalationResponse>() {}, new AsyncApiCallback<ApiResponse<ManualEscalationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManualEscalationResponse> response) {
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
   * Escalate message to a conversation manually
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManualEscalationResponse>> postSocialmediaEscalationsMessagesAsync(ApiRequest<ManualEscalationRequest> request, final AsyncApiCallback<ApiResponse<ManualEscalationResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<ManualEscalationResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManualEscalationResponse>() {}, new AsyncApiCallback<ApiResponse<ManualEscalationResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ManualEscalationResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManualEscalationResponse> response = (ApiResponse<ManualEscalationResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManualEscalationResponse> response = (ApiResponse<ManualEscalationResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleResponse> postSocialmediaTopicDataingestionrulesInstagramAsync(PostSocialmediaTopicDataingestionrulesInstagramRequest request, final AsyncApiCallback<InstagramDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
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
   * Create an Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleResponse>> postSocialmediaTopicDataingestionrulesInstagramAsync(ApiRequest<InstagramDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenSocialNormalizedMessageEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkAsync(PostSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkRequest request, final AsyncApiCallback<OpenSocialNormalizedMessageEntityListing> callback) {
    try {
      final SettableFuture<OpenSocialNormalizedMessageEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenSocialNormalizedMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenSocialNormalizedMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenSocialNormalizedMessageEntityListing> response) {
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
   * Ingest a list of Open Social Messages
   * Ingest a list of open social messages to an ingestion rule on a topic. This endpoint will ingest and enrich these messages.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenSocialNormalizedMessageEntityListing>> postSocialmediaTopicDataingestionrulesOpenRuleIdMessagesBulkAsync(ApiRequest<List<OpenSocialMediaNormalizedMessage>> request, final AsyncApiCallback<ApiResponse<OpenSocialNormalizedMessageEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenSocialNormalizedMessageEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenSocialNormalizedMessageEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenSocialNormalizedMessageEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenSocialNormalizedMessageEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenSocialNormalizedMessageEntityListing> response = (ApiResponse<OpenSocialNormalizedMessageEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenSocialNormalizedMessageEntityListing> response = (ApiResponse<OpenSocialNormalizedMessageEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<OpenSocialReactionsNormalizedEventEntityListing> postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkAsync(PostSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkRequest request, final AsyncApiCallback<OpenSocialReactionsNormalizedEventEntityListing> callback) {
    try {
      final SettableFuture<OpenSocialReactionsNormalizedEventEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<OpenSocialReactionsNormalizedEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response) {
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
   * Ingest a list of Open Social Reactions
   * Ingest a list of open social reactions to an ingestion rule on a topic. This endpoint will ingest these reactions.  In order to call this endpoint you will need OAuth token generated using OAuth client credentials authorized with at least social scope.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>> postSocialmediaTopicDataingestionrulesOpenRuleIdReactionsBulkAsync(ApiRequest<OpenSocialMediaReactionsRequest> request, final AsyncApiCallback<ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<OpenSocialReactionsNormalizedEventEntityListing>() {}, new AsyncApiCallback<ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response = (ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<OpenSocialReactionsNormalizedEventEntityListing> response = (ApiResponse<OpenSocialReactionsNormalizedEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TwitterDataHistoricalTweetResponse> postSocialmediaTwitterHistoricalTweetsAsync(PostSocialmediaTwitterHistoricalTweetsRequest request, final AsyncApiCallback<TwitterDataHistoricalTweetResponse> callback) {
    try {
      final SettableFuture<TwitterDataHistoricalTweetResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TwitterDataHistoricalTweetResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataHistoricalTweetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataHistoricalTweetResponse> response) {
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
   * Retrieves historical tweet count for search terms, optional countries list and the current limit and usage for the organization.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TwitterDataHistoricalTweetResponse>> postSocialmediaTwitterHistoricalTweetsAsync(ApiRequest<TwitterDataHistoricalTweetRequest> request, final AsyncApiCallback<ApiResponse<TwitterDataHistoricalTweetResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<TwitterDataHistoricalTweetResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TwitterDataHistoricalTweetResponse>() {}, new AsyncApiCallback<ApiResponse<TwitterDataHistoricalTweetResponse>>() {
        @Override
        public void onCompleted(ApiResponse<TwitterDataHistoricalTweetResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataHistoricalTweetResponse> response = (ApiResponse<TwitterDataHistoricalTweetResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TwitterDataHistoricalTweetResponse> response = (ApiResponse<TwitterDataHistoricalTweetResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EscalationRuleResponse> putSocialmediaEscalationruleAsync(PutSocialmediaEscalationruleRequest request, final AsyncApiCallback<EscalationRuleResponse> callback) {
    try {
      final SettableFuture<EscalationRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
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
   * Update the escalation rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EscalationRuleResponse>> putSocialmediaEscalationruleAsync(ApiRequest<EscalationRuleRequest> request, final AsyncApiCallback<ApiResponse<EscalationRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<EscalationRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EscalationRuleResponse>() {}, new AsyncApiCallback<ApiResponse<EscalationRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<EscalationRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EscalationRuleResponse> response = (ApiResponse<EscalationRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update the Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<InstagramDataIngestionRuleResponse> putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(PutSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdRequest request, final AsyncApiCallback<InstagramDataIngestionRuleResponse> callback) {
    try {
      final SettableFuture<InstagramDataIngestionRuleResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
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
   * Update the Instagram data ingestion rule.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<InstagramDataIngestionRuleResponse>> putSocialmediaTopicDataingestionrulesInstagramInstagramIngestionRuleIdAsync(ApiRequest<InstagramDataIngestionRuleRequest> request, final AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<InstagramDataIngestionRuleResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<InstagramDataIngestionRuleResponse>() {}, new AsyncApiCallback<ApiResponse<InstagramDataIngestionRuleResponse>>() {
        @Override
        public void onCompleted(ApiResponse<InstagramDataIngestionRuleResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<InstagramDataIngestionRuleResponse> response = (ApiResponse<InstagramDataIngestionRuleResponse>)(ApiResponse<?>)(new ApiException(exception));
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
