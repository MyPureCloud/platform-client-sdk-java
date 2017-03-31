package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

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
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteAnalyticsReportingScheduleAsync(DeleteAnalyticsReportingScheduleRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteAnalyticsReportingScheduleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsConversation> getAnalyticsConversationDetailsAsync(GetAnalyticsConversationDetailsRequest request, AsyncApiCallback<AnalyticsConversation> callback) {
    return pcapiClient.<AnalyticsConversation>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {}, callback);
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsConversation>> getAnalyticsConversationDetailsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AnalyticsConversation>> callback) {
    return pcapiClient.<AnalyticsConversation>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsConversation>() {}, callback);
  }

  /**
   * Get list of reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportMetaDataEntityListing> getAnalyticsReportingMetadataAsync(GetAnalyticsReportingMetadataRequest request, AsyncApiCallback<ReportMetaDataEntityListing> callback) {
    return pcapiClient.<ReportMetaDataEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {}, callback);
  }

  /**
   * Get list of reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportMetaDataEntityListing>> getAnalyticsReportingMetadataAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportMetaDataEntityListing>> callback) {
    return pcapiClient.<ReportMetaDataEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ReportMetaDataEntityListing>() {}, callback);
  }

  /**
   * Get a reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportMetaData> getAnalyticsReportingReportIdMetadataAsync(GetAnalyticsReportingReportIdMetadataRequest request, AsyncApiCallback<ReportMetaData> callback) {
    return pcapiClient.<ReportMetaData>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportMetaData>() {}, callback);
  }

  /**
   * Get a reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportMetaData>> getAnalyticsReportingReportIdMetadataAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportMetaData>> callback) {
    return pcapiClient.<ReportMetaData>invokeAPIVerboseAsync(request, new TypeReference<ReportMetaData>() {}, callback);
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> getAnalyticsReportingReportformatsAsync(GetAnalyticsReportingReportformatsRequest request, AsyncApiCallback<List<String>> callback) {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingReportformatsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportSchedule> getAnalyticsReportingScheduleAsync(GetAnalyticsReportingScheduleRequest request, AsyncApiCallback<ReportSchedule> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, callback);
  }

  /**
   * Get a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportSchedule>> getAnalyticsReportingScheduleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIVerboseAsync(request, new TypeReference<ReportSchedule>() {}, callback);
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryAsync(GetAnalyticsReportingScheduleHistoryRequest request, AsyncApiCallback<ReportRunEntryEntityDomainListing> callback) {
    return pcapiClient.<ReportRunEntryEntityDomainListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {}, callback);
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportRunEntryEntityDomainListing>> getAnalyticsReportingScheduleHistoryAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntryEntityDomainListing>> callback) {
    return pcapiClient.<ReportRunEntryEntityDomainListing>invokeAPIVerboseAsync(request, new TypeReference<ReportRunEntryEntityDomainListing>() {}, callback);
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestAsync(GetAnalyticsReportingScheduleHistoryLatestRequest request, AsyncApiCallback<ReportRunEntry> callback) {
    return pcapiClient.<ReportRunEntry>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, callback);
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryLatestAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    return pcapiClient.<ReportRunEntry>invokeAPIVerboseAsync(request, new TypeReference<ReportRunEntry>() {}, callback);
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdAsync(GetAnalyticsReportingScheduleHistoryRunIdRequest request, AsyncApiCallback<ReportRunEntry> callback) {
    return pcapiClient.<ReportRunEntry>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {}, callback);
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportRunEntry>> getAnalyticsReportingScheduleHistoryRunIdAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportRunEntry>> callback) {
    return pcapiClient.<ReportRunEntry>invokeAPIVerboseAsync(request, new TypeReference<ReportRunEntry>() {}, callback);
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportScheduleEntityListing> getAnalyticsReportingSchedulesAsync(GetAnalyticsReportingSchedulesRequest request, AsyncApiCallback<ReportScheduleEntityListing> callback) {
    return pcapiClient.<ReportScheduleEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {}, callback);
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportScheduleEntityListing>> getAnalyticsReportingSchedulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ReportScheduleEntityListing>> callback) {
    return pcapiClient.<ReportScheduleEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ReportScheduleEntityListing>() {}, callback);
  }

  /**
   * Get a list of report time periods.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<String>> getAnalyticsReportingTimeperiodsAsync(GetAnalyticsReportingTimeperiodsRequest request, AsyncApiCallback<List<String>> callback) {
    return pcapiClient.<List<String>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Get a list of report time periods.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<String>>> getAnalyticsReportingTimeperiodsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<String>>> callback) {
    return pcapiClient.<List<String>>invokeAPIVerboseAsync(request, new TypeReference<List<String>>() {}, callback);
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesAsync(PostAnalyticsConversationDetailsPropertiesRequest request, AsyncApiCallback<PropertyIndexRequest> callback) {
    return pcapiClient.<PropertyIndexRequest>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {}, callback);
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PropertyIndexRequest>> postAnalyticsConversationDetailsPropertiesAsync(ApiRequest<PropertyIndexRequest> request, AsyncApiCallback<ApiResponse<PropertyIndexRequest>> callback) {
    return pcapiClient.<PropertyIndexRequest>invokeAPIVerboseAsync(request, new TypeReference<PropertyIndexRequest>() {}, callback);
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryAsync(PostAnalyticsConversationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsConversationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryAsync(PostAnalyticsConversationsDetailsQueryRequest request, AsyncApiCallback<AnalyticsConversationQueryResponse> callback) {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {}, callback);
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsConversationQueryResponse>> postAnalyticsConversationsDetailsQueryAsync(ApiRequest<ConversationQuery> request, AsyncApiCallback<ApiResponse<AnalyticsConversationQueryResponse>> callback) {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsConversationQueryResponse>() {}, callback);
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryAsync(PostAnalyticsEvaluationsAggregatesQueryRequest request, AsyncApiCallback<AggregateQueryResponse> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AggregateQueryResponse>> postAnalyticsEvaluationsAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<AggregateQueryResponse>> callback) {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AggregateQueryResponse>() {}, callback);
  }

  /**
   * Query for queue observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQueryAsync(PostAnalyticsQueuesObservationsQueryRequest request, AsyncApiCallback<QualifierMappingObservationQueryResponse> callback) {
    return pcapiClient.<QualifierMappingObservationQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {}, callback);
  }

  /**
   * Query for queue observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QualifierMappingObservationQueryResponse>> postAnalyticsQueuesObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<QualifierMappingObservationQueryResponse>> callback) {
    return pcapiClient.<QualifierMappingObservationQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<QualifierMappingObservationQueryResponse>() {}, callback);
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RunNowResponse> postAnalyticsReportingScheduleRunreportAsync(PostAnalyticsReportingScheduleRunreportRequest request, AsyncApiCallback<RunNowResponse> callback) {
    return pcapiClient.<RunNowResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RunNowResponse>() {}, callback);
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RunNowResponse>> postAnalyticsReportingScheduleRunreportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RunNowResponse>> callback) {
    return pcapiClient.<RunNowResponse>invokeAPIVerboseAsync(request, new TypeReference<RunNowResponse>() {}, callback);
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportSchedule> postAnalyticsReportingSchedulesAsync(PostAnalyticsReportingSchedulesRequest request, AsyncApiCallback<ReportSchedule> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, callback);
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportSchedule>> postAnalyticsReportingSchedulesAsync(ApiRequest<ReportSchedule> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIVerboseAsync(request, new TypeReference<ReportSchedule>() {}, callback);
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryAsync(PostAnalyticsUsersAggregatesQueryRequest request, AsyncApiCallback<PresenceQueryResponse> callback) {
    return pcapiClient.<PresenceQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {}, callback);
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<PresenceQueryResponse>> postAnalyticsUsersAggregatesQueryAsync(ApiRequest<AggregationQuery> request, AsyncApiCallback<ApiResponse<PresenceQueryResponse>> callback) {
    return pcapiClient.<PresenceQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<PresenceQueryResponse>() {}, callback);
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryAsync(PostAnalyticsUsersDetailsQueryRequest request, AsyncApiCallback<AnalyticsUserDetailsQueryResponse> callback) {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, callback);
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AnalyticsUserDetailsQueryResponse>> postAnalyticsUsersDetailsQueryAsync(ApiRequest<UserDetailsQuery> request, AsyncApiCallback<ApiResponse<AnalyticsUserDetailsQueryResponse>> callback) {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {}, callback);
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ObservationQueryResponse> postAnalyticsUsersObservationsQueryAsync(PostAnalyticsUsersObservationsQueryRequest request, AsyncApiCallback<ObservationQueryResponse> callback) {
    return pcapiClient.<ObservationQueryResponse>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {}, callback);
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ObservationQueryResponse>> postAnalyticsUsersObservationsQueryAsync(ApiRequest<ObservationQuery> request, AsyncApiCallback<ApiResponse<ObservationQueryResponse>> callback) {
    return pcapiClient.<ObservationQueryResponse>invokeAPIVerboseAsync(request, new TypeReference<ObservationQueryResponse>() {}, callback);
  }

  /**
   * Update a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ReportSchedule> putAnalyticsReportingScheduleAsync(PutAnalyticsReportingScheduleRequest request, AsyncApiCallback<ReportSchedule> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ReportSchedule>() {}, callback);
  }

  /**
   * Update a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ReportSchedule>> putAnalyticsReportingScheduleAsync(ApiRequest<ReportSchedule> request, AsyncApiCallback<ApiResponse<ReportSchedule>> callback) {
    return pcapiClient.<ReportSchedule>invokeAPIVerboseAsync(request, new TypeReference<ReportSchedule>() {}, callback);
  }

}
