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
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;


import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingQueueWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteUserRoutingskillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingEmailSetupRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueMediatypeEstimatedwaittimeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.GetRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUserRequest;
import com.mypurecloud.sdk.v2.api.request.PatchRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsQueuesObservationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainRoutesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingEmailDomainsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingLanguagesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueUsersRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueueWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingSkillsRequest;
import com.mypurecloud.sdk.v2.api.request.PostRoutingWrapupcodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostUserRoutingskillsRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingEmailDomainRouteRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingQueueRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingUtilizationRequest;
import com.mypurecloud.sdk.v2.api.request.PutRoutingWrapupcodeRequest;
import com.mypurecloud.sdk.v2.api.request.PutUserRoutingskillRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class RoutingApiAsync {
  private final ApiClient pcapiClient;

  public RoutingApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public RoutingApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingEmailDomainAsync(DeleteRoutingEmailDomainRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingEmailDomainAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingEmailDomainRouteAsync(DeleteRoutingEmailDomainRouteRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingEmailDomainRouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingQueueAsync(DeleteRoutingQueueRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingQueueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete queue member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingQueueUserAsync(DeleteRoutingQueueUserRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete queue member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingQueueUserAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingQueueWrapupcodeAsync(DeleteRoutingQueueWrapupcodeRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingQueueWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingSkillAsync(DeleteRoutingSkillRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingSkillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingUtilizationAsync(DeleteRoutingUtilizationRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingUtilizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Delete wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteRoutingWrapupcodeAsync(DeleteRoutingWrapupcodeRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Delete wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteRoutingWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> deleteUserRoutingskillAsync(DeleteUserRoutingskillRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> deleteUserRoutingskillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Get domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundDomain> getRoutingEmailDomainAsync(GetRoutingEmailDomainRequest request, AsyncApiCallback<InboundDomain> callback) {
    return pcapiClient.<InboundDomain>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundDomain>() {}, callback);
  }

  /**
   * Get domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundDomain>> getRoutingEmailDomainAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundDomain>> callback) {
    return pcapiClient.<InboundDomain>invokeAPIVerboseAsync(request, new TypeReference<InboundDomain>() {}, callback);
  }

  /**
   * Get a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundRoute> getRoutingEmailDomainRouteAsync(GetRoutingEmailDomainRouteRequest request, AsyncApiCallback<InboundRoute> callback) {
    return pcapiClient.<InboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Get a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundRoute>> getRoutingEmailDomainRouteAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    return pcapiClient.<InboundRoute>invokeAPIVerboseAsync(request, new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Get routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundRouteEntityListing> getRoutingEmailDomainRoutesAsync(GetRoutingEmailDomainRoutesRequest request, AsyncApiCallback<InboundRouteEntityListing> callback) {
    return pcapiClient.<InboundRouteEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundRouteEntityListing>() {}, callback);
  }

  /**
   * Get routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundRouteEntityListing>> getRoutingEmailDomainRoutesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundRouteEntityListing>> callback) {
    return pcapiClient.<InboundRouteEntityListing>invokeAPIVerboseAsync(request, new TypeReference<InboundRouteEntityListing>() {}, callback);
  }

  /**
   * Get domains
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundDomainEntityListing> getRoutingEmailDomainsAsync(GetRoutingEmailDomainsRequest request, AsyncApiCallback<InboundDomainEntityListing> callback) {
    return pcapiClient.<InboundDomainEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundDomainEntityListing>() {}, callback);
  }

  /**
   * Get domains
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundDomainEntityListing>> getRoutingEmailDomainsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<InboundDomainEntityListing>> callback) {
    return pcapiClient.<InboundDomainEntityListing>invokeAPIVerboseAsync(request, new TypeReference<InboundDomainEntityListing>() {}, callback);
  }

  /**
   * Get email setup
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EmailSetup> getRoutingEmailSetupAsync(GetRoutingEmailSetupRequest request, AsyncApiCallback<EmailSetup> callback) {
    return pcapiClient.<EmailSetup>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EmailSetup>() {}, callback);
  }

  /**
   * Get email setup
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EmailSetup>> getRoutingEmailSetupAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EmailSetup>> callback) {
    return pcapiClient.<EmailSetup>invokeAPIVerboseAsync(request, new TypeReference<EmailSetup>() {}, callback);
  }

  /**
   * Get the list of supported languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<LanguageEntityListing> getRoutingLanguagesAsync(GetRoutingLanguagesRequest request, AsyncApiCallback<LanguageEntityListing> callback) {
    return pcapiClient.<LanguageEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {}, callback);
  }

  /**
   * Get the list of supported languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<LanguageEntityListing>> getRoutingLanguagesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<LanguageEntityListing>> callback) {
    return pcapiClient.<LanguageEntityListing>invokeAPIVerboseAsync(request, new TypeReference<LanguageEntityListing>() {}, callback);
  }

  /**
   * Get details about this queue.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Queue> getRoutingQueueAsync(GetRoutingQueueRequest request, AsyncApiCallback<Queue> callback) {
    return pcapiClient.<Queue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, callback);
  }

  /**
   * Get details about this queue.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Queue>> getRoutingQueueAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    return pcapiClient.<Queue>invokeAPIVerboseAsync(request, new TypeReference<Queue>() {}, callback);
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittimeAsync(GetRoutingQueueEstimatedwaittimeRequest request, AsyncApiCallback<EstimatedWaitTimePredictions> callback) {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {}, callback);
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EstimatedWaitTimePredictions>> getRoutingQueueEstimatedwaittimeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>> callback) {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIVerboseAsync(request, new TypeReference<EstimatedWaitTimePredictions>() {}, callback);
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittimeAsync(GetRoutingQueueMediatypeEstimatedwaittimeRequest request, AsyncApiCallback<EstimatedWaitTimePredictions> callback) {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIAsync(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {}, callback);
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<EstimatedWaitTimePredictions>> getRoutingQueueMediatypeEstimatedwaittimeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<EstimatedWaitTimePredictions>> callback) {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIVerboseAsync(request, new TypeReference<EstimatedWaitTimePredictions>() {}, callback);
  }

  /**
   * Get the members of this queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueueMemberEntityListing> getRoutingQueueUsersAsync(GetRoutingQueueUsersRequest request, AsyncApiCallback<QueueMemberEntityListing> callback) {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {}, callback);
  }

  /**
   * Get the members of this queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueueMemberEntityListing>> getRoutingQueueUsersAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueueMemberEntityListing>> callback) {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIVerboseAsync(request, new TypeReference<QueueMemberEntityListing>() {}, callback);
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCodeEntityListing> getRoutingQueueWrapupcodesAsync(GetRoutingQueueWrapupcodesRequest request, AsyncApiCallback<WrapupCodeEntityListing> callback) {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {}, callback);
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCodeEntityListing>> getRoutingQueueWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>> callback) {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<WrapupCodeEntityListing>() {}, callback);
  }

  /**
   * Get list of queues.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueueEntityListing> getRoutingQueuesAsync(GetRoutingQueuesRequest request, AsyncApiCallback<QueueEntityListing> callback) {
    return pcapiClient.<QueueEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {}, callback);
  }

  /**
   * Get list of queues.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueueEntityListing>> getRoutingQueuesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<QueueEntityListing>> callback) {
    return pcapiClient.<QueueEntityListing>invokeAPIVerboseAsync(request, new TypeReference<QueueEntityListing>() {}, callback);
  }

  /**
   * Get Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingSkill> getRoutingSkillAsync(GetRoutingSkillRequest request, AsyncApiCallback<RoutingSkill> callback) {
    return pcapiClient.<RoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingSkill>() {}, callback);
  }

  /**
   * Get Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingSkill>> getRoutingSkillAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<RoutingSkill>> callback) {
    return pcapiClient.<RoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<RoutingSkill>() {}, callback);
  }

  /**
   * Get the list of routing skills.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<SkillEntityListing> getRoutingSkillsAsync(GetRoutingSkillsRequest request, AsyncApiCallback<SkillEntityListing> callback) {
    return pcapiClient.<SkillEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<SkillEntityListing>() {}, callback);
  }

  /**
   * Get the list of routing skills.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<SkillEntityListing>> getRoutingSkillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<SkillEntityListing>> callback) {
    return pcapiClient.<SkillEntityListing>invokeAPIVerboseAsync(request, new TypeReference<SkillEntityListing>() {}, callback);
  }

  /**
   * Get the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Utilization> getRoutingUtilizationAsync(GetRoutingUtilizationRequest request, AsyncApiCallback<Utilization> callback) {
    return pcapiClient.<Utilization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Utilization>() {}, callback);
  }

  /**
   * Get the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Utilization>> getRoutingUtilizationAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<Utilization>> callback) {
    return pcapiClient.<Utilization>invokeAPIVerboseAsync(request, new TypeReference<Utilization>() {}, callback);
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCode> getRoutingWrapupcodeAsync(GetRoutingWrapupcodeRequest request, AsyncApiCallback<WrapupCode> callback) {
    return pcapiClient.<WrapupCode>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCode>> getRoutingWrapupcodeAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    return pcapiClient.<WrapupCode>invokeAPIVerboseAsync(request, new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Get list of wrapup codes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCodeEntityListing> getRoutingWrapupcodesAsync(GetRoutingWrapupcodesRequest request, AsyncApiCallback<WrapupCodeEntityListing> callback) {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {}, callback);
  }

  /**
   * Get list of wrapup codes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCodeEntityListing>> getRoutingWrapupcodesAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<WrapupCodeEntityListing>> callback) {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIVerboseAsync(request, new TypeReference<WrapupCodeEntityListing>() {}, callback);
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserSkillEntityListing> getUserRoutingskillsAsync(GetUserRoutingskillsRequest request, AsyncApiCallback<UserSkillEntityListing> callback) {
    return pcapiClient.<UserSkillEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {}, callback);
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserSkillEntityListing>> getUserRoutingskillsAsync(ApiRequest<Void> request, AsyncApiCallback<ApiResponse<UserSkillEntityListing>> callback) {
    return pcapiClient.<UserSkillEntityListing>invokeAPIVerboseAsync(request, new TypeReference<UserSkillEntityListing>() {}, callback);
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueueMember> patchRoutingQueueUserAsync(PatchRoutingQueueUserRequest request, AsyncApiCallback<QueueMember> callback) {
    return pcapiClient.<QueueMember>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueueMember>() {}, callback);
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueueMember>> patchRoutingQueueUserAsync(ApiRequest<QueueMember> request, AsyncApiCallback<ApiResponse<QueueMember>> callback) {
    return pcapiClient.<QueueMember>invokeAPIVerboseAsync(request, new TypeReference<QueueMember>() {}, callback);
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<QueueMemberEntityListing> patchRoutingQueueUsersAsync(PatchRoutingQueueUsersRequest request, AsyncApiCallback<QueueMemberEntityListing> callback) {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIAsync(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {}, callback);
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<QueueMemberEntityListing>> patchRoutingQueueUsersAsync(ApiRequest<List<QueueMember>> request, AsyncApiCallback<ApiResponse<QueueMemberEntityListing>> callback) {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIVerboseAsync(request, new TypeReference<QueueMemberEntityListing>() {}, callback);
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
   * Create a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundRoute> postRoutingEmailDomainRoutesAsync(PostRoutingEmailDomainRoutesRequest request, AsyncApiCallback<InboundRoute> callback) {
    return pcapiClient.<InboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Create a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundRoute>> postRoutingEmailDomainRoutesAsync(ApiRequest<InboundRoute> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    return pcapiClient.<InboundRoute>invokeAPIVerboseAsync(request, new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Create a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundDomain> postRoutingEmailDomainsAsync(PostRoutingEmailDomainsRequest request, AsyncApiCallback<InboundDomain> callback) {
    return pcapiClient.<InboundDomain>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundDomain>() {}, callback);
  }

  /**
   * Create a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundDomain>> postRoutingEmailDomainsAsync(ApiRequest<InboundDomain> request, AsyncApiCallback<ApiResponse<InboundDomain>> callback) {
    return pcapiClient.<InboundDomain>invokeAPIVerboseAsync(request, new TypeReference<InboundDomain>() {}, callback);
  }

  /**
   * Create Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Language> postRoutingLanguagesAsync(PostRoutingLanguagesRequest request, AsyncApiCallback<Language> callback) {
    return pcapiClient.<Language>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Language>() {}, callback);
  }

  /**
   * Create Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Language>> postRoutingLanguagesAsync(ApiRequest<Language> request, AsyncApiCallback<ApiResponse<Language>> callback) {
    return pcapiClient.<Language>invokeAPIVerboseAsync(request, new TypeReference<Language>() {}, callback);
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<String> postRoutingQueueUsersAsync(PostRoutingQueueUsersRequest request, AsyncApiCallback<String> callback) {
    return pcapiClient.<String>invokeAPIAsync(request.withHttpInfo(), new TypeReference<String>() {}, callback);
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<String>> postRoutingQueueUsersAsync(ApiRequest<List<QueueMember>> request, AsyncApiCallback<ApiResponse<String>> callback) {
    return pcapiClient.<String>invokeAPIVerboseAsync(request, new TypeReference<String>() {}, callback);
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<List<WrapupCode>> postRoutingQueueWrapupcodesAsync(PostRoutingQueueWrapupcodesRequest request, AsyncApiCallback<List<WrapupCode>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIAsync(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<List<WrapupCode>>> postRoutingQueueWrapupcodesAsync(ApiRequest<List<WrapupCode>> request, AsyncApiCallback<ApiResponse<List<WrapupCode>>> callback) {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerboseAsync(request, new TypeReference<List<WrapupCode>>() {}, callback);
  }

  /**
   * Create queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Queue> postRoutingQueuesAsync(PostRoutingQueuesRequest request, AsyncApiCallback<Queue> callback) {
    return pcapiClient.<Queue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, callback);
  }

  /**
   * Create queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Queue>> postRoutingQueuesAsync(ApiRequest<CreateQueueRequest> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    return pcapiClient.<Queue>invokeAPIVerboseAsync(request, new TypeReference<Queue>() {}, callback);
  }

  /**
   * Create Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<RoutingSkill> postRoutingSkillsAsync(PostRoutingSkillsRequest request, AsyncApiCallback<RoutingSkill> callback) {
    return pcapiClient.<RoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<RoutingSkill>() {}, callback);
  }

  /**
   * Create Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<RoutingSkill>> postRoutingSkillsAsync(ApiRequest<RoutingSkill> request, AsyncApiCallback<ApiResponse<RoutingSkill>> callback) {
    return pcapiClient.<RoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<RoutingSkill>() {}, callback);
  }

  /**
   * Create a wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCode> postRoutingWrapupcodesAsync(PostRoutingWrapupcodesRequest request, AsyncApiCallback<WrapupCode> callback) {
    return pcapiClient.<WrapupCode>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Create a wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCode>> postRoutingWrapupcodesAsync(ApiRequest<WrapupCode> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    return pcapiClient.<WrapupCode>invokeAPIVerboseAsync(request, new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRoutingSkill> postUserRoutingskillsAsync(PostUserRoutingskillsRequest request, AsyncApiCallback<UserRoutingSkill> callback) {
    return pcapiClient.<UserRoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRoutingSkill>> postUserRoutingskillsAsync(ApiRequest<UserRoutingSkillPost> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Update a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<InboundRoute> putRoutingEmailDomainRouteAsync(PutRoutingEmailDomainRouteRequest request, AsyncApiCallback<InboundRoute> callback) {
    return pcapiClient.<InboundRoute>invokeAPIAsync(request.withHttpInfo(), new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Update a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<InboundRoute>> putRoutingEmailDomainRouteAsync(ApiRequest<InboundRoute> request, AsyncApiCallback<ApiResponse<InboundRoute>> callback) {
    return pcapiClient.<InboundRoute>invokeAPIVerboseAsync(request, new TypeReference<InboundRoute>() {}, callback);
  }

  /**
   * Update a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Queue> putRoutingQueueAsync(PutRoutingQueueRequest request, AsyncApiCallback<Queue> callback) {
    return pcapiClient.<Queue>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Queue>() {}, callback);
  }

  /**
   * Update a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Queue>> putRoutingQueueAsync(ApiRequest<Queue> request, AsyncApiCallback<ApiResponse<Queue>> callback) {
    return pcapiClient.<Queue>invokeAPIVerboseAsync(request, new TypeReference<Queue>() {}, callback);
  }

  /**
   * Update the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<Utilization> putRoutingUtilizationAsync(PutRoutingUtilizationRequest request, AsyncApiCallback<Utilization> callback) {
    return pcapiClient.<Utilization>invokeAPIAsync(request.withHttpInfo(), new TypeReference<Utilization>() {}, callback);
  }

  /**
   * Update the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<Utilization>> putRoutingUtilizationAsync(ApiRequest<Utilization> request, AsyncApiCallback<ApiResponse<Utilization>> callback) {
    return pcapiClient.<Utilization>invokeAPIVerboseAsync(request, new TypeReference<Utilization>() {}, callback);
  }

  /**
   * Update wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<WrapupCode> putRoutingWrapupcodeAsync(PutRoutingWrapupcodeRequest request, AsyncApiCallback<WrapupCode> callback) {
    return pcapiClient.<WrapupCode>invokeAPIAsync(request.withHttpInfo(), new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Update wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<WrapupCode>> putRoutingWrapupcodeAsync(ApiRequest<WrapupCode> request, AsyncApiCallback<ApiResponse<WrapupCode>> callback) {
    return pcapiClient.<WrapupCode>invokeAPIVerboseAsync(request, new TypeReference<WrapupCode>() {}, callback);
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<UserRoutingSkill> putUserRoutingskillAsync(PutUserRoutingskillRequest request, AsyncApiCallback<UserRoutingSkill> callback) {
    return pcapiClient.<UserRoutingSkill>invokeAPIAsync(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {}, callback);
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Future<ApiResponse<UserRoutingSkill>> putUserRoutingskillAsync(ApiRequest<UserRoutingSkill> request, AsyncApiCallback<ApiResponse<UserRoutingSkill>> callback) {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerboseAsync(request, new TypeReference<UserRoutingSkill>() {}, callback);
  }

}
