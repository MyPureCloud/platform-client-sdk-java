package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateRequest;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateResult;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentListing;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;


import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomesPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyCustomerCustomerIdSessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesAttributionsJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesAttributionsJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyOutcomesPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionEventsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionOutcomescoresRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneySessionSegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.PatchJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsJourneysAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActionmapsEstimatesJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesAttributionsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesPredictorsRequest;
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
   * @param hardDelete Determines whether Action Template should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
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
   * @param hardDelete Determines whether Action Template should be soft-deleted (have it's state set to deleted) or hard-deleted (permanently removed). Set to false (soft-delete) by default. (optional)
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
   * Delete an outcome predictor.
   * 
   * @param predictorId ID of predictor (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyOutcomesPredictor(String predictorId) throws IOException, ApiException {
     deleteJourneyOutcomesPredictor(createDeleteJourneyOutcomesPredictorRequest(predictorId));
  }

  /**
   * Delete an outcome predictor.
   * 
   * @param predictorId ID of predictor (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyOutcomesPredictorWithHttpInfo(String predictorId) throws IOException {
    return deleteJourneyOutcomesPredictor(createDeleteJourneyOutcomesPredictorRequest(predictorId).withHttpInfo());
  }

  private DeleteJourneyOutcomesPredictorRequest createDeleteJourneyOutcomesPredictorRequest(String predictorId) {
    return DeleteJourneyOutcomesPredictorRequest.builder()
            .withPredictorId(predictorId)

            .build();
  }

  /**
   * Delete an outcome predictor.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyOutcomesPredictor(DeleteJourneyOutcomesPredictorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an outcome predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyOutcomesPredictor(ApiRequest<Void> request) throws IOException {
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
   * Get status for async query for journey aggregates
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public AsyncQueryStatus getAnalyticsJourneysAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJob(createGetAnalyticsJourneysAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsJourneysAggregatesJobWithHttpInfo(String jobId) throws IOException {
    return getAnalyticsJourneysAggregatesJob(createGetAnalyticsJourneysAggregatesJobRequest(jobId).withHttpInfo());
  }

  private GetAnalyticsJourneysAggregatesJobRequest createGetAnalyticsJourneysAggregatesJobRequest(String jobId) {
    return GetAnalyticsJourneysAggregatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public AsyncQueryStatus getAnalyticsJourneysAggregatesJob(GetAnalyticsJourneysAggregatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<AsyncQueryStatus> getAnalyticsJourneysAggregatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryStatus> response = (ApiResponse<AsyncQueryStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public JourneyAsyncAggregateQueryResponse getAnalyticsJourneysAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJobResults(createGetAnalyticsJourneysAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<JourneyAsyncAggregateQueryResponse> getAnalyticsJourneysAggregatesJobResultsWithHttpInfo(String jobId, String cursor) throws IOException {
    return getAnalyticsJourneysAggregatesJobResults(createGetAnalyticsJourneysAggregatesJobResultsRequest(jobId, cursor).withHttpInfo());
  }

  private GetAnalyticsJourneysAggregatesJobResultsRequest createGetAnalyticsJourneysAggregatesJobResultsRequest(String jobId, String cursor) {
    return GetAnalyticsJourneysAggregatesJobResultsRequest.builder()
            .withJobId(jobId)

            .withCursor(cursor)

            .build();
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * @param request The request object
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public JourneyAsyncAggregateQueryResponse getAnalyticsJourneysAggregatesJobResults(GetAnalyticsJourneysAggregatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyAsyncAggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<JourneyAsyncAggregateQueryResponse> getAnalyticsJourneysAggregatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyAsyncAggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyAsyncAggregateQueryResponse> response = (ApiResponse<JourneyAsyncAggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param sortBy Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param filterField Field to filter by (e.g. filterField=weight or filterField=action.actionTemplate.id). Requires 'filterField' to also be set. (optional)
   * @param filterValue Value to filter by. Requires 'filterValue' to also be set. (optional)
   * @param actionMapIds IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. (optional)
   * @param queryFields Action Map field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * @param sortBy Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param filterField Field to filter by (e.g. filterField=weight or filterField=action.actionTemplate.id). Requires 'filterField' to also be set. (optional)
   * @param filterValue Value to filter by. Requires 'filterValue' to also be set. (optional)
   * @param actionMapIds IDs of action maps to return. Use of this parameter is not compatible with pagination, filtering, sorting or querying. A maximum of 100 action maps are allowed per request. (optional)
   * @param queryFields Action Map field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * Get status of job.
   * 
   * @param jobId ID of the job. (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getJourneyActionmapsEstimatesJob(String jobId) throws IOException, ApiException {
    return  getJourneyActionmapsEstimatesJob(createGetJourneyActionmapsEstimatesJobRequest(jobId));
  }

  /**
   * Get status of job.
   * 
   * @param jobId ID of the job. (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getJourneyActionmapsEstimatesJobWithHttpInfo(String jobId) throws IOException {
    return getJourneyActionmapsEstimatesJob(createGetJourneyActionmapsEstimatesJobRequest(jobId).withHttpInfo());
  }

  private GetJourneyActionmapsEstimatesJobRequest createGetJourneyActionmapsEstimatesJobRequest(String jobId) {
    return GetJourneyActionmapsEstimatesJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get status of job.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getJourneyActionmapsEstimatesJob(GetJourneyActionmapsEstimatesJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get status of job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getJourneyActionmapsEstimatesJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get estimates from completed job.
   * 
   * @param jobId ID of the job. (required)
   * @return ActionMapEstimateResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMapEstimateResult getJourneyActionmapsEstimatesJobResults(String jobId) throws IOException, ApiException {
    return  getJourneyActionmapsEstimatesJobResults(createGetJourneyActionmapsEstimatesJobResultsRequest(jobId));
  }

  /**
   * Get estimates from completed job.
   * 
   * @param jobId ID of the job. (required)
   * @return ActionMapEstimateResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMapEstimateResult> getJourneyActionmapsEstimatesJobResultsWithHttpInfo(String jobId) throws IOException {
    return getJourneyActionmapsEstimatesJobResults(createGetJourneyActionmapsEstimatesJobResultsRequest(jobId).withHttpInfo());
  }

  private GetJourneyActionmapsEstimatesJobResultsRequest createGetJourneyActionmapsEstimatesJobResultsRequest(String jobId) {
    return GetJourneyActionmapsEstimatesJobResultsRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get estimates from completed job.
   * 
   * @param request The request object
   * @return ActionMapEstimateResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionMapEstimateResult getJourneyActionmapsEstimatesJobResults(GetJourneyActionmapsEstimatesJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionMapEstimateResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionMapEstimateResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get estimates from completed job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionMapEstimateResult> getJourneyActionmapsEstimatesJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionMapEstimateResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionMapEstimateResult> response = (ApiResponse<ActionMapEstimateResult>)(ApiResponse<?>)exception;
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
      ApiResponse<ActionMapEstimateResult> response = (ApiResponse<ActionMapEstimateResult>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param sortBy Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=name,-createdDate). (optional)
   * @param mediaType Media type (optional)
   * @param state Action template state. (optional)
   * @param queryFields ActionTemplate field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * @param sortBy Field(s) to sort by. Prefix with '-' for descending (e.g. sortBy=name,-createdDate). (optional)
   * @param mediaType Media type (optional)
   * @param state Action template state. (optional)
   * @param queryFields ActionTemplate field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * Retrieve all sessions for a given customer.
   * 
   * @param customerIdType Type of ID used to identify customer (e.g. email, cookie, and phone). (required)
   * @param customerId Primary identifier of the customer in the source of the session. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public SessionListing getJourneyCustomerCustomerIdSessions(String customerIdType, String customerId, String pageSize, String after) throws IOException, ApiException {
    return  getJourneyCustomerCustomerIdSessions(createGetJourneyCustomerCustomerIdSessionsRequest(customerIdType, customerId, pageSize, after));
  }

  /**
   * Retrieve all sessions for a given customer.
   * 
   * @param customerIdType Type of ID used to identify customer (e.g. email, cookie, and phone). (required)
   * @param customerId Primary identifier of the customer in the source of the session. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @return SessionListing
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<SessionListing> getJourneyCustomerCustomerIdSessionsWithHttpInfo(String customerIdType, String customerId, String pageSize, String after) throws IOException {
    return getJourneyCustomerCustomerIdSessions(createGetJourneyCustomerCustomerIdSessionsRequest(customerIdType, customerId, pageSize, after).withHttpInfo());
  }

  private GetJourneyCustomerCustomerIdSessionsRequest createGetJourneyCustomerCustomerIdSessionsRequest(String customerIdType, String customerId, String pageSize, String after) {
    return GetJourneyCustomerCustomerIdSessionsRequest.builder()
            .withCustomerIdType(customerIdType)

            .withCustomerId(customerId)

            .withPageSize(pageSize)

            .withAfter(after)

            .build();
  }

  /**
   * Retrieve all sessions for a given customer.
   * 
   * @param request The request object
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public SessionListing getJourneyCustomerCustomerIdSessions(GetJourneyCustomerCustomerIdSessionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SessionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SessionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all sessions for a given customer.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<SessionListing> getJourneyCustomerCustomerIdSessions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SessionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<SessionListing> response = (ApiResponse<SessionListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param outcomeIds IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. (optional)
   * @param queryFields Outcome field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param outcomeIds IDs of outcomes to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 20 outcomes are allowed per request. (optional)
   * @param queryFields Outcome field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * Get job status.
   * 
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionJobStateResponse getJourneyOutcomesAttributionsJob(String jobId) throws IOException, ApiException {
    return  getJourneyOutcomesAttributionsJob(createGetJourneyOutcomesAttributionsJobRequest(jobId));
  }

  /**
   * Get job status.
   * 
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionJobStateResponse
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionJobStateResponse> getJourneyOutcomesAttributionsJobWithHttpInfo(String jobId) throws IOException {
    return getJourneyOutcomesAttributionsJob(createGetJourneyOutcomesAttributionsJobRequest(jobId).withHttpInfo());
  }

  private GetJourneyOutcomesAttributionsJobRequest createGetJourneyOutcomesAttributionsJobRequest(String jobId) {
    return GetJourneyOutcomesAttributionsJobRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get job status.
   * 
   * @param request The request object
   * @return OutcomeAttributionJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionJobStateResponse getJourneyOutcomesAttributionsJob(GetJourneyOutcomesAttributionsJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomeAttributionJobStateResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomeAttributionJobStateResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get job status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionJobStateResponse> getJourneyOutcomesAttributionsJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomeAttributionJobStateResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomeAttributionJobStateResponse> response = (ApiResponse<OutcomeAttributionJobStateResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomeAttributionJobStateResponse> response = (ApiResponse<OutcomeAttributionJobStateResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionResponseListing getJourneyOutcomesAttributionsJobResults(String jobId) throws IOException, ApiException {
    return  getJourneyOutcomesAttributionsJobResults(createGetJourneyOutcomesAttributionsJobResultsRequest(jobId));
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionResponseListing
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionResponseListing> getJourneyOutcomesAttributionsJobResultsWithHttpInfo(String jobId) throws IOException {
    return getJourneyOutcomesAttributionsJobResults(createGetJourneyOutcomesAttributionsJobResultsRequest(jobId).withHttpInfo());
  }

  private GetJourneyOutcomesAttributionsJobResultsRequest createGetJourneyOutcomesAttributionsJobResultsRequest(String jobId) {
    return GetJourneyOutcomesAttributionsJobResultsRequest.builder()
            .withJobId(jobId)

            .build();
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * @param request The request object
   * @return OutcomeAttributionResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionResponseListing getJourneyOutcomesAttributionsJobResults(GetJourneyOutcomesAttributionsJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomeAttributionResponseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomeAttributionResponseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionResponseListing> getJourneyOutcomesAttributionsJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomeAttributionResponseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomeAttributionResponseListing> response = (ApiResponse<OutcomeAttributionResponseListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomeAttributionResponseListing> response = (ApiResponse<OutcomeAttributionResponseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param predictorId ID of predictor (required)
   * @return OutcomePredictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictor getJourneyOutcomesPredictor(String predictorId) throws IOException, ApiException {
    return  getJourneyOutcomesPredictor(createGetJourneyOutcomesPredictorRequest(predictorId));
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param predictorId ID of predictor (required)
   * @return OutcomePredictor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictor> getJourneyOutcomesPredictorWithHttpInfo(String predictorId) throws IOException {
    return getJourneyOutcomesPredictor(createGetJourneyOutcomesPredictorRequest(predictorId).withHttpInfo());
  }

  private GetJourneyOutcomesPredictorRequest createGetJourneyOutcomesPredictorRequest(String predictorId) {
    return GetJourneyOutcomesPredictorRequest.builder()
            .withPredictorId(predictorId)

            .build();
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param request The request object
   * @return OutcomePredictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictor getJourneyOutcomesPredictor(GetJourneyOutcomesPredictorRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomePredictor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomePredictor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a single outcome predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictor> getJourneyOutcomesPredictor(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomePredictor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @return OutcomePredictorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictorListing getJourneyOutcomesPredictors() throws IOException, ApiException {
    return  getJourneyOutcomesPredictors(createGetJourneyOutcomesPredictorsRequest());
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @return OutcomePredictorListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictorListing> getJourneyOutcomesPredictorsWithHttpInfo() throws IOException {
    return getJourneyOutcomesPredictors(createGetJourneyOutcomesPredictorsRequest().withHttpInfo());
  }

  private GetJourneyOutcomesPredictorsRequest createGetJourneyOutcomesPredictorsRequest() {
    return GetJourneyOutcomesPredictorsRequest.builder()
            .build();
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @param request The request object
   * @return OutcomePredictorListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictorListing getJourneyOutcomesPredictors(GetJourneyOutcomesPredictorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomePredictorListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomePredictorListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all outcome predictors.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictorListing> getJourneyOutcomesPredictors(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomePredictorListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomePredictorListing> response = (ApiResponse<OutcomePredictorListing>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomePredictorListing> response = (ApiResponse<OutcomePredictorListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param isActive Determines whether or not to show only active segments. (optional)
   * @param segmentIds IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. (optional)
   * @param queryFields Segment field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * @param sortBy Field(s) to sort by. The response can be sorted by any first level property on the Outcome response. Prefix with '-' for descending (e.g. sortBy=displayName,-createdDate). (optional)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param isActive Determines whether or not to show only active segments. (optional)
   * @param segmentIds IDs of segments to return. Use of this parameter is not compatible with pagination, sorting or querying. A maximum of 100 segments are allowed per request. (optional)
   * @param queryFields Segment field(s) to query on. Requires 'queryValue' to also be set. (optional)
   * @param queryValue Value to query on. Requires 'queryFields' to also be set. (optional)
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
   * Retrieve all events for a given session.
   * 
   * @param sessionId System-generated UUID that represents the session the event is a part of. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public EventListing getJourneySessionEvents(String sessionId, String pageSize, String after) throws IOException, ApiException {
    return  getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, pageSize, after));
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param sessionId System-generated UUID that represents the session the event is a part of. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @return EventListing
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<EventListing> getJourneySessionEventsWithHttpInfo(String sessionId, String pageSize, String after) throws IOException {
    return getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, pageSize, after).withHttpInfo());
  }

  private GetJourneySessionEventsRequest createGetJourneySessionEventsRequest(String sessionId, String pageSize, String after) {
    return GetJourneySessionEventsRequest.builder()
            .withSessionId(sessionId)

            .withPageSize(pageSize)

            .withAfter(after)

            .build();
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param request The request object
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public EventListing getJourneySessionEvents(GetJourneySessionEventsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EventListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EventListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<EventListing> getJourneySessionEvents(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EventListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EventListing> response = (ApiResponse<EventListing>)(ApiResponse<?>)(new ApiException(exception));
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
	 * Preview Endpoint
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
	 * Preview Endpoint
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
	 * Preview Endpoint
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
	 * Preview Endpoint
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
   * Query for journey aggregates asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public AsyncQueryResponse postAnalyticsJourneysAggregatesJobs(JourneyAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsJourneysAggregatesJobs(createPostAnalyticsJourneysAggregatesJobsRequest(body));
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsJourneysAggregatesJobsWithHttpInfo(JourneyAsyncAggregationQuery body) throws IOException {
    return postAnalyticsJourneysAggregatesJobs(createPostAnalyticsJourneysAggregatesJobsRequest(body).withHttpInfo());
  }

  private PostAnalyticsJourneysAggregatesJobsRequest createPostAnalyticsJourneysAggregatesJobsRequest(JourneyAsyncAggregationQuery body) {
    return PostAnalyticsJourneysAggregatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public AsyncQueryResponse postAnalyticsJourneysAggregatesJobs(PostAnalyticsJourneysAggregatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AsyncQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AsyncQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<AsyncQueryResponse> postAnalyticsJourneysAggregatesJobs(ApiRequest<JourneyAsyncAggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AsyncQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AsyncQueryResponse> response = (ApiResponse<AsyncQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Query for estimates
   * 
   * @param body audience estimator request (required)
   * @return EstimateJobAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateJobAsyncResponse postJourneyActionmapsEstimatesJobs(ActionMapEstimateRequest body) throws IOException, ApiException {
    return  postJourneyActionmapsEstimatesJobs(createPostJourneyActionmapsEstimatesJobsRequest(body));
  }

  /**
   * Query for estimates
   * 
   * @param body audience estimator request (required)
   * @return EstimateJobAsyncResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateJobAsyncResponse> postJourneyActionmapsEstimatesJobsWithHttpInfo(ActionMapEstimateRequest body) throws IOException {
    return postJourneyActionmapsEstimatesJobs(createPostJourneyActionmapsEstimatesJobsRequest(body).withHttpInfo());
  }

  private PostJourneyActionmapsEstimatesJobsRequest createPostJourneyActionmapsEstimatesJobsRequest(ActionMapEstimateRequest body) {
    return PostJourneyActionmapsEstimatesJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for estimates
   * 
   * @param request The request object
   * @return EstimateJobAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EstimateJobAsyncResponse postJourneyActionmapsEstimatesJobs(PostJourneyActionmapsEstimatesJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EstimateJobAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EstimateJobAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for estimates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EstimateJobAsyncResponse> postJourneyActionmapsEstimatesJobs(ApiRequest<ActionMapEstimateRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EstimateJobAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EstimateJobAsyncResponse> response = (ApiResponse<EstimateJobAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<EstimateJobAsyncResponse> response = (ApiResponse<EstimateJobAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
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
   * Create Outcome Attributions
   * 
   * @param body outcome attribution request (optional)
   * @return OutcomeAttributionAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionAsyncResponse postJourneyOutcomesAttributionsJobs(OutcomeAttributionListing body) throws IOException, ApiException {
    return  postJourneyOutcomesAttributionsJobs(createPostJourneyOutcomesAttributionsJobsRequest(body));
  }

  /**
   * Create Outcome Attributions
   * 
   * @param body outcome attribution request (optional)
   * @return OutcomeAttributionAsyncResponse
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionAsyncResponse> postJourneyOutcomesAttributionsJobsWithHttpInfo(OutcomeAttributionListing body) throws IOException {
    return postJourneyOutcomesAttributionsJobs(createPostJourneyOutcomesAttributionsJobsRequest(body).withHttpInfo());
  }

  private PostJourneyOutcomesAttributionsJobsRequest createPostJourneyOutcomesAttributionsJobsRequest(OutcomeAttributionListing body) {
    return PostJourneyOutcomesAttributionsJobsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create Outcome Attributions
   * 
   * @param request The request object
   * @return OutcomeAttributionAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public OutcomeAttributionAsyncResponse postJourneyOutcomesAttributionsJobs(PostJourneyOutcomesAttributionsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomeAttributionAsyncResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomeAttributionAsyncResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Outcome Attributions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
	 * Preview Endpoint
   */
  public ApiResponse<OutcomeAttributionAsyncResponse> postJourneyOutcomesAttributionsJobs(ApiRequest<OutcomeAttributionListing> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomeAttributionAsyncResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomeAttributionAsyncResponse> response = (ApiResponse<OutcomeAttributionAsyncResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomeAttributionAsyncResponse> response = (ApiResponse<OutcomeAttributionAsyncResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an outcome predictor.
   * 
   * @param body  (optional)
   * @return OutcomePredictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictor postJourneyOutcomesPredictors(OutcomePredictorRequest body) throws IOException, ApiException {
    return  postJourneyOutcomesPredictors(createPostJourneyOutcomesPredictorsRequest(body));
  }

  /**
   * Create an outcome predictor.
   * 
   * @param body  (optional)
   * @return OutcomePredictor
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictor> postJourneyOutcomesPredictorsWithHttpInfo(OutcomePredictorRequest body) throws IOException {
    return postJourneyOutcomesPredictors(createPostJourneyOutcomesPredictorsRequest(body).withHttpInfo());
  }

  private PostJourneyOutcomesPredictorsRequest createPostJourneyOutcomesPredictorsRequest(OutcomePredictorRequest body) {
    return PostJourneyOutcomesPredictorsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create an outcome predictor.
   * 
   * @param request The request object
   * @return OutcomePredictor
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomePredictor postJourneyOutcomesPredictors(PostJourneyOutcomesPredictorsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<OutcomePredictor> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<OutcomePredictor>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an outcome predictor.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<OutcomePredictor> postJourneyOutcomesPredictors(ApiRequest<OutcomePredictorRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<OutcomePredictor>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)exception;
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
      ApiResponse<OutcomePredictor> response = (ApiResponse<OutcomePredictor>)(ApiResponse<?>)(new ApiException(exception));
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
