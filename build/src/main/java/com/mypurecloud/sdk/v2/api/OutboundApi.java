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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;


import com.mypurecloud.sdk.v2.api.request.DeleteOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignDiagnosticsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignInteractionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignStatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundWrapupcodemappingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignCallbackScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsProgressRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundConversationDncRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignAgentRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundWrapupcodemappingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OutboundApi {
  private final ApiClient pcapiClient;

  public OutboundApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
    return deleteOutboundAttemptlimitWithHttpInfo(attemptLimitsId).getBody();
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'attemptLimitsId' is set
    if (attemptLimitsId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attemptLimitsId' when calling deleteOutboundAttemptlimit");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/attemptlimits/{attemptLimitsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attemptLimitsId" + "\\}", pcapiClient.escapeString(attemptLimitsId.toString()));

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
   * Delete attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundAttemptlimit(DeleteOutboundAttemptlimitRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundAttemptlimit(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
    return deleteOutboundCallabletimesetWithHttpInfo(callableTimeSetId).getBody();
  }

  /**
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callableTimeSetId' is set
    if (callableTimeSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callableTimeSetId' when calling deleteOutboundCallabletimeset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callabletimesets/{callableTimeSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callableTimeSetId" + "\\}", pcapiClient.escapeString(callableTimeSetId.toString()));

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
   * Delete callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCallabletimeset(DeleteOutboundCallabletimesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCallabletimeset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
    return deleteOutboundCallanalysisresponsesetWithHttpInfo(callAnalysisSetId).getBody();
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callAnalysisSetId' is set
    if (callAnalysisSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callAnalysisSetId' when calling deleteOutboundCallanalysisresponseset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callAnalysisSetId" + "\\}", pcapiClient.escapeString(callAnalysisSetId.toString()));

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
   * Delete a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCallanalysisresponseset(DeleteOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public Campaign deleteOutboundCampaign(String campaignId) throws IOException, ApiException {
    return deleteOutboundCampaignWithHttpInfo(campaignId).getBody();
  }

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> deleteOutboundCampaignWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling deleteOutboundCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Campaign>() {});
  }

  /**
   * Delete a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Campaign deleteOutboundCampaign(DeleteOutboundCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Campaign>() {});
  }

  /**
   * Delete a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> deleteOutboundCampaign(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Campaign>invokeAPIVerbose(request, new TypeReference<Campaign>() {});
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
    deleteOutboundCampaignProgressWithHttpInfo(campaignId);
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling deleteOutboundCampaignProgress");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "DELETE", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void deleteOutboundCampaignProgress(DeleteOutboundCampaignProgressRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteOutboundCampaignProgress(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
    return deleteOutboundCampaignruleWithHttpInfo(campaignRuleId).getBody();
  }

  /**
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignRuleId' is set
    if (campaignRuleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignRuleId' when calling deleteOutboundCampaignrule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaignrules/{campaignRuleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignRuleId" + "\\}", pcapiClient.escapeString(campaignRuleId.toString()));

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
   * Delete Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundCampaignrule(DeleteOutboundCampaignruleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundCampaignrule(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundContactlist(String contactListId) throws IOException, ApiException {
    return deleteOutboundContactlistWithHttpInfo(contactListId).getBody();
  }

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundContactlistWithHttpInfo(String contactListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling deleteOutboundContactlist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

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
   * Delete a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundContactlist(DeleteOutboundContactlistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundContactlist(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
    return deleteOutboundContactlistContactWithHttpInfo(contactListId, contactId).getBody();
  }

  /**
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling deleteOutboundContactlistContact");
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling deleteOutboundContactlistContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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
   * Delete a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundContactlistContact(DeleteOutboundContactlistContactRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundContactlistContact(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundDnclist(String dncListId) throws IOException, ApiException {
    return deleteOutboundDnclistWithHttpInfo(dncListId).getBody();
  }

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundDnclistWithHttpInfo(String dncListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling deleteOutboundDnclist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

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
   * Delete dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundDnclist(DeleteOutboundDnclistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundDnclist(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundRuleset(String ruleSetId) throws IOException, ApiException {
    return deleteOutboundRulesetWithHttpInfo(ruleSetId).getBody();
  }

  /**
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleSetId' is set
    if (ruleSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'ruleSetId' when calling deleteOutboundRuleset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/rulesets/{ruleSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleSetId" + "\\}", pcapiClient.escapeString(ruleSetId.toString()));

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
   * Delete a Rule set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundRuleset(DeleteOutboundRulesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a Rule set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundRuleset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
    return deleteOutboundSchedulesCampaignWithHttpInfo(campaignId).getBody();
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling deleteOutboundSchedulesCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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
   * Delete a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSchedulesCampaign(DeleteOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
    return deleteOutboundSchedulesSequenceWithHttpInfo(sequenceId).getBody();
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling deleteOutboundSchedulesSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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
   * Delete a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSchedulesSequence(DeleteOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSequence(String sequenceId) throws IOException, ApiException {
    return deleteOutboundSequenceWithHttpInfo(sequenceId).getBody();
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSequenceWithHttpInfo(String sequenceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling deleteOutboundSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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
   * Delete a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteOutboundSequence(DeleteOutboundSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteOutboundSequence(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits getOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
    return getOutboundAttemptlimitWithHttpInfo(attemptLimitsId).getBody();
  }

  /**
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'attemptLimitsId' is set
    if (attemptLimitsId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attemptLimitsId' when calling getOutboundAttemptlimit");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/attemptlimits/{attemptLimitsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attemptLimitsId" + "\\}", pcapiClient.escapeString(attemptLimitsId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Get attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits getOutboundAttemptlimit(GetOutboundAttemptlimitRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
  }

  /**
   * Get attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimit(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerbose(request, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws ApiException if fails to make API call
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundAttemptlimitsWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimitsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/attemptlimits".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttemptLimitsEntityListing>() {});
  }

  /**
   * Query attempt limits list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(GetOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttemptLimitsEntityListing>() {});
  }

  /**
   * Query attempt limits list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimits(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<AttemptLimitsEntityListing>invokeAPIVerbose(request, new TypeReference<AttemptLimitsEntityListing>() {});
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet getOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
    return getOutboundCallabletimesetWithHttpInfo(callableTimeSetId).getBody();
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callableTimeSetId' is set
    if (callableTimeSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callableTimeSetId' when calling getOutboundCallabletimeset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callabletimesets/{callableTimeSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callableTimeSetId" + "\\}", pcapiClient.escapeString(callableTimeSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Get callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet getOutboundCallabletimeset(GetOutboundCallabletimesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Get callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimeset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerbose(request, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundCallabletimesetsWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callabletimesets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallableTimeSetEntityListing>() {});
  }

  /**
   * Query callable time set list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(GetOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallableTimeSetEntityListing>() {});
  }

  /**
   * Query callable time set list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesets(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CallableTimeSetEntityListing>invokeAPIVerbose(request, new TypeReference<CallableTimeSetEntityListing>() {});
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ResponseSet getOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
    return getOutboundCallanalysisresponsesetWithHttpInfo(callAnalysisSetId).getBody();
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'callAnalysisSetId' is set
    if (callAnalysisSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callAnalysisSetId' when calling getOutboundCallanalysisresponseset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callAnalysisSetId" + "\\}", pcapiClient.escapeString(callAnalysisSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseSet>() {});
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseSet getOutboundCallanalysisresponseset(GetOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerbose(request, new TypeReference<ResponseSet>() {});
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundCallanalysisresponsesetsWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callanalysisresponsesets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseSetEntityListing>() {});
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(GetOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseSetEntityListing>() {});
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesets(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ResponseSetEntityListing>invokeAPIVerbose(request, new TypeReference<ResponseSetEntityListing>() {});
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public Campaign getOutboundCampaign(String campaignId) throws IOException, ApiException {
    return getOutboundCampaignWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> getOutboundCampaignWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Campaign>() {});
  }

  /**
   * Get dialer campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Campaign getOutboundCampaign(GetOutboundCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Campaign>() {});
  }

  /**
   * Get dialer campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> getOutboundCampaign(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Campaign>invokeAPIVerbose(request, new TypeReference<Campaign>() {});
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws ApiException if fails to make API call
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(String campaignId) throws IOException, ApiException {
    return getOutboundCampaignDiagnosticsWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnosticsWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundCampaignDiagnostics");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/diagnostics".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignDiagnostics>() {});
  }

  /**
   * Get campaign diagnostics
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(GetOutboundCampaignDiagnosticsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignDiagnostics>() {});
  }

  /**
   * Get campaign diagnostics
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnostics(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignDiagnostics>invokeAPIVerbose(request, new TypeReference<CampaignDiagnostics>() {});
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws ApiException if fails to make API call
   */
  public CampaignInteractions getOutboundCampaignInteractions(String campaignId) throws IOException, ApiException {
    return getOutboundCampaignInteractionsWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractionsWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundCampaignInteractions");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/interactions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignInteractions>() {});
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignInteractions getOutboundCampaignInteractions(GetOutboundCampaignInteractionsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignInteractions>() {});
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractions(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignInteractions>invokeAPIVerbose(request, new TypeReference<CampaignInteractions>() {});
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws ApiException if fails to make API call
   */
  public CampaignProgress getOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
    return getOutboundCampaignProgressWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundCampaignProgress");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignProgress>() {});
  }

  /**
   * Get campaign progress
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignProgress getOutboundCampaignProgress(GetOutboundCampaignProgressRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignProgress>() {});
  }

  /**
   * Get campaign progress
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgress(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignProgress>invokeAPIVerbose(request, new TypeReference<CampaignProgress>() {});
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws ApiException if fails to make API call
   */
  public CampaignStats getOutboundCampaignStats(String campaignId) throws IOException, ApiException {
    return getOutboundCampaignStatsWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStatsWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundCampaignStats");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/stats".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignStats>() {});
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignStats getOutboundCampaignStats(GetOutboundCampaignStatsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignStats>() {});
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStats(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignStats>invokeAPIVerbose(request, new TypeReference<CampaignStats>() {});
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public CampaignRule getOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
    return getOutboundCampaignruleWithHttpInfo(campaignRuleId).getBody();
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> getOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignRuleId' is set
    if (campaignRuleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignRuleId' when calling getOutboundCampaignrule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaignrules/{campaignRuleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignRuleId" + "\\}", pcapiClient.escapeString(campaignRuleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignRule>() {});
  }

  /**
   * Get Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignRule getOutboundCampaignrule(GetOutboundCampaignruleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
  }

  /**
   * Get Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> getOutboundCampaignrule(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerbose(request, new TypeReference<CampaignRule>() {});
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws ApiException if fails to make API call
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundCampaignrulesWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrulesWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaignrules".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignRuleEntityListing>() {});
  }

  /**
   * Query Campaign Rule list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(GetOutboundCampaignrulesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignRuleEntityListing>() {});
  }

  /**
   * Query Campaign Rule list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrules(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignRuleEntityListing>invokeAPIVerbose(request, new TypeReference<CampaignRuleEntityListing>() {});
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListId DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws ApiException if fails to make API call
   */
  public CampaignEntityListing getOutboundCampaigns(Integer pageSize, Integer pageNumber, String filterType, String name, String contactListId, String dncListId, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundCampaignsWithHttpInfo(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder).getBody();
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListId DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaignsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String contactListId, String dncListId, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "contactListId", contactListId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "dncListId", dncListId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "distributionQueueId", distributionQueueId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "edgeGroupId", edgeGroupId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "callAnalysisResponseSetId", callAnalysisResponseSetId));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignEntityListing>() {});
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignEntityListing getOutboundCampaigns(GetOutboundCampaignsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignEntityListing>() {});
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaigns(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignEntityListing>invokeAPIVerbose(request, new TypeReference<CampaignEntityListing>() {});
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ContactList getOutboundContactlist(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return getOutboundContactlistWithHttpInfo(contactListId, includeImportStatus, includeSize).getBody();
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> getOutboundContactlistWithHttpInfo(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling getOutboundContactlist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeImportStatus", includeImportStatus));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeSize", includeSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactList>() {});
  }

  /**
   * Get a dialer contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactList getOutboundContactlist(GetOutboundContactlistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactList>() {});
  }

  /**
   * Get a dialer contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> getOutboundContactlist(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ContactList>invokeAPIVerbose(request, new TypeReference<ContactList>() {});
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws ApiException if fails to make API call
   */
  public DialerContact getOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
    return getOutboundContactlistContactWithHttpInfo(contactListId, contactId).getBody();
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DialerContact> getOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling getOutboundContactlistContact");
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling getOutboundContactlistContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DialerContact>() {});
  }

  /**
   * Get a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DialerContact getOutboundContactlistContact(GetOutboundContactlistContactRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DialerContact>() {});
  }

  /**
   * Get a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DialerContact> getOutboundContactlistContact(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DialerContact>invokeAPIVerbose(request, new TypeReference<DialerContact>() {});
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if fails to make API call
   */
  public ExportUri getOutboundContactlistExport(String contactListId, String download) throws IOException, ApiException {
    return getOutboundContactlistExportWithHttpInfo(contactListId, download).getBody();
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExportUri> getOutboundContactlistExportWithHttpInfo(String contactListId, String download) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling getOutboundContactlistExport");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/export".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "download", download));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExportUri>() {});
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExportUri getOutboundContactlistExport(GetOutboundContactlistExportRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExportUri>() {});
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExportUri> getOutboundContactlistExport(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ExportUri>invokeAPIVerbose(request, new TypeReference<ExportUri>() {});
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws ApiException if fails to make API call
   */
  public ImportStatus getOutboundContactlistImportstatus(String contactListId) throws IOException, ApiException {
    return getOutboundContactlistImportstatusWithHttpInfo(contactListId).getBody();
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatusWithHttpInfo(String contactListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling getOutboundContactlistImportstatus");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/importstatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ImportStatus>() {});
  }

  /**
   * Get dialer contactList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ImportStatus getOutboundContactlistImportstatus(GetOutboundContactlistImportstatusRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
  }

  /**
   * Get dialer contactList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatus(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ImportStatus>invokeAPIVerbose(request, new TypeReference<ImportStatus>() {});
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws ApiException if fails to make API call
   */
  public ContactListEntityListing getOutboundContactlists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundContactlistsWithHttpInfo(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeImportStatus", includeImportStatus));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeSize", includeSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactListEntityListing>() {});
  }

  /**
   * Query a list of contact lists.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactListEntityListing getOutboundContactlists(GetOutboundContactlistsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactListEntityListing>() {});
  }

  /**
   * Query a list of contact lists.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlists(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ContactListEntityListing>invokeAPIVerbose(request, new TypeReference<ContactListEntityListing>() {});
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public DncList getOutboundDnclist(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return getOutboundDnclistWithHttpInfo(dncListId, includeImportStatus, includeSize).getBody();
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> getOutboundDnclistWithHttpInfo(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling getOutboundDnclist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeImportStatus", includeImportStatus));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeSize", includeSize));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DncList>() {});
  }

  /**
   * Get dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DncList getOutboundDnclist(GetOutboundDnclistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DncList>() {});
  }

  /**
   * Get dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> getOutboundDnclist(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DncList>invokeAPIVerbose(request, new TypeReference<DncList>() {});
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if fails to make API call
   */
  public ExportUri getOutboundDnclistExport(String dncListId, String download) throws IOException, ApiException {
    return getOutboundDnclistExportWithHttpInfo(dncListId, download).getBody();
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExportUri> getOutboundDnclistExportWithHttpInfo(String dncListId, String download) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling getOutboundDnclistExport");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}/export".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "download", download));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ExportUri>() {});
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ExportUri getOutboundDnclistExport(GetOutboundDnclistExportRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ExportUri>() {});
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ExportUri> getOutboundDnclistExport(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ExportUri>invokeAPIVerbose(request, new TypeReference<ExportUri>() {});
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws ApiException if fails to make API call
   */
  public ImportStatus getOutboundDnclistImportstatus(String dncListId) throws IOException, ApiException {
    return getOutboundDnclistImportstatusWithHttpInfo(dncListId).getBody();
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatusWithHttpInfo(String dncListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling getOutboundDnclistImportstatus");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}/importstatus".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ImportStatus>() {});
  }

  /**
   * Get dialer dncList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ImportStatus getOutboundDnclistImportstatus(GetOutboundDnclistImportstatusRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
  }

  /**
   * Get dialer dncList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatus(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<ImportStatus>invokeAPIVerbose(request, new TypeReference<ImportStatus>() {});
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws ApiException if fails to make API call
   */
  public DncListEntityListing getOutboundDnclists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundDnclistsWithHttpInfo(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeImportStatus", includeImportStatus));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "includeSize", includeSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DncListEntityListing>() {});
  }

  /**
   * Query dialer DNC lists
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DncListEntityListing getOutboundDnclists(GetOutboundDnclistsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DncListEntityListing>() {});
  }

  /**
   * Query dialer DNC lists
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclists(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<DncListEntityListing>invokeAPIVerbose(request, new TypeReference<DncListEntityListing>() {});
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public RuleSet getOutboundRuleset(String ruleSetId) throws IOException, ApiException {
    return getOutboundRulesetWithHttpInfo(ruleSetId).getBody();
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> getOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'ruleSetId' is set
    if (ruleSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'ruleSetId' when calling getOutboundRuleset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/rulesets/{ruleSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleSetId" + "\\}", pcapiClient.escapeString(ruleSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RuleSet>() {});
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RuleSet getOutboundRuleset(GetOutboundRulesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RuleSet>() {});
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> getOutboundRuleset(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerbose(request, new TypeReference<RuleSet>() {});
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public RuleSetEntityListing getOutboundRulesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundRulesetsWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/rulesets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RuleSetEntityListing>() {});
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RuleSetEntityListing getOutboundRulesets(GetOutboundRulesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RuleSetEntityListing>() {});
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesets(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RuleSetEntityListing>invokeAPIVerbose(request, new TypeReference<RuleSetEntityListing>() {});
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws ApiException if fails to make API call
   */
  public CampaignSchedule getOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
    return getOutboundSchedulesCampaignWithHttpInfo(campaignId).getBody();
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling getOutboundSchedulesCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSchedule getOutboundSchedulesCampaign(GetOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIVerbose(request, new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws ApiException if fails to make API call
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns() throws IOException, ApiException {
    return getOutboundSchedulesCampaignsWithHttpInfo().getBody();
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaignsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/campaigns".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<CampaignSchedule>>() {});
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns(GetOutboundSchedulesCampaignsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<CampaignSchedule>>() {});
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaigns(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<CampaignSchedule>>invokeAPIVerbose(request, new TypeReference<List<CampaignSchedule>>() {});
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws ApiException if fails to make API call
   */
  public SequenceSchedule getOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
    return getOutboundSchedulesSequenceWithHttpInfo(sequenceId).getBody();
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling getOutboundSchedulesSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SequenceSchedule getOutboundSchedulesSequence(GetOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIVerbose(request, new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws ApiException if fails to make API call
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences() throws IOException, ApiException {
    return getOutboundSchedulesSequencesWithHttpInfo().getBody();
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequencesWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/sequences".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<SequenceSchedule>>() {});
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences(GetOutboundSchedulesSequencesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<SequenceSchedule>>() {});
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequences(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<List<SequenceSchedule>>invokeAPIVerbose(request, new TypeReference<List<SequenceSchedule>>() {});
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence getOutboundSequence(String sequenceId) throws IOException, ApiException {
    return getOutboundSequenceWithHttpInfo(sequenceId).getBody();
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> getOutboundSequenceWithHttpInfo(String sequenceId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling getOutboundSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence getOutboundSequence(GetOutboundSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> getOutboundSequence(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerbose(request, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public CampaignSequenceEntityListing getOutboundSequences(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return getOutboundSequencesWithHttpInfo(pageSize, pageNumber, filterType, name, sortBy, sortOrder).getBody();
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequencesWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/sequences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "filterType", filterType));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSequenceEntityListing>() {});
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSequenceEntityListing getOutboundSequences(GetOutboundSequencesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSequenceEntityListing>() {});
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequences(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSequenceEntityListing>invokeAPIVerbose(request, new TypeReference<CampaignSequenceEntityListing>() {});
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws ApiException if fails to make API call
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings() throws IOException, ApiException {
    return getOutboundWrapupcodemappingsWithHttpInfo().getBody();
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappingsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/wrapupcodemappings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapUpCodeMapping>() {});
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings(GetOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappings(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIVerbose(request, new TypeReference<WrapUpCodeMapping>() {});
  }

  /**
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits postOutboundAttemptlimits(AttemptLimits body) throws IOException, ApiException {
    return postOutboundAttemptlimitsWithHttpInfo(body).getBody();
  }

  /**
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimitsWithHttpInfo(AttemptLimits body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundAttemptlimits");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/attemptlimits".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Create attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits postOutboundAttemptlimits(PostOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
  }

  /**
   * Create attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimits(ApiRequest<AttemptLimits> request) throws IOException, ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerbose(request, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return AuditSearchResult
   * @throws ApiException if fails to make API call
   */
  public AuditSearchResult postOutboundAudits(DialerAuditRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, Boolean facetsOnly) throws IOException, ApiException {
    return postOutboundAuditsWithHttpInfo(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly).getBody();
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return AuditSearchResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuditSearchResult> postOutboundAuditsWithHttpInfo(DialerAuditRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, Boolean facetsOnly) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundAudits");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/audits".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "facetsOnly", facetsOnly));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AuditSearchResult>() {});
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AuditSearchResult postOutboundAudits(PostOutboundAuditsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AuditSearchResult>() {});
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AuditSearchResult> postOutboundAudits(ApiRequest<DialerAuditRequest> request) throws IOException, ApiException {
    return pcapiClient.<AuditSearchResult>invokeAPIVerbose(request, new TypeReference<AuditSearchResult>() {});
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet postOutboundCallabletimesets(CallableTimeSet body) throws IOException, ApiException {
    return postOutboundCallabletimesetsWithHttpInfo(body).getBody();
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesetsWithHttpInfo(CallableTimeSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCallabletimesets");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callabletimesets".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Create callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet postOutboundCallabletimesets(PostOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Create callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesets(ApiRequest<CallableTimeSet> request) throws IOException, ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerbose(request, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ResponseSet postOutboundCallanalysisresponsesets(ResponseSet body) throws IOException, ApiException {
    return postOutboundCallanalysisresponsesetsWithHttpInfo(body).getBody();
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesetsWithHttpInfo(ResponseSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCallanalysisresponsesets");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callanalysisresponsesets".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseSet>() {});
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseSet postOutboundCallanalysisresponsesets(PostOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesets(ApiRequest<ResponseSet> request) throws IOException, ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerbose(request, new TypeReference<ResponseSet>() {});
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws ApiException if fails to make API call
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(String campaignId, ContactCallbackRequest body) throws IOException, ApiException {
    return postOutboundCampaignCallbackScheduleWithHttpInfo(campaignId, body).getBody();
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackScheduleWithHttpInfo(String campaignId, ContactCallbackRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling postOutboundCampaignCallbackSchedule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCampaignCallbackSchedule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/callback/schedule".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactCallbackRequest>() {});
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(PostOutboundCampaignCallbackScheduleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactCallbackRequest>() {});
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackSchedule(ApiRequest<ContactCallbackRequest> request) throws IOException, ApiException {
    return pcapiClient.<ContactCallbackRequest>invokeAPIVerbose(request, new TypeReference<ContactCallbackRequest>() {});
  }

  /**
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public CampaignRule postOutboundCampaignrules(CampaignRule body) throws IOException, ApiException {
    return postOutboundCampaignrulesWithHttpInfo(body).getBody();
  }

  /**
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrulesWithHttpInfo(CampaignRule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCampaignrules");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaignrules".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignRule>() {});
  }

  /**
   * Create Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignRule postOutboundCampaignrules(PostOutboundCampaignrulesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
  }

  /**
   * Create Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrules(ApiRequest<CampaignRule> request) throws IOException, ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerbose(request, new TypeReference<CampaignRule>() {});
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public Campaign postOutboundCampaigns(Campaign body) throws IOException, ApiException {
    return postOutboundCampaignsWithHttpInfo(body).getBody();
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> postOutboundCampaignsWithHttpInfo(Campaign body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCampaigns");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Campaign>() {});
  }

  /**
   * Create a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Campaign postOutboundCampaigns(PostOutboundCampaignsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Campaign>() {});
  }

  /**
   * Create a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> postOutboundCampaigns(ApiRequest<Campaign> request) throws IOException, ApiException {
    return pcapiClient.<Campaign>invokeAPIVerbose(request, new TypeReference<Campaign>() {});
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws ApiException if fails to make API call
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(List<String> body) throws IOException, ApiException {
    return postOutboundCampaignsProgressWithHttpInfo(body).getBody();
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgressWithHttpInfo(List<String> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundCampaignsProgress");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/progress".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<CampaignProgress>>() {});
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(PostOutboundCampaignsProgressRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {});
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgress(ApiRequest<List<String>> request) throws IOException, ApiException {
    return pcapiClient.<List<CampaignProgress>>invokeAPIVerbose(request, new TypeReference<List<CampaignProgress>>() {});
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @param clearSystemData Clear system data.  True means the system data stored on the contact will be cleared if the contact already exists (attempts, callable status, etc), false means it won&#39;t. (optional)
   * @return List<DialerContact>
   * @throws ApiException if fails to make API call
   */
  public List<DialerContact> postOutboundContactlistContacts(String contactListId, List<DialerContact> body, Boolean priority, Boolean clearSystemData) throws IOException, ApiException {
    return postOutboundContactlistContactsWithHttpInfo(contactListId, body, priority, clearSystemData).getBody();
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @param clearSystemData Clear system data.  True means the system data stored on the contact will be cleared if the contact already exists (attempts, callable status, etc), false means it won&#39;t. (optional)
   * @return List<DialerContact>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContactsWithHttpInfo(String contactListId, List<DialerContact> body, Boolean priority, Boolean clearSystemData) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling postOutboundContactlistContacts");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundContactlistContacts");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/contacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "priority", priority));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "clearSystemData", clearSystemData));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<DialerContact>>() {});
  }

  /**
   * Add contacts to a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<DialerContact> postOutboundContactlistContacts(PostOutboundContactlistContactsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {});
  }

  /**
   * Add contacts to a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContacts(ApiRequest<List<DialerContact>> request) throws IOException, ApiException {
    return pcapiClient.<List<DialerContact>>invokeAPIVerbose(request, new TypeReference<List<DialerContact>>() {});
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return UriReference
   * @throws ApiException if fails to make API call
   */
  public UriReference postOutboundContactlistExport(String contactListId) throws IOException, ApiException {
    return postOutboundContactlistExportWithHttpInfo(contactListId).getBody();
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return UriReference
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UriReference> postOutboundContactlistExportWithHttpInfo(String contactListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling postOutboundContactlistExport");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/export".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UriReference>() {});
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UriReference postOutboundContactlistExport(PostOutboundContactlistExportRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UriReference>() {});
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UriReference> postOutboundContactlistExport(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<UriReference>invokeAPIVerbose(request, new TypeReference<UriReference>() {});
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ContactList postOutboundContactlists(ContactList body) throws IOException, ApiException {
    return postOutboundContactlistsWithHttpInfo(body).getBody();
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> postOutboundContactlistsWithHttpInfo(ContactList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundContactlists");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactList>() {});
  }

  /**
   * Create a contact List.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactList postOutboundContactlists(PostOutboundContactlistsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactList>() {});
  }

  /**
   * Create a contact List.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> postOutboundContactlists(ApiRequest<ContactList> request) throws IOException, ApiException {
    return pcapiClient.<ContactList>invokeAPIVerbose(request, new TypeReference<ContactList>() {});
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws ApiException if fails to make API call
   */
  public void postOutboundConversationDnc(String conversationId) throws IOException, ApiException {
    postOutboundConversationDncWithHttpInfo(conversationId);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postOutboundConversationDncWithHttpInfo(String conversationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'conversationId' is set
    if (conversationId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'conversationId' when calling postOutboundConversationDnc");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/conversations/{conversationId}/dnc".replaceAll("\\{format\\}","json")
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postOutboundConversationDnc(PostOutboundConversationDncRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postOutboundConversationDnc(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return UriReference
   * @throws ApiException if fails to make API call
   */
  public UriReference postOutboundDnclistExport(String dncListId) throws IOException, ApiException {
    return postOutboundDnclistExportWithHttpInfo(dncListId).getBody();
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return UriReference
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UriReference> postOutboundDnclistExportWithHttpInfo(String dncListId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling postOutboundDnclistExport");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}/export".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UriReference>() {});
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UriReference postOutboundDnclistExport(PostOutboundDnclistExportRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UriReference>() {});
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UriReference> postOutboundDnclistExport(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<UriReference>invokeAPIVerbose(request, new TypeReference<UriReference>() {});
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws ApiException if fails to make API call
   */
  public void postOutboundDnclistPhonenumbers(String dncListId, List<String> body) throws IOException, ApiException {
    postOutboundDnclistPhonenumbersWithHttpInfo(dncListId, body);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbersWithHttpInfo(String dncListId, List<String> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling postOutboundDnclistPhonenumbers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundDnclistPhonenumbers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}/phonenumbers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, null);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public void postOutboundDnclistPhonenumbers(PostOutboundDnclistPhonenumbersRequest request) throws IOException, ApiException {
    pcapiClient.invokeAPI(request.withHttpInfo(), null);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbers(ApiRequest<List<String>> request) throws IOException, ApiException {
    return pcapiClient.<Void>invokeAPIVerbose(request, null);
  }

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public DncList postOutboundDnclists(DncListCreate body) throws IOException, ApiException {
    return postOutboundDnclistsWithHttpInfo(body).getBody();
  }

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> postOutboundDnclistsWithHttpInfo(DncListCreate body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundDnclists");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DncList>() {});
  }

  /**
   * Create dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DncList postOutboundDnclists(PostOutboundDnclistsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DncList>() {});
  }

  /**
   * Create dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> postOutboundDnclists(ApiRequest<DncListCreate> request) throws IOException, ApiException {
    return pcapiClient.<DncList>invokeAPIVerbose(request, new TypeReference<DncList>() {});
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public RuleSet postOutboundRulesets(RuleSet body) throws IOException, ApiException {
    return postOutboundRulesetsWithHttpInfo(body).getBody();
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> postOutboundRulesetsWithHttpInfo(RuleSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundRulesets");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/rulesets".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RuleSet>() {});
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RuleSet postOutboundRulesets(PostOutboundRulesetsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RuleSet>() {});
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> postOutboundRulesets(ApiRequest<RuleSet> request) throws IOException, ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerbose(request, new TypeReference<RuleSet>() {});
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence postOutboundSequences(CampaignSequence body) throws IOException, ApiException {
    return postOutboundSequencesWithHttpInfo(body).getBody();
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> postOutboundSequencesWithHttpInfo(CampaignSequence body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postOutboundSequences");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/sequences".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Create a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence postOutboundSequences(PostOutboundSequencesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
  }

  /**
   * Create a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> postOutboundSequences(ApiRequest<CampaignSequence> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerbose(request, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits putOutboundAttemptlimit(String attemptLimitsId, AttemptLimits body) throws IOException, ApiException {
    return putOutboundAttemptlimitWithHttpInfo(attemptLimitsId, body).getBody();
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimitWithHttpInfo(String attemptLimitsId, AttemptLimits body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'attemptLimitsId' is set
    if (attemptLimitsId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'attemptLimitsId' when calling putOutboundAttemptlimit");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundAttemptlimit");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/attemptlimits/{attemptLimitsId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "attemptLimitsId" + "\\}", pcapiClient.escapeString(attemptLimitsId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Update attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public AttemptLimits putOutboundAttemptlimit(PutOutboundAttemptlimitRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
  }

  /**
   * Update attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimit(ApiRequest<AttemptLimits> request) throws IOException, ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerbose(request, new TypeReference<AttemptLimits>() {});
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet putOutboundCallabletimeset(String callableTimeSetId, CallableTimeSet body) throws IOException, ApiException {
    return putOutboundCallabletimesetWithHttpInfo(callableTimeSetId, body).getBody();
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimesetWithHttpInfo(String callableTimeSetId, CallableTimeSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callableTimeSetId' is set
    if (callableTimeSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callableTimeSetId' when calling putOutboundCallabletimeset");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundCallabletimeset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callabletimesets/{callableTimeSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callableTimeSetId" + "\\}", pcapiClient.escapeString(callableTimeSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Update callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CallableTimeSet putOutboundCallabletimeset(PutOutboundCallabletimesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Update callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimeset(ApiRequest<CallableTimeSet> request) throws IOException, ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerbose(request, new TypeReference<CallableTimeSet>() {});
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ResponseSet putOutboundCallanalysisresponseset(String callAnalysisSetId, ResponseSet body) throws IOException, ApiException {
    return putOutboundCallanalysisresponsesetWithHttpInfo(callAnalysisSetId, body).getBody();
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId, ResponseSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'callAnalysisSetId' is set
    if (callAnalysisSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'callAnalysisSetId' when calling putOutboundCallanalysisresponseset");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundCallanalysisresponseset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/callanalysisresponsesets/{callAnalysisSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "callAnalysisSetId" + "\\}", pcapiClient.escapeString(callAnalysisSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ResponseSet>() {});
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ResponseSet putOutboundCallanalysisresponseset(PutOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponseset(ApiRequest<ResponseSet> request) throws IOException, ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerbose(request, new TypeReference<ResponseSet>() {});
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public Campaign putOutboundCampaign(String campaignId, Campaign body) throws IOException, ApiException {
    return putOutboundCampaignWithHttpInfo(campaignId, body).getBody();
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> putOutboundCampaignWithHttpInfo(String campaignId, Campaign body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling putOutboundCampaign");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Campaign>() {});
  }

  /**
   * Update a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Campaign putOutboundCampaign(PutOutboundCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Campaign>() {});
  }

  /**
   * Update a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Campaign> putOutboundCampaign(ApiRequest<Campaign> request) throws IOException, ApiException {
    return pcapiClient.<Campaign>invokeAPIVerbose(request, new TypeReference<Campaign>() {});
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String putOutboundCampaignAgent(String campaignId, String userId, Agent body) throws IOException, ApiException {
    return putOutboundCampaignAgentWithHttpInfo(campaignId, userId, body).getBody();
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> putOutboundCampaignAgentWithHttpInfo(String campaignId, String userId, Agent body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling putOutboundCampaignAgent");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling putOutboundCampaignAgent");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundCampaignAgent");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaigns/{campaignId}/agents/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String putOutboundCampaignAgent(PutOutboundCampaignAgentRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> putOutboundCampaignAgent(ApiRequest<Agent> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public CampaignRule putOutboundCampaignrule(String campaignRuleId, CampaignRule body) throws IOException, ApiException {
    return putOutboundCampaignruleWithHttpInfo(campaignRuleId, body).getBody();
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> putOutboundCampaignruleWithHttpInfo(String campaignRuleId, CampaignRule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'campaignRuleId' is set
    if (campaignRuleId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignRuleId' when calling putOutboundCampaignrule");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundCampaignrule");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/campaignrules/{campaignRuleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignRuleId" + "\\}", pcapiClient.escapeString(campaignRuleId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignRule>() {});
  }

  /**
   * Update Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignRule putOutboundCampaignrule(PutOutboundCampaignruleRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
  }

  /**
   * Update Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignRule> putOutboundCampaignrule(ApiRequest<CampaignRule> request) throws IOException, ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerbose(request, new TypeReference<CampaignRule>() {});
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ContactList putOutboundContactlist(String contactListId, ContactList body) throws IOException, ApiException {
    return putOutboundContactlistWithHttpInfo(contactListId, body).getBody();
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> putOutboundContactlistWithHttpInfo(String contactListId, ContactList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling putOutboundContactlist");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundContactlist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<ContactList>() {});
  }

  /**
   * Update a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ContactList putOutboundContactlist(PutOutboundContactlistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<ContactList>() {});
  }

  /**
   * Update a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ContactList> putOutboundContactlist(ApiRequest<ContactList> request) throws IOException, ApiException {
    return pcapiClient.<ContactList>invokeAPIVerbose(request, new TypeReference<ContactList>() {});
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws ApiException if fails to make API call
   */
  public DialerContact putOutboundContactlistContact(String contactListId, String contactId, DialerContact body) throws IOException, ApiException {
    return putOutboundContactlistContactWithHttpInfo(contactListId, contactId, body).getBody();
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DialerContact> putOutboundContactlistContactWithHttpInfo(String contactListId, String contactId, DialerContact body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'contactListId' is set
    if (contactListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactListId' when calling putOutboundContactlistContact");
    }
    
    // verify the required parameter 'contactId' is set
    if (contactId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'contactId' when calling putOutboundContactlistContact");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundContactlistContact");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/contactlists/{contactListId}/contacts/{contactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contactListId" + "\\}", pcapiClient.escapeString(contactListId.toString()))
      .replaceAll("\\{" + "contactId" + "\\}", pcapiClient.escapeString(contactId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DialerContact>() {});
  }

  /**
   * Update a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DialerContact putOutboundContactlistContact(PutOutboundContactlistContactRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DialerContact>() {});
  }

  /**
   * Update a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DialerContact> putOutboundContactlistContact(ApiRequest<DialerContact> request) throws IOException, ApiException {
    return pcapiClient.<DialerContact>invokeAPIVerbose(request, new TypeReference<DialerContact>() {});
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public DncList putOutboundDnclist(String dncListId, DncList body) throws IOException, ApiException {
    return putOutboundDnclistWithHttpInfo(dncListId, body).getBody();
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> putOutboundDnclistWithHttpInfo(String dncListId, DncList body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'dncListId' is set
    if (dncListId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'dncListId' when calling putOutboundDnclist");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundDnclist");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/dnclists/{dncListId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dncListId" + "\\}", pcapiClient.escapeString(dncListId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<DncList>() {});
  }

  /**
   * Update dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public DncList putOutboundDnclist(PutOutboundDnclistRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<DncList>() {});
  }

  /**
   * Update dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DncList> putOutboundDnclist(ApiRequest<DncList> request) throws IOException, ApiException {
    return pcapiClient.<DncList>invokeAPIVerbose(request, new TypeReference<DncList>() {});
  }

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public RuleSet putOutboundRuleset(String ruleSetId, RuleSet body) throws IOException, ApiException {
    return putOutboundRulesetWithHttpInfo(ruleSetId, body).getBody();
  }

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> putOutboundRulesetWithHttpInfo(String ruleSetId, RuleSet body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'ruleSetId' is set
    if (ruleSetId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'ruleSetId' when calling putOutboundRuleset");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundRuleset");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/rulesets/{ruleSetId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ruleSetId" + "\\}", pcapiClient.escapeString(ruleSetId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RuleSet>() {});
  }

  /**
   * Update a RuleSet.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RuleSet putOutboundRuleset(PutOutboundRulesetRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RuleSet>() {});
  }

  /**
   * Update a RuleSet.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RuleSet> putOutboundRuleset(ApiRequest<RuleSet> request) throws IOException, ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerbose(request, new TypeReference<RuleSet>() {});
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws ApiException if fails to make API call
   */
  public CampaignSchedule putOutboundSchedulesCampaign(String campaignId, CampaignSchedule body) throws IOException, ApiException {
    return putOutboundSchedulesCampaignWithHttpInfo(campaignId, body).getBody();
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaignWithHttpInfo(String campaignId, CampaignSchedule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'campaignId' when calling putOutboundSchedulesCampaign");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundSchedulesCampaign");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/campaigns/{campaignId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "campaignId" + "\\}", pcapiClient.escapeString(campaignId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Update a new campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSchedule putOutboundSchedulesCampaign(PutOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Update a new campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaign(ApiRequest<CampaignSchedule> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIVerbose(request, new TypeReference<CampaignSchedule>() {});
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws ApiException if fails to make API call
   */
  public SequenceSchedule putOutboundSchedulesSequence(String sequenceId, SequenceSchedule body) throws IOException, ApiException {
    return putOutboundSchedulesSequenceWithHttpInfo(sequenceId, body).getBody();
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequenceWithHttpInfo(String sequenceId, SequenceSchedule body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling putOutboundSchedulesSequence");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundSchedulesSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/schedules/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Update a new sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SequenceSchedule putOutboundSchedulesSequence(PutOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Update a new sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequence(ApiRequest<SequenceSchedule> request) throws IOException, ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIVerbose(request, new TypeReference<SequenceSchedule>() {});
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence putOutboundSequence(String sequenceId, CampaignSequence body) throws IOException, ApiException {
    return putOutboundSequenceWithHttpInfo(sequenceId, body).getBody();
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> putOutboundSequenceWithHttpInfo(String sequenceId, CampaignSequence body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'sequenceId' is set
    if (sequenceId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'sequenceId' when calling putOutboundSequence");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundSequence");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/sequences/{sequenceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "sequenceId" + "\\}", pcapiClient.escapeString(sequenceId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Update a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public CampaignSequence putOutboundSequence(PutOutboundSequenceRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
  }

  /**
   * Update a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CampaignSequence> putOutboundSequence(ApiRequest<CampaignSequence> request) throws IOException, ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerbose(request, new TypeReference<CampaignSequence>() {});
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws ApiException if fails to make API call
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(WrapUpCodeMapping body) throws IOException, ApiException {
    return putOutboundWrapupcodemappingsWithHttpInfo(body).getBody();
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappingsWithHttpInfo(WrapUpCodeMapping body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putOutboundWrapupcodemappings");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/outbound/wrapupcodemappings".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapUpCodeMapping>() {});
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(PutOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappings(ApiRequest<WrapUpCodeMapping> request) throws IOException, ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIVerbose(request, new TypeReference<WrapUpCodeMapping>() {});
  }

}
