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
import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionOutcomescoresRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneySegmentsRequest;

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
   * Delete single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyActionmap(String actionMapId) throws IOException, ApiException {
     deleteJourneyActionmap(createDeleteJourneyActionmapRequest(actionMapId));
  }

  /**
   * Delete single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyActionmapWithHttpInfo(String actionMapId) throws IOException {
    return deleteJourneyActionmap(createDeleteJourneyActionmapRequest(actionMapId).withHttpInfo());
  }

  private DeleteJourneyActionmapRequest createDeleteJourneyActionmapRequest(String actionMapId) {
    return DeleteJourneyActionmapRequest.builder()
            .withActionMapId(actionMapId)
    
            .build();
  }

  /**
   * Delete single action map.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyActionmap(DeleteJourneyActionmapRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete single action map.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyActionmap(ApiRequest<Void> request) throws IOException {
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
   * Delete a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @param hardDelete Determines whether Action Template should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyActiontemplate(String actionTemplateId, Boolean hardDelete) throws IOException, ApiException {
     deleteJourneyActiontemplate(createDeleteJourneyActiontemplateRequest(actionTemplateId, hardDelete));
  }

  /**
   * Delete a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @param hardDelete Determines whether Action Template should be soft-deleted (have it&#39;s state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyActiontemplateWithHttpInfo(String actionTemplateId, Boolean hardDelete) throws IOException {
    return deleteJourneyActiontemplate(createDeleteJourneyActiontemplateRequest(actionTemplateId, hardDelete).withHttpInfo());
  }

  private DeleteJourneyActiontemplateRequest createDeleteJourneyActiontemplateRequest(String actionTemplateId, Boolean hardDelete) {
    return DeleteJourneyActiontemplateRequest.builder()
            .withActionTemplateId(actionTemplateId)
    
            .withHardDelete(hardDelete)
    
            .build();
  }

  /**
   * Delete a single action template.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyActiontemplate(DeleteJourneyActiontemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a single action template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyActiontemplate(ApiRequest<Void> request) throws IOException {
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
   * Delete an outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyOutcome(String outcomeId) throws IOException, ApiException {
     deleteJourneyOutcome(createDeleteJourneyOutcomeRequest(outcomeId));
  }

  /**
   * Delete an outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyOutcomeWithHttpInfo(String outcomeId) throws IOException {
    return deleteJourneyOutcome(createDeleteJourneyOutcomeRequest(outcomeId).withHttpInfo());
  }

  private DeleteJourneyOutcomeRequest createDeleteJourneyOutcomeRequest(String outcomeId) {
    return DeleteJourneyOutcomeRequest.builder()
            .withOutcomeId(outcomeId)
    
            .build();
  }

  /**
   * Delete an outcome.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyOutcome(DeleteJourneyOutcomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an outcome.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyOutcome(ApiRequest<Void> request) throws IOException {
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
   * Delete a segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneySegment(String segmentId) throws IOException, ApiException {
     deleteJourneySegment(createDeleteJourneySegmentRequest(segmentId));
  }

  /**
   * Delete a segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneySegmentWithHttpInfo(String segmentId) throws IOException {
    return deleteJourneySegment(createDeleteJourneySegmentRequest(segmentId).withHttpInfo());
  }

  private DeleteJourneySegmentRequest createDeleteJourneySegmentRequest(String segmentId) {
    return DeleteJourneySegmentRequest.builder()
            .withSegmentId(segmentId)
    
            .build();
  }

  /**
   * Delete a segment.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneySegment(DeleteJourneySegmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a segment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneySegment(ApiRequest<Void> request) throws IOException {
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
   * Retrieve a single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap getJourneyActionmap(String actionMapId) throws IOException, ApiException {
    return  getJourneyActionmap(createGetJourneyActionmapRequest(actionMapId));
  }

  /**
   * Retrieve a single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @return ActionMap
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> getJourneyActionmapWithHttpInfo(String actionMapId) throws IOException {
    return getJourneyActionmap(createGetJourneyActionmapRequest(actionMapId).withHttpInfo());
  }

  private GetJourneyActionmapRequest createGetJourneyActionmapRequest(String actionMapId) {
    return GetJourneyActionmapRequest.builder()
            .withActionMapId(actionMapId)
    
            .build();
  }

  /**
   * Retrieve a single action map.
   * 
   * @param request The request object
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap getJourneyActionmap(GetJourneyActionmapRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionMap> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionMap>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single action map.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> getJourneyActionmap(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionMap>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all action maps.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param filterField Field to filter by (e.g. filterField=weight or filterField=action.actionTemplate.id). Requires &#39;filterField&#39; to also be set. (optional)
   * @param filterValue Value to filter by. Requires &#39;filterValue&#39; to also be set. (optional)
   * @param actionMapIds IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. (optional)
   * @param queryFields Action Map field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return ActionMapListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMapListing getJourneyActionmaps(Integer pageNumber, Integer pageSize, String sortBy, String filterField, String filterValue, List<String> actionMapIds, List<String> queryFields, String queryValue) throws IOException, ApiException {
    return  getJourneyActionmaps(createGetJourneyActionmapsRequest(pageNumber, pageSize, sortBy, filterField, filterValue, actionMapIds, queryFields, queryValue));
  }

  /**
   * Retrieve all action maps.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param filterField Field to filter by (e.g. filterField=weight or filterField=action.actionTemplate.id). Requires &#39;filterField&#39; to also be set. (optional)
   * @param filterValue Value to filter by. Requires &#39;filterValue&#39; to also be set. (optional)
   * @param actionMapIds IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. (optional)
   * @param queryFields Action Map field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return ActionMapListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMapListing> getJourneyActionmapsWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String filterField, String filterValue, List<String> actionMapIds, List<String> queryFields, String queryValue) throws IOException {
    return getJourneyActionmaps(createGetJourneyActionmapsRequest(pageNumber, pageSize, sortBy, filterField, filterValue, actionMapIds, queryFields, queryValue).withHttpInfo());
  }

  private GetJourneyActionmapsRequest createGetJourneyActionmapsRequest(Integer pageNumber, Integer pageSize, String sortBy, String filterField, String filterValue, List<String> actionMapIds, List<String> queryFields, String queryValue) {
    return GetJourneyActionmapsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortBy(sortBy)
    
            .withFilterField(filterField)
    
            .withFilterValue(filterValue)
    
            .withActionMapIds(actionMapIds)
    
            .withQueryFields(queryFields)
    
            .withQueryValue(queryValue)
    
            .build();
  }

  /**
   * Retrieve all action maps.
   * 
   * @param request The request object
   * @return ActionMapListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMapListing getJourneyActionmaps(GetJourneyActionmapsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionMapListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionMapListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all action maps.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMapListing> getJourneyActionmaps(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionMapListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionMapListing> response = (ApiResponse<ActionMapListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionMapListing> response = (ApiResponse<ActionMapListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
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
   * Retrieve a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate getJourneyActiontemplate(String actionTemplateId) throws IOException, ApiException {
    return  getJourneyActiontemplate(createGetJourneyActiontemplateRequest(actionTemplateId));
  }

  /**
   * Retrieve a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @return ActionTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> getJourneyActiontemplateWithHttpInfo(String actionTemplateId) throws IOException {
    return getJourneyActiontemplate(createGetJourneyActiontemplateRequest(actionTemplateId).withHttpInfo());
  }

  private GetJourneyActiontemplateRequest createGetJourneyActiontemplateRequest(String actionTemplateId) {
    return GetJourneyActiontemplateRequest.builder()
            .withActionTemplateId(actionTemplateId)
    
            .build();
  }

  /**
   * Retrieve a single action template.
   * 
   * @param request The request object
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate getJourneyActiontemplate(GetJourneyActiontemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single action template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> getJourneyActiontemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all action templates.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy=name,-createdDate). (optional)
   * @param mediaType Media type (optional)
   * @param state Action template state. (optional)
   * @param queryFields ActionTemplate field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return ActionTemplateListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplateListing getJourneyActiontemplates(Integer pageNumber, Integer pageSize, String sortBy, String mediaType, String state, List<String> queryFields, String queryValue) throws IOException, ApiException {
    return  getJourneyActiontemplates(createGetJourneyActiontemplatesRequest(pageNumber, pageSize, sortBy, mediaType, state, queryFields, queryValue));
  }

  /**
   * Retrieve all action templates.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. Prefix with &#39;-&#39; for descending (e.g. sortBy=name,-createdDate). (optional)
   * @param mediaType Media type (optional)
   * @param state Action template state. (optional)
   * @param queryFields ActionTemplate field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return ActionTemplateListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplateListing> getJourneyActiontemplatesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, String mediaType, String state, List<String> queryFields, String queryValue) throws IOException {
    return getJourneyActiontemplates(createGetJourneyActiontemplatesRequest(pageNumber, pageSize, sortBy, mediaType, state, queryFields, queryValue).withHttpInfo());
  }

  private GetJourneyActiontemplatesRequest createGetJourneyActiontemplatesRequest(Integer pageNumber, Integer pageSize, String sortBy, String mediaType, String state, List<String> queryFields, String queryValue) {
    return GetJourneyActiontemplatesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortBy(sortBy)
    
            .withMediaType(mediaType)
    
            .withState(state)
    
            .withQueryFields(queryFields)
    
            .withQueryValue(queryValue)
    
            .build();
  }

  /**
   * Retrieve all action templates.
   * 
   * @param request The request object
   * @return ActionTemplateListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplateListing getJourneyActiontemplates(GetJourneyActiontemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTemplateListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTemplateListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all action templates.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplateListing> getJourneyActiontemplates(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTemplateListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTemplateListing> response = (ApiResponse<ActionTemplateListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTemplateListing> response = (ApiResponse<ActionTemplateListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a single outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome getJourneyOutcome(String outcomeId) throws IOException, ApiException {
    return  getJourneyOutcome(createGetJourneyOutcomeRequest(outcomeId));
  }

  /**
   * Retrieve a single outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @return Outcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> getJourneyOutcomeWithHttpInfo(String outcomeId) throws IOException {
    return getJourneyOutcome(createGetJourneyOutcomeRequest(outcomeId).withHttpInfo());
  }

  private GetJourneyOutcomeRequest createGetJourneyOutcomeRequest(String outcomeId) {
    return GetJourneyOutcomeRequest.builder()
            .withOutcomeId(outcomeId)
    
            .build();
  }

  /**
   * Retrieve a single outcome.
   * 
   * @param request The request object
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome getJourneyOutcome(GetJourneyOutcomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Outcome> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Outcome>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single outcome.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> getJourneyOutcome(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Outcome>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
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
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all outcomes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param outcomeIds IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. (optional)
   * @param queryFields Outcome field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return OutcomeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeListing getJourneyOutcomes(Integer pageNumber, Integer pageSize, String sortBy, List<String> outcomeIds, List<String> queryFields, String queryValue) throws IOException, ApiException {
    return  getJourneyOutcomes(createGetJourneyOutcomesRequest(pageNumber, pageSize, sortBy, outcomeIds, queryFields, queryValue));
  }

  /**
   * Retrieve all outcomes.
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param outcomeIds IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. (optional)
   * @param queryFields Outcome field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return OutcomeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomeListing> getJourneyOutcomesWithHttpInfo(Integer pageNumber, Integer pageSize, String sortBy, List<String> outcomeIds, List<String> queryFields, String queryValue) throws IOException {
    return getJourneyOutcomes(createGetJourneyOutcomesRequest(pageNumber, pageSize, sortBy, outcomeIds, queryFields, queryValue).withHttpInfo());
  }

  private GetJourneyOutcomesRequest createGetJourneyOutcomesRequest(Integer pageNumber, Integer pageSize, String sortBy, List<String> outcomeIds, List<String> queryFields, String queryValue) {
    return GetJourneyOutcomesRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .withSortBy(sortBy)
    
            .withOutcomeIds(outcomeIds)
    
            .withQueryFields(queryFields)
    
            .withQueryValue(queryValue)
    
            .build();
  }

  /**
   * Retrieve all outcomes.
   * 
   * @param request The request object
   * @return OutcomeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeListing getJourneyOutcomes(GetJourneyOutcomesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all outcomes.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomeListing> getJourneyOutcomes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomeListing> response = (ApiResponse<OutcomeListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomeListing> response = (ApiResponse<OutcomeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a single segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment getJourneySegment(String segmentId) throws IOException, ApiException {
    return  getJourneySegment(createGetJourneySegmentRequest(segmentId));
  }

  /**
   * Retrieve a single segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @return JourneySegment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> getJourneySegmentWithHttpInfo(String segmentId) throws IOException {
    return getJourneySegment(createGetJourneySegmentRequest(segmentId).withHttpInfo());
  }

  private GetJourneySegmentRequest createGetJourneySegmentRequest(String segmentId) {
    return GetJourneySegmentRequest.builder()
            .withSegmentId(segmentId)
    
            .build();
  }

  /**
   * Retrieve a single segment.
   * 
   * @param request The request object
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment getJourneySegment(GetJourneySegmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneySegment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneySegment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single segment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> getJourneySegment(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneySegment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve all segments.
   * 
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param isActive Determines whether or not to show only active segments. (optional)
   * @param segmentIds IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. (optional)
   * @param queryFields Segment field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return SegmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentListing getJourneySegments(String sortBy, Integer pageSize, Integer pageNumber, Boolean isActive, List<String> segmentIds, List<String> queryFields, String queryValue) throws IOException, ApiException {
    return  getJourneySegments(createGetJourneySegmentsRequest(sortBy, pageSize, pageNumber, isActive, segmentIds, queryFields, queryValue));
  }

  /**
   * Retrieve all segments.
   * 
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with &#39;-&#39; for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param isActive Determines whether or not to show only active segments. (optional)
   * @param segmentIds IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. (optional)
   * @param queryFields Segment field(s) to query on. Requires &#39;queryValue&#39; to also be set. (optional)
   * @param queryValue Value to query on. Requires &#39;queryFields&#39; to also be set. (optional)
   * @return SegmentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentListing> getJourneySegmentsWithHttpInfo(String sortBy, Integer pageSize, Integer pageNumber, Boolean isActive, List<String> segmentIds, List<String> queryFields, String queryValue) throws IOException {
    return getJourneySegments(createGetJourneySegmentsRequest(sortBy, pageSize, pageNumber, isActive, segmentIds, queryFields, queryValue).withHttpInfo());
  }

  private GetJourneySegmentsRequest createGetJourneySegmentsRequest(String sortBy, Integer pageSize, Integer pageNumber, Boolean isActive, List<String> segmentIds, List<String> queryFields, String queryValue) {
    return GetJourneySegmentsRequest.builder()
            .withSortBy(sortBy)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withIsActive(isActive)
    
            .withSegmentIds(segmentIds)
    
            .withQueryFields(queryFields)
    
            .withQueryValue(queryValue)
    
            .build();
  }

  /**
   * Retrieve all segments.
   * 
   * @param request The request object
   * @return SegmentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SegmentListing getJourneySegments(GetJourneySegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SegmentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SegmentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all segments.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SegmentListing> getJourneySegments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SegmentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SegmentListing> response = (ApiResponse<SegmentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SegmentListing> response = (ApiResponse<SegmentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a single session.
   * 
   * @param sessionId ID of the session. (required)
   * @return Session
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Session getJourneySession(String sessionId) throws IOException, ApiException {
    return  getJourneySession(createGetJourneySessionRequest(sessionId));
  }

  /**
   * Retrieve a single session.
   * 
   * @param sessionId ID of the session. (required)
   * @return Session
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Session> getJourneySessionWithHttpInfo(String sessionId) throws IOException {
    return getJourneySession(createGetJourneySessionRequest(sessionId).withHttpInfo());
  }

  private GetJourneySessionRequest createGetJourneySessionRequest(String sessionId) {
    return GetJourneySessionRequest.builder()
            .withSessionId(sessionId)
    
            .build();
  }

  /**
   * Retrieve a single session.
   * 
   * @param request The request object
   * @return Session
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Session getJourneySession(GetJourneySessionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Session> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Session>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Session> getJourneySession(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Session>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Session> response = (ApiResponse<Session>)(ApiResponse<?>)exception;
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
      ApiResponse<Session> response = (ApiResponse<Session>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param sessionId ID of the session. (required)
   * @return OutcomeScoresResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeScoresResult getJourneySessionOutcomescores(String sessionId) throws IOException, ApiException {
    return  getJourneySessionOutcomescores(createGetJourneySessionOutcomescoresRequest(sessionId));
  }

  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param sessionId ID of the session. (required)
   * @return OutcomeScoresResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomeScoresResult> getJourneySessionOutcomescoresWithHttpInfo(String sessionId) throws IOException {
    return getJourneySessionOutcomescores(createGetJourneySessionOutcomescoresRequest(sessionId).withHttpInfo());
  }

  private GetJourneySessionOutcomescoresRequest createGetJourneySessionOutcomescoresRequest(String sessionId) {
    return GetJourneySessionOutcomescoresRequest.builder()
            .withSessionId(sessionId)
    
            .build();
  }

  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param request The request object
   * @return OutcomeScoresResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeScoresResult getJourneySessionOutcomescores(GetJourneySessionOutcomescoresRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomeScoresResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomeScoresResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve latest outcome score associated with a session for all outcomes.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomeScoresResult> getJourneySessionOutcomescores(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomeScoresResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomeScoresResult> response = (ApiResponse<OutcomeScoresResult>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomeScoresResult> response = (ApiResponse<OutcomeScoresResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @param body  (optional)
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap patchJourneyActionmap(String actionMapId, PatchActionMap body) throws IOException, ApiException {
    return  patchJourneyActionmap(createPatchJourneyActionmapRequest(actionMapId, body));
  }

  /**
   * Update single action map.
   * 
   * @param actionMapId ID of the action map. (required)
   * @param body  (optional)
   * @return ActionMap
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> patchJourneyActionmapWithHttpInfo(String actionMapId, PatchActionMap body) throws IOException {
    return patchJourneyActionmap(createPatchJourneyActionmapRequest(actionMapId, body).withHttpInfo());
  }

  private PatchJourneyActionmapRequest createPatchJourneyActionmapRequest(String actionMapId, PatchActionMap body) {
    return PatchJourneyActionmapRequest.builder()
            .withActionMapId(actionMapId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update single action map.
   * 
   * @param request The request object
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap patchJourneyActionmap(PatchJourneyActionmapRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionMap> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionMap>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update single action map.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> patchJourneyActionmap(ApiRequest<PatchActionMap> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionMap>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
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
   * Update a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @param body  (optional)
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate patchJourneyActiontemplate(String actionTemplateId, PatchActionTemplate body) throws IOException, ApiException {
    return  patchJourneyActiontemplate(createPatchJourneyActiontemplateRequest(actionTemplateId, body));
  }

  /**
   * Update a single action template.
   * 
   * @param actionTemplateId ID of the action template. (required)
   * @param body  (optional)
   * @return ActionTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> patchJourneyActiontemplateWithHttpInfo(String actionTemplateId, PatchActionTemplate body) throws IOException {
    return patchJourneyActiontemplate(createPatchJourneyActiontemplateRequest(actionTemplateId, body).withHttpInfo());
  }

  private PatchJourneyActiontemplateRequest createPatchJourneyActiontemplateRequest(String actionTemplateId, PatchActionTemplate body) {
    return PatchJourneyActiontemplateRequest.builder()
            .withActionTemplateId(actionTemplateId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a single action template.
   * 
   * @param request The request object
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate patchJourneyActiontemplate(PatchJourneyActiontemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a single action template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> patchJourneyActiontemplate(ApiRequest<PatchActionTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @param body  (optional)
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome patchJourneyOutcome(String outcomeId, PatchOutcome body) throws IOException, ApiException {
    return  patchJourneyOutcome(createPatchJourneyOutcomeRequest(outcomeId, body));
  }

  /**
   * Update an outcome.
   * 
   * @param outcomeId ID of the outcome. (required)
   * @param body  (optional)
   * @return Outcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> patchJourneyOutcomeWithHttpInfo(String outcomeId, PatchOutcome body) throws IOException {
    return patchJourneyOutcome(createPatchJourneyOutcomeRequest(outcomeId, body).withHttpInfo());
  }

  private PatchJourneyOutcomeRequest createPatchJourneyOutcomeRequest(String outcomeId, PatchOutcome body) {
    return PatchJourneyOutcomeRequest.builder()
            .withOutcomeId(outcomeId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an outcome.
   * 
   * @param request The request object
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome patchJourneyOutcome(PatchJourneyOutcomeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Outcome> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Outcome>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an outcome.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> patchJourneyOutcome(ApiRequest<PatchOutcome> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Outcome>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
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
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @param body  (optional)
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment patchJourneySegment(String segmentId, PatchSegment body) throws IOException, ApiException {
    return  patchJourneySegment(createPatchJourneySegmentRequest(segmentId, body));
  }

  /**
   * Update a segment.
   * 
   * @param segmentId ID of the segment. (required)
   * @param body  (optional)
   * @return JourneySegment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> patchJourneySegmentWithHttpInfo(String segmentId, PatchSegment body) throws IOException {
    return patchJourneySegment(createPatchJourneySegmentRequest(segmentId, body).withHttpInfo());
  }

  private PatchJourneySegmentRequest createPatchJourneySegmentRequest(String segmentId, PatchSegment body) {
    return PatchJourneySegmentRequest.builder()
            .withSegmentId(segmentId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a segment.
   * 
   * @param request The request object
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment patchJourneySegment(PatchJourneySegmentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneySegment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneySegment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a segment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> patchJourneySegment(ApiRequest<PatchSegment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneySegment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create an action map.
   * 
   * @param body  (optional)
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap postJourneyActionmaps(ActionMap body) throws IOException, ApiException {
    return  postJourneyActionmaps(createPostJourneyActionmapsRequest(body));
  }

  /**
   * Create an action map.
   * 
   * @param body  (optional)
   * @return ActionMap
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> postJourneyActionmapsWithHttpInfo(ActionMap body) throws IOException {
    return postJourneyActionmaps(createPostJourneyActionmapsRequest(body).withHttpInfo());
  }

  private PostJourneyActionmapsRequest createPostJourneyActionmapsRequest(ActionMap body) {
    return PostJourneyActionmapsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an action map.
   * 
   * @param request The request object
   * @return ActionMap
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMap postJourneyActionmaps(PostJourneyActionmapsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionMap> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionMap>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an action map.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMap> postJourneyActionmaps(ApiRequest<ActionMap> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionMap>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionMap> response = (ApiResponse<ActionMap>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a single action template.
   * 
   * @param body  (optional)
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate postJourneyActiontemplates(ActionTemplate body) throws IOException, ApiException {
    return  postJourneyActiontemplates(createPostJourneyActiontemplatesRequest(body));
  }

  /**
   * Create a single action template.
   * 
   * @param body  (optional)
   * @return ActionTemplate
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> postJourneyActiontemplatesWithHttpInfo(ActionTemplate body) throws IOException {
    return postJourneyActiontemplates(createPostJourneyActiontemplatesRequest(body).withHttpInfo());
  }

  private PostJourneyActiontemplatesRequest createPostJourneyActiontemplatesRequest(ActionTemplate body) {
    return PostJourneyActiontemplatesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a single action template.
   * 
   * @param request The request object
   * @return ActionTemplate
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionTemplate postJourneyActiontemplates(PostJourneyActiontemplatesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionTemplate> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionTemplate>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a single action template.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionTemplate> postJourneyActiontemplates(ApiRequest<ActionTemplate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionTemplate>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionTemplate> response = (ApiResponse<ActionTemplate>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an outcome.
   * 
   * @param body  (optional)
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome postJourneyOutcomes(Outcome body) throws IOException, ApiException {
    return  postJourneyOutcomes(createPostJourneyOutcomesRequest(body));
  }

  /**
   * Create an outcome.
   * 
   * @param body  (optional)
   * @return Outcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> postJourneyOutcomesWithHttpInfo(Outcome body) throws IOException {
    return postJourneyOutcomes(createPostJourneyOutcomesRequest(body).withHttpInfo());
  }

  private PostJourneyOutcomesRequest createPostJourneyOutcomesRequest(Outcome body) {
    return PostJourneyOutcomesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an outcome.
   * 
   * @param request The request object
   * @return Outcome
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Outcome postJourneyOutcomes(PostJourneyOutcomesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Outcome> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Outcome>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an outcome.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> postJourneyOutcomes(ApiRequest<Outcome> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Outcome>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)exception;
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
      ApiResponse<Outcome> response = (ApiResponse<Outcome>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a segment.
   * 
   * @param body  (optional)
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment postJourneySegments(JourneySegment body) throws IOException, ApiException {
    return  postJourneySegments(createPostJourneySegmentsRequest(body));
  }

  /**
   * Create a segment.
   * 
   * @param body  (optional)
   * @return JourneySegment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> postJourneySegmentsWithHttpInfo(JourneySegment body) throws IOException {
    return postJourneySegments(createPostJourneySegmentsRequest(body).withHttpInfo());
  }

  private PostJourneySegmentsRequest createPostJourneySegmentsRequest(JourneySegment body) {
    return PostJourneySegmentsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a segment.
   * 
   * @param request The request object
   * @return JourneySegment
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneySegment postJourneySegments(PostJourneySegmentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneySegment> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneySegment>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a segment.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> postJourneySegments(ApiRequest<JourneySegment> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneySegment>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneySegment> response = (ApiResponse<JourneySegment>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
