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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class OutboundApiAsync {
  private final ApiClient pcapiClient;

  public OutboundApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundAttemptlimitAsync(DeleteOutboundAttemptlimitRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundAttemptlimitAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundCallabletimesetAsync(DeleteOutboundCallabletimesetRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundCallabletimesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundCallanalysisresponsesetAsync(DeleteOutboundCallanalysisresponsesetRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundCallanalysisresponsesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Campaign> deleteOutboundCampaignAsync(DeleteOutboundCampaignRequest request, AsyncApiCallback<Campaign> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Delete a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Campaign>> deleteOutboundCampaignAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Campaign>> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIVerboseAsync(request, new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> deleteOutboundCampaignProgressAsync(DeleteOutboundCampaignProgressRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> deleteOutboundCampaignProgressAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Delete Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundCampaignruleAsync(DeleteOutboundCampaignruleRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundCampaignruleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundContactlistAsync(DeleteOutboundContactlistRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundContactlistAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundContactlistContactAsync(DeleteOutboundContactlistContactRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundContactlistContactAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundDnclistAsync(DeleteOutboundDnclistRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundDnclistAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Rule set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundRulesetAsync(DeleteOutboundRulesetRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a Rule set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundRulesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundSchedulesCampaignAsync(DeleteOutboundSchedulesCampaignRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundSchedulesCampaignAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundSchedulesSequenceAsync(DeleteOutboundSchedulesSequenceRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundSchedulesSequenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteOutboundSequenceAsync(DeleteOutboundSequenceRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteOutboundSequenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttemptLimits> getOutboundAttemptlimitAsync(GetOutboundAttemptlimitRequest request, AsyncApiCallback<AttemptLimits> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Get attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttemptLimits>> getOutboundAttemptlimitAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AttemptLimits>> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerboseAsync(request, new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Query attempt limits list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttemptLimitsEntityListing> getOutboundAttemptlimitsAsync(GetOutboundAttemptlimitsRequest request, AsyncApiCallback<AttemptLimitsEntityListing> callback) throws ApiException {
    return pcapiClient.<AttemptLimitsEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttemptLimitsEntityListing>() {}, callback);
  }

  /**
   * Query attempt limits list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttemptLimitsEntityListing>> getOutboundAttemptlimitsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<AttemptLimitsEntityListing>> callback) throws ApiException {
    return pcapiClient.<AttemptLimitsEntityListing>invokeAPIVerboseAsync(request, new TypeReference<AttemptLimitsEntityListing>() {}, callback);
  }

  /**
   * Get callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallableTimeSet> getOutboundCallabletimesetAsync(GetOutboundCallabletimesetRequest request, AsyncApiCallback<CallableTimeSet> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Get callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallableTimeSet>> getOutboundCallabletimesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerboseAsync(request, new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Query callable time set list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallableTimeSetEntityListing> getOutboundCallabletimesetsAsync(GetOutboundCallabletimesetsRequest request, AsyncApiCallback<CallableTimeSetEntityListing> callback) throws ApiException {
    return pcapiClient.<CallableTimeSetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallableTimeSetEntityListing>() {}, callback);
  }

  /**
   * Query callable time set list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallableTimeSetEntityListing>> getOutboundCallabletimesetsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CallableTimeSetEntityListing>> callback) throws ApiException {
    return pcapiClient.<CallableTimeSetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CallableTimeSetEntityListing>() {}, callback);
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseSet> getOutboundCallanalysisresponsesetAsync(GetOutboundCallanalysisresponsesetRequest request, AsyncApiCallback<ResponseSet> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseSet>> getOutboundCallanalysisresponsesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ResponseSet>> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerboseAsync(request, new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseSetEntityListing> getOutboundCallanalysisresponsesetsAsync(GetOutboundCallanalysisresponsesetsRequest request, AsyncApiCallback<ResponseSetEntityListing> callback) throws ApiException {
    return pcapiClient.<ResponseSetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseSetEntityListing>() {}, callback);
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseSetEntityListing>> getOutboundCallanalysisresponsesetsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ResponseSetEntityListing>> callback) throws ApiException {
    return pcapiClient.<ResponseSetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ResponseSetEntityListing>() {}, callback);
  }

  /**
   * Get dialer campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Campaign> getOutboundCampaignAsync(GetOutboundCampaignRequest request, AsyncApiCallback<Campaign> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Get dialer campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Campaign>> getOutboundCampaignAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Campaign>> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIVerboseAsync(request, new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Get campaign diagnostics
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignDiagnostics> getOutboundCampaignDiagnosticsAsync(GetOutboundCampaignDiagnosticsRequest request, AsyncApiCallback<CampaignDiagnostics> callback) throws ApiException {
    return pcapiClient.<CampaignDiagnostics>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignDiagnostics>() {}, callback);
  }

  /**
   * Get campaign diagnostics
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignDiagnostics>> getOutboundCampaignDiagnosticsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignDiagnostics>> callback) throws ApiException {
    return pcapiClient.<CampaignDiagnostics>invokeAPIVerboseAsync(request, new TypeReference<CampaignDiagnostics>() {}, callback);
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignInteractions> getOutboundCampaignInteractionsAsync(GetOutboundCampaignInteractionsRequest request, AsyncApiCallback<CampaignInteractions> callback) throws ApiException {
    return pcapiClient.<CampaignInteractions>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignInteractions>() {}, callback);
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignInteractions>> getOutboundCampaignInteractionsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignInteractions>> callback) throws ApiException {
    return pcapiClient.<CampaignInteractions>invokeAPIVerboseAsync(request, new TypeReference<CampaignInteractions>() {}, callback);
  }

  /**
   * Get campaign progress
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignProgress> getOutboundCampaignProgressAsync(GetOutboundCampaignProgressRequest request, AsyncApiCallback<CampaignProgress> callback) throws ApiException {
    return pcapiClient.<CampaignProgress>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignProgress>() {}, callback);
  }

  /**
   * Get campaign progress
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignProgress>> getOutboundCampaignProgressAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignProgress>> callback) throws ApiException {
    return pcapiClient.<CampaignProgress>invokeAPIVerboseAsync(request, new TypeReference<CampaignProgress>() {}, callback);
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignStats> getOutboundCampaignStatsAsync(GetOutboundCampaignStatsRequest request, AsyncApiCallback<CampaignStats> callback) throws ApiException {
    return pcapiClient.<CampaignStats>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignStats>() {}, callback);
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignStats>> getOutboundCampaignStatsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignStats>> callback) throws ApiException {
    return pcapiClient.<CampaignStats>invokeAPIVerboseAsync(request, new TypeReference<CampaignStats>() {}, callback);
  }

  /**
   * Get Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignRule> getOutboundCampaignruleAsync(GetOutboundCampaignruleRequest request, AsyncApiCallback<CampaignRule> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Get Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignRule>> getOutboundCampaignruleAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignRule>> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerboseAsync(request, new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Query Campaign Rule list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignRuleEntityListing> getOutboundCampaignrulesAsync(GetOutboundCampaignrulesRequest request, AsyncApiCallback<CampaignRuleEntityListing> callback) throws ApiException {
    return pcapiClient.<CampaignRuleEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignRuleEntityListing>() {}, callback);
  }

  /**
   * Query Campaign Rule list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignRuleEntityListing>> getOutboundCampaignrulesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignRuleEntityListing>> callback) throws ApiException {
    return pcapiClient.<CampaignRuleEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CampaignRuleEntityListing>() {}, callback);
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignEntityListing> getOutboundCampaignsAsync(GetOutboundCampaignsRequest request, AsyncApiCallback<CampaignEntityListing> callback) throws ApiException {
    return pcapiClient.<CampaignEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignEntityListing>() {}, callback);
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignEntityListing>> getOutboundCampaignsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignEntityListing>> callback) throws ApiException {
    return pcapiClient.<CampaignEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CampaignEntityListing>() {}, callback);
  }

  /**
   * Get a dialer contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactList> getOutboundContactlistAsync(GetOutboundContactlistRequest request, AsyncApiCallback<ContactList> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Get a dialer contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactList>> getOutboundContactlistAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ContactList>> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIVerboseAsync(request, new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Get a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DialerContact> getOutboundContactlistContactAsync(GetOutboundContactlistContactRequest request, AsyncApiCallback<DialerContact> callback) throws ApiException {
    return pcapiClient.<DialerContact>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DialerContact>() {}, callback);
  }

  /**
   * Get a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DialerContact>> getOutboundContactlistContactAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DialerContact>> callback) throws ApiException {
    return pcapiClient.<DialerContact>invokeAPIVerboseAsync(request, new TypeReference<DialerContact>() {}, callback);
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExportUri> getOutboundContactlistExportAsync(GetOutboundContactlistExportRequest request, AsyncApiCallback<ExportUri> callback) throws ApiException {
    return pcapiClient.<ExportUri>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExportUri>() {}, callback);
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExportUri>> getOutboundContactlistExportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExportUri>> callback) throws ApiException {
    return pcapiClient.<ExportUri>invokeAPIVerboseAsync(request, new TypeReference<ExportUri>() {}, callback);
  }

  /**
   * Get dialer contactList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ImportStatus> getOutboundContactlistImportstatusAsync(GetOutboundContactlistImportstatusRequest request, AsyncApiCallback<ImportStatus> callback) throws ApiException {
    return pcapiClient.<ImportStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ImportStatus>() {}, callback);
  }

  /**
   * Get dialer contactList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ImportStatus>> getOutboundContactlistImportstatusAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ImportStatus>> callback) throws ApiException {
    return pcapiClient.<ImportStatus>invokeAPIVerboseAsync(request, new TypeReference<ImportStatus>() {}, callback);
  }

  /**
   * Query a list of contact lists.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactListEntityListing> getOutboundContactlistsAsync(GetOutboundContactlistsRequest request, AsyncApiCallback<ContactListEntityListing> callback) throws ApiException {
    return pcapiClient.<ContactListEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactListEntityListing>() {}, callback);
  }

  /**
   * Query a list of contact lists.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactListEntityListing>> getOutboundContactlistsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ContactListEntityListing>> callback) throws ApiException {
    return pcapiClient.<ContactListEntityListing>invokeAPIVerboseAsync(request, new TypeReference<ContactListEntityListing>() {}, callback);
  }

  /**
   * Get dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DncList> getOutboundDnclistAsync(GetOutboundDnclistRequest request, AsyncApiCallback<DncList> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, callback);
  }

  /**
   * Get dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DncList>> getOutboundDnclistAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DncList>> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIVerboseAsync(request, new TypeReference<DncList>() {}, callback);
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ExportUri> getOutboundDnclistExportAsync(GetOutboundDnclistExportRequest request, AsyncApiCallback<ExportUri> callback) throws ApiException {
    return pcapiClient.<ExportUri>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ExportUri>() {}, callback);
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ExportUri>> getOutboundDnclistExportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ExportUri>> callback) throws ApiException {
    return pcapiClient.<ExportUri>invokeAPIVerboseAsync(request, new TypeReference<ExportUri>() {}, callback);
  }

  /**
   * Get dialer dncList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ImportStatus> getOutboundDnclistImportstatusAsync(GetOutboundDnclistImportstatusRequest request, AsyncApiCallback<ImportStatus> callback) throws ApiException {
    return pcapiClient.<ImportStatus>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ImportStatus>() {}, callback);
  }

  /**
   * Get dialer dncList import status.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ImportStatus>> getOutboundDnclistImportstatusAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<ImportStatus>> callback) throws ApiException {
    return pcapiClient.<ImportStatus>invokeAPIVerboseAsync(request, new TypeReference<ImportStatus>() {}, callback);
  }

  /**
   * Query dialer DNC lists
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DncListEntityListing> getOutboundDnclistsAsync(GetOutboundDnclistsRequest request, AsyncApiCallback<DncListEntityListing> callback) throws ApiException {
    return pcapiClient.<DncListEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DncListEntityListing>() {}, callback);
  }

  /**
   * Query dialer DNC lists
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DncListEntityListing>> getOutboundDnclistsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<DncListEntityListing>> callback) throws ApiException {
    return pcapiClient.<DncListEntityListing>invokeAPIVerboseAsync(request, new TypeReference<DncListEntityListing>() {}, callback);
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RuleSet> getOutboundRulesetAsync(GetOutboundRulesetRequest request, AsyncApiCallback<RuleSet> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RuleSet>> getOutboundRulesetAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RuleSet>> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerboseAsync(request, new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RuleSetEntityListing> getOutboundRulesetsAsync(GetOutboundRulesetsRequest request, AsyncApiCallback<RuleSetEntityListing> callback) throws ApiException {
    return pcapiClient.<RuleSetEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RuleSetEntityListing>() {}, callback);
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RuleSetEntityListing>> getOutboundRulesetsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RuleSetEntityListing>> callback) throws ApiException {
    return pcapiClient.<RuleSetEntityListing>invokeAPIVerboseAsync(request, new TypeReference<RuleSetEntityListing>() {}, callback);
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSchedule> getOutboundSchedulesCampaignAsync(GetOutboundSchedulesCampaignRequest request, AsyncApiCallback<CampaignSchedule> callback) throws ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {}, callback);
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSchedule>> getOutboundSchedulesCampaignAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignSchedule>> callback) throws ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIVerboseAsync(request, new TypeReference<CampaignSchedule>() {}, callback);
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<CampaignSchedule>> getOutboundSchedulesCampaignsAsync(GetOutboundSchedulesCampaignsRequest request, AsyncApiCallback<List<CampaignSchedule>> callback) throws ApiException {
    return pcapiClient.<List<CampaignSchedule>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<CampaignSchedule>>() {}, callback);
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<CampaignSchedule>>> getOutboundSchedulesCampaignsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<CampaignSchedule>>> callback) throws ApiException {
    return pcapiClient.<List<CampaignSchedule>>invokeAPIVerboseAsync(request, new TypeReference<List<CampaignSchedule>>() {}, callback);
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SequenceSchedule> getOutboundSchedulesSequenceAsync(GetOutboundSchedulesSequenceRequest request, AsyncApiCallback<SequenceSchedule> callback) throws ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {}, callback);
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SequenceSchedule>> getOutboundSchedulesSequenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SequenceSchedule>> callback) throws ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIVerboseAsync(request, new TypeReference<SequenceSchedule>() {}, callback);
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<SequenceSchedule>> getOutboundSchedulesSequencesAsync(GetOutboundSchedulesSequencesRequest request, AsyncApiCallback<List<SequenceSchedule>> callback) throws ApiException {
    return pcapiClient.<List<SequenceSchedule>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<SequenceSchedule>>() {}, callback);
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<SequenceSchedule>>> getOutboundSchedulesSequencesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<List<SequenceSchedule>>> callback) throws ApiException {
    return pcapiClient.<List<SequenceSchedule>>invokeAPIVerboseAsync(request, new TypeReference<List<SequenceSchedule>>() {}, callback);
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSequence> getOutboundSequenceAsync(GetOutboundSequenceRequest request, AsyncApiCallback<CampaignSequence> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSequence>> getOutboundSequenceAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignSequence>> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerboseAsync(request, new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSequenceEntityListing> getOutboundSequencesAsync(GetOutboundSequencesRequest request, AsyncApiCallback<CampaignSequenceEntityListing> callback) throws ApiException {
    return pcapiClient.<CampaignSequenceEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSequenceEntityListing>() {}, callback);
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSequenceEntityListing>> getOutboundSequencesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<CampaignSequenceEntityListing>> callback) throws ApiException {
    return pcapiClient.<CampaignSequenceEntityListing>invokeAPIVerboseAsync(request, new TypeReference<CampaignSequenceEntityListing>() {}, callback);
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapUpCodeMapping> getOutboundWrapupcodemappingsAsync(GetOutboundWrapupcodemappingsRequest request, AsyncApiCallback<WrapUpCodeMapping> callback) throws ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {}, callback);
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapUpCodeMapping>> getOutboundWrapupcodemappingsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapUpCodeMapping>> callback) throws ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIVerboseAsync(request, new TypeReference<WrapUpCodeMapping>() {}, callback);
  }

  /**
   * Create attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttemptLimits> postOutboundAttemptlimitsAsync(PostOutboundAttemptlimitsRequest request, AsyncApiCallback<AttemptLimits> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Create attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttemptLimits>> postOutboundAttemptlimitsAsync(ApiRequest<AttemptLimits> request, AsyncApiCallback<ApiResponse<AttemptLimits>> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerboseAsync(request, new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AuditSearchResult> postOutboundAuditsAsync(PostOutboundAuditsRequest request, AsyncApiCallback<AuditSearchResult> callback) throws ApiException {
    return pcapiClient.<AuditSearchResult>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AuditSearchResult>() {}, callback);
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AuditSearchResult>> postOutboundAuditsAsync(ApiRequest<DialerAuditRequest> request, AsyncApiCallback<ApiResponse<AuditSearchResult>> callback) throws ApiException {
    return pcapiClient.<AuditSearchResult>invokeAPIVerboseAsync(request, new TypeReference<AuditSearchResult>() {}, callback);
  }

  /**
   * Create callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallableTimeSet> postOutboundCallabletimesetsAsync(PostOutboundCallabletimesetsRequest request, AsyncApiCallback<CallableTimeSet> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Create callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallableTimeSet>> postOutboundCallabletimesetsAsync(ApiRequest<CallableTimeSet> request, AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerboseAsync(request, new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseSet> postOutboundCallanalysisresponsesetsAsync(PostOutboundCallanalysisresponsesetsRequest request, AsyncApiCallback<ResponseSet> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseSet>> postOutboundCallanalysisresponsesetsAsync(ApiRequest<ResponseSet> request, AsyncApiCallback<ApiResponse<ResponseSet>> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerboseAsync(request, new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactCallbackRequest> postOutboundCampaignCallbackScheduleAsync(PostOutboundCampaignCallbackScheduleRequest request, AsyncApiCallback<ContactCallbackRequest> callback) throws ApiException {
    return pcapiClient.<ContactCallbackRequest>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactCallbackRequest>() {}, callback);
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactCallbackRequest>> postOutboundCampaignCallbackScheduleAsync(ApiRequest<ContactCallbackRequest> request, AsyncApiCallback<ApiResponse<ContactCallbackRequest>> callback) throws ApiException {
    return pcapiClient.<ContactCallbackRequest>invokeAPIVerboseAsync(request, new TypeReference<ContactCallbackRequest>() {}, callback);
  }

  /**
   * Create Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignRule> postOutboundCampaignrulesAsync(PostOutboundCampaignrulesRequest request, AsyncApiCallback<CampaignRule> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Create Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignRule>> postOutboundCampaignrulesAsync(ApiRequest<CampaignRule> request, AsyncApiCallback<ApiResponse<CampaignRule>> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerboseAsync(request, new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Create a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Campaign> postOutboundCampaignsAsync(PostOutboundCampaignsRequest request, AsyncApiCallback<Campaign> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Create a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Campaign>> postOutboundCampaignsAsync(ApiRequest<Campaign> request, AsyncApiCallback<ApiResponse<Campaign>> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIVerboseAsync(request, new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<CampaignProgress>> postOutboundCampaignsProgressAsync(PostOutboundCampaignsProgressRequest request, AsyncApiCallback<List<CampaignProgress>> callback) throws ApiException {
    return pcapiClient.<List<CampaignProgress>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {}, callback);
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<CampaignProgress>>> postOutboundCampaignsProgressAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<List<CampaignProgress>>> callback) throws ApiException {
    return pcapiClient.<List<CampaignProgress>>invokeAPIVerboseAsync(request, new TypeReference<List<CampaignProgress>>() {}, callback);
  }

  /**
   * Add contacts to a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<DialerContact>> postOutboundContactlistContactsAsync(PostOutboundContactlistContactsRequest request, AsyncApiCallback<List<DialerContact>> callback) throws ApiException {
    return pcapiClient.<List<DialerContact>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {}, callback);
  }

  /**
   * Add contacts to a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<DialerContact>>> postOutboundContactlistContactsAsync(ApiRequest<List<DialerContact>> request, AsyncApiCallback<ApiResponse<List<DialerContact>>> callback) throws ApiException {
    return pcapiClient.<List<DialerContact>>invokeAPIVerboseAsync(request, new TypeReference<List<DialerContact>>() {}, callback);
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UriReference> postOutboundContactlistExportAsync(PostOutboundContactlistExportRequest request, AsyncApiCallback<UriReference> callback) throws ApiException {
    return pcapiClient.<UriReference>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UriReference>() {}, callback);
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UriReference>> postOutboundContactlistExportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UriReference>> callback) throws ApiException {
    return pcapiClient.<UriReference>invokeAPIVerboseAsync(request, new TypeReference<UriReference>() {}, callback);
  }

  /**
   * Create a contact List.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactList> postOutboundContactlistsAsync(PostOutboundContactlistsRequest request, AsyncApiCallback<ContactList> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Create a contact List.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactList>> postOutboundContactlistsAsync(ApiRequest<ContactList> request, AsyncApiCallback<ApiResponse<ContactList>> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIVerboseAsync(request, new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postOutboundConversationDncAsync(PostOutboundConversationDncRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postOutboundConversationDncAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UriReference> postOutboundDnclistExportAsync(PostOutboundDnclistExportRequest request, AsyncApiCallback<UriReference> callback) throws ApiException {
    return pcapiClient.<UriReference>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UriReference>() {}, callback);
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UriReference>> postOutboundDnclistExportAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UriReference>> callback) throws ApiException {
    return pcapiClient.<UriReference>invokeAPIVerboseAsync(request, new TypeReference<UriReference>() {}, callback);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Void> postOutboundDnclistPhonenumbersAsync(PostOutboundDnclistPhonenumbersRequest request, AsyncApiCallback<Void> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIAsync(request.withHttpInfo(), null, callback);
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Void>> postOutboundDnclistPhonenumbersAsync(ApiRequest<List<String>> request, AsyncApiCallback<ApiResponse<Void>> callback) throws ApiException {
    return pcapiClient.<Void>invokeAPIVerboseAsync(request, null, callback);
  }

  /**
   * Create dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DncList> postOutboundDnclistsAsync(PostOutboundDnclistsRequest request, AsyncApiCallback<DncList> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, callback);
  }

  /**
   * Create dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DncList>> postOutboundDnclistsAsync(ApiRequest<DncListCreate> request, AsyncApiCallback<ApiResponse<DncList>> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIVerboseAsync(request, new TypeReference<DncList>() {}, callback);
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RuleSet> postOutboundRulesetsAsync(PostOutboundRulesetsRequest request, AsyncApiCallback<RuleSet> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RuleSet>> postOutboundRulesetsAsync(ApiRequest<RuleSet> request, AsyncApiCallback<ApiResponse<RuleSet>> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerboseAsync(request, new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Create a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSequence> postOutboundSequencesAsync(PostOutboundSequencesRequest request, AsyncApiCallback<CampaignSequence> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Create a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSequence>> postOutboundSequencesAsync(ApiRequest<CampaignSequence> request, AsyncApiCallback<ApiResponse<CampaignSequence>> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerboseAsync(request, new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Update attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<AttemptLimits> putOutboundAttemptlimitAsync(PutOutboundAttemptlimitRequest request, AsyncApiCallback<AttemptLimits> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIAsync(request.withHttpInfo(), new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Update attempt limits
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<AttemptLimits>> putOutboundAttemptlimitAsync(ApiRequest<AttemptLimits> request, AsyncApiCallback<ApiResponse<AttemptLimits>> callback) throws ApiException {
    return pcapiClient.<AttemptLimits>invokeAPIVerboseAsync(request, new TypeReference<AttemptLimits>() {}, callback);
  }

  /**
   * Update callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CallableTimeSet> putOutboundCallabletimesetAsync(PutOutboundCallabletimesetRequest request, AsyncApiCallback<CallableTimeSet> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Update callable time set
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CallableTimeSet>> putOutboundCallabletimesetAsync(ApiRequest<CallableTimeSet> request, AsyncApiCallback<ApiResponse<CallableTimeSet>> callback) throws ApiException {
    return pcapiClient.<CallableTimeSet>invokeAPIVerboseAsync(request, new TypeReference<CallableTimeSet>() {}, callback);
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ResponseSet> putOutboundCallanalysisresponsesetAsync(PutOutboundCallanalysisresponsesetRequest request, AsyncApiCallback<ResponseSet> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ResponseSet>> putOutboundCallanalysisresponsesetAsync(ApiRequest<ResponseSet> request, AsyncApiCallback<ApiResponse<ResponseSet>> callback) throws ApiException {
    return pcapiClient.<ResponseSet>invokeAPIVerboseAsync(request, new TypeReference<ResponseSet>() {}, callback);
  }

  /**
   * Update a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Campaign> putOutboundCampaignAsync(PutOutboundCampaignRequest request, AsyncApiCallback<Campaign> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Update a campaign.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Campaign>> putOutboundCampaignAsync(ApiRequest<Campaign> request, AsyncApiCallback<ApiResponse<Campaign>> callback) throws ApiException {
    return pcapiClient.<Campaign>invokeAPIVerboseAsync(request, new TypeReference<Campaign>() {}, callback);
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> putOutboundCampaignAgentAsync(PutOutboundCampaignAgentRequest request, AsyncApiCallback<String> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> putOutboundCampaignAgentAsync(ApiRequest<Agent> request, AsyncApiCallback<ApiResponse<String>> callback) throws ApiException {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Update Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignRule> putOutboundCampaignruleAsync(PutOutboundCampaignruleRequest request, AsyncApiCallback<CampaignRule> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Update Campaign Rule
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignRule>> putOutboundCampaignruleAsync(ApiRequest<CampaignRule> request, AsyncApiCallback<ApiResponse<CampaignRule>> callback) throws ApiException {
    return pcapiClient.<CampaignRule>invokeAPIVerboseAsync(request, new TypeReference<CampaignRule>() {}, callback);
  }

  /**
   * Update a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ContactList> putOutboundContactlistAsync(PutOutboundContactlistRequest request, AsyncApiCallback<ContactList> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Update a contact list.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<ContactList>> putOutboundContactlistAsync(ApiRequest<ContactList> request, AsyncApiCallback<ApiResponse<ContactList>> callback) throws ApiException {
    return pcapiClient.<ContactList>invokeAPIVerboseAsync(request, new TypeReference<ContactList>() {}, callback);
  }

  /**
   * Update a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DialerContact> putOutboundContactlistContactAsync(PutOutboundContactlistContactRequest request, AsyncApiCallback<DialerContact> callback) throws ApiException {
    return pcapiClient.<DialerContact>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DialerContact>() {}, callback);
  }

  /**
   * Update a contact.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DialerContact>> putOutboundContactlistContactAsync(ApiRequest<DialerContact> request, AsyncApiCallback<ApiResponse<DialerContact>> callback) throws ApiException {
    return pcapiClient.<DialerContact>invokeAPIVerboseAsync(request, new TypeReference<DialerContact>() {}, callback);
  }

  /**
   * Update dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<DncList> putOutboundDnclistAsync(PutOutboundDnclistRequest request, AsyncApiCallback<DncList> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIAsync(request.withHttpInfo(), new TypeReference<DncList>() {}, callback);
  }

  /**
   * Update dialer DNC list
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<DncList>> putOutboundDnclistAsync(ApiRequest<DncList> request, AsyncApiCallback<ApiResponse<DncList>> callback) throws ApiException {
    return pcapiClient.<DncList>invokeAPIVerboseAsync(request, new TypeReference<DncList>() {}, callback);
  }

  /**
   * Update a RuleSet.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RuleSet> putOutboundRulesetAsync(PutOutboundRulesetRequest request, AsyncApiCallback<RuleSet> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Update a RuleSet.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RuleSet>> putOutboundRulesetAsync(ApiRequest<RuleSet> request, AsyncApiCallback<ApiResponse<RuleSet>> callback) throws ApiException {
    return pcapiClient.<RuleSet>invokeAPIVerboseAsync(request, new TypeReference<RuleSet>() {}, callback);
  }

  /**
   * Update a new campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSchedule> putOutboundSchedulesCampaignAsync(PutOutboundSchedulesCampaignRequest request, AsyncApiCallback<CampaignSchedule> callback) throws ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {}, callback);
  }

  /**
   * Update a new campaign schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSchedule>> putOutboundSchedulesCampaignAsync(ApiRequest<CampaignSchedule> request, AsyncApiCallback<ApiResponse<CampaignSchedule>> callback) throws ApiException {
    return pcapiClient.<CampaignSchedule>invokeAPIVerboseAsync(request, new TypeReference<CampaignSchedule>() {}, callback);
  }

  /**
   * Update a new sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SequenceSchedule> putOutboundSchedulesSequenceAsync(PutOutboundSchedulesSequenceRequest request, AsyncApiCallback<SequenceSchedule> callback) throws ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {}, callback);
  }

  /**
   * Update a new sequence schedule.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SequenceSchedule>> putOutboundSchedulesSequenceAsync(ApiRequest<SequenceSchedule> request, AsyncApiCallback<ApiResponse<SequenceSchedule>> callback) throws ApiException {
    return pcapiClient.<SequenceSchedule>invokeAPIVerboseAsync(request, new TypeReference<SequenceSchedule>() {}, callback);
  }

  /**
   * Update a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<CampaignSequence> putOutboundSequenceAsync(PutOutboundSequenceRequest request, AsyncApiCallback<CampaignSequence> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIAsync(request.withHttpInfo(), new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Update a new campaign sequence.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<CampaignSequence>> putOutboundSequenceAsync(ApiRequest<CampaignSequence> request, AsyncApiCallback<ApiResponse<CampaignSequence>> callback) throws ApiException {
    return pcapiClient.<CampaignSequence>invokeAPIVerboseAsync(request, new TypeReference<CampaignSequence>() {}, callback);
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapUpCodeMapping> putOutboundWrapupcodemappingsAsync(PutOutboundWrapupcodemappingsRequest request, AsyncApiCallback<WrapUpCodeMapping> callback) throws ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {}, callback);
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapUpCodeMapping>> putOutboundWrapupcodemappingsAsync(ApiRequest<WrapUpCodeMapping> request, AsyncApiCallback<ApiResponse<WrapUpCodeMapping>> callback) throws ApiException {
    return pcapiClient.<WrapUpCodeMapping>invokeAPIVerboseAsync(request, new TypeReference<WrapUpCodeMapping>() {}, callback);
  }

}
