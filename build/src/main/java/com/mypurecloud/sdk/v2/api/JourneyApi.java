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
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentsUpdate;


import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyCustomerCustomerIdSegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyExternalcontactSegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionSegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyExternalcontactSegmentsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JourneyApi {
  private final ApiClient pcapiClient;

  public JourneyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JourneyApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Retrieve a single action target.
   * 
   * @param actionTargetId ID of the action target. (required)
   * @return ActionTarget
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTarget getJourneyActiontarget(String actionTargetId) throws IOException, ApiException {
    return  getJourneyActiontarget(createGetJourneyActiontargetRequest(actionTargetId));
  }

  /**
   * Retrieve a single action target.
   * 
   * @param actionTargetId ID of the action target. (required)
   * @return ActionTarget
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTarget> getJourneyActiontargetWithHttpInfo(String actionTargetId) throws IOException {
    return getJourneyActiontarget(createGetJourneyActiontargetRequest(actionTargetId).withHttpInfo());
  }

  private GetJourneyActiontargetRequest createGetJourneyActiontargetRequest(String actionTargetId) {
    return GetJourneyActiontargetRequest.builder()
            .withActionTargetId(actionTargetId)
    
            .build();
  }

  /**
   * Retrieve a single action target.
   * 
   * @param request The request object
   * @return ActionTarget
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTarget getJourneyActiontarget(GetJourneyActiontargetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTarget> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTarget>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single action target.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTarget> getJourneyActiontarget(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTarget>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all action targets.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ActionTargetListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTargetListing getJourneyActiontargets(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getJourneyActiontargets(createGetJourneyActiontargetsRequest(pageNumber, pageSize));
  }

  /**
   * Retrieve all action targets.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return ActionTargetListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTargetListing> getJourneyActiontargetsWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getJourneyActiontargets(createGetJourneyActiontargetsRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetJourneyActiontargetsRequest createGetJourneyActiontargetsRequest(Integer pageNumber, Integer pageSize) {
    return GetJourneyActiontargetsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * Retrieve all action targets.
   * 
   * @param request The request object
   * @return ActionTargetListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTargetListing getJourneyActiontargets(GetJourneyActiontargetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTargetListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTargetListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all action targets.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTargetListing> getJourneyActiontargets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTargetListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTargetListing> response = (ApiResponse<ActionTargetListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve segment assignments by customer ID.
   * 
   * @param customerIdType Type of ID used to identify customer (e.g. email, cookie, and phone). (required)
   * @param customerId Primary identifier of the customer to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneyCustomerCustomerIdSegments(String customerIdType, String customerId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException, ApiException {
    return  getJourneyCustomerCustomerIdSegments(createGetJourneyCustomerCustomerIdSegmentsRequest(customerIdType, customerId, pageSize, after, segmentScope, assignmentState));
  }

  /**
   * Retrieve segment assignments by customer ID.
   * 
   * @param customerIdType Type of ID used to identify customer (e.g. email, cookie, and phone). (required)
   * @param customerId Primary identifier of the customer to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneyCustomerCustomerIdSegmentsWithHttpInfo(String customerIdType, String customerId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException {
    return getJourneyCustomerCustomerIdSegments(createGetJourneyCustomerCustomerIdSegmentsRequest(customerIdType, customerId, pageSize, after, segmentScope, assignmentState).withHttpInfo());
  }

  private GetJourneyCustomerCustomerIdSegmentsRequest createGetJourneyCustomerCustomerIdSegmentsRequest(String customerIdType, String customerId, String pageSize, String after, String segmentScope, String assignmentState) {
    return GetJourneyCustomerCustomerIdSegmentsRequest.builder()
            .withCustomerIdType(customerIdType)
    
            .withCustomerId(customerId)
    
            .withPageSize(pageSize)
    
            .withAfter(after)
    
            .withSegmentScope(segmentScope)
    
            .withAssignmentState(assignmentState)
    
            .build();
  }

  /**
   * Retrieve segment assignments by customer ID.
   * 
   * @param request The request object
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneyCustomerCustomerIdSegments(GetJourneyCustomerCustomerIdSegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SegmentAssignmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SegmentAssignmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve segment assignments by customer ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneyCustomerCustomerIdSegments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SegmentAssignmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param externalContactId ID of the external contact to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneyExternalcontactSegments(String externalContactId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException, ApiException {
    return  getJourneyExternalcontactSegments(createGetJourneyExternalcontactSegmentsRequest(externalContactId, pageSize, after, segmentScope, assignmentState));
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param externalContactId ID of the external contact to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneyExternalcontactSegmentsWithHttpInfo(String externalContactId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException {
    return getJourneyExternalcontactSegments(createGetJourneyExternalcontactSegmentsRequest(externalContactId, pageSize, after, segmentScope, assignmentState).withHttpInfo());
  }

  private GetJourneyExternalcontactSegmentsRequest createGetJourneyExternalcontactSegmentsRequest(String externalContactId, String pageSize, String after, String segmentScope, String assignmentState) {
    return GetJourneyExternalcontactSegmentsRequest.builder()
            .withExternalContactId(externalContactId)
    
            .withPageSize(pageSize)
    
            .withAfter(after)
    
            .withSegmentScope(segmentScope)
    
            .withAssignmentState(assignmentState)
    
            .build();
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request The request object
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneyExternalcontactSegments(GetJourneyExternalcontactSegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SegmentAssignmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SegmentAssignmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve segment assignments by external contact ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneyExternalcontactSegments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SegmentAssignmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve segment assignments by session ID.
   * 
   * @param sessionId ID of the session to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneySessionSegments(String sessionId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException, ApiException {
    return  getJourneySessionSegments(createGetJourneySessionSegmentsRequest(sessionId, pageSize, after, segmentScope, assignmentState));
  }

  /**
   * Retrieve segment assignments by session ID.
   * 
   * @param sessionId ID of the session to query for segment assignments. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param segmentScope Scope to filter on. If not specified, both session-scoped and customer-scoped assignments are returned. (optional)
   * @param assignmentState Assignment state to filter on. If not specified, both assigned and unassigned assignments are returned. (optional)
   * @return SegmentAssignmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneySessionSegmentsWithHttpInfo(String sessionId, String pageSize, String after, String segmentScope, String assignmentState) throws IOException {
    return getJourneySessionSegments(createGetJourneySessionSegmentsRequest(sessionId, pageSize, after, segmentScope, assignmentState).withHttpInfo());
  }

  private GetJourneySessionSegmentsRequest createGetJourneySessionSegmentsRequest(String sessionId, String pageSize, String after, String segmentScope, String assignmentState) {
    return GetJourneySessionSegmentsRequest.builder()
            .withSessionId(sessionId)
    
            .withPageSize(pageSize)
    
            .withAfter(after)
    
            .withSegmentScope(segmentScope)
    
            .withAssignmentState(assignmentState)
    
            .build();
  }

  /**
   * Retrieve segment assignments by session ID.
   * 
   * @param request The request object
   * @return SegmentAssignmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentAssignmentListing getJourneySessionSegments(GetJourneySessionSegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SegmentAssignmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SegmentAssignmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve segment assignments by session ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentAssignmentListing> getJourneySessionSegments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SegmentAssignmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SegmentAssignmentListing> response = (ApiResponse<SegmentAssignmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a single action target.
   * 
   * @param actionTargetId ID of the action target. (required)
   * @param body  (optional)
   * @return ActionTarget
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTarget patchJourneyActiontarget(String actionTargetId, PatchActionTarget body) throws IOException, ApiException {
    return  patchJourneyActiontarget(createPatchJourneyActiontargetRequest(actionTargetId, body));
  }

  /**
   * Update a single action target.
   * 
   * @param actionTargetId ID of the action target. (required)
   * @param body  (optional)
   * @return ActionTarget
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTarget> patchJourneyActiontargetWithHttpInfo(String actionTargetId, PatchActionTarget body) throws IOException {
    return patchJourneyActiontarget(createPatchJourneyActiontargetRequest(actionTargetId, body).withHttpInfo());
  }

  private PatchJourneyActiontargetRequest createPatchJourneyActiontargetRequest(String actionTargetId, PatchActionTarget body) {
    return PatchJourneyActiontargetRequest.builder()
            .withActionTargetId(actionTargetId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a single action target.
   * 
   * @param request The request object
   * @return ActionTarget
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTarget patchJourneyActiontarget(PatchJourneyActiontargetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTarget> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTarget>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a single action target.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTarget> patchJourneyActiontarget(ApiRequest<PatchActionTarget> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTarget>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTarget> response = (ApiResponse<ActionTarget>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Query for journey aggregates
   * 
   * @param body query (required)
   * @return JourneyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAggregateQueryResponse postAnalyticsJourneysAggregatesQuery(JourneyAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsJourneysAggregatesQuery(createPostAnalyticsJourneysAggregatesQueryRequest(body));
  }

  /**
   * Query for journey aggregates
   * 
   * @param body query (required)
   * @return JourneyAggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQueryWithHttpInfo(JourneyAggregationQuery body) throws IOException {
    return postAnalyticsJourneysAggregatesQuery(createPostAnalyticsJourneysAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsJourneysAggregatesQueryRequest createPostAnalyticsJourneysAggregatesQueryRequest(JourneyAggregationQuery body) {
    return PostAnalyticsJourneysAggregatesQueryRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Query for journey aggregates
   * 
   * @param request The request object
   * @return JourneyAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAggregateQueryResponse postAnalyticsJourneysAggregatesQuery(PostAnalyticsJourneysAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for journey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyAggregateQueryResponse> postAnalyticsJourneysAggregatesQuery(ApiRequest<JourneyAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyAggregateQueryResponse> response = (ApiResponse<JourneyAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment.
   * 
   * @param externalContactId ID of the external contact to query for segment assignments. (required)
   * @param body  (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postJourneyExternalcontactSegments(String externalContactId, List<SegmentAssignmentsUpdate> body) throws IOException, ApiException {
     postJourneyExternalcontactSegments(createPostJourneyExternalcontactSegmentsRequest(externalContactId, body));
  }

  /**
   * Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment.
   * 
   * @param externalContactId ID of the external contact to query for segment assignments. (required)
   * @param body  (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postJourneyExternalcontactSegmentsWithHttpInfo(String externalContactId, List<SegmentAssignmentsUpdate> body) throws IOException {
    return postJourneyExternalcontactSegments(createPostJourneyExternalcontactSegmentsRequest(externalContactId, body).withHttpInfo());
  }

  private PostJourneyExternalcontactSegmentsRequest createPostJourneyExternalcontactSegmentsRequest(String externalContactId, List<SegmentAssignmentsUpdate> body) {
    return PostJourneyExternalcontactSegmentsRequest.builder()
            .withExternalContactId(externalContactId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postJourneyExternalcontactSegments(PostJourneyExternalcontactSegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Assign/Unassign a segment to/from an external contact or, if a segment is already assigned, update the expiry date of the segment assignment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postJourneyExternalcontactSegments(ApiRequest<List<SegmentAssignmentsUpdate>> request) throws IOException {
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

  
}
