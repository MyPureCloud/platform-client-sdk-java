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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingReportIdMetadataRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingReportformatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryLatestRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingScheduleHistoryRunIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingTimeperiodsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationDetailsPropertiesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsConversationsDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingScheduleRunreportRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAnalyticsReportingScheduleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AnalyticsApiAsync {
  private final ApiClient pcapiClient;

  public AnalyticsApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<String> deleteAnalyticsReportingScheduleAsync(DeleteAnalyticsReportingScheduleRequest request, AsyncApiCallback<String> callback) {
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
   * Delete a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<String>> deleteAnalyticsReportingScheduleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
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
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversation> getAnalyticsConversationDetailsAsync(GetAnalyticsConversationDetailsRequest request, AsyncApiCallback<AnalyticsConversation> callback) {
    try {
      SettableFuture<AnalyticsConversation> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversation>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversation> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversation>> getAnalyticsConversationDetailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AnalyticsConversation>> callback) {
    try {
      SettableFuture<ApiResponse<AnalyticsConversation>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversation>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversation>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversation> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportMetaDataEntityListing> getAnalyticsReportingMetadataAsync(GetAnalyticsReportingMetadataRequest request, AsyncApiCallback<ReportMetaDataEntityListing> callback) {
    try {
      SettableFuture<ReportMetaDataEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaDataEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportMetaDataEntityListing>> getAnalyticsReportingMetadataAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ReportMetaDataEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportMetaDataEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaDataEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportMetaData> getAnalyticsReportingReportIdMetadataAsync(GetAnalyticsReportingReportIdMetadataRequest request, AsyncApiCallback<ReportMetaData> callback) {
    try {
      SettableFuture<ReportMetaData> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportMetaData>() {}, new AsyncApiCallback<ApiResponse<ReportMetaData>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaData> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportMetaData>> getAnalyticsReportingReportIdMetadataAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportMetaData>> callback) {
    try {
      SettableFuture<ApiResponse<ReportMetaData>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportMetaData>() {}, new AsyncApiCallback<ApiResponse<ReportMetaData>>() {
        @Override
        public void onCompleted(ApiResponse<ReportMetaData> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> getAnalyticsReportingReportformatsAsync(GetAnalyticsReportingReportformatsRequest request, AsyncApiCallback<List<String>> callback) {
    try {
      SettableFuture<List<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingReportformatsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> getAnalyticsReportingScheduleAsync(GetAnalyticsReportingScheduleRequest request, AsyncApiCallback<ReportSchedule> callback) {
    try {
      SettableFuture<ReportSchedule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> getAnalyticsReportingScheduleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryAsync(GetAnalyticsReportingScheduleHistoryRequest request, AsyncApiCallback<ReportRunEntryEntityDomainListing> callback) {
    try {
      SettableFuture<ReportRunEntryEntityDomainListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntryEntityDomainListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntryEntityDomainListing>> getAnalyticsReportingScheduleHistoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>> callback) {
    try {
      SettableFuture<ApiResponse<ReportRunEntryEntityDomainListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntryEntityDomainListing>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntryEntityDomainListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestAsync(GetAnalyticsReportingScheduleHistoryLatestRequest request, AsyncApiCallback<ReportRunEntry> callback) {
    try {
      SettableFuture<ReportRunEntry> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryLatestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    try {
      SettableFuture<ApiResponse<ReportRunEntry>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdAsync(GetAnalyticsReportingScheduleHistoryRunIdRequest request, AsyncApiCallback<ReportRunEntry> callback) {
    try {
      SettableFuture<ReportRunEntry> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryRunIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    try {
      SettableFuture<ApiResponse<ReportRunEntry>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportRunEntry>() {}, new AsyncApiCallback<ApiResponse<ReportRunEntry>>() {
        @Override
        public void onCompleted(ApiResponse<ReportRunEntry> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportScheduleEntityListing> getAnalyticsReportingSchedulesAsync(GetAnalyticsReportingSchedulesRequest request, AsyncApiCallback<ReportScheduleEntityListing> callback) {
    try {
      SettableFuture<ReportScheduleEntityListing> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportScheduleEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportScheduleEntityListing>> getAnalyticsReportingSchedulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>> callback) {
    try {
      SettableFuture<ApiResponse<ReportScheduleEntityListing>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportScheduleEntityListing>() {}, new AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<ReportScheduleEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<String>> getAnalyticsReportingTimeperiodsAsync(GetAnalyticsReportingTimeperiodsRequest request, AsyncApiCallback<List<String>> callback) {
    try {
      SettableFuture<List<String>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingTimeperiodsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    try {
      SettableFuture<ApiResponse<List<String>>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<String>>() {}, new AsyncApiCallback<ApiResponse<List<String>>>() {
        @Override
        public void onCompleted(ApiResponse<List<String>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesAsync(PostAnalyticsConversationDetailsPropertiesRequest request, AsyncApiCallback<PropertyIndexRequest> callback) {
    try {
      SettableFuture<PropertyIndexRequest> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PropertyIndexRequest>> postAnalyticsConversationDetailsPropertiesAsync(ApiRequest<PropertyIndexRequest> request, AsyncApiCallback<ApiResponse<PropertyIndexRequest>> callback) {
    try {
      SettableFuture<ApiResponse<PropertyIndexRequest>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PropertyIndexRequest>() {}, new AsyncApiCallback<ApiResponse<PropertyIndexRequest>>() {
        @Override
        public void onCompleted(ApiResponse<PropertyIndexRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryAsync(PostAnalyticsConversationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    try {
      SettableFuture<AggregateQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsConversationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AggregateQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryAsync(PostAnalyticsConversationsDetailsQueryRequest request, AsyncApiCallback<AnalyticsConversationQueryResponse> callback) {
    try {
      SettableFuture<AnalyticsConversationQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsConversationQueryResponse>> postAnalyticsConversationsDetailsQueryAsync(ApiRequest<ConversationQuery> request, AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AnalyticsConversationQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsConversationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsConversationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryAsync(PostAnalyticsEvaluationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    try {
      SettableFuture<AggregateQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsEvaluationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AggregateQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AggregateQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AggregateQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AggregateQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQueryAsync(PostAnalyticsQueuesObservationsQueryRequest request, AsyncApiCallback<QualifierMappingObservationQueryResponse> callback) {
    try {
      SettableFuture<QualifierMappingObservationQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualifierMappingObservationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<QualifierMappingObservationQueryResponse>> postAnalyticsQueuesObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<QualifierMappingObservationQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<QualifierMappingObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<QualifierMappingObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<RunNowResponse> postAnalyticsReportingScheduleRunreportAsync(PostAnalyticsReportingScheduleRunreportRequest request, AsyncApiCallback<RunNowResponse> callback) {
    try {
      SettableFuture<RunNowResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<RunNowResponse>() {}, new AsyncApiCallback<ApiResponse<RunNowResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RunNowResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<RunNowResponse>> postAnalyticsReportingScheduleRunreportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RunNowResponse>> callback) {
    try {
      SettableFuture<ApiResponse<RunNowResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<RunNowResponse>() {}, new AsyncApiCallback<ApiResponse<RunNowResponse>>() {
        @Override
        public void onCompleted(ApiResponse<RunNowResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> postAnalyticsReportingSchedulesAsync(PostAnalyticsReportingSchedulesRequest request, AsyncApiCallback<ReportSchedule> callback) {
    try {
      SettableFuture<ReportSchedule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> postAnalyticsReportingSchedulesAsync(ApiRequest<ReportSchedule> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryAsync(PostAnalyticsUsersAggregatesQueryRequest request, AsyncApiCallback<PresenceQueryResponse> callback) {
    try {
      SettableFuture<PresenceQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {}, new AsyncApiCallback<ApiResponse<PresenceQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<PresenceQueryResponse>> postAnalyticsUsersAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<PresenceQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<PresenceQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<PresenceQueryResponse>() {}, new AsyncApiCallback<ApiResponse<PresenceQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<PresenceQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryAsync(PostAnalyticsUsersDetailsQueryRequest request, AsyncApiCallback<AnalyticsUserDetailsQueryResponse> callback) {
    try {
      SettableFuture<AnalyticsUserDetailsQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user details
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AnalyticsUserDetailsQueryResponse>> postAnalyticsUsersDetailsQueryAsync(ApiRequest<UserDetailsQuery> request, AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<AnalyticsUserDetailsQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, new AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AnalyticsUserDetailsQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ObservationQueryResponse> postAnalyticsUsersObservationsQueryAsync(PostAnalyticsUsersObservationsQueryRequest request, AsyncApiCallback<ObservationQueryResponse> callback) {
    try {
      SettableFuture<ObservationQueryResponse> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ObservationQueryResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Query for user observations
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ObservationQueryResponse>> postAnalyticsUsersObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<ObservationQueryResponse>> callback) {
    try {
      SettableFuture<ApiResponse<ObservationQueryResponse>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ObservationQueryResponse>() {}, new AsyncApiCallback<ApiResponse<ObservationQueryResponse>>() {
        @Override
        public void onCompleted(ApiResponse<ObservationQueryResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ReportSchedule> putAnalyticsReportingScheduleAsync(PutAnalyticsReportingScheduleRequest request, AsyncApiCallback<ReportSchedule> callback) {
    try {
      SettableFuture<ReportSchedule> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Update a scheduled report job.
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ReportSchedule>> putAnalyticsReportingScheduleAsync(ApiRequest<ReportSchedule> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    try {
      SettableFuture<ApiResponse<ReportSchedule>> future = SettableFuture.create();
      boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ReportSchedule>() {}, new AsyncApiCallback<ApiResponse<ReportSchedule>>() {
        @Override
        public void onCompleted(ApiResponse<ReportSchedule> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
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
