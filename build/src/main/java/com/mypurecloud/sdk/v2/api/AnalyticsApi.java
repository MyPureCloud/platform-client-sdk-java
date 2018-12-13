package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
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
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteAnalyticsReportingScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsConversationsDetailsRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsReportingExportsRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsFlowsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingExportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingScheduleRunreportRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsReportingSchedulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsSurveysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersDetailsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsUsersObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PutAnalyticsReportingScheduleRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnalyticsApi {
  private final ApiClient pcapiClient;

  public AnalyticsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
     deleteAnalyticsReportingSchedule(createDeleteAnalyticsReportingScheduleRequest(scheduleId));
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException {
    return deleteAnalyticsReportingSchedule(createDeleteAnalyticsReportingScheduleRequest(scheduleId).withHttpInfo());
  }

  private DeleteAnalyticsReportingScheduleRequest createDeleteAnalyticsReportingScheduleRequest(String scheduleId) {
    return DeleteAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteAnalyticsReportingSchedule(DeleteAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationDetails(String conversationId) throws IOException, ApiException {
    return  getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId));
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws IOException {
    return getAnalyticsConversationDetails(createGetAnalyticsConversationDetailsRequest(conversationId).withHttpInfo());
  }

  private GetAnalyticsConversationDetailsRequest createGetAnalyticsConversationDetailsRequest(String conversationId) {
    return GetAnalyticsConversationDetailsRequest.builder()
            .withConversationId(conversationId)
    
            .build();
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a conversation by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationsDetails(List<String> id) throws IOException, ApiException {
    return  getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id));
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param id Comma-separated conversation ids (optional)
   * @return AnalyticsConversation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationsDetailsWithHttpInfo(List<String> id) throws IOException {
    return getAnalyticsConversationsDetails(createGetAnalyticsConversationsDetailsRequest(id).withHttpInfo());
  }

  private GetAnalyticsConversationsDetailsRequest createGetAnalyticsConversationsDetailsRequest(List<String> id) {
    return GetAnalyticsConversationsDetailsRequest.builder()
            .withId(id)
    
            .build();
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return AnalyticsConversation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversation getAnalyticsConversationsDetails(GetAnalyticsConversationsDetailsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets multiple conversations by id
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationsDetails(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversation> response = (ApiResponse<AnalyticsConversation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all view export requests for a user
   * 
   * @return ReportingExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobListing getAnalyticsReportingExports() throws IOException, ApiException {
    return  getAnalyticsReportingExports(createGetAnalyticsReportingExportsRequest());
  }

  /**
   * Get all view export requests for a user
   * 
   * @return ReportingExportJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobListing> getAnalyticsReportingExportsWithHttpInfo() throws IOException {
    return getAnalyticsReportingExports(createGetAnalyticsReportingExportsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingExportsRequest createGetAnalyticsReportingExportsRequest() {
    return GetAnalyticsReportingExportsRequest.builder()
            .build();
  }

  /**
   * Get all view export requests for a user
   * 
   * @param request The request object
   * @return ReportingExportJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobListing getAnalyticsReportingExports(GetAnalyticsReportingExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingExportJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingExportJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all view export requests for a user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobListing> getAnalyticsReportingExports(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingExportJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobListing> response = (ApiResponse<ReportingExportJobListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(Integer pageNumber, Integer pageSize, String locale) throws IOException, ApiException {
    return  getAnalyticsReportingMetadata(createGetAnalyticsReportingMetadataRequest(pageNumber, pageSize, locale));
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadataWithHttpInfo(Integer pageNumber, Integer pageSize, String locale) throws IOException {
    return getAnalyticsReportingMetadata(createGetAnalyticsReportingMetadataRequest(pageNumber, pageSize, locale).withHttpInfo());
  }

  private GetAnalyticsReportingMetadataRequest createGetAnalyticsReportingMetadataRequest(Integer pageNumber, Integer pageSize, String locale) {
    return GetAnalyticsReportingMetadataRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withLocale(locale)
    
            .build();
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request The request object
   * @return ReportMetaDataEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(GetAnalyticsReportingMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportMetaDataEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportMetaDataEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaDataEntityListing> response = (ApiResponse<ReportMetaDataEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(String reportId, String locale) throws IOException, ApiException {
    return  getAnalyticsReportingReportIdMetadata(createGetAnalyticsReportingReportIdMetadataRequest(reportId, locale));
  }

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadataWithHttpInfo(String reportId, String locale) throws IOException {
    return getAnalyticsReportingReportIdMetadata(createGetAnalyticsReportingReportIdMetadataRequest(reportId, locale).withHttpInfo());
  }

  private GetAnalyticsReportingReportIdMetadataRequest createGetAnalyticsReportingReportIdMetadataRequest(String reportId, String locale) {
    return GetAnalyticsReportingReportIdMetadataRequest.builder()
            .withReportId(reportId)
    
            .withLocale(locale)
    
            .build();
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request The request object
   * @return ReportMetaData
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(GetAnalyticsReportingReportIdMetadataRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportMetaData> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportMetaData>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a reporting metadata.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadata(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportMetaData>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportMetaData> response = (ApiResponse<ReportMetaData>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingReportformats() throws IOException, ApiException {
    return  getAnalyticsReportingReportformats(createGetAnalyticsReportingReportformatsRequest());
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformatsWithHttpInfo() throws IOException {
    return getAnalyticsReportingReportformats(createGetAnalyticsReportingReportformatsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingReportformatsRequest createGetAnalyticsReportingReportformatsRequest() {
    return GetAnalyticsReportingReportformatsRequest.builder()
            .build();
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingReportformats(GetAnalyticsReportingReportformatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformats(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule getAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingSchedule(createGetAnalyticsReportingScheduleRequest(scheduleId));
  }

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException {
    return getAnalyticsReportingSchedule(createGetAnalyticsReportingScheduleRequest(scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleRequest createGetAnalyticsReportingScheduleRequest(String scheduleId) {
    return GetAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule getAnalyticsReportingSchedule(GetAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistory(createGetAnalyticsReportingScheduleHistoryRequest(scheduleId, pageNumber, pageSize));
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryWithHttpInfo(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException {
    return getAnalyticsReportingScheduleHistory(createGetAnalyticsReportingScheduleHistoryRequest(scheduleId, pageNumber, pageSize).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryRequest createGetAnalyticsReportingScheduleHistoryRequest(String scheduleId, Integer pageNumber, Integer pageSize) {
    return GetAnalyticsReportingScheduleHistoryRequest.builder()
            .withScheduleId(scheduleId)
    
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request The request object
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(GetAnalyticsReportingScheduleHistoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntryEntityDomainListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntryEntityDomainListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntryEntityDomainListing> response = (ApiResponse<ReportRunEntryEntityDomainListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistoryLatest(createGetAnalyticsReportingScheduleHistoryLatestRequest(scheduleId));
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestWithHttpInfo(String scheduleId) throws IOException {
    return getAnalyticsReportingScheduleHistoryLatest(createGetAnalyticsReportingScheduleHistoryLatestRequest(scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryLatestRequest createGetAnalyticsReportingScheduleHistoryLatestRequest(String scheduleId) {
    return GetAnalyticsReportingScheduleHistoryLatestRequest.builder()
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request The request object
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(GetAnalyticsReportingScheduleHistoryLatestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntry> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntry>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(String runId, String scheduleId) throws IOException, ApiException {
    return  getAnalyticsReportingScheduleHistoryRunId(createGetAnalyticsReportingScheduleHistoryRunIdRequest(runId, scheduleId));
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdWithHttpInfo(String runId, String scheduleId) throws IOException {
    return getAnalyticsReportingScheduleHistoryRunId(createGetAnalyticsReportingScheduleHistoryRunIdRequest(runId, scheduleId).withHttpInfo());
  }

  private GetAnalyticsReportingScheduleHistoryRunIdRequest createGetAnalyticsReportingScheduleHistoryRunIdRequest(String runId, String scheduleId) {
    return GetAnalyticsReportingScheduleHistoryRunIdRequest.builder()
            .withRunId(runId)
    
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request The request object
   * @return ReportRunEntry
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(GetAnalyticsReportingScheduleHistoryRunIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportRunEntry> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportRunEntry>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportRunEntry> response = (ApiResponse<ReportRunEntry>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getAnalyticsReportingSchedules(createGetAnalyticsReportingSchedulesRequest(pageNumber, pageSize));
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedulesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getAnalyticsReportingSchedules(createGetAnalyticsReportingSchedulesRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetAnalyticsReportingSchedulesRequest createGetAnalyticsReportingSchedulesRequest(Integer pageNumber, Integer pageSize) {
    return GetAnalyticsReportingSchedulesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request The request object
   * @return ReportScheduleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(GetAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportScheduleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportScheduleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportScheduleEntityListing> response = (ApiResponse<ReportScheduleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingTimeperiods() throws IOException, ApiException {
    return  getAnalyticsReportingTimeperiods(createGetAnalyticsReportingTimeperiodsRequest());
  }

  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiodsWithHttpInfo() throws IOException {
    return getAnalyticsReportingTimeperiods(createGetAnalyticsReportingTimeperiodsRequest().withHttpInfo());
  }

  private GetAnalyticsReportingTimeperiodsRequest createGetAnalyticsReportingTimeperiodsRequest() {
    return GetAnalyticsReportingTimeperiodsRequest.builder()
            .build();
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request The request object
   * @return List<String>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<String> getAnalyticsReportingTimeperiods(GetAnalyticsReportingTimeperiodsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<String>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<String>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of report time periods.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiods(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<String>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<String>> response = (ApiResponse<List<String>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(String conversationId, PropertyIndexRequest body) throws IOException, ApiException {
    return  postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body));
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesWithHttpInfo(String conversationId, PropertyIndexRequest body) throws IOException {
    return postAnalyticsConversationDetailsProperties(createPostAnalyticsConversationDetailsPropertiesRequest(conversationId, body).withHttpInfo());
  }

  private PostAnalyticsConversationDetailsPropertiesRequest createPostAnalyticsConversationDetailsPropertiesRequest(String conversationId, PropertyIndexRequest body) {
    return PostAnalyticsConversationDetailsPropertiesRequest.builder()
            .withConversationId(conversationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return PropertyIndexRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(PostAnalyticsConversationDetailsPropertiesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PropertyIndexRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Index conversation properties
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsProperties(ApiRequest<PropertyIndexRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PropertyIndexRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PropertyIndexRequest> response = (ApiResponse<PropertyIndexRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body));
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsConversationsAggregatesQuery(createPostAnalyticsConversationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsAggregatesQueryRequest createPostAnalyticsConversationsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsConversationsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(ConversationQuery body) throws IOException, ApiException {
    return  postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body));
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryWithHttpInfo(ConversationQuery body) throws IOException {
    return postAnalyticsConversationsDetailsQuery(createPostAnalyticsConversationsDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsConversationsDetailsQueryRequest createPostAnalyticsConversationsDetailsQueryRequest(ConversationQuery body) {
    return PostAnalyticsConversationsDetailsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(PostAnalyticsConversationsDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsConversationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for conversation details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(ApiRequest<ConversationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsConversationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsConversationQueryResponse> response = (ApiResponse<AnalyticsConversationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body));
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsEvaluationsAggregatesQueryRequest createPostAnalyticsEvaluationsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsEvaluationsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsFlowsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body));
  }

  /**
   * Query for flow aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsFlowsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsFlowsAggregatesQuery(createPostAnalyticsFlowsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsFlowsAggregatesQueryRequest createPostAnalyticsFlowsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsFlowsAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsFlowsAggregatesQuery(PostAnalyticsFlowsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsFlowsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualifierMappingObservationQueryResponse postAnalyticsQueuesObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body));
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException {
    return postAnalyticsQueuesObservationsQuery(createPostAnalyticsQueuesObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsQueuesObservationsQueryRequest createPostAnalyticsQueuesObservationsQueryRequest(ObservationQuery body) {
    return PostAnalyticsQueuesObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualifierMappingObservationQueryResponse postAnalyticsQueuesObservationsQuery(PostAnalyticsQueuesObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualifierMappingObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for queue observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualifierMappingObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QualifierMappingObservationQueryResponse> response = (ApiResponse<QualifierMappingObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Generate a view export request
   * 
   * @param body ReportingExportJobRequest (required)
   * @return ReportingExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobResponse postAnalyticsReportingExports(ReportingExportJobRequest body) throws IOException, ApiException {
    return  postAnalyticsReportingExports(createPostAnalyticsReportingExportsRequest(body));
  }

  /**
   * Generate a view export request
   * 
   * @param body ReportingExportJobRequest (required)
   * @return ReportingExportJobResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobResponse> postAnalyticsReportingExportsWithHttpInfo(ReportingExportJobRequest body) throws IOException {
    return postAnalyticsReportingExports(createPostAnalyticsReportingExportsRequest(body).withHttpInfo());
  }

  private PostAnalyticsReportingExportsRequest createPostAnalyticsReportingExportsRequest(ReportingExportJobRequest body) {
    return PostAnalyticsReportingExportsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Generate a view export request
   * 
   * @param request The request object
   * @return ReportingExportJobResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportingExportJobResponse postAnalyticsReportingExports(PostAnalyticsReportingExportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportingExportJobResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportingExportJobResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Generate a view export request
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportingExportJobResponse> postAnalyticsReportingExports(ApiRequest<ReportingExportJobRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportingExportJobResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportingExportJobResponse> response = (ApiResponse<ReportingExportJobResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(String scheduleId) throws IOException, ApiException {
    return  postAnalyticsReportingScheduleRunreport(createPostAnalyticsReportingScheduleRunreportRequest(scheduleId));
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreportWithHttpInfo(String scheduleId) throws IOException {
    return postAnalyticsReportingScheduleRunreport(createPostAnalyticsReportingScheduleRunreportRequest(scheduleId).withHttpInfo());
  }

  private PostAnalyticsReportingScheduleRunreportRequest createPostAnalyticsReportingScheduleRunreportRequest(String scheduleId) {
    return PostAnalyticsReportingScheduleRunreportRequest.builder()
            .withScheduleId(scheduleId)
    
            .build();
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request The request object
   * @return RunNowResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(PostAnalyticsReportingScheduleRunreportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RunNowResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RunNowResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RunNowResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<RunNowResponse> response = (ApiResponse<RunNowResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule postAnalyticsReportingSchedules(ReportSchedule body) throws IOException, ApiException {
    return  postAnalyticsReportingSchedules(createPostAnalyticsReportingSchedulesRequest(body));
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedulesWithHttpInfo(ReportSchedule body) throws IOException {
    return postAnalyticsReportingSchedules(createPostAnalyticsReportingSchedulesRequest(body).withHttpInfo());
  }

  private PostAnalyticsReportingSchedulesRequest createPostAnalyticsReportingSchedulesRequest(ReportSchedule body) {
    return PostAnalyticsReportingSchedulesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule postAnalyticsReportingSchedules(PostAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedules(ApiRequest<ReportSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsSurveysAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body));
  }

  /**
   * Query for survey aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsSurveysAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsSurveysAggregatesQuery(createPostAnalyticsSurveysAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsSurveysAggregatesQueryRequest createPostAnalyticsSurveysAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsSurveysAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsSurveysAggregatesQuery(PostAnalyticsSurveysAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for survey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsSurveysAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body));
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsUsersAggregatesQuery(createPostAnalyticsUsersAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersAggregatesQueryRequest createPostAnalyticsUsersAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsUsersAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return PresenceQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PresenceQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PresenceQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PresenceQueryResponse> response = (ApiResponse<PresenceQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body));
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws IOException {
    return postAnalyticsUsersDetailsQuery(createPostAnalyticsUsersDetailsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersDetailsQueryRequest createPostAnalyticsUsersDetailsQueryRequest(UserDetailsQuery body) {
    return PostAnalyticsUsersDetailsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user details
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AnalyticsUserDetailsQueryResponse> response = (ApiResponse<AnalyticsUserDetailsQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return  postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body));
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException {
    return postAnalyticsUsersObservationsQuery(createPostAnalyticsUsersObservationsQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsUsersObservationsQueryRequest createPostAnalyticsUsersObservationsQueryRequest(ObservationQuery body) {
    return PostAnalyticsUsersObservationsQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return ObservationQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ObservationQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for user observations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ObservationQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ObservationQueryResponse> response = (ApiResponse<ObservationQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule putAnalyticsReportingSchedule(String scheduleId, ReportSchedule body) throws IOException, ApiException {
    return  putAnalyticsReportingSchedule(createPutAnalyticsReportingScheduleRequest(scheduleId, body));
  }

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingScheduleWithHttpInfo(String scheduleId, ReportSchedule body) throws IOException {
    return putAnalyticsReportingSchedule(createPutAnalyticsReportingScheduleRequest(scheduleId, body).withHttpInfo());
  }

  private PutAnalyticsReportingScheduleRequest createPutAnalyticsReportingScheduleRequest(String scheduleId, ReportSchedule body) {
    return PutAnalyticsReportingScheduleRequest.builder()
            .withScheduleId(scheduleId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a scheduled report job.
   * 
   * @param request The request object
   * @return ReportSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ReportSchedule putAnalyticsReportingSchedule(PutAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ReportSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a scheduled report job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingSchedule(ApiRequest<ReportSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ReportSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ReportSchedule> response = (ApiResponse<ReportSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
