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

import com.mypurecloud.sdk.v2.model.CategoriesEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryRequest;
import com.mypurecloud.sdk.v2.model.CommunicationTranslationList;
import com.mypurecloud.sdk.v2.model.ConversationCategoriesEntityListing;
import com.mypurecloud.sdk.v2.model.ConversationMetrics;
import com.mypurecloud.sdk.v2.model.DeleteProgramResponse;
import com.mypurecloud.sdk.v2.model.DictionaryFeedback;
import com.mypurecloud.sdk.v2.model.DictionaryFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GeneralProgramJob;
import com.mypurecloud.sdk.v2.model.GeneralProgramJobRequest;
import com.mypurecloud.sdk.v2.model.GeneralTopicsEntityListing;
import com.mypurecloud.sdk.v2.model.InsightsSettingsRequest;
import com.mypurecloud.sdk.v2.model.JsonSearchResponse;
import com.mypurecloud.sdk.v2.model.Program;
import com.mypurecloud.sdk.v2.model.ProgramInsightsSettings;
import com.mypurecloud.sdk.v2.model.ProgramInsightsSettingsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramJob;
import com.mypurecloud.sdk.v2.model.ProgramJobRequest;
import com.mypurecloud.sdk.v2.model.ProgramMappings;
import com.mypurecloud.sdk.v2.model.ProgramMappingsRequest;
import com.mypurecloud.sdk.v2.model.ProgramRequest;
import com.mypurecloud.sdk.v2.model.ProgramTranscriptionEngines;
import com.mypurecloud.sdk.v2.model.ProgramsEntityListing;
import com.mypurecloud.sdk.v2.model.ProgramsMappingsEntityListing;
import com.mypurecloud.sdk.v2.model.SentimentFeedback;
import com.mypurecloud.sdk.v2.model.SentimentFeedbackEntityListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsConversationSummaryListing;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.model.SpeechTextAnalyticsSettingsResponse;
import com.mypurecloud.sdk.v2.model.StaCategory;
import com.mypurecloud.sdk.v2.model.SupportedDialectsEntityListing;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJob;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJobRequest;
import com.mypurecloud.sdk.v2.model.TestTopicPhraseJobs;
import com.mypurecloud.sdk.v2.model.Topic;
import com.mypurecloud.sdk.v2.model.TopicJob;
import com.mypurecloud.sdk.v2.model.TopicJobRequest;
import com.mypurecloud.sdk.v2.model.TopicRequest;
import com.mypurecloud.sdk.v2.model.TopicsEntityListing;
import com.mypurecloud.sdk.v2.model.TranscriptSearchRequest;
import com.mypurecloud.sdk.v2.model.TranscriptUrl;
import com.mypurecloud.sdk.v2.model.TranscriptUrls;
import com.mypurecloud.sdk.v2.model.TranscriptionEnginesRequest;
import com.mypurecloud.sdk.v2.model.TranslateSupportedLanguageList;
import com.mypurecloud.sdk.v2.model.UnifiedGeneralTopicEntityListing;
import com.mypurecloud.sdk.v2.model.UnpublishedProgramsEntityListing;


import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteSpeechandtextanalyticsTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationCommunicationTranscripturlsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsConversationSummariesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsDictionaryfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramSettingsInsightsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramTranscriptionenginesRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsGeneralJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsPublishjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsSettingsInsightsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsTranscriptionenginesDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsProgramsUnpublishedRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSentimentDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsDialectsRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsGeneralRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsGeneralStatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsPublishjobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTopicsTestphraseJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTranslationsLanguageConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetSpeechandtextanalyticsTranslationsLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsDictionaryfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsGeneralJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsProgramsPublishjobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsSentimentfeedbackRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsPublishjobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTopicsTestphraseJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostSpeechandtextanalyticsTranscriptsSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramMappingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramSettingsInsightsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsProgramTranscriptionenginesRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsSettingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutSpeechandtextanalyticsTopicRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class SpeechTextAnalyticsApiAsync {
  private final ApiClient pcapiClient;

  public SpeechTextAnalyticsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public SpeechTextAnalyticsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a Speech & Text Analytics category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSpeechandtextanalyticsCategoryAsync(DeleteSpeechandtextanalyticsCategoryRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Speech & Text Analytics category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSpeechandtextanalyticsCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Speech & Text Analytics DictionaryFeedback by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(DeleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Speech & Text Analytics DictionaryFeedback by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Speech & Text Analytics program by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DeleteProgramResponse> deleteSpeechandtextanalyticsProgramAsync(DeleteSpeechandtextanalyticsProgramRequest request, final AsyncApiCallback<DeleteProgramResponse> callback) {
    try {
      final SettableFuture<DeleteProgramResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DeleteProgramResponse>() {}, new AsyncApiCallback<ApiResponse<DeleteProgramResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DeleteProgramResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete a Speech & Text Analytics program by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DeleteProgramResponse>> deleteSpeechandtextanalyticsProgramAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DeleteProgramResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<DeleteProgramResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DeleteProgramResponse>() {}, new AsyncApiCallback<ApiResponse<DeleteProgramResponse>>() {
        @Override
        public void onCompleted(ApiResponse<DeleteProgramResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DeleteProgramResponse> response = (ApiResponse<DeleteProgramResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DeleteProgramResponse> response = (ApiResponse<DeleteProgramResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Delete All Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSpeechandtextanalyticsSentimentfeedbackAsync(DeleteSpeechandtextanalyticsSentimentfeedbackRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete All Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSpeechandtextanalyticsSentimentfeedbackAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Speech & Text Analytics SentimentFeedback by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdAsync(DeleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Speech & Text Analytics SentimentFeedback by Id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSpeechandtextanalyticsSentimentfeedbackSentimentFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Delete a Speech & Text Analytics topic by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Void> deleteSpeechandtextanalyticsTopicAsync(DeleteSpeechandtextanalyticsTopicRequest request, final AsyncApiCallback<Void> callback) {
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
   * Delete a Speech & Text Analytics topic by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Void>> deleteSpeechandtextanalyticsTopicAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Void>> callback) {
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
   * Get the list of Speech and Text Analytics categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CategoriesEntityListing> getSpeechandtextanalyticsCategoriesAsync(GetSpeechandtextanalyticsCategoriesRequest request, final AsyncApiCallback<CategoriesEntityListing> callback) {
    try {
      final SettableFuture<CategoriesEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CategoriesEntityListing>() {}, new AsyncApiCallback<ApiResponse<CategoriesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoriesEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech and Text Analytics categories
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CategoriesEntityListing>> getSpeechandtextanalyticsCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CategoriesEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<CategoriesEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CategoriesEntityListing>() {}, new AsyncApiCallback<ApiResponse<CategoriesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<CategoriesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoriesEntityListing> response = (ApiResponse<CategoriesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CategoriesEntityListing> response = (ApiResponse<CategoriesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics Category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<StaCategory> getSpeechandtextanalyticsCategoryAsync(GetSpeechandtextanalyticsCategoryRequest request, final AsyncApiCallback<StaCategory> callback) {
    try {
      final SettableFuture<StaCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics Category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<StaCategory>> getSpeechandtextanalyticsCategoryAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<StaCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<StaCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConversationMetrics> getSpeechandtextanalyticsConversationAsync(GetSpeechandtextanalyticsConversationRequest request, final AsyncApiCallback<ConversationMetrics> callback) {
    try {
      final SettableFuture<ConversationMetrics> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConversationMetrics>() {}, new AsyncApiCallback<ApiResponse<ConversationMetrics>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationMetrics> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech and Text Analytics for a specific conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConversationMetrics>> getSpeechandtextanalyticsConversationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ConversationMetrics>> callback) {
    try {
      final SettableFuture<ApiResponse<ConversationMetrics>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConversationMetrics>() {}, new AsyncApiCallback<ApiResponse<ConversationMetrics>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationMetrics> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationMetrics> response = (ApiResponse<ConversationMetrics>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationMetrics> response = (ApiResponse<ConversationMetrics>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of detected Speech and Text Analytics categories of conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ConversationCategoriesEntityListing> getSpeechandtextanalyticsConversationCategoriesAsync(GetSpeechandtextanalyticsConversationCategoriesRequest request, final AsyncApiCallback<ConversationCategoriesEntityListing> callback) {
    try {
      final SettableFuture<ConversationCategoriesEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ConversationCategoriesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConversationCategoriesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationCategoriesEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of detected Speech and Text Analytics categories of conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ConversationCategoriesEntityListing>> getSpeechandtextanalyticsConversationCategoriesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ConversationCategoriesEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ConversationCategoriesEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ConversationCategoriesEntityListing>() {}, new AsyncApiCallback<ApiResponse<ConversationCategoriesEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ConversationCategoriesEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationCategoriesEntityListing> response = (ApiResponse<ConversationCategoriesEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ConversationCategoriesEntityListing> response = (ApiResponse<ConversationCategoriesEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TranscriptUrl> getSpeechandtextanalyticsConversationCommunicationTranscripturlAsync(GetSpeechandtextanalyticsConversationCommunicationTranscripturlRequest request, final AsyncApiCallback<TranscriptUrl> callback) {
    try {
      final SettableFuture<TranscriptUrl> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TranscriptUrl>() {}, new AsyncApiCallback<ApiResponse<TranscriptUrl>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptUrl> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the pre-signed S3 URL for the transcript of a specific communication of a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TranscriptUrl>> getSpeechandtextanalyticsConversationCommunicationTranscripturlAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TranscriptUrl>> callback) {
    try {
      final SettableFuture<ApiResponse<TranscriptUrl>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TranscriptUrl>() {}, new AsyncApiCallback<ApiResponse<TranscriptUrl>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptUrl> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptUrl> response = (ApiResponse<TranscriptUrl>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptUrl> response = (ApiResponse<TranscriptUrl>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of pre-signed S3 URL for the transcripts of a specific communication of a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TranscriptUrls> getSpeechandtextanalyticsConversationCommunicationTranscripturlsAsync(GetSpeechandtextanalyticsConversationCommunicationTranscripturlsRequest request, final AsyncApiCallback<TranscriptUrls> callback) {
    try {
      final SettableFuture<TranscriptUrls> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TranscriptUrls>() {}, new AsyncApiCallback<ApiResponse<TranscriptUrls>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptUrls> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of pre-signed S3 URL for the transcripts of a specific communication of a conversation
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TranscriptUrls>> getSpeechandtextanalyticsConversationCommunicationTranscripturlsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TranscriptUrls>> callback) {
    try {
      final SettableFuture<ApiResponse<TranscriptUrls>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TranscriptUrls>() {}, new AsyncApiCallback<ApiResponse<TranscriptUrls>>() {
        @Override
        public void onCompleted(ApiResponse<TranscriptUrls> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptUrls> response = (ApiResponse<TranscriptUrls>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TranscriptUrls> response = (ApiResponse<TranscriptUrls>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation summaries by conversation id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SpeechTextAnalyticsConversationSummaryListing> getSpeechandtextanalyticsConversationSummariesAsync(GetSpeechandtextanalyticsConversationSummariesRequest request, final AsyncApiCallback<SpeechTextAnalyticsConversationSummaryListing> callback) {
    try {
      final SettableFuture<SpeechTextAnalyticsConversationSummaryListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsConversationSummaryListing>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsConversationSummaryListing>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsConversationSummaryListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get conversation summaries by conversation id.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SpeechTextAnalyticsConversationSummaryListing>> getSpeechandtextanalyticsConversationSummariesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SpeechTextAnalyticsConversationSummaryListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SpeechTextAnalyticsConversationSummaryListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SpeechTextAnalyticsConversationSummaryListing>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsConversationSummaryListing>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsConversationSummaryListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsConversationSummaryListing> response = (ApiResponse<SpeechTextAnalyticsConversationSummaryListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsConversationSummaryListing> response = (ApiResponse<SpeechTextAnalyticsConversationSummaryListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics dictionary feedbacks
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DictionaryFeedbackEntityListing> getSpeechandtextanalyticsDictionaryfeedbackAsync(GetSpeechandtextanalyticsDictionaryfeedbackRequest request, final AsyncApiCallback<DictionaryFeedbackEntityListing> callback) {
    try {
      final SettableFuture<DictionaryFeedbackEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DictionaryFeedbackEntityListing>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedbackEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedbackEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics dictionary feedbacks
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DictionaryFeedbackEntityListing>> getSpeechandtextanalyticsDictionaryfeedbackAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DictionaryFeedbackEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<DictionaryFeedbackEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DictionaryFeedbackEntityListing>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedbackEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedbackEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedbackEntityListing> response = (ApiResponse<DictionaryFeedbackEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedbackEntityListing> response = (ApiResponse<DictionaryFeedbackEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics dictionary feedback by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DictionaryFeedback> getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(GetSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest request, final AsyncApiCallback<DictionaryFeedback> callback) {
    try {
      final SettableFuture<DictionaryFeedback> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics dictionary feedback by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DictionaryFeedback>> getSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<DictionaryFeedback>> callback) {
    try {
      final SettableFuture<ApiResponse<DictionaryFeedback>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics program by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Program> getSpeechandtextanalyticsProgramAsync(GetSpeechandtextanalyticsProgramRequest request, final AsyncApiCallback<Program> callback) {
    try {
      final SettableFuture<Program> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics program by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Program>> getSpeechandtextanalyticsProgramAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Program>> callback) {
    try {
      final SettableFuture<ApiResponse<Program>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech & Text Analytics program mappings to queues and flows by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramMappings> getSpeechandtextanalyticsProgramMappingsAsync(GetSpeechandtextanalyticsProgramMappingsRequest request, final AsyncApiCallback<ProgramMappings> callback) {
    try {
      final SettableFuture<ProgramMappings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramMappings>() {}, new AsyncApiCallback<ApiResponse<ProgramMappings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramMappings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech & Text Analytics program mappings to queues and flows by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramMappings>> getSpeechandtextanalyticsProgramMappingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramMappings>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramMappings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramMappings>() {}, new AsyncApiCallback<ApiResponse<ProgramMappings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramMappings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get AI Insights settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramInsightsSettings> getSpeechandtextanalyticsProgramSettingsInsightsAsync(GetSpeechandtextanalyticsProgramSettingsInsightsRequest request, final AsyncApiCallback<ProgramInsightsSettings> callback) {
    try {
      final SettableFuture<ProgramInsightsSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramInsightsSettings>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get AI Insights settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramInsightsSettings>> getSpeechandtextanalyticsProgramSettingsInsightsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramInsightsSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramInsightsSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramInsightsSettings>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettings> response = (ApiResponse<ProgramInsightsSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettings> response = (ApiResponse<ProgramInsightsSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get transcription engine settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramTranscriptionEngines> getSpeechandtextanalyticsProgramTranscriptionenginesAsync(GetSpeechandtextanalyticsProgramTranscriptionenginesRequest request, final AsyncApiCallback<ProgramTranscriptionEngines> callback) {
    try {
      final SettableFuture<ProgramTranscriptionEngines> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramTranscriptionEngines>() {}, new AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramTranscriptionEngines> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get transcription engine settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramTranscriptionEngines>> getSpeechandtextanalyticsProgramTranscriptionenginesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramTranscriptionEngines>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramTranscriptionEngines>() {}, new AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramTranscriptionEngines> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramTranscriptionEngines> response = (ApiResponse<ProgramTranscriptionEngines>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramTranscriptionEngines> response = (ApiResponse<ProgramTranscriptionEngines>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics programs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramsEntityListing> getSpeechandtextanalyticsProgramsAsync(GetSpeechandtextanalyticsProgramsRequest request, final AsyncApiCallback<ProgramsEntityListing> callback) {
    try {
      final SettableFuture<ProgramsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics programs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramsEntityListing>> getSpeechandtextanalyticsProgramsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramsEntityListing> response = (ApiResponse<ProgramsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramsEntityListing> response = (ApiResponse<ProgramsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics general program job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GeneralProgramJob> getSpeechandtextanalyticsProgramsGeneralJobAsync(GetSpeechandtextanalyticsProgramsGeneralJobRequest request, final AsyncApiCallback<GeneralProgramJob> callback) {
    try {
      final SettableFuture<GeneralProgramJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GeneralProgramJob>() {}, new AsyncApiCallback<ApiResponse<GeneralProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralProgramJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics general program job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GeneralProgramJob>> getSpeechandtextanalyticsProgramsGeneralJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GeneralProgramJob>> callback) {
    try {
      final SettableFuture<ApiResponse<GeneralProgramJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GeneralProgramJob>() {}, new AsyncApiCallback<ApiResponse<GeneralProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralProgramJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics programs mappings to queues and flows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramsMappingsEntityListing> getSpeechandtextanalyticsProgramsMappingsAsync(GetSpeechandtextanalyticsProgramsMappingsRequest request, final AsyncApiCallback<ProgramsMappingsEntityListing> callback) {
    try {
      final SettableFuture<ProgramsMappingsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramsMappingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramsMappingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramsMappingsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics programs mappings to queues and flows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramsMappingsEntityListing>> getSpeechandtextanalyticsProgramsMappingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramsMappingsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramsMappingsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramsMappingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramsMappingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramsMappingsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramsMappingsEntityListing> response = (ApiResponse<ProgramsMappingsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramsMappingsEntityListing> response = (ApiResponse<ProgramsMappingsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics publish programs job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramJob> getSpeechandtextanalyticsProgramsPublishjobAsync(GetSpeechandtextanalyticsProgramsPublishjobRequest request, final AsyncApiCallback<ProgramJob> callback) {
    try {
      final SettableFuture<ProgramJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramJob>() {}, new AsyncApiCallback<ApiResponse<ProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics publish programs job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramJob>> getSpeechandtextanalyticsProgramsPublishjobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramJob>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramJob>() {}, new AsyncApiCallback<ApiResponse<ProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of program AI Insights settings for the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramInsightsSettingsEntityListing> getSpeechandtextanalyticsProgramsSettingsInsightsAsync(GetSpeechandtextanalyticsProgramsSettingsInsightsRequest request, final AsyncApiCallback<ProgramInsightsSettingsEntityListing> callback) {
    try {
      final SettableFuture<ProgramInsightsSettingsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramInsightsSettingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettingsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of program AI Insights settings for the organization
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramInsightsSettingsEntityListing>> getSpeechandtextanalyticsProgramsSettingsInsightsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ProgramInsightsSettingsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramInsightsSettingsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramInsightsSettingsEntityListing>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettingsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettingsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettingsEntityListing> response = (ApiResponse<ProgramInsightsSettingsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettingsEntityListing> response = (ApiResponse<ProgramInsightsSettingsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get supported dialects for each transcription engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SupportedDialectsEntityListing> getSpeechandtextanalyticsProgramsTranscriptionenginesDialectsAsync(GetSpeechandtextanalyticsProgramsTranscriptionenginesDialectsRequest request, final AsyncApiCallback<SupportedDialectsEntityListing> callback) {
    try {
      final SettableFuture<SupportedDialectsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SupportedDialectsEntityListing>() {}, new AsyncApiCallback<ApiResponse<SupportedDialectsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedDialectsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get supported dialects for each transcription engine
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SupportedDialectsEntityListing>> getSpeechandtextanalyticsProgramsTranscriptionenginesDialectsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SupportedDialectsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SupportedDialectsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SupportedDialectsEntityListing>() {}, new AsyncApiCallback<ApiResponse<SupportedDialectsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SupportedDialectsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedDialectsEntityListing> response = (ApiResponse<SupportedDialectsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SupportedDialectsEntityListing> response = (ApiResponse<SupportedDialectsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics unpublished programs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnpublishedProgramsEntityListing> getSpeechandtextanalyticsProgramsUnpublishedAsync(GetSpeechandtextanalyticsProgramsUnpublishedRequest request, final AsyncApiCallback<UnpublishedProgramsEntityListing> callback) {
    try {
      final SettableFuture<UnpublishedProgramsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnpublishedProgramsEntityListing>() {}, new AsyncApiCallback<ApiResponse<UnpublishedProgramsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnpublishedProgramsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics unpublished programs
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnpublishedProgramsEntityListing>> getSpeechandtextanalyticsProgramsUnpublishedAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnpublishedProgramsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UnpublishedProgramsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnpublishedProgramsEntityListing>() {}, new AsyncApiCallback<ApiResponse<UnpublishedProgramsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnpublishedProgramsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnpublishedProgramsEntityListing> response = (ApiResponse<UnpublishedProgramsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnpublishedProgramsEntityListing> response = (ApiResponse<UnpublishedProgramsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics sentiment supported dialects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EntityListing> getSpeechandtextanalyticsSentimentDialectsAsync(GetSpeechandtextanalyticsSentimentDialectsRequest request, final AsyncApiCallback<EntityListing> callback) {
    try {
      final SettableFuture<EntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EntityListing>() {}, new AsyncApiCallback<ApiResponse<EntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics sentiment supported dialects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EntityListing>> getSpeechandtextanalyticsSentimentDialectsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EntityListing>() {}, new AsyncApiCallback<ApiResponse<EntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SentimentFeedbackEntityListing> getSpeechandtextanalyticsSentimentfeedbackAsync(GetSpeechandtextanalyticsSentimentfeedbackRequest request, final AsyncApiCallback<SentimentFeedbackEntityListing> callback) {
    try {
      final SettableFuture<SentimentFeedbackEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SentimentFeedbackEntityListing>() {}, new AsyncApiCallback<ApiResponse<SentimentFeedbackEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SentimentFeedbackEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SentimentFeedbackEntityListing>> getSpeechandtextanalyticsSentimentfeedbackAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SentimentFeedbackEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<SentimentFeedbackEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SentimentFeedbackEntityListing>() {}, new AsyncApiCallback<ApiResponse<SentimentFeedbackEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<SentimentFeedbackEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SentimentFeedbackEntityListing> response = (ApiResponse<SentimentFeedbackEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SentimentFeedbackEntityListing> response = (ApiResponse<SentimentFeedbackEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SpeechTextAnalyticsSettingsResponse> getSpeechandtextanalyticsSettingsAsync(GetSpeechandtextanalyticsSettingsRequest request, final AsyncApiCallback<SpeechTextAnalyticsSettingsResponse> callback) {
    try {
      final SettableFuture<SpeechTextAnalyticsSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SpeechTextAnalyticsSettingsResponse>> getSpeechandtextanalyticsSettingsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SpeechTextAnalyticsSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics topic by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Topic> getSpeechandtextanalyticsTopicAsync(GetSpeechandtextanalyticsTopicRequest request, final AsyncApiCallback<Topic> callback) {
    try {
      final SettableFuture<Topic> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics topic by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Topic>> getSpeechandtextanalyticsTopicAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<Topic>> callback) {
    try {
      final SettableFuture<ApiResponse<Topic>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics topics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TopicsEntityListing> getSpeechandtextanalyticsTopicsAsync(GetSpeechandtextanalyticsTopicsRequest request, final AsyncApiCallback<TopicsEntityListing> callback) {
    try {
      final SettableFuture<TopicsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TopicsEntityListing>() {}, new AsyncApiCallback<ApiResponse<TopicsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TopicsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of Speech & Text Analytics topics
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TopicsEntityListing>> getSpeechandtextanalyticsTopicsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TopicsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<TopicsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TopicsEntityListing>() {}, new AsyncApiCallback<ApiResponse<TopicsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<TopicsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicsEntityListing> response = (ApiResponse<TopicsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicsEntityListing> response = (ApiResponse<TopicsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of supported Speech & Text Analytics topics dialects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<EntityListing> getSpeechandtextanalyticsTopicsDialectsAsync(GetSpeechandtextanalyticsTopicsDialectsRequest request, final AsyncApiCallback<EntityListing> callback) {
    try {
      final SettableFuture<EntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<EntityListing>() {}, new AsyncApiCallback<ApiResponse<EntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of supported Speech & Text Analytics topics dialects
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<EntityListing>> getSpeechandtextanalyticsTopicsDialectsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<EntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<EntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<EntityListing>() {}, new AsyncApiCallback<ApiResponse<EntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<EntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the Speech & Text Analytics general topics for a given dialect
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GeneralTopicsEntityListing> getSpeechandtextanalyticsTopicsGeneralAsync(GetSpeechandtextanalyticsTopicsGeneralRequest request, final AsyncApiCallback<GeneralTopicsEntityListing> callback) {
    try {
      final SettableFuture<GeneralTopicsEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GeneralTopicsEntityListing>() {}, new AsyncApiCallback<ApiResponse<GeneralTopicsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralTopicsEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the Speech & Text Analytics general topics for a given dialect
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GeneralTopicsEntityListing>> getSpeechandtextanalyticsTopicsGeneralAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<GeneralTopicsEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<GeneralTopicsEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GeneralTopicsEntityListing>() {}, new AsyncApiCallback<ApiResponse<GeneralTopicsEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralTopicsEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralTopicsEntityListing> response = (ApiResponse<GeneralTopicsEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralTopicsEntityListing> response = (ApiResponse<GeneralTopicsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of general topics from the org and the system with their current status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UnifiedGeneralTopicEntityListing> getSpeechandtextanalyticsTopicsGeneralStatusAsync(GetSpeechandtextanalyticsTopicsGeneralStatusRequest request, final AsyncApiCallback<UnifiedGeneralTopicEntityListing> callback) {
    try {
      final SettableFuture<UnifiedGeneralTopicEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UnifiedGeneralTopicEntityListing>() {}, new AsyncApiCallback<ApiResponse<UnifiedGeneralTopicEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedGeneralTopicEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get the list of general topics from the org and the system with their current status
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UnifiedGeneralTopicEntityListing>> getSpeechandtextanalyticsTopicsGeneralStatusAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<UnifiedGeneralTopicEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<UnifiedGeneralTopicEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UnifiedGeneralTopicEntityListing>() {}, new AsyncApiCallback<ApiResponse<UnifiedGeneralTopicEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<UnifiedGeneralTopicEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedGeneralTopicEntityListing> response = (ApiResponse<UnifiedGeneralTopicEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UnifiedGeneralTopicEntityListing> response = (ApiResponse<UnifiedGeneralTopicEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics publish topics job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TopicJob> getSpeechandtextanalyticsTopicsPublishjobAsync(GetSpeechandtextanalyticsTopicsPublishjobRequest request, final AsyncApiCallback<TopicJob> callback) {
    try {
      final SettableFuture<TopicJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TopicJob>() {}, new AsyncApiCallback<ApiResponse<TopicJob>>() {
        @Override
        public void onCompleted(ApiResponse<TopicJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics publish topics job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TopicJob>> getSpeechandtextanalyticsTopicsPublishjobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TopicJob>> callback) {
    try {
      final SettableFuture<ApiResponse<TopicJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TopicJob>() {}, new AsyncApiCallback<ApiResponse<TopicJob>>() {
        @Override
        public void onCompleted(ApiResponse<TopicJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics test topics phrase job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TestTopicPhraseJob> getSpeechandtextanalyticsTopicsTestphraseJobAsync(GetSpeechandtextanalyticsTopicsTestphraseJobRequest request, final AsyncApiCallback<TestTopicPhraseJob> callback) {
    try {
      final SettableFuture<TestTopicPhraseJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TestTopicPhraseJob>() {}, new AsyncApiCallback<ApiResponse<TestTopicPhraseJob>>() {
        @Override
        public void onCompleted(ApiResponse<TestTopicPhraseJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a Speech & Text Analytics test topics phrase job by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TestTopicPhraseJob>> getSpeechandtextanalyticsTopicsTestphraseJobAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TestTopicPhraseJob>> callback) {
    try {
      final SettableFuture<ApiResponse<TestTopicPhraseJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TestTopicPhraseJob>() {}, new AsyncApiCallback<ApiResponse<TestTopicPhraseJob>>() {
        @Override
        public void onCompleted(ApiResponse<TestTopicPhraseJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TestTopicPhraseJob> response = (ApiResponse<TestTopicPhraseJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TestTopicPhraseJob> response = (ApiResponse<TestTopicPhraseJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Translate a single interaction recording (or an email conversation)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<CommunicationTranslationList> getSpeechandtextanalyticsTranslationsLanguageConversationAsync(GetSpeechandtextanalyticsTranslationsLanguageConversationRequest request, final AsyncApiCallback<CommunicationTranslationList> callback) {
    try {
      final SettableFuture<CommunicationTranslationList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<CommunicationTranslationList>() {}, new AsyncApiCallback<ApiResponse<CommunicationTranslationList>>() {
        @Override
        public void onCompleted(ApiResponse<CommunicationTranslationList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Translate a single interaction recording (or an email conversation)
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<CommunicationTranslationList>> getSpeechandtextanalyticsTranslationsLanguageConversationAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<CommunicationTranslationList>> callback) {
    try {
      final SettableFuture<ApiResponse<CommunicationTranslationList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<CommunicationTranslationList>() {}, new AsyncApiCallback<ApiResponse<CommunicationTranslationList>>() {
        @Override
        public void onCompleted(ApiResponse<CommunicationTranslationList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<CommunicationTranslationList> response = (ApiResponse<CommunicationTranslationList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<CommunicationTranslationList> response = (ApiResponse<CommunicationTranslationList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get supported translation languages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TranslateSupportedLanguageList> getSpeechandtextanalyticsTranslationsLanguagesAsync(GetSpeechandtextanalyticsTranslationsLanguagesRequest request, final AsyncApiCallback<TranslateSupportedLanguageList> callback) {
    try {
      final SettableFuture<TranslateSupportedLanguageList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TranslateSupportedLanguageList>() {}, new AsyncApiCallback<ApiResponse<TranslateSupportedLanguageList>>() {
        @Override
        public void onCompleted(ApiResponse<TranslateSupportedLanguageList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get supported translation languages
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TranslateSupportedLanguageList>> getSpeechandtextanalyticsTranslationsLanguagesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TranslateSupportedLanguageList>> callback) {
    try {
      final SettableFuture<ApiResponse<TranslateSupportedLanguageList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TranslateSupportedLanguageList>() {}, new AsyncApiCallback<ApiResponse<TranslateSupportedLanguageList>>() {
        @Override
        public void onCompleted(ApiResponse<TranslateSupportedLanguageList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TranslateSupportedLanguageList> response = (ApiResponse<TranslateSupportedLanguageList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TranslateSupportedLanguageList> response = (ApiResponse<TranslateSupportedLanguageList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SpeechTextAnalyticsSettingsResponse> patchSpeechandtextanalyticsSettingsAsync(PatchSpeechandtextanalyticsSettingsRequest request, final AsyncApiCallback<SpeechTextAnalyticsSettingsResponse> callback) {
    try {
      final SettableFuture<SpeechTextAnalyticsSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Patch Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SpeechTextAnalyticsSettingsResponse>> patchSpeechandtextanalyticsSettingsAsync(ApiRequest<SpeechTextAnalyticsSettingsRequest> request, final AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SpeechTextAnalyticsSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<StaCategory> postSpeechandtextanalyticsCategoriesAsync(PostSpeechandtextanalyticsCategoriesRequest request, final AsyncApiCallback<StaCategory> callback) {
    try {
      final SettableFuture<StaCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics category
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<StaCategory>> postSpeechandtextanalyticsCategoriesAsync(ApiRequest<CategoryRequest> request, final AsyncApiCallback<ApiResponse<StaCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<StaCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Speech & Text Analytics DictionaryFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DictionaryFeedback> postSpeechandtextanalyticsDictionaryfeedbackAsync(PostSpeechandtextanalyticsDictionaryfeedbackRequest request, final AsyncApiCallback<DictionaryFeedback> callback) {
    try {
      final SettableFuture<DictionaryFeedback> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Speech & Text Analytics DictionaryFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DictionaryFeedback>> postSpeechandtextanalyticsDictionaryfeedbackAsync(ApiRequest<DictionaryFeedback> request, final AsyncApiCallback<ApiResponse<DictionaryFeedback>> callback) {
    try {
      final SettableFuture<ApiResponse<DictionaryFeedback>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Program> postSpeechandtextanalyticsProgramsAsync(PostSpeechandtextanalyticsProgramsRequest request, final AsyncApiCallback<Program> callback) {
    try {
      final SettableFuture<Program> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Program>> postSpeechandtextanalyticsProgramsAsync(ApiRequest<ProgramRequest> request, final AsyncApiCallback<ApiResponse<Program>> callback) {
    try {
      final SettableFuture<ApiResponse<Program>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics general program job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<GeneralProgramJob> postSpeechandtextanalyticsProgramsGeneralJobsAsync(PostSpeechandtextanalyticsProgramsGeneralJobsRequest request, final AsyncApiCallback<GeneralProgramJob> callback) {
    try {
      final SettableFuture<GeneralProgramJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<GeneralProgramJob>() {}, new AsyncApiCallback<ApiResponse<GeneralProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralProgramJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics general program job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<GeneralProgramJob>> postSpeechandtextanalyticsProgramsGeneralJobsAsync(ApiRequest<GeneralProgramJobRequest> request, final AsyncApiCallback<ApiResponse<GeneralProgramJob>> callback) {
    try {
      final SettableFuture<ApiResponse<GeneralProgramJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<GeneralProgramJob>() {}, new AsyncApiCallback<ApiResponse<GeneralProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<GeneralProgramJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<GeneralProgramJob> response = (ApiResponse<GeneralProgramJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish programs job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramJob> postSpeechandtextanalyticsProgramsPublishjobsAsync(PostSpeechandtextanalyticsProgramsPublishjobsRequest request, final AsyncApiCallback<ProgramJob> callback) {
    try {
      final SettableFuture<ProgramJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramJob>() {}, new AsyncApiCallback<ApiResponse<ProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish programs job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramJob>> postSpeechandtextanalyticsProgramsPublishjobsAsync(ApiRequest<ProgramJobRequest> request, final AsyncApiCallback<ApiResponse<ProgramJob>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramJob>() {}, new AsyncApiCallback<ApiResponse<ProgramJob>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramJob> response = (ApiResponse<ProgramJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SentimentFeedback> postSpeechandtextanalyticsSentimentfeedbackAsync(PostSpeechandtextanalyticsSentimentfeedbackRequest request, final AsyncApiCallback<SentimentFeedback> callback) {
    try {
      final SettableFuture<SentimentFeedback> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SentimentFeedback>() {}, new AsyncApiCallback<ApiResponse<SentimentFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<SentimentFeedback> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a Speech & Text Analytics SentimentFeedback
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SentimentFeedback>> postSpeechandtextanalyticsSentimentfeedbackAsync(ApiRequest<SentimentFeedback> request, final AsyncApiCallback<ApiResponse<SentimentFeedback>> callback) {
    try {
      final SettableFuture<ApiResponse<SentimentFeedback>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SentimentFeedback>() {}, new AsyncApiCallback<ApiResponse<SentimentFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<SentimentFeedback> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SentimentFeedback> response = (ApiResponse<SentimentFeedback>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SentimentFeedback> response = (ApiResponse<SentimentFeedback>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics topic
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Topic> postSpeechandtextanalyticsTopicsAsync(PostSpeechandtextanalyticsTopicsRequest request, final AsyncApiCallback<Topic> callback) {
    try {
      final SettableFuture<Topic> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics topic
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Topic>> postSpeechandtextanalyticsTopicsAsync(ApiRequest<TopicRequest> request, final AsyncApiCallback<ApiResponse<Topic>> callback) {
    try {
      final SettableFuture<ApiResponse<Topic>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish topics job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TopicJob> postSpeechandtextanalyticsTopicsPublishjobsAsync(PostSpeechandtextanalyticsTopicsPublishjobsRequest request, final AsyncApiCallback<TopicJob> callback) {
    try {
      final SettableFuture<TopicJob> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TopicJob>() {}, new AsyncApiCallback<ApiResponse<TopicJob>>() {
        @Override
        public void onCompleted(ApiResponse<TopicJob> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish topics job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TopicJob>> postSpeechandtextanalyticsTopicsPublishjobsAsync(ApiRequest<TopicJobRequest> request, final AsyncApiCallback<ApiResponse<TopicJob>> callback) {
    try {
      final SettableFuture<ApiResponse<TopicJob>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TopicJob>() {}, new AsyncApiCallback<ApiResponse<TopicJob>>() {
        @Override
        public void onCompleted(ApiResponse<TopicJob> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TopicJob> response = (ApiResponse<TopicJob>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish topics job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TestTopicPhraseJobs> postSpeechandtextanalyticsTopicsTestphraseJobsAsync(PostSpeechandtextanalyticsTopicsTestphraseJobsRequest request, final AsyncApiCallback<TestTopicPhraseJobs> callback) {
    try {
      final SettableFuture<TestTopicPhraseJobs> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TestTopicPhraseJobs>() {}, new AsyncApiCallback<ApiResponse<TestTopicPhraseJobs>>() {
        @Override
        public void onCompleted(ApiResponse<TestTopicPhraseJobs> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create new Speech & Text Analytics publish topics job
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TestTopicPhraseJobs>> postSpeechandtextanalyticsTopicsTestphraseJobsAsync(ApiRequest<TestTopicPhraseJobRequest> request, final AsyncApiCallback<ApiResponse<TestTopicPhraseJobs>> callback) {
    try {
      final SettableFuture<ApiResponse<TestTopicPhraseJobs>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TestTopicPhraseJobs>() {}, new AsyncApiCallback<ApiResponse<TestTopicPhraseJobs>>() {
        @Override
        public void onCompleted(ApiResponse<TestTopicPhraseJobs> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TestTopicPhraseJobs> response = (ApiResponse<TestTopicPhraseJobs>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TestTopicPhraseJobs> response = (ApiResponse<TestTopicPhraseJobs>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<JsonSearchResponse> postSpeechandtextanalyticsTranscriptsSearchAsync(PostSpeechandtextanalyticsTranscriptsSearchRequest request, final AsyncApiCallback<JsonSearchResponse> callback) {
    try {
      final SettableFuture<JsonSearchResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<JsonSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSearchResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Search resources.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<JsonSearchResponse>> postSpeechandtextanalyticsTranscriptsSearchAsync(ApiRequest<TranscriptSearchRequest> request, final AsyncApiCallback<ApiResponse<JsonSearchResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<JsonSearchResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<JsonSearchResponse>() {}, new AsyncApiCallback<ApiResponse<JsonSearchResponse>>() {
        @Override
        public void onCompleted(ApiResponse<JsonSearchResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<JsonSearchResponse> response = (ApiResponse<JsonSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Speech & Text Analytics category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<StaCategory> putSpeechandtextanalyticsCategoryAsync(PutSpeechandtextanalyticsCategoryRequest request, final AsyncApiCallback<StaCategory> callback) {
    try {
      final SettableFuture<StaCategory> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a Speech & Text Analytics category by ID
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<StaCategory>> putSpeechandtextanalyticsCategoryAsync(ApiRequest<CategoryRequest> request, final AsyncApiCallback<ApiResponse<StaCategory>> callback) {
    try {
      final SettableFuture<ApiResponse<StaCategory>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<StaCategory>() {}, new AsyncApiCallback<ApiResponse<StaCategory>>() {
        @Override
        public void onCompleted(ApiResponse<StaCategory> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<StaCategory> response = (ApiResponse<StaCategory>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics dictionary feedback by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<DictionaryFeedback> putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(PutSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdRequest request, final AsyncApiCallback<DictionaryFeedback> callback) {
    try {
      final SettableFuture<DictionaryFeedback> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics dictionary feedback by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<DictionaryFeedback>> putSpeechandtextanalyticsDictionaryfeedbackDictionaryFeedbackIdAsync(ApiRequest<DictionaryFeedback> request, final AsyncApiCallback<ApiResponse<DictionaryFeedback>> callback) {
    try {
      final SettableFuture<ApiResponse<DictionaryFeedback>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<DictionaryFeedback>() {}, new AsyncApiCallback<ApiResponse<DictionaryFeedback>>() {
        @Override
        public void onCompleted(ApiResponse<DictionaryFeedback> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<DictionaryFeedback> response = (ApiResponse<DictionaryFeedback>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Program> putSpeechandtextanalyticsProgramAsync(PutSpeechandtextanalyticsProgramRequest request, final AsyncApiCallback<Program> callback) {
    try {
      final SettableFuture<Program> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Program>> putSpeechandtextanalyticsProgramAsync(ApiRequest<ProgramRequest> request, final AsyncApiCallback<ApiResponse<Program>> callback) {
    try {
      final SettableFuture<ApiResponse<Program>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Program>() {}, new AsyncApiCallback<ApiResponse<Program>>() {
        @Override
        public void onCompleted(ApiResponse<Program> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Program> response = (ApiResponse<Program>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set Speech & Text Analytics program mappings to queues and flows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramMappings> putSpeechandtextanalyticsProgramMappingsAsync(PutSpeechandtextanalyticsProgramMappingsRequest request, final AsyncApiCallback<ProgramMappings> callback) {
    try {
      final SettableFuture<ProgramMappings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramMappings>() {}, new AsyncApiCallback<ApiResponse<ProgramMappings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramMappings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Set Speech & Text Analytics program mappings to queues and flows
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramMappings>> putSpeechandtextanalyticsProgramMappingsAsync(ApiRequest<ProgramMappingsRequest> request, final AsyncApiCallback<ApiResponse<ProgramMappings>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramMappings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramMappings>() {}, new AsyncApiCallback<ApiResponse<ProgramMappings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramMappings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramMappings> response = (ApiResponse<ProgramMappings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update AI Insights settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramInsightsSettings> putSpeechandtextanalyticsProgramSettingsInsightsAsync(PutSpeechandtextanalyticsProgramSettingsInsightsRequest request, final AsyncApiCallback<ProgramInsightsSettings> callback) {
    try {
      final SettableFuture<ProgramInsightsSettings> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramInsightsSettings>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettings> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update AI Insights settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramInsightsSettings>> putSpeechandtextanalyticsProgramSettingsInsightsAsync(ApiRequest<InsightsSettingsRequest> request, final AsyncApiCallback<ApiResponse<ProgramInsightsSettings>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramInsightsSettings>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramInsightsSettings>() {}, new AsyncApiCallback<ApiResponse<ProgramInsightsSettings>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramInsightsSettings> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettings> response = (ApiResponse<ProgramInsightsSettings>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramInsightsSettings> response = (ApiResponse<ProgramInsightsSettings>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update transcription engine settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ProgramTranscriptionEngines> putSpeechandtextanalyticsProgramTranscriptionenginesAsync(PutSpeechandtextanalyticsProgramTranscriptionenginesRequest request, final AsyncApiCallback<ProgramTranscriptionEngines> callback) {
    try {
      final SettableFuture<ProgramTranscriptionEngines> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ProgramTranscriptionEngines>() {}, new AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramTranscriptionEngines> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update transcription engine settings of a program
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ProgramTranscriptionEngines>> putSpeechandtextanalyticsProgramTranscriptionenginesAsync(ApiRequest<TranscriptionEnginesRequest> request, final AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>> callback) {
    try {
      final SettableFuture<ApiResponse<ProgramTranscriptionEngines>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ProgramTranscriptionEngines>() {}, new AsyncApiCallback<ApiResponse<ProgramTranscriptionEngines>>() {
        @Override
        public void onCompleted(ApiResponse<ProgramTranscriptionEngines> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramTranscriptionEngines> response = (ApiResponse<ProgramTranscriptionEngines>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ProgramTranscriptionEngines> response = (ApiResponse<ProgramTranscriptionEngines>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<SpeechTextAnalyticsSettingsResponse> putSpeechandtextanalyticsSettingsAsync(PutSpeechandtextanalyticsSettingsRequest request, final AsyncApiCallback<SpeechTextAnalyticsSettingsResponse> callback) {
    try {
      final SettableFuture<SpeechTextAnalyticsSettingsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update Speech And Text Analytics Settings
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<SpeechTextAnalyticsSettingsResponse>> putSpeechandtextanalyticsSettingsAsync(ApiRequest<SpeechTextAnalyticsSettingsRequest> request, final AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<SpeechTextAnalyticsSettingsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<SpeechTextAnalyticsSettingsResponse>() {}, new AsyncApiCallback<ApiResponse<SpeechTextAnalyticsSettingsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<SpeechTextAnalyticsSettingsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<SpeechTextAnalyticsSettingsResponse> response = (ApiResponse<SpeechTextAnalyticsSettingsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics topic
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<Topic> putSpeechandtextanalyticsTopicAsync(PutSpeechandtextanalyticsTopicRequest request, final AsyncApiCallback<Topic> callback) {
    try {
      final SettableFuture<Topic> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update existing Speech & Text Analytics topic
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<Topic>> putSpeechandtextanalyticsTopicAsync(ApiRequest<TopicRequest> request, final AsyncApiCallback<ApiResponse<Topic>> callback) {
    try {
      final SettableFuture<ApiResponse<Topic>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<Topic>() {}, new AsyncApiCallback<ApiResponse<Topic>>() {
        @Override
        public void onCompleted(ApiResponse<Topic> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<Topic> response = (ApiResponse<Topic>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
