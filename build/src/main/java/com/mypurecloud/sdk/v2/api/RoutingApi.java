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


public class RoutingApi {
  private final ApiClient pcapiClient;

  public RoutingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoutingApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a domain
   * 
   * @param domainId domain ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingEmailDomain(String domainId) throws IOException, ApiException {
    return deleteRoutingEmailDomainWithHttpInfo(domainId).getBody();
  }

  /**
   * Delete a domain
   * 
   * @param domainId domain ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingEmailDomainWithHttpInfo(String domainId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainId' when calling deleteRoutingEmailDomain");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainId" + "\\}", pcapiClient.escapeString(domainId.toString()));

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
   * Delete a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingEmailDomain(DeleteRoutingEmailDomainRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingEmailDomain(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingEmailDomainRoute(String domainName, String routeId) throws IOException, ApiException {
    return deleteRoutingEmailDomainRouteWithHttpInfo(domainName, routeId).getBody();
  }

  /**
   * Delete a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainName' when calling deleteRoutingEmailDomainRoute");
    }
    
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'routeId' when calling deleteRoutingEmailDomainRoute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainName}/routes/{routeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainName" + "\\}", pcapiClient.escapeString(domainName.toString()))
      .replaceAll("\\{" + "routeId" + "\\}", pcapiClient.escapeString(routeId.toString()));

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
   * Delete a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingEmailDomainRoute(DeleteRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingEmailDomainRoute(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete forceDelete (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueue(String queueId, Boolean forceDelete) throws IOException, ApiException {
    return deleteRoutingQueueWithHttpInfo(queueId, forceDelete).getBody();
  }

  /**
   * Delete a queue
   * 
   * @param queueId Queue ID (required)
   * @param forceDelete forceDelete (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueueWithHttpInfo(String queueId, Boolean forceDelete) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling deleteRoutingQueue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "forceDelete", forceDelete));

    
    
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
   * Delete a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueue(DeleteRoutingQueueRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueue(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete queue member
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueueUser(String queueId, String memberId) throws IOException, ApiException {
    return deleteRoutingQueueUserWithHttpInfo(queueId, memberId).getBody();
  }

  /**
   * Delete queue member
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueueUserWithHttpInfo(String queueId, String memberId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling deleteRoutingQueueUser");
    }
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'memberId' when calling deleteRoutingQueueUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/users/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", pcapiClient.escapeString(memberId.toString()));

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
   * Delete queue member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueueUser(DeleteRoutingQueueUserRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete queue member
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueueUser(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueueWrapupcode(String queueId, String codeId) throws IOException, ApiException {
    return deleteRoutingQueueWrapupcodeWithHttpInfo(queueId, codeId).getBody();
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @param queueId Queue ID (required)
   * @param codeId Code ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueueWrapupcodeWithHttpInfo(String queueId, String codeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling deleteRoutingQueueWrapupcode");
    }
    
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'codeId' when calling deleteRoutingQueueWrapupcode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/wrapupcodes/{codeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()))
      .replaceAll("\\{" + "codeId" + "\\}", pcapiClient.escapeString(codeId.toString()));

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
   * Delete a wrap-up code from a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingQueueWrapupcode(DeleteRoutingQueueWrapupcodeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete a wrap-up code from a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingQueueWrapupcode(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingSkill(String skillId) throws IOException, ApiException {
    return deleteRoutingSkillWithHttpInfo(skillId).getBody();
  }

  /**
   * Delete Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingSkillWithHttpInfo(String skillId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'skillId' when calling deleteRoutingSkill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/skills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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
   * Delete Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingSkill(DeleteRoutingSkillRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingSkill(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingUtilization() throws IOException, ApiException {
    return deleteRoutingUtilizationWithHttpInfo().getBody();
  }

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingUtilizationWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/utilization".replaceAll("\\{format\\}","json");

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
   * Delete utilization settings and revert to system defaults.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingUtilization(DeleteRoutingUtilizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete utilization settings and revert to system defaults.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingUtilization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingWrapupcode(String codeId) throws IOException, ApiException {
    return deleteRoutingWrapupcodeWithHttpInfo(codeId).getBody();
  }

  /**
   * Delete wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingWrapupcodeWithHttpInfo(String codeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'codeId' when calling deleteRoutingWrapupcode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/wrapupcodes/{codeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "codeId" + "\\}", pcapiClient.escapeString(codeId.toString()));

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
   * Delete wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteRoutingWrapupcode(DeleteRoutingWrapupcodeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Delete wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteRoutingWrapupcode(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserRoutingskill(String userId, String skillId) throws IOException, ApiException {
    return deleteUserRoutingskillWithHttpInfo(userId, skillId).getBody();
  }

  /**
   * Remove routing skill from user
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteUserRoutingskillWithHttpInfo(String userId, String skillId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling deleteUserRoutingskill");
    }
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'skillId' when calling deleteUserRoutingskill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String deleteUserRoutingskill(DeleteUserRoutingskillRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Remove routing skill from user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> deleteUserRoutingskill(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return InboundDomain
   * @throws ApiException if fails to make API call
   */
  public InboundDomain getRoutingEmailDomain(String domainId) throws IOException, ApiException {
    return getRoutingEmailDomainWithHttpInfo(domainId).getBody();
  }

  /**
   * Get domain
   * 
   * @param domainId domain ID (required)
   * @return InboundDomain
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomain> getRoutingEmailDomainWithHttpInfo(String domainId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainId' when calling getRoutingEmailDomain");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainId" + "\\}", pcapiClient.escapeString(domainId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundDomain>() {});
  }

  /**
   * Get domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundDomain getRoutingEmailDomain(GetRoutingEmailDomainRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
  }

  /**
   * Get domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomain> getRoutingEmailDomain(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<InboundDomain>invokeAPIVerbose(request, new TypeReference<InboundDomain>() {});
  }

  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public InboundRoute getRoutingEmailDomainRoute(String domainName, String routeId) throws IOException, ApiException {
    return getRoutingEmailDomainRouteWithHttpInfo(domainName, routeId).getBody();
  }

  /**
   * Get a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> getRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainName' when calling getRoutingEmailDomainRoute");
    }
    
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'routeId' when calling getRoutingEmailDomainRoute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainName}/routes/{routeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainName" + "\\}", pcapiClient.escapeString(domainName.toString()))
      .replaceAll("\\{" + "routeId" + "\\}", pcapiClient.escapeString(routeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundRoute>() {});
  }

  /**
   * Get a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundRoute getRoutingEmailDomainRoute(GetRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
  }

  /**
   * Get a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> getRoutingEmailDomainRoute(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<InboundRoute>invokeAPIVerbose(request, new TypeReference<InboundRoute>() {});
  }

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route&#39;s pattern property (optional)
   * @return InboundRouteEntityListing
   * @throws ApiException if fails to make API call
   */
  public InboundRouteEntityListing getRoutingEmailDomainRoutes(String domainName, Integer pageSize, Integer pageNumber, String pattern) throws IOException, ApiException {
    return getRoutingEmailDomainRoutesWithHttpInfo(domainName, pageSize, pageNumber, pattern).getBody();
  }

  /**
   * Get routes
   * 
   * @param domainName email domain (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param pattern Filter routes by the route&#39;s pattern property (optional)
   * @return InboundRouteEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRouteEntityListing> getRoutingEmailDomainRoutesWithHttpInfo(String domainName, Integer pageSize, Integer pageNumber, String pattern) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainName' when calling getRoutingEmailDomainRoutes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainName}/routes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainName" + "\\}", pcapiClient.escapeString(domainName.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pattern", pattern));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundRouteEntityListing>() {});
  }

  /**
   * Get routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundRouteEntityListing getRoutingEmailDomainRoutes(GetRoutingEmailDomainRoutesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundRouteEntityListing>() {});
  }

  /**
   * Get routes
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRouteEntityListing> getRoutingEmailDomainRoutes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<InboundRouteEntityListing>invokeAPIVerbose(request, new TypeReference<InboundRouteEntityListing>() {});
  }

  /**
   * Get domains
   * 
   * @return InboundDomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public InboundDomainEntityListing getRoutingEmailDomains() throws IOException, ApiException {
    return getRoutingEmailDomainsWithHttpInfo().getBody();
  }

  /**
   * Get domains
   * 
   * @return InboundDomainEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomainEntityListing> getRoutingEmailDomainsWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundDomainEntityListing>() {});
  }

  /**
   * Get domains
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundDomainEntityListing getRoutingEmailDomains(GetRoutingEmailDomainsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundDomainEntityListing>() {});
  }

  /**
   * Get domains
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomainEntityListing> getRoutingEmailDomains(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<InboundDomainEntityListing>invokeAPIVerbose(request, new TypeReference<InboundDomainEntityListing>() {});
  }

  /**
   * Get email setup
   * 
   * @return EmailSetup
   * @throws ApiException if fails to make API call
   */
  public EmailSetup getRoutingEmailSetup() throws IOException, ApiException {
    return getRoutingEmailSetupWithHttpInfo().getBody();
  }

  /**
   * Get email setup
   * 
   * @return EmailSetup
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSetup> getRoutingEmailSetupWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/setup".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EmailSetup>() {});
  }

  /**
   * Get email setup
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EmailSetup getRoutingEmailSetup(GetRoutingEmailSetupRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EmailSetup>() {});
  }

  /**
   * Get email setup
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EmailSetup> getRoutingEmailSetup(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<EmailSetup>invokeAPIVerbose(request, new TypeReference<EmailSetup>() {});
  }

  /**
   * Get the list of supported languages.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws ApiException if fails to make API call
   */
  public LanguageEntityListing getRoutingLanguages(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    return getRoutingLanguagesWithHttpInfo(pageSize, pageNumber, sortOrder, name).getBody();
  }

  /**
   * Get the list of supported languages.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @param name Name (optional)
   * @return LanguageEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LanguageEntityListing> getRoutingLanguagesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortOrder, String name) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/languages".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortOrder", sortOrder));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get the list of supported languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public LanguageEntityListing getRoutingLanguages(GetRoutingLanguagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get the list of supported languages.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<LanguageEntityListing> getRoutingLanguages(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<LanguageEntityListing>invokeAPIVerbose(request, new TypeReference<LanguageEntityListing>() {});
  }

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public Queue getRoutingQueue(String queueId) throws IOException, ApiException {
    return getRoutingQueueWithHttpInfo(queueId).getBody();
  }

  /**
   * Get details about this queue.
   * 
   * @param queueId Queue ID (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> getRoutingQueueWithHttpInfo(String queueId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling getRoutingQueue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Queue>() {});
  }

  /**
   * Get details about this queue.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Queue getRoutingQueue(GetRoutingQueueRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Queue>() {});
  }

  /**
   * Get details about this queue.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> getRoutingQueue(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Queue>invokeAPIVerbose(request, new TypeReference<Queue>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if fails to make API call
   */
  public EstimatedWaitTimePredictions getRoutingQueueEstimatedwaittime(String queueId, String conversationId) throws IOException, ApiException {
    return getRoutingQueueEstimatedwaittimeWithHttpInfo(queueId, conversationId).getBody();
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param conversationId conversationId (optional)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittimeWithHttpInfo(String queueId, String conversationId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling getRoutingQueueEstimatedwaittime");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/estimatedwaittime".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "conversationId", conversationId));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EstimatedWaitTimePredictions getRoutingQueueEstimatedwaittime(GetRoutingQueueEstimatedwaittimeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueEstimatedwaittime(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIVerbose(request, new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if fails to make API call
   */
  public EstimatedWaitTimePredictions getRoutingQueueMediatypeEstimatedwaittime(String queueId, String mediaType) throws IOException, ApiException {
    return getRoutingQueueMediatypeEstimatedwaittimeWithHttpInfo(queueId, mediaType).getBody();
  }

  /**
   * Get Estimated Wait Time
   * 
   * @param queueId queueId (required)
   * @param mediaType mediaType (required)
   * @return EstimatedWaitTimePredictions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittimeWithHttpInfo(String queueId, String mediaType) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling getRoutingQueueMediatypeEstimatedwaittime");
    }
    
    // verify the required parameter 'mediaType' is set
    if (mediaType == null) {
      throw new IllegalArgumentException("Missing the required parameter 'mediaType' when calling getRoutingQueueMediatypeEstimatedwaittime");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/mediatypes/{mediaType}/estimatedwaittime".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()))
      .replaceAll("\\{" + "mediaType" + "\\}", pcapiClient.escapeString(mediaType.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public EstimatedWaitTimePredictions getRoutingQueueMediatypeEstimatedwaittime(GetRoutingQueueMediatypeEstimatedwaittimeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get Estimated Wait Time
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<EstimatedWaitTimePredictions> getRoutingQueueMediatypeEstimatedwaittime(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<EstimatedWaitTimePredictions>invokeAPIVerbose(request, new TypeReference<EstimatedWaitTimePredictions>() {});
  }

  /**
   * Get the members of this queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param expand Which fields, if any, to expand. (optional)
   * @param joined Filter by joined status (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @return QueueMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public QueueMemberEntityListing getRoutingQueueUsers(String queueId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException, ApiException {
    return getRoutingQueueUsersWithHttpInfo(queueId, pageSize, pageNumber, sortBy, expand, joined, name, profileSkills, skills, languages, routingStatus, presence).getBody();
  }

  /**
   * Get the members of this queue
   * 
   * @param queueId Queue ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param expand Which fields, if any, to expand. (optional)
   * @param joined Filter by joined status (optional)
   * @param name Filter by queue member name (optional)
   * @param profileSkills Filter by profile skill (optional)
   * @param skills Filter by skill (optional)
   * @param languages Filter by language (optional)
   * @param routingStatus Filter by routing status (optional)
   * @param presence Filter by presence (optional)
   * @return QueueMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueUsersWithHttpInfo(String queueId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, Boolean joined, String name, List<String> profileSkills, List<String> skills, List<String> languages, List<String> routingStatus, List<String> presence) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling getRoutingQueueUsers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "expand", expand));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "joined", joined));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "profileSkills", profileSkills));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "skills", skills));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "languages", languages));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "routingStatus", routingStatus));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("multi", "presence", presence));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueueMemberEntityListing>() {});
  }

  /**
   * Get the members of this queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueueMemberEntityListing getRoutingQueueUsers(GetRoutingQueueUsersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
  }

  /**
   * Get the members of this queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMemberEntityListing> getRoutingQueueUsers(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIVerbose(request, new TypeReference<QueueMemberEntityListing>() {});
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @return WrapupCodeEntityListing
   * @throws ApiException if fails to make API call
   */
  public WrapupCodeEntityListing getRoutingQueueWrapupcodes(String queueId) throws IOException, ApiException {
    return getRoutingQueueWrapupcodesWithHttpInfo(queueId).getBody();
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @param queueId Queue ID (required)
   * @return WrapupCodeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingQueueWrapupcodesWithHttpInfo(String queueId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling getRoutingQueueWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCodeEntityListing getRoutingQueueWrapupcodes(GetRoutingQueueWrapupcodesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * Get the wrap-up codes for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingQueueWrapupcodes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIVerbose(request, new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * Get list of queues.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param active Active (optional)
   * @return QueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public QueueEntityListing getRoutingQueues(Integer pageSize, Integer pageNumber, String sortBy, String name, Boolean active) throws IOException, ApiException {
    return getRoutingQueuesWithHttpInfo(pageSize, pageNumber, sortBy, name, active).getBody();
  }

  /**
   * Get list of queues.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @param name Name (optional)
   * @param active Active (optional)
   * @return QueueEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueEntityListing> getRoutingQueuesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String name, Boolean active) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "active", active));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueueEntityListing>() {});
  }

  /**
   * Get list of queues.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueueEntityListing getRoutingQueues(GetRoutingQueuesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueueEntityListing>() {});
  }

  /**
   * Get list of queues.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueEntityListing> getRoutingQueues(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<QueueEntityListing>invokeAPIVerbose(request, new TypeReference<QueueEntityListing>() {});
  }

  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return RoutingSkill
   * @throws ApiException if fails to make API call
   */
  public RoutingSkill getRoutingSkill(String skillId) throws IOException, ApiException {
    return getRoutingSkillWithHttpInfo(skillId).getBody();
  }

  /**
   * Get Routing Skill
   * 
   * @param skillId Skill ID (required)
   * @return RoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingSkill> getRoutingSkillWithHttpInfo(String skillId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'skillId' when calling getRoutingSkill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/skills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingSkill>() {});
  }

  /**
   * Get Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingSkill getRoutingSkill(GetRoutingSkillRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingSkill>() {});
  }

  /**
   * Get Routing Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingSkill> getRoutingSkill(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<RoutingSkill>invokeAPIVerbose(request, new TypeReference<RoutingSkill>() {});
  }

  /**
   * Get the list of routing skills.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Filter for results that start with this value (optional)
   * @return SkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public SkillEntityListing getRoutingSkills(Integer pageSize, Integer pageNumber, String name) throws IOException, ApiException {
    return getRoutingSkillsWithHttpInfo(pageSize, pageNumber, name).getBody();
  }

  /**
   * Get the list of routing skills.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Filter for results that start with this value (optional)
   * @return SkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SkillEntityListing> getRoutingSkillsWithHttpInfo(Integer pageSize, Integer pageNumber, String name) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/skills".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "name", name));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<SkillEntityListing>() {});
  }

  /**
   * Get the list of routing skills.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public SkillEntityListing getRoutingSkills(GetRoutingSkillsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<SkillEntityListing>() {});
  }

  /**
   * Get the list of routing skills.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SkillEntityListing> getRoutingSkills(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<SkillEntityListing>invokeAPIVerbose(request, new TypeReference<SkillEntityListing>() {});
  }

  /**
   * Get the utilization settings.
   * 
   * @return Utilization
   * @throws ApiException if fails to make API call
   */
  public Utilization getRoutingUtilization() throws IOException, ApiException {
    return getRoutingUtilizationWithHttpInfo().getBody();
  }

  /**
   * Get the utilization settings.
   * 
   * @return Utilization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Utilization> getRoutingUtilizationWithHttpInfo() throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/utilization".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Utilization>() {});
  }

  /**
   * Get the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Utilization getRoutingUtilization(GetRoutingUtilizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Utilization>() {});
  }

  /**
   * Get the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Utilization> getRoutingUtilization(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<Utilization>invokeAPIVerbose(request, new TypeReference<Utilization>() {});
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public WrapupCode getRoutingWrapupcode(String codeId) throws IOException, ApiException {
    return getRoutingWrapupcodeWithHttpInfo(codeId).getBody();
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @param codeId Wrapup Code ID (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcodeWithHttpInfo(String codeId) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'codeId' when calling getRoutingWrapupcode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/wrapupcodes/{codeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "codeId" + "\\}", pcapiClient.escapeString(codeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCode>() {});
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCode getRoutingWrapupcode(GetRoutingWrapupcodeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
  }

  /**
   * Get details about this wrap-up code.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> getRoutingWrapupcode(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WrapupCode>invokeAPIVerbose(request, new TypeReference<WrapupCode>() {});
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @return WrapupCodeEntityListing
   * @throws ApiException if fails to make API call
   */
  public WrapupCodeEntityListing getRoutingWrapupcodes(Integer pageSize, Integer pageNumber, String sortBy) throws IOException, ApiException {
    return getRoutingWrapupcodesWithHttpInfo(pageSize, pageNumber, sortBy).getBody();
  }

  /**
   * Get list of wrapup codes.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to name)
   * @return WrapupCodeEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/wrapupcodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "sortBy", sortBy));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * Get list of wrapup codes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCodeEntityListing getRoutingWrapupcodes(GetRoutingWrapupcodesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * Get list of wrapup codes.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCodeEntityListing> getRoutingWrapupcodes(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<WrapupCodeEntityListing>invokeAPIVerbose(request, new TypeReference<WrapupCodeEntityListing>() {});
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public UserSkillEntityListing getUserRoutingskills(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    return getUserRoutingskillsWithHttpInfo(userId, pageSize, pageNumber, sortOrder).getBody();
  }

  /**
   * List routing skills for user
   * 
   * @param userId User ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortOrder Ascending or descending sort order (optional, default to ASC)
   * @return UserSkillEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskillsWithHttpInfo(String userId, Integer pageSize, Integer pageNumber, String sortOrder) throws IOException, ApiException {
    Object pclocalVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling getUserRoutingskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageSize", pageSize));
    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "pageNumber", pageNumber));
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "GET", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserSkillEntityListing getUserRoutingskills(GetUserRoutingskillsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * List routing skills for user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserSkillEntityListing> getUserRoutingskills(ApiRequest<Void> request) throws IOException, ApiException {
    return pcapiClient.<UserSkillEntityListing>invokeAPIVerbose(request, new TypeReference<UserSkillEntityListing>() {});
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @return QueueMember
   * @throws ApiException if fails to make API call
   */
  public QueueMember patchRoutingQueueUser(String queueId, String memberId, QueueMember body) throws IOException, ApiException {
    return patchRoutingQueueUserWithHttpInfo(queueId, memberId, body).getBody();
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @param queueId Queue ID (required)
   * @param memberId Member ID (required)
   * @param body Queue Member (required)
   * @return QueueMember
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMember> patchRoutingQueueUserWithHttpInfo(String queueId, String memberId, QueueMember body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling patchRoutingQueueUser");
    }
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'memberId' when calling patchRoutingQueueUser");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling patchRoutingQueueUser");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/users/{memberId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()))
      .replaceAll("\\{" + "memberId" + "\\}", pcapiClient.escapeString(memberId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueueMember>() {});
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueueMember patchRoutingQueueUser(PatchRoutingQueueUserRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueueMember>() {});
  }

  /**
   * Update the ring number of joined status for a User in a Queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMember> patchRoutingQueueUser(ApiRequest<QueueMember> request) throws IOException, ApiException {
    return pcapiClient.<QueueMember>invokeAPIVerbose(request, new TypeReference<QueueMember>() {});
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public QueueMemberEntityListing patchRoutingQueueUsers(String queueId, List<QueueMember> body) throws IOException, ApiException {
    return patchRoutingQueueUsersWithHttpInfo(queueId, body).getBody();
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @return QueueMemberEntityListing
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueUsersWithHttpInfo(String queueId, List<QueueMember> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling patchRoutingQueueUsers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling patchRoutingQueueUsers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PATCH", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<QueueMemberEntityListing>() {});
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public QueueMemberEntityListing patchRoutingQueueUsers(PatchRoutingQueueUsersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<QueueMemberEntityListing>() {});
  }

  /**
   * Join or unjoin a set of users for a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<QueueMemberEntityListing> patchRoutingQueueUsers(ApiRequest<List<QueueMember>> request) throws IOException, ApiException {
    return pcapiClient.<QueueMemberEntityListing>invokeAPIVerbose(request, new TypeReference<QueueMemberEntityListing>() {});
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
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public InboundRoute postRoutingEmailDomainRoutes(String domainName, InboundRoute body) throws IOException, ApiException {
    return postRoutingEmailDomainRoutesWithHttpInfo(domainName, body).getBody();
  }

  /**
   * Create a route
   * 
   * @param domainName email domain (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> postRoutingEmailDomainRoutesWithHttpInfo(String domainName, InboundRoute body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainName' when calling postRoutingEmailDomainRoutes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingEmailDomainRoutes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainName}/routes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainName" + "\\}", pcapiClient.escapeString(domainName.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundRoute>() {});
  }

  /**
   * Create a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundRoute postRoutingEmailDomainRoutes(PostRoutingEmailDomainRoutesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
  }

  /**
   * Create a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> postRoutingEmailDomainRoutes(ApiRequest<InboundRoute> request) throws IOException, ApiException {
    return pcapiClient.<InboundRoute>invokeAPIVerbose(request, new TypeReference<InboundRoute>() {});
  }

  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return InboundDomain
   * @throws ApiException if fails to make API call
   */
  public InboundDomain postRoutingEmailDomains(InboundDomain body) throws IOException, ApiException {
    return postRoutingEmailDomainsWithHttpInfo(body).getBody();
  }

  /**
   * Create a domain
   * 
   * @param body Domain (required)
   * @return InboundDomain
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomain> postRoutingEmailDomainsWithHttpInfo(InboundDomain body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingEmailDomains");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundDomain>() {});
  }

  /**
   * Create a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundDomain postRoutingEmailDomains(PostRoutingEmailDomainsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundDomain>() {});
  }

  /**
   * Create a domain
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundDomain> postRoutingEmailDomains(ApiRequest<InboundDomain> request) throws IOException, ApiException {
    return pcapiClient.<InboundDomain>invokeAPIVerbose(request, new TypeReference<InboundDomain>() {});
  }

  /**
   * Create Language
   * 
   * @param body Language (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public Language postRoutingLanguages(Language body) throws IOException, ApiException {
    return postRoutingLanguagesWithHttpInfo(body).getBody();
  }

  /**
   * Create Language
   * 
   * @param body Language (required)
   * @return Language
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> postRoutingLanguagesWithHttpInfo(Language body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingLanguages");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/languages".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Language>() {});
  }

  /**
   * Create Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Language postRoutingLanguages(PostRoutingLanguagesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Language>() {});
  }

  /**
   * Create Language
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Language> postRoutingLanguages(ApiRequest<Language> request) throws IOException, ApiException {
    return pcapiClient.<Language>invokeAPIVerbose(request, new TypeReference<Language>() {});
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String postRoutingQueueUsers(String queueId, List<QueueMember> body, Boolean delete) throws IOException, ApiException {
    return postRoutingQueueUsersWithHttpInfo(queueId, body, delete).getBody();
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @param queueId Queue ID (required)
   * @param body Queue Members (required)
   * @param delete True to delete queue members (optional, default to false)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postRoutingQueueUsersWithHttpInfo(String queueId, List<QueueMember> body, Boolean delete) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling postRoutingQueueUsers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingQueueUsers");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

    // query params
    List<Pair> pclocalVarQueryParams = new ArrayList<Pair>();
    Map<String, String> pclocalVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> pclocalVarFormParams = new HashMap<String, Object>();

    pclocalVarQueryParams.addAll(pcapiClient.parameterToPairs("", "delete", delete));

    
    
    final String[] pclocalVarAccepts = {
      "application/json"
    };
    final String pclocalVarAccept = pcapiClient.selectHeaderAccept(pclocalVarAccepts);

    final String[] pclocalVarContentTypes = {
      "application/json"
    };
    final String pclocalVarContentType = pcapiClient.selectHeaderContentType(pclocalVarContentTypes);

    String[] pclocalVarAuthNames = new String[] { "PureCloud Auth" };

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<String>() {});
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public String postRoutingQueueUsers(PostRoutingQueueUsersRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<String>() {});
  }

  /**
   * Bulk add or delete up to 100 queue members
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> postRoutingQueueUsers(ApiRequest<List<QueueMember>> request) throws IOException, ApiException {
    return pcapiClient.<String>invokeAPIVerbose(request, new TypeReference<String>() {});
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param body List of wrapup codes (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> postRoutingQueueWrapupcodes(String queueId, List<WrapupCode> body) throws IOException, ApiException {
    return postRoutingQueueWrapupcodesWithHttpInfo(queueId, body).getBody();
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @param queueId Queue ID (required)
   * @param body List of wrapup codes (required)
   * @return List<WrapupCode>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> postRoutingQueueWrapupcodesWithHttpInfo(String queueId, List<WrapupCode> body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling postRoutingQueueWrapupcodes");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingQueueWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}/wrapupcodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public List<WrapupCode> postRoutingQueueWrapupcodes(PostRoutingQueueWrapupcodesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Add up to 100 wrap-up codes to a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<WrapupCode>> postRoutingQueueWrapupcodes(ApiRequest<List<WrapupCode>> request) throws IOException, ApiException {
    return pcapiClient.<List<WrapupCode>>invokeAPIVerbose(request, new TypeReference<List<WrapupCode>>() {});
  }

  /**
   * Create queue
   * 
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public Queue postRoutingQueues(CreateQueueRequest body) throws IOException, ApiException {
    return postRoutingQueuesWithHttpInfo(body).getBody();
  }

  /**
   * Create queue
   * 
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> postRoutingQueuesWithHttpInfo(CreateQueueRequest body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingQueues");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Queue>() {});
  }

  /**
   * Create queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Queue postRoutingQueues(PostRoutingQueuesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Queue>() {});
  }

  /**
   * Create queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> postRoutingQueues(ApiRequest<CreateQueueRequest> request) throws IOException, ApiException {
    return pcapiClient.<Queue>invokeAPIVerbose(request, new TypeReference<Queue>() {});
  }

  /**
   * Create Skill
   * 
   * @param body Skill (required)
   * @return RoutingSkill
   * @throws ApiException if fails to make API call
   */
  public RoutingSkill postRoutingSkills(RoutingSkill body) throws IOException, ApiException {
    return postRoutingSkillsWithHttpInfo(body).getBody();
  }

  /**
   * Create Skill
   * 
   * @param body Skill (required)
   * @return RoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingSkill> postRoutingSkillsWithHttpInfo(RoutingSkill body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingSkills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/skills".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<RoutingSkill>() {});
  }

  /**
   * Create Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public RoutingSkill postRoutingSkills(PostRoutingSkillsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<RoutingSkill>() {});
  }

  /**
   * Create Skill
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RoutingSkill> postRoutingSkills(ApiRequest<RoutingSkill> request) throws IOException, ApiException {
    return pcapiClient.<RoutingSkill>invokeAPIVerbose(request, new TypeReference<RoutingSkill>() {});
  }

  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public WrapupCode postRoutingWrapupcodes(WrapupCode body) throws IOException, ApiException {
    return postRoutingWrapupcodesWithHttpInfo(body).getBody();
  }

  /**
   * Create a wrap-up code
   * 
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> postRoutingWrapupcodesWithHttpInfo(WrapupCode body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postRoutingWrapupcodes");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/wrapupcodes".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCode>() {});
  }

  /**
   * Create a wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCode postRoutingWrapupcodes(PostRoutingWrapupcodesRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
  }

  /**
   * Create a wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> postRoutingWrapupcodes(ApiRequest<WrapupCode> request) throws IOException, ApiException {
    return pcapiClient.<WrapupCode>invokeAPIVerbose(request, new TypeReference<WrapupCode>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill postUserRoutingskills(String userId, UserRoutingSkillPost body) throws IOException, ApiException {
    return postUserRoutingskillsWithHttpInfo(userId, body).getBody();
  }

  /**
   * Add routing skill to user
   * 
   * @param userId User ID (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskillsWithHttpInfo(String userId, UserRoutingSkillPost body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling postUserRoutingskills");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling postUserRoutingskills");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills".replaceAll("\\{format\\}","json")
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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "POST", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill postUserRoutingskills(PostUserRoutingskillsRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Add routing skill to user
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> postUserRoutingskills(ApiRequest<UserRoutingSkillPost> request) throws IOException, ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerbose(request, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public InboundRoute putRoutingEmailDomainRoute(String domainName, String routeId, InboundRoute body) throws IOException, ApiException {
    return putRoutingEmailDomainRouteWithHttpInfo(domainName, routeId, body).getBody();
  }

  /**
   * Update a route
   * 
   * @param domainName email domain (required)
   * @param routeId route ID (required)
   * @param body Route (required)
   * @return InboundRoute
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> putRoutingEmailDomainRouteWithHttpInfo(String domainName, String routeId, InboundRoute body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'domainName' is set
    if (domainName == null) {
      throw new IllegalArgumentException("Missing the required parameter 'domainName' when calling putRoutingEmailDomainRoute");
    }
    
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'routeId' when calling putRoutingEmailDomainRoute");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRoutingEmailDomainRoute");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/email/domains/{domainName}/routes/{routeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "domainName" + "\\}", pcapiClient.escapeString(domainName.toString()))
      .replaceAll("\\{" + "routeId" + "\\}", pcapiClient.escapeString(routeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<InboundRoute>() {});
  }

  /**
   * Update a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public InboundRoute putRoutingEmailDomainRoute(PutRoutingEmailDomainRouteRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<InboundRoute>() {});
  }

  /**
   * Update a route
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<InboundRoute> putRoutingEmailDomainRoute(ApiRequest<InboundRoute> request) throws IOException, ApiException {
    return pcapiClient.<InboundRoute>invokeAPIVerbose(request, new TypeReference<InboundRoute>() {});
  }

  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public Queue putRoutingQueue(String queueId, Queue body) throws IOException, ApiException {
    return putRoutingQueueWithHttpInfo(queueId, body).getBody();
  }

  /**
   * Update a queue
   * 
   * @param queueId Queue ID (required)
   * @param body Queue (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> putRoutingQueueWithHttpInfo(String queueId, Queue body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'queueId' is set
    if (queueId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'queueId' when calling putRoutingQueue");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRoutingQueue");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/queues/{queueId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "queueId" + "\\}", pcapiClient.escapeString(queueId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Queue>() {});
  }

  /**
   * Update a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Queue putRoutingQueue(PutRoutingQueueRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Queue>() {});
  }

  /**
   * Update a queue
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Queue> putRoutingQueue(ApiRequest<Queue> request) throws IOException, ApiException {
    return pcapiClient.<Queue>invokeAPIVerbose(request, new TypeReference<Queue>() {});
  }

  /**
   * Update the utilization settings.
   * 
   * @param body utilization (required)
   * @return Utilization
   * @throws ApiException if fails to make API call
   */
  public Utilization putRoutingUtilization(Utilization body) throws IOException, ApiException {
    return putRoutingUtilizationWithHttpInfo(body).getBody();
  }

  /**
   * Update the utilization settings.
   * 
   * @param body utilization (required)
   * @return Utilization
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Utilization> putRoutingUtilizationWithHttpInfo(Utilization body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRoutingUtilization");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/utilization".replaceAll("\\{format\\}","json");

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<Utilization>() {});
  }

  /**
   * Update the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public Utilization putRoutingUtilization(PutRoutingUtilizationRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<Utilization>() {});
  }

  /**
   * Update the utilization settings.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Utilization> putRoutingUtilization(ApiRequest<Utilization> request) throws IOException, ApiException {
    return pcapiClient.<Utilization>invokeAPIVerbose(request, new TypeReference<Utilization>() {});
  }

  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public WrapupCode putRoutingWrapupcode(String codeId, WrapupCode body) throws IOException, ApiException {
    return putRoutingWrapupcodeWithHttpInfo(codeId, body).getBody();
  }

  /**
   * Update wrap-up code
   * 
   * @param codeId Wrapup Code ID (required)
   * @param body WrapupCode (required)
   * @return WrapupCode
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> putRoutingWrapupcodeWithHttpInfo(String codeId, WrapupCode body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'codeId' when calling putRoutingWrapupcode");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putRoutingWrapupcode");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/routing/wrapupcodes/{codeId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "codeId" + "\\}", pcapiClient.escapeString(codeId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<WrapupCode>() {});
  }

  /**
   * Update wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public WrapupCode putRoutingWrapupcode(PutRoutingWrapupcodeRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<WrapupCode>() {});
  }

  /**
   * Update wrap-up code
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WrapupCode> putRoutingWrapupcode(ApiRequest<WrapupCode> request) throws IOException, ApiException {
    return pcapiClient.<WrapupCode>invokeAPIVerbose(request, new TypeReference<WrapupCode>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill putUserRoutingskill(String userId, String skillId, UserRoutingSkill body) throws IOException, ApiException {
    return putUserRoutingskillWithHttpInfo(userId, skillId, body).getBody();
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @param userId User ID (required)
   * @param skillId skillId (required)
   * @param body Skill (required)
   * @return UserRoutingSkill
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskillWithHttpInfo(String userId, String skillId, UserRoutingSkill body) throws IOException, ApiException {
    Object pclocalVarPostBody = body;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'userId' when calling putUserRoutingskill");
    }
    
    // verify the required parameter 'skillId' is set
    if (skillId == null) {
      throw new IllegalArgumentException("Missing the required parameter 'skillId' when calling putUserRoutingskill");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new IllegalArgumentException("Missing the required parameter 'body' when calling putUserRoutingskill");
    }
    
    // create path and map variables
    String pclocalVarPath = "/api/v2/users/{userId}/routingskills/{skillId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userId" + "\\}", pcapiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "skillId" + "\\}", pcapiClient.escapeString(skillId.toString()));

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

    return pcapiClient.invokeAPIVerbose(pclocalVarPath, "PUT", pclocalVarQueryParams, pclocalVarPostBody, pclocalVarHeaderParams, pclocalVarFormParams, pclocalVarAccept, pclocalVarContentType, pclocalVarAuthNames, new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public UserRoutingSkill putUserRoutingskill(PutUserRoutingskillRequest request) throws IOException, ApiException {
    return pcapiClient.invokeAPI(request.withHttpInfo(), new TypeReference<UserRoutingSkill>() {});
  }

  /**
   * Update routing skill proficiency or state.
   * 
   * @request The request object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserRoutingSkill> putUserRoutingskill(ApiRequest<UserRoutingSkill> request) throws IOException, ApiException {
    return pcapiClient.<UserRoutingSkill>invokeAPIVerbose(request, new TypeReference<UserRoutingSkill>() {});
  }

}
