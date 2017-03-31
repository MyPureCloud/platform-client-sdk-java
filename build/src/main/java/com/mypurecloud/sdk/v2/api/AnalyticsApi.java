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
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
    return deleteAnalyticsReportingScheduleWithHttpInfo(scheduleId).getBody();
  }

  /**
   * Delete a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling deleteAnalyticsReportingSchedule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Delete a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteAnalyticsReportingSchedule(DeleteAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversation getAnalyticsConversationDetails(String conversationId) throws IOException, ApiException {
    return getAnalyticsConversationDetailsWithHttpInfo(conversationId).getBody();
  }

  /**
   * Get a conversation by id
   * 
   * @param conversationId conversationId (required)
   * @return AnalyticsConversation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetailsWithHttpInfo(String conversationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling getAnalyticsConversationDetails");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/{conversationId}/details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversation getAnalyticsConversationDetails(GetAnalyticsConversationDetailsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get a conversation by id
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversation> getAnalyticsConversationDetails(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AnalyticsConversation>invokeAPIVerbose(request, new TypeReference<AnalyticsConversation>() {});
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws ApiException if fails to make API call
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(Integer pageNumber, Integer pageSize, String locale) throws IOException, ApiException {
    return getAnalyticsReportingMetadataWithHttpInfo(pageNumber, pageSize, locale).getBody();
  }

  /**
   * Get list of reporting metadata.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param locale Locale (optional)
   * @return ReportMetaDataEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadataWithHttpInfo(Integer pageNumber, Integer pageSize, String locale) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/metadata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "locale", locale));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportMetaDataEntityListing>() {});
  }

  /**
   * Get list of reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportMetaDataEntityListing getAnalyticsReportingMetadata(GetAnalyticsReportingMetadataRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportMetaDataEntityListing>() {});
  }

  /**
   * Get list of reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportMetaDataEntityListing> getAnalyticsReportingMetadata(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportMetaDataEntityListing>invokeAPIVerbose(request, new TypeReference<ReportMetaDataEntityListing>() {});
  }

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws ApiException if fails to make API call
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(String reportId, String locale) throws IOException, ApiException {
    return getAnalyticsReportingReportIdMetadataWithHttpInfo(reportId, locale).getBody();
  }

  /**
   * Get a reporting metadata.
   * 
   * @param reportId Report ID (required)
   * @param locale Locale (optional)
   * @return ReportMetaData
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadataWithHttpInfo(String reportId, String locale) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'reportId' when calling getAnalyticsReportingReportIdMetadata");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/{reportId}/metadata".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "reportId" + "\\}", pcapiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "locale", locale));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportMetaData>() {});
  }

  /**
   * Get a reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportMetaData getAnalyticsReportingReportIdMetadata(GetAnalyticsReportingReportIdMetadataRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportMetaData>() {});
  }

  /**
   * Get a reporting metadata.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportMetaData> getAnalyticsReportingReportIdMetadata(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportMetaData>invokeAPIVerbose(request, new TypeReference<ReportMetaData>() {});
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getAnalyticsReportingReportformats() throws IOException, ApiException {
    return getAnalyticsReportingReportformatsWithHttpInfo().getBody();
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformatsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/reportformats".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> getAnalyticsReportingReportformats(GetAnalyticsReportingReportformatsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of report formats
   * Get a list of report formats.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getAnalyticsReportingReportformats(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule getAnalyticsReportingSchedule(String scheduleId) throws IOException, ApiException {
    return getAnalyticsReportingScheduleWithHttpInfo(scheduleId).getBody();
  }

  /**
   * Get a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingScheduleWithHttpInfo(String scheduleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling getAnalyticsReportingSchedule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportSchedule>() {});
  }

  /**
   * Get a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule getAnalyticsReportingSchedule(GetAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
  }

  /**
   * Get a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> getAnalyticsReportingSchedule(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportSchedule>invokeAPIVerbose(request, new TypeReference<ReportSchedule>() {});
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getAnalyticsReportingScheduleHistoryWithHttpInfo(scheduleId, pageNumber, pageSize).getBody();
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @param scheduleId Schedule ID (required)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 25)
   * @return ReportRunEntryEntityDomainListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistoryWithHttpInfo(String scheduleId, Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling getAnalyticsReportingScheduleHistory");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}/history".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportRunEntryEntityDomainListing>() {});
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntryEntityDomainListing getAnalyticsReportingScheduleHistory(GetAnalyticsReportingScheduleHistoryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportRunEntryEntityDomainListing>() {});
  }

  /**
   * Get list of completed scheduled report jobs.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntryEntityDomainListing> getAnalyticsReportingScheduleHistory(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportRunEntryEntityDomainListing>invokeAPIVerbose(request, new TypeReference<ReportRunEntryEntityDomainListing>() {});
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(String scheduleId) throws IOException, ApiException {
    return getAnalyticsReportingScheduleHistoryLatestWithHttpInfo(scheduleId).getBody();
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatestWithHttpInfo(String scheduleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling getAnalyticsReportingScheduleHistoryLatest");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}/history/latest".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportRunEntry>() {});
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryLatest(GetAnalyticsReportingScheduleHistoryLatestRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
  }

  /**
   * Get most recently completed scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryLatest(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportRunEntry>invokeAPIVerbose(request, new TypeReference<ReportRunEntry>() {});
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(String runId, String scheduleId) throws IOException, ApiException {
    return getAnalyticsReportingScheduleHistoryRunIdWithHttpInfo(runId, scheduleId).getBody();
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @param runId Run ID (required)
   * @param scheduleId Schedule ID (required)
   * @return ReportRunEntry
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunIdWithHttpInfo(String runId, String scheduleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'runId' is set
    if (runId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'runId' when calling getAnalyticsReportingScheduleHistoryRunId");
    }
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling getAnalyticsReportingScheduleHistoryRunId");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "runId" + "\\}", pcapiClient.escapeString(runId.toString()))
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportRunEntry>() {});
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportRunEntry getAnalyticsReportingScheduleHistoryRunId(GetAnalyticsReportingScheduleHistoryRunIdRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportRunEntry>() {});
  }

  /**
   * A completed scheduled report job
   * A completed scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportRunEntry> getAnalyticsReportingScheduleHistoryRunId(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportRunEntry>invokeAPIVerbose(request, new TypeReference<ReportRunEntry>() {});
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return getAnalyticsReportingSchedulesWithHttpInfo(pageNumber, pageSize).getBody();
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ReportScheduleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedulesWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportScheduleEntityListing>() {});
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportScheduleEntityListing getAnalyticsReportingSchedules(GetAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportScheduleEntityListing>() {});
  }

  /**
   * Get a list of scheduled report jobs
   * Get a list of scheduled report jobs.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportScheduleEntityListing> getAnalyticsReportingSchedules(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ReportScheduleEntityListing>invokeAPIVerbose(request, new TypeReference<ReportScheduleEntityListing>() {});
  }

  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getAnalyticsReportingTimeperiods() throws IOException, ApiException {
    return getAnalyticsReportingTimeperiodsWithHttpInfo().getBody();
  }

  /**
   * Get a list of report time periods.
   * 
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiodsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/timeperiods".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of report time periods.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<String> getAnalyticsReportingTimeperiods(GetAnalyticsReportingTimeperiodsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<String>>() {});
  }

  /**
   * Get a list of report time periods.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<String>> getAnalyticsReportingTimeperiods(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<String>>invokeAPIVerbose(request, new TypeReference<List<String>>() {});
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if fails to make API call
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(String conversationId, PropertyIndexRequest body) throws IOException, ApiException {
    return postAnalyticsConversationDetailsPropertiesWithHttpInfo(conversationId, body).getBody();
  }

  /**
   * Index conversation properties
   * 
   * @param conversationId conversationId (required)
   * @param body request (required)
   * @return PropertyIndexRequest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsPropertiesWithHttpInfo(String conversationId, PropertyIndexRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling postAnalyticsConversationDetailsProperties");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsConversationDetailsProperties");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/{conversationId}/details/properties".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "conversationId" + "\\}", pcapiClient.escapeString(conversationId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PropertyIndexRequest postAnalyticsConversationDetailsProperties(PostAnalyticsConversationDetailsPropertiesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Index conversation properties
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PropertyIndexRequest> postAnalyticsConversationDetailsProperties(ApiRequest<PropertyIndexRequest> request) throws IOException, ApiException {
    return pcapiClient.<PropertyIndexRequest>invokeAPIVerbose(request, new TypeReference<PropertyIndexRequest>() {});
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return postAnalyticsConversationsAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for conversation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsConversationsAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/aggregates/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsConversationsAggregatesQuery(PostAnalyticsConversationsAggregatesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for conversation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsConversationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException, ApiException {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerbose(request, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(ConversationQuery body) throws IOException, ApiException {
    return postAnalyticsConversationsDetailsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for conversation details
   * 
   * @param body query (required)
   * @return AnalyticsConversationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQueryWithHttpInfo(ConversationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsConversationsDetailsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/conversations/details/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsConversationQueryResponse postAnalyticsConversationsDetailsQuery(PostAnalyticsConversationsDetailsQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Query for conversation details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsConversationQueryResponse> postAnalyticsConversationsDetailsQuery(ApiRequest<ConversationQuery> request) throws IOException, ApiException {
    return pcapiClient.<AnalyticsConversationQueryResponse>invokeAPIVerbose(request, new TypeReference<AnalyticsConversationQueryResponse>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsEvaluationsAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/evaluations/aggregates/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for evaluation aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException, ApiException {
    return pcapiClient.<AggregateQueryResponse>invokeAPIVerbose(request, new TypeReference<AggregateQueryResponse>() {});
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public QualifierMappingObservationQueryResponse postAnalyticsQueuesObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return postAnalyticsQueuesObservationsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for queue observations
   * 
   * @param body query (required)
   * @return QualifierMappingObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsQueuesObservationsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/queues/observations/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QualifierMappingObservationQueryResponse>() {});
  }

  /**
   * Query for queue observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QualifierMappingObservationQueryResponse postAnalyticsQueuesObservationsQuery(PostAnalyticsQueuesObservationsQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QualifierMappingObservationQueryResponse>() {});
  }

  /**
   * Query for queue observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QualifierMappingObservationQueryResponse> postAnalyticsQueuesObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException, ApiException {
    return pcapiClient.<QualifierMappingObservationQueryResponse>invokeAPIVerbose(request, new TypeReference<QualifierMappingObservationQueryResponse>() {});
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws ApiException if fails to make API call
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(String scheduleId) throws IOException, ApiException {
    return postAnalyticsReportingScheduleRunreportWithHttpInfo(scheduleId).getBody();
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @param scheduleId Schedule ID (required)
   * @return RunNowResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreportWithHttpInfo(String scheduleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling postAnalyticsReportingScheduleRunreport");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}/runreport".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RunNowResponse>() {});
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RunNowResponse postAnalyticsReportingScheduleRunreport(PostAnalyticsReportingScheduleRunreportRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RunNowResponse>() {});
  }

  /**
   * Place a scheduled report immediately into the reporting queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RunNowResponse> postAnalyticsReportingScheduleRunreport(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RunNowResponse>invokeAPIVerbose(request, new TypeReference<RunNowResponse>() {});
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule postAnalyticsReportingSchedules(ReportSchedule body) throws IOException, ApiException {
    return postAnalyticsReportingSchedulesWithHttpInfo(body).getBody();
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedulesWithHttpInfo(ReportSchedule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsReportingSchedules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportSchedule>() {});
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule postAnalyticsReportingSchedules(PostAnalyticsReportingSchedulesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
  }

  /**
   * Create a scheduled report job
   * Create a scheduled report job.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> postAnalyticsReportingSchedules(ApiRequest<ReportSchedule> request) throws IOException, ApiException {
    return pcapiClient.<ReportSchedule>invokeAPIVerbose(request, new TypeReference<ReportSchedule>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if fails to make API call
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return postAnalyticsUsersAggregatesQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user aggregates
   * 
   * @param body query (required)
   * @return PresenceQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsUsersAggregatesQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/aggregates/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public PresenceQueryResponse postAnalyticsUsersAggregatesQuery(PostAnalyticsUsersAggregatesQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user aggregates
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PresenceQueryResponse> postAnalyticsUsersAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException, ApiException {
    return pcapiClient.<PresenceQueryResponse>invokeAPIVerbose(request, new TypeReference<PresenceQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if fails to make API call
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(UserDetailsQuery body) throws IOException, ApiException {
    return postAnalyticsUsersDetailsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user details
   * 
   * @param body query (required)
   * @return AnalyticsUserDetailsQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQueryWithHttpInfo(UserDetailsQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsUsersDetailsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/details/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AnalyticsUserDetailsQueryResponse postAnalyticsUsersDetailsQuery(PostAnalyticsUsersDetailsQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user details
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AnalyticsUserDetailsQueryResponse> postAnalyticsUsersDetailsQuery(ApiRequest<UserDetailsQuery> request) throws IOException, ApiException {
    return pcapiClient.<AnalyticsUserDetailsQueryResponse>invokeAPIVerbose(request, new TypeReference<AnalyticsUserDetailsQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(ObservationQuery body) throws IOException, ApiException {
    return postAnalyticsUsersObservationsQueryWithHttpInfo(body).getBody();
  }

  /**
   * Query for user observations
   * 
   * @param body query (required)
   * @return ObservationQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQueryWithHttpInfo(ObservationQuery body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postAnalyticsUsersObservationsQuery");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/users/observations/query".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ObservationQueryResponse postAnalyticsUsersObservationsQuery(PostAnalyticsUsersObservationsQueryRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Query for user observations
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ObservationQueryResponse> postAnalyticsUsersObservationsQuery(ApiRequest<ObservationQuery> request) throws IOException, ApiException {
    return pcapiClient.<ObservationQueryResponse>invokeAPIVerbose(request, new TypeReference<ObservationQueryResponse>() {});
  }

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule putAnalyticsReportingSchedule(String scheduleId, ReportSchedule body) throws IOException, ApiException {
    return putAnalyticsReportingScheduleWithHttpInfo(scheduleId, body).getBody();
  }

  /**
   * Update a scheduled report job.
   * 
   * @param scheduleId Schedule ID (required)
   * @param body ReportSchedule (required)
   * @return ReportSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingScheduleWithHttpInfo(String scheduleId, ReportSchedule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'scheduleId' is set
    if (scheduleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'scheduleId' when calling putAnalyticsReportingSchedule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putAnalyticsReportingSchedule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/analytics/reporting/schedules/{scheduleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "scheduleId" + "\\}", pcapiClient.escapeString(scheduleId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();


    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ReportSchedule>() {});
  }

  /**
   * Update a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ReportSchedule putAnalyticsReportingSchedule(PutAnalyticsReportingScheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ReportSchedule>() {});
  }

  /**
   * Update a scheduled report job.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReportSchedule> putAnalyticsReportingSchedule(ApiRequest<ReportSchedule> request) throws IOException, ApiException {
    return pcapiClient.<ReportSchedule>invokeAPIVerbose(request, new TypeReference<ReportSchedule>() {});
  }

}
