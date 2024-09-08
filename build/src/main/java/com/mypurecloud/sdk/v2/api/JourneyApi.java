package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ActionEventRequest;
import com.mypurecloud.sdk.v2.model.ActionMap;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateRequest;
import com.mypurecloud.sdk.v2.model.ActionMapEstimateResult;
import com.mypurecloud.sdk.v2.model.ActionMapListing;
import com.mypurecloud.sdk.v2.model.ActionTarget;
import com.mypurecloud.sdk.v2.model.ActionTargetListing;
import com.mypurecloud.sdk.v2.model.ActionTemplate;
import com.mypurecloud.sdk.v2.model.ActionTemplateListing;
import com.mypurecloud.sdk.v2.model.AppEventRequest;
import com.mypurecloud.sdk.v2.model.AppEventResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.DeploymentPing;
import com.mypurecloud.sdk.v2.model.EntityListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.EstimateJobAsyncResponse;
import com.mypurecloud.sdk.v2.model.EventListing;
import com.mypurecloud.sdk.v2.model.FlowPaths;
import com.mypurecloud.sdk.v2.model.FlowPathsQuery;
import com.mypurecloud.sdk.v2.model.JourneyAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.JourneyAsyncAggregationQuery;
import com.mypurecloud.sdk.v2.model.JourneyEventDefinition;
import com.mypurecloud.sdk.v2.model.JourneyEventDefinitionListing;
import com.mypurecloud.sdk.v2.model.JourneySegment;
import com.mypurecloud.sdk.v2.model.JourneySegmentRequest;
import com.mypurecloud.sdk.v2.model.JourneyView;
import com.mypurecloud.sdk.v2.model.JourneyViewJob;
import com.mypurecloud.sdk.v2.model.JourneyViewJobListing;
import com.mypurecloud.sdk.v2.model.JourneyViewListing;
import com.mypurecloud.sdk.v2.model.JourneyViewResult;
import com.mypurecloud.sdk.v2.model.Label;
import com.mypurecloud.sdk.v2.model.Outcome;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionAsyncResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionJobStateResponse;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionListing;
import com.mypurecloud.sdk.v2.model.OutcomeAttributionResponseListing;
import com.mypurecloud.sdk.v2.model.OutcomeListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictor;
import com.mypurecloud.sdk.v2.model.OutcomePredictorListing;
import com.mypurecloud.sdk.v2.model.OutcomePredictorRequest;
import com.mypurecloud.sdk.v2.model.OutcomeRequest;
import com.mypurecloud.sdk.v2.model.OutcomeScoresResult;
import com.mypurecloud.sdk.v2.model.PatchActionMap;
import com.mypurecloud.sdk.v2.model.PatchActionTarget;
import com.mypurecloud.sdk.v2.model.PatchActionTemplate;
import com.mypurecloud.sdk.v2.model.PatchOutcome;
import com.mypurecloud.sdk.v2.model.PatchSegment;
import com.mypurecloud.sdk.v2.model.SegmentListing;
import com.mypurecloud.sdk.v2.model.Session;
import com.mypurecloud.sdk.v2.model.SessionListing;
import com.mypurecloud.sdk.v2.model.WebEventRequest;
import com.mypurecloud.sdk.v2.model.WebEventResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomeRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyOutcomesPredictorRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneySegmentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteJourneyViewRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetAnalyticsJourneysAggregatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetExternalcontactsContactJourneySessionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActionmapsEstimatesJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontargetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyActiontemplatesRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyDeploymentCustomerPingRequest;
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
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewVersionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewVersionJobRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewVersionJobResultsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewVersionJobsLatestRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewsEventdefinitionRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewsEventdefinitionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetJourneyViewsJobsRequest;
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
import com.mypurecloud.sdk.v2.api.request.PostJourneyDeploymentActioneventRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyDeploymentAppeventsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyDeploymentWebeventsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyFlowsPathsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesAttributionsJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyOutcomesPredictorsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneySegmentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewVersionJobsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewsRequest;
import com.mypurecloud.sdk.v2.api.request.PostJourneyViewsEncodingsValidateRequest;

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
   * Delete a Journey View by ID
   * deletes all versions
   * @param viewId viewId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyView(String viewId) throws IOException, ApiException {
     deleteJourneyView(createDeleteJourneyViewRequest(viewId));
  }

  /**
   * Delete a Journey View by ID
   * deletes all versions
   * @param viewId viewId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyViewWithHttpInfo(String viewId) throws IOException {
    return deleteJourneyView(createDeleteJourneyViewRequest(viewId).withHttpInfo());
  }

  private DeleteJourneyViewRequest createDeleteJourneyViewRequest(String viewId) {
    return DeleteJourneyViewRequest.builder()
            .withViewId(viewId)

            .build();
  }

  /**
   * Delete a Journey View by ID
   * deletes all versions
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteJourneyView(DeleteJourneyViewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Journey View by ID
   * deletes all versions
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteJourneyView(ApiRequest<Void> request) throws IOException {
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
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryStatus getAnalyticsJourneysAggregatesJob(String jobId) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJob(createGetAnalyticsJourneysAggregatesJobRequest(jobId));
  }

  /**
   * Get status for async query for journey aggregates
   * 
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @return AsyncQueryStatus
   * @throws IOException if the request fails to be processed
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
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * getAnalyticsJourneysAggregatesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyAsyncAggregateQueryResponse getAnalyticsJourneysAggregatesJobResults(String jobId, String cursor) throws IOException, ApiException {
    return  getAnalyticsJourneysAggregatesJobResults(createGetAnalyticsJourneysAggregatesJobResultsRequest(jobId, cursor));
  }

  /**
   * Fetch a page of results for an async aggregates query
   * 
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId jobId (required)
   * @param cursor Cursor token to retrieve next page (optional)
   * @return JourneyAsyncAggregateQueryResponse
   * @throws IOException if the request fails to be processed
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
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return JourneyAsyncAggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * getAnalyticsJourneysAggregatesJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * Retrieve all sessions for a given external contact.
   * 
   * @param contactId ExternalContact ID (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param includeMerged Indicates whether to return sessions from all external contacts in the merge-set of the given one. (optional)
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionListing getExternalcontactsContactJourneySessions(String contactId, String pageSize, String after, Boolean includeMerged) throws IOException, ApiException {
    return  getExternalcontactsContactJourneySessions(createGetExternalcontactsContactJourneySessionsRequest(contactId, pageSize, after, includeMerged));
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param contactId ExternalContact ID (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param includeMerged Indicates whether to return sessions from all external contacts in the merge-set of the given one. (optional)
   * @return SessionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionListing> getExternalcontactsContactJourneySessionsWithHttpInfo(String contactId, String pageSize, String after, Boolean includeMerged) throws IOException {
    return getExternalcontactsContactJourneySessions(createGetExternalcontactsContactJourneySessionsRequest(contactId, pageSize, after, includeMerged).withHttpInfo());
  }

  private GetExternalcontactsContactJourneySessionsRequest createGetExternalcontactsContactJourneySessionsRequest(String contactId, String pageSize, String after, Boolean includeMerged) {
    return GetExternalcontactsContactJourneySessionsRequest.builder()
            .withContactId(contactId)

            .withPageSize(pageSize)

            .withAfter(after)

            .withIncludeMerged(includeMerged)

            .build();
  }

  /**
   * Retrieve all sessions for a given external contact.
   * 
   * @param request The request object
   * @return SessionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SessionListing getExternalcontactsContactJourneySessions(GetExternalcontactsContactJourneySessionsRequest request) throws IOException, ApiException {
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
   * Retrieve all sessions for a given external contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SessionListing> getExternalcontactsContactJourneySessions(ApiRequest<Void> request) throws IOException {
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
   * Send a ping.
   * 
   * @param deploymentId The ID of the deployment sending the ping. (required)
   * @param customerCookieId ID of the customer associated with the ping. (required)
   * @param dl Document Location: 1) Web Page URL if overridden or URL fragment identifier (window.location.hash). OR  2) Application screen name that the ping request was sent from in the app. e.g. 'home' or 'help. Pings without this parameter will not return actions. (optional)
   * @param dt Document Title.  A human readable name for the page or screen (optional)
   * @param appNamespace Namespace of the application (e.g. com.genesys.bancodinero). Used for domain filtering in application sessions (optional)
   * @param sessionId UUID of the customer session. Use the same Session Id for all pings, AppEvents and ActionEvents in the session (optional)
   * @param sinceLastBeaconMilliseconds How long (milliseconds) since the last app event or beacon was sent. The response may return a pollInternvalMilliseconds to reduce the frequency of pings. (optional)
   * @return DeploymentPing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DeploymentPing getJourneyDeploymentCustomerPing(String deploymentId, String customerCookieId, String dl, String dt, String appNamespace, String sessionId, Long sinceLastBeaconMilliseconds) throws IOException, ApiException {
    return  getJourneyDeploymentCustomerPing(createGetJourneyDeploymentCustomerPingRequest(deploymentId, customerCookieId, dl, dt, appNamespace, sessionId, sinceLastBeaconMilliseconds));
  }

  /**
   * Send a ping.
   * 
   * @param deploymentId The ID of the deployment sending the ping. (required)
   * @param customerCookieId ID of the customer associated with the ping. (required)
   * @param dl Document Location: 1) Web Page URL if overridden or URL fragment identifier (window.location.hash). OR  2) Application screen name that the ping request was sent from in the app. e.g. 'home' or 'help. Pings without this parameter will not return actions. (optional)
   * @param dt Document Title.  A human readable name for the page or screen (optional)
   * @param appNamespace Namespace of the application (e.g. com.genesys.bancodinero). Used for domain filtering in application sessions (optional)
   * @param sessionId UUID of the customer session. Use the same Session Id for all pings, AppEvents and ActionEvents in the session (optional)
   * @param sinceLastBeaconMilliseconds How long (milliseconds) since the last app event or beacon was sent. The response may return a pollInternvalMilliseconds to reduce the frequency of pings. (optional)
   * @return DeploymentPing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DeploymentPing> getJourneyDeploymentCustomerPingWithHttpInfo(String deploymentId, String customerCookieId, String dl, String dt, String appNamespace, String sessionId, Long sinceLastBeaconMilliseconds) throws IOException {
    return getJourneyDeploymentCustomerPing(createGetJourneyDeploymentCustomerPingRequest(deploymentId, customerCookieId, dl, dt, appNamespace, sessionId, sinceLastBeaconMilliseconds).withHttpInfo());
  }

  private GetJourneyDeploymentCustomerPingRequest createGetJourneyDeploymentCustomerPingRequest(String deploymentId, String customerCookieId, String dl, String dt, String appNamespace, String sessionId, Long sinceLastBeaconMilliseconds) {
    return GetJourneyDeploymentCustomerPingRequest.builder()
            .withDeploymentId(deploymentId)

            .withCustomerCookieId(customerCookieId)

            .withDl(dl)

            .withDt(dt)

            .withAppNamespace(appNamespace)

            .withSessionId(sessionId)

            .withSinceLastBeaconMilliseconds(sinceLastBeaconMilliseconds)

            .build();
  }

  /**
   * Send a ping.
   * 
   * @param request The request object
   * @return DeploymentPing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DeploymentPing getJourneyDeploymentCustomerPing(GetJourneyDeploymentCustomerPingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DeploymentPing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DeploymentPing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a ping.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DeploymentPing> getJourneyDeploymentCustomerPing(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DeploymentPing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DeploymentPing> response = (ApiResponse<DeploymentPing>)(ApiResponse<?>)exception;
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
      ApiResponse<DeploymentPing> response = (ApiResponse<DeploymentPing>)(ApiResponse<?>)(new ApiException(exception));
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
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeAttributionJobStateResponse getJourneyOutcomesAttributionsJob(String jobId) throws IOException, ApiException {
    return  getJourneyOutcomesAttributionsJob(createGetJourneyOutcomesAttributionsJobRequest(jobId));
  }

  /**
   * Get job status.
   * 
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionJobStateResponse
   * @throws IOException if the request fails to be processed
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
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return OutcomeAttributionJobStateResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * getJourneyOutcomesAttributionsJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeAttributionResponseListing getJourneyOutcomesAttributionsJobResults(String jobId) throws IOException, ApiException {
    return  getJourneyOutcomesAttributionsJobResults(createGetJourneyOutcomesAttributionsJobResultsRequest(jobId));
  }

  /**
   * Get outcome attribution entities from completed job.
   * 
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param jobId ID of the job. (required)
   * @return OutcomeAttributionResponseListing
   * @throws IOException if the request fails to be processed
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
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return OutcomeAttributionResponseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * getJourneyOutcomesAttributionsJobResults is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * @param eventType A comma separated list of journey event types to include in the results. (optional)
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EventListing getJourneySessionEvents(String sessionId, String pageSize, String after, String eventType) throws IOException, ApiException {
    return  getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, pageSize, after, eventType));
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param sessionId System-generated UUID that represents the session the event is a part of. (required)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param eventType A comma separated list of journey event types to include in the results. (optional)
   * @return EventListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EventListing> getJourneySessionEventsWithHttpInfo(String sessionId, String pageSize, String after, String eventType) throws IOException {
    return getJourneySessionEvents(createGetJourneySessionEventsRequest(sessionId, pageSize, after, eventType).withHttpInfo());
  }

  private GetJourneySessionEventsRequest createGetJourneySessionEventsRequest(String sessionId, String pageSize, String after, String eventType) {
    return GetJourneySessionEventsRequest.builder()
            .withSessionId(sessionId)

            .withPageSize(pageSize)

            .withAfter(after)

            .withEventType(eventType)

            .build();
  }

  /**
   * Retrieve all events for a given session.
   * 
   * @param request The request object
   * @return EventListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * Get a Journey View by ID
   * returns the latest version
   * @param viewId viewId (required)
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView getJourneyView(String viewId) throws IOException, ApiException {
    return  getJourneyView(createGetJourneyViewRequest(viewId));
  }

  /**
   * Get a Journey View by ID
   * returns the latest version
   * @param viewId viewId (required)
   * @return JourneyView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> getJourneyViewWithHttpInfo(String viewId) throws IOException {
    return getJourneyView(createGetJourneyViewRequest(viewId).withHttpInfo());
  }

  private GetJourneyViewRequest createGetJourneyViewRequest(String viewId) {
    return GetJourneyViewRequest.builder()
            .withViewId(viewId)

            .build();
  }

  /**
   * Get a Journey View by ID
   * returns the latest version
   * @param request The request object
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView getJourneyView(GetJourneyViewRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Journey View by ID
   * returns the latest version
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> getJourneyView(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Journey View by ID and version
   * 
   * @param viewId viewId (required)
   * @param versionId versionId (required)
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView getJourneyViewVersion(String viewId, String versionId) throws IOException, ApiException {
    return  getJourneyViewVersion(createGetJourneyViewVersionRequest(viewId, versionId));
  }

  /**
   * Get a Journey View by ID and version
   * 
   * @param viewId viewId (required)
   * @param versionId versionId (required)
   * @return JourneyView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> getJourneyViewVersionWithHttpInfo(String viewId, String versionId) throws IOException {
    return getJourneyViewVersion(createGetJourneyViewVersionRequest(viewId, versionId).withHttpInfo());
  }

  private GetJourneyViewVersionRequest createGetJourneyViewVersionRequest(String viewId, String versionId) {
    return GetJourneyViewVersionRequest.builder()
            .withViewId(viewId)

            .withVersionId(versionId)

            .build();
  }

  /**
   * Get a Journey View by ID and version
   * 
   * @param request The request object
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView getJourneyViewVersion(GetJourneyViewVersionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Journey View by ID and version
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> getJourneyViewVersion(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the job for a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @param jobId JobId (required)
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob getJourneyViewVersionJob(String viewId, String journeyVersionId, String jobId) throws IOException, ApiException {
    return  getJourneyViewVersionJob(createGetJourneyViewVersionJobRequest(viewId, journeyVersionId, jobId));
  }

  /**
   * Get the job for a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @param jobId JobId (required)
   * @return JourneyViewJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> getJourneyViewVersionJobWithHttpInfo(String viewId, String journeyVersionId, String jobId) throws IOException {
    return getJourneyViewVersionJob(createGetJourneyViewVersionJobRequest(viewId, journeyVersionId, jobId).withHttpInfo());
  }

  private GetJourneyViewVersionJobRequest createGetJourneyViewVersionJobRequest(String viewId, String journeyVersionId, String jobId) {
    return GetJourneyViewVersionJobRequest.builder()
            .withViewId(viewId)

            .withJourneyVersionId(journeyVersionId)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get the job for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob getJourneyViewVersionJob(GetJourneyViewVersionJobRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the job for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> getJourneyViewVersionJob(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the result of a job for a journey view version.
   * used for long descriptions
   * @param viewId JourneyViewResult id (required)
   * @param journeyViewVersion Journey View Version (required)
   * @param jobId Id of the executing job (required)
   * @return JourneyViewResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewResult getJourneyViewVersionJobResults(String viewId, String journeyViewVersion, String jobId) throws IOException, ApiException {
    return  getJourneyViewVersionJobResults(createGetJourneyViewVersionJobResultsRequest(viewId, journeyViewVersion, jobId));
  }

  /**
   * Get the result of a job for a journey view version.
   * used for long descriptions
   * @param viewId JourneyViewResult id (required)
   * @param journeyViewVersion Journey View Version (required)
   * @param jobId Id of the executing job (required)
   * @return JourneyViewResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewResult> getJourneyViewVersionJobResultsWithHttpInfo(String viewId, String journeyViewVersion, String jobId) throws IOException {
    return getJourneyViewVersionJobResults(createGetJourneyViewVersionJobResultsRequest(viewId, journeyViewVersion, jobId).withHttpInfo());
  }

  private GetJourneyViewVersionJobResultsRequest createGetJourneyViewVersionJobResultsRequest(String viewId, String journeyViewVersion, String jobId) {
    return GetJourneyViewVersionJobResultsRequest.builder()
            .withViewId(viewId)

            .withJourneyViewVersion(journeyViewVersion)

            .withJobId(jobId)

            .build();
  }

  /**
   * Get the result of a job for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return JourneyViewResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewResult getJourneyViewVersionJobResults(GetJourneyViewVersionJobResultsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the result of a job for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewResult> getJourneyViewVersionJobResults(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewResult> response = (ApiResponse<JourneyViewResult>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewResult> response = (ApiResponse<JourneyViewResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the latest job of a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob getJourneyViewVersionJobsLatest(String viewId, String journeyVersionId) throws IOException, ApiException {
    return  getJourneyViewVersionJobsLatest(createGetJourneyViewVersionJobsLatestRequest(viewId, journeyVersionId));
  }

  /**
   * Get the latest job of a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @return JourneyViewJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> getJourneyViewVersionJobsLatestWithHttpInfo(String viewId, String journeyVersionId) throws IOException {
    return getJourneyViewVersionJobsLatest(createGetJourneyViewVersionJobsLatestRequest(viewId, journeyVersionId).withHttpInfo());
  }

  private GetJourneyViewVersionJobsLatestRequest createGetJourneyViewVersionJobsLatestRequest(String viewId, String journeyVersionId) {
    return GetJourneyViewVersionJobsLatestRequest.builder()
            .withViewId(viewId)

            .withJourneyVersionId(journeyVersionId)

            .build();
  }

  /**
   * Get the latest job of a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob getJourneyViewVersionJobsLatest(GetJourneyViewVersionJobsLatestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the latest job of a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> getJourneyViewVersionJobsLatest(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Journey Views
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param nameOrCreatedBy Journey View Name or Created By (optional)
   * @param expand Parameter to request additional data to return in Journey payload (optional)
   * @param id Parameter to request a list of Journey Views by id, separated by commas. Limit of 100 items. (optional)
   * @return JourneyViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewListing getJourneyViews(Integer pageNumber, Integer pageSize, String nameOrCreatedBy, String expand, String id) throws IOException, ApiException {
    return  getJourneyViews(createGetJourneyViewsRequest(pageNumber, pageSize, nameOrCreatedBy, expand, id));
  }

  /**
   * Get a list of Journey Views
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @param nameOrCreatedBy Journey View Name or Created By (optional)
   * @param expand Parameter to request additional data to return in Journey payload (optional)
   * @param id Parameter to request a list of Journey Views by id, separated by commas. Limit of 100 items. (optional)
   * @return JourneyViewListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewListing> getJourneyViewsWithHttpInfo(Integer pageNumber, Integer pageSize, String nameOrCreatedBy, String expand, String id) throws IOException {
    return getJourneyViews(createGetJourneyViewsRequest(pageNumber, pageSize, nameOrCreatedBy, expand, id).withHttpInfo());
  }

  private GetJourneyViewsRequest createGetJourneyViewsRequest(Integer pageNumber, Integer pageSize, String nameOrCreatedBy, String expand, String id) {
    return GetJourneyViewsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withNameOrCreatedBy(nameOrCreatedBy)

            .withExpand(expand)

            .withId(id)

            .build();
  }

  /**
   * Get a list of Journey Views
   * 
   * @param request The request object
   * @return JourneyViewListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewListing getJourneyViews(GetJourneyViewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Journey Views
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewListing> getJourneyViews(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewListing> response = (ApiResponse<JourneyViewListing>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewListing> response = (ApiResponse<JourneyViewListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an Event Definition
   * 
   * getJourneyViewsEventdefinition is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param eventDefinitionId Event Definition ID (required)
   * @return JourneyEventDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyEventDefinition getJourneyViewsEventdefinition(String eventDefinitionId) throws IOException, ApiException {
    return  getJourneyViewsEventdefinition(createGetJourneyViewsEventdefinitionRequest(eventDefinitionId));
  }

  /**
   * Get an Event Definition
   * 
   * getJourneyViewsEventdefinition is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param eventDefinitionId Event Definition ID (required)
   * @return JourneyEventDefinition
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyEventDefinition> getJourneyViewsEventdefinitionWithHttpInfo(String eventDefinitionId) throws IOException {
    return getJourneyViewsEventdefinition(createGetJourneyViewsEventdefinitionRequest(eventDefinitionId).withHttpInfo());
  }

  private GetJourneyViewsEventdefinitionRequest createGetJourneyViewsEventdefinitionRequest(String eventDefinitionId) {
    return GetJourneyViewsEventdefinitionRequest.builder()
            .withEventDefinitionId(eventDefinitionId)

            .build();
  }

  /**
   * Get an Event Definition
   * 
   * getJourneyViewsEventdefinition is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return JourneyEventDefinition
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyEventDefinition getJourneyViewsEventdefinition(GetJourneyViewsEventdefinitionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyEventDefinition> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyEventDefinition>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an Event Definition
   * 
   * getJourneyViewsEventdefinition is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyEventDefinition> getJourneyViewsEventdefinition(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyEventDefinition>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyEventDefinition> response = (ApiResponse<JourneyEventDefinition>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyEventDefinition> response = (ApiResponse<JourneyEventDefinition>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a list of Event Definitions
   * 
   * getJourneyViewsEventdefinitions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return JourneyEventDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyEventDefinitionListing getJourneyViewsEventdefinitions() throws IOException, ApiException {
    return  getJourneyViewsEventdefinitions(createGetJourneyViewsEventdefinitionsRequest());
  }

  /**
   * Get a list of Event Definitions
   * 
   * getJourneyViewsEventdefinitions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @return JourneyEventDefinitionListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyEventDefinitionListing> getJourneyViewsEventdefinitionsWithHttpInfo() throws IOException {
    return getJourneyViewsEventdefinitions(createGetJourneyViewsEventdefinitionsRequest().withHttpInfo());
  }

  private GetJourneyViewsEventdefinitionsRequest createGetJourneyViewsEventdefinitionsRequest() {
    return GetJourneyViewsEventdefinitionsRequest.builder()
            .build();
  }

  /**
   * Get a list of Event Definitions
   * 
   * getJourneyViewsEventdefinitions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return JourneyEventDefinitionListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyEventDefinitionListing getJourneyViewsEventdefinitions(GetJourneyViewsEventdefinitionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyEventDefinitionListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyEventDefinitionListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a list of Event Definitions
   * 
   * getJourneyViewsEventdefinitions is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyEventDefinitionListing> getJourneyViewsEventdefinitions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyEventDefinitionListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyEventDefinitionListing> response = (ApiResponse<JourneyEventDefinitionListing>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyEventDefinitionListing> response = (ApiResponse<JourneyEventDefinitionListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the jobs for an organization.
   * 
   * @param pageNumber The number of the page to return (optional, default to 1)
   * @param pageSize Max number of entities to return (optional, default to 25)
   * @param interval An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval. (optional, default to null)
   * @param statuses Job statuses to filter for (optional, default to null)
   * @return JourneyViewJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJobListing getJourneyViewsJobs(Integer pageNumber, Integer pageSize, String interval, String statuses) throws IOException, ApiException {
    return  getJourneyViewsJobs(createGetJourneyViewsJobsRequest(pageNumber, pageSize, interval, statuses));
  }

  /**
   * Get the jobs for an organization.
   * 
   * @param pageNumber The number of the page to return (optional, default to 1)
   * @param pageSize Max number of entities to return (optional, default to 25)
   * @param interval An absolute timeframe for filtering the jobs, expressed as an ISO 8601 interval. (optional, default to null)
   * @param statuses Job statuses to filter for (optional, default to null)
   * @return JourneyViewJobListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJobListing> getJourneyViewsJobsWithHttpInfo(Integer pageNumber, Integer pageSize, String interval, String statuses) throws IOException {
    return getJourneyViewsJobs(createGetJourneyViewsJobsRequest(pageNumber, pageSize, interval, statuses).withHttpInfo());
  }

  private GetJourneyViewsJobsRequest createGetJourneyViewsJobsRequest(Integer pageNumber, Integer pageSize, String interval, String statuses) {
    return GetJourneyViewsJobsRequest.builder()
            .withPageNumber(pageNumber)

            .withPageSize(pageSize)

            .withInterval(interval)

            .withStatuses(statuses)

            .build();
  }

  /**
   * Get the jobs for an organization.
   * 
   * @param request The request object
   * @return JourneyViewJobListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJobListing getJourneyViewsJobs(GetJourneyViewsJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewJobListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewJobListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the jobs for an organization.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJobListing> getJourneyViewsJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewJobListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewJobListing> response = (ApiResponse<JourneyViewJobListing>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewJobListing> response = (ApiResponse<JourneyViewJobListing>)(ApiResponse<?>)(new ApiException(exception));
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
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AsyncQueryResponse postAnalyticsJourneysAggregatesJobs(JourneyAsyncAggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsJourneysAggregatesJobs(createPostAnalyticsJourneysAggregatesJobsRequest(body));
  }

  /**
   * Query for journey aggregates asynchronously
   * 
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body query (required)
   * @return AsyncQueryResponse
   * @throws IOException if the request fails to be processed
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
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return AsyncQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * postAnalyticsJourneysAggregatesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param deploymentId The ID of the deployment sending the beacon. (required)
   * @param body  (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postJourneyDeploymentActionevent(String deploymentId, ActionEventRequest body) throws IOException, ApiException {
     postJourneyDeploymentActionevent(createPostJourneyDeploymentActioneventRequest(deploymentId, body));
  }

  /**
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param deploymentId The ID of the deployment sending the beacon. (required)
   * @param body  (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postJourneyDeploymentActioneventWithHttpInfo(String deploymentId, ActionEventRequest body) throws IOException {
    return postJourneyDeploymentActionevent(createPostJourneyDeploymentActioneventRequest(deploymentId, body).withHttpInfo());
  }

  private PostJourneyDeploymentActioneventRequest createPostJourneyDeploymentActioneventRequest(String deploymentId, ActionEventRequest body) {
    return PostJourneyDeploymentActioneventRequest.builder()
            .withDeploymentId(deploymentId)

            .withBody(body)

            .build();
  }

  /**
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postJourneyDeploymentActionevent(PostJourneyDeploymentActioneventRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Sends an action event, which is used for changing the state of actions that have been offered to the user.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postJourneyDeploymentActionevent(ApiRequest<ActionEventRequest> request) throws IOException {
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
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param deploymentId The ID of the deployment sending the app event. (required)
   * @param body  (optional)
   * @return AppEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AppEventResponse postJourneyDeploymentAppevents(String deploymentId, AppEventRequest body) throws IOException, ApiException {
    return  postJourneyDeploymentAppevents(createPostJourneyDeploymentAppeventsRequest(deploymentId, body));
  }

  /**
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param deploymentId The ID of the deployment sending the app event. (required)
   * @param body  (optional)
   * @return AppEventResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AppEventResponse> postJourneyDeploymentAppeventsWithHttpInfo(String deploymentId, AppEventRequest body) throws IOException {
    return postJourneyDeploymentAppevents(createPostJourneyDeploymentAppeventsRequest(deploymentId, body).withHttpInfo());
  }

  private PostJourneyDeploymentAppeventsRequest createPostJourneyDeploymentAppeventsRequest(String deploymentId, AppEventRequest body) {
    return PostJourneyDeploymentAppeventsRequest.builder()
            .withDeploymentId(deploymentId)

            .withBody(body)

            .build();
  }

  /**
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param request The request object
   * @return AppEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AppEventResponse postJourneyDeploymentAppevents(PostJourneyDeploymentAppeventsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AppEventResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AppEventResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a journey app event, used for tracking customer activity on an application.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AppEventResponse> postJourneyDeploymentAppevents(ApiRequest<AppEventRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AppEventResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AppEventResponse> response = (ApiResponse<AppEventResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<AppEventResponse> response = (ApiResponse<AppEventResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send a journey web event, used for tracking customer activity on a website.
   * 
   * @param deploymentId The ID of the deployment sending the web event. (required)
   * @param body  (optional)
   * @return WebEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebEventResponse postJourneyDeploymentWebevents(String deploymentId, WebEventRequest body) throws IOException, ApiException {
    return  postJourneyDeploymentWebevents(createPostJourneyDeploymentWebeventsRequest(deploymentId, body));
  }

  /**
   * Send a journey web event, used for tracking customer activity on a website.
   * 
   * @param deploymentId The ID of the deployment sending the web event. (required)
   * @param body  (optional)
   * @return WebEventResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebEventResponse> postJourneyDeploymentWebeventsWithHttpInfo(String deploymentId, WebEventRequest body) throws IOException {
    return postJourneyDeploymentWebevents(createPostJourneyDeploymentWebeventsRequest(deploymentId, body).withHttpInfo());
  }

  private PostJourneyDeploymentWebeventsRequest createPostJourneyDeploymentWebeventsRequest(String deploymentId, WebEventRequest body) {
    return PostJourneyDeploymentWebeventsRequest.builder()
            .withDeploymentId(deploymentId)

            .withBody(body)

            .build();
  }

  /**
   * Send a journey web event, used for tracking customer activity on a website.
   * 
   * @param request The request object
   * @return WebEventResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WebEventResponse postJourneyDeploymentWebevents(PostJourneyDeploymentWebeventsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WebEventResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WebEventResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send a journey web event, used for tracking customer activity on a website.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WebEventResponse> postJourneyDeploymentWebevents(ApiRequest<WebEventRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WebEventResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WebEventResponse> response = (ApiResponse<WebEventResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<WebEventResponse> response = (ApiResponse<WebEventResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for flow paths.
   * 
   * @param body  (optional)
   * @return FlowPaths
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowPaths postJourneyFlowsPathsQuery(FlowPathsQuery body) throws IOException, ApiException {
    return  postJourneyFlowsPathsQuery(createPostJourneyFlowsPathsQueryRequest(body));
  }

  /**
   * Query for flow paths.
   * 
   * @param body  (optional)
   * @return FlowPaths
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowPaths> postJourneyFlowsPathsQueryWithHttpInfo(FlowPathsQuery body) throws IOException {
    return postJourneyFlowsPathsQuery(createPostJourneyFlowsPathsQueryRequest(body).withHttpInfo());
  }

  private PostJourneyFlowsPathsQueryRequest createPostJourneyFlowsPathsQueryRequest(FlowPathsQuery body) {
    return PostJourneyFlowsPathsQueryRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Query for flow paths.
   * 
   * @param request The request object
   * @return FlowPaths
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public FlowPaths postJourneyFlowsPathsQuery(PostJourneyFlowsPathsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<FlowPaths> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<FlowPaths>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for flow paths.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<FlowPaths> postJourneyFlowsPathsQuery(ApiRequest<FlowPathsQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<FlowPaths>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<FlowPaths> response = (ApiResponse<FlowPaths>)(ApiResponse<?>)exception;
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
      ApiResponse<FlowPaths> response = (ApiResponse<FlowPaths>)(ApiResponse<?>)(new ApiException(exception));
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
  public Outcome postJourneyOutcomes(OutcomeRequest body) throws IOException, ApiException {
    return  postJourneyOutcomes(createPostJourneyOutcomesRequest(body));
  }

  /**
   * Create an outcome.
   * 
   * @param body  (optional)
   * @return Outcome
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Outcome> postJourneyOutcomesWithHttpInfo(OutcomeRequest body) throws IOException {
    return postJourneyOutcomes(createPostJourneyOutcomesRequest(body).withHttpInfo());
  }

  private PostJourneyOutcomesRequest createPostJourneyOutcomesRequest(OutcomeRequest body) {
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
  public ApiResponse<Outcome> postJourneyOutcomes(ApiRequest<OutcomeRequest> request) throws IOException {
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
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body outcome attribution request (optional)
   * @return OutcomeAttributionAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public OutcomeAttributionAsyncResponse postJourneyOutcomesAttributionsJobs(OutcomeAttributionListing body) throws IOException, ApiException {
    return  postJourneyOutcomesAttributionsJobs(createPostJourneyOutcomesAttributionsJobsRequest(body));
  }

  /**
   * Create Outcome Attributions
   * 
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body outcome attribution request (optional)
   * @return OutcomeAttributionAsyncResponse
   * @throws IOException if the request fails to be processed
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
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return OutcomeAttributionAsyncResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
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
   * postJourneyOutcomesAttributionsJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
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
  public JourneySegment postJourneySegments(JourneySegmentRequest body) throws IOException, ApiException {
    return  postJourneySegments(createPostJourneySegmentsRequest(body));
  }

  /**
   * Create a segment.
   * 
   * @param body  (optional)
   * @return JourneySegment
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneySegment> postJourneySegmentsWithHttpInfo(JourneySegmentRequest body) throws IOException {
    return postJourneySegments(createPostJourneySegmentsRequest(body).withHttpInfo());
  }

  private PostJourneySegmentsRequest createPostJourneySegmentsRequest(JourneySegmentRequest body) {
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
  public ApiResponse<JourneySegment> postJourneySegments(ApiRequest<JourneySegmentRequest> request) throws IOException {
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
   * Submit a job request for a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob postJourneyViewVersionJobs(String viewId, String journeyVersionId) throws IOException, ApiException {
    return  postJourneyViewVersionJobs(createPostJourneyViewVersionJobsRequest(viewId, journeyVersionId));
  }

  /**
   * Submit a job request for a journey view version.
   * used for long descriptions
   * @param viewId Journey View Id (required)
   * @param journeyVersionId Journey View Version (required)
   * @return JourneyViewJob
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> postJourneyViewVersionJobsWithHttpInfo(String viewId, String journeyVersionId) throws IOException {
    return postJourneyViewVersionJobs(createPostJourneyViewVersionJobsRequest(viewId, journeyVersionId).withHttpInfo());
  }

  private PostJourneyViewVersionJobsRequest createPostJourneyViewVersionJobsRequest(String viewId, String journeyVersionId) {
    return PostJourneyViewVersionJobsRequest.builder()
            .withViewId(viewId)

            .withJourneyVersionId(journeyVersionId)

            .build();
  }

  /**
   * Submit a job request for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return JourneyViewJob
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyViewJob postJourneyViewVersionJobs(PostJourneyViewVersionJobsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyViewJob> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyViewJob>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Submit a job request for a journey view version.
   * used for long descriptions
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyViewJob> postJourneyViewVersionJobs(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyViewJob>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyViewJob> response = (ApiResponse<JourneyViewJob>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * @param viewId viewId (required)
   * @param body JourneyView (required)
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView postJourneyViewVersions(String viewId, JourneyView body) throws IOException, ApiException {
    return  postJourneyViewVersions(createPostJourneyViewVersionsRequest(viewId, body));
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * @param viewId viewId (required)
   * @param body JourneyView (required)
   * @return JourneyView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> postJourneyViewVersionsWithHttpInfo(String viewId, JourneyView body) throws IOException {
    return postJourneyViewVersions(createPostJourneyViewVersionsRequest(viewId, body).withHttpInfo());
  }

  private PostJourneyViewVersionsRequest createPostJourneyViewVersionsRequest(String viewId, JourneyView body) {
    return PostJourneyViewVersionsRequest.builder()
            .withViewId(viewId)

            .withBody(body)

            .build();
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * @param request The request object
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView postJourneyViewVersions(PostJourneyViewVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a Journey View by ID
   * creates a new version
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> postJourneyViewVersions(ApiRequest<JourneyView> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new Journey View
   * 
   * @param body JourneyView (required)
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView postJourneyViews(JourneyView body) throws IOException, ApiException {
    return  postJourneyViews(createPostJourneyViewsRequest(body));
  }

  /**
   * Create a new Journey View
   * 
   * @param body JourneyView (required)
   * @return JourneyView
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> postJourneyViewsWithHttpInfo(JourneyView body) throws IOException {
    return postJourneyViews(createPostJourneyViewsRequest(body).withHttpInfo());
  }

  private PostJourneyViewsRequest createPostJourneyViewsRequest(JourneyView body) {
    return PostJourneyViewsRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Create a new Journey View
   * 
   * @param request The request object
   * @return JourneyView
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JourneyView postJourneyViews(PostJourneyViewsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JourneyView> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JourneyView>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Journey View
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JourneyView> postJourneyViews(ApiRequest<JourneyView> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JourneyView>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)exception;
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
      ApiResponse<JourneyView> response = (ApiResponse<JourneyView>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Validate whether an encoding exist for a label/value combination.
   * True indicates a valid encoding
   * postJourneyViewsEncodingsValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body  (optional)
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing postJourneyViewsEncodingsValidate(List<Label> body) throws IOException, ApiException {
    return  postJourneyViewsEncodingsValidate(createPostJourneyViewsEncodingsValidateRequest(body));
  }

  /**
   * Validate whether an encoding exist for a label/value combination.
   * True indicates a valid encoding
   * postJourneyViewsEncodingsValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param body  (optional)
   * @return EntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> postJourneyViewsEncodingsValidateWithHttpInfo(List<Label> body) throws IOException {
    return postJourneyViewsEncodingsValidate(createPostJourneyViewsEncodingsValidateRequest(body).withHttpInfo());
  }

  private PostJourneyViewsEncodingsValidateRequest createPostJourneyViewsEncodingsValidateRequest(List<Label> body) {
    return PostJourneyViewsEncodingsValidateRequest.builder()
            .withBody(body)

            .build();
  }

  /**
   * Validate whether an encoding exist for a label/value combination.
   * True indicates a valid encoding
   * postJourneyViewsEncodingsValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return EntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EntityListing postJourneyViewsEncodingsValidate(PostJourneyViewsEncodingsValidateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate whether an encoding exist for a label/value combination.
   * True indicates a valid encoding
   * postJourneyViewsEncodingsValidate is a preview method and is subject to both breaking and non-breaking changes at any time without notice
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EntityListing> postJourneyViewsEncodingsValidate(ApiRequest<List<Label>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<EntityListing> response = (ApiResponse<EntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
