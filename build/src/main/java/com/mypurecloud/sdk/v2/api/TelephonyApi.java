package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.AgentGreeting;
import com.mypurecloud.sdk.v2.model.Callheader;
import com.mypurecloud.sdk.v2.model.Callmessage;
import com.mypurecloud.sdk.v2.model.CreateOrganizationLink;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.DisasterRecoveryAllRoutingRequest;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.MediaRegions;
import com.mypurecloud.sdk.v2.model.NumberRoutingListing;
import com.mypurecloud.sdk.v2.model.NumberRoutingRequest;
import com.mypurecloud.sdk.v2.model.NumberRoutingResetOrganizationRequest;
import com.mypurecloud.sdk.v2.model.OrganizationCallMetrics;
import com.mypurecloud.sdk.v2.model.OrganizationLink;
import com.mypurecloud.sdk.v2.model.OrganizationLinkApprovalRequest;
import com.mypurecloud.sdk.v2.model.OrganizationLinkResponse;
import com.mypurecloud.sdk.v2.model.RegionResponse;
import com.mypurecloud.sdk.v2.model.SIPSearchPublicRequest;
import com.mypurecloud.sdk.v2.model.SelfAgentGreeting;
import com.mypurecloud.sdk.v2.model.SignedUrlResponse;
import com.mypurecloud.sdk.v2.model.SipDownloadResponse;
import com.mypurecloud.sdk.v2.model.SipSearchResult;
import com.mypurecloud.sdk.v2.model.TelephonySettings;


import com.mypurecloud.sdk.v2.api.request.DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyAgentGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyAgentsGreetingsMeRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyCallsMetricsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyMediaregionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyNumbersRoutingRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyOrganizationLinkRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonyOrganizationLinkRegionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySettingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySipmessagesConversationRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySipmessagesConversationHeadersRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesRequest;
import com.mypurecloud.sdk.v2.api.request.GetTelephonySiptracesDownloadDownloadIdRequest;
import com.mypurecloud.sdk.v2.api.request.PatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyNumbersRoutingRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyNumbersRoutingAllRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyNumbersRoutingResetRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonyOrganizationLinkRequest;
import com.mypurecloud.sdk.v2.api.request.PostTelephonySiptracesDownloadRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyAgentGreetingsRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonyAgentsGreetingsMeRequest;
import com.mypurecloud.sdk.v2.api.request.PutTelephonySettingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephonyApi {
  private final ApiClient pcapiClient;

  public TelephonyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TelephonyApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a link
   * 
   * @param targetOrganizationId targetOrganizationId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyOrganizationLinkTargetOrganizationId(String targetOrganizationId) throws IOException, ApiException {
     deleteTelephonyOrganizationLinkTargetOrganizationId(createDeleteTelephonyOrganizationLinkTargetOrganizationIdRequest(targetOrganizationId));
  }

  /**
   * Delete a link
   * 
   * @param targetOrganizationId targetOrganizationId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyOrganizationLinkTargetOrganizationIdWithHttpInfo(String targetOrganizationId) throws IOException {
    return deleteTelephonyOrganizationLinkTargetOrganizationId(createDeleteTelephonyOrganizationLinkTargetOrganizationIdRequest(targetOrganizationId).withHttpInfo());
  }

  private DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest createDeleteTelephonyOrganizationLinkTargetOrganizationIdRequest(String targetOrganizationId) {
    return DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest.builder()
            .withTargetOrganizationId(targetOrganizationId)

            .build();
  }

  /**
   * Delete a link
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteTelephonyOrganizationLinkTargetOrganizationId(DeleteTelephonyOrganizationLinkTargetOrganizationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a link
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteTelephonyOrganizationLinkTargetOrganizationId(ApiRequest<Void> request) throws IOException {
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
   * Get an agent's greetings.
   * 
   * @param agentId User ID (required)
   * @return AgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentGreeting getTelephonyAgentGreetings(String agentId) throws IOException, ApiException {
    return  getTelephonyAgentGreetings(createGetTelephonyAgentGreetingsRequest(agentId));
  }

  /**
   * Get an agent's greetings.
   * 
   * @param agentId User ID (required)
   * @return AgentGreeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentGreeting> getTelephonyAgentGreetingsWithHttpInfo(String agentId) throws IOException {
    return getTelephonyAgentGreetings(createGetTelephonyAgentGreetingsRequest(agentId).withHttpInfo());
  }

  private GetTelephonyAgentGreetingsRequest createGetTelephonyAgentGreetingsRequest(String agentId) {
    return GetTelephonyAgentGreetingsRequest.builder()
            .withAgentId(agentId)

            .build();
  }

  /**
   * Get an agent's greetings.
   * 
   * @param request The request object
   * @return AgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentGreeting getTelephonyAgentGreetings(GetTelephonyAgentGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentGreeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentGreeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an agent's greetings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentGreeting> getTelephonyAgentGreetings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentGreeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentGreeting> response = (ApiResponse<AgentGreeting>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentGreeting> response = (ApiResponse<AgentGreeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the agent's own greetings.
   * 
   * @return SelfAgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SelfAgentGreeting getTelephonyAgentsGreetingsMe() throws IOException, ApiException {
    return  getTelephonyAgentsGreetingsMe(createGetTelephonyAgentsGreetingsMeRequest());
  }

  /**
   * Get the agent's own greetings.
   * 
   * @return SelfAgentGreeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SelfAgentGreeting> getTelephonyAgentsGreetingsMeWithHttpInfo() throws IOException {
    return getTelephonyAgentsGreetingsMe(createGetTelephonyAgentsGreetingsMeRequest().withHttpInfo());
  }

  private GetTelephonyAgentsGreetingsMeRequest createGetTelephonyAgentsGreetingsMeRequest() {
    return GetTelephonyAgentsGreetingsMeRequest.builder()
            .build();
  }

  /**
   * Get the agent's own greetings.
   * 
   * @param request The request object
   * @return SelfAgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SelfAgentGreeting getTelephonyAgentsGreetingsMe(GetTelephonyAgentsGreetingsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SelfAgentGreeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SelfAgentGreeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the agent's own greetings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SelfAgentGreeting> getTelephonyAgentsGreetingsMe(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SelfAgentGreeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SelfAgentGreeting> response = (ApiResponse<SelfAgentGreeting>)(ApiResponse<?>)exception;
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
      ApiResponse<SelfAgentGreeting> response = (ApiResponse<SelfAgentGreeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the concurrent call metrics for a given organization.
   * 
   * @param metricType Flag to indicate metric type to fetch. (optional, default to cloud)
   * @return OrganizationCallMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationCallMetrics getTelephonyCallsMetrics(String metricType) throws IOException, ApiException {
    return  getTelephonyCallsMetrics(createGetTelephonyCallsMetricsRequest(metricType));
  }

  /**
   * Get the concurrent call metrics for a given organization.
   * 
   * @param metricType Flag to indicate metric type to fetch. (optional, default to cloud)
   * @return OrganizationCallMetrics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationCallMetrics> getTelephonyCallsMetricsWithHttpInfo(String metricType) throws IOException {
    return getTelephonyCallsMetrics(createGetTelephonyCallsMetricsRequest(metricType).withHttpInfo());
  }

  private GetTelephonyCallsMetricsRequest createGetTelephonyCallsMetricsRequest(String metricType) {
    return GetTelephonyCallsMetricsRequest.builder()
            .withMetricType(metricType)

            .build();
  }

  /**
   * Get the concurrent call metrics for a given organization.
   * 
   * @param request The request object
   * @return OrganizationCallMetrics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationCallMetrics getTelephonyCallsMetrics(GetTelephonyCallsMetricsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationCallMetrics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationCallMetrics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the concurrent call metrics for a given organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationCallMetrics> getTelephonyCallsMetrics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationCallMetrics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationCallMetrics> response = (ApiResponse<OrganizationCallMetrics>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationCallMetrics> response = (ApiResponse<OrganizationCallMetrics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @return MediaRegions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaRegions getTelephonyMediaregions() throws IOException, ApiException {
    return  getTelephonyMediaregions(createGetTelephonyMediaregionsRequest());
  }

  /**
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @return MediaRegions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaRegions> getTelephonyMediaregionsWithHttpInfo() throws IOException {
    return getTelephonyMediaregions(createGetTelephonyMediaregionsRequest().withHttpInfo());
  }

  private GetTelephonyMediaregionsRequest createGetTelephonyMediaregionsRequest() {
    return GetTelephonyMediaregionsRequest.builder()
            .build();
  }

  /**
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @param request The request object
   * @return MediaRegions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public MediaRegions getTelephonyMediaregions(GetTelephonyMediaregionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<MediaRegions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<MediaRegions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the list of AWS regions media can stream through.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<MediaRegions> getTelephonyMediaregions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<MediaRegions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<MediaRegions> response = (ApiResponse<MediaRegions>)(ApiResponse<?>)exception;
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
      ApiResponse<MediaRegions> response = (ApiResponse<MediaRegions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Number Routings by organizationId
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param numberId numberId (optional)
   * @param activeRoutingOrganizationId activeRoutingOrganizationId (optional)
   * @param ownerOrganizationId ownerOrganizationId (optional)
   * @param status status (optional)
   * @return NumberRoutingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NumberRoutingListing getTelephonyNumbersRouting(String before, String after, String pageSize, String numberId, String activeRoutingOrganizationId, String ownerOrganizationId, String status) throws IOException, ApiException {
    return  getTelephonyNumbersRouting(createGetTelephonyNumbersRoutingRequest(before, after, pageSize, numberId, activeRoutingOrganizationId, ownerOrganizationId, status));
  }

  /**
   * Get Number Routings by organizationId
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param numberId numberId (optional)
   * @param activeRoutingOrganizationId activeRoutingOrganizationId (optional)
   * @param ownerOrganizationId ownerOrganizationId (optional)
   * @param status status (optional)
   * @return NumberRoutingListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NumberRoutingListing> getTelephonyNumbersRoutingWithHttpInfo(String before, String after, String pageSize, String numberId, String activeRoutingOrganizationId, String ownerOrganizationId, String status) throws IOException {
    return getTelephonyNumbersRouting(createGetTelephonyNumbersRoutingRequest(before, after, pageSize, numberId, activeRoutingOrganizationId, ownerOrganizationId, status).withHttpInfo());
  }

  private GetTelephonyNumbersRoutingRequest createGetTelephonyNumbersRoutingRequest(String before, String after, String pageSize, String numberId, String activeRoutingOrganizationId, String ownerOrganizationId, String status) {
    return GetTelephonyNumbersRoutingRequest.builder()
            .withBefore(before)

            .withAfter(after)

            .withPageSize(pageSize)

            .withNumberId(numberId)

            .withActiveRoutingOrganizationId(activeRoutingOrganizationId)

            .withOwnerOrganizationId(ownerOrganizationId)

            .withStatus(status)

            .build();
  }

  /**
   * Get Number Routings by organizationId
   * 
   * @param request The request object
   * @return NumberRoutingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public NumberRoutingListing getTelephonyNumbersRouting(GetTelephonyNumbersRoutingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<NumberRoutingListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<NumberRoutingListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Number Routings by organizationId
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<NumberRoutingListing> getTelephonyNumbersRouting(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<NumberRoutingListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<NumberRoutingListing> response = (ApiResponse<NumberRoutingListing>)(ApiResponse<?>)exception;
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
      ApiResponse<NumberRoutingListing> response = (ApiResponse<NumberRoutingListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get organization links
   * 
   * @return List<OrganizationLinkResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<OrganizationLinkResponse> getTelephonyOrganizationLink() throws IOException, ApiException {
    return  getTelephonyOrganizationLink(createGetTelephonyOrganizationLinkRequest());
  }

  /**
   * Get organization links
   * 
   * @return List<OrganizationLinkResponse>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<OrganizationLinkResponse>> getTelephonyOrganizationLinkWithHttpInfo() throws IOException {
    return getTelephonyOrganizationLink(createGetTelephonyOrganizationLinkRequest().withHttpInfo());
  }

  private GetTelephonyOrganizationLinkRequest createGetTelephonyOrganizationLinkRequest() {
    return GetTelephonyOrganizationLinkRequest.builder()
            .build();
  }

  /**
   * Get organization links
   * 
   * @param request The request object
   * @return List<OrganizationLinkResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<OrganizationLinkResponse> getTelephonyOrganizationLink(GetTelephonyOrganizationLinkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<OrganizationLinkResponse>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<OrganizationLinkResponse>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get organization links
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<OrganizationLinkResponse>> getTelephonyOrganizationLink(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<OrganizationLinkResponse>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<OrganizationLinkResponse>> response = (ApiResponse<List<OrganizationLinkResponse>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<OrganizationLinkResponse>> response = (ApiResponse<List<OrganizationLinkResponse>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get all the replica regions by primary region
   * 
   * @return List<RegionResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<RegionResponse> getTelephonyOrganizationLinkRegions() throws IOException, ApiException {
    return  getTelephonyOrganizationLinkRegions(createGetTelephonyOrganizationLinkRegionsRequest());
  }

  /**
   * Get all the replica regions by primary region
   * 
   * @return List<RegionResponse>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<RegionResponse>> getTelephonyOrganizationLinkRegionsWithHttpInfo() throws IOException {
    return getTelephonyOrganizationLinkRegions(createGetTelephonyOrganizationLinkRegionsRequest().withHttpInfo());
  }

  private GetTelephonyOrganizationLinkRegionsRequest createGetTelephonyOrganizationLinkRegionsRequest() {
    return GetTelephonyOrganizationLinkRegionsRequest.builder()
            .build();
  }

  /**
   * Get all the replica regions by primary region
   * 
   * @param request The request object
   * @return List<RegionResponse>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<RegionResponse> getTelephonyOrganizationLinkRegions(GetTelephonyOrganizationLinkRegionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<RegionResponse>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<RegionResponse>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all the replica regions by primary region
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<RegionResponse>> getTelephonyOrganizationLinkRegions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<RegionResponse>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<RegionResponse>> response = (ApiResponse<List<RegionResponse>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<RegionResponse>> response = (ApiResponse<List<RegionResponse>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the global telephony configuration.
   * 
   * @return TelephonySettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TelephonySettings getTelephonySettings() throws IOException, ApiException {
    return  getTelephonySettings(createGetTelephonySettingsRequest());
  }

  /**
   * Get the global telephony configuration.
   * 
   * @return TelephonySettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TelephonySettings> getTelephonySettingsWithHttpInfo() throws IOException {
    return getTelephonySettings(createGetTelephonySettingsRequest().withHttpInfo());
  }

  private GetTelephonySettingsRequest createGetTelephonySettingsRequest() {
    return GetTelephonySettingsRequest.builder()
            .build();
  }

  /**
   * Get the global telephony configuration.
   * 
   * @param request The request object
   * @return TelephonySettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TelephonySettings getTelephonySettings(GetTelephonySettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TelephonySettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TelephonySettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the global telephony configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TelephonySettings> getTelephonySettings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TelephonySettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TelephonySettings> response = (ApiResponse<TelephonySettings>)(ApiResponse<?>)exception;
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
      ApiResponse<TelephonySettings> response = (ApiResponse<TelephonySettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a SIP message.
   * Get the raw form of the SIP message
   * @param conversationId Conversation id (required)
   * @return Callmessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Callmessage getTelephonySipmessagesConversation(String conversationId) throws IOException, ApiException {
    return  getTelephonySipmessagesConversation(createGetTelephonySipmessagesConversationRequest(conversationId));
  }

  /**
   * Get a SIP message.
   * Get the raw form of the SIP message
   * @param conversationId Conversation id (required)
   * @return Callmessage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Callmessage> getTelephonySipmessagesConversationWithHttpInfo(String conversationId) throws IOException {
    return getTelephonySipmessagesConversation(createGetTelephonySipmessagesConversationRequest(conversationId).withHttpInfo());
  }

  private GetTelephonySipmessagesConversationRequest createGetTelephonySipmessagesConversationRequest(String conversationId) {
    return GetTelephonySipmessagesConversationRequest.builder()
            .withConversationId(conversationId)

            .build();
  }

  /**
   * Get a SIP message.
   * Get the raw form of the SIP message
   * @param request The request object
   * @return Callmessage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Callmessage getTelephonySipmessagesConversation(GetTelephonySipmessagesConversationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Callmessage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Callmessage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a SIP message.
   * Get the raw form of the SIP message
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Callmessage> getTelephonySipmessagesConversation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Callmessage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Callmessage> response = (ApiResponse<Callmessage>)(ApiResponse<?>)exception;
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
      ApiResponse<Callmessage> response = (ApiResponse<Callmessage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * @param conversationId Conversation id (required)
   * @param keys comma-separated list of header identifiers to query. e.g. ruri,to,from (optional)
   * @return Callheader
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Callheader getTelephonySipmessagesConversationHeaders(String conversationId, List<String> keys) throws IOException, ApiException {
    return  getTelephonySipmessagesConversationHeaders(createGetTelephonySipmessagesConversationHeadersRequest(conversationId, keys));
  }

  /**
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * @param conversationId Conversation id (required)
   * @param keys comma-separated list of header identifiers to query. e.g. ruri,to,from (optional)
   * @return Callheader
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Callheader> getTelephonySipmessagesConversationHeadersWithHttpInfo(String conversationId, List<String> keys) throws IOException {
    return getTelephonySipmessagesConversationHeaders(createGetTelephonySipmessagesConversationHeadersRequest(conversationId, keys).withHttpInfo());
  }

  private GetTelephonySipmessagesConversationHeadersRequest createGetTelephonySipmessagesConversationHeadersRequest(String conversationId, List<String> keys) {
    return GetTelephonySipmessagesConversationHeadersRequest.builder()
            .withConversationId(conversationId)

            .withKeys(keys)

            .build();
  }

  /**
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * @param request The request object
   * @return Callheader
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Callheader getTelephonySipmessagesConversationHeaders(GetTelephonySipmessagesConversationHeadersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Callheader> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Callheader>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get SIP headers.
   * Get parsed SIP headers. Returns specific headers if key query parameters are added.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Callheader> getTelephonySipmessagesConversationHeaders(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Callheader>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Callheader> response = (ApiResponse<Callheader>)(ApiResponse<?>)exception;
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
      ApiResponse<Callheader> response = (ApiResponse<Callheader>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param dateStart Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param dateEnd End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param callId unique identification of the placed call (optional)
   * @param toUser User to who the call was placed (optional)
   * @param fromUser user who placed the call (optional)
   * @param conversationId Unique identification of the conversation (optional)
   * @return SipSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipSearchResult getTelephonySiptraces(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) throws IOException, ApiException {
    return  getTelephonySiptraces(createGetTelephonySiptracesRequest(dateStart, dateEnd, callId, toUser, fromUser, conversationId));
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param dateStart Start date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param dateEnd End date of the search. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z (required)
   * @param callId unique identification of the placed call (optional)
   * @param toUser User to who the call was placed (optional)
   * @param fromUser user who placed the call (optional)
   * @param conversationId Unique identification of the conversation (optional)
   * @return SipSearchResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipSearchResult> getTelephonySiptracesWithHttpInfo(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) throws IOException {
    return getTelephonySiptraces(createGetTelephonySiptracesRequest(dateStart, dateEnd, callId, toUser, fromUser, conversationId).withHttpInfo());
  }

  private GetTelephonySiptracesRequest createGetTelephonySiptracesRequest(Date dateStart, Date dateEnd, String callId, String toUser, String fromUser, String conversationId) {
    return GetTelephonySiptracesRequest.builder()
            .withDateStart(dateStart)

            .withDateEnd(dateEnd)

            .withCallId(callId)

            .withToUser(toUser)

            .withFromUser(fromUser)

            .withConversationId(conversationId)

            .build();
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request The request object
   * @return SipSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipSearchResult getTelephonySiptraces(GetTelephonySiptracesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SipSearchResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SipSearchResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch SIP metadata
   * Fetch SIP metadata that matches a given parameter. If exactMatch is passed as a parameter only sip records that have exactly that value will be returned. For example, some records contain conversationId but not all relevant records for that call may contain the conversationId so only a partial view of the call will be reflected
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipSearchResult> getTelephonySiptraces(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SipSearchResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)exception;
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
      ApiResponse<SipSearchResult> response = (ApiResponse<SipSearchResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param downloadId unique id for the downloaded file in S3 (required)
   * @return SignedUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedUrlResponse getTelephonySiptracesDownloadDownloadId(String downloadId) throws IOException, ApiException {
    return  getTelephonySiptracesDownloadDownloadId(createGetTelephonySiptracesDownloadDownloadIdRequest(downloadId));
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param downloadId unique id for the downloaded file in S3 (required)
   * @return SignedUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedUrlResponse> getTelephonySiptracesDownloadDownloadIdWithHttpInfo(String downloadId) throws IOException {
    return getTelephonySiptracesDownloadDownloadId(createGetTelephonySiptracesDownloadDownloadIdRequest(downloadId).withHttpInfo());
  }

  private GetTelephonySiptracesDownloadDownloadIdRequest createGetTelephonySiptracesDownloadDownloadIdRequest(String downloadId) {
    return GetTelephonySiptracesDownloadDownloadIdRequest.builder()
            .withDownloadId(downloadId)

            .build();
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param request The request object
   * @return SignedUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SignedUrlResponse getTelephonySiptracesDownloadDownloadId(GetTelephonySiptracesDownloadDownloadIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SignedUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SignedUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get signed S3 URL for a pcap download
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SignedUrlResponse> getTelephonySiptracesDownloadDownloadId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SignedUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SignedUrlResponse> response = (ApiResponse<SignedUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Approving a requested link
   * 
   * @param requestingOrganizationId requestingOrganizationId (required)
   * @param body Approval request body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchTelephonyOrganizationLinkApproveRequestingOrganizationId(String requestingOrganizationId, OrganizationLinkApprovalRequest body) throws IOException, ApiException {
     patchTelephonyOrganizationLinkApproveRequestingOrganizationId(createPatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest(requestingOrganizationId, body));
  }

  /**
   * Approving a requested link
   * 
   * @param requestingOrganizationId requestingOrganizationId (required)
   * @param body Approval request body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchTelephonyOrganizationLinkApproveRequestingOrganizationIdWithHttpInfo(String requestingOrganizationId, OrganizationLinkApprovalRequest body) throws IOException {
    return patchTelephonyOrganizationLinkApproveRequestingOrganizationId(createPatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest(requestingOrganizationId, body).withHttpInfo());
  }

  private PatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest createPatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest(String requestingOrganizationId, OrganizationLinkApprovalRequest body) {
    return PatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest.builder()
            .withRequestingOrganizationId(requestingOrganizationId)

            .withBody(body)

            .build();
  }

  /**
   * Approving a requested link
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void patchTelephonyOrganizationLinkApproveRequestingOrganizationId(PatchTelephonyOrganizationLinkApproveRequestingOrganizationIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Approving a requested link
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> patchTelephonyOrganizationLinkApproveRequestingOrganizationId(ApiRequest<OrganizationLinkApprovalRequest> request) throws IOException {
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
   * Update the routing of numbers for one or multiple organizations
   * 
   * @param body drRoutingList (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRouting(List<NumberRoutingRequest> body) throws IOException, ApiException {
     postTelephonyNumbersRouting(createPostTelephonyNumbersRoutingRequest(body));
  }

  /**
   * Update the routing of numbers for one or multiple organizations
   * 
   * @param body drRoutingList (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRoutingWithHttpInfo(List<NumberRoutingRequest> body) throws IOException {
    return postTelephonyNumbersRouting(createPostTelephonyNumbersRoutingRequest(body).withHttpInfo());
  }

  private PostTelephonyNumbersRoutingRequest createPostTelephonyNumbersRoutingRequest(List<NumberRoutingRequest> body) {
    return PostTelephonyNumbersRoutingRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the routing of numbers for one or multiple organizations
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRouting(PostTelephonyNumbersRoutingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Update the routing of numbers for one or multiple organizations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRouting(ApiRequest<List<NumberRoutingRequest>> request) throws IOException {
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
   * Re-route all numbers on an organization
   * 
   * @param body Value for all routing request body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRoutingAll(DisasterRecoveryAllRoutingRequest body) throws IOException, ApiException {
     postTelephonyNumbersRoutingAll(createPostTelephonyNumbersRoutingAllRequest(body));
  }

  /**
   * Re-route all numbers on an organization
   * 
   * @param body Value for all routing request body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRoutingAllWithHttpInfo(DisasterRecoveryAllRoutingRequest body) throws IOException {
    return postTelephonyNumbersRoutingAll(createPostTelephonyNumbersRoutingAllRequest(body).withHttpInfo());
  }

  private PostTelephonyNumbersRoutingAllRequest createPostTelephonyNumbersRoutingAllRequest(DisasterRecoveryAllRoutingRequest body) {
    return PostTelephonyNumbersRoutingAllRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Re-route all numbers on an organization
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRoutingAll(PostTelephonyNumbersRoutingAllRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Re-route all numbers on an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRoutingAll(ApiRequest<DisasterRecoveryAllRoutingRequest> request) throws IOException {
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
   * Reset routing for organization
   * 
   * @param body Value for bulk routing request body (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRoutingReset(NumberRoutingResetOrganizationRequest body) throws IOException, ApiException {
     postTelephonyNumbersRoutingReset(createPostTelephonyNumbersRoutingResetRequest(body));
  }

  /**
   * Reset routing for organization
   * 
   * @param body Value for bulk routing request body (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRoutingResetWithHttpInfo(NumberRoutingResetOrganizationRequest body) throws IOException {
    return postTelephonyNumbersRoutingReset(createPostTelephonyNumbersRoutingResetRequest(body).withHttpInfo());
  }

  private PostTelephonyNumbersRoutingResetRequest createPostTelephonyNumbersRoutingResetRequest(NumberRoutingResetOrganizationRequest body) {
    return PostTelephonyNumbersRoutingResetRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Reset routing for organization
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postTelephonyNumbersRoutingReset(PostTelephonyNumbersRoutingResetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reset routing for organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postTelephonyNumbersRoutingReset(ApiRequest<NumberRoutingResetOrganizationRequest> request) throws IOException {
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
   * Create a link with an organization
   * 
   * @param body CreateLinkOrg body (required)
   * @return OrganizationLink
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationLink postTelephonyOrganizationLink(CreateOrganizationLink body) throws IOException, ApiException {
    return  postTelephonyOrganizationLink(createPostTelephonyOrganizationLinkRequest(body));
  }

  /**
   * Create a link with an organization
   * 
   * @param body CreateLinkOrg body (required)
   * @return OrganizationLink
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationLink> postTelephonyOrganizationLinkWithHttpInfo(CreateOrganizationLink body) throws IOException {
    return postTelephonyOrganizationLink(createPostTelephonyOrganizationLinkRequest(body).withHttpInfo());
  }

  private PostTelephonyOrganizationLinkRequest createPostTelephonyOrganizationLinkRequest(CreateOrganizationLink body) {
    return PostTelephonyOrganizationLinkRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a link with an organization
   * 
   * @param request The request object
   * @return OrganizationLink
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OrganizationLink postTelephonyOrganizationLink(PostTelephonyOrganizationLinkRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OrganizationLink> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OrganizationLink>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a link with an organization
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OrganizationLink> postTelephonyOrganizationLink(ApiRequest<CreateOrganizationLink> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OrganizationLink>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OrganizationLink> response = (ApiResponse<OrganizationLink>)(ApiResponse<?>)exception;
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
      ApiResponse<OrganizationLink> response = (ApiResponse<OrganizationLink>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param sIPSearchPublicRequest  (required)
   * @return SipDownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipDownloadResponse postTelephonySiptracesDownload(SIPSearchPublicRequest sIPSearchPublicRequest) throws IOException, ApiException {
    return  postTelephonySiptracesDownload(createPostTelephonySiptracesDownloadRequest(sIPSearchPublicRequest));
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param sIPSearchPublicRequest  (required)
   * @return SipDownloadResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipDownloadResponse> postTelephonySiptracesDownloadWithHttpInfo(SIPSearchPublicRequest sIPSearchPublicRequest) throws IOException {
    return postTelephonySiptracesDownload(createPostTelephonySiptracesDownloadRequest(sIPSearchPublicRequest).withHttpInfo());
  }

  private PostTelephonySiptracesDownloadRequest createPostTelephonySiptracesDownloadRequest(SIPSearchPublicRequest sIPSearchPublicRequest) {
    return PostTelephonySiptracesDownloadRequest.builder()
            .withSIPSearchPublicRequest(sIPSearchPublicRequest)

            .build();
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param request The request object
   * @return SipDownloadResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SipDownloadResponse postTelephonySiptracesDownload(PostTelephonySiptracesDownloadRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SipDownloadResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SipDownloadResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Request a download of a pcap file to S3
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SipDownloadResponse> postTelephonySiptracesDownload(ApiRequest<SIPSearchPublicRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SipDownloadResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<SipDownloadResponse> response = (ApiResponse<SipDownloadResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates an agent's greetings.
   * 
   * @param agentId User ID (required)
   * @param body Agent Greeting (required)
   * @return AgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentGreeting putTelephonyAgentGreetings(String agentId, AgentGreeting body) throws IOException, ApiException {
    return  putTelephonyAgentGreetings(createPutTelephonyAgentGreetingsRequest(agentId, body));
  }

  /**
   * Updates an agent's greetings.
   * 
   * @param agentId User ID (required)
   * @param body Agent Greeting (required)
   * @return AgentGreeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentGreeting> putTelephonyAgentGreetingsWithHttpInfo(String agentId, AgentGreeting body) throws IOException {
    return putTelephonyAgentGreetings(createPutTelephonyAgentGreetingsRequest(agentId, body).withHttpInfo());
  }

  private PutTelephonyAgentGreetingsRequest createPutTelephonyAgentGreetingsRequest(String agentId, AgentGreeting body) {
    return PutTelephonyAgentGreetingsRequest.builder()
            .withAgentId(agentId)

            .withBody(body)

            .build();
  }

  /**
   * Updates an agent's greetings.
   * 
   * @param request The request object
   * @return AgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentGreeting putTelephonyAgentGreetings(PutTelephonyAgentGreetingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentGreeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentGreeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates an agent's greetings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentGreeting> putTelephonyAgentGreetings(ApiRequest<AgentGreeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentGreeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentGreeting> response = (ApiResponse<AgentGreeting>)(ApiResponse<?>)exception;
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
      ApiResponse<AgentGreeting> response = (ApiResponse<AgentGreeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Updates the agent's own greetings.
   * 
   * @param body Agent Greeting (required)
   * @return SelfAgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SelfAgentGreeting putTelephonyAgentsGreetingsMe(SelfAgentGreeting body) throws IOException, ApiException {
    return  putTelephonyAgentsGreetingsMe(createPutTelephonyAgentsGreetingsMeRequest(body));
  }

  /**
   * Updates the agent's own greetings.
   * 
   * @param body Agent Greeting (required)
   * @return SelfAgentGreeting
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SelfAgentGreeting> putTelephonyAgentsGreetingsMeWithHttpInfo(SelfAgentGreeting body) throws IOException {
    return putTelephonyAgentsGreetingsMe(createPutTelephonyAgentsGreetingsMeRequest(body).withHttpInfo());
  }

  private PutTelephonyAgentsGreetingsMeRequest createPutTelephonyAgentsGreetingsMeRequest(SelfAgentGreeting body) {
    return PutTelephonyAgentsGreetingsMeRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Updates the agent's own greetings.
   * 
   * @param request The request object
   * @return SelfAgentGreeting
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SelfAgentGreeting putTelephonyAgentsGreetingsMe(PutTelephonyAgentsGreetingsMeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SelfAgentGreeting> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SelfAgentGreeting>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Updates the agent's own greetings.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SelfAgentGreeting> putTelephonyAgentsGreetingsMe(ApiRequest<SelfAgentGreeting> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SelfAgentGreeting>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SelfAgentGreeting> response = (ApiResponse<SelfAgentGreeting>)(ApiResponse<?>)exception;
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
      ApiResponse<SelfAgentGreeting> response = (ApiResponse<SelfAgentGreeting>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the global telephony configuration.
   * 
   * @param body Telephony (required)
   * @return TelephonySettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TelephonySettings putTelephonySettings(TelephonySettings body) throws IOException, ApiException {
    return  putTelephonySettings(createPutTelephonySettingsRequest(body));
  }

  /**
   * Update the global telephony configuration.
   * 
   * @param body Telephony (required)
   * @return TelephonySettings
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TelephonySettings> putTelephonySettingsWithHttpInfo(TelephonySettings body) throws IOException {
    return putTelephonySettings(createPutTelephonySettingsRequest(body).withHttpInfo());
  }

  private PutTelephonySettingsRequest createPutTelephonySettingsRequest(TelephonySettings body) {
    return PutTelephonySettingsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Update the global telephony configuration.
   * 
   * @param request The request object
   * @return TelephonySettings
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TelephonySettings putTelephonySettings(PutTelephonySettingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TelephonySettings> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TelephonySettings>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the global telephony configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TelephonySettings> putTelephonySettings(ApiRequest<TelephonySettings> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TelephonySettings>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TelephonySettings> response = (ApiResponse<TelephonySettings>)(ApiResponse<?>)exception;
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
      ApiResponse<TelephonySettings> response = (ApiResponse<TelephonySettings>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
